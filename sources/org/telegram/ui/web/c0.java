package org.telegram.ui.web;

import android.os.Bundle;
import di.o7;
import org.json.JSONObject;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class c0 extends ww {
    public final /* synthetic */ boolean[] B4;
    public final /* synthetic */ o7 C4;
    public final /* synthetic */ x0 D4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(x0 x0Var, Bundle bundle, boolean[] zArr, o7 o7Var) {
        super(bundle);
        this.D4 = x0Var;
        this.B4 = zArr;
        this.C4 = o7Var;
    }

    @Override // org.telegram.ui.ww, org.telegram.ui.ActionBar.f2
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
