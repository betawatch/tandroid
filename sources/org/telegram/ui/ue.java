package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FlagSecureReason;
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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.jo, MessagesStorage.BooleanCallback, org.telegram.ui.Components.nj0, ResultCallback, wh.c, jh.a, jh.b, w60, ms, org.telegram.ui.Components.cl0, jh.d, org.telegram.ui.Components.ok0, FlagSecureReason.FlagSecureCondition, fv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ ue(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // org.telegram.ui.Components.ok0
    public void a() {
        xn xnVar = this.b;
        xnVar.q9(1);
        xnVar.r9();
    }

    @Override // org.telegram.ui.ms
    public void b() {
        xn xnVar = this.b;
        if (xnVar.y3 != null || xnVar.getParentActivity() == null) {
            return;
        }
        xnVar.Q7();
        xnVar.y3.m(xnVar.T5, xnVar.f, 8);
    }

    @Override // org.telegram.ui.Components.jo
    public void c(TLRPC.Document document) {
        switch (this.a) {
            case 2:
                xn.u0(this.b, document);
                break;
            default:
                xn.v0(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        xn xnVar = this.b;
        boolean z10 = false;
        if (xnVar.getParentActivity() != null) {
            gg.k1 adapter = xnVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                gg.k1 adapter2 = xnVar.I1.getAdapter();
                if (adapter2.w0 != null && !adapter2.h0) {
                    return false;
                }
                Object J = xnVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof gg.h1) {
                    gg.h1 h1Var = (gg.h1) J;
                    if (xnVar.I1.getAdapter().J != null && org.telegram.ui.Components.i51.h) {
                        xnVar.Y.setFieldText("");
                        jk jkVar = xnVar.Y;
                        String str = h1Var.a;
                        TLRPC.Chat chat = xnVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        jkVar.b1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (xnVar.I1.getAdapter().J == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.ea);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ue(xnVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        xnVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.i51.h) {
                        xnVar.Y.setFieldText("");
                        jk jkVar2 = xnVar.Y;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = xnVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        jkVar2.b1(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nj0
    public void e(ArrayList arrayList) {
        switch (this.a) {
            case 9:
                xn xnVar = this.b;
                if (xnVar.getParentActivity() != null && xnVar.getParentActivity() != null) {
                    gi giVar = new gi(xnVar, xnVar, xnVar.getParentActivity(), xnVar.ea, arrayList);
                    giVar.setCalcMandatoryInsets(xnVar.x9());
                    giVar.setDimBehind(false);
                    xnVar.A7(false);
                    xnVar.showDialog(giVar);
                    break;
                }
                break;
            default:
                xn xnVar2 = this.b;
                if (xnVar2.getParentActivity() != null && xnVar2.getParentActivity() != null) {
                    dj djVar = new dj(xnVar2, xnVar2, xnVar2.getParentActivity(), xnVar2.ea, arrayList);
                    djVar.setCalcMandatoryInsets(xnVar2.x9());
                    djVar.setDimBehind(false);
                    xnVar2.A7(false);
                    xnVar2.showDialog(djVar);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                qk qkVar = this.b.B0;
                if (qkVar != null) {
                    qkVar.callOnClick();
                    break;
                }
                break;
            case 1:
                this.b.finishFragment();
                break;
            case 2:
            case 3:
            case 7:
            case 9:
            case 11:
            case 14:
            default:
                xn xnVar = this.b;
                MessageObject messageObject = (MessageObject) xnVar.J4.get(Integer.valueOf(xnVar.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) xnVar.o6[0].get(xnVar.L4);
                }
                xnVar.cc(messageObject);
                break;
            case 4:
                xn xnVar2 = this.b;
                MessagePreviewParams messagePreviewParams = xnVar2.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, xnVar2.T5);
                }
                xnVar2.j8();
                break;
            case 5:
                this.b.ca(1);
                break;
            case 6:
                xn xnVar3 = this.b;
                xnVar3.getMessagesController().unblockPeer(xnVar3.f.id);
                break;
            case 8:
                this.b.finishFragment();
                break;
            case 10:
                gg.k1 adapter = this.b.I1.getAdapter();
                adapter.w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.ja0 ja0Var = adapter.V;
                if (ja0Var != null) {
                    ja0Var.a(false);
                    break;
                }
                break;
            case 12:
                xn xnVar4 = this.b;
                xnVar4.showDialog(new ul(xnVar4, xnVar4.getParentActivity(), xnVar4));
                break;
            case 13:
                xn xnVar5 = this.b;
                xnVar5.Q7();
                UndoView undoView = xnVar5.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 15:
                xn xnVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = xnVar6.f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    xnVar6.ca(0);
                    break;
                }
                break;
            case 16:
                this.b.e9(true);
                break;
        }
    }

    @Override // org.telegram.ui.fv0
    public void g(float[] fArr) {
        xn xnVar = this.b;
        fArr[1] = xnVar.x0.getBottom() - xnVar.Aa;
        fArr[0] = (xnVar.x0.getTop() + xnVar.s9) - AndroidUtilities.dp(4.0f);
    }

    @Override // wh.c
    public void h(boolean z10, boolean z11) {
        xn xnVar = this.b;
        xnVar.M0.i(xnVar.fa.c(), z10, z11);
    }

    @Override // org.telegram.ui.w60
    public void j(int i10, ArrayList arrayList) {
        xn xnVar = this.b;
        xnVar.getMessagesController().addUsersToChat(xnVar.e, xnVar, arrayList, i10, null, null, null);
        xnVar.getMessagesController().hidePeerSettingsBar(xnVar.T5, xnVar.f, xnVar.e);
        xnVar.Qc(true);
        xnVar.oc(true);
    }

    @Override // jh.a
    public void k(int i10) {
        xn xnVar = this.b;
        if (i10 == 1) {
            xnVar.U9();
            return;
        }
        if (i10 == 2) {
            xnVar.H9();
            return;
        }
        if (i10 == 3) {
            xnVar.D4 = true;
            xnVar.getMessagesController().getNextReactionMention(xnVar.T5, xnVar.d(), xnVar.l1, new og(xnVar, 0));
            return;
        }
        if (i10 == 4) {
            xnVar.D4 = true;
            xnVar.getMessagesController().getNextPollVotesMention(xnVar.T5, xnVar.d(), xnVar.m1, new og(xnVar, 1));
            return;
        }
        if (i10 == 6) {
            xnVar.Y8(true);
            return;
        }
        if (i10 == 5) {
            xnVar.Y8(false);
        } else if (i10 == 0) {
            ai.g4 g4Var = xnVar.J1;
            if (g4Var != null) {
                g4Var.I1(null, 0);
            }
            xnVar.X9();
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) obj;
        xn xnVar = this.b;
        vn vnVar = xnVar.ea;
        vnVar.i(c4Var, vnVar.h, xnVar.P5 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        xn xnVar = this.b;
        NotificationCenter notificationCenter = xnVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(xnVar, i10);
        xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        xnVar.finishFragment();
        xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(xnVar.T5), xnVar.f, xnVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        xn xnVar = this.b;
        return xnVar.h != null || xnVar.y9();
    }

    @Override // org.telegram.ui.w60
    public /* synthetic */ void i(TLRPC.User user) {
    }
}
