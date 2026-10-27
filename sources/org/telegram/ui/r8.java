package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o9 b;

    public /* synthetic */ r8(o9 o9Var, int i10) {
        this.a = i10;
        this.b = o9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h0(false);
                break;
            default:
                this.b.d0();
                break;
        }
    }
}
