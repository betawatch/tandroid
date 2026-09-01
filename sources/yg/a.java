package yg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.voip.w2;
import wh.v1;
import xd.c;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class a implements xd.b {
    public final c a;
    public final c b;
    public final xd.a c;
    public final xd.a d;
    public final w2 e;
    public final v1 f;
    public boolean h;

    public a(w2 w2Var, v1 v1Var) {
        pr prVar = pr.h;
        this.a = new c(1, this, prVar, 350L);
        this.b = new c(2, this, prVar, 350L);
        this.c = new xd.a(0, this, prVar, 350L, true);
        this.d = new xd.a(3, this, prVar, 350L, true);
        this.h = true;
        this.e = w2Var;
        this.f = v1Var;
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, c cVar) {
        w2 w2Var = this.e;
        if (i10 == 1) {
            w2Var.setTranslationX(this.a.e);
        }
        if (i10 == 2) {
            w2Var.setTranslationY(this.b.e);
        }
        xd.a aVar = this.d;
        xd.a aVar2 = this.c;
        if (i10 == 0) {
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.e) * aVar2.e);
            w2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f10));
            w2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f10));
            w2Var.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        if (i10 == 3) {
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.e) * aVar2.e);
        }
        v1 v1Var = this.f;
        if (v1Var != null) {
            v1Var.run();
        }
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
