package rg;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class h0 extends LimitPreviewView {
    public final /* synthetic */ i0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, Context context, int i10, int i11, int i12, float f7, d6 d6Var) {
        super(context, i10, i11, i12, f7, d6Var);
        this.m0 = i0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.m0.e.f0) {
            return;
        }
        super.invalidate();
    }
}
