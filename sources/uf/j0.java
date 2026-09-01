package uf;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Components.ma0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        ma0 ma0Var = u0Var.S;
        ArrayList arrayList2 = u0Var.K;
        ma0Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
