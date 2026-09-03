package org.telegram.ui.web;

import android.os.Bundle;
import nh.j7;
import org.json.JSONObject;
import org.telegram.ui.qy;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class f0 extends qy {
    public final /* synthetic */ c1 A4;
    public final /* synthetic */ boolean[] y4;
    public final /* synthetic */ j7 z4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(c1 c1Var, Bundle bundle, boolean[] zArr, j7 j7Var) {
        super(bundle);
        this.A4 = c1Var;
        this.y4 = zArr;
        this.z4 = j7Var;
    }

    @Override // org.telegram.ui.qy, org.telegram.ui.ActionBar.p2
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
        this.A4.z(this.z4, "requested_chat_failed", jSONObject);
    }
}
