package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                if (hsVar.J) {
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
                hsVar2.presentFragment(sn.W9(hsVar2.H), true);
                break;
        }
    }
}
