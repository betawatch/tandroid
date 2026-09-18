package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
