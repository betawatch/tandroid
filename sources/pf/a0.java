package pf;

import android.view.View;
import android.view.ViewPropertyAnimator;
import f2.o1;
import org.telegram.ui.Components.ls;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a0 extends f2.l {
    @Override // f2.l
    public final void D(o1 o1Var) {
        View view = o1Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(o1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new ls((f2.l) this, o1Var, (Object) animate, (Object) view, 4)).start();
    }

    @Override // f2.l
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override // f2.l
    public final long L() {
        return 0L;
    }

    @Override // f2.v0
    public final long h() {
        return 220L;
    }

    @Override // f2.v0
    public final long j() {
        return 220L;
    }

    @Override // f2.l, f2.r1
    public final void p(o1 o1Var) {
        super.p(o1Var);
        View view = o1Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
