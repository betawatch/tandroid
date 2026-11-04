package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rz extends org.telegram.ui.Components.oj0 {
    public final Context r;
    public final int s;
    public final /* synthetic */ wz w;

    public rz(wz wzVar, Context context, int i3) {
        this.w = wzVar;
        this.r = context;
        this.s = i3;
    }

    @Override // org.telegram.ui.Components.zi0
    public final String F(int i3) {
        return null;
    }

    @Override // org.telegram.ui.Components.zi0
    public final void G(org.telegram.ui.Components.tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int M(int i3) {
        wz wzVar = this.w;
        if (i3 < wzVar.n.size()) {
            return ((ArrayList) wzVar.r.get(wzVar.n.get(i3))).size() + (i3 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.oj0
    public final Object O(int i3, int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int P(int i3, int i10) {
        if (i3 >= this.w.n.size()) {
            return 2;
        }
        if (i3 != 0 && i10 == 0) {
            return 0;
        }
        int i11 = this.s;
        return (i11 == 2 || i11 == 4) ? 3 : 1;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int R() {
        wz wzVar = this.w;
        int i3 = 0;
        if (wzVar.n.isEmpty()) {
            return 0;
        }
        int size = wzVar.n.size();
        if (!wzVar.n.isEmpty() && !wzVar.O) {
            i3 = 1;
        }
        return size + i3;
    }

    @Override // org.telegram.ui.Components.oj0
    public final View T(int i3, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.e7, false) & (-218103809));
        }
        if (i3 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i3 < this.w.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.e0(((org.telegram.messenger.zi) ((ArrayList) r1.r.get((String) r1.n.get(i3))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean V(int i3, int i10, u4.d1 d1Var) {
        return i3 == 0 || i10 != 0;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void W(int i3, int i10, u4.d1 d1Var) {
        boolean z10;
        wz wzVar = this.w;
        ArrayList arrayList = wzVar.n;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) wzVar.r.get((String) arrayList.get(i3));
            int i12 = d1Var.f;
            boolean z11 = false;
            if (i12 == 0) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.e0(((org.telegram.messenger.zi) arrayList2.get(0)).k.date, false));
                return;
            }
            boolean z12 = true;
            if (i12 != 1) {
                if (i12 != 3) {
                    return;
                }
                if (i3 != 0) {
                    i10--;
                }
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList2.get(i10);
                boolean z13 = f7Var.getMessage() != null && f7Var.getMessage().f1() == ziVar.f1();
                if (i10 != arrayList2.size() - 1 || (i3 == arrayList.size() - 1 && wzVar.N)) {
                    z11 = true;
                }
                f7Var.f(ziVar, z11);
                f7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.sj(this, f7Var, ziVar, z13, 3));
                return;
            }
            if (i3 != 0) {
                i10--;
            }
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList2.get(i10);
            if (g7Var.getMessage() == null || g7Var.getMessage().f1() != ziVar2.f1()) {
                z10 = false;
            } else {
                z10 = false;
                z11 = true;
            }
            if (i10 == arrayList2.size() - 1 && (i3 != arrayList.size() - 1 || !wzVar.N)) {
                z12 = z10;
            }
            g7Var.c(ziVar2, z12);
            g7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.sj(this, g7Var, ziVar2, z11, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.r;
        if (i3 == 0) {
            frameLayout = new org.telegram.ui.Cells.x3(context, null);
        } else if (i3 == 1) {
            frameLayout = new org.telegram.ui.Cells.g7(2, context, null);
        } else {
            if (i3 != 2) {
                frameLayout2 = new org.telegram.ui.Components.sr0(this, context);
                return k2.p1.p(frameLayout2, frameLayout2, -1, -2);
            }
            org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
            int i10 = this.s;
            if (i10 == 2 || i10 == 4) {
                izVar.setViewType(4);
            } else {
                izVar.setViewType(3);
            }
            izVar.setIsSingleCell(true);
            frameLayout = izVar;
        }
        frameLayout2 = frameLayout;
        return k2.p1.p(frameLayout2, frameLayout2, -1, -2);
    }
}
