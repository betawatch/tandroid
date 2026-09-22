package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
import yh.u6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ s(int i10, u6 u6Var) {
        this.b = i10;
        this.c = u6Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                p0 p0Var = (p0) this.c;
                PhotoViewer photoViewer = ((au0) p0Var).o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                p0Var.C0(this.b);
                break;
            default:
                NotificationCenter.getInstance(this.b).removeObserver((u6) this.c, NotificationCenter.starSubscriptionsLoaded);
                break;
        }
    }

    public /* synthetic */ s(p0 p0Var, int i10) {
        this.c = p0Var;
        this.b = i10;
    }
}
