package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tp b;
    public final /* synthetic */ String c;

    public /* synthetic */ sp(tp tpVar, String str, int i10) {
        this.a = i10;
        this.b = tpVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tp tpVar = this.b;
                String str = this.c;
                tpVar.getClass();
                AndroidUtilities.runOnUIThread(new sp(tpVar, str, 1));
                break;
            default:
                tp tpVar2 = this.b;
                String str2 = this.c;
                tpVar2.f = null;
                Utilities.searchQueue.postRunnable(new q1(tpVar2, str2, new ArrayList(tpVar2.h.v), 28));
                break;
        }
    }
}
