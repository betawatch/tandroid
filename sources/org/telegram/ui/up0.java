package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class up0 extends f2.x {
    public final /* synthetic */ zp0 c;

    public up0(zp0 zp0Var) {
        this.c = zp0Var;
    }

    @Override // f2.x
    public final int i(int i9) {
        zp0 zp0Var = this.c;
        if (zp0Var.H.j(i9) == 1 || zp0Var.U || (zp0Var.F == null && TextUtils.isEmpty(zp0Var.v))) {
            return zp0Var.I.J;
        }
        int i10 = zp0Var.N;
        int i11 = zp0Var.c0;
        return i10 + (i9 % i11 != i11 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
