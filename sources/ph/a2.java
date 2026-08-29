package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;

    public /* synthetic */ a2(p2 p2Var, int i10) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(10, this.b, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final p2 p2Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ph.u1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                p2 p2Var2 = p2Var;
                                if (tL_error == null) {
                                    y3 y3Var = p2Var2.r0;
                                    if (y3Var != null) {
                                        y3Var.a(tLObject);
                                        p2Var2.n();
                                        break;
                                    }
                                } else {
                                    p2Var2.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                p2 p2Var3 = p2Var;
                                if (tL_error == null) {
                                    y3 y3Var2 = p2Var3.r0;
                                    if (y3Var2 != null) {
                                        y3Var2.a(tLObject);
                                        p2Var3.n();
                                        break;
                                    }
                                } else {
                                    p2Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                p2 p2Var4 = p2Var;
                                if (tL_error == null) {
                                    y3 y3Var3 = p2Var4.r0;
                                    if (y3Var3 != null) {
                                        y3Var3.a(tLObject);
                                        p2Var4.n();
                                        break;
                                    }
                                } else {
                                    p2Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                p2 p2Var5 = p2Var;
                                if (tL_error == null) {
                                    y3 y3Var4 = p2Var5.r0;
                                    if (y3Var4 != null) {
                                        y3Var4.a(tLObject);
                                        p2Var5.n();
                                        break;
                                    }
                                } else {
                                    p2Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                p2 p2Var6 = p2Var;
                                if (tL_error == null) {
                                    y3 y3Var5 = p2Var6.r0;
                                    if (y3Var5 != null) {
                                        y3Var5.a(tLObject);
                                        p2Var6.n();
                                        break;
                                    }
                                } else {
                                    p2Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 4;
                final p2 p2Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ph.u1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                p2 p2Var22 = p2Var2;
                                if (tL_error == null) {
                                    y3 y3Var = p2Var22.r0;
                                    if (y3Var != null) {
                                        y3Var.a(tLObject);
                                        p2Var22.n();
                                        break;
                                    }
                                } else {
                                    p2Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                p2 p2Var3 = p2Var2;
                                if (tL_error == null) {
                                    y3 y3Var2 = p2Var3.r0;
                                    if (y3Var2 != null) {
                                        y3Var2.a(tLObject);
                                        p2Var3.n();
                                        break;
                                    }
                                } else {
                                    p2Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                p2 p2Var4 = p2Var2;
                                if (tL_error == null) {
                                    y3 y3Var3 = p2Var4.r0;
                                    if (y3Var3 != null) {
                                        y3Var3.a(tLObject);
                                        p2Var4.n();
                                        break;
                                    }
                                } else {
                                    p2Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                p2 p2Var5 = p2Var2;
                                if (tL_error == null) {
                                    y3 y3Var4 = p2Var5.r0;
                                    if (y3Var4 != null) {
                                        y3Var4.a(tLObject);
                                        p2Var5.n();
                                        break;
                                    }
                                } else {
                                    p2Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                p2 p2Var6 = p2Var2;
                                if (tL_error == null) {
                                    y3 y3Var5 = p2Var6.r0;
                                    if (y3Var5 != null) {
                                        y3Var5.a(tLObject);
                                        p2Var6.n();
                                        break;
                                    }
                                } else {
                                    p2Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i12 = 0;
                final p2 p2Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ph.u1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                p2 p2Var22 = p2Var3;
                                if (tL_error == null) {
                                    y3 y3Var = p2Var22.r0;
                                    if (y3Var != null) {
                                        y3Var.a(tLObject);
                                        p2Var22.n();
                                        break;
                                    }
                                } else {
                                    p2Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                p2 p2Var32 = p2Var3;
                                if (tL_error == null) {
                                    y3 y3Var2 = p2Var32.r0;
                                    if (y3Var2 != null) {
                                        y3Var2.a(tLObject);
                                        p2Var32.n();
                                        break;
                                    }
                                } else {
                                    p2Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                p2 p2Var4 = p2Var3;
                                if (tL_error == null) {
                                    y3 y3Var3 = p2Var4.r0;
                                    if (y3Var3 != null) {
                                        y3Var3.a(tLObject);
                                        p2Var4.n();
                                        break;
                                    }
                                } else {
                                    p2Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                p2 p2Var5 = p2Var3;
                                if (tL_error == null) {
                                    y3 y3Var4 = p2Var5.r0;
                                    if (y3Var4 != null) {
                                        y3Var4.a(tLObject);
                                        p2Var5.n();
                                        break;
                                    }
                                } else {
                                    p2Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                p2 p2Var6 = p2Var3;
                                if (tL_error == null) {
                                    y3 y3Var5 = p2Var6.r0;
                                    if (y3Var5 != null) {
                                        y3Var5.a(tLObject);
                                        p2Var6.n();
                                        break;
                                    }
                                } else {
                                    p2Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i13 = 2;
                final p2 p2Var4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ph.u1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                p2 p2Var22 = p2Var4;
                                if (tL_error == null) {
                                    y3 y3Var = p2Var22.r0;
                                    if (y3Var != null) {
                                        y3Var.a(tLObject);
                                        p2Var22.n();
                                        break;
                                    }
                                } else {
                                    p2Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                p2 p2Var32 = p2Var4;
                                if (tL_error == null) {
                                    y3 y3Var2 = p2Var32.r0;
                                    if (y3Var2 != null) {
                                        y3Var2.a(tLObject);
                                        p2Var32.n();
                                        break;
                                    }
                                } else {
                                    p2Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                p2 p2Var42 = p2Var4;
                                if (tL_error == null) {
                                    y3 y3Var3 = p2Var42.r0;
                                    if (y3Var3 != null) {
                                        y3Var3.a(tLObject);
                                        p2Var42.n();
                                        break;
                                    }
                                } else {
                                    p2Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                p2 p2Var5 = p2Var4;
                                if (tL_error == null) {
                                    y3 y3Var4 = p2Var5.r0;
                                    if (y3Var4 != null) {
                                        y3Var4.a(tLObject);
                                        p2Var5.n();
                                        break;
                                    }
                                } else {
                                    p2Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                p2 p2Var6 = p2Var4;
                                if (tL_error == null) {
                                    y3 y3Var5 = p2Var6.r0;
                                    if (y3Var5 != null) {
                                        y3Var5.a(tLObject);
                                        p2Var6.n();
                                        break;
                                    }
                                } else {
                                    p2Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i14 = 3;
                final p2 p2Var5 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ph.u1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                p2 p2Var22 = p2Var5;
                                if (tL_error == null) {
                                    y3 y3Var = p2Var22.r0;
                                    if (y3Var != null) {
                                        y3Var.a(tLObject);
                                        p2Var22.n();
                                        break;
                                    }
                                } else {
                                    p2Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                p2 p2Var32 = p2Var5;
                                if (tL_error == null) {
                                    y3 y3Var2 = p2Var32.r0;
                                    if (y3Var2 != null) {
                                        y3Var2.a(tLObject);
                                        p2Var32.n();
                                        break;
                                    }
                                } else {
                                    p2Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                p2 p2Var42 = p2Var5;
                                if (tL_error == null) {
                                    y3 y3Var3 = p2Var42.r0;
                                    if (y3Var3 != null) {
                                        y3Var3.a(tLObject);
                                        p2Var42.n();
                                        break;
                                    }
                                } else {
                                    p2Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                p2 p2Var52 = p2Var5;
                                if (tL_error == null) {
                                    y3 y3Var4 = p2Var52.r0;
                                    if (y3Var4 != null) {
                                        y3Var4.a(tLObject);
                                        p2Var52.n();
                                        break;
                                    }
                                } else {
                                    p2Var52.getClass();
                                    break;
                                }
                                break;
                            default:
                                p2 p2Var6 = p2Var5;
                                if (tL_error == null) {
                                    y3 y3Var5 = p2Var6.r0;
                                    if (y3Var5 != null) {
                                        y3Var5.a(tLObject);
                                        p2Var6.n();
                                        break;
                                    }
                                } else {
                                    p2Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
