package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.b6 b;

    public /* synthetic */ v61(org.telegram.ui.Cells.b6 b6Var, int i10) {
        this.a = i10;
        this.b = b6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.showKeyboard(((z51) this.b.d).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
