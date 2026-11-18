package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ xc0(gd0 gd0Var, int i7, int i10) {
        this.a = i10;
        this.b = gd0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new xc0(this.b, this.c, 1));
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
