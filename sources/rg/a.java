package rg;

import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.iv0;
import qg.c;
import rh.k3;
import rh.n3;
import rh.q2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements c, gv0, hv0, GenericProvider {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.hv0
    public void b(Object obj, float f10) {
        switch (this.a) {
            case 11:
                q2 q2Var = (q2) obj;
                q2Var.b = f10;
                q2Var.e.invalidate();
                q2Var.T.setAlpha(f10);
                q2Var.E();
                q2Var.C();
                break;
            case 12:
            default:
                ((n3) obj).setSwipeOffsetY(f10);
                break;
            case 13:
                ((k3) obj).setLoadProgress(f10);
                break;
        }
    }

    @Override // qg.c
    public int g(f6 f6Var, boolean z4) {
        switch (this.a) {
            case 0:
                return 855638016;
            case 1:
                return TLObject.FLAG_30;
            case 2:
                return j6.l1(0.075f, -16777216);
            case 3:
                return j6.l1(z4 ? 0.85f : 0.825f, j6.w0(null, j6.G8, false));
            case 4:
                return b.l(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.d6, f6Var), j6.v0(j6.Yk, f6Var));
            case 5:
                return j6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.d6, f6Var));
            case 6:
                return j6.l1(0.78f, j6.v0(j6.h5, f6Var));
            case 7:
                return j6.l1(0.7f, j6.v0(j6.d6, f6Var));
            case 8:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                return j6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.d6, f6Var));
        }
    }

    @Override // org.telegram.ui.Components.gv0
    public float get(Object obj) {
        switch (this.a) {
            case 10:
                return ((q2) obj).b;
            case 11:
            default:
                return ((n3) obj).getSwipeOffsetY();
            case 12:
                return ((k3) obj).c;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        iv0 iv0Var = n3.V;
        return Boolean.FALSE;
    }
}
