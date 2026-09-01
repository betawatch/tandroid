package qh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.bu0;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ua implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ua(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((d6) this.b).run();
                break;
            case 1:
                ((bu0) this.b).run();
                break;
            case 2:
                ((HttpGetFileTask) this.b).cancel(true);
                break;
            case 3:
                th.n0 n0Var = (th.n0) this.b;
                ConnectionsManager.getInstance(n0Var.d).cancelRequest(n0Var.r, true);
                n0Var.q = null;
                n0Var.r = 0;
                break;
            default:
                ((zf.n) this.b).F = false;
                break;
        }
    }
}
