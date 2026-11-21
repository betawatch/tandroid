package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
