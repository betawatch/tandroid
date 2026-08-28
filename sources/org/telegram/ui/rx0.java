package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rx0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity.W((ProfileActivity) this.b, (TLObject) this.c, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.e, (TLRPC.TL_error) this.f);
                break;
            case 1:
                f01 f01Var = (f01) this.b;
                String str = (String) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                org.telegram.ui.ActionBar.o2 o2Var = f01Var.e;
                if (str.equals(f01Var.y)) {
                    if (!f01Var.w && (o2Var instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) o2Var).L.b.getImageReceiver().startAnimation();
                            ((ProfileActivity) o2Var).L.d.setText(LocaleController.getString(R.string.SettingsNoResults));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    f01Var.w = true;
                    f01Var.r = arrayList;
                    f01Var.s = arrayList2;
                    f01Var.n = arrayList3;
                    f01Var.l();
                    if (o2Var instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) o2Var).L.b.getImageReceiver().startAnimation();
                            break;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return;
                        }
                    }
                }
                break;
            case 2:
                b61 b61Var = (b61) this.b;
                View view = (View) this.c;
                org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) this.d;
                TLRPC.Document document = (TLRPC.Document) this.e;
                k51 k51Var = (k51) this.f;
                b61Var.getClass();
                b61Var.p(view, Long.valueOf(t5Var.documentId), document, k51Var.v, null);
                break;
            case 3:
                l61 l61Var = (l61) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLObject tLObject = (TLObject) this.c;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                l61Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.l0(password);
                    l61Var.S(user, twoStepVerificationActivity.k0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 4:
                pf.r1 r1Var = (pf.r1) this.b;
                ArrayList<TLRPC.User> arrayList4 = (ArrayList) this.c;
                ArrayList<TLRPC.Chat> arrayList5 = (ArrayList) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                Runnable runnable = (Runnable) this.f;
                r1Var.e = false;
                int i9 = r1Var.a;
                MessagesController.getInstance(i9).putUsers(arrayList4, true);
                MessagesController.getInstance(i9).putChats(arrayList5, true);
                ArrayList arrayList7 = r1Var.b;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (runnable != null) {
                    runnable.run();
                } else {
                    r1Var.i(null, false);
                }
                NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            case 5:
                pf.r1 r1Var2 = (pf.r1) this.b;
                ArrayList<TLRPC.User> arrayList8 = (ArrayList) this.c;
                ArrayList<TLRPC.Chat> arrayList9 = (ArrayList) this.d;
                pf.q1 q1Var = (pf.q1) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                int i10 = r1Var2.a;
                MessagesController.getInstance(i10).putUsers(arrayList8, true);
                MessagesController.getInstance(i10).putChats(arrayList9, true);
                q1Var.e = messageObject;
                if (messageObject != null) {
                    messageObject.applyQuickReply(q1Var.b, q1Var.a);
                }
                r1Var2.l();
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            default:
                pf.r1 r1Var3 = (pf.r1) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList<Integer> arrayList10 = (ArrayList) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f;
                r1Var3.getClass();
                if (tLObject2 instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList11 = ((TLRPC.TL_messages_messages) tLObject2).messages;
                    arrayList10.clear();
                    int size = arrayList11.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Message message = arrayList11.get(i11);
                        i11++;
                        arrayList10.add(Integer.valueOf(message.id));
                    }
                    tL_messages_sendQuickReplyMessages.id = arrayList10;
                    for (int i12 = 0; i12 < arrayList10.size(); i12++) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                    }
                    ConnectionsManager.getInstance(r1Var3.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    break;
                } else {
                    FileLog.e("received " + tLObject2 + " " + tL_error2 + " on getQuickReplyMessages when trying to send quick reply");
                    break;
                }
        }
    }

    public /* synthetic */ rx0(l61 l61Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.User user) {
        this.a = 3;
        this.b = l61Var;
        this.f = tL_error;
        this.c = tLObject;
        this.d = twoStepVerificationActivity;
        this.e = user;
    }
}
