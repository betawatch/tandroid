// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xu4 extends yu4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu4(CharSequence charSequence, byte b) {
        super(charSequence, "androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION");
        switch (b) {
            case 2:
                super(charSequence, "android.credentials.GetCredentialException.TYPE_UNKNOWN");
                break;
            case 3:
                super(charSequence, "androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION");
                break;
            default:
                break;
        }
    }

    public xu4(CharSequence charSequence, String str) {
        super(charSequence, str);
        if (str.length() > 0) {
            return;
        }
        lq5.j("type must not be empty");
        throw null;
    }
}
