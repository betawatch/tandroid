package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class vr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xr b;
    public final /* synthetic */ String c;

    public /* synthetic */ vr(xr xrVar, String str, int i10) {
        this.a = i10;
        this.b = xrVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p6 p6Var;
        switch (this.a) {
            case 0:
                xr xrVar = this.b;
                xrVar.getClass();
                AndroidUtilities.runOnUIThread(new vr(xrVar, this.c, 1));
                break;
            default:
                xr xrVar2 = this.b;
                xrVar2.n = null;
                yr yrVar = xrVar2.y;
                TLRPC.Chat chat = yrVar.r;
                int i10 = yrVar.e1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || yrVar.s == null) ? null : new ArrayList(yrVar.s.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(yrVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    xrVar2.s = false;
                    p6Var = null;
                } else {
                    p6Var = new p6(xrVar2, str, arrayList, arrayList2, 13);
                }
                xrVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(yrVar.r) ? yrVar.N : 0L, false, yrVar.O, 1, 0L, p6Var);
                break;
        }
    }
}
