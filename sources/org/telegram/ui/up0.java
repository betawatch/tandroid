package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class up0 extends f2.v {
    public final /* synthetic */ zp0 c;

    public up0(zp0 zp0Var) {
        this.c = zp0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        zp0 zp0Var = this.c;
        if (zp0Var.H.j(i10) == 1 || zp0Var.U || (zp0Var.F == null && TextUtils.isEmpty(zp0Var.v))) {
            return zp0Var.I.J;
        }
        int i11 = zp0Var.N;
        int i12 = zp0Var.c0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
