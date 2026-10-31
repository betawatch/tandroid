package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.Chat d;

    public /* synthetic */ y80(un unVar, long j10, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = j10;
        this.d = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Chat chat = this.d;
        long j10 = this.c;
        un unVar = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.ui.Components.cc.a0(unVar).I(R.raw.stars_send, org.telegram.messenger.cd.L0(2131745012, null), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G((int) j10, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
            default:
                org.telegram.ui.Components.cc.a0(unVar).I(R.raw.stars_send, org.telegram.messenger.cd.L0(2131745012, null), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G((int) j10, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
        }
    }
}
