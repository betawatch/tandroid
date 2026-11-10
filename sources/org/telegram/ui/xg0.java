package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                org.telegram.messenger.g0.v1(this.b.l1);
                break;
            default:
                org.telegram.messenger.g0.K3(this.b.m1.getEditText());
                break;
        }
    }
}
