package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class yc0 extends gg.t0 {
    public boolean m0;
    public final /* synthetic */ kd0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc0(kd0 kd0Var, Context context, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(context, i10, j3, false, f6Var, false, z10, z11);
        this.n0 = kd0Var;
        this.m0 = true;
    }

    @Override // gg.t0
    public final void K() {
        this.n0.r0(null);
    }

    @Override // gg.t0
    public final void N(ArrayList arrayList) {
        int i10;
        kd0 kd0Var = this.n0;
        MessageObject messageObject = kd0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ed0 ed0Var = (ed0) arrayList.get(i11);
                    if (ed0Var != null && !UserObject.isUserSelf(ed0Var.c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                kd0Var.i0 = ((ed0) arrayList.get(0)).a;
            }
            this.m0 = false;
            kd0Var.Z.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
