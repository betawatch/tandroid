package org.telegram.ui.web;

import android.os.Bundle;
import fi.f7;
import org.json.JSONObject;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class b0 extends cx {
    public final /* synthetic */ boolean[] G4;
    public final /* synthetic */ f7 H4;
    public final /* synthetic */ v0 I4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(v0 v0Var, Bundle bundle, boolean[] zArr, f7 f7Var) {
        super(bundle);
        this.I4 = v0Var;
        this.G4 = zArr;
        this.H4 = f7Var;
    }

    @Override // org.telegram.ui.cx, org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.G4;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        try {
            jSONObject = new JSONObject();
        } catch (Exception unused) {
            jSONObject = null;
        }
        this.I4.x(this.H4, "requested_chat_failed", jSONObject);
    }
}
