package vg;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g0 extends LimitPreviewView {
    public final /* synthetic */ h0 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, Context context, int i3, int i10, int i11, float f10, e6 e6Var) {
        super(context, i3, i10, i11, f10, e6Var);
        this.q0 = h0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.q0.e.Y1) {
            return;
        }
        super.invalidate();
    }
}
