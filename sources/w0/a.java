package w0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class a extends Exception {
    public a(String str) {
        this(str, "android.credentials.ClearCredentialStateException.TYPE_UNKNOWN");
    }

    public a(CharSequence charSequence, String str) {
        super(charSequence != null ? charSequence.toString() : null);
    }
}
