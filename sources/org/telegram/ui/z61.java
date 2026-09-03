package org.telegram.ui;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z61(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        switch (this.a) {
            case 0:
                i71 i71Var = (i71) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                TLRPC.User user = (TLRPC.User) this.f;
                i71Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.F = password;
                    TwoStepVerificationActivity.m0(password);
                    i71Var.T(user, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 1:
                ph.y7 y7Var = (ph.y7) this.d;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.e;
                TLObject tLObject2 = (TLObject) this.b;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                ph.e8 e8Var = y7Var.T;
                d2Var.dismiss();
                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                    org.telegram.ui.Components.ir[] irVarArr = new org.telegram.ui.Components.ir[1];
                    Context context = y7Var.getContext();
                    i10 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                    org.telegram.ui.Components.ir irVar = new org.telegram.ui.Components.ir(context, i10, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject2, e8Var.I ? null : new ph.s1(5, y7Var, irVarArr), new nh.b());
                    irVarArr[0] = irVar;
                    irVar.show();
                    break;
                } else if (tL_error2 != null) {
                    org.telegram.ui.ActionBar.e3 e3Var = e8Var.container;
                    f6Var = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
                    new org.telegram.ui.Components.qc(e3Var, f6Var).d0(tL_error2, true);
                    break;
                }
                break;
            case 2:
                ph.oa.a((ph.oa) this.d, (ViewGroup) this.c, (org.telegram.ui.ActionBar.f6) this.b, (org.telegram.ui.Components.ba) this.e, (View) this.f);
                break;
            case 3:
                tf.l1 l1Var = (tf.l1) this.d;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                ArrayList arrayList = (ArrayList) this.e;
                LongSparseArray longSparseArray = (LongSparseArray) this.f;
                l1Var.getClass();
                String str = tL_messages_getStickers.emoticon;
                tf.m1 m1Var = l1Var.a;
                if (str.equals(m1Var.O)) {
                    m1Var.L = 0;
                    if (tLObject3 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject3;
                        int size = arrayList.size();
                        int size2 = tL_messages_stickers.stickers.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i11);
                            if (longSparseArray.indexOfKey(document.id) < 0) {
                                arrayList.add(document);
                            }
                        }
                        if (size != arrayList.size()) {
                            m1Var.F.put(arrayList, m1Var.O);
                            if (size == 0) {
                                m1Var.G.add(arrayList);
                            }
                            m1Var.l();
                            break;
                        }
                    }
                }
                break;
            case 4:
                uf.p1 p1Var = (uf.p1) this.d;
                ArrayList<TLRPC.User> arrayList2 = (ArrayList) this.c;
                ArrayList<TLRPC.Chat> arrayList3 = (ArrayList) this.b;
                ArrayList arrayList4 = (ArrayList) this.e;
                Runnable runnable = (Runnable) this.f;
                p1Var.e = false;
                int i12 = p1Var.a;
                MessagesController.getInstance(i12).putUsers(arrayList2, true);
                MessagesController.getInstance(i12).putChats(arrayList3, true);
                ArrayList arrayList5 = p1Var.b;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                if (runnable != null) {
                    runnable.run();
                } else {
                    p1Var.i(null, false);
                }
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            case 5:
                uf.p1 p1Var2 = (uf.p1) this.d;
                ArrayList<TLRPC.User> arrayList6 = (ArrayList) this.c;
                ArrayList<TLRPC.Chat> arrayList7 = (ArrayList) this.b;
                uf.o1 o1Var = (uf.o1) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                int i13 = p1Var2.a;
                MessagesController.getInstance(i13).putUsers(arrayList6, true);
                MessagesController.getInstance(i13).putChats(arrayList7, true);
                o1Var.e = messageObject;
                if (messageObject != null) {
                    messageObject.applyQuickReply(o1Var.b, o1Var.a);
                }
                p1Var2.l();
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            default:
                uf.p1 p1Var3 = (uf.p1) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                ArrayList<Integer> arrayList8 = (ArrayList) this.e;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                p1Var3.getClass();
                if (tLObject4 instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList9 = ((TLRPC.TL_messages_messages) tLObject4).messages;
                    arrayList8.clear();
                    int size3 = arrayList9.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        TLRPC.Message message = arrayList9.get(i14);
                        i14++;
                        arrayList8.add(Integer.valueOf(message.id));
                    }
                    tL_messages_sendQuickReplyMessages.id = arrayList8;
                    for (int i15 = 0; i15 < arrayList8.size(); i15++) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                    }
                    ConnectionsManager.getInstance(p1Var3.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    break;
                } else {
                    FileLog.e("received " + tLObject4 + " " + tL_error3 + " on getQuickReplyMessages when trying to send quick reply");
                    break;
                }
        }
    }

    public /* synthetic */ z61(ph.y7 y7Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TLRPC.TL_error tL_error) {
        this.a = 1;
        this.d = y7Var;
        this.e = d2Var;
        this.b = tLObject;
        this.f = getgroupcallstreamrtmpurl;
        this.c = tL_error;
    }

    public /* synthetic */ z61(uf.p1 p1Var, TLObject tLObject, ArrayList arrayList, TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages, TLRPC.TL_error tL_error) {
        this.a = 6;
        this.d = p1Var;
        this.b = tLObject;
        this.e = arrayList;
        this.f = tL_messages_sendQuickReplyMessages;
        this.c = tL_error;
    }
}
