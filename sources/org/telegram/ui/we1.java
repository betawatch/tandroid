package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                new rg.y0((org.telegram.ui.ActionBar.n2) bf1Var, 11, false).show();
                break;
            default:
                bf1 bf1Var2 = this.b;
                bf1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(bf1Var2.e);
                break;
        }
    }
}
