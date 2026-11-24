// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class yk1 implements uo5, yo5, ed, h92, sc7, xz8, ResultCallback, mw4, wy1, o41, p41, ka5, ht2, e39 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;

    public /* synthetic */ yk1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override // ht2
    public final void a() {
        mu1 mu1Var = this.b;
        if (mu1Var.N3 != null || mu1Var.getParentActivity() == null) {
            return;
        }
        mu1Var.b6();
        mu1Var.N3.m(mu1Var.f, 8, mu1Var.l6);
    }

    @Override // h92
    public final void b(TLRPC.Document document) {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 4:
                mu1Var.h8(document);
                break;
            default:
                mu1Var.i8(document);
                break;
        }
    }

    @Override // xz8
    public final void c(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                mu1 mu1Var = this.b;
                if (mu1Var.getParentActivity() != null && mu1Var.getParentActivity() != null) {
                    xo1 xo1Var = new xo1(mu1Var, mu1Var, mu1Var.getParentActivity(), mu1Var.Ba, arrayList);
                    boolean Q7 = mu1Var.Q7();
                    xo1Var.i0 = Q7;
                    xo1Var.n = Q7;
                    xo1Var.p0 = false;
                    mu1Var.G5(false);
                    mu1Var.showDialog(xo1Var);
                    break;
                }
                break;
            default:
                mu1 mu1Var2 = this.b;
                if (mu1Var2.getParentActivity() != null && mu1Var2.getParentActivity() != null) {
                    tp1 tp1Var = new tp1(mu1Var2, mu1Var2, mu1Var2.getParentActivity(), mu1Var2.Ba, arrayList);
                    boolean Q72 = mu1Var2.Q7();
                    tp1Var.i0 = Q72;
                    tp1Var.n = Q72;
                    tp1Var.p0 = false;
                    mu1Var2.G5(false);
                    mu1Var2.showDialog(tp1Var);
                    break;
                }
                break;
        }
    }

    @Override // e39
    public final boolean d(int i, View view) {
        mu1 mu1Var = this.b;
        boolean z = false;
        if (mu1Var.getParentActivity() != null) {
            kz6 adapter = mu1Var.X1.getAdapter();
            if ((adapter.J != null || adapter.K != null) && i != 0) {
                kz6 adapter2 = mu1Var.X1.getAdapter();
                if (adapter2.x0 != null && !adapter2.i0) {
                    return false;
                }
                Object J = mu1Var.X1.getAdapter().J(i - 1);
                if (J instanceof hz6) {
                    hz6 hz6Var = (hz6) J;
                    if (mu1Var.X1.getAdapter().K != null && d4c.h) {
                        mu1Var.a0.setFieldText("");
                        ar1 ar1Var = mu1Var.a0;
                        String str = hz6Var.a;
                        TLRPC.Chat chat = mu1Var.e;
                        if (chat != null && chat.megagroup) {
                            z = true;
                        }
                        ar1Var.B1(null, str, true, z);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (mu1Var.X1.getAdapter().K == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var.Ba, mu1Var.getParentActivity());
                        String M0 = k96.M0(R.string.AppName, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131752050, null);
                        alertDialog$Builder.j(k96.M0(2131752087, null), new yk1(mu1Var, (byte) 12));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        mu1Var.showDialog(hdVar);
                        return true;
                    }
                    if (d4c.h) {
                        mu1Var.a0.setFieldText("");
                        ar1 ar1Var2 = mu1Var.a0;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = mu1Var.e;
                        if (chat2 != null && chat2.megagroup) {
                            z = true;
                        }
                        ar1Var2.B1(null, str2, true, z);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // ka5
    public final void f(int i, ArrayList arrayList) {
        mu1 mu1Var = this.b;
        mu1Var.getMessagesController().l(mu1Var.e, mu1Var, arrayList, i, null, null, null);
        mu1Var.getMessagesController().d2(mu1Var.l6, mu1Var.f, mu1Var.e);
        mu1Var.nd(true);
        mu1Var.Kc(true);
    }

    @Override // o41
    public final void g(int i) {
        mu1 mu1Var = this.b;
        byte b = 1;
        if (i == 1) {
            mu1Var.Z9();
            return;
        }
        if (i == 2) {
            mu1Var.M9();
            return;
        }
        byte b2 = 0;
        if (i == 3) {
            mu1Var.R4 = true;
            mu1Var.getMessagesController().t1(mu1Var.l6, mu1Var.d(), mu1Var.A1, true, new sm1(mu1Var, b2));
            return;
        }
        if (i == 4) {
            mu1Var.R4 = true;
            mu1Var.getMessagesController().t1(mu1Var.l6, mu1Var.d(), mu1Var.B1, false, new sm1(mu1Var, b));
            return;
        }
        if (i == 6) {
            mu1Var.q7(true);
            return;
        }
        if (i == 5) {
            mu1Var.q7(false);
        } else if (i == 0) {
            x31 x31Var = mu1Var.Y1;
            if (x31Var != null) {
                x31Var.r1(0, null);
            }
            mu1Var.ca();
        }
    }

    @Override // wy1
    public final void h(boolean z, boolean z2) {
        mu1 mu1Var = this.b;
        mu1Var.b1.j(mu1Var.Ca.b(), z, z2);
    }

    @Override // mw4
    public final void j(int i) {
        this.b.F7(i);
    }

    @Override // sc7
    public final void k(boolean z) {
        mu1 mu1Var = this.b;
        kk7 notificationCenter = mu1Var.getNotificationCenter();
        int i = kk7.s;
        notificationCenter.n(mu1Var, i);
        mu1Var.getNotificationCenter().k(i, new Object[0]);
        mu1Var.finishFragment();
        mu1Var.getNotificationCenter().k(kk7.J2, Long.valueOf(mu1Var.l6), mu1Var.f, mu1Var.e, Boolean.valueOf(z));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        jy3 jy3Var = (jy3) obj;
        mu1 mu1Var = this.b;
        ku1 ku1Var = mu1Var.Ba;
        ku1Var.q(jy3Var, ku1Var.g, mu1Var.h6 != 0, null, false);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 2:
                fr1 fr1Var = mu1Var.E0;
                if (fr1Var != null) {
                    fr1Var.callOnClick();
                    break;
                }
                break;
            case 3:
                mu1Var.finishFragment();
                break;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            case 18:
            default:
                k27 k27Var = (k27) mu1Var.X4.get(Integer.valueOf(mu1Var.Z4));
                if (k27Var == null) {
                    k27Var = (k27) mu1Var.G6[0].get(mu1Var.Z4);
                }
                mu1Var.xc(k27Var);
                break;
            case 6:
                o27 o27Var = mu1Var.x5;
                if (o27Var != null) {
                    o27Var.d(null, mu1Var.l6);
                }
                mu1Var.w6();
                break;
            case 7:
                mu1Var.ha(1);
                break;
            case 8:
                mu1Var.getMessagesController().l5(null, mu1Var.f.id);
                break;
            case 10:
                mu1Var.finishFragment();
                break;
            case 12:
                kz6 adapter = mu1Var.X1.getAdapter();
                adapter.x.c();
                adapter.J.clear();
                adapter.f();
                pz6 pz6Var = adapter.W;
                if (pz6Var != null) {
                    pz6Var.a(false);
                    break;
                }
                break;
            case 15:
                mu1Var.getClass();
                mu1Var.showDialog(new js1(mu1Var, mu1Var.getParentActivity(), mu1Var));
                break;
            case 16:
                mu1Var.b6();
                UndoView undoView = mu1Var.N3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 17:
                mu1Var.getLocationController().k(mu1Var.l6);
                break;
            case 19:
                o27 o27Var2 = mu1Var.x5;
                if (o27Var2 != null && o27Var2.d != null) {
                    mu1Var.ha(0);
                    break;
                }
                break;
            case 20:
                mu1Var.w7(true);
                break;
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
    }

    @Override // ka5
    public final void e(TLRPC.User user) {
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(Throwable th) {
    }
}
