package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class s10 extends org.telegram.ui.Components.hl0 {
    public final Context r;
    public final int s;
    public final /* synthetic */ x10 v;

    public s10(x10 x10Var, Context context, int i10) {
        this.v = x10Var;
        this.r = context;
        this.s = i10;
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(org.telegram.ui.Components.ll0 ll0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.hl0
    public final int M(int i10) {
        x10 x10Var = this.v;
        if (i10 < x10Var.n.size()) {
            return ((ArrayList) x10Var.r.get(x10Var.n.get(i10))).size() + (i10 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.hl0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.hl0
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

    @Override // org.telegram.ui.Components.hl0
    public final int R() {
        x10 x10Var = this.v;
        int i10 = 0;
        if (x10Var.n.isEmpty()) {
            return 0;
        }
        int size = x10Var.n.size();
        if (!x10Var.n.isEmpty() && !x10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override // org.telegram.ui.Components.hl0
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

    @Override // org.telegram.ui.Components.hl0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        return i10 == 0 || i11 != 0;
    }

    @Override // org.telegram.ui.Components.hl0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        x10 x10Var = this.v;
        ArrayList arrayList = x10Var.n;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) x10Var.r.get((String) arrayList.get(i10));
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
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                boolean z12 = i7Var.getMessage() != null && i7Var.getMessage().getId() == messageObject.getId();
                if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && x10Var.M)) {
                    z10 = true;
                }
                i7Var.f(messageObject, z10);
                i7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.mk(this, i7Var, messageObject, z12, 3));
                return;
            }
            if (i10 != 0) {
                i11--;
            }
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
            if (j7Var.getMessage() != null && j7Var.getMessage().getId() == messageObject2.getId()) {
                z10 = true;
            }
            if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !x10Var.M)) {
                z11 = false;
            }
            j7Var.c(messageObject2, z11);
            j7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.mk(this, j7Var, messageObject2, z10, 2));
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
            frameLayout = new org.telegram.ui.Cells.j7(context, 2, null);
        } else {
            if (i10 != 2) {
                frameLayout2 = new r10(this, context);
                return com.google.android.gms.internal.vision.e2.l(frameLayout2, frameLayout2, -1, -2);
            }
            org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
            int i11 = this.s;
            if (i11 == 2 || i11 == 4) {
                t00Var.setViewType(4);
            } else {
                t00Var.setViewType(3);
            }
            t00Var.setIsSingleCell(true);
            frameLayout = t00Var;
        }
        frameLayout2 = frameLayout;
        return com.google.android.gms.internal.vision.e2.l(frameLayout2, frameLayout2, -1, -2);
    }
}
