package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ String c;

    public /* synthetic */ vp(wp wpVar, String str, int i10) {
        this.a = i10;
        this.b = wpVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wp wpVar = this.b;
                String str = this.c;
                wpVar.getClass();
                AndroidUtilities.runOnUIThread(new vp(wpVar, str, 1));
                break;
            default:
                wp wpVar2 = this.b;
                String str2 = this.c;
                wpVar2.f = null;
                Utilities.searchQueue.postRunnable(new r1(wpVar2, str2, new ArrayList(wpVar2.h.v), 28));
                break;
        }
    }
}
