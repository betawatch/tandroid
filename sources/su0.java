// default package

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class su0 extends uj3 {
    public final /* synthetic */ boolean[] I4;
    public final /* synthetic */ pv0 J4;
    public final /* synthetic */ rv0 K4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su0(rv0 rv0Var, Bundle bundle, boolean[] zArr, pv0 pv0Var) {
        super(bundle);
        this.K4 = rv0Var;
        this.I4 = zArr;
        this.J4 = pv0Var;
    }

    @Override // uj3, org.telegram.ui.ActionBar.e
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
