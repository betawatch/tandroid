package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wz extends org.telegram.ui.Components.zj0 {
    public final Context r;
    public final int s;
    public final /* synthetic */ b00 w;

    public wz(b00 b00Var, Context context, int i7) {
        this.w = b00Var;
        this.r = context;
        this.s = i7;
    }

    @Override // org.telegram.ui.Components.kj0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void G(org.telegram.ui.Components.ek0 ek0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.zj0
    public final int M(int i7) {
        b00 b00Var = this.w;
        if (i7 < b00Var.n.size()) {
            return ((ArrayList) b00Var.r.get(b00Var.n.get(i7))).size() + (i7 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.zj0
    public final Object O(int i7, int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.zj0
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

    @Override // org.telegram.ui.Components.zj0
    public final int R() {
        b00 b00Var = this.w;
        int i7 = 0;
        if (b00Var.n.isEmpty()) {
            return 0;
        }
        int size = b00Var.n.size();
        if (!b00Var.n.isEmpty() && !b00Var.O) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override // org.telegram.ui.Components.zj0
    public final View T(int i7, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.y3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.e7, false) & (-218103809));
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < this.w.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.e0(((org.telegram.messenger.fj) ((ArrayList) r1.r.get((String) r1.n.get(i7))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.zj0
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        return i7 == 0 || i10 != 0;
    }

    @Override // org.telegram.ui.Components.zj0
    public final void W(int i7, int i10, v4.f1 f1Var) {
        boolean z10;
        b00 b00Var = this.w;
        ArrayList arrayList = b00Var.n;
        int i11 = f1Var.f;
        View view = f1Var.a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) b00Var.r.get((String) arrayList.get(i7));
            int i12 = f1Var.f;
            boolean z11 = false;
            if (i12 == 0) {
                ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.e0(((org.telegram.messenger.fj) arrayList2.get(0)).k.date, false));
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
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList2.get(i10);
                boolean z13 = g7Var.getMessage() != null && g7Var.getMessage().e1() == fjVar.e1();
                if (i10 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && b00Var.N)) {
                    z11 = true;
                }
                g7Var.f(fjVar, z11);
                g7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.ik(this, g7Var, fjVar, z13, 3));
                return;
            }
            if (i7 != 0) {
                i10--;
            }
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList2.get(i10);
            if (h7Var.getMessage() == null || h7Var.getMessage().e1() != fjVar2.e1()) {
                z10 = false;
            } else {
                z10 = false;
                z11 = true;
            }
            if (i10 == arrayList2.size() - 1 && (i7 != arrayList.size() - 1 || !b00Var.N)) {
                z12 = z10;
            }
            h7Var.c(fjVar2, z12);
            h7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.ik(this, h7Var, fjVar2, z11, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.r;
        if (i7 == 0) {
            frameLayout = new org.telegram.ui.Cells.y3(context, null);
        } else if (i7 == 1) {
            frameLayout = new org.telegram.ui.Cells.h7(2, context, null);
        } else {
            if (i7 != 2) {
                frameLayout2 = new org.telegram.ui.Components.es0(this, context);
                return i5.c.q(frameLayout2, frameLayout2, -1, -2);
            }
            org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
            int i10 = this.s;
            if (i10 == 2 || i10 == 4) {
                vzVar.setViewType(4);
            } else {
                vzVar.setViewType(3);
            }
            vzVar.setIsSingleCell(true);
            frameLayout = vzVar;
        }
        frameLayout2 = frameLayout;
        return i5.c.q(frameLayout2, frameLayout2, -1, -2);
    }
}
