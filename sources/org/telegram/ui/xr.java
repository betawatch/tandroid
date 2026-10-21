package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fs b;

    public /* synthetic */ xr(fs fsVar, int i10) {
        this.a = i10;
        this.b = fsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fs fsVar = this.b;
                if (fsVar.J) {
                    fsVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(fsVar.d.b);
                    break;
                }
                break;
            case 1:
                fs.Z(this.b);
                break;
            default:
                fs fsVar2 = this.b;
                fsVar2.presentFragment(qn.W9(fsVar2.H), true);
                break;
        }
    }
}
