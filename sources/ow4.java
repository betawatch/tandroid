// default package

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ow4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yw4 b;

    public /* synthetic */ ow4(yw4 yw4Var, byte b) {
        this.a = b;
        this.b = yw4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yw4 yw4Var = this.b;
        switch (b) {
            case 0:
                String str = yw4Var.k2;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    tL_contacts_search.limit = 50;
                    yw4Var.l2 = ConnectionsManager.getInstance(yw4Var.a).sendRequest(tL_contacts_search, new cx3(yw4Var, str, (byte) 8));
                    break;
                }
                break;
            case 1:
                yw4Var.dismiss();
                break;
            case 2:
                yw4Var.i2.O(false);
                break;
            default:
                d dVar = yw4Var.r1;
                if (dVar != null) {
                    bh0 bh0Var = new bh0();
                    bh0Var.a = true;
                    dVar.showAsSheet(new PrivacyControlActivity(11, false), bh0Var);
                    break;
                }
                break;
        }
    }
}
