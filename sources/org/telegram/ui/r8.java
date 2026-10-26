package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
