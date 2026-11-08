package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class rm0 extends nq0 {
    public final /* synthetic */ xm0 a;

    public rm0(xm0 xm0Var) {
        this.a = xm0Var;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        xm0 xm0Var = this.a;
        org.telegram.ui.Cells.q5 a02 = xm0.a0(xm0Var, i7);
        if (a02 == null) {
            return null;
        }
        org.telegram.ui.Components.l9 imageView = a02.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.b = iArr[0];
        wq0Var.c = iArr[1];
        wq0Var.d = xm0Var.K;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        wq0Var.a = imageReceiver;
        wq0Var.e = imageReceiver.p();
        wq0Var.k = a02.getScale();
        a02.g(false);
        return wq0Var;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void G() {
        xm0 xm0Var = this.a;
        int childCount = xm0Var.K.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = xm0Var.K.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final int H() {
        return this.a.b.size();
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final int R(Object obj) {
        Object valueOf = obj instanceof org.telegram.messenger.gf ? Integer.valueOf(((org.telegram.messenger.gf) obj).C) : obj instanceof org.telegram.messenger.kf ? ((org.telegram.messenger.kf) obj).B : null;
        if (valueOf == null) {
            return -1;
        }
        xm0 xm0Var = this.a;
        if (!xm0Var.b.containsKey(valueOf)) {
            return -1;
        }
        xm0Var.b.remove(valueOf);
        int indexOf = xm0Var.c.indexOf(valueOf);
        if (indexOf >= 0) {
            xm0Var.c.remove(indexOf);
        }
        if (xm0Var.e) {
            xm0Var.m0();
        }
        return indexOf;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void X(int i7) {
        xm0 xm0Var = this.a;
        org.telegram.messenger.we weVar = xm0Var.J;
        org.telegram.ui.Cells.q5 a02 = xm0.a0(xm0Var, i7);
        if (a02 != null) {
            if (weVar == null) {
                a02.e((org.telegram.messenger.kf) xm0Var.f.get(i7));
                return;
            }
            org.telegram.ui.Components.l9 imageView = a02.getImageView();
            imageView.r();
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.e.get(i7);
            String str = gfVar.c;
            int i10 = gfVar.C;
            String str2 = gfVar.I;
            if (str != null) {
                imageView.h(str, null, org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            if (str2 == null) {
                imageView.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            imageView.s(gfVar.J, gfVar.K, true);
            if (!gfVar.b || gfVar.d()) {
                imageView.h("thumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            imageView.h("vthumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.k6.R4);
        }
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void a0(int i7) {
        xm0 xm0Var = this.a;
        int childCount = xm0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = xm0Var.K.getChildAt(i10);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                org.telegram.messenger.we weVar = xm0Var.J;
                if (weVar == null ? !(intValue < 0 || intValue >= xm0Var.f.size()) : !(intValue < 0 || intValue >= weVar.e.size())) {
                    if (intValue == i7) {
                        q5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final ArrayList c() {
        return this.a.c;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final org.telegram.messenger.jc j(int i7) {
        org.telegram.ui.Cells.q5 a02 = xm0.a0(this.a, i7);
        if (a02 != null) {
            return a02.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        int d02;
        boolean z9;
        xm0 xm0Var = this.a;
        org.telegram.messenger.we weVar = xm0Var.J;
        if (weVar != null) {
            if (i7 < 0 || i7 >= weVar.e.size()) {
                return -1;
            }
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) xm0Var.J.e.get(i7);
            d02 = xm0Var.d0(-1, gfVar);
            if (d02 == -1) {
                gfVar.s = j20Var;
                d02 = xm0Var.c.indexOf(Integer.valueOf(gfVar.C));
                z9 = true;
            } else {
                gfVar.s = null;
                z9 = false;
            }
        } else {
            if (i7 < 0 || i7 >= xm0Var.f.size()) {
                return -1;
            }
            org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) xm0Var.f.get(i7);
            d02 = xm0Var.d0(-1, kfVar);
            if (d02 == -1) {
                kfVar.s = j20Var;
                d02 = xm0Var.c.indexOf(kfVar.B);
                z9 = true;
            } else {
                kfVar.s = null;
                z9 = false;
            }
        }
        int childCount = xm0Var.K.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = xm0Var.K.getChildAt(i10);
            if (((Integer) childAt.getTag()).intValue() == i7) {
                ((org.telegram.ui.Cells.q5) childAt).b(xm0Var.e ? d02 : -1, z9, false);
            } else {
                i10++;
            }
        }
        xm0Var.n0(z9 ? 1 : 2);
        xm0Var.s0.A();
        return d02;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        xm0 xm0Var = this.a;
        ArrayList arrayList = xm0Var.f;
        org.telegram.messenger.we weVar = xm0Var.J;
        if (xm0Var.b.isEmpty()) {
            if (weVar != null) {
                if (i7 < 0 || i7 >= weVar.e.size()) {
                    return;
                }
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.e.get(i7);
                gfVar.s = j20Var;
                xm0Var.d0(-1, gfVar);
            } else {
                if (i7 < 0 || i7 >= arrayList.size()) {
                    return;
                }
                org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) arrayList.get(i7);
                kfVar.s = j20Var;
                xm0Var.d0(-1, kfVar);
            }
        }
        xm0Var.j0(i10, z9);
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean u() {
        xm0 xm0Var = this.a;
        xm0Var.s0.v0(0, true, true);
        xm0Var.finishFragment();
        return true;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final HashMap v() {
        return this.a.b;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean x(int i7) {
        xm0 xm0Var = this.a;
        org.telegram.messenger.we weVar = xm0Var.J;
        return weVar != null ? i7 >= 0 && i7 < weVar.e.size() && xm0Var.b.containsKey(Integer.valueOf(((org.telegram.messenger.gf) xm0Var.J.e.get(i7)).C)) : i7 >= 0 && i7 < xm0Var.f.size() && xm0Var.b.containsKey(((org.telegram.messenger.kf) xm0Var.f.get(i7)).B);
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean z() {
        return this.a.E;
    }
}
