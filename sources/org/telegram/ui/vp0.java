package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vp0 extends f2.w {
    public final /* synthetic */ aq0 c;

    public vp0(aq0 aq0Var) {
        this.c = aq0Var;
    }

    @Override // f2.w
    public final int i(int i10) {
        aq0 aq0Var = this.c;
        if (aq0Var.H.j(i10) == 1 || aq0Var.U || (aq0Var.F == null && TextUtils.isEmpty(aq0Var.v))) {
            return aq0Var.I.J;
        }
        int i11 = aq0Var.N;
        int i12 = aq0Var.c0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
