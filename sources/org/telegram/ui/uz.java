package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class uz extends org.telegram.ui.Components.pj0 {
    public final Context r;
    public final int s;
    public final /* synthetic */ zz w;

    public uz(zz zzVar, Context context, int i7) {
        this.w = zzVar;
        this.r = context;
        this.s = i7;
    }

    @Override // org.telegram.ui.Components.aj0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.aj0
    public final void G(org.telegram.ui.Components.uj0 uj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int M(int i7) {
        zz zzVar = this.w;
        if (i7 < zzVar.n.size()) {
            return ((ArrayList) zzVar.r.get(zzVar.n.get(i7))).size() + (i7 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.pj0
    public final Object O(int i7, int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int P(int i7, int i10) {
        if (i7 >= this.w.n.size()) {
            return 2;
        }
        if (i7 != 0 && i10 == 0) {
            return 0;
        }
        int i11 = this.s;
        return (i11 == 2 || i11 == 4) ? 3 : 1;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int R() {
        zz zzVar = this.w;
        int i7 = 0;
        if (zzVar.n.isEmpty()) {
            return 0;
        }
        int size = zzVar.n.size();
        if (!zzVar.n.isEmpty() && !zzVar.O) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override // org.telegram.ui.Components.pj0
    public final View T(int i7, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.e7, false) & (-218103809));
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < this.w.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.e0(((org.telegram.messenger.gj) ((ArrayList) r1.r.get((String) r1.n.get(i7))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean V(int i7, int i10, v4.e1 e1Var) {
        return i7 == 0 || i10 != 0;
    }

    @Override // org.telegram.ui.Components.pj0
    public final void W(int i7, int i10, v4.e1 e1Var) {
        boolean z10;
        zz zzVar = this.w;
        ArrayList arrayList = zzVar.n;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) zzVar.r.get((String) arrayList.get(i7));
            int i12 = e1Var.f;
            boolean z11 = false;
            if (i12 == 0) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.e0(((org.telegram.messenger.gj) arrayList2.get(0)).k.date, false));
                return;
            }
            boolean z12 = true;
            if (i12 != 1) {
                if (i12 != 3) {
                    return;
                }
                if (i7 != 0) {
                    i10--;
                }
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(i10);
                boolean z13 = f7Var.getMessage() != null && f7Var.getMessage().e1() == gjVar.e1();
                if (i10 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && zzVar.N)) {
                    z11 = true;
                }
                f7Var.f(gjVar, z11);
                f7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.bk(this, f7Var, gjVar, z13, 3));
                return;
            }
            if (i7 != 0) {
                i10--;
            }
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList2.get(i10);
            if (g7Var.getMessage() == null || g7Var.getMessage().e1() != gjVar2.e1()) {
                z10 = false;
            } else {
                z10 = false;
                z11 = true;
            }
            if (i10 == arrayList2.size() - 1 && (i7 != arrayList.size() - 1 || !zzVar.N)) {
                z12 = z10;
            }
            g7Var.c(gjVar2, z12);
            g7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.bk(this, g7Var, gjVar2, z11, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.r;
        if (i7 == 0) {
            frameLayout = new org.telegram.ui.Cells.x3(context, null);
        } else if (i7 == 1) {
            frameLayout = new org.telegram.ui.Cells.g7(2, context, null);
        } else {
            if (i7 != 2) {
                frameLayout2 = new org.telegram.ui.Components.ur0(this, context);
                return i5.c.q(frameLayout2, frameLayout2, -1, -2);
            }
            org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
            int i10 = this.s;
            if (i10 == 2 || i10 == 4) {
                pzVar.setViewType(4);
            } else {
                pzVar.setViewType(3);
            }
            pzVar.setIsSingleCell(true);
            frameLayout = pzVar;
        }
        frameLayout2 = frameLayout;
        return i5.c.q(frameLayout2, frameLayout2, -1, -2);
    }
}
