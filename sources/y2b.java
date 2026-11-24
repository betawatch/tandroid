// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class y2b extends y28 {
    public final /* synthetic */ z2b V3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2b(z2b z2bVar, Context context, m8b m8bVar, w28 w28Var, f53 f53Var) {
        super(context, m8bVar, w28Var, f53Var);
        this.V3 = z2bVar;
    }

    @Override // y28
    public final boolean C0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.V3.f.getCurrentItem();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (qg5.c) {
            qg5.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (qg5.c) {
            qg5.b.add(this);
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
