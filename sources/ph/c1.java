package ph;

import android.os.Bundle;
import org.telegram.ui.fy;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class c1 extends fy {
    public final /* synthetic */ bh.v x4;
    public final /* synthetic */ e1 y4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e1 e1Var, Bundle bundle, bh.v vVar) {
        super(bundle);
        this.y4 = e1Var;
        this.x4 = vVar;
    }

    @Override // org.telegram.ui.fy
    public final boolean I3() {
        return true;
    }

    @Override // org.telegram.ui.fy, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        e1 e1Var = this.y4;
        if (e1Var.Y) {
            return;
        }
        e1Var.Y = true;
        this.x4.run("USER_DECLINED", null);
    }
}
