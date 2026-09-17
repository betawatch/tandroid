package sg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class i0 extends LimitPreviewView {
    public final /* synthetic */ j0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, Context context, int i10, int i11, int i12, float f7, f6 f6Var) {
        super(context, i10, i11, i12, f7, f6Var);
        this.m0 = j0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.m0.e.f0) {
            return;
        }
        super.invalidate();
    }
}
