package org.telegram.ui.web;

import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class g0 extends wy {
    public final /* synthetic */ boolean[] B4;
    public final /* synthetic */ a1 C4;
    public final /* synthetic */ c1 D4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(c1 c1Var, Bundle bundle, boolean[] zArr, a1 a1Var) {
        super(bundle);
        this.D4 = c1Var;
        this.B4 = zArr;
        this.C4 = a1Var;
    }

    @Override // org.telegram.ui.wy, org.telegram.ui.ActionBar.p2
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
        this.D4.z(this.C4, "requested_chat_failed", jSONObject);
    }
}
