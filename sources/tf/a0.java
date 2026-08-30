package tf;

import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.ui.Components.vs;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class a0 extends f2.l {
    @Override // f2.l
    public final void D(f2.l1 l1Var) {
        View view = l1Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(l1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new vs((f2.l) this, l1Var, (Object) animate, (Object) view, 4)).start();
    }

    @Override // f2.l
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override // f2.l
    public final long L() {
        return 0L;
    }

    @Override // f2.t0
    public final long h() {
        return 220L;
    }

    @Override // f2.t0
    public final long j() {
        return 220L;
    }

    @Override // f2.l, f2.o1
    public final void p(f2.l1 l1Var) {
        super.p(l1Var);
        View view = l1Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
