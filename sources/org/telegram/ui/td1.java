package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yd1 b;

    public /* synthetic */ td1(yd1 yd1Var, int i10) {
        this.a = i10;
        this.b = yd1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yd1 yd1Var = this.b;
                yd1Var.getClass();
                new tg.y0((org.telegram.ui.ActionBar.r2) yd1Var, 11, false).show();
                break;
            default:
                yd1 yd1Var2 = this.b;
                yd1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(yd1Var2.e);
                break;
        }
    }
}
