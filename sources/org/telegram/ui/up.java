package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class up implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ String c;

    public /* synthetic */ up(vp vpVar, String str, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vp vpVar = this.b;
                String str = this.c;
                vpVar.getClass();
                AndroidUtilities.runOnUIThread(new up(vpVar, str, 1));
                break;
            default:
                vp vpVar2 = this.b;
                String str2 = this.c;
                vpVar2.f = null;
                Utilities.searchQueue.postRunnable(new q1(vpVar2, str2, new ArrayList(vpVar2.h.v), 28));
                break;
        }
    }
}
