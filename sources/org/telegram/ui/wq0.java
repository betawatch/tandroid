package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class wq0 extends g.p {
    public final /* synthetic */ cr0 c;

    public wq0(cr0 cr0Var) {
        this.c = cr0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        cr0 cr0Var = this.c;
        if (cr0Var.L.j(i10) == 1 || cr0Var.Y || (cr0Var.J == null && TextUtils.isEmpty(cr0Var.v))) {
            return cr0Var.M.J;
        }
        int i11 = cr0Var.R;
        int i12 = cr0Var.g0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
