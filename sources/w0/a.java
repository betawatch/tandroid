package w0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class a extends Exception {
    public a(String str) {
        this(str, "android.credentials.ClearCredentialStateException.TYPE_UNKNOWN");
    }

    public a(CharSequence charSequence, String str) {
        super(charSequence != null ? charSequence.toString() : null);
    }
}
