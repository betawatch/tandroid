// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wqa {
    public final float a;
    public final tgb b;
    public final tgb c;

    public wqa(float f, String str, CharSequence charSequence) {
        this.b = new tgb(str, 12.0f, null);
        this.c = new tgb(charSequence, 12.0f, gl.o());
        this.a = (a() / 2.0f) + f;
    }

    public final float a() {
        return Math.max(this.b.h(), this.c.h());
    }
}
