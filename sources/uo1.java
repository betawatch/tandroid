// default package

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
        this.Q1.p.r6(false, true, 0.0f);
    }
}
