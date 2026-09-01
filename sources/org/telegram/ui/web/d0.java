package org.telegram.ui.web;

import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.py;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class d0 extends py {
    public final /* synthetic */ boolean[] y4;
    public final /* synthetic */ a1 z4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(a1 a1Var, Bundle bundle, boolean[] zArr) {
        super(bundle);
        this.z4 = a1Var;
        this.y4 = zArr;
    }

    @Override // org.telegram.ui.py, org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.y4;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        try {
            jSONObject = new JSONObject();
        } catch (Exception unused) {
            jSONObject = null;
        }
        this.z4.v("requested_chat_failed", jSONObject);
    }
}
