package ph;

import android.app.Activity;
import android.view.ViewGroup;
import nh.t4;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class e extends k51 {
    public final /* synthetic */ j J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, jl0 jl0Var, Activity activity, int i10, int i11, t4 t4Var, c6 c6Var) {
        super(jl0Var, activity, i10, i11, true, t4Var, c6Var);
        this.J = jVar;
    }

    @Override // org.telegram.ui.Components.k51, f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        j jVar = this.J;
        Activity parentActivity = jVar.getParentActivity();
        int i11 = g6.L6;
        c6Var = ((org.telegram.ui.ActionBar.o2) jVar).resourceProvider;
        k4 k4Var = new k4(parentActivity, i11, 21, 0, false, c6Var);
        k4Var.setHeight(25);
        return new vk0(k4Var);
    }
}
