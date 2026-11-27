// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class u6b extends o68 {
    public final /* synthetic */ v6b P3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6b(v6b v6bVar, Context context, lcb lcbVar, m68 m68Var, x53 x53Var) {
        super(context, lcbVar, m68Var, x53Var);
        this.P3 = v6bVar;
    }

    @Override // o68
    public final boolean C0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.P3.f.getCurrentItem();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (si5.c) {
            si5.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (si5.c) {
            si5.b.add(this);
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
