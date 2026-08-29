package org.telegram.ui.web;

import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.fy;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class e0 extends fy {
    public final /* synthetic */ boolean[] x4;
    public final /* synthetic */ z0 y4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(z0 z0Var, Bundle bundle, boolean[] zArr) {
        super(bundle);
        this.y4 = z0Var;
        this.x4 = zArr;
    }

    @Override // org.telegram.ui.fy, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.x4;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        try {
            jSONObject = new JSONObject();
        } catch (Exception unused) {
            jSONObject = null;
        }
        this.y4.v("requested_chat_failed", jSONObject);
    }
}
