package tf;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Components.ka0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements MediaDataController.KeywordResultCallback, d2 {
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
        ka0 ka0Var = u0Var.S;
        ArrayList arrayList2 = u0Var.K;
        ka0Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
