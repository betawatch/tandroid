package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur b;
    public final /* synthetic */ String c;

    public /* synthetic */ sr(ur urVar, String str, int i10) {
        this.a = i10;
        this.b = urVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.n5 n5Var;
        switch (this.a) {
            case 0:
                ur urVar = this.b;
                urVar.getClass();
                AndroidUtilities.runOnUIThread(new sr(urVar, this.c, 1));
                break;
            default:
                ur urVar2 = this.b;
                urVar2.n = null;
                vr vrVar = urVar2.y;
                TLRPC.Chat chat = vrVar.r;
                int i10 = vrVar.e1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || vrVar.s == null) ? null : new ArrayList(vrVar.s.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(vrVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    urVar2.s = false;
                    n5Var = null;
                } else {
                    n5Var = new org.telegram.ui.ActionBar.n5(urVar2, str, arrayList, arrayList2, 14);
                }
                urVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(vrVar.r) ? vrVar.N : 0L, false, vrVar.O, 1, 0L, n5Var);
                break;
        }
    }
}
