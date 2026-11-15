package wg;

import android.content.DialogInterface;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import ug.g1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;

    public /* synthetic */ r(y yVar, int i7) {
        this.a = i7;
        this.b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        final int i10 = 1;
        final int i11 = 0;
        final y yVar = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.v1(yVar.o1);
                break;
            case 1:
                ns.f(m10.t0).k(ns.V2, yVar.X1, Boolean.TRUE);
                break;
            case 2:
                ns.f(m10.t0).k(ns.V2, yVar.X1, Boolean.FALSE);
                break;
            case 3:
                g1 g1Var = new g1(yVar.s1, yVar.a, null, yVar.J0);
                g1Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wg.u
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (i10) {
                            case 0:
                                yg.r rVar = yVar.c2.r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = yVar.c2.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                g1Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: wg.v
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (i10) {
                            case 0:
                                yg.r rVar = yVar.c2.r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = yVar.c2.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                g1Var.show();
                break;
            default:
                g1 g1Var2 = new g1(yVar.s1, yVar.a, null, yVar.J0);
                g1Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wg.u
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (i11) {
                            case 0:
                                yg.r rVar = yVar.c2.r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = yVar.c2.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                g1Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: wg.v
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (i11) {
                            case 0:
                                yg.r rVar = yVar.c2.r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = yVar.c2.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                g1Var2.show();
                break;
        }
    }
}
