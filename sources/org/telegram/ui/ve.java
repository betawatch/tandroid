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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ho, MessagesStorage.BooleanCallback, org.telegram.ui.Components.mj0, ResultCallback, xh.c, kh.a, kh.b, a70, rs, org.telegram.ui.Components.bl0, kh.d, org.telegram.ui.Components.nk0, FlagSecureReason.FlagSecureCondition, lv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ ve(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean a(int i10, View view) {
        co coVar = this.b;
        boolean z10 = false;
        if (coVar.getParentActivity() != null) {
            hg.k1 adapter = coVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                hg.k1 adapter2 = coVar.I1.getAdapter();
                if (adapter2.w0 != null && !adapter2.h0) {
                    return false;
                }
                Object J = coVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof hg.h1) {
                    hg.h1 h1Var = (hg.h1) J;
                    if (coVar.I1.getAdapter().J != null && org.telegram.ui.Components.i51.h) {
                        coVar.Y.setFieldText("");
                        mk mkVar = coVar.Y;
                        String str = h1Var.a;
                        TLRPC.Chat chat = coVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        mkVar.a1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (coVar.I1.getAdapter().J == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar.getParentActivity(), 0, coVar.ea);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ve(coVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        coVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.i51.h) {
                        coVar.Y.setFieldText("");
                        mk mkVar2 = coVar.Y;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = coVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        mkVar2.a1(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nk0
    public void b() {
        co coVar = this.b;
        coVar.q9(1);
        coVar.r9();
    }

    @Override // org.telegram.ui.rs
    public void c() {
        co coVar = this.b;
        if (coVar.y3 != null || coVar.getParentActivity() == null) {
            return;
        }
        coVar.Q7();
        coVar.y3.m(coVar.T5, coVar.f, 8);
    }

    @Override // org.telegram.ui.Components.ho
    public void d(TLRPC.Document document) {
        switch (this.a) {
            case 2:
                co.t0(this.b, document);
                break;
            default:
                co.u0(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.mj0
    public void e(ArrayList arrayList) {
        switch (this.a) {
            case 9:
                co coVar = this.b;
                if (coVar.getParentActivity() != null && coVar.getParentActivity() != null) {
                    ji jiVar = new ji(coVar, coVar, coVar.getParentActivity(), coVar.ea, arrayList);
                    jiVar.setCalcMandatoryInsets(coVar.x9());
                    jiVar.setDimBehind(false);
                    coVar.A7(false);
                    coVar.showDialog(jiVar);
                    break;
                }
                break;
            default:
                co coVar2 = this.b;
                if (coVar2.getParentActivity() != null && coVar2.getParentActivity() != null) {
                    gj gjVar = new gj(coVar2, coVar2, coVar2.getParentActivity(), coVar2.ea, arrayList);
                    gjVar.setCalcMandatoryInsets(coVar2.x9());
                    gjVar.setDimBehind(false);
                    coVar2.A7(false);
                    coVar2.showDialog(gjVar);
                    break;
                }
                break;
        }
    }

    @Override // xh.c
    public void f(boolean z10, boolean z11) {
        co coVar = this.b;
        coVar.M0.i(coVar.fa.c(), z10, z11);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                tk tkVar = this.b.B0;
                if (tkVar != null) {
                    tkVar.callOnClick();
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
                co coVar = this.b;
                MessageObject messageObject = (MessageObject) coVar.J4.get(Integer.valueOf(coVar.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) coVar.o6[0].get(coVar.L4);
                }
                coVar.cc(messageObject);
                break;
            case 4:
                co coVar2 = this.b;
                MessagePreviewParams messagePreviewParams = coVar2.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, coVar2.T5);
                }
                coVar2.j8();
                break;
            case 5:
                this.b.ca(1);
                break;
            case 6:
                co coVar3 = this.b;
                coVar3.getMessagesController().unblockPeer(coVar3.f.id);
                break;
            case 8:
                this.b.finishFragment();
                break;
            case 10:
                hg.k1 adapter = this.b.I1.getAdapter();
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
                co coVar4 = this.b;
                coVar4.showDialog(new xl(coVar4, coVar4.getParentActivity(), coVar4));
                break;
            case 13:
                co coVar5 = this.b;
                coVar5.Q7();
                UndoView undoView = coVar5.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 15:
                co coVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = coVar6.f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    coVar6.ca(0);
                    break;
                }
                break;
            case 16:
                this.b.e9(true);
                break;
        }
    }

    @Override // org.telegram.ui.lv0
    public void h(float[] fArr) {
        co coVar = this.b;
        fArr[1] = coVar.x0.getBottom() - coVar.Aa;
        fArr[0] = (coVar.x0.getTop() + coVar.s9) - AndroidUtilities.dp(4.0f);
    }

    @Override // org.telegram.ui.a70
    public void j(int i10, ArrayList arrayList) {
        co coVar = this.b;
        coVar.getMessagesController().addUsersToChat(coVar.e, coVar, arrayList, i10, null, null, null);
        coVar.getMessagesController().hidePeerSettingsBar(coVar.T5, coVar.f, coVar.e);
        coVar.Qc(true);
        coVar.oc(true);
    }

    @Override // kh.a
    public void k(int i10) {
        co coVar = this.b;
        if (i10 == 1) {
            coVar.U9();
            return;
        }
        if (i10 == 2) {
            coVar.H9();
            return;
        }
        if (i10 == 3) {
            coVar.D4 = true;
            coVar.getMessagesController().getNextReactionMention(coVar.T5, coVar.d(), coVar.l1, new qg(coVar, 0));
            return;
        }
        if (i10 == 4) {
            coVar.D4 = true;
            coVar.getMessagesController().getNextPollVotesMention(coVar.T5, coVar.d(), coVar.m1, new qg(coVar, 1));
            return;
        }
        if (i10 == 6) {
            coVar.Y8(true);
            return;
        }
        if (i10 == 5) {
            coVar.Y8(false);
        } else if (i10 == 0) {
            bi.t3 t3Var = coVar.J1;
            if (t3Var != null) {
                t3Var.I1(null, 0);
            }
            coVar.X9();
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) obj;
        co coVar = this.b;
        ao aoVar = coVar.ea;
        aoVar.i(d4Var, aoVar.h, coVar.P5 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        co coVar = this.b;
        NotificationCenter notificationCenter = coVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(coVar, i10);
        coVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        coVar.finishFragment();
        coVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(coVar.T5), coVar.f, coVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        co coVar = this.b;
        return coVar.h != null || coVar.y9();
    }

    @Override // org.telegram.ui.a70
    public /* synthetic */ void i(TLRPC.User user) {
    }
}
