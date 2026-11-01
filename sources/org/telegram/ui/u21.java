package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih.b b;

    public /* synthetic */ u21(ih.b bVar, int i10) {
        this.a = i10;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.J3(((y11) this.b.Z1).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
