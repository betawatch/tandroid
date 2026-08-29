package qh;

import android.view.ViewGroup;
import f2.n1;
import org.telegram.ui.ActionBar.f3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class e0 extends f2.l {
    public final /* synthetic */ f0 F;

    public e0(f0 f0Var) {
        this.F = f0Var;
    }

    @Override // f2.l
    public final void M() {
        ViewGroup viewGroup;
        f0 f0Var = this.F;
        viewGroup = ((f3) f0Var.f).containerView;
        viewGroup.invalidate();
        f0Var.c.invalidate();
    }

    @Override // f2.l
    public final void O() {
        ViewGroup viewGroup;
        f0 f0Var = this.F;
        viewGroup = ((f3) f0Var.f).containerView;
        viewGroup.invalidate();
        f0Var.c.invalidate();
    }

    @Override // f2.l
    public final void P(n1 n1Var) {
        ViewGroup viewGroup;
        f0 f0Var = this.F;
        viewGroup = ((f3) f0Var.f).containerView;
        viewGroup.invalidate();
        f0Var.c.invalidate();
        f0Var.d.invalidate();
    }

    @Override // f2.l
    public final void Q() {
        ViewGroup viewGroup;
        f0 f0Var = this.F;
        viewGroup = ((f3) f0Var.f).containerView;
        viewGroup.invalidate();
        f0Var.c.invalidate();
    }

    @Override // f2.q1
    public final boolean t(n1 n1Var) {
        return true;
    }
}
