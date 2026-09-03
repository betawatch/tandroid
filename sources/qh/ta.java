package qh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.gu0;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ta implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ta(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((l6) this.b).run();
                break;
            case 1:
                ((gu0) this.b).run();
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
