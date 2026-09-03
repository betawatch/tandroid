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
import rh.j3;
import rh.m3;
import rh.p2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements c, gv0, hv0, GenericProvider {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.hv0
    public void b(Object obj, float f10) {
        switch (this.a) {
            case 12:
                p2 p2Var = (p2) obj;
                p2Var.b = f10;
                p2Var.e.invalidate();
                p2Var.T.setAlpha(f10);
                p2Var.E();
                p2Var.C();
                break;
            case 13:
            default:
                ((m3) obj).setSwipeOffsetY(f10);
                break;
            case 14:
                ((j3) obj).setLoadProgress(f10);
                break;
        }
    }

    @Override // qg.c
    public int f(f6 f6Var, boolean z4) {
        switch (this.a) {
            case 0:
                return 855638016;
            case 1:
                return TLObject.FLAG_30;
            case 2:
                return j6.l1(0.075f, -16777216);
            case 3:
                return j6.l1(0.88f, j6.v0(j6.d6, f6Var));
            case 4:
                return j6.l1(z4 ? 0.85f : 0.825f, j6.w0(null, j6.G8, false));
            case 5:
                return b.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.d6, f6Var), j6.v0(j6.Yk, f6Var));
            case 6:
                return j6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.d6, f6Var));
            case 7:
                return j6.l1(0.78f, j6.v0(j6.h5, f6Var));
            case 8:
                return j6.l1(0.7f, j6.v0(j6.d6, f6Var));
            case 9:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                return j6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.d6, f6Var));
        }
    }

    @Override // org.telegram.ui.Components.gv0
    public float get(Object obj) {
        switch (this.a) {
            case 11:
                return ((p2) obj).b;
            case 12:
            default:
                return ((m3) obj).getSwipeOffsetY();
            case 13:
                return ((j3) obj).c;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        iv0 iv0Var = m3.V;
        return Boolean.FALSE;
    }
}
