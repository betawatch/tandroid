package wg;

import android.content.DialogInterface;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import ug.i1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ t(a0 a0Var, int i7) {
        this.a = i7;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        final int i10 = 1;
        final int i11 = 0;
        final a0 a0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.v1(a0Var.o1);
                break;
            case 1:
                ks.f(j10.t0).k(ks.X2, a0Var.X1, Boolean.TRUE);
                break;
            case 2:
                ks.f(j10.t0).k(ks.X2, a0Var.X1, Boolean.FALSE);
                break;
            case 3:
                i1 i1Var = new i1(a0Var.s1, a0Var.a, null, a0Var.J0);
                i1Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wg.w
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (i10) {
                            case 0:
                                yg.r rVar = a0Var.c2.r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = a0Var.c2.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                i1Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: wg.x
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (i10) {
                            case 0:
                                yg.r rVar = a0Var.c2.r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = a0Var.c2.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                i1Var.show();
                break;
            default:
                i1 i1Var2 = new i1(a0Var.s1, a0Var.a, null, a0Var.J0);
                i1Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wg.w
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (i11) {
                            case 0:
                                yg.r rVar = a0Var.c2.r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = a0Var.c2.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                i1Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: wg.x
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (i11) {
                            case 0:
                                yg.r rVar = a0Var.c2.r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = a0Var.c2.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                i1Var2.show();
                break;
        }
    }
}
