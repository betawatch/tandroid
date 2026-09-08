package rg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;
import zh.s6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ t(int i10, s6 s6Var) {
        this.b = i10;
        this.c = s6Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.c;
                PhotoViewer photoViewer = ((zt0) o0Var).o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                o0Var.B0(this.b);
                break;
            default:
                NotificationCenter.getInstance(this.b).removeObserver((s6) this.c, NotificationCenter.starSubscriptionsLoaded);
                break;
        }
    }

    public /* synthetic */ t(o0 o0Var, int i10) {
        this.c = o0Var;
        this.b = i10;
    }
}
