// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class xbb implements r11 {
    public final float[] a = new float[2];
    public final /* synthetic */ ybb b;

    public xbb(ybb ybbVar) {
        this.b = ybbVar;
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
        t58 t58Var = w.M0;
        ybb ybbVar = lcbVar.s;
        float[] fArr = this.a;
        hl.p1(t58Var, ybbVar, fArr);
        return (int) (r3.getMeasuredHeight() - (fArr[1] + t58Var.getMeasuredHeight()));
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
