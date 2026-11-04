package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ wy(yy yyVar, int i3) {
        this.a = i3;
        this.b = yyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            default:
                yy yyVar = this.b;
                yyVar.b(yyVar.E);
                break;
        }
    }
}
