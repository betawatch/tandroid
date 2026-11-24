// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vdb extends i49 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vdb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // i49
    public final void a(RecyclerView recyclerView, int i) {
        y29 y29Var;
        zoc zocVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                if (i == 0) {
                    ((qmb) obj).t0 = false;
                    break;
                }
                break;
            case 2:
                if (i == 1) {
                    gl.t1(((vob) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 3:
                if (i == 1) {
                    gl.t1(((zsb) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 5:
                if (i == 1) {
                    gl.t1(((s7c) obj).U1.getEditText());
                    break;
                }
                break;
            case 6:
                x7c x7cVar = (x7c) obj;
                ns9 ns9Var = x7cVar.n1;
                if (i == 0 && x7cVar.A1) {
                    if (gl.L(13.0f) + x7cVar.x1 + x7cVar.t0 < (gl.m << 1) && ns9Var.canScrollVertically(1) && (y29Var = (y29) ns9Var.K(0)) != null) {
                        View view = y29Var.a;
                        if (view.getTop() > 0) {
                            ns9Var.x0(0, view.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 7:
                if (i == 1) {
                    gl.t1(((UsersSelectActivity) obj).c);
                    break;
                }
                break;
            case 9:
                if (i == 1 && (zocVar = ((hmc) obj).j0) != null) {
                    zocVar.a();
                    break;
                }
                break;
            case 12:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                if (i == 1) {
                    gl.t1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                wallpapersListActivity.g0 = i != 0;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d0, code lost:
    
        if (r4.x() != false) goto L59;
     */
    @Override // i49
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i, int i2) {
        pha phaVar;
        dmc dmcVar;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                ydb ydbVar = (ydb) obj;
                fm0 fm0Var = ydbVar.Y;
                if (!ydbVar.c.canScrollVertically(-1)) {
                    phaVar = ((d) ydbVar).simpleActionBar;
                    break;
                }
                z = true;
                fm0Var.a(z, true);
                break;
            case 1:
                qmb qmbVar = (qmb) obj;
                qmbVar.w0.h1();
                qmbVar.t0 = true;
                break;
            case 4:
                mvb mvbVar = (mvb) obj;
                if (mvbVar.p0 && mvbVar.b0.M0() + 5 >= mvbVar.n0) {
                    mvbVar.L(mvbVar.e0);
                }
                qvb qvbVar = mvbVar.w0;
                if (qvbVar.t0) {
                    if (i != 0 || i2 != 0) {
                        gl.t1(qvbVar.q0.getSearchField());
                        break;
                    }
                }
                break;
            case 6:
                ((x7c) obj).L0();
                break;
            case 8:
                ((vec) obj).invalidate();
                break;
            case 9:
                hmc hmcVar = (hmc) obj;
                if (i2 != 0 && recyclerView.getScrollState() == 1 && (dmcVar = hmcVar.t0) != null && dmcVar.f) {
                    dmcVar.d = true;
                }
                hmcVar.X0();
                break;
            case 10:
                int[] iArr = (int[]) obj;
                iArr[0] = iArr[0] + i2;
                break;
            case 11:
                ypc ypcVar = (ypc) obj;
                if (ypcVar.a.J1) {
                    gl.t1(ypcVar.O);
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
                            orc orcVar = wallpapersListActivity.I;
                            if (!orcVar.f && orcVar.s == 0) {
                                orcVar.F(orcVar.h, orcVar.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
