package th;

import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b7 implements ua {
    public final float[] a = new float[2];
    public final /* synthetic */ c7 b;

    public b7(c7 c7Var) {
        this.b = c7Var;
    }

    @Override // org.telegram.ui.Components.ua
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.ua
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.ua
    public final int f(int i10) {
        o7 o7Var = this.b.r0;
        z2 H = o7Var.H();
        if (H == null) {
            return 0;
        }
        g2 g2Var = H.L0;
        c7 c7Var = o7Var.s;
        float[] fArr = this.a;
        org.telegram.messenger.i0.r1(g2Var, c7Var, fArr);
        return (int) (r4.getMeasuredHeight() - (fArr[1] + g2Var.getMeasuredHeight()));
    }

    @Override // org.telegram.ui.Components.ua
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.ua
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.ua
    public final /* synthetic */ void b(wb wbVar) {
    }

    @Override // org.telegram.ui.Components.ua
    public final /* synthetic */ void c(float f7) {
    }

    @Override // org.telegram.ui.Components.ua
    public final /* synthetic */ void d(wb wbVar) {
    }
}
