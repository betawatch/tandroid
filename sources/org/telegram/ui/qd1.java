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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qd1(Object obj, Object obj2, Object obj3, int i10) {
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
        mn mnVar = null;
        boolean z10 = false;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                td1 td1Var = (td1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                td1Var.y = 0;
                String str2 = td1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error == null || (!"THEME_SLUG_INVALID".equals(tL_error.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        td1Var.a0(org.telegram.ui.ActionBar.h6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        break;
                    } else {
                        td1Var.a0(org.telegram.ui.ActionBar.h6.p7, LocaleController.getString(R.string.SetUrlInUse));
                        break;
                    }
                }
                break;
            case 1:
                td1.W((td1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                break;
            case 2:
                de1 de1Var = (de1) obj3;
                wn wnVar = (wn) obj2;
                MessageObject messageObject = de1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    mnVar = new mn();
                    mnVar.a = messageObject;
                    mnVar.b = -1;
                    mnVar.c = -1;
                    mnVar.g = true;
                    mnVar.d = i12;
                    mnVar.e();
                }
                wnVar.Cb(messageObject, mnVar);
                de1Var.c(false);
                break;
            case 3:
                le1 le1Var = (le1) obj3;
                ArrayList arrayList = le1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = le1Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                le1Var.d.l();
                if (le1Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    le1Var.y = ofFloat;
                    ofFloat.addUpdateListener(new q11(le1Var, 15));
                    le1Var.y.setDuration(100L);
                    le1Var.y.start();
                } else {
                    le1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(le1Var.I);
                if (le1Var.F.getVisibility() == 0) {
                    le1Var.F.animate().alpha(0.0f).setListener(new he1(le1Var, 2)).start();
                    break;
                }
                break;
            case 4:
                wf1 wf1Var = (wf1) obj3;
                wf1Var.s.deleteTopics(wf1Var.a, (ArrayList) obj2);
                ((Runnable) obj).run();
                break;
            case 5:
                sf1 sf1Var = (sf1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = sf1Var.d0;
                if (str3.equals(sf1Var.b0)) {
                    int i13 = sf1Var.k0;
                    sf1Var.p0 = false;
                    sf1Var.l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i14);
                            i10 = ((org.telegram.ui.ActionBar.m2) sf1Var.t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, message2, false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        sf1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        sf1Var.m0 = z10;
                    } else {
                        sf1Var.m0 = false;
                    }
                    if (sf1Var.k0 == 0) {
                        sf1Var.n0.e(sf1Var.l0, true);
                    }
                    sf1Var.o0.b(i13);
                    break;
                }
                break;
            default:
                ph1 ph1Var = (ph1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                gg.c2 c2Var = ph1Var.f;
                if (ph1Var.n) {
                    ph1Var.h = null;
                    ph1Var.d = arrayList4;
                    ph1Var.e = arrayList5;
                    c2Var.f(arrayList4, null);
                    if (ph1Var.n && !c2Var.e()) {
                        ph1Var.v.f.e(false, true);
                    }
                    ph1Var.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qd1(td1 td1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.a = 1;
        this.b = td1Var;
        this.c = tL_error;
        this.d = updatetheme;
    }
}
