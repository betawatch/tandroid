package org.telegram.ui;

import java.util.Collections;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class tu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ tu(yw ywVar, long j3, boolean z10, int i7) {
        this.a = i7;
        this.b = ywVar;
        this.c = j3;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Chat chat;
        int i7 = this.a;
        boolean z10 = this.d;
        long j3 = this.c;
        yw ywVar = this.b;
        switch (i7) {
            case 0:
                yw ywVar2 = this.b;
                fi.s6 P1 = ywVar2.getMessagesController().P1();
                long j10 = this.c;
                boolean z11 = this.d;
                P1.l0(j10, z11, false);
                k8.a aVar = new k8.a(15, false);
                aVar.b = new tu(ywVar2, j10, z11, 1);
                aVar.c = new tu(ywVar2, j10, z11, 2);
                if (j10 >= 0) {
                    TLRPC.User a22 = ywVar2.getMessagesController().a2(Long.valueOf(j10));
                    str = org.telegram.messenger.g5.m(15, a22.first_name, null);
                    chat = a22;
                } else {
                    TLRPC.Chat M0 = ywVar2.getMessagesController().M0(Long.valueOf(-j10));
                    str = M0.title;
                    chat = M0;
                }
                ywVar2.T = org.telegram.ui.Components.cc.X().V(Collections.singletonList(chat), ywVar2.q4() ? org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StoriesMovedToDialogs", null, 2131744758, str)) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StoriesMovedToContacts", null, 2131744759, org.telegram.messenger.g5.m(15, str, null))), null, aVar).j();
                break;
            case 1:
                ywVar.getMessagesController().P1().l0(j3, !z10, false);
                break;
            default:
                ywVar.getMessagesController().P1().l0(j3, z10, true);
                break;
        }
    }
}
