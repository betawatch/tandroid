package w0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class a extends Exception {
    public a(String str) {
        this(str, "android.credentials.ClearCredentialStateException.TYPE_UNKNOWN");
    }

    public a(CharSequence charSequence, String str) {
        super(charSequence != null ? charSequence.toString() : null);
    }
}
