package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zj extends f2.z0 {
    public boolean b;
    public final /* synthetic */ zn d;
    public float a = 0.0f;
    public final int c = AndroidUtilities.dp(100.0f);

    public zj(zn znVar) {
        this.d = znVar;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        zn znVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.s1 s1Var = znVar.m2;
            if (s1Var != null) {
                znVar.k2.e(s1Var, -1, znVar.n2, znVar.o2, true);
                znVar.m2 = null;
            }
            znVar.g3 = false;
            znVar.h3 = false;
            znVar.i3 = false;
            znVar.j3 = false;
            znVar.f9(true);
            znVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = zn.Ec;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            znVar.u0.setOverScrollMode(0);
            znVar.Z8.W();
            znVar.Wc(false);
            znVar.q9(1);
            znVar.pa = false;
            return;
        }
        ph.f3 f3Var = znVar.v1;
        if (f3Var != null && f3Var.S) {
            f3Var.e(true);
        }
        org.telegram.ui.Components.k6 k6Var = znVar.T2;
        if (k6Var != null && k6Var.getVisibility() == 0 && znVar.x9()) {
            AndroidUtilities.hideKeyboard(znVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            znVar.A4 = true;
            znVar.i3 = true;
        } else if (i10 == 1) {
            znVar.m2 = null;
            znVar.A4 = true;
            znVar.g3 = true;
            znVar.h3 = true;
            znVar.j3 = true;
            znVar.i3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = zn.Ec;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        mg.v vVar = znVar.V9;
        if (vVar == null || !vVar.d()) {
            return;
        }
        znVar.V9.setHiddenByScroll(true);
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ng.e eVar;
        boolean z4;
        zn znVar = this.d;
        zn znVar2 = znVar.aa;
        if (znVar2 == null) {
            znVar2 = znVar;
        }
        znVar.u0.invalidate();
        boolean z10 = true;
        this.b = i11 < 0;
        int L0 = znVar.w0.L0();
        if (((i11 != 0 && znVar.pa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && znVar.K4 != 0) {
            if (!this.b || znVar.L4) {
                znVar.K4 = 0;
            } else if (!znVar.u0.U1 && L0 != -1) {
                int N0 = znVar.w0.N0();
                MessageObject messageObject = null;
                while (true) {
                    if (N0 < L0) {
                        z4 = false;
                        break;
                    }
                    View m9 = znVar.w0.m(N0);
                    if (m9 instanceof org.telegram.ui.Cells.s1) {
                        messageObject = ((org.telegram.ui.Cells.s1) m9).getMessageObject();
                    } else if (m9 instanceof org.telegram.ui.Cells.v0) {
                        messageObject = ((org.telegram.ui.Cells.v0) m9).getMessageObject();
                    }
                    if (messageObject != null && znVar.K4 == messageObject.getId()) {
                        z4 = true;
                        break;
                    }
                    N0--;
                }
                if (!z4 && messageObject != null && messageObject.getId() < znVar.K4) {
                    znVar.K4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            znVar.L4 = false;
            if (!znVar.A4 && i11 != 0) {
                znVar.A4 = true;
            }
        }
        if (i11 != 0) {
            znVar.q9(1);
            znVar.U0.getClass();
            znVar.h9(true);
        }
        if (i11 != 0 && znVar.g3 && !znVar.c3) {
            if (znVar.I7 != Integer.MAX_VALUE) {
                znVar.Ia();
                znVar.Wc(false);
            }
            znVar.Fb(true);
        }
        if (znVar.t9() && i11 != 0 && znVar.h3 && !znVar.c3) {
            if (znVar.I7 != Integer.MAX_VALUE) {
                znVar.Ia();
                znVar.Wc(false);
            }
            znVar.Gb(true);
        }
        znVar.a7(true);
        if (L0 != -1) {
            znVar.x0.h();
            if (L0 != 0 || !znVar.B6[0]) {
                s5.m[] mVarArr = znVar.g1.e;
                s5.m mVar = 1 < mVarArr.length ? mVarArr[1] : null;
                boolean z11 = mVar != null && ((xd.a) mVar.c).f;
                int i12 = this.c;
                if (i11 > 0) {
                    if (!z11) {
                        float f10 = this.a + i11;
                        this.a = f10;
                        if (f10 > i12) {
                            this.a = 0.0f;
                            znVar.d9 = true;
                            znVar.vc();
                            znVar.h1 = true;
                        }
                    }
                } else if (znVar.h1 && z11) {
                    float f11 = this.a + i11;
                    this.a = f11;
                    if (f11 < (-i12)) {
                        znVar.d9 = false;
                        znVar.vc();
                        this.a = 0.0f;
                    }
                }
            } else if (i11 >= 0) {
                znVar.d9 = false;
                znVar.vc();
            }
        }
        znVar.r9();
        znVar.Z8.H();
        ArrayList arrayList = znVar.ua.C;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((cz) arrayList.get(i13)).c) {
                ((cz) arrayList.get(i13)).b -= i11;
            }
        }
        mg.m0 m0Var = mg.m0.B;
        if (m0Var != null) {
            m0Var.r -= i11;
            if (i11 != 0) {
                m0Var.u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (eVar = znVar2.C) != null) {
            eVar.f(i10, i11);
        }
        znVar.i7(false);
        ph.f3 f3Var = znVar.u1;
        if (f3Var != null) {
            if (f3Var.S) {
                f3Var.e(true);
            } else if (!znVar.Sb) {
                znVar.Rb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new pg(znVar, 28));
                AndroidUtilities.runOnUIThread(new pg(znVar, 29), 2000L);
            }
        }
        xl xlVar = znVar.y1;
        if (xlVar != null && xlVar.S) {
            xlVar.e(true);
        }
        ph.f3 f3Var2 = znVar.w1;
        if (f3Var2 == null || !f3Var2.S) {
            AndroidUtilities.cancelRunOnUIThread(new yj(znVar, 0));
            AndroidUtilities.runOnUIThread(new yj(znVar, 1), 2000L);
        } else {
            f3Var2.e(true);
        }
        ph.f3 f3Var3 = znVar.x1;
        if (f3Var3 != null) {
            f3Var3.e(true);
        }
        lk lkVar = znVar.V;
        if (lkVar != null) {
            lkVar.l0();
        }
        lh.l5 l5Var = znVar.nc;
        if (l5Var != null) {
            l5Var.invalidate();
        }
        ug.a aVar = znVar.Nb;
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
            if (childAt instanceof org.telegram.ui.Cells.s1 ? aVar.a(((org.telegram.ui.Cells.s1) childAt).getMessageObject()) : childAt instanceof org.telegram.ui.Cells.v0 ? aVar.a(((org.telegram.ui.Cells.v0) childAt).getMessageObject()) : false) {
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
