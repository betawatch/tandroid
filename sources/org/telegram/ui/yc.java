package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd b;

    public /* synthetic */ yc(hd hdVar, int i10) {
        this.a = i10;
        this.b = hdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hd hdVar = this.b;
                hdVar.f0 = true;
                hdVar.h0();
                break;
            case 1:
                hd hdVar2 = this.b;
                hdVar2.x = null;
                hdVar2.y = null;
                hdVar2.h0 = null;
                hdVar2.i0 = null;
                hdVar2.k0 = null;
                hdVar2.j0 = null;
                hdVar2.l0 = 0.0d;
                hdVar2.e0(false, true);
                hdVar2.e.h(null, null, hdVar2.s, null);
                hdVar2.h.setAnimation(hdVar2.F);
                hdVar2.F.K(0);
                break;
            case 2:
                this.b.g0(true);
                break;
            default:
                hd hdVar3 = this.b;
                hdVar3.f0 = true;
                if (hdVar3.w.length() > 0) {
                    hdVar3.d0(hdVar3.w.getText().toString());
                }
                hdVar3.h0();
                break;
        }
    }
}
