package org.telegram.ui.web;

import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.oy;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class d0 extends oy {
    public final /* synthetic */ boolean[] y4;
    public final /* synthetic */ a1 z4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(a1 a1Var, Bundle bundle, boolean[] zArr) {
        super(bundle);
        this.z4 = a1Var;
        this.y4 = zArr;
    }

    @Override // org.telegram.ui.oy, org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.y4;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        try {
            jSONObject = new JSONObject();
        } catch (Exception unused) {
            jSONObject = null;
        }
        this.z4.v("requested_chat_failed", jSONObject);
    }
}
