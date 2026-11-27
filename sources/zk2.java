// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class zk2 {
    public final al2 a;
    public final int b;
    public final int c;

    public zk2(al2 al2Var, int i, int i2) {
        this.a = al2Var;
        this.b = i;
        this.c = i2;
    }

    public final float a(float f) {
        return (f / this.a.d[this.c]) * this.b;
    }

    public final float b(float f) {
        return (f / this.a.d[this.c]) * (this.b + 1);
    }
}
