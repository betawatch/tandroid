package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hi.m3 b;

    public /* synthetic */ sy(hi.m3 m3Var, int i7) {
        this.a = i7;
        this.b = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.E2(this.b);
                break;
            default:
                this.b.f(true);
                break;
        }
    }
}
