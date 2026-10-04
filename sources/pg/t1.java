package pg;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class t1 {
    public int a;
    public float b;
    public float c;

    public t1(float f7, float f10, int i10) {
        this.a = i10;
        this.b = f7;
        this.c = f10;
    }

    public final Object clone() {
        return new t1(this.b, this.c, this.a);
    }
}
