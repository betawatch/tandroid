package rf;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.fa0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements MediaDataController.KeywordResultCallback, c2 {
    public final /* synthetic */ v0 a;

    public /* synthetic */ k0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        v0 v0Var = this.a;
        v0Var.J = arrayList;
        v0Var.E = null;
        v0Var.w0 = null;
        v0Var.x = null;
        v0Var.y = null;
        v0Var.F = null;
        v0Var.M = null;
        v0Var.I = null;
        v0Var.G = null;
        v0Var.L = null;
        v0Var.l();
        fa0 fa0Var = v0Var.R;
        ArrayList arrayList2 = v0Var.J;
        fa0Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
