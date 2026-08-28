package org.telegram.ui.web;

import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.dy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class d0 extends dy {
    public final /* synthetic */ boolean[] x4;
    public final /* synthetic */ y0 y4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(y0 y0Var, Bundle bundle, boolean[] zArr) {
        super(bundle);
        this.y4 = y0Var;
        this.x4 = zArr;
    }

    @Override // org.telegram.ui.dy, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.x4;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        try {
            jSONObject = new JSONObject();
        } catch (Exception unused) {
            jSONObject = null;
        }
        this.y4.v("requested_chat_failed", jSONObject);
    }
}
