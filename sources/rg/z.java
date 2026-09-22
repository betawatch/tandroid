package rg;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
