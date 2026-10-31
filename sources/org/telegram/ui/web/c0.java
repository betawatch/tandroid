package org.telegram.ui.web;

import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.ay;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class c0 extends ay {
    public final /* synthetic */ boolean[] B4;
    public final /* synthetic */ x0 C4;
    public final /* synthetic */ z0 D4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(z0 z0Var, Bundle bundle, boolean[] zArr, x0 x0Var) {
        super(bundle);
        this.D4 = z0Var;
        this.B4 = zArr;
        this.C4 = x0Var;
    }

    @Override // org.telegram.ui.ay, org.telegram.ui.ActionBar.k2
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
        this.D4.y(this.C4, "requested_chat_failed", jSONObject);
    }
}
