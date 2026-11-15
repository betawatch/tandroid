package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bh0 b;

    public /* synthetic */ ug0(bh0 bh0Var, int i7) {
        this.a = i7;
        this.b = bh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.v1(this.b.m1);
                break;
            default:
                org.telegram.messenger.g0.J3(this.b.n1.getEditText());
                break;
        }
    }
}
