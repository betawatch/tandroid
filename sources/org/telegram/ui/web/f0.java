package org.telegram.ui.web;

import ai.da;
import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.ry;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class f0 extends ry {
    public final /* synthetic */ boolean[] A4;
    public final /* synthetic */ da B4;
    public final /* synthetic */ b1 C4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(b1 b1Var, Bundle bundle, boolean[] zArr, da daVar) {
        super(bundle);
        this.C4 = b1Var;
        this.A4 = zArr;
        this.B4 = daVar;
    }

    @Override // org.telegram.ui.ry, org.telegram.ui.ActionBar.n2
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
