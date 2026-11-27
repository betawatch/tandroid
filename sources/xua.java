// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
