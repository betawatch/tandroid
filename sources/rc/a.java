package rc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final int b;
    public transient String c;

    public a(String str, int i7) {
        this.a = str;
        this.b = i7;
    }

    public final String toString() {
        if (this.c == null) {
            this.c = String.format("%s:%d", this.a, Integer.valueOf(this.b));
        }
        return this.c;
    }
}
