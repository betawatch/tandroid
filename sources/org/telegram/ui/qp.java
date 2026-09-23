package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class qp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp b;
    public final /* synthetic */ String c;

    public /* synthetic */ qp(rp rpVar, String str, int i10) {
        this.a = i10;
        this.b = rpVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rp rpVar = this.b;
                String str = this.c;
                rpVar.getClass();
                AndroidUtilities.runOnUIThread(new qp(rpVar, str, 1));
                break;
            default:
                rp rpVar2 = this.b;
                String str2 = this.c;
                rpVar2.f = null;
                Utilities.searchQueue.postRunnable(new r1(rpVar2, str2, new ArrayList(rpVar2.h.v), 28));
                break;
        }
    }
}
