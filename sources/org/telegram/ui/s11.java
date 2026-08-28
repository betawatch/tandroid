package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u11 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ s11(u11 u11Var, int i9, int i10, int i11) {
        this.a = i11;
        this.b = u11Var;
        this.c = i9;
        this.d = i10;
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
