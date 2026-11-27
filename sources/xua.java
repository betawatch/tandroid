// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xua {
    public final float a;
    public final pkb b;
    public final pkb c;

    public xua(float f, String str, CharSequence charSequence) {
        this.b = new pkb(str, 12.0f, null);
        this.c = new pkb(charSequence, 12.0f, hl.o());
        this.a = (a() / 2.0f) + f;
    }

    public final float a() {
        return Math.max(this.b.h(), this.c.h());
    }
}
