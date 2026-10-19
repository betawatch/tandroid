package org.telegram.ui;

import android.os.Bundle;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yb0(Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nc0 nc0Var = (nc0) this.c;
                TLObject tLObject = (TLObject) this.d;
                long j10 = this.b;
                if (nc0Var.I == null) {
                    return;
                }
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                int i10 = 0;
                while (i10 < messages_messages.messages.size()) {
                    if (!(messages_messages.messages.get(i10).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                        messages_messages.messages.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                nc0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                nc0Var.getMessagesController().putUsers(messages_messages.users, false);
                nc0Var.getMessagesController().putChats(messages_messages.chats, false);
                nc0Var.getLocationController().locationsCache.k(messages_messages.messages, j10);
                nc0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j10));
                nc0Var.h0(messages_messages.messages);
                nc0Var.getLocationController().markLiveLoactionsAsRead(nc0Var.e0);
                if (nc0Var.J0 == null) {
                    vb0 vb0Var = new vb0(nc0Var, 4);
                    nc0Var.J0 = vb0Var;
                    AndroidUtilities.runOnUIThread(vb0Var, 5000L);
                    return;
                }
                return;
            case 1:
                qv0 qv0Var = (qv0) this.c;
                long j11 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                qv0Var.getClass();
                Bundle bundle = new Bundle();
                if (j11 > 0) {
                    bundle.putLong("user_id", j11);
                } else {
                    bundle.putLong("chat_id", -j11);
                }
                n2Var.presentFragment(new ProfileActivity(bundle, null));
                qv0Var.c(false);
                return;
            case 2:
                qi.e eVar = (qi.e) this.c;
                qi.d dVar = (qi.d) this.d;
                long j12 = this.b;
                if (((qi.d) eVar.b) != dVar) {
                    return;
                }
                qi.b bVar = (qi.b) eVar.d;
                if (bVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    eVar.d = null;
                }
                synchronized (qi.i.y) {
                    try {
                        qi.i iVar = qi.i.A;
                        if (iVar != null) {
                            iVar.o();
                            qi.i.A = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                eVar.b = null;
                dVar.c.run(j12);
                eVar.D();
                return;
            case 3:
                ri.p pVar = (ri.p) this.c;
                long j13 = this.b;
                File file = (File) this.d;
                if (pVar.m != ri.n.f) {
                    return;
                }
                pVar.p = j13;
                pVar.r = 0L;
                pVar.s = ri.p.q(j13);
                pVar.d();
                pVar.t(file);
                return;
            case 4:
                cc.e eVar2 = (cc.e) this.c;
                long j14 = this.b;
                Exception exc = (Exception) this.d;
                ri.p pVar2 = (ri.p) eVar2.c;
                if (j14 != pVar2.o) {
                    return;
                }
                pVar2.n = null;
                pVar2.g(exc);
                return;
            default:
                yh.o1 o1Var = (yh.o1) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                long j15 = this.b;
                o1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                o1Var.dismiss();
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", j15);
                bundle2.putBoolean("open_gifts", true);
                U.presentFragment(new ProfileActivity(bundle2, null));
                return;
        }
    }

    public /* synthetic */ yb0(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }
}
