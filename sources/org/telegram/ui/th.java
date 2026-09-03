package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class th implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ zn c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ th(int i10, zn znVar, boolean z4) {
        this.b = i10;
        this.c = znVar;
        this.d = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z4 = this.d;
                this.c.yc(this.b, z4);
                break;
            default:
                int i10 = this.b;
                zn znVar = this.c;
                if (i10 != 2) {
                    znVar.U9();
                    znVar.Yb();
                }
                sh.o0.f(org.telegram.ui.Components.qc.a0(znVar), i10, this.d);
                break;
        }
    }

    public /* synthetic */ th(zn znVar, boolean z4, int i10) {
        this.c = znVar;
        this.d = z4;
        this.b = i10;
    }
}
