// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ts4 extends us4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts4(CharSequence charSequence, byte b) {
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

    public ts4(CharSequence charSequence, String str) {
        super(charSequence, str);
        if (str.length() > 0) {
            return;
        }
        w26.j("type must not be empty");
        throw null;
    }
}
