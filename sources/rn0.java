// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class rn0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ao0 b;

    public /* synthetic */ rn0(ao0 ao0Var, byte b) {
        this.a = b;
        this.b = ao0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final byte b2 = 1;
        final byte b3 = 0;
        final ao0 ao0Var = this.b;
        switch (b) {
            case 0:
                hl.t1(ao0Var.n1);
                break;
            case 1:
                jn7.f(yac.t0).k(jn7.X2, ao0Var.W1, Boolean.TRUE);
                break;
            case 2:
                jn7.f(yac.t0).k(jn7.X2, ao0Var.W1, Boolean.FALSE);
                break;
            case 3:
                kl8 kl8Var = new kl8(ao0Var.r1, ao0Var.a, null, ao0Var.J0);
                kl8Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: un0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        byte b4 = b2;
                        ao0 ao0Var2 = ao0Var;
                        switch (b4) {
                            case 0:
                                lf5 lf5Var = ao0Var2.b2.r;
                                if (lf5Var != null) {
                                    lf5Var.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                lf5 lf5Var2 = ao0Var2.b2.r;
                                if (lf5Var2 != null) {
                                    lf5Var2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                kl8Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: vn0
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        byte b4 = b2;
                        ao0 ao0Var2 = ao0Var;
                        switch (b4) {
                            case 0:
                                lf5 lf5Var = ao0Var2.b2.r;
                                if (lf5Var != null) {
                                    lf5Var.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                lf5 lf5Var2 = ao0Var2.b2.r;
                                if (lf5Var2 != null) {
                                    lf5Var2.setPaused(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                kl8Var.show();
                break;
            default:
                kl8 kl8Var2 = new kl8(ao0Var.r1, ao0Var.a, null, ao0Var.J0);
                kl8Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: un0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        byte b4 = b3;
                        ao0 ao0Var2 = ao0Var;
                        switch (b4) {
                            case 0:
                                lf5 lf5Var = ao0Var2.b2.r;
                                if (lf5Var != null) {
                                    lf5Var.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                lf5 lf5Var2 = ao0Var2.b2.r;
                                if (lf5Var2 != null) {
                                    lf5Var2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                kl8Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: vn0
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        byte b4 = b3;
                        ao0 ao0Var2 = ao0Var;
                        switch (b4) {
                            case 0:
                                lf5 lf5Var = ao0Var2.b2.r;
                                if (lf5Var != null) {
                                    lf5Var.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                lf5 lf5Var2 = ao0Var2.b2.r;
                                if (lf5Var2 != null) {
                                    lf5Var2.setPaused(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                kl8Var2.show();
                break;
        }
    }
}
