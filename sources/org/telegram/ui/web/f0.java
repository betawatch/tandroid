package org.telegram.ui.web;

import android.os.Bundle;
import di.x7;
import org.json.JSONObject;
import org.telegram.ui.cy;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class f0 extends cy {
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

    @Override // org.telegram.ui.cy, org.telegram.ui.ActionBar.r2
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
