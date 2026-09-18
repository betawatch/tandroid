package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xd1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.a;
        pn pnVar = null;
        boolean z10 = false;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                ae1 ae1Var = (ae1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ae1Var.y = 0;
                String str2 = ae1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error == null || (!"THEME_SLUG_INVALID".equals(tL_error.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        ae1Var.a0(org.telegram.ui.ActionBar.j6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        break;
                    } else {
                        ae1Var.a0(org.telegram.ui.ActionBar.j6.p7, LocaleController.getString(R.string.SetUrlInUse));
                        break;
                    }
                }
                break;
            case 1:
                ae1.W((ae1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                break;
            case 2:
                ke1 ke1Var = (ke1) obj3;
                zn znVar = (zn) obj2;
                MessageObject messageObject = ke1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    pnVar = new pn();
                    pnVar.a = messageObject;
                    pnVar.b = -1;
                    pnVar.c = -1;
                    pnVar.g = true;
                    pnVar.d = i12;
                    pnVar.e();
                }
                znVar.Cb(messageObject, pnVar);
                ke1Var.c(false);
                break;
            case 3:
                se1 se1Var = (se1) obj3;
                ArrayList arrayList = se1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = se1Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                se1Var.d.l();
                if (se1Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    se1Var.y = ofFloat;
                    ofFloat.addUpdateListener(new i21(se1Var, 14));
                    se1Var.y.setDuration(100L);
                    se1Var.y.start();
                } else {
                    se1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(se1Var.I);
                if (se1Var.F.getVisibility() == 0) {
                    se1Var.F.animate().alpha(0.0f).setListener(new oe1(se1Var, 2)).start();
                    break;
                }
                break;
            case 4:
                dg1 dg1Var = (dg1) obj3;
                dg1Var.s.deleteTopics(dg1Var.a, (ArrayList) obj2);
                ((Runnable) obj).run();
                break;
            case 5:
                zf1 zf1Var = (zf1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = zf1Var.e0;
                if (str3.equals(zf1Var.c0)) {
                    int i13 = zf1Var.l0;
                    zf1Var.q0 = false;
                    zf1Var.m0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i14);
                            i10 = ((org.telegram.ui.ActionBar.n2) zf1Var.u0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, message2, false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        zf1Var.M();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        zf1Var.n0 = z10;
                    } else {
                        zf1Var.n0 = false;
                    }
                    if (zf1Var.l0 == 0) {
                        zf1Var.o0.e(zf1Var.m0, true);
                    }
                    zf1Var.p0.b(i13);
                    break;
                }
                break;
            default:
                uh1 uh1Var = (uh1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                gg.c2 c2Var = uh1Var.f;
                if (uh1Var.n) {
                    uh1Var.h = null;
                    uh1Var.d = arrayList4;
                    uh1Var.e = arrayList5;
                    c2Var.f(arrayList4, null);
                    if (uh1Var.n && !c2Var.e()) {
                        uh1Var.v.f.e(false, true);
                    }
                    uh1Var.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ xd1(ae1 ae1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.a = 1;
        this.b = ae1Var;
        this.c = tL_error;
        this.d = updatetheme;
    }
}
