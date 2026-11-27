// default package

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class pga extends zu1 {
    public boolean Jd;
    public final /* synthetic */ int Kd;
    public final /* synthetic */ eja Ld;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pga(eja ejaVar, Bundle bundle, int i) {
        super(bundle);
        this.Ld = ejaVar;
        this.Kd = i;
        this.Jd = true;
    }

    @Override // zu1, org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        eja ejaVar = this.Ld;
        qia qiaVar = ejaVar.V;
        if (this.Jd) {
            if (this.k0 != null) {
                Ca("");
                this.k0.P(qiaVar.x, false);
            }
            zr1 zr1Var = this.D1;
            if (zr1Var != null) {
                zr1Var.e(qiaVar.y, false);
            }
            ls6 mediaDataController = ejaVar.y1.getMediaDataController();
            int classGuid = getClassGuid();
            w49 w49Var = qiaVar.y;
            String str = qiaVar.x;
            ArrayList arrayList = qiaVar.n;
            ArrayList arrayList2 = qiaVar.h;
            int i = qiaVar.w;
            boolean z3 = qiaVar.s;
            mediaDataController.R0 = w49Var;
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
            mediaDataController.f1 = this.Kd;
            mediaDataController.getNotificationCenter().k(jn7.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.e0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f1), Integer.valueOf(mediaDataController.k0()), Boolean.TRUE);
            this.Jd = false;
        }
        super.onTransitionAnimationStart(z, z2);
    }
}
