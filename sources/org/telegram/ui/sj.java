package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sj extends f2.a1 {
    public boolean b;
    public final /* synthetic */ tn d;
    public float a = 0.0f;
    public final int c = AndroidUtilities.dp(100.0f);

    public sj(tn tnVar) {
        this.d = tnVar;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        tn tnVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.s1 s1Var = tnVar.l2;
            if (s1Var != null) {
                tnVar.j2.e(s1Var, -1, tnVar.m2, tnVar.n2, true);
                tnVar.l2 = null;
            }
            tnVar.f3 = false;
            tnVar.g3 = false;
            tnVar.h3 = false;
            tnVar.i3 = false;
            tnVar.f9(true);
            tnVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = tn.Dc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            tnVar.t0.setOverScrollMode(0);
            tnVar.Y8.W();
            tnVar.Wc(false);
            tnVar.q9(1);
            tnVar.oa = false;
            return;
        }
        nh.t3 t3Var = tnVar.u1;
        if (t3Var != null && t3Var.R) {
            t3Var.e(true);
        }
        org.telegram.ui.Components.o6 o6Var = tnVar.S2;
        if (o6Var != null && o6Var.getVisibility() == 0 && tnVar.x9()) {
            AndroidUtilities.hideKeyboard(tnVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            tnVar.z4 = true;
            tnVar.h3 = true;
        } else if (i10 == 1) {
            tnVar.l2 = null;
            tnVar.z4 = true;
            tnVar.f3 = true;
            tnVar.g3 = true;
            tnVar.i3 = true;
            tnVar.h3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = tn.Dc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        kg.v vVar = tnVar.U9;
        if (vVar == null || !vVar.d()) {
            return;
        }
        tnVar.U9.setHiddenByScroll(true);
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        lg.e eVar;
        boolean z10;
        tn tnVar = this.d;
        tn tnVar2 = tnVar.Z9;
        if (tnVar2 == null) {
            tnVar2 = tnVar;
        }
        tnVar.t0.invalidate();
        boolean z11 = true;
        this.b = i11 < 0;
        int L0 = tnVar.v0.L0();
        if (((i11 != 0 && tnVar.oa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && tnVar.J4 != 0) {
            if (!this.b || tnVar.K4) {
                tnVar.J4 = 0;
            } else if (!tnVar.t0.T1 && L0 != -1) {
                int N0 = tnVar.v0.N0();
                MessageObject messageObject = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = tnVar.v0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.s1) {
                        messageObject = ((org.telegram.ui.Cells.s1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.v0) {
                        messageObject = ((org.telegram.ui.Cells.v0) m10).getMessageObject();
                    }
                    if (messageObject != null && tnVar.J4 == messageObject.getId()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && messageObject != null && messageObject.getId() < tnVar.J4) {
                    tnVar.J4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            tnVar.K4 = false;
            if (!tnVar.z4 && i11 != 0) {
                tnVar.z4 = true;
            }
        }
        if (i11 != 0) {
            tnVar.q9(1);
            tnVar.T0.getClass();
            tnVar.h9(true);
        }
        if (i11 != 0 && tnVar.f3 && !tnVar.b3) {
            if (tnVar.H7 != Integer.MAX_VALUE) {
                tnVar.Ia();
                tnVar.Wc(false);
            }
            tnVar.Fb(true);
        }
        if (tnVar.t9() && i11 != 0 && tnVar.g3 && !tnVar.b3) {
            if (tnVar.H7 != Integer.MAX_VALUE) {
                tnVar.Ia();
                tnVar.Wc(false);
            }
            tnVar.Gb(true);
        }
        tnVar.a7(true);
        if (L0 != -1) {
            tnVar.w0.h();
            if (L0 != 0 || !tnVar.A6[0]) {
                l3.g0[] g0VarArr = tnVar.f1.e;
                l3.g0 g0Var = 1 < g0VarArr.length ? g0VarArr[1] : null;
                boolean z12 = g0Var != null && ((vd.a) g0Var.c).f;
                int i12 = this.c;
                if (i11 > 0) {
                    if (!z12) {
                        float f9 = this.a + i11;
                        this.a = f9;
                        if (f9 > i12) {
                            this.a = 0.0f;
                            tnVar.c9 = true;
                            tnVar.vc();
                            tnVar.g1 = true;
                        }
                    }
                } else if (tnVar.g1 && z12) {
                    float f10 = this.a + i11;
                    this.a = f10;
                    if (f10 < (-i12)) {
                        tnVar.c9 = false;
                        tnVar.vc();
                        this.a = 0.0f;
                    }
                }
            } else if (i11 >= 0) {
                tnVar.c9 = false;
                tnVar.vc();
            }
        }
        tnVar.r9();
        tnVar.Y8.H();
        ArrayList arrayList = tnVar.ta.B;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((qy) arrayList.get(i13)).c) {
                ((qy) arrayList.get(i13)).b -= i11;
            }
        }
        kg.m0 m0Var = kg.m0.B;
        if (m0Var != null) {
            m0Var.r -= i11;
            if (i11 != 0) {
                m0Var.u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (eVar = tnVar2.B) != null) {
            eVar.f(i10, i11);
        }
        tnVar.i7(false);
        nh.t3 t3Var = tnVar.t1;
        if (t3Var != null) {
            if (t3Var.R) {
                t3Var.e(true);
            } else if (!tnVar.Rb) {
                tnVar.Qb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new ig(tnVar, 28));
                AndroidUtilities.runOnUIThread(new ig(tnVar, 29), 2000L);
            }
        }
        pl plVar = tnVar.x1;
        if (plVar != null && plVar.R) {
            plVar.e(true);
        }
        nh.t3 t3Var2 = tnVar.v1;
        if (t3Var2 == null || !t3Var2.R) {
            AndroidUtilities.cancelRunOnUIThread(new rj(tnVar, 0));
            AndroidUtilities.runOnUIThread(new rj(tnVar, 1), 2000L);
        } else {
            t3Var2.e(true);
        }
        nh.t3 t3Var3 = tnVar.w1;
        if (t3Var3 != null) {
            t3Var3.e(true);
        }
        dk dkVar = tnVar.U;
        if (dkVar != null) {
            dkVar.l0();
        }
        jh.m5 m5Var = tnVar.mc;
        if (m5Var != null) {
            m5Var.invalidate();
        }
        sg.a aVar = tnVar.Mb;
        if (aVar == null || aVar.b <= 0) {
            return;
        }
        int childCount = aVar.a.getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount) {
                z11 = false;
                break;
            }
            View childAt = aVar.a.getChildAt(i14);
            if (childAt instanceof org.telegram.ui.Cells.s1 ? aVar.a(((org.telegram.ui.Cells.s1) childAt).getMessageObject()) : childAt instanceof org.telegram.ui.Cells.v0 ? aVar.a(((org.telegram.ui.Cells.v0) childAt).getMessageObject()) : false) {
                break;
            } else {
                i14++;
            }
        }
        if (z11) {
            return;
        }
        aVar.c(0, 0L);
    }
}
