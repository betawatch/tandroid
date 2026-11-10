package wg;

import android.content.DialogInterface;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                org.telegram.messenger.g0.v1(zVar.n1);
                break;
            case 1:
                qs.f(p10.s0).k(qs.V2, zVar.W1, Boolean.TRUE);
                break;
            case 2:
                qs.f(p10.s0).k(qs.V2, zVar.W1, Boolean.FALSE);
                break;
            case 3:
                ug.f1 f1Var = new ug.f1(zVar.r1, zVar.a, null, zVar.I0);
                f1Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wg.v
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (i10) {
                            case 0:
                                yg.r rVar = zVar.b2.r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = zVar.b2.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                f1Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: wg.w
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (i10) {
                            case 0:
                                yg.r rVar = zVar.b2.r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = zVar.b2.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                f1Var.show();
                break;
            default:
                ug.f1 f1Var2 = new ug.f1(zVar.r1, zVar.a, null, zVar.I0);
                f1Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wg.v
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (i11) {
                            case 0:
                                yg.r rVar = zVar.b2.r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = zVar.b2.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                f1Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: wg.w
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (i11) {
                            case 0:
                                yg.r rVar = zVar.b2.r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = zVar.b2.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                f1Var2.show();
                break;
        }
    }
}
