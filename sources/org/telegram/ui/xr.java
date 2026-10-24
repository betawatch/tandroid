package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;

    public /* synthetic */ xr(hs hsVar, int i10) {
        this.a = i10;
        this.b = hsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hs.Y(this.b);
                break;
            case 1:
                hs hsVar = this.b;
                if (hsVar.J) {
                    hsVar.d.d.requestFocus();
                    AndroidUtilities.showKeyboard(hsVar.d.d);
                    break;
                }
                break;
            default:
                hs hsVar2 = this.b;
                hsVar2.presentFragment(sn.W9(hsVar2.H), true);
                break;
        }
    }
}
