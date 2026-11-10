package org.telegram.ui;

import java.util.Collections;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zw b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ vu(zw zwVar, long j3, boolean z9, int i7) {
        this.a = i7;
        this.b = zwVar;
        this.c = j3;
        this.d = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Chat chat;
        int i7 = this.a;
        boolean z9 = this.d;
        long j3 = this.c;
        zw zwVar = this.b;
        switch (i7) {
            case 0:
                zw zwVar2 = this.b;
                di.z6 P1 = zwVar2.getMessagesController().P1();
                long j10 = this.c;
                boolean z10 = this.d;
                P1.l0(j10, z10, false);
                m4.d0 d0Var = new m4.d0();
                d0Var.a = new vu(zwVar2, j10, z10, 1);
                d0Var.b = new vu(zwVar2, j10, z10, 2);
                if (j10 >= 0) {
                    TLRPC.User a22 = zwVar2.getMessagesController().a2(Long.valueOf(j10));
                    str = org.telegram.messenger.g5.m(15, a22.first_name, null);
                    chat = a22;
                } else {
                    TLRPC.Chat M0 = zwVar2.getMessagesController().M0(Long.valueOf(-j10));
                    str = M0.title;
                    chat = M0;
                }
                zwVar2.S = org.telegram.ui.Components.gc.X().V(Collections.singletonList(chat), zwVar2.q4() ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StoriesMovedToDialogs", null, 2131744758, str)) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StoriesMovedToContacts", null, 2131744759, org.telegram.messenger.g5.m(15, str, null))), null, d0Var).j();
                break;
            case 1:
                zwVar.getMessagesController().P1().l0(j3, !z9, false);
                break;
            default:
                zwVar.getMessagesController().P1().l0(j3, z9, true);
                break;
        }
    }
}
