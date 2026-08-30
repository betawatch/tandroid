package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import ph.f6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ b2(q2 q2Var, int i10) {
        this.a = i10;
        this.b = q2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f6(12, this.b, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final q2 q2Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rh.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                q2 q2Var2 = q2Var;
                                if (tL_error == null) {
                                    z3 z3Var = q2Var2.s0;
                                    if (z3Var != null) {
                                        z3Var.a(tLObject);
                                        q2Var2.n();
                                        break;
                                    }
                                } else {
                                    q2Var2.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                q2 q2Var3 = q2Var;
                                if (tL_error == null) {
                                    z3 z3Var2 = q2Var3.s0;
                                    if (z3Var2 != null) {
                                        z3Var2.a(tLObject);
                                        q2Var3.n();
                                        break;
                                    }
                                } else {
                                    q2Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                q2 q2Var4 = q2Var;
                                if (tL_error == null) {
                                    z3 z3Var3 = q2Var4.s0;
                                    if (z3Var3 != null) {
                                        z3Var3.a(tLObject);
                                        q2Var4.n();
                                        break;
                                    }
                                } else {
                                    q2Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                q2 q2Var5 = q2Var;
                                if (tL_error == null) {
                                    z3 z3Var4 = q2Var5.s0;
                                    if (z3Var4 != null) {
                                        z3Var4.a(tLObject);
                                        q2Var5.n();
                                        break;
                                    }
                                } else {
                                    q2Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                q2 q2Var6 = q2Var;
                                if (tL_error == null) {
                                    z3 z3Var5 = q2Var6.s0;
                                    if (z3Var5 != null) {
                                        z3Var5.a(tLObject);
                                        q2Var6.n();
                                        break;
                                    }
                                } else {
                                    q2Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 4;
                final q2 q2Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rh.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                q2 q2Var22 = q2Var2;
                                if (tL_error == null) {
                                    z3 z3Var = q2Var22.s0;
                                    if (z3Var != null) {
                                        z3Var.a(tLObject);
                                        q2Var22.n();
                                        break;
                                    }
                                } else {
                                    q2Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                q2 q2Var3 = q2Var2;
                                if (tL_error == null) {
                                    z3 z3Var2 = q2Var3.s0;
                                    if (z3Var2 != null) {
                                        z3Var2.a(tLObject);
                                        q2Var3.n();
                                        break;
                                    }
                                } else {
                                    q2Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                q2 q2Var4 = q2Var2;
                                if (tL_error == null) {
                                    z3 z3Var3 = q2Var4.s0;
                                    if (z3Var3 != null) {
                                        z3Var3.a(tLObject);
                                        q2Var4.n();
                                        break;
                                    }
                                } else {
                                    q2Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                q2 q2Var5 = q2Var2;
                                if (tL_error == null) {
                                    z3 z3Var4 = q2Var5.s0;
                                    if (z3Var4 != null) {
                                        z3Var4.a(tLObject);
                                        q2Var5.n();
                                        break;
                                    }
                                } else {
                                    q2Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                q2 q2Var6 = q2Var2;
                                if (tL_error == null) {
                                    z3 z3Var5 = q2Var6.s0;
                                    if (z3Var5 != null) {
                                        z3Var5.a(tLObject);
                                        q2Var6.n();
                                        break;
                                    }
                                } else {
                                    q2Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i12 = 0;
                final q2 q2Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rh.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                q2 q2Var22 = q2Var3;
                                if (tL_error == null) {
                                    z3 z3Var = q2Var22.s0;
                                    if (z3Var != null) {
                                        z3Var.a(tLObject);
                                        q2Var22.n();
                                        break;
                                    }
                                } else {
                                    q2Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                q2 q2Var32 = q2Var3;
                                if (tL_error == null) {
                                    z3 z3Var2 = q2Var32.s0;
                                    if (z3Var2 != null) {
                                        z3Var2.a(tLObject);
                                        q2Var32.n();
                                        break;
                                    }
                                } else {
                                    q2Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                q2 q2Var4 = q2Var3;
                                if (tL_error == null) {
                                    z3 z3Var3 = q2Var4.s0;
                                    if (z3Var3 != null) {
                                        z3Var3.a(tLObject);
                                        q2Var4.n();
                                        break;
                                    }
                                } else {
                                    q2Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                q2 q2Var5 = q2Var3;
                                if (tL_error == null) {
                                    z3 z3Var4 = q2Var5.s0;
                                    if (z3Var4 != null) {
                                        z3Var4.a(tLObject);
                                        q2Var5.n();
                                        break;
                                    }
                                } else {
                                    q2Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                q2 q2Var6 = q2Var3;
                                if (tL_error == null) {
                                    z3 z3Var5 = q2Var6.s0;
                                    if (z3Var5 != null) {
                                        z3Var5.a(tLObject);
                                        q2Var6.n();
                                        break;
                                    }
                                } else {
                                    q2Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i13 = 2;
                final q2 q2Var4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rh.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                q2 q2Var22 = q2Var4;
                                if (tL_error == null) {
                                    z3 z3Var = q2Var22.s0;
                                    if (z3Var != null) {
                                        z3Var.a(tLObject);
                                        q2Var22.n();
                                        break;
                                    }
                                } else {
                                    q2Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                q2 q2Var32 = q2Var4;
                                if (tL_error == null) {
                                    z3 z3Var2 = q2Var32.s0;
                                    if (z3Var2 != null) {
                                        z3Var2.a(tLObject);
                                        q2Var32.n();
                                        break;
                                    }
                                } else {
                                    q2Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                q2 q2Var42 = q2Var4;
                                if (tL_error == null) {
                                    z3 z3Var3 = q2Var42.s0;
                                    if (z3Var3 != null) {
                                        z3Var3.a(tLObject);
                                        q2Var42.n();
                                        break;
                                    }
                                } else {
                                    q2Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                q2 q2Var5 = q2Var4;
                                if (tL_error == null) {
                                    z3 z3Var4 = q2Var5.s0;
                                    if (z3Var4 != null) {
                                        z3Var4.a(tLObject);
                                        q2Var5.n();
                                        break;
                                    }
                                } else {
                                    q2Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                q2 q2Var6 = q2Var4;
                                if (tL_error == null) {
                                    z3 z3Var5 = q2Var6.s0;
                                    if (z3Var5 != null) {
                                        z3Var5.a(tLObject);
                                        q2Var6.n();
                                        break;
                                    }
                                } else {
                                    q2Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i14 = 3;
                final q2 q2Var5 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rh.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                q2 q2Var22 = q2Var5;
                                if (tL_error == null) {
                                    z3 z3Var = q2Var22.s0;
                                    if (z3Var != null) {
                                        z3Var.a(tLObject);
                                        q2Var22.n();
                                        break;
                                    }
                                } else {
                                    q2Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                q2 q2Var32 = q2Var5;
                                if (tL_error == null) {
                                    z3 z3Var2 = q2Var32.s0;
                                    if (z3Var2 != null) {
                                        z3Var2.a(tLObject);
                                        q2Var32.n();
                                        break;
                                    }
                                } else {
                                    q2Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                q2 q2Var42 = q2Var5;
                                if (tL_error == null) {
                                    z3 z3Var3 = q2Var42.s0;
                                    if (z3Var3 != null) {
                                        z3Var3.a(tLObject);
                                        q2Var42.n();
                                        break;
                                    }
                                } else {
                                    q2Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                q2 q2Var52 = q2Var5;
                                if (tL_error == null) {
                                    z3 z3Var4 = q2Var52.s0;
                                    if (z3Var4 != null) {
                                        z3Var4.a(tLObject);
                                        q2Var52.n();
                                        break;
                                    }
                                } else {
                                    q2Var52.getClass();
                                    break;
                                }
                                break;
                            default:
                                q2 q2Var6 = q2Var5;
                                if (tL_error == null) {
                                    z3 z3Var5 = q2Var6.s0;
                                    if (z3Var5 != null) {
                                        z3Var5.a(tLObject);
                                        q2Var6.n();
                                        break;
                                    }
                                } else {
                                    q2Var6.getClass();
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
