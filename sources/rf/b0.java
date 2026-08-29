package rf;

import android.view.View;
import android.view.ViewPropertyAnimator;
import f2.n1;
import org.telegram.ui.Components.rs;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b0 extends f2.l {
    @Override // f2.l
    public final void D(n1 n1Var) {
        View view = n1Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(n1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new rs((f2.l) this, n1Var, (Object) animate, (Object) view, 4)).start();
    }

    @Override // f2.l
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override // f2.l
    public final long L() {
        return 0L;
    }

    @Override // f2.u0
    public final long h() {
        return 220L;
    }

    @Override // f2.u0
    public final long j() {
        return 220L;
    }

    @Override // f2.l, f2.q1
    public final void p(n1 n1Var) {
        super.p(n1Var);
        View view = n1Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
