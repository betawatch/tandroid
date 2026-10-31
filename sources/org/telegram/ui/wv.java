package org.telegram.ui;

import java.util.Collections;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ wv(ay ayVar, long j10, boolean z10, int i10) {
        this.a = i10;
        this.b = ayVar;
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
        ay ayVar = this.b;
        switch (i10) {
            case 0:
                ay ayVar2 = this.b;
                th.e5 O1 = ayVar2.getMessagesController().O1();
                long j11 = this.c;
                boolean z11 = this.d;
                O1.l0(j11, z11, false);
                m4.c cVar = new m4.c((char) 0, 15);
                cVar.b = new wv(ayVar2, j11, z11, 1);
                cVar.c = new wv(ayVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User Z1 = ayVar2.getMessagesController().Z1(Long.valueOf(j11));
                    str = org.telegram.messenger.i5.m(15, Z1.first_name, null);
                    chat = Z1;
                } else {
                    TLRPC.Chat L0 = ayVar2.getMessagesController().L0(Long.valueOf(-j11));
                    str = L0.title;
                    chat = L0;
                }
                ayVar2.S = org.telegram.ui.Components.cc.X().V(Collections.singletonList(chat), ayVar2.p4() ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StoriesMovedToDialogs", null, 2131744776, str)) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StoriesMovedToContacts", null, 2131744777, org.telegram.messenger.i5.m(15, str, null))), null, cVar).j();
                break;
            case 1:
                ayVar.getMessagesController().O1().l0(j10, !z10, false);
                break;
            default:
                ayVar.getMessagesController().O1().l0(j10, z10, true);
                break;
        }
    }
}
