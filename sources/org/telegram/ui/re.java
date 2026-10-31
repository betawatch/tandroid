package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements org.telegram.ui.Components.f50, org.telegram.ui.Components.i50, org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.wn, org.telegram.messenger.zr, org.telegram.ui.Components.si0, ResultCallback, ei.n, oh.d, bh.a, bh.b, q50, ms, org.telegram.ui.Components.ik0, bh.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ re(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // org.telegram.ui.ms
    public void a() {
        un unVar = this.b;
        if (unVar.M3 != null || unVar.getParentActivity() == null) {
            return;
        }
        unVar.Y7();
        unVar.M3.m(unVar.j6, unVar.f, 8);
    }

    @Override // org.telegram.ui.Components.wn
    public void b(TLRPC.Document document) {
        switch (this.a) {
            case 4:
                un.x1(this.b, document);
                break;
            default:
                un.q0(this.b, document);
                break;
        }
    }

    @Override // oh.d
    public void c(boolean z10, boolean z11) {
        un unVar = this.b;
        unVar.a1.i(unVar.ya.b(), z10, z11);
    }

    @Override // bh.a
    public void d(int i10) {
        un unVar = this.b;
        if (i10 == 1) {
            unVar.ka();
            return;
        }
        if (i10 == 2) {
            unVar.X9();
            return;
        }
        if (i10 == 3) {
            unVar.P4 = true;
            unVar.getMessagesController().v1(unVar.j6, unVar.b(), unVar.z1, true, new fg(unVar, 0));
            return;
        }
        if (i10 == 4) {
            unVar.P4 = true;
            unVar.getMessagesController().v1(unVar.j6, unVar.b(), unVar.A1, false, new fg(unVar, 1));
            return;
        }
        if (i10 == 6) {
            unVar.l9(true);
            return;
        }
        if (i10 == 5) {
            unVar.l9(false);
        } else if (i10 == 0) {
            ag.v vVar = unVar.X1;
            if (vVar != null) {
                vVar.v1(0, null);
            }
            unVar.na();
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        un unVar = this.b;
        boolean z10 = false;
        if (unVar.getParentActivity() != null) {
            zf.x0 adapter = unVar.W1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                zf.x0 adapter2 = unVar.W1.getAdapter();
                if (adapter2.w0 != null && !adapter2.h0) {
                    return false;
                }
                Object J = unVar.W1.getAdapter().J(i10 - 1);
                if (J instanceof zf.u0) {
                    zf.u0 u0Var = (zf.u0) J;
                    if (unVar.W1.getAdapter().J != null && org.telegram.ui.Components.b51.h) {
                        unVar.Z.setFieldText("");
                        mk mkVar = unVar.Z;
                        String str = u0Var.a;
                        TLRPC.Chat chat = unVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        mkVar.Y0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (unVar.W1.getAdapter().J == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.xa);
                        String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(2131752062, null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752099, null), new re(unVar, 12));
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        unVar.showDialog(x1Var);
                        return true;
                    }
                    if (org.telegram.ui.Components.b51.h) {
                        unVar.Z.setFieldText("");
                        mk mkVar2 = unVar.Z;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = unVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        mkVar2.Y0(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.q50
    public void g(int i10, ArrayList arrayList) {
        un unVar = this.b;
        unVar.getMessagesController().o(unVar.e, unVar, arrayList, i10, null, null, null);
        unVar.getMessagesController().h2(unVar.j6, unVar.f, unVar.e);
        unVar.ld(true);
        unVar.Ic(true);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 2:
                rk rkVar = this.b.D0;
                if (rkVar != null) {
                    rkVar.callOnClick();
                    break;
                }
                break;
            case 3:
                this.b.finishFragment();
                break;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            case 17:
            default:
                un unVar = this.b;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) unVar.V4.get(Integer.valueOf(unVar.X4));
                if (jjVar == null) {
                    jjVar = (org.telegram.messenger.jj) unVar.E6[0].get(unVar.X4);
                }
                unVar.wc(jjVar);
                break;
            case 6:
                un unVar2 = this.b;
                org.telegram.messenger.nj njVar = unVar2.v5;
                if (njVar != null) {
                    njVar.d(null, unVar2.j6);
                }
                unVar2.s8();
                break;
            case 7:
                this.b.sa(1);
                break;
            case 8:
                un unVar3 = this.b;
                unVar3.getMessagesController().c5(null, unVar3.f.id);
                break;
            case 10:
                this.b.finishFragment();
                break;
            case 12:
                zf.x0 adapter = this.b.W1.getAdapter();
                adapter.x.c();
                adapter.I.clear();
                adapter.f();
                org.telegram.ui.Components.t90 t90Var = adapter.V;
                if (t90Var != null) {
                    t90Var.a(false);
                    break;
                }
                break;
            case 15:
                un unVar4 = this.b;
                unVar4.showDialog(new vl(unVar4, unVar4.getParentActivity(), unVar4));
                break;
            case 16:
                un unVar5 = this.b;
                unVar5.Y7();
                UndoView undoView = unVar5.M3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 18:
                un unVar6 = this.b;
                org.telegram.messenger.nj njVar2 = unVar6.v5;
                if (njVar2 != null && njVar2.d != null) {
                    unVar6.sa(0);
                    break;
                }
                break;
            case 19:
                this.b.r9(true);
                break;
        }
    }

    @Override // org.telegram.messenger.zr
    public void i(boolean z10) {
        un unVar = this.b;
        org.telegram.messenger.zs notificationCenter = unVar.getNotificationCenter();
        int i10 = org.telegram.messenger.zs.t;
        notificationCenter.n(unVar, i10);
        unVar.getNotificationCenter().k(i10, new Object[0]);
        unVar.finishFragment();
        unVar.getNotificationCenter().k(org.telegram.messenger.zs.K2, Long.valueOf(unVar.j6), unVar.f, unVar.e, Boolean.valueOf(z10));
    }

    @Override // ei.n
    public void j(int i10) {
        un.b1(this.b, i10);
    }

    @Override // org.telegram.ui.Components.si0
    public void l(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                un unVar = this.b;
                if (unVar.getParentActivity() != null && unVar.getParentActivity() != null) {
                    mi miVar = new mi(unVar, unVar, unVar.getParentActivity(), unVar.xa, arrayList);
                    boolean J9 = unVar.J9();
                    miVar.h0 = J9;
                    miVar.n = J9;
                    miVar.o0 = false;
                    unVar.I7(false);
                    unVar.showDialog(miVar);
                    break;
                }
                break;
            default:
                un unVar2 = this.b;
                if (unVar2.getParentActivity() != null && unVar2.getParentActivity() != null) {
                    gj gjVar = new gj(unVar2, unVar2, unVar2.getParentActivity(), unVar2.xa, arrayList);
                    boolean J92 = unVar2.J9();
                    gjVar.h0 = J92;
                    gjVar.n = J92;
                    gjVar.o0 = false;
                    unVar2.I7(false);
                    unVar2.showDialog(gjVar);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.y3 y3Var = (org.telegram.ui.ActionBar.y3) obj;
        un unVar = this.b;
        sn snVar = unVar.xa;
        snVar.r(y3Var, snVar.g, unVar.f6 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override // org.telegram.ui.q50
    public /* synthetic */ void e(TLRPC.User user) {
    }
}
