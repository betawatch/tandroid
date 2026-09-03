package ph;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.gu0;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class wa implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((e6) this.b).run();
                break;
            case 1:
                ((gu0) this.b).run();
                break;
            case 2:
                ((HttpGetFileTask) this.b).cancel(true);
                break;
            case 3:
                sh.n0 n0Var = (sh.n0) this.b;
                ConnectionsManager.getInstance(n0Var.d).cancelRequest(n0Var.r, true);
                n0Var.q = null;
                n0Var.r = 0;
                break;
            default:
                ((yf.n) this.b).F = false;
                break;
        }
    }
}
