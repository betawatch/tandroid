package tg;

import android.content.Context;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class h0 extends LimitPreviewView {
    public final /* synthetic */ i0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, Context context, int i10, int i11, int i12, float f7, u6 u6Var) {
        super(context, i10, i11, i12, f7, u6Var);
        this.p0 = i0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.p0.e.f0) {
            return;
        }
        super.invalidate();
    }
}
