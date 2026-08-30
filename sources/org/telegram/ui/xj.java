package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xj extends f2.z0 {
    public boolean b;
    public final /* synthetic */ xn d;
    public float a = 0.0f;
    public final int c = AndroidUtilities.dp(100.0f);

    public xj(xn xnVar) {
        this.d = xnVar;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        xn xnVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.t1 t1Var = xnVar.m2;
            if (t1Var != null) {
                xnVar.k2.e(t1Var, -1, xnVar.n2, xnVar.o2, true);
                xnVar.m2 = null;
            }
            xnVar.g3 = false;
            xnVar.h3 = false;
            xnVar.i3 = false;
            xnVar.j3 = false;
            xnVar.f9(true);
            xnVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = xn.Ec;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            xnVar.u0.setOverScrollMode(0);
            xnVar.Z8.W();
            xnVar.Wc(false);
            xnVar.q9(1);
            xnVar.pa = false;
            return;
        }
        ph.f3 f3Var = xnVar.v1;
        if (f3Var != null && f3Var.S) {
            f3Var.e(true);
        }
        org.telegram.ui.Components.k6 k6Var = xnVar.T2;
        if (k6Var != null && k6Var.getVisibility() == 0 && xnVar.x9()) {
            AndroidUtilities.hideKeyboard(xnVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            xnVar.A4 = true;
            xnVar.i3 = true;
        } else if (i10 == 1) {
            xnVar.m2 = null;
            xnVar.A4 = true;
            xnVar.g3 = true;
            xnVar.h3 = true;
            xnVar.j3 = true;
            xnVar.i3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = xn.Ec;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        mg.v vVar = xnVar.V9;
        if (vVar == null || !vVar.d()) {
            return;
        }
        xnVar.V9.setHiddenByScroll(true);
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ng.e eVar;
        boolean z4;
        xn xnVar = this.d;
        xn xnVar2 = xnVar.aa;
        if (xnVar2 == null) {
            xnVar2 = xnVar;
        }
        xnVar.u0.invalidate();
        boolean z10 = true;
        this.b = i11 < 0;
        int L0 = xnVar.w0.L0();
        if (((i11 != 0 && xnVar.pa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && xnVar.K4 != 0) {
            if (!this.b || xnVar.L4) {
                xnVar.K4 = 0;
            } else if (!xnVar.u0.U1 && L0 != -1) {
                int N0 = xnVar.w0.N0();
                MessageObject messageObject = null;
                while (true) {
                    if (N0 < L0) {
                        z4 = false;
                        break;
                    }
                    View m9 = xnVar.w0.m(N0);
                    if (m9 instanceof org.telegram.ui.Cells.t1) {
                        messageObject = ((org.telegram.ui.Cells.t1) m9).getMessageObject();
                    } else if (m9 instanceof org.telegram.ui.Cells.v0) {
                        messageObject = ((org.telegram.ui.Cells.v0) m9).getMessageObject();
                    }
                    if (messageObject != null && xnVar.K4 == messageObject.getId()) {
                        z4 = true;
                        break;
                    }
                    N0--;
                }
                if (!z4 && messageObject != null && messageObject.getId() < xnVar.K4) {
                    xnVar.K4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            xnVar.L4 = false;
            if (!xnVar.A4 && i11 != 0) {
                xnVar.A4 = true;
            }
        }
        if (i11 != 0) {
            xnVar.q9(1);
            xnVar.U0.getClass();
            xnVar.h9(true);
        }
        if (i11 != 0 && xnVar.g3 && !xnVar.c3) {
            if (xnVar.I7 != Integer.MAX_VALUE) {
                xnVar.Ia();
                xnVar.Wc(false);
            }
            xnVar.Fb(true);
        }
        if (xnVar.t9() && i11 != 0 && xnVar.h3 && !xnVar.c3) {
            if (xnVar.I7 != Integer.MAX_VALUE) {
                xnVar.Ia();
                xnVar.Wc(false);
            }
            xnVar.Gb(true);
        }
        xnVar.a7(true);
        if (L0 != -1) {
            xnVar.x0.h();
            if (L0 != 0 || !xnVar.B6[0]) {
                s5.m[] mVarArr = xnVar.g1.e;
                s5.m mVar = 1 < mVarArr.length ? mVarArr[1] : null;
                boolean z11 = mVar != null && ((xd.a) mVar.c).f;
                int i12 = this.c;
                if (i11 > 0) {
                    if (!z11) {
                        float f10 = this.a + i11;
                        this.a = f10;
                        if (f10 > i12) {
                            this.a = 0.0f;
                            xnVar.d9 = true;
                            xnVar.vc();
                            xnVar.h1 = true;
                        }
                    }
                } else if (xnVar.h1 && z11) {
                    float f11 = this.a + i11;
                    this.a = f11;
                    if (f11 < (-i12)) {
                        xnVar.d9 = false;
                        xnVar.vc();
                        this.a = 0.0f;
                    }
                }
            } else if (i11 >= 0) {
                xnVar.d9 = false;
                xnVar.vc();
            }
        }
        xnVar.r9();
        xnVar.Z8.H();
        ArrayList arrayList = xnVar.ua.C;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((az) arrayList.get(i13)).c) {
                ((az) arrayList.get(i13)).b -= i11;
            }
        }
        mg.m0 m0Var = mg.m0.B;
        if (m0Var != null) {
            m0Var.r -= i11;
            if (i11 != 0) {
                m0Var.u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (eVar = xnVar2.C) != null) {
            eVar.f(i10, i11);
        }
        xnVar.i7(false);
        ph.f3 f3Var = xnVar.u1;
        if (f3Var != null) {
            if (f3Var.S) {
                f3Var.e(true);
            } else if (!xnVar.Sb) {
                xnVar.Rb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new ng(xnVar, 28));
                AndroidUtilities.runOnUIThread(new ng(xnVar, 29), 2000L);
            }
        }
        vl vlVar = xnVar.y1;
        if (vlVar != null && vlVar.S) {
            vlVar.e(true);
        }
        ph.f3 f3Var2 = xnVar.w1;
        if (f3Var2 == null || !f3Var2.S) {
            AndroidUtilities.cancelRunOnUIThread(new wj(xnVar, 0));
            AndroidUtilities.runOnUIThread(new wj(xnVar, 1), 2000L);
        } else {
            f3Var2.e(true);
        }
        ph.f3 f3Var3 = xnVar.x1;
        if (f3Var3 != null) {
            f3Var3.e(true);
        }
        jk jkVar = xnVar.V;
        if (jkVar != null) {
            jkVar.l0();
        }
        lh.l5 l5Var = xnVar.nc;
        if (l5Var != null) {
            l5Var.invalidate();
        }
        ug.a aVar = xnVar.Nb;
        if (aVar == null || aVar.b <= 0) {
            return;
        }
        int childCount = aVar.a.getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount) {
                z10 = false;
                break;
            }
            View childAt = aVar.a.getChildAt(i14);
            if (childAt instanceof org.telegram.ui.Cells.t1 ? aVar.a(((org.telegram.ui.Cells.t1) childAt).getMessageObject()) : childAt instanceof org.telegram.ui.Cells.v0 ? aVar.a(((org.telegram.ui.Cells.v0) childAt).getMessageObject()) : false) {
                break;
            } else {
                i14++;
            }
        }
        if (z10) {
            return;
        }
        aVar.c(0, 0L);
    }
}
