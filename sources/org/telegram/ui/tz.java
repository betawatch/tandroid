package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class tz extends org.telegram.ui.Components.kj0 {
    public final Context r;
    public final int s;
    public final /* synthetic */ yz w;

    public tz(yz yzVar, Context context, int i7) {
        this.w = yzVar;
        this.r = context;
        this.s = i7;
    }

    @Override // org.telegram.ui.Components.vi0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.vi0
    public final void G(org.telegram.ui.Components.pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int M(int i7) {
        yz yzVar = this.w;
        if (i7 < yzVar.n.size()) {
            return ((ArrayList) yzVar.r.get(yzVar.n.get(i7))).size() + (i7 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.kj0
    public final Object O(int i7, int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.kj0
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

    @Override // org.telegram.ui.Components.kj0
    public final int R() {
        yz yzVar = this.w;
        int i7 = 0;
        if (yzVar.n.isEmpty()) {
            return 0;
        }
        int size = yzVar.n.size();
        if (!yzVar.n.isEmpty() && !yzVar.N) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override // org.telegram.ui.Components.kj0
    public final View T(int i7, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.e7, false) & (-218103809));
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < this.w.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.e0(((org.telegram.messenger.ij) ((ArrayList) r1.r.get((String) r1.n.get(i7))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.kj0
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        return i7 == 0 || i10 != 0;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void W(int i7, int i10, v4.d1 d1Var) {
        boolean z9;
        yz yzVar = this.w;
        ArrayList arrayList = yzVar.n;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) yzVar.r.get((String) arrayList.get(i7));
            int i12 = d1Var.f;
            boolean z10 = false;
            if (i12 == 0) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.e0(((org.telegram.messenger.ij) arrayList2.get(0)).k.date, false));
                return;
            }
            boolean z11 = true;
            if (i12 != 1) {
                if (i12 != 3) {
                    return;
                }
                if (i7 != 0) {
                    i10--;
                }
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(i10);
                boolean z12 = g7Var.getMessage() != null && g7Var.getMessage().f1() == ijVar.f1();
                if (i10 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && yzVar.M)) {
                    z10 = true;
                }
                g7Var.f(ijVar, z10);
                g7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.tj(this, g7Var, ijVar, z12, 3));
                return;
            }
            if (i7 != 0) {
                i10--;
            }
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList2.get(i10);
            if (h7Var.getMessage() == null || h7Var.getMessage().f1() != ijVar2.f1()) {
                z9 = false;
            } else {
                z9 = false;
                z10 = true;
            }
            if (i10 == arrayList2.size() - 1 && (i7 != arrayList.size() - 1 || !yzVar.M)) {
                z11 = z9;
            }
            h7Var.c(ijVar2, z11);
            h7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.tj(this, h7Var, ijVar2, z10, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.r;
        if (i7 == 0) {
            frameLayout = new org.telegram.ui.Cells.x3(context, null);
        } else if (i7 == 1) {
            frameLayout = new org.telegram.ui.Cells.h7(2, context, null);
        } else {
            if (i7 != 2) {
                frameLayout2 = new org.telegram.ui.Components.tr0(this, context);
                return jg.g.r(frameLayout2, frameLayout2, -1, -2);
            }
            org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
            int i10 = this.s;
            if (i10 == 2 || i10 == 4) {
                lzVar.setViewType(4);
            } else {
                lzVar.setViewType(3);
            }
            lzVar.setIsSingleCell(true);
            frameLayout = lzVar;
        }
        frameLayout2 = frameLayout;
        return jg.g.r(frameLayout2, frameLayout2, -1, -2);
    }
}
