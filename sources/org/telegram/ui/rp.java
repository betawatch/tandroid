package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp b;
    public final /* synthetic */ String c;

    public /* synthetic */ rp(sp spVar, String str, int i10) {
        this.a = i10;
        this.b = spVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sp spVar = this.b;
                String str = this.c;
                spVar.getClass();
                AndroidUtilities.runOnUIThread(new rp(spVar, str, 1));
                break;
            default:
                sp spVar2 = this.b;
                String str2 = this.c;
                spVar2.f = null;
                Utilities.searchQueue.postRunnable(new r1(spVar2, str2, new ArrayList(spVar2.h.v), 28));
                break;
        }
    }
}
