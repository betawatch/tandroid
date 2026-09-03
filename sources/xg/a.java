package xg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.voip.v2;
import vh.z1;
import xd.c;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class a implements xd.b {
    public final c a;
    public final c b;
    public final xd.a c;
    public final xd.a d;
    public final v2 e;
    public final z1 f;
    public boolean h;

    public a(v2 v2Var, z1 z1Var) {
        mr mrVar = mr.h;
        this.a = new c(1, this, mrVar, 350L);
        this.b = new c(2, this, mrVar, 350L);
        this.c = new xd.a(0, this, mrVar, 350L, true);
        this.d = new xd.a(3, this, mrVar, 350L, true);
        this.h = true;
        this.e = v2Var;
        this.f = z1Var;
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, c cVar) {
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
        z1 z1Var = this.f;
        if (z1Var != null) {
            z1Var.run();
        }
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
