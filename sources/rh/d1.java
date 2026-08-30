package rh;

import android.os.Bundle;
import org.telegram.ui.oy;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class d1 extends oy {
    public final /* synthetic */ dh.v y4;
    public final /* synthetic */ f1 z4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var, Bundle bundle, dh.v vVar) {
        super(bundle);
        this.z4 = f1Var;
        this.y4 = vVar;
    }

    @Override // org.telegram.ui.oy
    public final boolean I3() {
        return true;
    }

    @Override // org.telegram.ui.oy, org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        f1 f1Var = this.z4;
        if (f1Var.Z) {
            return;
        }
        f1Var.Z = true;
        this.y4.run("USER_DECLINED", null);
    }
}
