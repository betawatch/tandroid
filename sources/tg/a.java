package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.voip.u2;
import ud.c;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a implements ud.b {
    public final c a;
    public final c b;
    public final ud.a c;
    public final ud.a d;
    public final u2 e;
    public final qf.b f;
    public boolean h;

    public a(u2 u2Var, qf.b bVar) {
        er erVar = er.h;
        this.a = new c(1, this, erVar, 350L);
        this.b = new c(2, this, erVar, 350L);
        this.c = new ud.a(0, this, erVar, 350L, true);
        this.d = new ud.a(3, this, erVar, 350L, true);
        this.h = true;
        this.e = u2Var;
        this.f = bVar;
    }

    @Override // ud.b
    public final void o(int i10, float f10, float f11, c cVar) {
        u2 u2Var = this.e;
        if (i10 == 1) {
            u2Var.setTranslationX(this.a.e);
        }
        if (i10 == 2) {
            u2Var.setTranslationY(this.b.e);
        }
        ud.a aVar = this.d;
        ud.a aVar2 = this.c;
        if (i10 == 0) {
            u2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.e) * aVar2.e);
            u2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f10));
            u2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f10));
            u2Var.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        if (i10 == 3) {
            u2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.e) * aVar2.e);
        }
        qf.b bVar = this.f;
        if (bVar != null) {
            bVar.run();
        }
    }

    @Override // ud.b
    public final /* synthetic */ void A(float f10, int i10) {
    }
}
