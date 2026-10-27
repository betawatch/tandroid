package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xj extends s4.u0 {
    public boolean b;
    public final /* synthetic */ wn d;
    public float a = 0.0f;
    public final int c = AndroidUtilities.dp(100.0f);

    public xj(wn wnVar) {
        this.d = wnVar;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        wn wnVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.s1 s1Var = wnVar.B2;
            if (s1Var != null) {
                wnVar.z2.e(s1Var, -1, wnVar.C2, wnVar.D2, true);
                wnVar.B2 = null;
            }
            wnVar.v3 = false;
            wnVar.w3 = false;
            wnVar.x3 = false;
            wnVar.y3 = false;
            wnVar.s9(true);
            wnVar.t9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = wn.fd;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            wnVar.x0.setOverScrollMode(0);
            wnVar.s9.V();
            wnVar.nd(false);
            wnVar.Ia = false;
            return;
        }
        fi.v3 v3Var = wnVar.K1;
        if (v3Var != null && v3Var.V) {
            v3Var.e(true);
        }
        org.telegram.ui.Components.s6 s6Var = wnVar.i3;
        if (s6Var != null && s6Var.getVisibility() == 0 && wnVar.I9()) {
            AndroidUtilities.hideKeyboard(wnVar.getParentActivity().getCurrentFocus());
        }
        wnVar.pb = 0;
        wnVar.qb = TLObject.FLAG_31;
        if (i10 == 2) {
            wnVar.P4 = true;
            wnVar.x3 = true;
        } else if (i10 == 1) {
            wnVar.B2 = null;
            wnVar.P4 = true;
            wnVar.v3 = true;
            wnVar.w3 = true;
            wnVar.y3 = true;
            wnVar.x3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = wn.fd;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        bh.x xVar = wnVar.oa;
        if (xVar == null || !xVar.d()) {
            return;
        }
        wnVar.oa.setHiddenByScroll(true);
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        wn wnVar = this.d;
        wnVar.x0.invalidate();
        boolean z11 = true;
        this.b = i11 < 0;
        int L0 = wnVar.z0.L0();
        if (((i11 != 0 && wnVar.Ia && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && wnVar.Z4 != 0) {
            if (!this.b || wnVar.a5) {
                wnVar.Z4 = 0;
            } else if (!wnVar.x0.V1 && L0 != -1) {
                int N0 = wnVar.z0.N0();
                MessageObject messageObject = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = wnVar.z0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.s1) {
                        messageObject = ((org.telegram.ui.Cells.s1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.v0) {
                        messageObject = ((org.telegram.ui.Cells.v0) m10).getMessageObject();
                    }
                    if (messageObject != null && wnVar.Z4 == messageObject.getId()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && messageObject != null && messageObject.getId() < wnVar.Z4) {
                    wnVar.Z4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            wnVar.a5 = false;
            if (!wnVar.P4 && i11 != 0) {
                wnVar.P4 = true;
            }
        }
        if (i11 != 0) {
            wnVar.j1.getClass();
            wnVar.u9(true);
        }
        if (i11 != 0 && wnVar.v3 && !wnVar.r3) {
            if (wnVar.b8 != Integer.MAX_VALUE) {
                wnVar.Ua();
                wnVar.nd(false);
            }
            wnVar.Vb(true);
        }
        if (wnVar.E9() && i11 != 0 && wnVar.w3 && !wnVar.r3) {
            if (wnVar.b8 != Integer.MAX_VALUE) {
                wnVar.Ua();
                wnVar.nd(false);
            }
            wnVar.Wb(true);
        }
        wnVar.j7(true);
        if (L0 != -1) {
            wnVar.A0.h();
            if (L0 != 0 || !wnVar.U6[0]) {
                k6.c[] cVarArr = wnVar.v1.e;
                k6.c cVar = 1 < cVarArr.length ? cVarArr[1] : null;
                boolean z12 = cVar != null && ((oe.b) cVar.c).f;
                int i12 = this.c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.a + i11;
                        this.a = f7;
                        if (f7 > i12) {
                            this.a = 0.0f;
                            wnVar.w9 = true;
                            wnVar.Mc();
                            wnVar.w1 = true;
                        }
                    }
                } else if (wnVar.w1 && z12) {
                    float f10 = this.a + i11;
                    this.a = f10;
                    if (f10 < (-i12)) {
                        wnVar.w9 = false;
                        wnVar.Mc();
                        this.a = 0.0f;
                    }
                }
            } else if (i11 >= 0) {
                wnVar.w9 = false;
                wnVar.Mc();
            }
        }
        wnVar.C9();
        wnVar.s9.G();
        ArrayList arrayList = wnVar.Na.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((py) arrayList.get(i13)).c) {
                ((py) arrayList.get(i13)).b -= i11;
            }
        }
        bh.s0 s0Var = bh.s0.B;
        if (s0Var != null) {
            s0Var.r -= i11;
            if (i11 != 0) {
                s0Var.u = true;
            }
        }
        wnVar.r7(false);
        fi.v3 v3Var = wnVar.J1;
        if (v3Var != null) {
            if (v3Var.V) {
                v3Var.e(true);
            } else if (!wnVar.vc) {
                wnVar.uc = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new wh(wnVar, 1));
                AndroidUtilities.runOnUIThread(new wh(wnVar, 2), 2000L);
            }
        }
        tl tlVar = wnVar.N1;
        if (tlVar != null && tlVar.V) {
            tlVar.e(true);
        }
        fi.v3 v3Var2 = wnVar.L1;
        if (v3Var2 == null || !v3Var2.V) {
            AndroidUtilities.cancelRunOnUIThread(new wh(wnVar, 3));
            AndroidUtilities.runOnUIThread(new wh(wnVar, 4), 2000L);
        } else {
            v3Var2.e(true);
        }
        fi.v3 v3Var3 = wnVar.M1;
        if (v3Var3 != null) {
            v3Var3.e(true);
        }
        jk jkVar = wnVar.Y;
        if (jkVar != null) {
            jkVar.h0();
        }
        bi.m7 m7Var = wnVar.Qc;
        if (m7Var != null) {
            m7Var.invalidate();
        }
        jh.a aVar = wnVar.qc;
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
