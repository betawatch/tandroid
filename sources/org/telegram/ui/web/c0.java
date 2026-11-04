package org.telegram.ui.web;

import android.os.Bundle;
import ei.p7;
import org.json.JSONObject;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class c0 extends uw {
    public final /* synthetic */ boolean[] C4;
    public final /* synthetic */ p7 D4;
    public final /* synthetic */ w0 E4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(w0 w0Var, Bundle bundle, boolean[] zArr, p7 p7Var) {
        super(bundle);
        this.E4 = w0Var;
        this.C4 = zArr;
        this.D4 = p7Var;
    }

    @Override // org.telegram.ui.uw, org.telegram.ui.ActionBar.d2
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
