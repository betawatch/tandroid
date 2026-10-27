package org.telegram.ui.web;

import android.os.Bundle;
import di.x7;
import org.json.JSONObject;
import org.telegram.ui.ey;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f0 extends ey {
    public final /* synthetic */ boolean[] C4;
    public final /* synthetic */ x7 D4;
    public final /* synthetic */ a1 E4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(a1 a1Var, Bundle bundle, boolean[] zArr, x7 x7Var) {
        super(bundle);
        this.E4 = a1Var;
        this.C4 = zArr;
        this.D4 = x7Var;
    }

    @Override // org.telegram.ui.ey, org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.C4;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        try {
            jSONObject = new JSONObject();
        } catch (Exception unused) {
            jSONObject = null;
        }
        this.E4.x(this.D4, "requested_chat_failed", jSONObject);
    }
}
