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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sc1(Object obj, Object obj2, Object obj3, int i10) {
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
        jn jnVar = null;
        boolean z10 = false;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                vc1 vc1Var = (vc1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                vc1Var.y = 0;
                String str2 = vc1Var.A;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error == null || (!"THEME_SLUG_INVALID".equals(tL_error.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        vc1Var.a0(org.telegram.ui.ActionBar.g6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        break;
                    } else {
                        vc1Var.a0(org.telegram.ui.ActionBar.g6.p7, LocaleController.getString(R.string.SetUrlInUse));
                        break;
                    }
                }
                break;
            case 1:
                vc1.W((vc1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                break;
            case 2:
                fd1 fd1Var = (fd1) obj3;
                tn tnVar = (tn) obj2;
                MessageObject messageObject = fd1Var.C;
                int i12 = ((TLRPC.TodoItem) obj).id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    jnVar = new jn();
                    jnVar.a = messageObject;
                    jnVar.b = -1;
                    jnVar.c = -1;
                    jnVar.g = true;
                    jnVar.d = i12;
                    jnVar.e();
                }
                tnVar.Cb(messageObject, jnVar);
                fd1Var.c(false);
                break;
            case 3:
                md1 md1Var = (md1) obj3;
                ArrayList arrayList = md1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = md1Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                md1Var.d.l();
                if (md1Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    md1Var.y = ofFloat;
                    ofFloat.addUpdateListener(new w01(md1Var, 15));
                    md1Var.y.setDuration(100L);
                    md1Var.y.start();
                } else {
                    md1Var.A = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(md1Var.E);
                if (md1Var.B.getVisibility() == 0) {
                    md1Var.B.animate().alpha(0.0f).setListener(new id1(md1Var, 2)).start();
                    break;
                }
                break;
            case 4:
                ze1 ze1Var = (ze1) obj3;
                ze1Var.s.deleteTopics(ze1Var.a, (ArrayList) obj2);
                ((Runnable) obj).run();
                break;
            case 5:
                ve1 ve1Var = (ve1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = ve1Var.W;
                if (str3.equals(ve1Var.U)) {
                    int i13 = ve1Var.g0;
                    ve1Var.l0 = false;
                    ve1Var.h0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i14);
                            i10 = ((org.telegram.ui.ActionBar.o2) ve1Var.p0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, message2, false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        ve1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        ve1Var.i0 = z10;
                    } else {
                        ve1Var.i0 = false;
                    }
                    if (ve1Var.g0 == 0) {
                        ve1Var.j0.e(ve1Var.h0, true);
                    }
                    ve1Var.k0.b(i13);
                    break;
                }
                break;
            default:
                rg1 rg1Var = (rg1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                rf.k1 k1Var = rg1Var.f;
                if (rg1Var.n) {
                    rg1Var.h = null;
                    rg1Var.d = arrayList4;
                    rg1Var.e = arrayList5;
                    k1Var.f(arrayList4, null);
                    if (rg1Var.n && !k1Var.e()) {
                        rg1Var.v.f.e(false, true);
                    }
                    rg1Var.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ sc1(vc1 vc1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.a = 1;
        this.b = vc1Var;
        this.c = tL_error;
        this.d = updatetheme;
    }
}
