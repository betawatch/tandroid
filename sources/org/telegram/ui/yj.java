package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class yj extends s4.s0 {
    public boolean b;
    public final /* synthetic */ xn d;
    public float a = 0.0f;
    public final int c = AndroidUtilities.dp(100.0f);

    public yj(xn xnVar) {
        this.d = xnVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        xn xnVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.t1 t1Var = xnVar.p2;
            if (t1Var != null) {
                xnVar.n2.e(t1Var, -1, xnVar.q2, xnVar.r2, true);
                xnVar.p2 = null;
            }
            xnVar.j3 = false;
            xnVar.k3 = false;
            xnVar.l3 = false;
            xnVar.m3 = false;
            xnVar.f9(true);
            xnVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = xn.Gc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            xnVar.x0.setOverScrollMode(0);
            xnVar.c9.W();
            xnVar.Wc(false);
            xnVar.q9(1);
            xnVar.sa = false;
            return;
        }
        ci.e4 e4Var = xnVar.y1;
        if (e4Var != null && e4Var.V) {
            e4Var.e(true);
        }
        org.telegram.ui.Components.p6 p6Var = xnVar.W2;
        if (p6Var != null && p6Var.getVisibility() == 0 && xnVar.x9()) {
            AndroidUtilities.hideKeyboard(xnVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            xnVar.D4 = true;
            xnVar.l3 = true;
        } else if (i10 == 1) {
            xnVar.p2 = null;
            xnVar.D4 = true;
            xnVar.j3 = true;
            xnVar.k3 = true;
            xnVar.m3 = true;
            xnVar.l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = xn.Gc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        zg.t tVar = xnVar.Y9;
        if (tVar == null || !tVar.d()) {
            return;
        }
        xnVar.Y9.setHiddenByScroll(true);
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        boolean z10;
        xn xnVar = this.d;
        xn xnVar2 = xnVar.da;
        if (xnVar2 == null) {
            xnVar2 = xnVar;
        }
        xnVar.x0.invalidate();
        boolean z11 = true;
        this.b = i11 < 0;
        int L0 = xnVar.z0.L0();
        if (((i11 != 0 && xnVar.sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && xnVar.N4 != 0) {
            if (!this.b || xnVar.O4) {
                xnVar.N4 = 0;
            } else if (!xnVar.x0.X1 && L0 != -1) {
                int N0 = xnVar.z0.N0();
                MessageObject messageObject = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = xnVar.z0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.t1) {
                        messageObject = ((org.telegram.ui.Cells.t1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                        messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                    }
                    if (messageObject != null && xnVar.N4 == messageObject.getId()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && messageObject != null && messageObject.getId() < xnVar.N4) {
                    xnVar.N4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            xnVar.O4 = false;
            if (!xnVar.D4 && i11 != 0) {
                xnVar.D4 = true;
            }
        }
        if (i11 != 0) {
            xnVar.q9(1);
            xnVar.X0.getClass();
            xnVar.h9(true);
        }
        if (i11 != 0 && xnVar.j3 && !xnVar.f3) {
            if (xnVar.L7 != Integer.MAX_VALUE) {
                xnVar.Ia();
                xnVar.Wc(false);
            }
            xnVar.Fb(true);
        }
        if (xnVar.t9() && i11 != 0 && xnVar.k3 && !xnVar.f3) {
            if (xnVar.L7 != Integer.MAX_VALUE) {
                xnVar.Ia();
                xnVar.Wc(false);
            }
            xnVar.Gb(true);
        }
        xnVar.a7(true);
        if (L0 != -1) {
            xnVar.A0.h();
            if (L0 != 0 || !xnVar.E6[0]) {
                aa.a[] aVarArr = xnVar.j1.e;
                aa.a aVar = 1 < aVarArr.length ? aVarArr[1] : null;
                boolean z12 = aVar != null && ((le.c) aVar.c).f;
                int i12 = this.c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.a + i11;
                        this.a = f7;
                        if (f7 > i12) {
                            this.a = 0.0f;
                            xnVar.g9 = true;
                            xnVar.vc();
                            xnVar.k1 = true;
                        }
                    }
                } else if (xnVar.k1 && z12) {
                    float f10 = this.a + i11;
                    this.a = f10;
                    if (f10 < (-i12)) {
                        xnVar.g9 = false;
                        xnVar.vc();
                        this.a = 0.0f;
                    }
                }
            } else if (i11 >= 0) {
                xnVar.g9 = false;
                xnVar.vc();
            }
        }
        xnVar.r9();
        xnVar.c9.H();
        ArrayList arrayList = xnVar.xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((cz) arrayList.get(i13)).c) {
                ((cz) arrayList.get(i13)).b -= i11;
            }
        }
        zg.l0 l0Var = zg.l0.B;
        if (l0Var != null) {
            l0Var.r -= i11;
            if (i11 != 0) {
                l0Var.u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (hVar = xnVar2.F) != null) {
            hVar.f(i10, i11);
        }
        xnVar.i7(false);
        ci.e4 e4Var = xnVar.x1;
        if (e4Var != null) {
            if (e4Var.V) {
                e4Var.e(true);
            } else if (!xnVar.Ub) {
                xnVar.Tb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new sg(xnVar, 28));
                AndroidUtilities.runOnUIThread(new sg(xnVar, 29), 2000L);
            }
        }
        vl vlVar = xnVar.B1;
        if (vlVar != null && vlVar.V) {
            vlVar.e(true);
        }
        ci.e4 e4Var2 = xnVar.z1;
        if (e4Var2 == null || !e4Var2.V) {
            AndroidUtilities.cancelRunOnUIThread(new xj(xnVar, 0));
            AndroidUtilities.runOnUIThread(new xj(xnVar, 1), 2000L);
        } else {
            e4Var2.e(true);
        }
        ci.e4 e4Var3 = xnVar.A1;
        if (e4Var3 != null) {
            e4Var3.e(true);
        }
        jk jkVar = xnVar.Y;
        if (jkVar != null) {
            jkVar.m0();
        }
        yh.c4 c4Var = xnVar.pc;
        if (c4Var != null) {
            c4Var.invalidate();
        }
        hh.a aVar2 = xnVar.Pb;
        if (aVar2 == null || aVar2.b <= 0) {
            return;
        }
        int childCount = aVar2.a.getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount) {
                z11 = false;
                break;
            }
            View childAt = aVar2.a.getChildAt(i14);
            if (childAt instanceof org.telegram.ui.Cells.t1 ? aVar2.a(((org.telegram.ui.Cells.t1) childAt).getMessageObject()) : childAt instanceof org.telegram.ui.Cells.w0 ? aVar2.a(((org.telegram.ui.Cells.w0) childAt).getMessageObject()) : false) {
                break;
            } else {
                i14++;
            }
        }
        if (z11) {
            return;
        }
        aVar2.c(0, 0L);
    }
}
