package w3;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d0 {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public d0(int i9, int i10) {
        this(TLObject.FLAG_31, i9, i10);
    }

    public final void a() {
        int i9 = this.d;
        this.d = i9 == Integer.MIN_VALUE ? this.b : i9 + this.c;
        this.e = this.a + this.d;
    }

    public final void b() {
        if (this.d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public d0(int i9, int i10, int i11) {
        this.a = i9 != Integer.MIN_VALUE ? ta.b.c(i9, "/") : "";
        this.b = i10;
        this.c = i11;
        this.d = TLObject.FLAG_31;
        this.e = "";
    }
}
