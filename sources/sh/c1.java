package sh;

import android.os.Bundle;
import org.telegram.ui.py;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class c1 extends py {
    public final /* synthetic */ eh.w y4;
    public final /* synthetic */ e1 z4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e1 e1Var, Bundle bundle, eh.w wVar) {
        super(bundle);
        this.z4 = e1Var;
        this.y4 = wVar;
    }

    @Override // org.telegram.ui.py
    public final boolean I3() {
        return true;
    }

    @Override // org.telegram.ui.py, org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        e1 e1Var = this.z4;
        if (e1Var.Z) {
            return;
        }
        e1Var.Z = true;
        this.y4.run("USER_DECLINED", null);
    }
}
