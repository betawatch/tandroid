// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class z7b implements i11 {
    public final float[] a = new float[2];
    public final /* synthetic */ a8b b;

    public z7b(a8b a8bVar) {
        this.b = a8bVar;
    }

    @Override // i11
    public final boolean a() {
        return true;
    }

    @Override // i11
    public final boolean d() {
        return true;
    }

    @Override // i11
    public final int e(int i) {
        m8b m8bVar = this.b.y0;
        y28 w = m8bVar.w();
        if (w == null) {
            return 0;
        }
        d28 d28Var = w.S0;
        a8b a8bVar = m8bVar.s;
        float[] fArr = this.a;
        gl.p1(d28Var, a8bVar, fArr);
        return (int) (r3.getMeasuredHeight() - (fArr[1] + d28Var.getMeasuredHeight()));
    }

    @Override // i11
    public final boolean f(int i) {
        return false;
    }

    @Override // i11
    public final int h(int i) {
        return 0;
    }

    @Override // i11
    public final void b(float f) {
    }

    @Override // i11
    public final void c(m21 m21Var) {
    }

    @Override // i11
    public final void g(m21 m21Var) {
    }
}
