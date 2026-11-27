// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class ybb implements r11 {
    public final float[] a = new float[2];
    public final /* synthetic */ zbb b;

    public ybb(zbb zbbVar) {
        this.b = zbbVar;
    }

    @Override // r11
    public final boolean a() {
        return true;
    }

    @Override // r11
    public final boolean d() {
        return true;
    }

    @Override // r11
    public final int e(int i) {
        lcb lcbVar = this.b.s0;
        o68 w = lcbVar.w();
        if (w == null) {
            return 0;
        }
        u58 u58Var = w.M0;
        zbb zbbVar = lcbVar.s;
        float[] fArr = this.a;
        hl.p1(u58Var, zbbVar, fArr);
        return (int) (r3.getMeasuredHeight() - (fArr[1] + u58Var.getMeasuredHeight()));
    }

    @Override // r11
    public final boolean f(int i) {
        return false;
    }

    @Override // r11
    public final int h(int i) {
        return 0;
    }

    @Override // r11
    public final void b(float f) {
    }

    @Override // r11
    public final void c(v21 v21Var) {
    }

    @Override // r11
    public final void g(v21 v21Var) {
    }
}
