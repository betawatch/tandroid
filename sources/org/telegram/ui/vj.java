package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class vj extends s4.u0 {
    public boolean b;
    public final /* synthetic */ un d;
    public float a = 0.0f;
    public final int c = AndroidUtilities.dp(100.0f);

    public vj(un unVar) {
        this.d = unVar;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        un unVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.s1 s1Var = unVar.B2;
            if (s1Var != null) {
                unVar.z2.e(s1Var, -1, unVar.C2, unVar.D2, true);
                unVar.B2 = null;
            }
            unVar.v3 = false;
            unVar.w3 = false;
            unVar.x3 = false;
            unVar.y3 = false;
            unVar.p9(true);
            unVar.q9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = un.bd;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            unVar.x0.setOverScrollMode(0);
            unVar.o9.V();
            unVar.jd(false);
            unVar.Ea = false;
            return;
        }
        fi.v3 v3Var = unVar.K1;
        if (v3Var != null && v3Var.V) {
            v3Var.e(true);
        }
        org.telegram.ui.Components.s6 s6Var = unVar.i3;
        if (s6Var != null && s6Var.getVisibility() == 0 && unVar.F9()) {
            AndroidUtilities.hideKeyboard(unVar.getParentActivity().getCurrentFocus());
        }
        unVar.lb = 0;
        unVar.mb = TLObject.FLAG_31;
        if (i10 == 2) {
            unVar.P4 = true;
            unVar.x3 = true;
        } else if (i10 == 1) {
            unVar.B2 = null;
            unVar.P4 = true;
            unVar.v3 = true;
            unVar.w3 = true;
            unVar.y3 = true;
            unVar.x3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = un.bd;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        bh.x xVar = unVar.ka;
        if (xVar == null || !xVar.d()) {
            return;
        }
        unVar.ka.setHiddenByScroll(true);
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        un unVar = this.d;
        unVar.x0.invalidate();
        boolean z11 = true;
        this.b = i11 < 0;
        int L0 = unVar.z0.L0();
        if (((i11 != 0 && unVar.Ea && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && unVar.Z4 != 0) {
            if (!this.b || unVar.a5) {
                unVar.Z4 = 0;
            } else if (!unVar.x0.V1 && L0 != -1) {
                int N0 = unVar.z0.N0();
                MessageObject messageObject = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = unVar.z0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.s1) {
                        messageObject = ((org.telegram.ui.Cells.s1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.v0) {
                        messageObject = ((org.telegram.ui.Cells.v0) m10).getMessageObject();
                    }
                    if (messageObject != null && unVar.Z4 == messageObject.getId()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && messageObject != null && messageObject.getId() < unVar.Z4) {
                    unVar.Z4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            unVar.a5 = false;
            if (!unVar.P4 && i11 != 0) {
                unVar.P4 = true;
            }
        }
        if (i11 != 0) {
            unVar.j1.getClass();
            unVar.r9(true);
        }
        if (i11 != 0 && unVar.v3 && !unVar.r3) {
            if (unVar.X7 != Integer.MAX_VALUE) {
                unVar.Ra();
                unVar.jd(false);
            }
            unVar.Rb(true);
        }
        if (unVar.B9() && i11 != 0 && unVar.w3 && !unVar.r3) {
            if (unVar.X7 != Integer.MAX_VALUE) {
                unVar.Ra();
                unVar.jd(false);
            }
            unVar.Sb(true);
        }
        unVar.h7(true);
        if (L0 != -1) {
            unVar.A0.h();
            if (L0 != 0 || !unVar.Q6[0]) {
                k6.c[] cVarArr = unVar.v1.e;
                k6.c cVar = 1 < cVarArr.length ? cVarArr[1] : null;
                boolean z12 = cVar != null && ((oe.b) cVar.c).f;
                int i12 = this.c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.a + i11;
                        this.a = f7;
                        if (f7 > i12) {
                            this.a = 0.0f;
                            unVar.s9 = true;
                            unVar.Ic();
                            unVar.w1 = true;
                        }
                    }
                } else if (unVar.w1 && z12) {
                    float f10 = this.a + i11;
                    this.a = f10;
                    if (f10 < (-i12)) {
                        unVar.s9 = false;
                        unVar.Ic();
                        this.a = 0.0f;
                    }
                }
            } else if (i11 >= 0) {
                unVar.s9 = false;
                unVar.Ic();
            }
        }
        unVar.z9();
        unVar.o9.G();
        ArrayList arrayList = unVar.Ja.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((ny) arrayList.get(i13)).c) {
                ((ny) arrayList.get(i13)).b -= i11;
            }
        }
        bh.s0 s0Var = bh.s0.B;
        if (s0Var != null) {
            s0Var.r -= i11;
            if (i11 != 0) {
                s0Var.u = true;
            }
        }
        unVar.p7(false);
        fi.v3 v3Var = unVar.J1;
        if (v3Var != null) {
            if (v3Var.V) {
                v3Var.e(true);
            } else if (!unVar.rc) {
                unVar.qc = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new uj(unVar, 0));
                AndroidUtilities.runOnUIThread(new uj(unVar, 1), 2000L);
            }
        }
        rl rlVar = unVar.N1;
        if (rlVar != null && rlVar.V) {
            rlVar.e(true);
        }
        fi.v3 v3Var2 = unVar.L1;
        if (v3Var2 == null || !v3Var2.V) {
            AndroidUtilities.cancelRunOnUIThread(new uj(unVar, 2));
            AndroidUtilities.runOnUIThread(new uj(unVar, 3), 2000L);
        } else {
            v3Var2.e(true);
        }
        fi.v3 v3Var3 = unVar.M1;
        if (v3Var3 != null) {
            v3Var3.e(true);
        }
        hk hkVar = unVar.Y;
        if (hkVar != null) {
            hkVar.i0();
        }
        bi.m7 m7Var = unVar.Mc;
        if (m7Var != null) {
            m7Var.invalidate();
        }
        jh.a aVar = unVar.mc;
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
