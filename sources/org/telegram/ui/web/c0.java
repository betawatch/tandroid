package org.telegram.ui.web;

import android.os.Bundle;
import di.p7;
import org.json.JSONObject;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class c0 extends yw {
    public final /* synthetic */ boolean[] C4;
    public final /* synthetic */ p7 D4;
    public final /* synthetic */ x0 E4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(x0 x0Var, Bundle bundle, boolean[] zArr, p7 p7Var) {
        super(bundle);
        this.E4 = x0Var;
        this.C4 = zArr;
        this.D4 = p7Var;
    }

    @Override // org.telegram.ui.yw, org.telegram.ui.ActionBar.f2
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
