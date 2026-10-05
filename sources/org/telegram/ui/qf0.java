package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ qf0(xf0 xf0Var, int i10, int i11) {
        this.a = i11;
        this.b = xf0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qf0(this.b, this.c, 1));
                break;
            case 1:
                this.b.A(this.c);
                break;
            default:
                this.b.f.f[this.c].l(1.0f);
                break;
        }
    }
}
