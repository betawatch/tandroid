// default package

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sv0 extends nk3 {
    public final /* synthetic */ boolean[] I4;
    public final /* synthetic */ ow0 J4;
    public final /* synthetic */ qw0 K4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(qw0 qw0Var, Bundle bundle, boolean[] zArr, ow0 ow0Var) {
        super(bundle);
        this.K4 = qw0Var;
        this.I4 = zArr;
        this.J4 = ow0Var;
    }

    @Override // nk3, org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.I4;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        try {
            jSONObject = new JSONObject();
        } catch (Exception unused) {
            jSONObject = null;
        }
        this.K4.u(this.J4, "requested_chat_failed", jSONObject);
    }
}
