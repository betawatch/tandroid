// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class z4b extends a58 {
    public final /* synthetic */ a5b V3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4b(a5b a5bVar, Context context, oab oabVar, y48 y48Var, r63 r63Var) {
        super(context, oabVar, y48Var, r63Var);
        this.V3 = a5bVar;
    }

    @Override // a58
    public final boolean C0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.V3.f.getCurrentItem();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (pi5.c) {
            pi5.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (pi5.c) {
            pi5.b.add(this);
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
