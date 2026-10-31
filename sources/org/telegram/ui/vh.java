package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ un c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ vh(int i10, un unVar, boolean z10) {
        this.b = i10;
        this.c = unVar;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.d;
                this.c.Sc(this.b, z10);
                break;
            default:
                int i10 = this.b;
                un unVar = this.c;
                if (i10 != 2) {
                    unVar.ka();
                    unVar.rc();
                }
                yh.f0.f(org.telegram.ui.Components.cc.a0(unVar), i10, this.d);
                break;
        }
    }

    public /* synthetic */ vh(un unVar, boolean z10, int i10) {
        this.c = unVar;
        this.d = z10;
        this.b = i10;
    }
}
