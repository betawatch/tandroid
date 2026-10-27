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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements org.telegram.ui.Components.q60, org.telegram.ui.Components.t60, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.uo, MessagesStorage.BooleanCallback, org.telegram.ui.Components.nk0, ResultCallback, oi.m, yh.c, lh.a, lh.b, o60, ks, org.telegram.ui.Components.cm0, lh.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ qe(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // org.telegram.ui.ks
    public void a() {
        wn wnVar = this.b;
        if (wnVar.K3 != null || wnVar.getParentActivity() == null) {
            return;
        }
        wnVar.Z7();
        wnVar.K3.m(wnVar.j6, wnVar.f, 8);
    }

    @Override // org.telegram.ui.Components.uo
    public void b(TLRPC.Document document) {
        switch (this.a) {
            case 4:
                wn.E0(this.b, document);
                break;
            default:
                wn.A1(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        wn wnVar = this.b;
        boolean z10 = false;
        if (wnVar.getParentActivity() != null) {
            ig.j1 adapter = wnVar.U1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                ig.j1 adapter2 = wnVar.U1.getAdapter();
                if (adapter2.w0 != null && !adapter2.h0) {
                    return false;
                }
                Object J = wnVar.U1.getAdapter().J(i10 - 1);
                if (J instanceof ig.g1) {
                    ig.g1 g1Var = (ig.g1) J;
                    if (wnVar.U1.getAdapter().J != null && org.telegram.ui.Components.v61.h) {
                        wnVar.Y.setFieldText("");
                        jk jkVar = wnVar.Y;
                        String str = g1Var.a;
                        TLRPC.Chat chat = wnVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        jkVar.W0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (wnVar.U1.getAdapter().J == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.ua);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new qe(wnVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        wnVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.v61.h) {
                        wnVar.Y.setFieldText("");
                        jk jkVar2 = wnVar.Y;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = wnVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        jkVar2.W0(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // yh.c
    public void d(boolean z10, boolean z11) {
        wn wnVar = this.b;
        wnVar.Y0.i(wnVar.va.b(), z10, z11);
    }

    @Override // org.telegram.ui.o60
    public void f(int i10, ArrayList arrayList) {
        wn wnVar = this.b;
        wnVar.getMessagesController().addUsersToChat(wnVar.e, wnVar, arrayList, i10, null, null, null);
        wnVar.getMessagesController().hidePeerSettingsBar(wnVar.j6, wnVar.f, wnVar.e);
        wnVar.hd(true);
        wnVar.Fc(true);
    }

    @Override // org.telegram.ui.Components.nk0
    public void g(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                wn wnVar = this.b;
                if (wnVar.getParentActivity() != null && wnVar.getParentActivity() != null) {
                    ei eiVar = new ei(wnVar, wnVar, wnVar.getParentActivity(), wnVar.ua, arrayList);
                    eiVar.setCalcMandatoryInsets(wnVar.I9());
                    eiVar.setDimBehind(false);
                    wnVar.J7(false);
                    wnVar.showDialog(eiVar);
                    break;
                }
                break;
            default:
                wn wnVar2 = this.b;
                if (wnVar2.getParentActivity() != null && wnVar2.getParentActivity() != null) {
                    bj bjVar = new bj(wnVar2, wnVar2, wnVar2.getParentActivity(), wnVar2.ua, arrayList);
                    bjVar.setCalcMandatoryInsets(wnVar2.I9());
                    bjVar.setDimBehind(false);
                    wnVar2.J7(false);
                    wnVar2.showDialog(bjVar);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 2:
                pk pkVar = this.b.B0;
                if (pkVar != null) {
                    pkVar.callOnClick();
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
            case 16:
            case 17:
            default:
                wn wnVar = this.b;
                MessageObject messageObject = (MessageObject) wnVar.V4.get(Integer.valueOf(wnVar.X4));
                if (messageObject == null) {
                    messageObject = (MessageObject) wnVar.E6[0].get(wnVar.X4);
                }
                wnVar.tc(messageObject);
                break;
            case 6:
                wn wnVar2 = this.b;
                MessagePreviewParams messagePreviewParams = wnVar2.v5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, wnVar2.j6);
                }
                wnVar2.s8();
                break;
            case 7:
                this.b.pa(1);
                break;
            case 8:
                wn wnVar3 = this.b;
                wnVar3.getMessagesController().unblockPeer(wnVar3.f.id);
                break;
            case 10:
                this.b.finishFragment();
                break;
            case 12:
                ig.j1 adapter = this.b.U1.getAdapter();
                adapter.w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.cb0 cb0Var = adapter.V;
                if (cb0Var != null) {
                    cb0Var.a(false);
                    break;
                }
                break;
            case 14:
                wn wnVar4 = this.b;
                wnVar4.showDialog(new sl(wnVar4, wnVar4.getParentActivity(), wnVar4));
                break;
            case 15:
                wn wnVar5 = this.b;
                wnVar5.Z7();
                UndoView undoView = wnVar5.K3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 18:
                wn wnVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = wnVar6.v5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    wnVar6.pa(0);
                    break;
                }
                break;
            case 19:
                this.b.r9(true);
                break;
        }
    }

    @Override // lh.a
    public void i(int i10) {
        wn wnVar = this.b;
        if (i10 == 1) {
            wnVar.ha();
            return;
        }
        if (i10 == 2) {
            wnVar.U9();
            return;
        }
        if (i10 == 3) {
            wnVar.P4 = true;
            wnVar.getMessagesController().getNextReactionMention(wnVar.j6, wnVar.b(), wnVar.x1, new gg(wnVar, 0));
            return;
        }
        if (i10 == 4) {
            wnVar.P4 = true;
            wnVar.getMessagesController().getNextPollVotesMention(wnVar.j6, wnVar.b(), wnVar.y1, new gg(wnVar, 1));
            return;
        }
        if (i10 == 6) {
            wnVar.l9(true);
            return;
        }
        if (i10 == 5) {
            wnVar.l9(false);
        } else if (i10 == 0) {
            di.a3 a3Var = wnVar.V1;
            if (a3Var != null) {
                a3Var.P1(null, 0);
            }
            wnVar.ka();
        }
    }

    @Override // oi.m
    public void k(int i10) {
        wn.e1(this.b, i10);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.h4 h4Var = (org.telegram.ui.ActionBar.h4) obj;
        wn wnVar = this.b;
        un unVar = wnVar.ua;
        unVar.q(h4Var, unVar.g, wnVar.f6 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        wn wnVar = this.b;
        NotificationCenter notificationCenter = wnVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(wnVar, i10);
        wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        wnVar.finishFragment();
        wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(wnVar.j6), wnVar.f, wnVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.ui.o60
    public /* synthetic */ void e(TLRPC.User user) {
    }
}
