package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.st0;
import yh.t6;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ s(int i10, t6 t6Var) {
        this.b = i10;
        this.c = t6Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                n0 n0Var = (n0) this.c;
                PhotoViewer photoViewer = ((st0) n0Var).o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                n0Var.C0(this.b);
                break;
            default:
                NotificationCenter.getInstance(this.b).removeObserver((t6) this.c, NotificationCenter.starSubscriptionsLoaded);
                break;
        }
    }

    public /* synthetic */ s(n0 n0Var, int i10) {
        this.c = n0Var;
        this.b = i10;
    }
}
