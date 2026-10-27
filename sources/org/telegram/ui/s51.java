package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.g6 b;

    public /* synthetic */ s51(org.telegram.ui.Cells.g6 g6Var, int i10) {
        this.a = i10;
        this.b = g6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.showKeyboard(((w41) this.b.d).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
