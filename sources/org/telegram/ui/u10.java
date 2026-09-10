package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class u10 extends org.telegram.ui.Components.rl0 {
    public final Context r;
    public final int s;
    public final /* synthetic */ z10 v;

    public u10(z10 z10Var, Context context, int i10) {
        this.v = z10Var;
        this.r = context;
        this.s = i10;
    }

    @Override // org.telegram.ui.Components.dl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.dl0
    public final void G(org.telegram.ui.Components.vl0 vl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.rl0
    public final int M(int i10) {
        z10 z10Var = this.v;
        if (i10 < z10Var.n.size()) {
            return ((ArrayList) z10Var.r.get(z10Var.n.get(i10))).size() + (i10 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.rl0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.rl0
    public final int P(int i10, int i11) {
        if (i10 >= this.v.n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.s;
        return (i12 == 2 || i12 == 4) ? 3 : 1;
    }

    @Override // org.telegram.ui.Components.rl0
    public final int R() {
        z10 z10Var = this.v;
        int i10 = 0;
        if (z10Var.n.isEmpty()) {
            return 0;
        }
        int size = z10Var.n.size();
        if (!z10Var.n.isEmpty() && !z10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override // org.telegram.ui.Components.rl0
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < this.v.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) r1.r.get((String) r1.n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        return i10 == 0 || i11 != 0;
    }

    @Override // org.telegram.ui.Components.rl0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        z10 z10Var = this.v;
        ArrayList arrayList = z10Var.n;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) z10Var.r.get((String) arrayList.get(i10));
            int i13 = c1Var.f;
            boolean z10 = false;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
                return;
            }
            boolean z11 = true;
            if (i13 != 1) {
                if (i13 != 3) {
                    return;
                }
                if (i10 != 0) {
                    i11--;
                }
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                boolean z12 = k7Var.getMessage() != null && k7Var.getMessage().getId() == messageObject.getId();
                if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && z10Var.M)) {
                    z10 = true;
                }
                k7Var.f(messageObject, z10);
                k7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.rk(this, k7Var, messageObject, z12, 3));
                return;
            }
            if (i10 != 0) {
                i11--;
            }
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
            if (l7Var.getMessage() != null && l7Var.getMessage().getId() == messageObject2.getId()) {
                z10 = true;
            }
            if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !z10Var.M)) {
                z11 = false;
            }
            l7Var.c(messageObject2, z11);
            l7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.rk(this, l7Var, messageObject2, z10, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.r;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.u3(context, null);
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.l7(context, 2, null);
        } else {
            if (i10 != 2) {
                frameLayout2 = new t10(this, context);
                return com.google.android.gms.internal.vision.e2.j(frameLayout2, frameLayout2, -1, -2);
            }
            org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null);
            int i11 = this.s;
            if (i11 == 2 || i11 == 4) {
                a10Var.setViewType(4);
            } else {
                a10Var.setViewType(3);
            }
            a10Var.setIsSingleCell(true);
            frameLayout = a10Var;
        }
        frameLayout2 = frameLayout;
        return com.google.android.gms.internal.vision.e2.j(frameLayout2, frameLayout2, -1, -2);
    }
}
