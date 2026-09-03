package uf;

import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a0 extends f2.l {
    @Override // f2.l
    public final void D(f2.m1 m1Var) {
        View view = m1Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(m1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new xs((f2.l) this, m1Var, (Object) animate, (Object) view, 4)).start();
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

    @Override // f2.l, f2.p1
    public final void p(f2.m1 m1Var) {
        super.p(m1Var);
        View view = m1Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
