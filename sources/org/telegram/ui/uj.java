package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class uj extends s4.r0 {
    public boolean b;
    public final /* synthetic */ sn d;
    public float a = 0.0f;
    public final int c = AndroidUtilities.dp(100.0f);

    public uj(sn snVar) {
        this.d = snVar;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        sn snVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.t1 t1Var = snVar.B2;
            if (t1Var != null) {
                snVar.z2.e(t1Var, -1, snVar.C2, snVar.D2, true);
                snVar.B2 = null;
            }
            snVar.v3 = false;
            snVar.w3 = false;
            snVar.x3 = false;
            snVar.y3 = false;
            snVar.k9(true);
            snVar.l9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = sn.Vc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            snVar.x0.setOverScrollMode(0);
            snVar.o9.V();
            snVar.dd(false);
            snVar.v9(1);
            snVar.Ea = false;
            return;
        }
        ei.x3 x3Var = snVar.K1;
        if (x3Var != null && x3Var.V) {
            x3Var.e(true);
        }
        org.telegram.ui.Components.q6 q6Var = snVar.i3;
        if (q6Var != null && q6Var.getVisibility() == 0 && snVar.C9()) {
            AndroidUtilities.hideKeyboard(snVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            snVar.P4 = true;
            snVar.x3 = true;
        } else if (i10 == 1) {
            snVar.B2 = null;
            snVar.P4 = true;
            snVar.v3 = true;
            snVar.w3 = true;
            snVar.y3 = true;
            snVar.x3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = sn.Vc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        ah.f0 f0Var = snVar.ka;
        if (f0Var == null || !f0Var.d()) {
            return;
        }
        snVar.ka.setHiddenByScroll(true);
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        boolean z10;
        sn snVar = this.d;
        sn snVar2 = snVar.pa;
        if (snVar2 == null) {
            snVar2 = snVar;
        }
        snVar.x0.invalidate();
        boolean z11 = true;
        this.b = i11 < 0;
        int L0 = snVar.z0.L0();
        if (((i11 != 0 && snVar.Ea && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && snVar.Z4 != 0) {
            if (!this.b || snVar.a5) {
                snVar.Z4 = 0;
            } else if (!snVar.x0.V1 && L0 != -1) {
                int N0 = snVar.z0.N0();
                MessageObject messageObject = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = snVar.z0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.t1) {
                        messageObject = ((org.telegram.ui.Cells.t1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.v0) {
                        messageObject = ((org.telegram.ui.Cells.v0) m10).getMessageObject();
                    }
                    if (messageObject != null && snVar.Z4 == messageObject.getId()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && messageObject != null && messageObject.getId() < snVar.Z4) {
                    snVar.Z4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            snVar.a5 = false;
            if (!snVar.P4 && i11 != 0) {
                snVar.P4 = true;
            }
        }
        if (i11 != 0) {
            snVar.v9(1);
            snVar.j1.getClass();
            snVar.m9(true);
        }
        if (i11 != 0 && snVar.v3 && !snVar.r3) {
            if (snVar.X7 != Integer.MAX_VALUE) {
                snVar.Ma();
                snVar.dd(false);
            }
            snVar.Lb(true);
        }
        if (snVar.y9() && i11 != 0 && snVar.w3 && !snVar.r3) {
            if (snVar.X7 != Integer.MAX_VALUE) {
                snVar.Ma();
                snVar.dd(false);
            }
            snVar.Mb(true);
        }
        snVar.d7(true);
        if (L0 != -1) {
            snVar.A0.h();
            if (L0 != 0 || !snVar.Q6[0]) {
                androidx.biometric.e[] eVarArr = snVar.v1.e;
                androidx.biometric.e eVar = 1 < eVarArr.length ? eVarArr[1] : null;
                boolean z12 = eVar != null && ((ne.b) eVar.c).f;
                int i12 = this.c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.a + i11;
                        this.a = f7;
                        if (f7 > i12) {
                            this.a = 0.0f;
                            snVar.s9 = true;
                            snVar.Cc();
                            snVar.w1 = true;
                        }
                    }
                } else if (snVar.w1 && z12) {
                    float f10 = this.a + i11;
                    this.a = f10;
                    if (f10 < (-i12)) {
                        snVar.s9 = false;
                        snVar.Cc();
                        this.a = 0.0f;
                    }
                }
            } else if (i11 >= 0) {
                snVar.s9 = false;
                snVar.Cc();
            }
        }
        snVar.w9();
        snVar.o9.G();
        ArrayList arrayList = snVar.Ja.F;
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
        ei.x3 x3Var = snVar.J1;
        if (x3Var != null) {
            if (x3Var.V) {
                x3Var.e(true);
            } else if (!snVar.ic) {
                snVar.hc = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new kg(snVar, 29));
                AndroidUtilities.runOnUIThread(new tj(snVar, 0), 2000L);
            }
        }
        ql qlVar = snVar.N1;
        if (qlVar != null && qlVar.V) {
            qlVar.e(true);
        }
        ei.x3 x3Var2 = snVar.L1;
        if (x3Var2 == null || !x3Var2.V) {
            AndroidUtilities.cancelRunOnUIThread(new tj(snVar, 1));
            AndroidUtilities.runOnUIThread(new tj(snVar, 2), 2000L);
        } else {
            x3Var2.e(true);
        }
        ei.x3 x3Var3 = snVar.M1;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        gk gkVar = snVar.Y;
        if (gkVar != null) {
            gkVar.i0();
        }
        ai.q7 q7Var = snVar.Dc;
        if (q7Var != null) {
            q7Var.invalidate();
        }
        ih.a aVar = snVar.dc;
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
            if (childAt instanceof org.telegram.ui.Cells.t1 ? aVar.a(((org.telegram.ui.Cells.t1) childAt).getMessageObject()) : childAt instanceof org.telegram.ui.Cells.v0 ? aVar.a(((org.telegram.ui.Cells.v0) childAt).getMessageObject()) : false) {
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
