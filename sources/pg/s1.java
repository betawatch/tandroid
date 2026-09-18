package pg;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class s1 {
    public int a;
    public float b;
    public float c;

    public s1(float f7, float f10, int i10) {
        this.a = i10;
        this.b = f7;
        this.c = f10;
    }

    public final Object clone() {
        return new s1(this.b, this.c, this.a);
    }
}
