package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class w61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.b6 b;

    public /* synthetic */ w61(org.telegram.ui.Cells.b6 b6Var, int i10) {
        this.a = i10;
        this.b = b6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.showKeyboard(((a61) this.b.d).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
