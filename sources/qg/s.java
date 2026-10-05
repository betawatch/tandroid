package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vt0;
import yh.x6;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ s(int i10, x6 x6Var) {
        this.b = i10;
        this.c = x6Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                m0 m0Var = (m0) this.c;
                PhotoViewer photoViewer = ((vt0) m0Var).o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                m0Var.C0(this.b);
                break;
            default:
                NotificationCenter.getInstance(this.b).removeObserver((x6) this.c, NotificationCenter.starSubscriptionsLoaded);
                break;
        }
    }

    public /* synthetic */ s(m0 m0Var, int i10) {
        this.c = m0Var;
        this.b = i10;
    }
}
