package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class wp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xp b;
    public final /* synthetic */ String c;

    public /* synthetic */ wp(xp xpVar, String str, int i10) {
        this.a = i10;
        this.b = xpVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xp xpVar = this.b;
                String str = this.c;
                xpVar.getClass();
                AndroidUtilities.runOnUIThread(new wp(xpVar, str, 1));
                break;
            default:
                xp xpVar2 = this.b;
                String str2 = this.c;
                xpVar2.f = null;
                Utilities.searchQueue.postRunnable(new s1(xpVar2, str2, new ArrayList(xpVar2.h.v), 28));
                break;
        }
    }
}
