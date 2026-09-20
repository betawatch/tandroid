package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
