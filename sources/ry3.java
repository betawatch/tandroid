// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ry3 extends de0 {
    public final /* synthetic */ uy3 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry3(uy3 uy3Var, Context context) {
        super(context);
        this.H = uy3Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ri5.b(this)) {
            return;
        }
        super.invalidate();
        this.H.f();
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (ri5.b(this)) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }
}
