package sh;

import android.view.ViewGroup;
import f2.l1;
import org.telegram.ui.ActionBar.g3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        viewGroup = ((g3) f0Var.f).containerView;
        viewGroup.invalidate();
        f0Var.c.invalidate();
    }

    @Override // f2.l
    public final void O() {
        ViewGroup viewGroup;
        f0 f0Var = this.F;
        viewGroup = ((g3) f0Var.f).containerView;
        viewGroup.invalidate();
        f0Var.c.invalidate();
    }

    @Override // f2.l
    public final void P(l1 l1Var) {
        ViewGroup viewGroup;
        f0 f0Var = this.F;
        viewGroup = ((g3) f0Var.f).containerView;
        viewGroup.invalidate();
        f0Var.c.invalidate();
        f0Var.d.invalidate();
    }

    @Override // f2.l
    public final void Q() {
        ViewGroup viewGroup;
        f0 f0Var = this.F;
        viewGroup = ((g3) f0Var.f).containerView;
        viewGroup.invalidate();
        f0Var.c.invalidate();
    }

    @Override // f2.o1
    public final boolean t(l1 l1Var) {
        return true;
    }
}
