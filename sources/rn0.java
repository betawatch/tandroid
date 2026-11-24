// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                gl.t1(ao0Var.n1);
                break;
            case 1:
                kk7.f(y6c.t0).k(kk7.W2, ao0Var.W1, Boolean.TRUE);
                break;
            case 2:
                kk7.f(y6c.t0).k(kk7.W2, ao0Var.W1, Boolean.FALSE);
                break;
            case 3:
                xh8 xh8Var = new xh8(ao0Var.r1, ao0Var.a, null, ao0Var.J0);
                xh8Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: un0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        byte b4 = b2;
                        ao0 ao0Var2 = ao0Var;
                        switch (b4) {
                            case 0:
                                kd5 kd5Var = ao0Var2.b2.r;
                                if (kd5Var != null) {
                                    kd5Var.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                kd5 kd5Var2 = ao0Var2.b2.r;
                                if (kd5Var2 != null) {
                                    kd5Var2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                xh8Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: vn0
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        byte b4 = b2;
                        ao0 ao0Var2 = ao0Var;
                        switch (b4) {
                            case 0:
                                kd5 kd5Var = ao0Var2.b2.r;
                                if (kd5Var != null) {
                                    kd5Var.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                kd5 kd5Var2 = ao0Var2.b2.r;
                                if (kd5Var2 != null) {
                                    kd5Var2.setPaused(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                xh8Var.show();
                break;
            default:
                xh8 xh8Var2 = new xh8(ao0Var.r1, ao0Var.a, null, ao0Var.J0);
                xh8Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: un0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        byte b4 = b3;
                        ao0 ao0Var2 = ao0Var;
                        switch (b4) {
                            case 0:
                                kd5 kd5Var = ao0Var2.b2.r;
                                if (kd5Var != null) {
                                    kd5Var.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                kd5 kd5Var2 = ao0Var2.b2.r;
                                if (kd5Var2 != null) {
                                    kd5Var2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                xh8Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: vn0
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        byte b4 = b3;
                        ao0 ao0Var2 = ao0Var;
                        switch (b4) {
                            case 0:
                                kd5 kd5Var = ao0Var2.b2.r;
                                if (kd5Var != null) {
                                    kd5Var.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                kd5 kd5Var2 = ao0Var2.b2.r;
                                if (kd5Var2 != null) {
                                    kd5Var2.setPaused(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                xh8Var2.show();
                break;
        }
    }
}
