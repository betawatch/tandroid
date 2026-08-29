package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v11 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ t11(v11 v11Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = v11Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c, this.d);
                break;
            case 1:
                this.b.b(this.c, this.d);
                break;
            default:
                this.b.b(this.c, this.d);
                break;
        }
    }
}
