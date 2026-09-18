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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zd1(Object obj, Object obj2, Object obj3, int i10) {
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
                ce1 ce1Var = (ce1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ce1Var.y = 0;
                String str2 = ce1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error == null || (!"THEME_SLUG_INVALID".equals(tL_error.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        ce1Var.a0(org.telegram.ui.ActionBar.j6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        break;
                    } else {
                        ce1Var.a0(org.telegram.ui.ActionBar.j6.p7, LocaleController.getString(R.string.SetUrlInUse));
                        break;
                    }
                }
                break;
            case 1:
                ce1.W((ce1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                break;
            case 2:
                me1 me1Var = (me1) obj3;
                bo boVar = (bo) obj2;
                MessageObject messageObject = me1Var.G;
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
                me1Var.c(false);
                break;
            case 3:
                ue1 ue1Var = (ue1) obj3;
                ArrayList arrayList = ue1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = ue1Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                ue1Var.d.l();
                if (ue1Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ue1Var.y = ofFloat;
                    ofFloat.addUpdateListener(new k21(ue1Var, 14));
                    ue1Var.y.setDuration(100L);
                    ue1Var.y.start();
                } else {
                    ue1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(ue1Var.I);
                if (ue1Var.F.getVisibility() == 0) {
                    ue1Var.F.animate().alpha(0.0f).setListener(new qe1(ue1Var, 2)).start();
                    break;
                }
                break;
            case 4:
                fg1 fg1Var = (fg1) obj3;
                fg1Var.s.deleteTopics(fg1Var.a, (ArrayList) obj2);
                ((Runnable) obj).run();
                break;
            case 5:
                bg1 bg1Var = (bg1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = bg1Var.e0;
                if (str3.equals(bg1Var.c0)) {
                    int i13 = bg1Var.l0;
                    bg1Var.q0 = false;
                    bg1Var.m0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i14);
                            i10 = ((org.telegram.ui.ActionBar.o2) bg1Var.u0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, message2, false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        bg1Var.M();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        bg1Var.n0 = z10;
                    } else {
                        bg1Var.n0 = false;
                    }
                    if (bg1Var.l0 == 0) {
                        bg1Var.o0.e(bg1Var.m0, true);
                    }
                    bg1Var.p0.b(i13);
                    break;
                }
                break;
            default:
                wh1 wh1Var = (wh1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                gg.c2 c2Var = wh1Var.f;
                if (wh1Var.n) {
                    wh1Var.h = null;
                    wh1Var.d = arrayList4;
                    wh1Var.e = arrayList5;
                    c2Var.f(arrayList4, null);
                    if (wh1Var.n && !c2Var.e()) {
                        wh1Var.v.f.e(false, true);
                    }
                    wh1Var.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ zd1(ce1 ce1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.a = 1;
        this.b = ce1Var;
        this.c = tL_error;
        this.d = updatetheme;
    }
}
