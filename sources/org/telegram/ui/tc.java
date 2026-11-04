package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad b;

    public /* synthetic */ tc(ad adVar, int i3) {
        this.a = i3;
        this.b = adVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ad.c0(this.b, view);
                break;
            case 1:
                ad adVar = this.b;
                adVar.x.n(adVar.E != null, new qc(adVar, 2), new s5(adVar, 2), 0);
                adVar.L.M(0);
                adVar.L.P(43);
                adVar.n.d();
                break;
            case 2:
                ad adVar2 = this.b;
                if (!adVar2.l0) {
                    adVar2.l0();
                    break;
                } else if (adVar2.c0) {
                    adVar2.c0 = false;
                    adVar2.n0();
                    break;
                }
                break;
            default:
                ad adVar3 = this.b;
                if (!adVar3.c0) {
                    adVar3.c0 = true;
                    adVar3.n0();
                    break;
                }
                break;
        }
    }
}
