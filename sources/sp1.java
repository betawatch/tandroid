// default package

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class sp1 extends ly3 {
    public final /* synthetic */ zu1 Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp1(zu1 zu1Var, e eVar, Activity activity, vnb vnbVar, ArrayList arrayList) {
        super(eVar, activity, vnbVar, arrayList);
        this.Q1 = zu1Var;
    }

    @Override // ly3, nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        this.Q1.y6(false, true, 0.0f);
    }
}
