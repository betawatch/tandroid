package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rj extends f2.b1 {
    public boolean b;
    public final /* synthetic */ rn d;
    public float a = 0.0f;
    public final int c = AndroidUtilities.dp(100.0f);

    public rj(rn rnVar) {
        this.d = rnVar;
    }

    @Override // f2.b1
    public final void a(RecyclerView recyclerView, int i10) {
        rn rnVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.s1 s1Var = rnVar.l2;
            if (s1Var != null) {
                rnVar.j2.e(s1Var, -1, rnVar.m2, rnVar.n2, true);
                rnVar.l2 = null;
            }
            rnVar.f3 = false;
            rnVar.g3 = false;
            rnVar.h3 = false;
            rnVar.i3 = false;
            rnVar.f9(true);
            rnVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = rn.Dc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            rnVar.t0.setOverScrollMode(0);
            rnVar.Y8.W();
            rnVar.Wc(false);
            rnVar.q9(1);
            rnVar.oa = false;
            return;
        }
        lh.w3 w3Var = rnVar.u1;
        if (w3Var != null && w3Var.R) {
            w3Var.e(true);
        }
        org.telegram.ui.Components.j6 j6Var = rnVar.S2;
        if (j6Var != null && j6Var.getVisibility() == 0 && rnVar.x9()) {
            AndroidUtilities.hideKeyboard(rnVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            rnVar.z4 = true;
            rnVar.h3 = true;
        } else if (i10 == 1) {
            rnVar.l2 = null;
            rnVar.z4 = true;
            rnVar.f3 = true;
            rnVar.g3 = true;
            rnVar.i3 = true;
            rnVar.h3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = rn.Dc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        ig.v vVar = rnVar.U9;
        if (vVar == null || !vVar.d()) {
            return;
        }
        rnVar.U9.setHiddenByScroll(true);
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jg.e eVar;
        boolean z10;
        rn rnVar = this.d;
        rn rnVar2 = rnVar.Z9;
        if (rnVar2 == null) {
            rnVar2 = rnVar;
        }
        rnVar.t0.invalidate();
        boolean z11 = true;
        this.b = i11 < 0;
        int L0 = rnVar.v0.L0();
        if (((i11 != 0 && rnVar.oa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && rnVar.J4 != 0) {
            if (!this.b || rnVar.K4) {
                rnVar.J4 = 0;
            } else if (!rnVar.t0.T1 && L0 != -1) {
                int N0 = rnVar.v0.N0();
                MessageObject messageObject = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = rnVar.v0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.s1) {
                        messageObject = ((org.telegram.ui.Cells.s1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.v0) {
                        messageObject = ((org.telegram.ui.Cells.v0) m10).getMessageObject();
                    }
                    if (messageObject != null && rnVar.J4 == messageObject.getId()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && messageObject != null && messageObject.getId() < rnVar.J4) {
                    rnVar.J4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            rnVar.K4 = false;
            if (!rnVar.z4 && i11 != 0) {
                rnVar.z4 = true;
            }
        }
        if (i11 != 0) {
            rnVar.q9(1);
            rnVar.T0.getClass();
            rnVar.h9(true);
        }
        if (i11 != 0 && rnVar.f3 && !rnVar.b3) {
            if (rnVar.H7 != Integer.MAX_VALUE) {
                rnVar.Ia();
                rnVar.Wc(false);
            }
            rnVar.Fb(true);
        }
        if (rnVar.t9() && i11 != 0 && rnVar.g3 && !rnVar.b3) {
            if (rnVar.H7 != Integer.MAX_VALUE) {
                rnVar.Ia();
                rnVar.Wc(false);
            }
            rnVar.Gb(true);
        }
        rnVar.a7(true);
        if (L0 != -1) {
            rnVar.w0.h();
            if (L0 != 0 || !rnVar.A6[0]) {
                j9.a[] aVarArr = rnVar.f1.e;
                j9.a aVar = 1 < aVarArr.length ? aVarArr[1] : null;
                boolean z12 = aVar != null && ((ud.a) aVar.c).f;
                int i12 = this.c;
                if (i11 > 0) {
                    if (!z12) {
                        float f10 = this.a + i11;
                        this.a = f10;
                        if (f10 > i12) {
                            this.a = 0.0f;
                            rnVar.c9 = true;
                            rnVar.vc();
                            rnVar.g1 = true;
                        }
                    }
                } else if (rnVar.g1 && z12) {
                    float f11 = this.a + i11;
                    this.a = f11;
                    if (f11 < (-i12)) {
                        rnVar.c9 = false;
                        rnVar.vc();
                        this.a = 0.0f;
                    }
                }
            } else if (i11 >= 0) {
                rnVar.c9 = false;
                rnVar.vc();
            }
        }
        rnVar.r9();
        rnVar.Y8.H();
        ArrayList arrayList = rnVar.ta.B;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((ry) arrayList.get(i13)).c) {
                ((ry) arrayList.get(i13)).b -= i11;
            }
        }
        ig.m0 m0Var = ig.m0.B;
        if (m0Var != null) {
            m0Var.r -= i11;
            if (i11 != 0) {
                m0Var.u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (eVar = rnVar2.B) != null) {
            eVar.f(i10, i11);
        }
        rnVar.i7(false);
        lh.w3 w3Var = rnVar.t1;
        if (w3Var != null) {
            if (w3Var.R) {
                w3Var.e(true);
            } else if (!rnVar.Rb) {
                rnVar.Qb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new lg(rnVar, 28));
                AndroidUtilities.runOnUIThread(new lg(rnVar, 29), 2000L);
            }
        }
        ol olVar = rnVar.x1;
        if (olVar != null && olVar.R) {
            olVar.e(true);
        }
        lh.w3 w3Var2 = rnVar.v1;
        if (w3Var2 == null || !w3Var2.R) {
            AndroidUtilities.cancelRunOnUIThread(new qj(rnVar, 0));
            AndroidUtilities.runOnUIThread(new qj(rnVar, 1), 2000L);
        } else {
            w3Var2.e(true);
        }
        lh.w3 w3Var3 = rnVar.w1;
        if (w3Var3 != null) {
            w3Var3.e(true);
        }
        ck ckVar = rnVar.U;
        if (ckVar != null) {
            ckVar.l0();
        }
        hh.o5 o5Var = rnVar.mc;
        if (o5Var != null) {
            o5Var.invalidate();
        }
        qg.a aVar2 = rnVar.Mb;
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
            if (childAt instanceof org.telegram.ui.Cells.s1 ? aVar2.a(((org.telegram.ui.Cells.s1) childAt).getMessageObject()) : childAt instanceof org.telegram.ui.Cells.v0 ? aVar2.a(((org.telegram.ui.Cells.v0) childAt).getMessageObject()) : false) {
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
