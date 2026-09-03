package tf;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.la0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements MediaDataController.KeywordResultCallback, c2 {
    public final /* synthetic */ u0 a;

    public /* synthetic */ j0(u0 u0Var) {
        this.a = u0Var;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        u0 u0Var = this.a;
        u0Var.K = arrayList;
        u0Var.F = null;
        u0Var.x0 = null;
        u0Var.x = null;
        u0Var.y = null;
        u0Var.G = null;
        u0Var.N = null;
        u0Var.J = null;
        u0Var.H = null;
        u0Var.M = null;
        u0Var.l();
        la0 la0Var = u0Var.S;
        ArrayList arrayList2 = u0Var.K;
        la0Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
