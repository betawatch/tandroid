package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr b;
    public final /* synthetic */ String c;

    public /* synthetic */ rr(tr trVar, String str, int i10) {
        this.a = i10;
        this.b = trVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.n5 n5Var;
        switch (this.a) {
            case 0:
                tr trVar = this.b;
                trVar.getClass();
                AndroidUtilities.runOnUIThread(new rr(trVar, this.c, 1));
                break;
            default:
                tr trVar2 = this.b;
                trVar2.n = null;
                ur urVar = trVar2.y;
                TLRPC.Chat chat = urVar.r;
                int i10 = urVar.e1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || urVar.s == null) ? null : new ArrayList(urVar.s.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(urVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    trVar2.s = false;
                    n5Var = null;
                } else {
                    n5Var = new org.telegram.ui.ActionBar.n5(trVar2, str, arrayList, arrayList2, 14);
                }
                trVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(urVar.r) ? urVar.N : 0L, false, urVar.O, 1, 0L, n5Var);
                break;
        }
    }
}
