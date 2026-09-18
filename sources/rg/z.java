package rg;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class z extends p0 {
    public final /* synthetic */ j0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(j0 j0Var, Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.P = j0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.P.f0) {
            return;
        }
        super.invalidate();
    }
}
