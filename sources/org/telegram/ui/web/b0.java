package org.telegram.ui.web;

import android.os.Bundle;
import fi.i7;
import org.json.JSONObject;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class b0 extends yw {
    public final /* synthetic */ boolean[] D4;
    public final /* synthetic */ i7 E4;
    public final /* synthetic */ v0 F4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(v0 v0Var, Bundle bundle, boolean[] zArr, i7 i7Var) {
        super(bundle);
        this.F4 = v0Var;
        this.D4 = zArr;
        this.E4 = i7Var;
    }

    @Override // org.telegram.ui.yw, org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.D4;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        try {
            jSONObject = new JSONObject();
        } catch (Exception unused) {
            jSONObject = null;
        }
        this.F4.x(this.E4, "requested_chat_failed", jSONObject);
    }
}
