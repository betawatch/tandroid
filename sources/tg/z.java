package tg;

import android.content.Context;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
