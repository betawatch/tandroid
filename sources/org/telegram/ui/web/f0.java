package org.telegram.ui.web;

import ai.ea;
import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.ty;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class f0 extends ty {
    public final /* synthetic */ boolean[] A4;
    public final /* synthetic */ ea B4;
    public final /* synthetic */ b1 C4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(b1 b1Var, Bundle bundle, boolean[] zArr, ea eaVar) {
        super(bundle);
        this.C4 = b1Var;
        this.A4 = zArr;
        this.B4 = eaVar;
    }

    @Override // org.telegram.ui.ty, org.telegram.ui.ActionBar.n2
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
        this.C4.x(this.B4, "requested_chat_failed", jSONObject);
    }
}
