package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.c6 b;

    public /* synthetic */ u61(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.a = i10;
        this.b = c6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.showKeyboard(((y51) this.b.d).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
