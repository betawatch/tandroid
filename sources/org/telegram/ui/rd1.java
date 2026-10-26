package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wd1 b;

    public /* synthetic */ rd1(wd1 wd1Var, int i10) {
        this.a = i10;
        this.b = wd1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wd1 wd1Var = this.b;
                wd1Var.getClass();
                new tg.y0((org.telegram.ui.ActionBar.r2) wd1Var, 11, false).show();
                break;
            default:
                wd1 wd1Var2 = this.b;
                wd1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(wd1Var2.e);
                break;
        }
    }
}
