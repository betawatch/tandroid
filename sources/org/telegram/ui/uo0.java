package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ep0 b;

    public /* synthetic */ uo0(ep0 ep0Var, int i10) {
        this.a = i10;
        this.b = ep0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ep0 ep0Var = this.b;
        switch (i10) {
            case 0:
                if (ep0Var.G) {
                    ep0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                ep0Var.h();
                break;
            case 2:
                int i11 = ep0.q0;
                ep0Var.h();
                break;
            default:
                int i12 = ep0.q0;
                ep0Var.h();
                break;
        }
    }
}
