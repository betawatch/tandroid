package uc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final int b;
    public transient String c;

    public a(String str, int i10) {
        this.a = str;
        this.b = i10;
    }

    public final String toString() {
        if (this.c == null) {
            this.c = String.format("%s:%d", this.a, Integer.valueOf(this.b));
        }
        return this.c;
    }
}
