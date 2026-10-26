package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ js b;

    public /* synthetic */ zr(js jsVar, int i10) {
        this.a = i10;
        this.b = jsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                js.Z(this.b);
                break;
            case 1:
                js jsVar = this.b;
                if (jsVar.J) {
                    jsVar.d.d.requestFocus();
                    AndroidUtilities.showKeyboard(jsVar.d.d);
                    break;
                }
                break;
            default:
                js jsVar2 = this.b;
                jsVar2.presentFragment(un.ba(jsVar2.H), true);
                break;
        }
    }
}
