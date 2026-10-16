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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe implements org.telegram.ui.Components.q60, org.telegram.ui.Components.t60, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.vo, MessagesStorage.BooleanCallback, org.telegram.ui.Components.nk0, ResultCallback, xh.c, kh.a, kh.b, e70, vs, org.telegram.ui.Components.cm0, kh.d, org.telegram.ui.Components.ol0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ xe(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        fo foVar = this.b;
        boolean z10 = false;
        if (foVar.getParentActivity() != null) {
            hg.j1 adapter = foVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                hg.j1 adapter2 = foVar.I1.getAdapter();
                if (adapter2.w0 != null && !adapter2.h0) {
                    return false;
                }
                Object J = foVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof hg.g1) {
                    hg.g1 g1Var = (hg.g1) J;
                    if (foVar.I1.getAdapter().J != null && org.telegram.ui.Components.n61.h) {
                        foVar.Y.setFieldText("");
                        sk skVar = foVar.Y;
                        String str = g1Var.a;
                        TLRPC.Chat chat = foVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        skVar.X0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (foVar.I1.getAdapter().J == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar.getParentActivity(), 0, foVar.ea);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new xe(foVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        foVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.n61.h) {
                        foVar.Y.setFieldText("");
                        sk skVar2 = foVar.Y;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = foVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        skVar2.X0(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.vs
    public void b() {
        fo foVar = this.b;
        if (foVar.y3 != null || foVar.getParentActivity() == null) {
            return;
        }
        foVar.T7();
        foVar.y3.m(foVar.T5, foVar.f, 8);
    }

    @Override // org.telegram.ui.Components.ol0
    public void c() {
        fo foVar = this.b;
        foVar.v9(1);
        foVar.w9();
    }

    @Override // org.telegram.ui.Components.vo
    public void d(TLRPC.Document document) {
        switch (this.a) {
            case 4:
                fo.j0(this.b, document);
                break;
            default:
                fo.D0(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public void e(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                fo foVar = this.b;
                if (foVar.getParentActivity() != null && foVar.getParentActivity() != null) {
                    ni niVar = new ni(foVar, foVar, foVar.getParentActivity(), foVar.ea, arrayList);
                    niVar.setCalcMandatoryInsets(foVar.C9());
                    niVar.setDimBehind(false);
                    foVar.D7(false);
                    foVar.showDialog(niVar);
                    break;
                }
                break;
            default:
                fo foVar2 = this.b;
                if (foVar2.getParentActivity() != null && foVar2.getParentActivity() != null) {
                    kj kjVar = new kj(foVar2, foVar2, foVar2.getParentActivity(), foVar2.ea, arrayList);
                    kjVar.setCalcMandatoryInsets(foVar2.C9());
                    kjVar.setDimBehind(false);
                    foVar2.D7(false);
                    foVar2.showDialog(kjVar);
                    break;
                }
                break;
        }
    }

    @Override // xh.c
    public void f(boolean z10, boolean z11) {
        fo foVar = this.b;
        foVar.M0.i(foVar.fa.c(), z10, z11);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 2:
                yk ykVar = this.b.B0;
                if (ykVar != null) {
                    ykVar.callOnClick();
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
                fo foVar = this.b;
                MessageObject messageObject = (MessageObject) foVar.J4.get(Integer.valueOf(foVar.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) foVar.o6[0].get(foVar.L4);
                }
                foVar.gc(messageObject);
                break;
            case 6:
                fo foVar2 = this.b;
                MessagePreviewParams messagePreviewParams = foVar2.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, foVar2.T5);
                }
                foVar2.m8();
                break;
            case 7:
                this.b.ha(1);
                break;
            case 8:
                fo foVar3 = this.b;
                foVar3.getMessagesController().unblockPeer(foVar3.f.id);
                break;
            case 10:
                this.b.finishFragment();
                break;
            case 12:
                hg.j1 adapter = this.b.I1.getAdapter();
                adapter.w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.jb0 jb0Var = adapter.V;
                if (jb0Var != null) {
                    jb0Var.a(false);
                    break;
                }
                break;
            case 15:
                fo foVar4 = this.b;
                foVar4.showDialog(new bm(foVar4, foVar4.getParentActivity(), foVar4));
                break;
            case 16:
                fo foVar5 = this.b;
                foVar5.T7();
                UndoView undoView = foVar5.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 17:
                fo foVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = foVar6.f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    foVar6.ha(0);
                    break;
                }
                break;
            case 18:
                this.b.j9(true);
                break;
        }
    }

    @Override // org.telegram.ui.e70
    public void i(int i10, ArrayList arrayList) {
        fo foVar = this.b;
        foVar.getMessagesController().addUsersToChat(foVar.e, foVar, arrayList, i10, null, null, null);
        foVar.getMessagesController().hidePeerSettingsBar(foVar.T5, foVar.f, foVar.e);
        foVar.Uc(true);
        foVar.sc(true);
    }

    @Override // kh.a
    public void j(int i10) {
        fo foVar = this.b;
        if (i10 == 1) {
            foVar.Z9();
            return;
        }
        if (i10 == 2) {
            foVar.M9();
            return;
        }
        if (i10 == 3) {
            foVar.D4 = true;
            foVar.getMessagesController().getNextReactionMention(foVar.T5, foVar.d(), foVar.l1, new rg(foVar, 0));
            return;
        }
        if (i10 == 4) {
            foVar.D4 = true;
            foVar.getMessagesController().getNextPollVotesMention(foVar.T5, foVar.d(), foVar.m1, new rg(foVar, 1));
            return;
        }
        if (i10 == 6) {
            foVar.d9(true);
            return;
        }
        if (i10 == 5) {
            foVar.d9(false);
        } else if (i10 == 0) {
            bi.w3 w3Var = foVar.J1;
            if (w3Var != null) {
                w3Var.L1(null, 0);
            }
            foVar.ca();
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) obj;
        fo foVar = this.b;
        co coVar = foVar.ea;
        coVar.i(b4Var, coVar.h, foVar.P5 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        fo foVar = this.b;
        NotificationCenter notificationCenter = foVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(foVar, i10);
        foVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        foVar.finishFragment();
        foVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(foVar.T5), foVar.f, foVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override // org.telegram.ui.e70
    public /* synthetic */ void h(TLRPC.User user) {
    }
}
