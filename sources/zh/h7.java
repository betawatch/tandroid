package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.pc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h7 implements nb {
    public final float[] a = new float[2];
    public final /* synthetic */ i7 b;

    public h7(i7 i7Var) {
        this.b = i7Var;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.nb
    public final int f(int i10) {
        u7 u7Var = this.b.I0;
        a3 t10 = u7Var.t();
        if (t10 == null) {
            return 0;
        }
        h2 h2Var = t10.c1;
        i7 i7Var = u7Var.s;
        float[] fArr = this.a;
        AndroidUtilities.getViewPositionInParent(h2Var, i7Var, fArr);
        return (int) (r4.getMeasuredHeight() - (fArr[1] + h2Var.getMeasuredHeight()));
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ void b(pc pcVar) {
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ void c(float f7) {
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ void d(pc pcVar) {
    }
}
