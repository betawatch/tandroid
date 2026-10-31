package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm0 implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.messenger.us d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vm0(org.telegram.messenger.us usVar, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
        this.a = i10;
        this.d = usVar;
        this.e = obj;
        this.b = tL_starGiftUnique;
        this.c = j10;
        this.f = obj2;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                tn0.Y((tn0) this.d, (boolean[]) this.e, this.b, this.c, (tm0) this.f, (rh.d3) obj, (gf.e) obj2);
                break;
            default:
                rh.e4 e4Var = (rh.e4) this.d;
                gf.e eVar = (gf.e) this.e;
                ph.k0 k0Var = (ph.k0) this.f;
                eVar.b();
                if (((Boolean) obj).booleanValue()) {
                    rh.o2 o2Var = e4Var.J2;
                    if (o2Var != null) {
                        o2Var.c(this.b, this.c, k0Var != null);
                    }
                    if (k0Var != null) {
                        org.telegram.messenger.i0.g3(new ph.e0(k0Var, 3));
                        e4Var.N0 = true;
                    }
                    e4Var.dismiss();
                    break;
                }
                break;
        }
    }
}
