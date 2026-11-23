package wg;

import android.content.DialogInterface;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import ug.h1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ s(z zVar, int i7) {
        this.a = i7;
        this.b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        final int i10 = 1;
        final int i11 = 0;
        final z zVar = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.v1(zVar.o1);
                break;
            case 1:
                ks.f(i10.t0).k(ks.X2, zVar.X1, Boolean.TRUE);
                break;
            case 2:
                ks.f(i10.t0).k(ks.X2, zVar.X1, Boolean.FALSE);
                break;
            case 3:
                h1 h1Var = new h1(zVar.s1, zVar.a, null, zVar.J0);
                h1Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wg.v
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (i10) {
                            case 0:
                                yg.r rVar = zVar.c2.r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = zVar.c2.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                h1Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: wg.w
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (i10) {
                            case 0:
                                yg.r rVar = zVar.c2.r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = zVar.c2.r;
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
                h1 h1Var2 = new h1(zVar.s1, zVar.a, null, zVar.J0);
                h1Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wg.v
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (i11) {
                            case 0:
                                yg.r rVar = zVar.c2.r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = zVar.c2.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                h1Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: wg.w
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (i11) {
                            case 0:
                                yg.r rVar = zVar.c2.r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = zVar.c2.r;
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
