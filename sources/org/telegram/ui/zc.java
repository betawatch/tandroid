package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ id b;

    public /* synthetic */ zc(id idVar, int i10) {
        this.a = i10;
        this.b = idVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                id idVar = this.b;
                idVar.f0 = true;
                idVar.h0();
                break;
            case 1:
                id idVar2 = this.b;
                idVar2.x = null;
                idVar2.y = null;
                idVar2.h0 = null;
                idVar2.i0 = null;
                idVar2.k0 = null;
                idVar2.j0 = null;
                idVar2.l0 = 0.0d;
                idVar2.e0(false, true);
                idVar2.e.h(null, null, idVar2.s, null);
                idVar2.h.setAnimation(idVar2.F);
                idVar2.F.K(0);
                break;
            case 2:
                this.b.g0(true);
                break;
            default:
                id idVar3 = this.b;
                idVar3.f0 = true;
                if (idVar3.w.length() > 0) {
                    idVar3.d0(idVar3.w.getText().toString());
                }
                idVar3.h0();
                break;
        }
    }
}
