package w0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class a extends Exception {
    public a(String str) {
        this(str, "android.credentials.ClearCredentialStateException.TYPE_UNKNOWN");
    }

    public a(CharSequence charSequence, String str) {
        super(charSequence != null ? charSequence.toString() : null);
    }
}
