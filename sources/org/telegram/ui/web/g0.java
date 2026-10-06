package org.telegram.ui.web;

import ai.da;
import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class g0 extends uy {
    public final /* synthetic */ da A4;
    public final /* synthetic */ c1 B4;
    public final /* synthetic */ boolean[] z4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(c1 c1Var, Bundle bundle, boolean[] zArr, da daVar) {
        super(bundle);
        this.B4 = c1Var;
        this.z4 = zArr;
        this.A4 = daVar;
    }

    @Override // org.telegram.ui.uy, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.z4;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        try {
            jSONObject = new JSONObject();
        } catch (Exception unused) {
            jSONObject = null;
        }
        this.B4.y(this.A4, "requested_chat_failed", jSONObject);
    }
}
