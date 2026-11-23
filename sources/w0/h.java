package w0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class h extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i7, CharSequence charSequence) {
        super(charSequence, "androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION");
        switch (i7) {
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

    public h(CharSequence charSequence, String str) {
        super(charSequence, str);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
