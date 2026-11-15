package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ed0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ xc0(ed0 ed0Var, int i7, int i10) {
        this.a = i10;
        this.b = ed0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new xc0(this.b, this.c, 1));
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
