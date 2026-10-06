package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
