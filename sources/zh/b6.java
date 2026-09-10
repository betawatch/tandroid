package zh;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class b6 extends a3 {
    public final /* synthetic */ c6 e4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(c6 c6Var, Context context, u7 u7Var, y2 y2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, u7Var, y2Var, f6Var);
        this.e4 = c6Var;
    }

    @Override // zh.a3
    public final boolean K0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.e4.g.getCurrentItem();
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
