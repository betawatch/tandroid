// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class qhb extends v79 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qhb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // v79
    public final void a(RecyclerView recyclerView, int i) {
        n69 n69Var;
        ltc ltcVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                if (i == 0) {
                    ((pqb) obj).t0 = false;
                    break;
                }
                break;
            case 2:
                if (i == 1) {
                    hl.t1(((vsb) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 3:
                if (i == 1) {
                    hl.t1(((axb) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 5:
                if (i == 1) {
                    hl.t1(((sbc) obj).U1.getEditText());
                    break;
                }
                break;
            case 6:
                xbc xbcVar = (xbc) obj;
                gw9 gw9Var = xbcVar.n1;
                if (i == 0 && xbcVar.A1) {
                    if (hl.L(13.0f) + xbcVar.x1 + xbcVar.t0 < (hl.m << 1) && gw9Var.canScrollVertically(1) && (n69Var = (n69) gw9Var.L(0)) != null) {
                        View view = n69Var.a;
                        if (view.getTop() > 0) {
                            gw9Var.y0(0, view.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 7:
                if (i == 1) {
                    hl.t1(((UsersSelectActivity) obj).c);
                    break;
                }
                break;
            case 9:
                if (i == 1 && (ltcVar = ((uqc) obj).j0) != null) {
                    ltcVar.a();
                    break;
                }
                break;
            case 12:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                if (i == 1) {
                    hl.t1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                wallpapersListActivity.g0 = i != 0;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d0, code lost:
    
        if (r4.z() != false) goto L59;
     */
    @Override // v79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i, int i2) {
        jla jlaVar;
        qqc qqcVar;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                thb thbVar = (thb) obj;
                fm0 fm0Var = thbVar.Y;
                if (!thbVar.c.canScrollVertically(-1)) {
                    jlaVar = ((e) thbVar).simpleActionBar;
                    break;
                }
                z = true;
                fm0Var.a(z, true);
                break;
            case 1:
                pqb pqbVar = (pqb) obj;
                pqbVar.w0.i1();
                pqbVar.t0 = true;
                break;
            case 4:
                ozb ozbVar = (ozb) obj;
                if (ozbVar.p0 && ozbVar.b0.M0() + 5 >= ozbVar.n0) {
                    ozbVar.M(ozbVar.e0);
                }
                tzb tzbVar = ozbVar.w0;
                if (tzbVar.t0) {
                    if (i != 0 || i2 != 0) {
                        hl.t1(tzbVar.q0.getSearchField());
                        break;
                    }
                }
                break;
            case 6:
                ((xbc) obj).M0();
                break;
            case 8:
                ((uic) obj).invalidate();
                break;
            case 9:
                uqc uqcVar = (uqc) obj;
                if (i2 != 0 && recyclerView.getScrollState() == 1 && (qqcVar = uqcVar.t0) != null && qqcVar.f) {
                    qqcVar.d = true;
                }
                uqcVar.X0();
                break;
            case 10:
                int[] iArr = (int[]) obj;
                iArr[0] = iArr[0] + i2;
                break;
            case 11:
                muc mucVar = (muc) obj;
                if (mucVar.a.J1) {
                    hl.t1(mucVar.O);
                    break;
                }
                break;
            case 12:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                if (wallpapersListActivity.G.getAdapter() == wallpapersListActivity.I) {
                    int K0 = wallpapersListActivity.J.K0();
                    int abs = K0 != -1 ? Math.abs(wallpapersListActivity.J.M0() - K0) + 1 : 0;
                    if (abs > 0) {
                        int A = wallpapersListActivity.J.A();
                        if (abs != 0 && K0 + abs > A - 2) {
                            cwc cwcVar = wallpapersListActivity.I;
                            if (!cwcVar.f && cwcVar.s == 0) {
                                cwcVar.F(cwcVar.h, cwcVar.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
