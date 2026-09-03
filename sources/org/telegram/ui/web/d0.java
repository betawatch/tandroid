package org.telegram.ui.web;

import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.py;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
