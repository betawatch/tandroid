package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class vq0 extends g.p {
    public final /* synthetic */ br0 c;

    public vq0(br0 br0Var) {
        this.c = br0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        br0 br0Var = this.c;
        if (br0Var.L.j(i10) == 1 || br0Var.Y || (br0Var.J == null && TextUtils.isEmpty(br0Var.v))) {
            return br0Var.M.J;
        }
        int i11 = br0Var.R;
        int i12 = br0Var.g0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
