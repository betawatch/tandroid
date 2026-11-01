package xh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class x1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;

    public /* synthetic */ x1(m2 m2Var, int i10) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new vh.r0(25, this.b, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final m2 m2Var = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: xh.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                m2 m2Var2 = m2Var;
                                if (tL_error == null) {
                                    t3 t3Var = m2Var2.w0;
                                    if (t3Var != null) {
                                        t3Var.a(tLObject);
                                        m2Var2.s();
                                        break;
                                    }
                                } else {
                                    m2Var2.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                m2 m2Var3 = m2Var;
                                if (tL_error == null) {
                                    t3 t3Var2 = m2Var3.w0;
                                    if (t3Var2 != null) {
                                        t3Var2.a(tLObject);
                                        m2Var3.s();
                                        break;
                                    }
                                } else {
                                    m2Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                m2 m2Var4 = m2Var;
                                if (tL_error == null) {
                                    t3 t3Var3 = m2Var4.w0;
                                    if (t3Var3 != null) {
                                        t3Var3.a(tLObject);
                                        m2Var4.s();
                                        break;
                                    }
                                } else {
                                    m2Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                m2 m2Var5 = m2Var;
                                if (tL_error == null) {
                                    t3 t3Var4 = m2Var5.w0;
                                    if (t3Var4 != null) {
                                        t3Var4.a(tLObject);
                                        m2Var5.s();
                                        break;
                                    }
                                } else {
                                    m2Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                m2 m2Var6 = m2Var;
                                if (tL_error == null) {
                                    t3 t3Var5 = m2Var6.w0;
                                    if (t3Var5 != null) {
                                        t3Var5.a(tLObject);
                                        m2Var6.s();
                                        break;
                                    }
                                } else {
                                    m2Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 4;
                final m2 m2Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: xh.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                m2 m2Var22 = m2Var2;
                                if (tL_error == null) {
                                    t3 t3Var = m2Var22.w0;
                                    if (t3Var != null) {
                                        t3Var.a(tLObject);
                                        m2Var22.s();
                                        break;
                                    }
                                } else {
                                    m2Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                m2 m2Var3 = m2Var2;
                                if (tL_error == null) {
                                    t3 t3Var2 = m2Var3.w0;
                                    if (t3Var2 != null) {
                                        t3Var2.a(tLObject);
                                        m2Var3.s();
                                        break;
                                    }
                                } else {
                                    m2Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                m2 m2Var4 = m2Var2;
                                if (tL_error == null) {
                                    t3 t3Var3 = m2Var4.w0;
                                    if (t3Var3 != null) {
                                        t3Var3.a(tLObject);
                                        m2Var4.s();
                                        break;
                                    }
                                } else {
                                    m2Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                m2 m2Var5 = m2Var2;
                                if (tL_error == null) {
                                    t3 t3Var4 = m2Var5.w0;
                                    if (t3Var4 != null) {
                                        t3Var4.a(tLObject);
                                        m2Var5.s();
                                        break;
                                    }
                                } else {
                                    m2Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                m2 m2Var6 = m2Var2;
                                if (tL_error == null) {
                                    t3 t3Var5 = m2Var6.w0;
                                    if (t3Var5 != null) {
                                        t3Var5.a(tLObject);
                                        m2Var6.s();
                                        break;
                                    }
                                } else {
                                    m2Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i12 = 0;
                final m2 m2Var3 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: xh.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                m2 m2Var22 = m2Var3;
                                if (tL_error == null) {
                                    t3 t3Var = m2Var22.w0;
                                    if (t3Var != null) {
                                        t3Var.a(tLObject);
                                        m2Var22.s();
                                        break;
                                    }
                                } else {
                                    m2Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                m2 m2Var32 = m2Var3;
                                if (tL_error == null) {
                                    t3 t3Var2 = m2Var32.w0;
                                    if (t3Var2 != null) {
                                        t3Var2.a(tLObject);
                                        m2Var32.s();
                                        break;
                                    }
                                } else {
                                    m2Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                m2 m2Var4 = m2Var3;
                                if (tL_error == null) {
                                    t3 t3Var3 = m2Var4.w0;
                                    if (t3Var3 != null) {
                                        t3Var3.a(tLObject);
                                        m2Var4.s();
                                        break;
                                    }
                                } else {
                                    m2Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                m2 m2Var5 = m2Var3;
                                if (tL_error == null) {
                                    t3 t3Var4 = m2Var5.w0;
                                    if (t3Var4 != null) {
                                        t3Var4.a(tLObject);
                                        m2Var5.s();
                                        break;
                                    }
                                } else {
                                    m2Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                m2 m2Var6 = m2Var3;
                                if (tL_error == null) {
                                    t3 t3Var5 = m2Var6.w0;
                                    if (t3Var5 != null) {
                                        t3Var5.a(tLObject);
                                        m2Var6.s();
                                        break;
                                    }
                                } else {
                                    m2Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i13 = 2;
                final m2 m2Var4 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: xh.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                m2 m2Var22 = m2Var4;
                                if (tL_error == null) {
                                    t3 t3Var = m2Var22.w0;
                                    if (t3Var != null) {
                                        t3Var.a(tLObject);
                                        m2Var22.s();
                                        break;
                                    }
                                } else {
                                    m2Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                m2 m2Var32 = m2Var4;
                                if (tL_error == null) {
                                    t3 t3Var2 = m2Var32.w0;
                                    if (t3Var2 != null) {
                                        t3Var2.a(tLObject);
                                        m2Var32.s();
                                        break;
                                    }
                                } else {
                                    m2Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                m2 m2Var42 = m2Var4;
                                if (tL_error == null) {
                                    t3 t3Var3 = m2Var42.w0;
                                    if (t3Var3 != null) {
                                        t3Var3.a(tLObject);
                                        m2Var42.s();
                                        break;
                                    }
                                } else {
                                    m2Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                m2 m2Var5 = m2Var4;
                                if (tL_error == null) {
                                    t3 t3Var4 = m2Var5.w0;
                                    if (t3Var4 != null) {
                                        t3Var4.a(tLObject);
                                        m2Var5.s();
                                        break;
                                    }
                                } else {
                                    m2Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                m2 m2Var6 = m2Var4;
                                if (tL_error == null) {
                                    t3 t3Var5 = m2Var6.w0;
                                    if (t3Var5 != null) {
                                        t3Var5.a(tLObject);
                                        m2Var6.s();
                                        break;
                                    }
                                } else {
                                    m2Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i14 = 3;
                final m2 m2Var5 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: xh.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                m2 m2Var22 = m2Var5;
                                if (tL_error == null) {
                                    t3 t3Var = m2Var22.w0;
                                    if (t3Var != null) {
                                        t3Var.a(tLObject);
                                        m2Var22.s();
                                        break;
                                    }
                                } else {
                                    m2Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                m2 m2Var32 = m2Var5;
                                if (tL_error == null) {
                                    t3 t3Var2 = m2Var32.w0;
                                    if (t3Var2 != null) {
                                        t3Var2.a(tLObject);
                                        m2Var32.s();
                                        break;
                                    }
                                } else {
                                    m2Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                m2 m2Var42 = m2Var5;
                                if (tL_error == null) {
                                    t3 t3Var3 = m2Var42.w0;
                                    if (t3Var3 != null) {
                                        t3Var3.a(tLObject);
                                        m2Var42.s();
                                        break;
                                    }
                                } else {
                                    m2Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                m2 m2Var52 = m2Var5;
                                if (tL_error == null) {
                                    t3 t3Var4 = m2Var52.w0;
                                    if (t3Var4 != null) {
                                        t3Var4.a(tLObject);
                                        m2Var52.s();
                                        break;
                                    }
                                } else {
                                    m2Var52.getClass();
                                    break;
                                }
                                break;
                            default:
                                m2 m2Var6 = m2Var5;
                                if (tL_error == null) {
                                    t3 t3Var5 = m2Var6.w0;
                                    if (t3Var5 != null) {
                                        t3Var5.a(tLObject);
                                        m2Var6.s();
                                        break;
                                    }
                                } else {
                                    m2Var6.getClass();
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
