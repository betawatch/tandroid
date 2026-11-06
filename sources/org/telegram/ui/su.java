package org.telegram.ui;

import java.util.Collections;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class su implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ su(ww wwVar, long j3, boolean z9, int i7) {
        this.a = i7;
        this.b = wwVar;
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
        ww wwVar = this.b;
        switch (i7) {
            case 0:
                ww wwVar2 = this.b;
                di.y6 P1 = wwVar2.getMessagesController().P1();
                long j10 = this.c;
                boolean z10 = this.d;
                P1.l0(j10, z10, false);
                m4.d0 d0Var = new m4.d0();
                d0Var.a = new su(wwVar2, j10, z10, 1);
                d0Var.b = new su(wwVar2, j10, z10, 2);
                if (j10 >= 0) {
                    TLRPC.User a22 = wwVar2.getMessagesController().a2(Long.valueOf(j10));
                    str = org.telegram.messenger.g5.m(15, a22.first_name, null);
                    chat = a22;
                } else {
                    TLRPC.Chat M0 = wwVar2.getMessagesController().M0(Long.valueOf(-j10));
                    str = M0.title;
                    chat = M0;
                }
                wwVar2.S = org.telegram.ui.Components.hc.X().V(Collections.singletonList(chat), wwVar2.q4() ? org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StoriesMovedToDialogs", null, 2131744759, str)) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StoriesMovedToContacts", null, 2131744760, org.telegram.messenger.g5.m(15, str, null))), null, d0Var).j();
                break;
            case 1:
                wwVar.getMessagesController().P1().l0(j3, !z9, false);
                break;
            default:
                wwVar.getMessagesController().P1().l0(j3, z9, true);
                break;
        }
    }
}
