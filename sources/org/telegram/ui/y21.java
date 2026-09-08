package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class y21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a31 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ y21(a31 a31Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = a31Var;
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
