package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd b;

    public /* synthetic */ zc(hd hdVar, int i10) {
        this.a = i10;
        this.b = hdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                hd.X(this.b, view);
                break;
            case 1:
                hd hdVar = this.b;
                hdVar.v.o(hdVar.x != null, new yc(hdVar, 1), new s5(hdVar, 2), 0);
                hdVar.F.K(0);
                hdVar.F.N(43);
                hdVar.h.d();
                break;
            case 2:
                hd hdVar2 = this.b;
                if (!hdVar2.f0) {
                    hdVar2.f0();
                    break;
                } else if (hdVar2.W) {
                    hdVar2.W = false;
                    hdVar2.h0();
                    break;
                }
                break;
            default:
                hd hdVar3 = this.b;
                if (!hdVar3.W) {
                    hdVar3.W = true;
                    hdVar3.h0();
                    break;
                }
                break;
        }
    }
}
