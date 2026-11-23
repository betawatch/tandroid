package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dh0 b;

    public /* synthetic */ xg0(dh0 dh0Var, int i7) {
        this.a = i7;
        this.b = dh0Var;
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
