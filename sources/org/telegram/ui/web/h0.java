package org.telegram.ui.web;

import android.os.Bundle;
import bi.k9;
import org.json.JSONObject;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class h0 extends uy {
    public final /* synthetic */ boolean[] B4;
    public final /* synthetic */ k9 C4;
    public final /* synthetic */ d1 D4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(d1 d1Var, Bundle bundle, boolean[] zArr, k9 k9Var) {
        super(bundle);
        this.D4 = d1Var;
        this.B4 = zArr;
        this.C4 = k9Var;
    }

    @Override // org.telegram.ui.uy, org.telegram.ui.ActionBar.n2
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
        this.D4.y(this.C4, "requested_chat_failed", jSONObject);
    }
}
