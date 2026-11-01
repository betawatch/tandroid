package org.telegram.ui;

import java.util.Collections;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zx b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ vv(zx zxVar, long j10, boolean z10, int i10) {
        this.a = i10;
        this.b = zxVar;
        this.c = j10;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Chat chat;
        int i10 = this.a;
        boolean z10 = this.d;
        long j10 = this.c;
        zx zxVar = this.b;
        switch (i10) {
            case 0:
                zx zxVar2 = this.b;
                th.e5 O1 = zxVar2.getMessagesController().O1();
                long j11 = this.c;
                boolean z11 = this.d;
                O1.l0(j11, z11, false);
                m4.c cVar = new m4.c((char) 0, 15);
                cVar.b = new vv(zxVar2, j11, z11, 1);
                cVar.c = new vv(zxVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User Z1 = zxVar2.getMessagesController().Z1(Long.valueOf(j11));
                    str = org.telegram.messenger.i5.m(15, Z1.first_name, null);
                    chat = Z1;
                } else {
                    TLRPC.Chat L0 = zxVar2.getMessagesController().L0(Long.valueOf(-j11));
                    str = L0.title;
                    chat = L0;
                }
                zxVar2.S = org.telegram.ui.Components.cc.X().V(Collections.singletonList(chat), zxVar2.q4() ? org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("StoriesMovedToDialogs", null, 2131744776, str)) : org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("StoriesMovedToContacts", null, 2131744777, org.telegram.messenger.i5.m(15, str, null))), null, cVar).j();
                break;
            case 1:
                zxVar.getMessagesController().O1().l0(j10, !z10, false);
                break;
            default:
                zxVar.getMessagesController().O1().l0(j10, z10, true);
                break;
        }
    }
}
