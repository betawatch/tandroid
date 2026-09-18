package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        org.telegram.ui.ActionBar.o5 o5Var;
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
                    o5Var = null;
                } else {
                    o5Var = new org.telegram.ui.ActionBar.o5(trVar2, str, arrayList, arrayList2, 14);
                }
                trVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(urVar.r) ? urVar.N : 0L, false, urVar.O, 1, 0L, o5Var);
                break;
        }
    }
}
