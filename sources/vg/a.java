package vg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.voip.x2;
import org.telegram.ui.web.t1;
import vd.c;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a implements vd.b {
    public final c a;
    public final c b;
    public final vd.a c;
    public final vd.a d;
    public final x2 e;
    public final t1 f;
    public boolean h;

    public a(x2 x2Var, t1 t1Var) {
        jr jrVar = jr.h;
        this.a = new c(1, this, jrVar, 350L);
        this.b = new c(2, this, jrVar, 350L);
        this.c = new vd.a(0, this, jrVar, 350L, true);
        this.d = new vd.a(3, this, jrVar, 350L, true);
        this.h = true;
        this.e = x2Var;
        this.f = t1Var;
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, c cVar) {
        x2 x2Var = this.e;
        if (i10 == 1) {
            x2Var.setTranslationX(this.a.e);
        }
        if (i10 == 2) {
            x2Var.setTranslationY(this.b.e);
        }
        vd.a aVar = this.d;
        vd.a aVar2 = this.c;
        if (i10 == 0) {
            x2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.e) * aVar2.e);
            x2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f9));
            x2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f9));
            x2Var.setVisibility(f9 > 0.0f ? 0 : 8);
        }
        if (i10 == 3) {
            x2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.e) * aVar2.e);
        }
        t1 t1Var = this.f;
        if (t1Var != null) {
            t1Var.run();
        }
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
