package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class y extends p0 {
    public final /* synthetic */ i0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(i0 i0Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.R = i0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.R.X1) {
            return;
        }
        super.invalidate();
    }
}
