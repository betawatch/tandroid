package org.telegram.ui.web;

import android.os.Bundle;
import ci.z7;
import org.json.JSONObject;
import org.telegram.ui.ey;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class f0 extends ey {
    public final /* synthetic */ boolean[] B4;
    public final /* synthetic */ z7 C4;
    public final /* synthetic */ a1 D4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(a1 a1Var, Bundle bundle, boolean[] zArr, z7 z7Var) {
        super(bundle);
        this.D4 = a1Var;
        this.B4 = zArr;
        this.C4 = z7Var;
    }

    @Override // org.telegram.ui.ey, org.telegram.ui.ActionBar.n2
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
