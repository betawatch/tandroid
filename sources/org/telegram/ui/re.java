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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements org.telegram.ui.Components.n60, org.telegram.ui.Components.q60, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.so, MessagesStorage.BooleanCallback, org.telegram.ui.Components.jk0, ResultCallback, xh.c, kh.a, kh.b, i60, gs, org.telegram.ui.Components.yl0, kh.d, org.telegram.ui.Components.kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ re(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        sn snVar = this.b;
        boolean z10 = false;
        if (snVar.getParentActivity() != null) {
            hg.j1 adapter = snVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                hg.j1 adapter2 = snVar.I1.getAdapter();
                if (adapter2.w0 != null && !adapter2.h0) {
                    return false;
                }
                Object J = snVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof hg.g1) {
                    hg.g1 g1Var = (hg.g1) J;
                    if (snVar.I1.getAdapter().J != null && org.telegram.ui.Components.g61.h) {
                        snVar.Y.setFieldText("");
                        hk hkVar = snVar.Y;
                        String str = g1Var.a;
                        TLRPC.Chat chat = snVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        hkVar.X0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (snVar.I1.getAdapter().J == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.ea);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new re(snVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        snVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.g61.h) {
                        snVar.Y.setFieldText("");
                        hk hkVar2 = snVar.Y;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = snVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        hkVar2.X0(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public void b() {
        sn snVar = this.b;
        snVar.v9(1);
        snVar.w9();
    }

    @Override // org.telegram.ui.gs
    public void c() {
        sn snVar = this.b;
        if (snVar.y3 != null || snVar.getParentActivity() == null) {
            return;
        }
        snVar.T7();
        snVar.y3.m(snVar.T5, snVar.f, 8);
    }

    @Override // org.telegram.ui.Components.so
    public void d(TLRPC.Document document) {
        switch (this.a) {
            case 4:
                sn.j0(this.b, document);
                break;
            default:
                sn.D0(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jk0
    public void e(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                sn snVar = this.b;
                if (snVar.getParentActivity() != null && snVar.getParentActivity() != null) {
                    ci ciVar = new ci(snVar, snVar, snVar.getParentActivity(), snVar.ea, arrayList);
                    ciVar.setCalcMandatoryInsets(snVar.C9());
                    ciVar.setDimBehind(false);
                    snVar.D7(false);
                    snVar.showDialog(ciVar);
                    break;
                }
                break;
            default:
                sn snVar2 = this.b;
                if (snVar2.getParentActivity() != null && snVar2.getParentActivity() != null) {
                    zi ziVar = new zi(snVar2, snVar2, snVar2.getParentActivity(), snVar2.ea, arrayList);
                    ziVar.setCalcMandatoryInsets(snVar2.C9());
                    ziVar.setDimBehind(false);
                    snVar2.D7(false);
                    snVar2.showDialog(ziVar);
                    break;
                }
                break;
        }
    }

    @Override // xh.c
    public void f(boolean z10, boolean z11) {
        sn snVar = this.b;
        snVar.M0.i(snVar.fa.c(), z10, z11);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                nk nkVar = this.b.B0;
                if (nkVar != null) {
                    nkVar.callOnClick();
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
            default:
                sn snVar = this.b;
                MessageObject messageObject = (MessageObject) snVar.J4.get(Integer.valueOf(snVar.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) snVar.o6[0].get(snVar.L4);
                }
                snVar.gc(messageObject);
                break;
            case 6:
                sn snVar2 = this.b;
                MessagePreviewParams messagePreviewParams = snVar2.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, snVar2.T5);
                }
                snVar2.m8();
                break;
            case 7:
                this.b.ha(1);
                break;
            case 8:
                sn snVar3 = this.b;
                snVar3.getMessagesController().unblockPeer(snVar3.f.id);
                break;
            case 10:
                this.b.finishFragment();
                break;
            case 12:
                hg.j1 adapter = this.b.I1.getAdapter();
                adapter.w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.db0 db0Var = adapter.V;
                if (db0Var != null) {
                    db0Var.a(false);
                    break;
                }
                break;
            case 15:
                sn snVar4 = this.b;
                snVar4.showDialog(new ql(snVar4, snVar4.getParentActivity(), snVar4));
                break;
            case 16:
                sn snVar5 = this.b;
                snVar5.T7();
                UndoView undoView = snVar5.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 17:
                sn snVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = snVar6.f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    snVar6.ha(0);
                    break;
                }
                break;
            case 18:
                this.b.j9(true);
                break;
        }
    }

    @Override // org.telegram.ui.i60
    public void i(int i10, ArrayList arrayList) {
        sn snVar = this.b;
        snVar.getMessagesController().addUsersToChat(snVar.e, snVar, arrayList, i10, null, null, null);
        snVar.getMessagesController().hidePeerSettingsBar(snVar.T5, snVar.f, snVar.e);
        snVar.Uc(true);
        snVar.sc(true);
    }

    @Override // kh.a
    public void j(int i10) {
        sn snVar = this.b;
        if (i10 == 1) {
            snVar.Z9();
            return;
        }
        if (i10 == 2) {
            snVar.M9();
            return;
        }
        if (i10 == 3) {
            snVar.D4 = true;
            snVar.getMessagesController().getNextReactionMention(snVar.T5, snVar.d(), snVar.l1, new gg(snVar, 0));
            return;
        }
        if (i10 == 4) {
            snVar.D4 = true;
            snVar.getMessagesController().getNextPollVotesMention(snVar.T5, snVar.d(), snVar.m1, new gg(snVar, 1));
            return;
        }
        if (i10 == 6) {
            snVar.d9(true);
            return;
        }
        if (i10 == 5) {
            snVar.d9(false);
        } else if (i10 == 0) {
            ci.b3 b3Var = snVar.J1;
            if (b3Var != null) {
                b3Var.L1(null, 0);
            }
            snVar.ca();
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) obj;
        sn snVar = this.b;
        qn qnVar = snVar.ea;
        qnVar.k(c4Var, qnVar.h, snVar.P5 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        sn snVar = this.b;
        NotificationCenter notificationCenter = snVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(snVar, i10);
        snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        snVar.finishFragment();
        snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(snVar.T5), snVar.f, snVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.ui.i60
    public /* synthetic */ void h(TLRPC.User user) {
    }
}
