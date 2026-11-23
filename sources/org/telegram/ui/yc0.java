package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ yc0(gd0 gd0Var, int i7, int i10) {
        this.a = i10;
        this.b = gd0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new yc0(this.b, this.c, 1));
                break;
            case 1:
                this.b.z(this.c);
                break;
            default:
                this.b.f.f[this.c].D(1.0f);
                break;
        }
    }
}
