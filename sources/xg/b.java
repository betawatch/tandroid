package xg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.voip.v2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class b implements xd.b {
    public final xd.c a;
    public final xd.c b;
    public final xd.a c;
    public final xd.a d;
    public final v2 e;
    public final a f;
    public boolean h;

    public b(v2 v2Var, a aVar) {
        nr nrVar = nr.h;
        this.a = new xd.c(1, this, nrVar, 350L);
        this.b = new xd.c(2, this, nrVar, 350L);
        this.c = new xd.a(0, this, nrVar, 350L, true);
        this.d = new xd.a(3, this, nrVar, 350L, true);
        this.h = true;
        this.e = v2Var;
        this.f = aVar;
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        v2 v2Var = this.e;
        if (i10 == 1) {
            v2Var.setTranslationX(this.a.e);
        }
        if (i10 == 2) {
            v2Var.setTranslationY(this.b.e);
        }
        xd.a aVar = this.d;
        xd.a aVar2 = this.c;
        if (i10 == 0) {
            v2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.e) * aVar2.e);
            v2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f10));
            v2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f10));
            v2Var.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        if (i10 == 3) {
            v2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.e) * aVar2.e);
        }
        a aVar3 = this.f;
        if (aVar3 != null) {
            aVar3.run();
        }
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
