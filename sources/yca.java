// default package

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yca extends mu1 {
    public boolean wd;
    public final /* synthetic */ int xd;
    public final /* synthetic */ nfa yd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yca(nfa nfaVar, Bundle bundle, int i) {
        super(bundle);
        this.yd = nfaVar;
        this.xd = i;
        this.wd = true;
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        nfa nfaVar = this.yd;
        zea zeaVar = nfaVar.V;
        if (this.wd) {
            if (this.k0 != null) {
                ra("");
                this.k0.P(zeaVar.x, false);
            }
            lr1 lr1Var = this.D1;
            if (lr1Var != null) {
                lr1Var.e(zeaVar.y, false);
            }
            hq6 mediaDataController = nfaVar.y1.getMediaDataController();
            int classGuid = getClassGuid();
            h19 h19Var = zeaVar.y;
            String str = zeaVar.x;
            ArrayList arrayList = zeaVar.n;
            ArrayList arrayList2 = zeaVar.h;
            int i = zeaVar.w;
            boolean z3 = zeaVar.s;
            mediaDataController.R0 = h19Var;
            mediaDataController.e1 = str;
            boolean[] zArr = mediaDataController.Y0;
            zArr[0] = z3;
            zArr[1] = true;
            ArrayList arrayList3 = mediaDataController.a1;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            mediaDataController.b1.clear();
            mediaDataController.b1.addAll(arrayList);
            mediaDataController.m2();
            int[] iArr = mediaDataController.X0;
            iArr[0] = i;
            iArr[1] = 0;
            mediaDataController.f1 = this.xd;
            mediaDataController.getNotificationCenter().k(kk7.G0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.e0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f1), Integer.valueOf(mediaDataController.k0()), Boolean.TRUE);
            this.wd = false;
        }
        super.onTransitionAnimationStart(z, z2);
    }
}
