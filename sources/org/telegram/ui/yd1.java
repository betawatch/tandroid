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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yd1(Object obj, Object obj2, Object obj3, int i10) {
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
        rn rnVar = null;
        boolean z10 = false;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                be1 be1Var = (be1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                be1Var.y = 0;
                String str2 = be1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error == null || (!"THEME_SLUG_INVALID".equals(tL_error.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        be1Var.a0(org.telegram.ui.ActionBar.i6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        break;
                    } else {
                        be1Var.a0(org.telegram.ui.ActionBar.i6.p7, LocaleController.getString(R.string.SetUrlInUse));
                        break;
                    }
                }
                break;
            case 1:
                be1.W((be1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                break;
            case 2:
                le1 le1Var = (le1) obj3;
                bo boVar = (bo) obj2;
                MessageObject messageObject = le1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    rnVar = new rn();
                    rnVar.a = messageObject;
                    rnVar.b = -1;
                    rnVar.c = -1;
                    rnVar.g = true;
                    rnVar.d = i12;
                    rnVar.e();
                }
                boVar.Cb(messageObject, rnVar);
                le1Var.c(false);
                break;
            case 3:
                te1 te1Var = (te1) obj3;
                ArrayList arrayList = te1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = te1Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                te1Var.d.l();
                if (te1Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    te1Var.y = ofFloat;
                    ofFloat.addUpdateListener(new a21(te1Var, 15));
                    te1Var.y.setDuration(100L);
                    te1Var.y.start();
                } else {
                    te1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(te1Var.I);
                if (te1Var.F.getVisibility() == 0) {
                    te1Var.F.animate().alpha(0.0f).setListener(new pe1(te1Var, 2)).start();
                    break;
                }
                break;
            case 4:
                eg1 eg1Var = (eg1) obj3;
                eg1Var.s.deleteTopics(eg1Var.a, (ArrayList) obj2);
                ((Runnable) obj).run();
                break;
            case 5:
                ag1 ag1Var = (ag1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = ag1Var.d0;
                if (str3.equals(ag1Var.b0)) {
                    int i13 = ag1Var.k0;
                    ag1Var.p0 = false;
                    ag1Var.l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i14);
                            i10 = ((org.telegram.ui.ActionBar.n2) ag1Var.t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, message2, false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        ag1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        ag1Var.m0 = z10;
                    } else {
                        ag1Var.m0 = false;
                    }
                    if (ag1Var.k0 == 0) {
                        ag1Var.n0.e(ag1Var.l0, true);
                    }
                    ag1Var.o0.b(i13);
                    break;
                }
                break;
            default:
                xh1 xh1Var = (xh1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                gg.c2 c2Var = xh1Var.f;
                if (xh1Var.n) {
                    xh1Var.h = null;
                    xh1Var.d = arrayList4;
                    xh1Var.e = arrayList5;
                    c2Var.f(arrayList4, null);
                    if (xh1Var.n && !c2Var.e()) {
                        xh1Var.v.f.e(false, true);
                    }
                    xh1Var.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ yd1(be1 be1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.a = 1;
        this.b = be1Var;
        this.c = tL_error;
        this.d = updatetheme;
    }
}
