package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
