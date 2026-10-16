package sg;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class h0 extends LimitPreviewView {
    public final /* synthetic */ i0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, Context context, int i10, int i11, int i12, float f7, c6 c6Var) {
        super(context, i10, i11, i12, f7, c6Var);
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
