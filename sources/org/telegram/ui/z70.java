package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z70(Object obj, long j10, Object obj2, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = 0;
        switch (this.a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                long j10 = this.b;
                p70 p70Var = (p70) this.d;
                String str = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new pp(launchActivity, org.telegram.messenger.qr.a0(launchActivity.P).j0(j10), p70Var, 19));
                return;
            case 1:
                la0 la0Var = (la0) this.c;
                TLObject tLObject = (TLObject) this.d;
                long j11 = this.b;
                if (la0Var.F == null) {
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
                la0Var.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                la0Var.getMessagesController().Y3(messages_messages.users, false);
                la0Var.getMessagesController().S3(messages_messages.chats, false);
                la0Var.getLocationController().c.k(messages_messages.messages, j11);
                la0Var.getNotificationCenter().k(org.telegram.messenger.hs.F4, Long.valueOf(j11));
                la0Var.p0(messages_messages.messages);
                la0Var.getLocationController().j(la0Var.m0);
                if (la0Var.L0 == null) {
                    u90 u90Var = new u90(la0Var, i3);
                    la0Var.L0 = u90Var;
                    org.telegram.messenger.g0.i3(u90Var, 5000L);
                    return;
                }
                return;
            case 2:
                pr0 pr0Var = (pr0) this.c;
                long j12 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                pr0Var.getClass();
                Bundle bundle = new Bundle();
                if (j12 > 0) {
                    bundle.putLong("user_id", j12);
                } else {
                    bundle.putLong("chat_id", -j12);
                }
                d2Var.presentFragment(new ProfileActivity(bundle, null));
                pr0Var.c(false);
                return;
            case 3:
                ui.f fVar = (ui.f) this.c;
                ui.e eVar = (ui.e) this.d;
                long j13 = this.b;
                if (((ui.e) fVar.c) != eVar) {
                    return;
                }
                ui.c cVar = (ui.c) fVar.e;
                if (cVar != null) {
                    org.telegram.messenger.g0.r(cVar);
                    fVar.e = null;
                }
                synchronized (ui.j.y) {
                    try {
                        ui.j jVar = ui.j.A;
                        if (jVar != null) {
                            jVar.q();
                            ui.j.A = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                fVar.c = null;
                eVar.c.run(j13);
                fVar.I();
                return;
            default:
                vi.f fVar2 = (vi.f) this.c;
                long j14 = this.b;
                Exception exc = (Exception) this.d;
                vi.j jVar2 = (vi.j) fVar2.c;
                if (j14 != jVar2.o) {
                    return;
                }
                jVar2.n = null;
                int i11 = jVar2.G;
                if (i11 != 10 && i11 != 9) {
                    jVar2.g(exc);
                    return;
                }
                jVar2.h.a("capture error after session end", exc);
                jVar2.c();
                jVar2.t();
                return;
        }
    }

    public /* synthetic */ z70(Object obj, Object obj2, long j10, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }
}
