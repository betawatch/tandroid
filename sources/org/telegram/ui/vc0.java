package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class vc0 extends gg.s0 {
    public boolean m0;
    public final /* synthetic */ hd0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc0(hd0 hd0Var, Context context, int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context, i10, j3, false, e6Var, false, z10, z11);
        this.n0 = hd0Var;
        this.m0 = true;
    }

    @Override // gg.s0
    public final void K() {
        this.n0.q0(null);
    }

    @Override // gg.s0
    public final void N(ArrayList arrayList) {
        int i10;
        hd0 hd0Var = this.n0;
        MessageObject messageObject = hd0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    bd0 bd0Var = (bd0) arrayList.get(i11);
                    if (bd0Var != null && !UserObject.isUserSelf(bd0Var.c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                hd0Var.i0 = ((bd0) arrayList.get(0)).a;
            }
            this.m0 = false;
            hd0Var.Z.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
