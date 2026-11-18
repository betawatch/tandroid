package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eh0 b;

    public /* synthetic */ yg0(eh0 eh0Var, int i7) {
        this.a = i7;
        this.b = eh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.v1(this.b.m1);
                break;
            default:
                org.telegram.messenger.g0.I3(this.b.n1.getEditText());
                break;
        }
    }
}
