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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements org.telegram.ui.Components.g60, org.telegram.ui.Components.j60, org.telegram.ui.ActionBar.a2, MessagesStorage.BooleanCallback, org.telegram.ui.Components.lo, org.telegram.ui.Components.zj0, ResultCallback, li.i, wh.c, jh.a, jh.b, org.telegram.ui.Components.ol0, y60, ps, jh.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ re(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // org.telegram.ui.ps
    public void a() {
        yn ynVar = this.b;
        if (ynVar.w3 != null || ynVar.getParentActivity() == null) {
            return;
        }
        ynVar.Q7();
        ynVar.w3.m(ynVar.R5, ynVar.f, 8);
    }

    @Override // org.telegram.ui.Components.lo
    public void b(TLRPC.Document document) {
        switch (this.a) {
            case 6:
                yn.u0(this.b, document);
                break;
            default:
                yn.v0(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        yn ynVar = this.b;
        boolean z10 = false;
        if (ynVar.getParentActivity() != null) {
            gg.k1 adapter = ynVar.G1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                gg.k1 adapter2 = ynVar.G1.getAdapter();
                if (adapter2.w0 != null && !adapter2.h0) {
                    return false;
                }
                Object J = ynVar.G1.getAdapter().J(i10 - 1);
                if (J instanceof gg.h1) {
                    gg.h1 h1Var = (gg.h1) J;
                    if (ynVar.G1.getAdapter().J != null && org.telegram.ui.Components.h61.h) {
                        ynVar.W.setFieldText("");
                        jk jkVar = ynVar.W;
                        String str = h1Var.a;
                        TLRPC.Chat chat = ynVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        jkVar.Z0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (ynVar.G1.getAdapter().J == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.ca);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new re(ynVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        ynVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.h61.h) {
                        ynVar.W.setFieldText("");
                        jk jkVar2 = ynVar.W;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = ynVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        jkVar2.Z0(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // wh.c
    public void e(boolean z10, boolean z11) {
        yn ynVar = this.b;
        ynVar.K0.i(ynVar.da.c(), z10, z11);
    }

    @Override // org.telegram.ui.Components.zj0
    public void f(ArrayList arrayList) {
        switch (this.a) {
            case 12:
                yn ynVar = this.b;
                if (ynVar.getParentActivity() != null && ynVar.getParentActivity() != null) {
                    hi hiVar = new hi(ynVar, ynVar, ynVar.getParentActivity(), ynVar.ca, arrayList);
                    hiVar.setCalcMandatoryInsets(ynVar.w9());
                    hiVar.setDimBehind(false);
                    ynVar.A7(false);
                    ynVar.showDialog(hiVar);
                    break;
                }
                break;
            default:
                yn ynVar2 = this.b;
                if (ynVar2.getParentActivity() != null && ynVar2.getParentActivity() != null) {
                    ej ejVar = new ej(ynVar2, ynVar2, ynVar2.getParentActivity(), ynVar2.ca, arrayList);
                    ejVar.setCalcMandatoryInsets(ynVar2.w9());
                    ejVar.setDimBehind(false);
                    ynVar2.A7(false);
                    ynVar2.showDialog(ejVar);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                qk qkVar = this.b.z0;
                if (qkVar != null) {
                    qkVar.callOnClick();
                    break;
                }
                break;
            case 3:
                this.b.finishFragment();
                break;
            case 4:
                yn ynVar = this.b;
                ynVar.getMessagesController().unblockPeer(ynVar.f.id);
                break;
            case 5:
            case 6:
            case 7:
            case 12:
            case 13:
            case 16:
            case 17:
            case 18:
            default:
                yn ynVar2 = this.b;
                MessageObject messageObject = (MessageObject) ynVar2.H4.get(Integer.valueOf(ynVar2.J4));
                if (messageObject == null) {
                    messageObject = (MessageObject) ynVar2.m6[0].get(ynVar2.J4);
                }
                ynVar2.bc(messageObject);
                break;
            case 8:
                yn ynVar3 = this.b;
                MessagePreviewParams messagePreviewParams = ynVar3.d5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, ynVar3.R5);
                }
                ynVar3.j8();
                break;
            case 9:
                this.b.ba(1);
                break;
            case 10:
                gg.k1 adapter = this.b.G1.getAdapter();
                adapter.w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.wa0 wa0Var = adapter.V;
                if (wa0Var != null) {
                    wa0Var.a(false);
                    break;
                }
                break;
            case 11:
                this.b.finishFragment();
                break;
            case 14:
                yn ynVar4 = this.b;
                ynVar4.showDialog(new tl(ynVar4, ynVar4.getParentActivity(), ynVar4));
                break;
            case 15:
                yn ynVar5 = this.b;
                ynVar5.Q7();
                UndoView undoView = ynVar5.w3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 19:
                yn ynVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = ynVar6.d5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    ynVar6.ba(0);
                    break;
                }
                break;
            case 20:
                this.b.f9(true);
                break;
        }
    }

    @Override // jh.a
    public void h(int i10) {
        yn ynVar = this.b;
        if (i10 == 1) {
            ynVar.T9();
            return;
        }
        if (i10 == 2) {
            ynVar.G9();
            return;
        }
        if (i10 == 3) {
            ynVar.B4 = true;
            ynVar.getMessagesController().getNextReactionMention(ynVar.R5, ynVar.d(), ynVar.j1, new og(ynVar, 0));
            return;
        }
        if (i10 == 4) {
            ynVar.B4 = true;
            ynVar.getMessagesController().getNextPollVotesMention(ynVar.R5, ynVar.d(), ynVar.k1, new og(ynVar, 1));
            return;
        }
        if (i10 == 6) {
            ynVar.Z8(true);
            return;
        }
        if (i10 == 5) {
            ynVar.Z8(false);
        } else if (i10 == 0) {
            ai.g4 g4Var = ynVar.H1;
            if (g4Var != null) {
                g4Var.F1(null, 0);
            }
            ynVar.W9();
        }
    }

    @Override // org.telegram.ui.y60
    public void i(int i10, ArrayList arrayList) {
        yn ynVar = this.b;
        ynVar.getMessagesController().addUsersToChat(ynVar.e, ynVar, arrayList, i10, null, null, null);
        ynVar.getMessagesController().hidePeerSettingsBar(ynVar.R5, ynVar.f, ynVar.e);
        ynVar.Pc(true);
        ynVar.nc(true);
    }

    @Override // li.i
    public void k(int i10) {
        yn.T0(this.b, i10);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) obj;
        yn ynVar = this.b;
        wn wnVar = ynVar.ca;
        wnVar.i(c4Var, wnVar.h, ynVar.N5 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        yn ynVar = this.b;
        NotificationCenter notificationCenter = ynVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(ynVar, i10);
        ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        ynVar.finishFragment();
        ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(ynVar.R5), ynVar.f, ynVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override // org.telegram.ui.y60
    public /* synthetic */ void c(TLRPC.User user) {
    }
}
