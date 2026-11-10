package rc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
