package xg;

import android.content.DialogInterface;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import vg.h1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ t(a0 a0Var, int i3) {
        this.a = i3;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        final int i10 = 1;
        final int i11 = 0;
        final a0 a0Var = this.b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.v1(a0Var.l1);
                break;
            case 1:
                hs.f(h10.t0).k(hs.V2, a0Var.U1, Boolean.TRUE);
                break;
            case 2:
                hs.f(h10.t0).k(hs.V2, a0Var.U1, Boolean.FALSE);
                break;
            case 3:
                h1 h1Var = new h1(a0Var.p1, a0Var.a, null, a0Var.J0);
                h1Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xg.w
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (i10) {
                            case 0:
                                zg.r rVar = a0Var.Z1.r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                zg.r rVar2 = a0Var.Z1.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                h1Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xg.x
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (i10) {
                            case 0:
                                zg.r rVar = a0Var.Z1.r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                zg.r rVar2 = a0Var.Z1.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                h1Var.show();
                break;
            default:
                h1 h1Var2 = new h1(a0Var.p1, a0Var.a, null, a0Var.J0);
                h1Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xg.w
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (i11) {
                            case 0:
                                zg.r rVar = a0Var.Z1.r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                zg.r rVar2 = a0Var.Z1.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                h1Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xg.x
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (i11) {
                            case 0:
                                zg.r rVar = a0Var.Z1.r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                zg.r rVar2 = a0Var.Z1.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                h1Var2.show();
                break;
        }
    }
}
