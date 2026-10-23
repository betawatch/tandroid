package org.telegram.ui.web;

import android.os.Bundle;
import ci.y7;
import org.json.JSONObject;
import org.telegram.ui.ey;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class g0 extends ey {
    public final /* synthetic */ boolean[] D4;
    public final /* synthetic */ y7 E4;
    public final /* synthetic */ b1 F4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(b1 b1Var, Bundle bundle, boolean[] zArr, y7 y7Var) {
        super(bundle);
        this.F4 = b1Var;
        this.D4 = zArr;
        this.E4 = y7Var;
    }

    @Override // org.telegram.ui.ey, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.D4;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        try {
            jSONObject = new JSONObject();
        } catch (Exception unused) {
            jSONObject = null;
        }
        this.F4.x(this.E4, "requested_chat_failed", jSONObject);
    }
}
