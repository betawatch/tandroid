package sg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.voip.u2;
import pf.o1;
import td.c;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a implements td.b {
    public final c a;
    public final c b;
    public final td.a c;
    public final td.a d;
    public final u2 e;
    public final o1 f;
    public boolean h;

    public a(u2 u2Var, o1 o1Var) {
        gr grVar = gr.h;
        this.a = new c(1, this, grVar, 350L);
        this.b = new c(2, this, grVar, 350L);
        this.c = new td.a(0, this, grVar, 350L, true);
        this.d = new td.a(3, this, grVar, 350L, true);
        this.h = true;
        this.e = u2Var;
        this.f = o1Var;
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, c cVar) {
        u2 u2Var = this.e;
        if (i9 == 1) {
            u2Var.setTranslationX(this.a.e);
        }
        if (i9 == 2) {
            u2Var.setTranslationY(this.b.e);
        }
        td.a aVar = this.d;
        td.a aVar2 = this.c;
        if (i9 == 0) {
            u2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.e) * aVar2.e);
            u2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f10));
            u2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f10));
            u2Var.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        if (i9 == 3) {
            u2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.e) * aVar2.e);
        }
        o1 o1Var = this.f;
        if (o1Var != null) {
            o1Var.run();
        }
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
