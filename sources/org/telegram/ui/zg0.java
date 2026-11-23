package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
