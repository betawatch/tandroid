package wg;

import android.content.DialogInterface;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                org.telegram.messenger.g0.v1(a0Var.k1);
                break;
            case 1:
                qs.f(p10.s0).k(qs.V2, a0Var.T1, Boolean.TRUE);
                break;
            case 2:
                qs.f(p10.s0).k(qs.V2, a0Var.T1, Boolean.FALSE);
                break;
            case 3:
                ug.f1 f1Var = new ug.f1(a0Var.o1, a0Var.a, null, a0Var.I0);
                f1Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wg.w
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (i10) {
                            case 0:
                                yg.r rVar = a0Var.Y1.r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = a0Var.Y1.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                f1Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: wg.x
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (i10) {
                            case 0:
                                yg.r rVar = a0Var.Y1.r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = a0Var.Y1.r;
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
                ug.f1 f1Var2 = new ug.f1(a0Var.o1, a0Var.a, null, a0Var.I0);
                f1Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wg.w
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (i11) {
                            case 0:
                                yg.r rVar = a0Var.Y1.r;
                                if (rVar != null) {
                                    rVar.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = a0Var.Y1.r;
                                if (rVar2 != null) {
                                    rVar2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                f1Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: wg.x
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (i11) {
                            case 0:
                                yg.r rVar = a0Var.Y1.r;
                                if (rVar != null) {
                                    rVar.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                yg.r rVar2 = a0Var.Y1.r;
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
