// default package

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class qw4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bx4 b;

    public /* synthetic */ qw4(bx4 bx4Var, byte b) {
        this.a = b;
        this.b = bx4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bx4 bx4Var = this.b;
        switch (b) {
            case 0:
                String str = bx4Var.k2;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    tL_contacts_search.limit = 50;
                    bx4Var.l2 = ConnectionsManager.getInstance(bx4Var.a).sendRequest(tL_contacts_search, new mw3(bx4Var, str, (byte) 8));
                    break;
                }
                break;
            case 1:
                bx4Var.dismiss();
                break;
            case 2:
                bx4Var.i2.O(false);
                break;
            default:
                e eVar = bx4Var.r1;
                if (eVar != null) {
                    bg0 bg0Var = new bg0();
                    bg0Var.a = true;
                    eVar.showAsSheet(new PrivacyControlActivity(11, false), bg0Var);
                    break;
                }
                break;
        }
    }
}
