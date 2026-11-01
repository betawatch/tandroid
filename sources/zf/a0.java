package zf;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a0 extends s4.j {
    @Override // s4.j
    public final void D(s4.c1 c1Var) {
        View view = c1Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(c1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new ci.i(this, c1Var, animate, view)).start();
    }

    @Override // s4.j
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override // s4.j
    public final long L() {
        return 0L;
    }

    @Override // s4.l0
    public final long h() {
        return 220L;
    }

    @Override // s4.l0
    public final long j() {
        return 220L;
    }

    @Override // s4.j, s4.f1
    public final void p(s4.c1 c1Var) {
        super.p(c1Var);
        View view = c1Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
