package pf;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.v90;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements MediaDataController.KeywordResultCallback, c2 {
    public final /* synthetic */ u0 a;

    public /* synthetic */ j0(u0 u0Var) {
        this.a = u0Var;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        u0 u0Var = this.a;
        u0Var.J = arrayList;
        u0Var.E = null;
        u0Var.w0 = null;
        u0Var.x = null;
        u0Var.y = null;
        u0Var.F = null;
        u0Var.M = null;
        u0Var.I = null;
        u0Var.G = null;
        u0Var.L = null;
        u0Var.l();
        v90 v90Var = u0Var.R;
        ArrayList arrayList2 = u0Var.J;
        v90Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
