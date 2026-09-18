package org.telegram.ui.web;

import ai.da;
import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class g0 extends uy {
    public final /* synthetic */ boolean[] A4;
    public final /* synthetic */ da B4;
    public final /* synthetic */ d1 C4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(d1 d1Var, Bundle bundle, boolean[] zArr, da daVar) {
        super(bundle);
        this.C4 = d1Var;
        this.A4 = zArr;
        this.B4 = daVar;
    }

    @Override // org.telegram.ui.uy, org.telegram.ui.ActionBar.n2
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
        this.C4.y(this.B4, "requested_chat_failed", jSONObject);
    }
}
