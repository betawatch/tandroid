package org.telegram.ui.web;

import android.os.Bundle;
import bi.n9;
import org.json.JSONObject;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class g0 extends yy {
    public final /* synthetic */ boolean[] B4;
    public final /* synthetic */ n9 C4;
    public final /* synthetic */ c1 D4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(c1 c1Var, Bundle bundle, boolean[] zArr, n9 n9Var) {
        super(bundle);
        this.D4 = c1Var;
        this.B4 = zArr;
        this.C4 = n9Var;
    }

    @Override // org.telegram.ui.yy, org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.B4;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        try {
            jSONObject = new JSONObject();
        } catch (Exception unused) {
            jSONObject = null;
        }
        this.D4.x(this.C4, "requested_chat_failed", jSONObject);
    }
}
