package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sr b;
    public final /* synthetic */ String c;

    public /* synthetic */ qr(sr srVar, String str, int i10) {
        this.a = i10;
        this.b = srVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sr srVar = this.b;
                srVar.getClass();
                AndroidUtilities.runOnUIThread(new qr(srVar, this.c, 1));
                break;
            default:
                sr srVar2 = this.b;
                org.telegram.ui.ActionBar.n5 n5Var = null;
                srVar2.n = null;
                tr trVar = srVar2.y;
                TLRPC.Chat chat = trVar.r;
                int i10 = trVar.e1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || trVar.s == null) ? null : new ArrayList(trVar.s.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(trVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    srVar2.s = false;
                } else {
                    n5Var = new org.telegram.ui.ActionBar.n5(srVar2, str, arrayList, arrayList2);
                }
                srVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(trVar.r) ? trVar.N : 0L, false, trVar.O, 1, 0L, n5Var);
                break;
        }
    }
}
