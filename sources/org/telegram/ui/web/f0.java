package org.telegram.ui.web;

import android.os.Bundle;
import ci.z7;
import org.json.JSONObject;
import org.telegram.ui.cy;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class f0 extends cy {
    public final /* synthetic */ boolean[] B4;
    public final /* synthetic */ z7 C4;
    public final /* synthetic */ a1 D4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(a1 a1Var, Bundle bundle, boolean[] zArr, z7 z7Var) {
        super(bundle);
        this.D4 = a1Var;
        this.B4 = zArr;
        this.C4 = z7Var;
    }

    @Override // org.telegram.ui.cy, org.telegram.ui.ActionBar.n2
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
        this.D4.x(this.C4, "requested_chat_failed", jSONObject);
    }
}
