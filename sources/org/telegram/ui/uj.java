package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class uj extends s4.r0 {
    public boolean b;
    public final /* synthetic */ qn d;
    public float a = 0.0f;
    public final int c = AndroidUtilities.dp(100.0f);

    public uj(qn qnVar) {
        this.d = qnVar;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        qn qnVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.u1 u1Var = qnVar.p2;
            if (u1Var != null) {
                qnVar.n2.e(u1Var, -1, qnVar.q2, qnVar.r2, true);
                qnVar.p2 = null;
            }
            qnVar.j3 = false;
            qnVar.k3 = false;
            qnVar.l3 = false;
            qnVar.m3 = false;
            qnVar.k9(true);
            qnVar.l9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = qn.Ic;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            qnVar.x0.setOverScrollMode(0);
            qnVar.c9.V();
            qnVar.bd(false);
            qnVar.v9(1);
            qnVar.sa = false;
            return;
        }
        ei.x3 x3Var = qnVar.y1;
        if (x3Var != null && x3Var.V) {
            x3Var.e(true);
        }
        org.telegram.ui.Components.q6 q6Var = qnVar.W2;
        if (q6Var != null && q6Var.getVisibility() == 0 && qnVar.C9()) {
            AndroidUtilities.hideKeyboard(qnVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            qnVar.D4 = true;
            qnVar.l3 = true;
        } else if (i10 == 1) {
            qnVar.p2 = null;
            qnVar.D4 = true;
            qnVar.j3 = true;
            qnVar.k3 = true;
            qnVar.m3 = true;
            qnVar.l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = qn.Ic;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        ah.f0 f0Var = qnVar.Y9;
        if (f0Var == null || !f0Var.d()) {
            return;
        }
        qnVar.Y9.setHiddenByScroll(true);
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        boolean z10;
        qn qnVar = this.d;
        qn qnVar2 = qnVar.da;
        if (qnVar2 == null) {
            qnVar2 = qnVar;
        }
        qnVar.x0.invalidate();
        boolean z11 = true;
        this.b = i11 < 0;
        int L0 = qnVar.z0.L0();
        if (((i11 != 0 && qnVar.sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && qnVar.N4 != 0) {
            if (!this.b || qnVar.O4) {
                qnVar.N4 = 0;
            } else if (!qnVar.x0.V1 && L0 != -1) {
                int N0 = qnVar.z0.N0();
                MessageObject messageObject = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = qnVar.z0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.u1) {
                        messageObject = ((org.telegram.ui.Cells.u1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                        messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                    }
                    if (messageObject != null && qnVar.N4 == messageObject.getId()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && messageObject != null && messageObject.getId() < qnVar.N4) {
                    qnVar.N4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            qnVar.O4 = false;
            if (!qnVar.D4 && i11 != 0) {
                qnVar.D4 = true;
            }
        }
        if (i11 != 0) {
            qnVar.v9(1);
            qnVar.X0.getClass();
            qnVar.m9(true);
        }
        if (i11 != 0 && qnVar.j3 && !qnVar.f3) {
            if (qnVar.L7 != Integer.MAX_VALUE) {
                qnVar.Ma();
                qnVar.bd(false);
            }
            qnVar.Kb(true);
        }
        if (qnVar.y9() && i11 != 0 && qnVar.k3 && !qnVar.f3) {
            if (qnVar.L7 != Integer.MAX_VALUE) {
                qnVar.Ma();
                qnVar.bd(false);
            }
            qnVar.Lb(true);
        }
        qnVar.d7(true);
        if (L0 != -1) {
            qnVar.A0.h();
            if (L0 != 0 || !qnVar.E6[0]) {
                androidx.biometric.e[] eVarArr = qnVar.j1.e;
                androidx.biometric.e eVar = 1 < eVarArr.length ? eVarArr[1] : null;
                boolean z12 = eVar != null && ((ne.b) eVar.c).f;
                int i12 = this.c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.a + i11;
                        this.a = f7;
                        if (f7 > i12) {
                            this.a = 0.0f;
                            qnVar.g9 = true;
                            qnVar.Ac();
                            qnVar.k1 = true;
                        }
                    }
                } else if (qnVar.k1 && z12) {
                    float f10 = this.a + i11;
                    this.a = f10;
                    if (f10 < (-i12)) {
                        qnVar.g9 = false;
                        qnVar.Ac();
                        this.a = 0.0f;
                    }
                }
            } else if (i11 >= 0) {
                qnVar.g9 = false;
                qnVar.Ac();
            }
        }
        qnVar.w9();
        qnVar.c9.G();
        ArrayList arrayList = qnVar.xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((ny) arrayList.get(i13)).c) {
                ((ny) arrayList.get(i13)).b -= i11;
            }
        }
        ah.d1 d1Var = ah.d1.B;
        if (d1Var != null) {
            d1Var.r -= i11;
            if (i11 != 0) {
                d1Var.u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = qnVar2.F) != null) {
            fVar.f(i10, i11);
        }
        qnVar.l7(false);
        ei.x3 x3Var = qnVar.x1;
        if (x3Var != null) {
            if (x3Var.V) {
                x3Var.e(true);
            } else if (!qnVar.Vb) {
                qnVar.Ub = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new kg(qnVar, 29));
                AndroidUtilities.runOnUIThread(new tj(qnVar, 0), 2000L);
            }
        }
        pl plVar = qnVar.B1;
        if (plVar != null && plVar.V) {
            plVar.e(true);
        }
        ei.x3 x3Var2 = qnVar.z1;
        if (x3Var2 == null || !x3Var2.V) {
            AndroidUtilities.cancelRunOnUIThread(new tj(qnVar, 1));
            AndroidUtilities.runOnUIThread(new tj(qnVar, 2), 2000L);
        } else {
            x3Var2.e(true);
        }
        ei.x3 x3Var3 = qnVar.A1;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        fk fkVar = qnVar.Y;
        if (fkVar != null) {
            fkVar.j0();
        }
        ai.q7 q7Var = qnVar.qc;
        if (q7Var != null) {
            q7Var.invalidate();
        }
        ih.a aVar = qnVar.Qb;
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
            if (childAt instanceof org.telegram.ui.Cells.u1 ? aVar.a(((org.telegram.ui.Cells.u1) childAt).getMessageObject()) : childAt instanceof org.telegram.ui.Cells.w0 ? aVar.a(((org.telegram.ui.Cells.w0) childAt).getMessageObject()) : false) {
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
