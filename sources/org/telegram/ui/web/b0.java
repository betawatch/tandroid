package org.telegram.ui.web;

import android.os.Bundle;
import fi.f7;
import org.json.JSONObject;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

    @Override // org.telegram.ui.cx, org.telegram.ui.ActionBar.h2
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
