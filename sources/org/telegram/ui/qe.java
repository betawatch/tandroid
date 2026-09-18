package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements org.telegram.ui.Components.c60, org.telegram.ui.Components.e60, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.io, MessagesStorage.BooleanCallback, org.telegram.ui.Components.xj0, ResultCallback, wh.c, jh.a, jh.b, z60, rs, org.telegram.ui.Components.ml0, jh.d, org.telegram.ui.Components.yk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ qe(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // org.telegram.ui.Components.yk0
    public void a() {
        zn znVar = this.b;
        znVar.q9(1);
        znVar.r9();
    }

    @Override // org.telegram.ui.rs
    public void b() {
        zn znVar = this.b;
        if (znVar.y3 != null || znVar.getParentActivity() == null) {
            return;
        }
        znVar.Q7();
        znVar.y3.m(znVar.T5, znVar.f, 8);
    }

    @Override // org.telegram.ui.Components.io
    public void c(TLRPC.Document document) {
        switch (this.a) {
            case 4:
                zn.b1(this.b, document);
                break;
            default:
                zn.e1(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        zn znVar = this.b;
        boolean z10 = false;
        if (znVar.getParentActivity() != null) {
            gg.k1 adapter = znVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                gg.k1 adapter2 = znVar.I1.getAdapter();
                if (adapter2.w0 != null && !adapter2.h0) {
                    return false;
                }
                Object J = znVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof gg.h1) {
                    gg.h1 h1Var = (gg.h1) J;
                    if (znVar.I1.getAdapter().J != null && org.telegram.ui.Components.y51.h) {
                        znVar.Y.setFieldText("");
                        lk lkVar = znVar.Y;
                        String str = h1Var.a;
                        TLRPC.Chat chat = znVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        lkVar.Z0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (znVar.I1.getAdapter().J == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.ea);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new qe(znVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        znVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.y51.h) {
                        znVar.Y.setFieldText("");
                        lk lkVar2 = znVar.Y;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = znVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        lkVar2.Z0(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.xj0
    public void e(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                zn znVar = this.b;
                if (znVar.getParentActivity() != null && znVar.getParentActivity() != null) {
                    ii iiVar = new ii(znVar, znVar, znVar.getParentActivity(), znVar.ea, arrayList);
                    iiVar.setCalcMandatoryInsets(znVar.x9());
                    iiVar.setDimBehind(false);
                    znVar.A7(false);
                    znVar.showDialog(iiVar);
                    break;
                }
                break;
            default:
                zn znVar2 = this.b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    fj fjVar = new fj(znVar2, znVar2, znVar2.getParentActivity(), znVar2.ea, arrayList);
                    fjVar.setCalcMandatoryInsets(znVar2.x9());
                    fjVar.setDimBehind(false);
                    znVar2.A7(false);
                    znVar2.showDialog(fjVar);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                sk skVar = this.b.B0;
                if (skVar != null) {
                    skVar.callOnClick();
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
            case 18:
            default:
                this.b.e9(true);
                break;
            case 6:
                zn znVar = this.b;
                MessagePreviewParams messagePreviewParams = znVar.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, znVar.T5);
                }
                znVar.j8();
                break;
            case 7:
                this.b.ca(1);
                break;
            case 8:
                zn znVar2 = this.b;
                znVar2.getMessagesController().unblockPeer(znVar2.f.id);
                break;
            case 10:
                this.b.finishFragment();
                break;
            case 12:
                gg.k1 adapter = this.b.I1.getAdapter();
                adapter.w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.ra0 ra0Var = adapter.V;
                if (ra0Var != null) {
                    ra0Var.a(false);
                    break;
                }
                break;
            case 15:
                zn znVar3 = this.b;
                znVar3.showDialog(new ul(znVar3, znVar3.getParentActivity(), znVar3));
                break;
            case 16:
                zn znVar4 = this.b;
                znVar4.Q7();
                UndoView undoView = znVar4.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 17:
                zn znVar5 = this.b;
                MessageObject messageObject = (MessageObject) znVar5.J4.get(Integer.valueOf(znVar5.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) znVar5.o6[0].get(znVar5.L4);
                }
                znVar5.cc(messageObject);
                break;
            case 19:
                zn znVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = znVar6.f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    znVar6.ca(0);
                    break;
                }
                break;
        }
    }

    @Override // wh.c
    public void h(boolean z10, boolean z11) {
        zn znVar = this.b;
        znVar.M0.i(znVar.fa.c(), z10, z11);
    }

    @Override // jh.a
    public void i(int i10) {
        zn znVar = this.b;
        if (i10 == 1) {
            znVar.U9();
            return;
        }
        if (i10 == 2) {
            znVar.H9();
            return;
        }
        if (i10 == 3) {
            znVar.D4 = true;
            znVar.getMessagesController().getNextReactionMention(znVar.T5, znVar.d(), znVar.l1, new qg(znVar, 0));
            return;
        }
        if (i10 == 4) {
            znVar.D4 = true;
            znVar.getMessagesController().getNextPollVotesMention(znVar.T5, znVar.d(), znVar.m1, new qg(znVar, 1));
            return;
        }
        if (i10 == 6) {
            znVar.Y8(true);
            return;
        }
        if (i10 == 5) {
            znVar.Y8(false);
        } else if (i10 == 0) {
            ai.g4 g4Var = znVar.J1;
            if (g4Var != null) {
                g4Var.I1(null, 0);
            }
            znVar.X9();
        }
    }

    @Override // org.telegram.ui.z60
    public void j(int i10, ArrayList arrayList) {
        zn znVar = this.b;
        znVar.getMessagesController().addUsersToChat(znVar.e, znVar, arrayList, i10, null, null, null);
        znVar.getMessagesController().hidePeerSettingsBar(znVar.T5, znVar.f, znVar.e);
        znVar.Qc(true);
        znVar.oc(true);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) obj;
        zn znVar = this.b;
        xn xnVar = znVar.ea;
        xnVar.i(d4Var, xnVar.h, znVar.P5 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        zn znVar = this.b;
        NotificationCenter notificationCenter = znVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(znVar, i10);
        znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        znVar.finishFragment();
        znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(znVar.T5), znVar.f, znVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override // org.telegram.ui.z60
    public /* synthetic */ void g(TLRPC.User user) {
    }
}
