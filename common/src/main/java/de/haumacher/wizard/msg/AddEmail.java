package de.haumacher.wizard.msg;

/**
 * Command to assign an email to an existing account. An e-mail is send to the provided address with a verification token that must be provided to {@link VerifyEmail} in a following request.
 */
public class AddEmail extends LoginCmd {

	/**
	 * Creates a {@link AddEmail} instance.
	 */
	public static AddEmail create() {
		return new de.haumacher.wizard.msg.AddEmail();
	}

	/** Identifier for the {@link AddEmail} type in JSON format. */
	public static final String ADD_EMAIL__TYPE = "AddEmail";

	/** @see #getUid() */
	private static final String UID__PROP = "uid";

	/** @see #getSecret() */
	private static final String SECRET__PROP = "secret";

	/** @see #getEmail() */
	private static final String EMAIL__PROP = "email";

	private String _uid = "";

	private String _secret = "";

	private String _email = "";

	/**
	 * Creates a {@link AddEmail} instance.
	 *
	 * @see AddEmail#create()
	 */
	protected AddEmail() {
		super();
	}

	/**
	 * The user ID, see {@link CreateAccountResult#getUid()}.
	 */
	public final String getUid() {
		return _uid;
	}

	/**
	 * @see #getUid()
	 */
	public AddEmail setUid(String value) {
		internalSetUid(value);
		return this;
	}

	/** Internal setter for {@link #getUid()} without chain call utility. */
	protected final void internalSetUid(String value) {
		_uid = value;
	}

	/**
	 * The user's login credentials, see {@link CreateAccountResult#getSecret()}.
	 */
	public final String getSecret() {
		return _secret;
	}

	/**
	 * @see #getSecret()
	 */
	public AddEmail setSecret(String value) {
		internalSetSecret(value);
		return this;
	}

	/** Internal setter for {@link #getSecret()} without chain call utility. */
	protected final void internalSetSecret(String value) {
		_secret = value;
	}

	/**
	 * The e-mail address to assign to the user's account.
	 */
	public final String getEmail() {
		return _email;
	}

	/**
	 * @see #getEmail()
	 */
	public AddEmail setEmail(String value) {
		internalSetEmail(value);
		return this;
	}

	/** Internal setter for {@link #getEmail()} without chain call utility. */
	protected final void internalSetEmail(String value) {
		_email = value;
	}

	@Override
	public String jsonType() {
		return ADD_EMAIL__TYPE;
	}

	/** Reads a new instance from the given reader. */
	public static AddEmail readAddEmail(de.haumacher.msgbuf.json.JsonReader in) throws java.io.IOException {
		de.haumacher.wizard.msg.AddEmail result = new de.haumacher.wizard.msg.AddEmail();
		result.readContent(in);
		return result;
	}

	@Override
	protected void writeFields(de.haumacher.msgbuf.json.JsonWriter out) throws java.io.IOException {
		super.writeFields(out);
		out.name(UID__PROP);
		out.value(getUid());
		out.name(SECRET__PROP);
		out.value(getSecret());
		out.name(EMAIL__PROP);
		out.value(getEmail());
	}

	@Override
	protected void readField(de.haumacher.msgbuf.json.JsonReader in, String field) throws java.io.IOException {
		switch (field) {
			case UID__PROP: setUid(de.haumacher.msgbuf.json.JsonUtil.nextStringOptional(in)); break;
			case SECRET__PROP: setSecret(de.haumacher.msgbuf.json.JsonUtil.nextStringOptional(in)); break;
			case EMAIL__PROP: setEmail(de.haumacher.msgbuf.json.JsonUtil.nextStringOptional(in)); break;
			default: super.readField(in, field);
		}
	}

	@Override
	public <R,A,E extends Throwable> R visit(LoginCmd.Visitor<R,A,E> v, A arg) throws E {
		return v.visit(this, arg);
	}

}
