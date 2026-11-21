package org.telegram.ui;

import java.util.Collections;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ tu(cx cxVar, long j3, boolean z10, int i7) {
        this.a = i7;
        this.b = cxVar;
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
        cx cxVar = this.b;
        switch (i7) {
            case 0:
                cx cxVar2 = this.b;
                fi.p6 R1 = cxVar2.getMessagesController().R1();
                long j10 = this.c;
                boolean z11 = this.d;
                R1.l0(j10, z11, false);
                k8.a aVar = new k8.a(15, false);
                aVar.b = new tu(cxVar2, j10, z11, 1);
                aVar.c = new tu(cxVar2, j10, z11, 2);
                if (j10 >= 0) {
                    TLRPC.User c22 = cxVar2.getMessagesController().c2(Long.valueOf(j10));
                    str = org.telegram.messenger.i5.m(15, c22.first_name, null);
                    chat = c22;
                } else {
                    TLRPC.Chat O0 = cxVar2.getMessagesController().O0(Long.valueOf(-j10));
                    str = O0.title;
                    chat = O0;
                }
                cxVar2.T = org.telegram.ui.Components.lc.Y().V(Collections.singletonList(chat), cxVar2.t4() ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StoriesMovedToDialogs", null, 2131744517, str)) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StoriesMovedToContacts", null, 2131744518, org.telegram.messenger.i5.m(15, str, null))), null, aVar).j();
                break;
            case 1:
                cxVar.getMessagesController().R1().l0(j3, !z10, false);
                break;
            default:
                cxVar.getMessagesController().R1().l0(j3, z10, true);
                break;
        }
    }
}
