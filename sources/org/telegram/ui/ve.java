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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.co, MessagesStorage.BooleanCallback, org.telegram.ui.Components.vj0, ResultCallback, jh.d, wg.a, wg.b, v60, os, org.telegram.ui.Components.jl0, wg.d, org.telegram.ui.Components.xk0, FlagSecureReason.FlagSecureCondition, zu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ ve(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // org.telegram.ui.os
    public void a() {
        zn znVar = this.b;
        if (znVar.v3 != null || znVar.getParentActivity() == null) {
            return;
        }
        znVar.Q7();
        znVar.v3.m(znVar.Q5, znVar.f, 8);
    }

    @Override // org.telegram.ui.Components.co
    public void b(TLRPC.Document document) {
        switch (this.a) {
            case 2:
                zn.u0(this.b, document);
                break;
            default:
                zn.v0(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.zu0
    public void c(float[] fArr) {
        zn znVar = this.b;
        fArr[1] = znVar.u0.getBottom() - znVar.xa;
        fArr[0] = (znVar.u0.getTop() + znVar.p9) - AndroidUtilities.dp(4.0f);
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        zn znVar = this.b;
        boolean z4 = false;
        if (znVar.getParentActivity() != null) {
            tf.u0 adapter = znVar.F1.getAdapter();
            if ((adapter.F != null || adapter.G != null) && i10 != 0) {
                tf.u0 adapter2 = znVar.F1.getAdapter();
                if (adapter2.t0 != null && !adapter2.e0) {
                    return false;
                }
                Object J = znVar.F1.getAdapter().J(i10 - 1);
                if (J instanceof tf.r0) {
                    tf.r0 r0Var = (tf.r0) J;
                    if (znVar.F1.getAdapter().G != null && org.telegram.ui.Components.j51.h) {
                        znVar.V.setFieldText("");
                        lk lkVar = znVar.V;
                        String str = r0Var.a;
                        TLRPC.Chat chat = znVar.e;
                        if (chat != null && chat.megagroup) {
                            z4 = true;
                        }
                        lkVar.a1(null, str, true, z4);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (znVar.F1.getAdapter().G == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.ba);
                        alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.Q = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ve(znVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        znVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.j51.h) {
                        znVar.V.setFieldText("");
                        lk lkVar2 = znVar.V;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = znVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z4 = true;
                        }
                        lkVar2.a1(null, str2, true, z4);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.xk0
    public void e() {
        zn znVar = this.b;
        znVar.q9(1);
        znVar.r9();
    }

    @Override // org.telegram.ui.Components.vj0
    public void f(ArrayList arrayList) {
        switch (this.a) {
            case 9:
                zn znVar = this.b;
                if (znVar.getParentActivity() != null && znVar.getParentActivity() != null) {
                    hi hiVar = new hi(znVar, znVar, znVar.getParentActivity(), znVar.ba, arrayList);
                    hiVar.setCalcMandatoryInsets(znVar.x9());
                    hiVar.setDimBehind(false);
                    znVar.A7(false);
                    znVar.showDialog(hiVar);
                    break;
                }
                break;
            default:
                zn znVar2 = this.b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    ej ejVar = new ej(znVar2, znVar2, znVar2.getParentActivity(), znVar2.ba, arrayList);
                    ejVar.setCalcMandatoryInsets(znVar2.x9());
                    ejVar.setDimBehind(false);
                    znVar2.A7(false);
                    znVar2.showDialog(ejVar);
                    break;
                }
                break;
        }
    }

    @Override // jh.d
    public void g(boolean z4, boolean z10) {
        zn znVar = this.b;
        znVar.J0.i(znVar.ca.c(), z4, z10);
    }

    @Override // org.telegram.ui.v60
    public void i(int i10, ArrayList arrayList) {
        zn znVar = this.b;
        znVar.getMessagesController().addUsersToChat(znVar.e, znVar, arrayList, i10, null, null, null);
        znVar.getMessagesController().hidePeerSettingsBar(znVar.Q5, znVar.f, znVar.e);
        znVar.Qc(true);
        znVar.oc(true);
    }

    @Override // wg.a
    public void j(int i10) {
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
            znVar.A4 = true;
            znVar.getMessagesController().getNextReactionMention(znVar.Q5, znVar.d(), znVar.i1, new lg(znVar, 0));
            return;
        }
        if (i10 == 4) {
            znVar.A4 = true;
            znVar.getMessagesController().getNextPollVotesMention(znVar.Q5, znVar.d(), znVar.j1, new lg(znVar, 1));
            return;
        }
        if (i10 == 6) {
            znVar.Y8(true);
            return;
        }
        if (i10 == 5) {
            znVar.Y8(false);
        } else if (i10 == 0) {
            nh.t2 t2Var = znVar.G1;
            if (t2Var != null) {
                t2Var.I1(null, 0);
            }
            znVar.X9();
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                sk skVar = this.b.y0;
                if (skVar != null) {
                    skVar.callOnClick();
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
                zn znVar = this.b;
                MessageObject messageObject = (MessageObject) znVar.G4.get(Integer.valueOf(znVar.I4));
                if (messageObject == null) {
                    messageObject = (MessageObject) znVar.l6[0].get(znVar.I4);
                }
                znVar.cc(messageObject);
                break;
            case 4:
                zn znVar2 = this.b;
                MessagePreviewParams messagePreviewParams = znVar2.c5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, znVar2.Q5);
                }
                znVar2.j8();
                break;
            case 5:
                this.b.ca(1);
                break;
            case 6:
                zn znVar3 = this.b;
                znVar3.getMessagesController().unblockPeer(znVar3.f.id);
                break;
            case 8:
                this.b.finishFragment();
                break;
            case 10:
                tf.u0 adapter = this.b.F1.getAdapter();
                adapter.w.c();
                adapter.F.clear();
                adapter.l();
                org.telegram.ui.Components.la0 la0Var = adapter.S;
                if (la0Var != null) {
                    la0Var.a(false);
                    break;
                }
                break;
            case 12:
                zn znVar4 = this.b;
                znVar4.showDialog(new wl(znVar4, znVar4.getParentActivity(), znVar4));
                break;
            case 13:
                zn znVar5 = this.b;
                znVar5.Q7();
                UndoView undoView = znVar5.v3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 15:
                zn znVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = znVar6.c5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    znVar6.ca(0);
                    break;
                }
                break;
            case 16:
                this.b.e9(true);
                break;
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) obj;
        zn znVar = this.b;
        xn xnVar = znVar.ba;
        xnVar.i(e4Var, xnVar.h, znVar.M5 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z4) {
        zn znVar = this.b;
        NotificationCenter notificationCenter = znVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(znVar, i10);
        znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        znVar.finishFragment();
        znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(znVar.Q5), znVar.f, znVar.e, Boolean.valueOf(z4));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        zn znVar = this.b;
        return znVar.h != null || znVar.y9();
    }

    @Override // org.telegram.ui.v60
    public /* synthetic */ void h(TLRPC.User user) {
    }
}
