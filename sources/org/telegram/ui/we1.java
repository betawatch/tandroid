package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bf1 b;

    public /* synthetic */ we1(bf1 bf1Var, int i10) {
        this.a = i10;
        this.b = bf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bf1 bf1Var = this.b;
                bf1Var.getClass();
                new rg.x0((org.telegram.ui.ActionBar.o2) bf1Var, 11, false).show();
                break;
            default:
                bf1 bf1Var2 = this.b;
                bf1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(bf1Var2.e);
                break;
        }
    }
}
