package org.telegram.ui;

import java.util.Collections;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class uu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ uu(yw ywVar, long j3, boolean z9, int i7) {
        this.a = i7;
        this.b = ywVar;
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
        yw ywVar = this.b;
        switch (i7) {
            case 0:
                yw ywVar2 = this.b;
                di.z6 P1 = ywVar2.getMessagesController().P1();
                long j10 = this.c;
                boolean z10 = this.d;
                P1.l0(j10, z10, false);
                m4.d0 d0Var = new m4.d0();
                d0Var.a = new uu(ywVar2, j10, z10, 1);
                d0Var.b = new uu(ywVar2, j10, z10, 2);
                if (j10 >= 0) {
                    TLRPC.User a22 = ywVar2.getMessagesController().a2(Long.valueOf(j10));
                    str = org.telegram.messenger.g5.m(15, a22.first_name, null);
                    chat = a22;
                } else {
                    TLRPC.Chat M0 = ywVar2.getMessagesController().M0(Long.valueOf(-j10));
                    str = M0.title;
                    chat = M0;
                }
                ywVar2.S = org.telegram.ui.Components.hc.X().V(Collections.singletonList(chat), ywVar2.q4() ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StoriesMovedToDialogs", null, 2131744758, str)) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StoriesMovedToContacts", null, 2131744759, org.telegram.messenger.g5.m(15, str, null))), null, d0Var).j();
                break;
            case 1:
                ywVar.getMessagesController().P1().l0(j3, !z9, false);
                break;
            default:
                ywVar.getMessagesController().P1().l0(j3, z9, true);
                break;
        }
    }
}
