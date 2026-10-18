package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class wj extends s4.r0 {
    public boolean b;
    public final /* synthetic */ sn d;
    public float a = 0.0f;
    public final int c = AndroidUtilities.dp(100.0f);

    public wj(sn snVar) {
        this.d = snVar;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        sn snVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.u1 u1Var = snVar.p2;
            if (u1Var != null) {
                snVar.n2.e(u1Var, -1, snVar.q2, snVar.r2, true);
                snVar.p2 = null;
            }
            snVar.j3 = false;
            snVar.k3 = false;
            snVar.l3 = false;
            snVar.m3 = false;
            snVar.k9(true);
            snVar.l9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = sn.Hc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            snVar.x0.setOverScrollMode(0);
            snVar.c9.V();
            snVar.ad(false);
            snVar.v9(1);
            snVar.sa = false;
            return;
        }
        ei.x3 x3Var = snVar.y1;
        if (x3Var != null && x3Var.V) {
            x3Var.e(true);
        }
        org.telegram.ui.Components.q6 q6Var = snVar.W2;
        if (q6Var != null && q6Var.getVisibility() == 0 && snVar.C9()) {
            AndroidUtilities.hideKeyboard(snVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            snVar.D4 = true;
            snVar.l3 = true;
        } else if (i10 == 1) {
            snVar.p2 = null;
            snVar.D4 = true;
            snVar.j3 = true;
            snVar.k3 = true;
            snVar.m3 = true;
            snVar.l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = sn.Hc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        ah.f0 f0Var = snVar.Y9;
        if (f0Var == null || !f0Var.d()) {
            return;
        }
        snVar.Y9.setHiddenByScroll(true);
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        boolean z10;
        sn snVar = this.d;
        sn snVar2 = snVar.da;
        if (snVar2 == null) {
            snVar2 = snVar;
        }
        snVar.x0.invalidate();
        boolean z11 = true;
        this.b = i11 < 0;
        int L0 = snVar.z0.L0();
        if (((i11 != 0 && snVar.sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && snVar.N4 != 0) {
            if (!this.b || snVar.O4) {
                snVar.N4 = 0;
            } else if (!snVar.x0.V1 && L0 != -1) {
                int N0 = snVar.z0.N0();
                MessageObject messageObject = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = snVar.z0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.u1) {
                        messageObject = ((org.telegram.ui.Cells.u1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                        messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                    }
                    if (messageObject != null && snVar.N4 == messageObject.getId()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && messageObject != null && messageObject.getId() < snVar.N4) {
                    snVar.N4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            snVar.O4 = false;
            if (!snVar.D4 && i11 != 0) {
                snVar.D4 = true;
            }
        }
        if (i11 != 0) {
            snVar.v9(1);
            snVar.X0.getClass();
            snVar.m9(true);
        }
        if (i11 != 0 && snVar.j3 && !snVar.f3) {
            if (snVar.L7 != Integer.MAX_VALUE) {
                snVar.Ma();
                snVar.ad(false);
            }
            snVar.Jb(true);
        }
        if (snVar.y9() && i11 != 0 && snVar.k3 && !snVar.f3) {
            if (snVar.L7 != Integer.MAX_VALUE) {
                snVar.Ma();
                snVar.ad(false);
            }
            snVar.Kb(true);
        }
        snVar.d7(true);
        if (L0 != -1) {
            snVar.A0.h();
            if (L0 != 0 || !snVar.E6[0]) {
                androidx.biometric.e[] eVarArr = snVar.j1.e;
                androidx.biometric.e eVar = 1 < eVarArr.length ? eVarArr[1] : null;
                boolean z12 = eVar != null && ((ne.b) eVar.c).f;
                int i12 = this.c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.a + i11;
                        this.a = f7;
                        if (f7 > i12) {
                            this.a = 0.0f;
                            snVar.g9 = true;
                            snVar.zc();
                            snVar.k1 = true;
                        }
                    }
                } else if (snVar.k1 && z12) {
                    float f10 = this.a + i11;
                    this.a = f10;
                    if (f10 < (-i12)) {
                        snVar.g9 = false;
                        snVar.zc();
                        this.a = 0.0f;
                    }
                }
            } else if (i11 >= 0) {
                snVar.g9 = false;
                snVar.zc();
            }
        }
        snVar.w9();
        snVar.c9.G();
        ArrayList arrayList = snVar.xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((py) arrayList.get(i13)).c) {
                ((py) arrayList.get(i13)).b -= i11;
            }
        }
        ah.d1 d1Var = ah.d1.B;
        if (d1Var != null) {
            d1Var.r -= i11;
            if (i11 != 0) {
                d1Var.u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = snVar2.F) != null) {
            fVar.f(i10, i11);
        }
        snVar.l7(false);
        ei.x3 x3Var = snVar.x1;
        if (x3Var != null) {
            if (x3Var.V) {
                x3Var.e(true);
            } else if (!snVar.Vb) {
                snVar.Ub = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new mg(snVar, 29));
                AndroidUtilities.runOnUIThread(new vj(snVar, 0), 2000L);
            }
        }
        rl rlVar = snVar.B1;
        if (rlVar != null && rlVar.V) {
            rlVar.e(true);
        }
        ei.x3 x3Var2 = snVar.z1;
        if (x3Var2 == null || !x3Var2.V) {
            AndroidUtilities.cancelRunOnUIThread(new vj(snVar, 1));
            AndroidUtilities.runOnUIThread(new vj(snVar, 2), 2000L);
        } else {
            x3Var2.e(true);
        }
        ei.x3 x3Var3 = snVar.A1;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        hk hkVar = snVar.Y;
        if (hkVar != null) {
            hkVar.j0();
        }
        ai.p7 p7Var = snVar.qc;
        if (p7Var != null) {
            p7Var.invalidate();
        }
        ih.a aVar = snVar.Qb;
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
