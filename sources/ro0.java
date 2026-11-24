// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ro0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ap0 b;

    public /* synthetic */ ro0(ap0 ap0Var, byte b) {
        this.a = b;
        this.b = ap0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final byte b2 = 1;
        final byte b3 = 0;
        final ap0 ap0Var = this.b;
        switch (b) {
            case 0:
                gm.t1(ap0Var.n1);
                break;
            case 1:
                nm7.f(z8c.t0).k(nm7.X2, ap0Var.W1, Boolean.TRUE);
                break;
            case 2:
                nm7.f(z8c.t0).k(nm7.X2, ap0Var.W1, Boolean.FALSE);
                break;
            case 3:
                yj8 yj8Var = new yj8(ap0Var.r1, ap0Var.a, null, ap0Var.J0);
                yj8Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: uo0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        byte b4 = b2;
                        ap0 ap0Var2 = ap0Var;
                        switch (b4) {
                            case 0:
                                if5 if5Var = ap0Var2.b2.r;
                                if (if5Var != null) {
                                    if5Var.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                if5 if5Var2 = ap0Var2.b2.r;
                                if (if5Var2 != null) {
                                    if5Var2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                yj8Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: vo0
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        byte b4 = b2;
                        ap0 ap0Var2 = ap0Var;
                        switch (b4) {
                            case 0:
                                if5 if5Var = ap0Var2.b2.r;
                                if (if5Var != null) {
                                    if5Var.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                if5 if5Var2 = ap0Var2.b2.r;
                                if (if5Var2 != null) {
                                    if5Var2.setPaused(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                yj8Var.show();
                break;
            default:
                yj8 yj8Var2 = new yj8(ap0Var.r1, ap0Var.a, null, ap0Var.J0);
                yj8Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: uo0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        byte b4 = b3;
                        ap0 ap0Var2 = ap0Var;
                        switch (b4) {
                            case 0:
                                if5 if5Var = ap0Var2.b2.r;
                                if (if5Var != null) {
                                    if5Var.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                if5 if5Var2 = ap0Var2.b2.r;
                                if (if5Var2 != null) {
                                    if5Var2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                yj8Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: vo0
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        byte b4 = b3;
                        ap0 ap0Var2 = ap0Var;
                        switch (b4) {
                            case 0:
                                if5 if5Var = ap0Var2.b2.r;
                                if (if5Var != null) {
                                    if5Var.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                if5 if5Var2 = ap0Var2.b2.r;
                                if (if5Var2 != null) {
                                    if5Var2.setPaused(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                yj8Var2.show();
                break;
        }
    }
}
