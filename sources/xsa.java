// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xsa {
    public final float a;
    public final uib b;
    public final uib c;

    public xsa(float f, String str, CharSequence charSequence) {
        this.b = new uib(str, 12.0f, null);
        this.c = new uib(charSequence, 12.0f, gm.o());
        this.a = (a() / 2.0f) + f;
    }

    public final float a() {
        return Math.max(this.b.h(), this.c.h());
    }
}
