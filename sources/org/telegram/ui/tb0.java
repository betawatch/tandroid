package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ tb0(pc0 pc0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = pc0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                pc0 pc0Var = this.b;
                if (!z10) {
                    pc0Var.b.setVisibility(8);
                    break;
                } else {
                    pc0Var.getClass();
                    break;
                }
            default:
                this.b.r0(this.c);
                break;
        }
    }
}
