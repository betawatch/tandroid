package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad b;

    public /* synthetic */ rc(ad adVar, int i7) {
        this.a = i7;
        this.b = adVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m0(true);
                break;
            case 1:
                ad adVar = this.b;
                adVar.l0 = true;
                adVar.n0();
                break;
            case 2:
                ad adVar2 = this.b;
                adVar2.E = null;
                adVar2.F = null;
                adVar2.n0 = null;
                adVar2.o0 = null;
                adVar2.q0 = null;
                adVar2.p0 = null;
                adVar2.r0 = 0.0d;
                adVar2.k0(false, true);
                adVar2.f.j(null, null, adVar2.w, null);
                adVar2.n.setAnimation(adVar2.L);
                adVar2.L.M(0);
                break;
            default:
                ad adVar3 = this.b;
                adVar3.l0 = true;
                if (adVar3.y.length() > 0) {
                    adVar3.j0(adVar3.y.getText().toString());
                }
                adVar3.n0();
                break;
        }
    }
}
