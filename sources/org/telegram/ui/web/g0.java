package org.telegram.ui.web;

import ai.da;
import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class g0 extends wy {
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

    @Override // org.telegram.ui.wy, org.telegram.ui.ActionBar.o2
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
