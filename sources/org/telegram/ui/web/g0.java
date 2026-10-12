package org.telegram.ui.web;

import android.os.Bundle;
import bi.n9;
import org.json.JSONObject;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class g0 extends yy {
    public final /* synthetic */ boolean[] A4;
    public final /* synthetic */ n9 B4;
    public final /* synthetic */ b1 C4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(b1 b1Var, Bundle bundle, boolean[] zArr, n9 n9Var) {
        super(bundle);
        this.C4 = b1Var;
        this.A4 = zArr;
        this.B4 = n9Var;
    }

    @Override // org.telegram.ui.yy, org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.A4;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        try {
            jSONObject = new JSONObject();
        } catch (Exception unused) {
            jSONObject = null;
        }
        this.C4.x(this.B4, "requested_chat_failed", jSONObject);
    }
}
