package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ wc0(dd0 dd0Var, int i3, int i10) {
        this.a = i10;
        this.b = dd0Var;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new wc0(this.b, this.c, 1));
                break;
            case 1:
                this.b.z(this.c);
                break;
            default:
                this.b.f.f[this.c].C(1.0f);
                break;
        }
    }
}
