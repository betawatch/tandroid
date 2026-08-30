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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class te implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.eo, MessagesStorage.BooleanCallback, org.telegram.ui.Components.vj0, ResultCallback, jh.d, wg.a, wg.b, t60, ms, org.telegram.ui.Components.kl0, wg.d, org.telegram.ui.Components.yk0, FlagSecureReason.FlagSecureCondition, su0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ te(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // org.telegram.ui.ms
    public void a() {
        xn xnVar = this.b;
        if (xnVar.v3 != null || xnVar.getParentActivity() == null) {
            return;
        }
        xnVar.Q7();
        xnVar.v3.m(xnVar.Q5, xnVar.f, 8);
    }

    @Override // org.telegram.ui.Components.eo
    public void b(TLRPC.Document document) {
        switch (this.a) {
            case 2:
                xn.u0(this.b, document);
                break;
            default:
                xn.v0(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.su0
    public void c(float[] fArr) {
        xn xnVar = this.b;
        fArr[1] = xnVar.u0.getBottom() - xnVar.xa;
        fArr[0] = (xnVar.u0.getTop() + xnVar.p9) - AndroidUtilities.dp(4.0f);
    }

    @Override // org.telegram.ui.Components.yk0
    public void d() {
        xn xnVar = this.b;
        xnVar.q9(1);
        xnVar.r9();
    }

    @Override // org.telegram.ui.Components.vj0
    public void e(ArrayList arrayList) {
        switch (this.a) {
            case 9:
                xn xnVar = this.b;
                if (xnVar.getParentActivity() != null && xnVar.getParentActivity() != null) {
                    fi fiVar = new fi(xnVar, xnVar, xnVar.getParentActivity(), xnVar.ba, arrayList);
                    fiVar.setCalcMandatoryInsets(xnVar.x9());
                    fiVar.setDimBehind(false);
                    xnVar.A7(false);
                    xnVar.showDialog(fiVar);
                    break;
                }
                break;
            default:
                xn xnVar2 = this.b;
                if (xnVar2.getParentActivity() != null && xnVar2.getParentActivity() != null) {
                    cj cjVar = new cj(xnVar2, xnVar2, xnVar2.getParentActivity(), xnVar2.ba, arrayList);
                    cjVar.setCalcMandatoryInsets(xnVar2.x9());
                    cjVar.setDimBehind(false);
                    xnVar2.A7(false);
                    xnVar2.showDialog(cjVar);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        xn xnVar = this.b;
        boolean z4 = false;
        if (xnVar.getParentActivity() != null) {
            tf.u0 adapter = xnVar.F1.getAdapter();
            if ((adapter.F != null || adapter.G != null) && i10 != 0) {
                tf.u0 adapter2 = xnVar.F1.getAdapter();
                if (adapter2.t0 != null && !adapter2.e0) {
                    return false;
                }
                Object J = xnVar.F1.getAdapter().J(i10 - 1);
                if (J instanceof tf.r0) {
                    tf.r0 r0Var = (tf.r0) J;
                    if (xnVar.F1.getAdapter().G != null && org.telegram.ui.Components.j51.h) {
                        xnVar.V.setFieldText("");
                        jk jkVar = xnVar.V;
                        String str = r0Var.a;
                        TLRPC.Chat chat = xnVar.e;
                        if (chat != null && chat.megagroup) {
                            z4 = true;
                        }
                        jkVar.a1(null, str, true, z4);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (xnVar.F1.getAdapter().G == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.ba);
                        alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.Q = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new te(xnVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        xnVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.j51.h) {
                        xnVar.V.setFieldText("");
                        jk jkVar2 = xnVar.V;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = xnVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z4 = true;
                        }
                        jkVar2.a1(null, str2, true, z4);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // jh.d
    public void g(boolean z4, boolean z10) {
        xn xnVar = this.b;
        xnVar.J0.i(xnVar.ca.c(), z4, z10);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                qk qkVar = this.b.y0;
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
                MessageObject messageObject = (MessageObject) xnVar.G4.get(Integer.valueOf(xnVar.I4));
                if (messageObject == null) {
                    messageObject = (MessageObject) xnVar.l6[0].get(xnVar.I4);
                }
                xnVar.cc(messageObject);
                break;
            case 4:
                xn xnVar2 = this.b;
                MessagePreviewParams messagePreviewParams = xnVar2.c5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, xnVar2.Q5);
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
                tf.u0 adapter = this.b.F1.getAdapter();
                adapter.w.c();
                adapter.F.clear();
                adapter.l();
                org.telegram.ui.Components.ka0 ka0Var = adapter.S;
                if (ka0Var != null) {
                    ka0Var.a(false);
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
                UndoView undoView = xnVar5.v3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 15:
                xn xnVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = xnVar6.c5;
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

    @Override // org.telegram.ui.t60
    public void j(int i10, ArrayList arrayList) {
        xn xnVar = this.b;
        xnVar.getMessagesController().addUsersToChat(xnVar.e, xnVar, arrayList, i10, null, null, null);
        xnVar.getMessagesController().hidePeerSettingsBar(xnVar.Q5, xnVar.f, xnVar.e);
        xnVar.Qc(true);
        xnVar.oc(true);
    }

    @Override // wg.a
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
            xnVar.A4 = true;
            xnVar.getMessagesController().getNextReactionMention(xnVar.Q5, xnVar.b(), xnVar.i1, new jg(xnVar, 0));
            return;
        }
        if (i10 == 4) {
            xnVar.A4 = true;
            xnVar.getMessagesController().getNextPollVotesMention(xnVar.Q5, xnVar.b(), xnVar.j1, new jg(xnVar, 1));
            return;
        }
        if (i10 == 6) {
            xnVar.Y8(true);
            return;
        }
        if (i10 == 5) {
            xnVar.Y8(false);
        } else if (i10 == 0) {
            nh.t2 t2Var = xnVar.G1;
            if (t2Var != null) {
                t2Var.I1(null, 0);
            }
            xnVar.X9();
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) obj;
        xn xnVar = this.b;
        vn vnVar = xnVar.ba;
        vnVar.i(e4Var, vnVar.h, xnVar.M5 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z4) {
        xn xnVar = this.b;
        NotificationCenter notificationCenter = xnVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(xnVar, i10);
        xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        xnVar.finishFragment();
        xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(xnVar.Q5), xnVar.f, xnVar.e, Boolean.valueOf(z4));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        xn xnVar = this.b;
        return xnVar.h != null || xnVar.y9();
    }

    @Override // org.telegram.ui.t60
    public /* synthetic */ void h(TLRPC.User user) {
    }
}
