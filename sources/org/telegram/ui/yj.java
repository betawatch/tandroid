package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class yj extends s4.s0 {
    public boolean b;
    public final /* synthetic */ yn d;
    public float a = 0.0f;
    public final int c = AndroidUtilities.dp(100.0f);

    public yj(yn ynVar) {
        this.d = ynVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        yn ynVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.u1 u1Var = ynVar.n2;
            if (u1Var != null) {
                ynVar.l2.e(u1Var, -1, ynVar.o2, ynVar.p2, true);
                ynVar.n2 = null;
            }
            ynVar.h3 = false;
            ynVar.i3 = false;
            ynVar.j3 = false;
            ynVar.k3 = false;
            ynVar.g9(true);
            ynVar.h9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = yn.Bc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            ynVar.v0.setOverScrollMode(0);
            ynVar.a9.W();
            ynVar.Vc(false);
            ynVar.qa = false;
            return;
        }
        ci.e4 e4Var = ynVar.w1;
        if (e4Var != null && e4Var.V) {
            e4Var.e(true);
        }
        org.telegram.ui.Components.p6 p6Var = ynVar.U2;
        if (p6Var != null && p6Var.getVisibility() == 0 && ynVar.w9()) {
            AndroidUtilities.hideKeyboard(ynVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            ynVar.B4 = true;
            ynVar.j3 = true;
        } else if (i10 == 1) {
            ynVar.n2 = null;
            ynVar.B4 = true;
            ynVar.h3 = true;
            ynVar.i3 = true;
            ynVar.k3 = true;
            ynVar.j3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = yn.Bc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        zg.r rVar = ynVar.W9;
        if (rVar == null || !rVar.d()) {
            return;
        }
        ynVar.W9.setHiddenByScroll(true);
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        yn ynVar = this.d;
        ynVar.v0.invalidate();
        boolean z11 = true;
        this.b = i11 < 0;
        int L0 = ynVar.x0.L0();
        if (((i11 != 0 && ynVar.qa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && ynVar.L4 != 0) {
            if (!this.b || ynVar.M4) {
                ynVar.L4 = 0;
            } else if (!ynVar.v0.X1 && L0 != -1) {
                int N0 = ynVar.x0.N0();
                MessageObject messageObject = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = ynVar.x0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.u1) {
                        messageObject = ((org.telegram.ui.Cells.u1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                        messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                    }
                    if (messageObject != null && ynVar.L4 == messageObject.getId()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && messageObject != null && messageObject.getId() < ynVar.L4) {
                    ynVar.L4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            ynVar.M4 = false;
            if (!ynVar.B4 && i11 != 0) {
                ynVar.B4 = true;
            }
        }
        if (i11 != 0) {
            ynVar.V0.getClass();
            ynVar.i9(true);
        }
        if (i11 != 0 && ynVar.h3 && !ynVar.d3) {
            if (ynVar.J7 != Integer.MAX_VALUE) {
                ynVar.Ha();
                ynVar.Vc(false);
            }
            ynVar.Eb(true);
        }
        if (ynVar.s9() && i11 != 0 && ynVar.i3 && !ynVar.d3) {
            if (ynVar.J7 != Integer.MAX_VALUE) {
                ynVar.Ha();
                ynVar.Vc(false);
            }
            ynVar.Fb(true);
        }
        ynVar.a7(true);
        if (L0 != -1) {
            ynVar.y0.h();
            if (L0 != 0 || !ynVar.C6[0]) {
                aa.a[] aVarArr = ynVar.h1.e;
                aa.a aVar = 1 < aVarArr.length ? aVarArr[1] : null;
                boolean z12 = aVar != null && ((le.b) aVar.c).f;
                int i12 = this.c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.a + i11;
                        this.a = f7;
                        if (f7 > i12) {
                            this.a = 0.0f;
                            ynVar.e9 = true;
                            ynVar.uc();
                            ynVar.i1 = true;
                        }
                    }
                } else if (ynVar.i1 && z12) {
                    float f10 = this.a + i11;
                    this.a = f10;
                    if (f10 < (-i12)) {
                        ynVar.e9 = false;
                        ynVar.uc();
                        this.a = 0.0f;
                    }
                }
            } else if (i11 >= 0) {
                ynVar.e9 = false;
                ynVar.uc();
            }
        }
        ynVar.q9();
        ynVar.a9.H();
        ArrayList arrayList = ynVar.va.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((fz) arrayList.get(i13)).c) {
                ((fz) arrayList.get(i13)).b -= i11;
            }
        }
        zg.i0 i0Var = zg.i0.B;
        if (i0Var != null) {
            i0Var.r -= i11;
            if (i11 != 0) {
                i0Var.u = true;
            }
        }
        ynVar.i7(false);
        ci.e4 e4Var = ynVar.v1;
        if (e4Var != null) {
            if (e4Var.V) {
                e4Var.e(true);
            } else if (!ynVar.Sb) {
                ynVar.Rb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new ug(ynVar, 25));
                AndroidUtilities.runOnUIThread(new ug(ynVar, 26), 2000L);
            }
        }
        ul ulVar = ynVar.z1;
        if (ulVar != null && ulVar.V) {
            ulVar.e(true);
        }
        ci.e4 e4Var2 = ynVar.x1;
        if (e4Var2 == null || !e4Var2.V) {
            AndroidUtilities.cancelRunOnUIThread(new ug(ynVar, 27));
            AndroidUtilities.runOnUIThread(new ug(ynVar, 28), 2000L);
        } else {
            e4Var2.e(true);
        }
        ci.e4 e4Var3 = ynVar.y1;
        if (e4Var3 != null) {
            e4Var3.e(true);
        }
        jk jkVar = ynVar.W;
        if (jkVar != null) {
            jkVar.l0();
        }
        yh.c4 c4Var = ynVar.nc;
        if (c4Var != null) {
            c4Var.invalidate();
        }
        hh.a aVar2 = ynVar.Nb;
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
            if (childAt instanceof org.telegram.ui.Cells.u1 ? aVar2.a(((org.telegram.ui.Cells.u1) childAt).getMessageObject()) : childAt instanceof org.telegram.ui.Cells.w0 ? aVar2.a(((org.telegram.ui.Cells.w0) childAt).getMessageObject()) : false) {
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
