package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zp b;
    public final /* synthetic */ String c;

    public /* synthetic */ yp(zp zpVar, String str, int i10) {
        this.a = i10;
        this.b = zpVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zp zpVar = this.b;
                String str = this.c;
                zpVar.getClass();
                AndroidUtilities.runOnUIThread(new yp(zpVar, str, 1));
                break;
            default:
                zp zpVar2 = this.b;
                String str2 = this.c;
                zpVar2.f = null;
                Utilities.searchQueue.postRunnable(new t1(zpVar2, str2, new ArrayList(zpVar2.h.v), 28));
                break;
        }
    }
}
