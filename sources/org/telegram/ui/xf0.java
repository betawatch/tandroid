package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ xf0(y3 y3Var, int i10) {
        this.a = i10;
        this.b = y3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run("CANCELLED");
                break;
            default:
                AndroidUtilities.runOnUIThread(new xf0(this.b, 0));
                break;
        }
    }
}
