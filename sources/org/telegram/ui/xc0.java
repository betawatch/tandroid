package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class xc0 extends gg.t0 {
    public boolean m0;
    public final /* synthetic */ jd0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc0(jd0 jd0Var, Context context, int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context, i10, j3, false, e6Var, false, z10, z11);
        this.n0 = jd0Var;
        this.m0 = true;
    }

    @Override // gg.t0
    public final void K() {
        this.n0.r0(null);
    }

    @Override // gg.t0
    public final void N(ArrayList arrayList) {
        int i10;
        jd0 jd0Var = this.n0;
        MessageObject messageObject = jd0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    dd0 dd0Var = (dd0) arrayList.get(i11);
                    if (dd0Var != null && !UserObject.isUserSelf(dd0Var.c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                jd0Var.i0 = ((dd0) arrayList.get(0)).a;
            }
            this.m0 = false;
            jd0Var.Z.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
