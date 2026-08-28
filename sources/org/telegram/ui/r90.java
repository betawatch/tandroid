package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r90(Object obj, long j10, Object obj2, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        Object obj = this.d;
        long j10 = this.b;
        Object obj2 = this.c;
        switch (i9) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new jq(launchActivity, MessagesStorage.getInstance(launchActivity.K).getUser(j10), (k90) obj, 13));
                break;
            case 1:
                pc0 pc0Var = (pc0) obj2;
                TLObject tLObject = (TLObject) obj;
                if (pc0Var.E != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i10 = 0;
                    while (i10 < messages_messages.messages.size()) {
                        if (!(messages_messages.messages.get(i10).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                            messages_messages.messages.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                    pc0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    pc0Var.getMessagesController().putUsers(messages_messages.users, false);
                    pc0Var.getMessagesController().putChats(messages_messages.chats, false);
                    pc0Var.getLocationController().locationsCache.k(messages_messages.messages, j10);
                    pc0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j10));
                    pc0Var.h0(messages_messages.messages);
                    pc0Var.getLocationController().markLiveLoactionsAsRead(pc0Var.a0);
                    if (pc0Var.F0 == null) {
                        xb0 xb0Var = new xb0(pc0Var, 4);
                        pc0Var.F0 = xb0Var;
                        AndroidUtilities.runOnUIThread(xb0Var, 5000L);
                        break;
                    }
                }
                break;
            default:
                iv0 iv0Var = (iv0) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                iv0Var.getClass();
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                o2Var.presentFragment(new ProfileActivity(bundle, null));
                iv0Var.c(false);
                break;
        }
    }

    public /* synthetic */ r90(pc0 pc0Var, TLObject tLObject, long j10) {
        this.a = 1;
        this.c = pc0Var;
        this.d = tLObject;
        this.b = j10;
    }
}
