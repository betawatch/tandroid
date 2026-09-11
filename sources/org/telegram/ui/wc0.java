package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class wc0 extends hg.t0 {
    public boolean m0;
    public final /* synthetic */ id0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc0(id0 id0Var, Context context, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(context, i10, j3, false, f6Var, false, z10, z11);
        this.n0 = id0Var;
        this.m0 = true;
    }

    @Override // hg.t0
    public final void K() {
        this.n0.r0(null);
    }

    @Override // hg.t0
    public final void N(ArrayList arrayList) {
        int i10;
        id0 id0Var = this.n0;
        MessageObject messageObject = id0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    cd0 cd0Var = (cd0) arrayList.get(i11);
                    if (cd0Var != null && !UserObject.isUserSelf(cd0Var.c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                id0Var.i0 = ((cd0) arrayList.get(0)).a;
            }
            this.m0 = false;
            id0Var.Z.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
