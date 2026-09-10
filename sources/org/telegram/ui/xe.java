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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.no, MessagesStorage.BooleanCallback, org.telegram.ui.Components.wj0, ResultCallback, vh.d, ih.a, ih.b, z60, ss, org.telegram.ui.Components.ll0, ih.d, org.telegram.ui.Components.xk0, FlagSecureReason.FlagSecureCondition, ov0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ xe(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // org.telegram.ui.Components.xk0
    public void a() {
        eo eoVar = this.b;
        eoVar.q9(1);
        eoVar.r9();
    }

    @Override // org.telegram.ui.ss
    public void b() {
        eo eoVar = this.b;
        if (eoVar.y3 != null || eoVar.getParentActivity() == null) {
            return;
        }
        eoVar.Q7();
        eoVar.y3.m(eoVar.T5, eoVar.f, 8);
    }

    @Override // org.telegram.ui.Components.no
    public void c(TLRPC.Document document) {
        switch (this.a) {
            case 2:
                eo.t0(this.b, document);
                break;
            default:
                eo.u0(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        eo eoVar = this.b;
        boolean z10 = false;
        if (eoVar.getParentActivity() != null) {
            fg.l1 adapter = eoVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                fg.l1 adapter2 = eoVar.I1.getAdapter();
                if (adapter2.w0 != null && !adapter2.h0) {
                    return false;
                }
                Object J = eoVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof fg.i1) {
                    fg.i1 i1Var = (fg.i1) J;
                    if (eoVar.I1.getAdapter().J != null && org.telegram.ui.Components.w51.h) {
                        eoVar.Y.setFieldText("");
                        ok okVar = eoVar.Y;
                        String str = i1Var.a;
                        TLRPC.Chat chat = eoVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        okVar.a1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (eoVar.I1.getAdapter().J == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.ea);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new xe(eoVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        eoVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.w51.h) {
                        eoVar.Y.setFieldText("");
                        ok okVar2 = eoVar.Y;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = eoVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        okVar2.a1(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.wj0
    public void e(ArrayList arrayList) {
        switch (this.a) {
            case 9:
                eo eoVar = this.b;
                if (eoVar.getParentActivity() != null && eoVar.getParentActivity() != null) {
                    li liVar = new li(eoVar, eoVar, eoVar.getParentActivity(), eoVar.ea, arrayList);
                    liVar.setCalcMandatoryInsets(eoVar.x9());
                    liVar.setDimBehind(false);
                    eoVar.A7(false);
                    eoVar.showDialog(liVar);
                    break;
                }
                break;
            default:
                eo eoVar2 = this.b;
                if (eoVar2.getParentActivity() != null && eoVar2.getParentActivity() != null) {
                    ij ijVar = new ij(eoVar2, eoVar2, eoVar2.getParentActivity(), eoVar2.ea, arrayList);
                    ijVar.setCalcMandatoryInsets(eoVar2.x9());
                    ijVar.setDimBehind(false);
                    eoVar2.A7(false);
                    eoVar2.showDialog(ijVar);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                vk vkVar = this.b.B0;
                if (vkVar != null) {
                    vkVar.callOnClick();
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
                eo eoVar = this.b;
                MessageObject messageObject = (MessageObject) eoVar.J4.get(Integer.valueOf(eoVar.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) eoVar.o6[0].get(eoVar.L4);
                }
                eoVar.cc(messageObject);
                break;
            case 4:
                eo eoVar2 = this.b;
                MessagePreviewParams messagePreviewParams = eoVar2.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, eoVar2.T5);
                }
                eoVar2.j8();
                break;
            case 5:
                this.b.ca(1);
                break;
            case 6:
                eo eoVar3 = this.b;
                eoVar3.getMessagesController().unblockPeer(eoVar3.f.id);
                break;
            case 8:
                this.b.finishFragment();
                break;
            case 10:
                fg.l1 adapter = this.b.I1.getAdapter();
                adapter.w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.sa0 sa0Var = adapter.V;
                if (sa0Var != null) {
                    sa0Var.a(false);
                    break;
                }
                break;
            case 12:
                eo eoVar4 = this.b;
                eoVar4.showDialog(new zl(eoVar4, eoVar4.getParentActivity(), eoVar4));
                break;
            case 13:
                eo eoVar5 = this.b;
                eoVar5.Q7();
                UndoView undoView = eoVar5.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 15:
                eo eoVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = eoVar6.f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    eoVar6.ca(0);
                    break;
                }
                break;
            case 16:
                this.b.e9(true);
                break;
        }
    }

    @Override // vh.d
    public void g(boolean z10, boolean z11) {
        eo eoVar = this.b;
        eoVar.M0.i(eoVar.fa.c(), z10, z11);
    }

    @Override // org.telegram.ui.ov0
    public void h(float[] fArr) {
        eo eoVar = this.b;
        fArr[1] = eoVar.x0.getBottom() - eoVar.Aa;
        fArr[0] = (eoVar.x0.getTop() + eoVar.s9) - AndroidUtilities.dp(4.0f);
    }

    @Override // ih.a
    public void i(int i10) {
        eo eoVar = this.b;
        if (i10 == 1) {
            eoVar.U9();
            return;
        }
        if (i10 == 2) {
            eoVar.H9();
            return;
        }
        if (i10 == 3) {
            eoVar.D4 = true;
            eoVar.getMessagesController().getNextReactionMention(eoVar.T5, eoVar.d(), eoVar.l1, new rg(eoVar, 0));
            return;
        }
        if (i10 == 4) {
            eoVar.D4 = true;
            eoVar.getMessagesController().getNextPollVotesMention(eoVar.T5, eoVar.d(), eoVar.m1, new rg(eoVar, 1));
            return;
        }
        if (i10 == 6) {
            eoVar.Y8(true);
            return;
        }
        if (i10 == 5) {
            eoVar.Y8(false);
        } else if (i10 == 0) {
            gg.m mVar = eoVar.J1;
            if (mVar != null) {
                mVar.I1(null, 0);
            }
            eoVar.X9();
        }
    }

    @Override // org.telegram.ui.z60
    public void k(int i10, ArrayList arrayList) {
        eo eoVar = this.b;
        eoVar.getMessagesController().addUsersToChat(eoVar.e, eoVar, arrayList, i10, null, null, null);
        eoVar.getMessagesController().hidePeerSettingsBar(eoVar.T5, eoVar.f, eoVar.e);
        eoVar.Qc(true);
        eoVar.oc(true);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) obj;
        eo eoVar = this.b;
        bo boVar = eoVar.ea;
        boVar.i(f4Var, boVar.h, eoVar.P5 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.o.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        eo eoVar = this.b;
        NotificationCenter notificationCenter = eoVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(eoVar, i10);
        eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        eoVar.finishFragment();
        eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(eoVar.T5), eoVar.f, eoVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.o.b(this, tL_error);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        eo eoVar = this.b;
        return eoVar.h != null || eoVar.y9();
    }

    @Override // org.telegram.ui.z60
    public /* synthetic */ void j(TLRPC.User user) {
    }
}
