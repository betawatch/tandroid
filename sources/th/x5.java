package th;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x5 extends z2 {
    public final /* synthetic */ y5 O3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(y5 y5Var, Context context, o7 o7Var, x2 x2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, o7Var, x2Var, p6Var);
        this.O3 = y5Var;
    }

    @Override // th.z2
    public final boolean I0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.O3.f.getCurrentItem();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (p.c) {
            p.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (p.c) {
            p.b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
