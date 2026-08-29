package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;

    public /* synthetic */ zr(hs hsVar, int i10) {
        this.a = i10;
        this.b = hsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hs hsVar = this.b;
                if (hsVar.F) {
                    hsVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(hsVar.d.b);
                    break;
                }
                break;
            case 1:
                hs.Z(this.b);
                break;
            default:
                hs hsVar2 = this.b;
                hsVar2.presentFragment(tn.R9(hsVar2.D), true);
                break;
        }
    }
}
