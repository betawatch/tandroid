package org.telegram.ui;

import java.util.Collections;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class su implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ su(bx bxVar, long j3, boolean z10, int i7) {
        this.a = i7;
        this.b = bxVar;
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
        bx bxVar = this.b;
        switch (i7) {
            case 0:
                bx bxVar2 = this.b;
                fi.p6 R1 = bxVar2.getMessagesController().R1();
                long j10 = this.c;
                boolean z11 = this.d;
                R1.l0(j10, z11, false);
                jb.m mVar = new jb.m(16, false);
                mVar.b = new su(bxVar2, j10, z11, 1);
                mVar.c = new su(bxVar2, j10, z11, 2);
                if (j10 >= 0) {
                    TLRPC.User c22 = bxVar2.getMessagesController().c2(Long.valueOf(j10));
                    str = org.telegram.messenger.i5.m(15, c22.first_name, null);
                    chat = c22;
                } else {
                    TLRPC.Chat O0 = bxVar2.getMessagesController().O0(Long.valueOf(-j10));
                    str = O0.title;
                    chat = O0;
                }
                bxVar2.T = org.telegram.ui.Components.kc.Y().V(Collections.singletonList(chat), bxVar2.t4() ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StoriesMovedToDialogs", null, 2131744517, str)) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StoriesMovedToContacts", null, 2131744518, org.telegram.messenger.i5.m(15, str, null))), null, mVar).j();
                break;
            case 1:
                bxVar.getMessagesController().R1().l0(j3, !z10, false);
                break;
            default:
                bxVar.getMessagesController().R1().l0(j3, z10, true);
                break;
        }
    }
}
