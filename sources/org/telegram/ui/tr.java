package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr b;
    public final /* synthetic */ String c;

    public /* synthetic */ tr(vr vrVar, String str, int i10) {
        this.a = i10;
        this.b = vrVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        da daVar;
        switch (this.a) {
            case 0:
                vr vrVar = this.b;
                vrVar.getClass();
                AndroidUtilities.runOnUIThread(new tr(vrVar, this.c, 1));
                break;
            default:
                vr vrVar2 = this.b;
                vrVar2.n = null;
                wr wrVar = vrVar2.y;
                TLRPC.Chat chat = wrVar.r;
                int i10 = wrVar.e1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || wrVar.s == null) ? null : new ArrayList(wrVar.s.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(wrVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    vrVar2.s = false;
                    daVar = null;
                } else {
                    daVar = new da(vrVar2, str, arrayList, arrayList2, 10);
                }
                vrVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(wrVar.r) ? wrVar.N : 0L, false, wrVar.O, 1, 0L, daVar);
                break;
        }
    }
}
