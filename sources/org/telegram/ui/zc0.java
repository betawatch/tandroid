package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class zc0 extends hg.s0 {
    public boolean m0;
    public final /* synthetic */ ld0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc0(ld0 ld0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, c6Var, false, z10, z11);
        this.n0 = ld0Var;
        this.m0 = true;
    }

    @Override // hg.s0
    public final void K() {
        this.n0.q0(null);
    }

    @Override // hg.s0
    public final void N(ArrayList arrayList) {
        int i10;
        ld0 ld0Var = this.n0;
        MessageObject messageObject = ld0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    fd0 fd0Var = (fd0) arrayList.get(i11);
                    if (fd0Var != null && !UserObject.isUserSelf(fd0Var.c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                ld0Var.i0 = ((fd0) arrayList.get(0)).a;
            }
            this.m0 = false;
            ld0Var.Z.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
