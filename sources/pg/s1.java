package pg;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
