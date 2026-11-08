package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class g0 extends LimitPreviewView {
    public final /* synthetic */ h0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, Context context, int i7, int i10, int i11, float f10, f6 f6Var) {
        super(context, i7, i10, i11, f10, f6Var);
        this.p0 = h0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.p0.e.X1) {
            return;
        }
        super.invalidate();
    }
}
