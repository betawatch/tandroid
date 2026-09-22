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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.io, MessagesStorage.BooleanCallback, org.telegram.ui.Components.mj0, ResultCallback, wh.c, jh.a, jh.b, z60, rs, org.telegram.ui.Components.bl0, jh.d, org.telegram.ui.Components.nk0, FlagSecureReason.FlagSecureCondition, mv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ ue(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // org.telegram.ui.Components.nk0
    public void a() {
        bo boVar = this.b;
        boVar.q9(1);
        boVar.r9();
    }

    @Override // org.telegram.ui.rs
    public void b() {
        bo boVar = this.b;
        if (boVar.y3 != null || boVar.getParentActivity() == null) {
            return;
        }
        boVar.Q7();
        boVar.y3.m(boVar.T5, boVar.f, 8);
    }

    @Override // org.telegram.ui.Components.io
    public void c(TLRPC.Document document) {
        switch (this.a) {
            case 2:
                bo.t0(this.b, document);
                break;
            default:
                bo.u0(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean d(int i10, View view) {
        bo boVar = this.b;
        boolean z10 = false;
        if (boVar.getParentActivity() != null) {
            gg.k1 adapter = boVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                gg.k1 adapter2 = boVar.I1.getAdapter();
                if (adapter2.w0 != null && !adapter2.h0) {
                    return false;
                }
                Object J = boVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof gg.h1) {
                    gg.h1 h1Var = (gg.h1) J;
                    if (boVar.I1.getAdapter().J != null && org.telegram.ui.Components.j51.h) {
                        boVar.Y.setFieldText("");
                        mk mkVar = boVar.Y;
                        String str = h1Var.a;
                        TLRPC.Chat chat = boVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        mkVar.b1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (boVar.I1.getAdapter().J == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity(), 0, boVar.ea);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ue(boVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        boVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.j51.h) {
                        boVar.Y.setFieldText("");
                        mk mkVar2 = boVar.Y;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = boVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        mkVar2.b1(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.mj0
    public void e(ArrayList arrayList) {
        switch (this.a) {
            case 9:
                bo boVar = this.b;
                if (boVar.getParentActivity() != null && boVar.getParentActivity() != null) {
                    ji jiVar = new ji(boVar, boVar, boVar.getParentActivity(), boVar.ea, arrayList);
                    jiVar.setCalcMandatoryInsets(boVar.x9());
                    jiVar.setDimBehind(false);
                    boVar.A7(false);
                    boVar.showDialog(jiVar);
                    break;
                }
                break;
            default:
                bo boVar2 = this.b;
                if (boVar2.getParentActivity() != null && boVar2.getParentActivity() != null) {
                    gj gjVar = new gj(boVar2, boVar2, boVar2.getParentActivity(), boVar2.ea, arrayList);
                    gjVar.setCalcMandatoryInsets(boVar2.x9());
                    gjVar.setDimBehind(false);
                    boVar2.A7(false);
                    boVar2.showDialog(gjVar);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
                bo boVar = this.b;
                MessageObject messageObject = (MessageObject) boVar.J4.get(Integer.valueOf(boVar.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) boVar.o6[0].get(boVar.L4);
                }
                boVar.cc(messageObject);
                break;
            case 4:
                bo boVar2 = this.b;
                MessagePreviewParams messagePreviewParams = boVar2.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, boVar2.T5);
                }
                boVar2.j8();
                break;
            case 5:
                this.b.ca(1);
                break;
            case 6:
                bo boVar3 = this.b;
                boVar3.getMessagesController().unblockPeer(boVar3.f.id);
                break;
            case 8:
                this.b.finishFragment();
                break;
            case 10:
                gg.k1 adapter = this.b.I1.getAdapter();
                adapter.w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.ia0 ia0Var = adapter.V;
                if (ia0Var != null) {
                    ia0Var.a(false);
                    break;
                }
                break;
            case 12:
                bo boVar4 = this.b;
                boVar4.showDialog(new xl(boVar4, boVar4.getParentActivity(), boVar4));
                break;
            case 13:
                bo boVar5 = this.b;
                boVar5.Q7();
                UndoView undoView = boVar5.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 15:
                bo boVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = boVar6.f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    boVar6.ca(0);
                    break;
                }
                break;
            case 16:
                this.b.e9(true);
                break;
        }
    }

    @Override // org.telegram.ui.mv0
    public void g(float[] fArr) {
        bo boVar = this.b;
        fArr[1] = boVar.x0.getBottom() - boVar.Aa;
        fArr[0] = (boVar.x0.getTop() + boVar.s9) - AndroidUtilities.dp(4.0f);
    }

    @Override // wh.c
    public void h(boolean z10, boolean z11) {
        bo boVar = this.b;
        boVar.M0.i(boVar.fa.c(), z10, z11);
    }

    @Override // org.telegram.ui.z60
    public void j(int i10, ArrayList arrayList) {
        bo boVar = this.b;
        boVar.getMessagesController().addUsersToChat(boVar.e, boVar, arrayList, i10, null, null, null);
        boVar.getMessagesController().hidePeerSettingsBar(boVar.T5, boVar.f, boVar.e);
        boVar.Qc(true);
        boVar.oc(true);
    }

    @Override // jh.a
    public void k(int i10) {
        bo boVar = this.b;
        if (i10 == 1) {
            boVar.U9();
            return;
        }
        if (i10 == 2) {
            boVar.H9();
            return;
        }
        if (i10 == 3) {
            boVar.D4 = true;
            boVar.getMessagesController().getNextReactionMention(boVar.T5, boVar.d(), boVar.l1, new qg(boVar, 0));
            return;
        }
        if (i10 == 4) {
            boVar.D4 = true;
            boVar.getMessagesController().getNextPollVotesMention(boVar.T5, boVar.d(), boVar.m1, new qg(boVar, 1));
            return;
        }
        if (i10 == 6) {
            boVar.Y8(true);
            return;
        }
        if (i10 == 5) {
            boVar.Y8(false);
        } else if (i10 == 0) {
            ai.g4 g4Var = boVar.J1;
            if (g4Var != null) {
                g4Var.I1(null, 0);
            }
            boVar.X9();
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) obj;
        bo boVar = this.b;
        zn znVar = boVar.ea;
        znVar.i(d4Var, znVar.h, boVar.P5 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        bo boVar = this.b;
        NotificationCenter notificationCenter = boVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(boVar, i10);
        boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        boVar.finishFragment();
        boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(boVar.T5), boVar.f, boVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        bo boVar = this.b;
        return boVar.h != null || boVar.y9();
    }

    @Override // org.telegram.ui.z60
    public /* synthetic */ void i(TLRPC.User user) {
    }
}
