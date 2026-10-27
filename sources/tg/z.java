package tg;

import android.content.Context;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class z extends p0 {
    public final /* synthetic */ j0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(j0 j0Var, Context context, u6 u6Var) {
        super(context, u6Var, true);
        this.R = j0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.R.f0) {
            return;
        }
        super.invalidate();
    }
}
