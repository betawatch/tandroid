// default package

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class uo1 extends qx3 {
    public final /* synthetic */ vo1 Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo1(vo1 vo1Var, d dVar, Activity activity, wjb wjbVar, ArrayList arrayList) {
        super(dVar, activity, wjbVar, arrayList);
        this.Q1 = vo1Var;
    }

    @Override // qx3, fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        super.dismiss();
        this.Q1.p.p6(false, true, 0.0f);
    }
}
