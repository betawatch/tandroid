package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class uc0 extends gg.t0 {
    public boolean m0;
    public final /* synthetic */ gd0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc0(gd0 gd0Var, Context context, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context, i10, j3, false, d6Var, false, z10, z11);
        this.n0 = gd0Var;
        this.m0 = true;
    }

    @Override // gg.t0
    public final void K() {
        this.n0.r0(null);
    }

    @Override // gg.t0
    public final void N(ArrayList arrayList) {
        int i10;
        gd0 gd0Var = this.n0;
        MessageObject messageObject = gd0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ad0 ad0Var = (ad0) arrayList.get(i11);
                    if (ad0Var != null && !UserObject.isUserSelf(ad0Var.c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                gd0Var.i0 = ((ad0) arrayList.get(0)).a;
            }
            this.m0 = false;
            gd0Var.Z.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
