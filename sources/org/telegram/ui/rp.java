package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
