package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fh0 b;

    public /* synthetic */ zg0(fh0 fh0Var, int i7) {
        this.a = i7;
        this.b = fh0Var;
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
