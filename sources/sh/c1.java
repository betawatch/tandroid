package sh;

import android.os.Bundle;
import org.telegram.ui.py;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
