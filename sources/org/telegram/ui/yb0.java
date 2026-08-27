package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ yb0(tc0 tc0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = tc0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                tc0 tc0Var = this.b;
                if (!z10) {
                    tc0Var.b.setVisibility(8);
                    break;
                } else {
                    tc0Var.getClass();
                    break;
                }
            default:
                this.b.s0(this.c);
                break;
        }
    }
}
