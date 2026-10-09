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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements org.telegram.ui.Components.u60, org.telegram.ui.Components.x60, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.yo, MessagesStorage.BooleanCallback, org.telegram.ui.Components.rk0, ResultCallback, wh.c, jh.a, jh.b, x60, ps, org.telegram.ui.Components.gm0, jh.d, org.telegram.ui.Components.sl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ re(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // org.telegram.ui.Components.sl0
    public void a() {
        zn znVar = this.b;
        znVar.v9(1);
        znVar.w9();
    }

    @Override // org.telegram.ui.ps
    public void b() {
        zn znVar = this.b;
        if (znVar.y3 != null || znVar.getParentActivity() == null) {
            return;
        }
        znVar.T7();
        znVar.y3.m(znVar.T5, znVar.f, 8);
    }

    @Override // org.telegram.ui.Components.yo
    public void c(TLRPC.Document document) {
        switch (this.a) {
            case 4:
                zn.j0(this.b, document);
                break;
            default:
                zn.D0(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.gm0
    public boolean d(int i10, View view) {
        zn znVar = this.b;
        boolean z10 = false;
        if (znVar.getParentActivity() != null) {
            gg.j1 adapter = znVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                gg.j1 adapter2 = znVar.I1.getAdapter();
                if (adapter2.w0 != null && !adapter2.h0) {
                    return false;
                }
                Object J = znVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof gg.g1) {
                    gg.g1 g1Var = (gg.g1) J;
                    if (znVar.I1.getAdapter().J != null && org.telegram.ui.Components.q61.h) {
                        znVar.Y.setFieldText("");
                        ok okVar = znVar.Y;
                        String str = g1Var.a;
                        TLRPC.Chat chat = znVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        okVar.Y0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (znVar.I1.getAdapter().J == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.ea);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new re(znVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        znVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.q61.h) {
                        znVar.Y.setFieldText("");
                        ok okVar2 = znVar.Y;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = znVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        okVar2.Y0(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public void e(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                zn znVar = this.b;
                if (znVar.getParentActivity() != null && znVar.getParentActivity() != null) {
                    ji jiVar = new ji(znVar, znVar, znVar.getParentActivity(), znVar.ea, arrayList);
                    jiVar.setCalcMandatoryInsets(znVar.C9());
                    jiVar.setDimBehind(false);
                    znVar.D7(false);
                    znVar.showDialog(jiVar);
                    break;
                }
                break;
            default:
                zn znVar2 = this.b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    gj gjVar = new gj(znVar2, znVar2, znVar2.getParentActivity(), znVar2.ea, arrayList);
                    gjVar.setCalcMandatoryInsets(znVar2.C9());
                    gjVar.setDimBehind(false);
                    znVar2.D7(false);
                    znVar2.showDialog(gjVar);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                uk ukVar = this.b.B0;
                if (ukVar != null) {
                    ukVar.callOnClick();
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
                zn znVar = this.b;
                MessageObject messageObject = (MessageObject) znVar.J4.get(Integer.valueOf(znVar.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) znVar.o6[0].get(znVar.L4);
                }
                znVar.gc(messageObject);
                break;
            case 6:
                zn znVar2 = this.b;
                MessagePreviewParams messagePreviewParams = znVar2.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, znVar2.T5);
                }
                znVar2.m8();
                break;
            case 7:
                this.b.ha(1);
                break;
            case 8:
                zn znVar3 = this.b;
                znVar3.getMessagesController().unblockPeer(znVar3.f.id);
                break;
            case 10:
                this.b.finishFragment();
                break;
            case 12:
                gg.j1 adapter = this.b.I1.getAdapter();
                adapter.w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.kb0 kb0Var = adapter.V;
                if (kb0Var != null) {
                    kb0Var.a(false);
                    break;
                }
                break;
            case 15:
                zn znVar4 = this.b;
                znVar4.showDialog(new xl(znVar4, znVar4.getParentActivity(), znVar4));
                break;
            case 16:
                zn znVar5 = this.b;
                znVar5.T7();
                UndoView undoView = znVar5.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 17:
                zn znVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = znVar6.f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    znVar6.ha(0);
                    break;
                }
                break;
            case 18:
                this.b.j9(true);
                break;
        }
    }

    @Override // wh.c
    public void g(boolean z10, boolean z11) {
        zn znVar = this.b;
        znVar.M0.i(znVar.fa.c(), z10, z11);
    }

    @Override // jh.a
    public void h(int i10) {
        zn znVar = this.b;
        if (i10 == 1) {
            znVar.Z9();
            return;
        }
        if (i10 == 2) {
            znVar.M9();
            return;
        }
        if (i10 == 3) {
            znVar.D4 = true;
            znVar.getMessagesController().getNextReactionMention(znVar.T5, znVar.d(), znVar.l1, new mg(znVar, 0));
            return;
        }
        if (i10 == 4) {
            znVar.D4 = true;
            znVar.getMessagesController().getNextPollVotesMention(znVar.T5, znVar.d(), znVar.m1, new mg(znVar, 1));
            return;
        }
        if (i10 == 6) {
            znVar.d9(true);
            return;
        }
        if (i10 == 5) {
            znVar.d9(false);
        } else if (i10 == 0) {
            ai.h4 h4Var = znVar.J1;
            if (h4Var != null) {
                h4Var.L1(null, 0);
            }
            znVar.ca();
        }
    }

    @Override // org.telegram.ui.x60
    public void j(int i10, ArrayList arrayList) {
        zn znVar = this.b;
        znVar.getMessagesController().addUsersToChat(znVar.e, znVar, arrayList, i10, null, null, null);
        znVar.getMessagesController().hidePeerSettingsBar(znVar.T5, znVar.f, znVar.e);
        znVar.Uc(true);
        znVar.sc(true);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) obj;
        zn znVar = this.b;
        xn xnVar = znVar.ea;
        xnVar.i(c4Var, xnVar.h, znVar.P5 != 0, null, false);
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

    @Override // org.telegram.ui.x60
    public /* synthetic */ void i(TLRPC.User user) {
    }
}
