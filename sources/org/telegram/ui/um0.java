package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class um0 extends qq0 {
    public final /* synthetic */ an0 a;

    public um0(an0 an0Var) {
        this.a = an0Var;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        an0 an0Var = this.a;
        org.telegram.ui.Cells.q5 a02 = an0.a0(an0Var, i7);
        if (a02 == null) {
            return null;
        }
        org.telegram.ui.Components.k9 imageView = a02.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        zq0 zq0Var = new zq0();
        zq0Var.b = iArr[0];
        zq0Var.c = iArr[1];
        zq0Var.d = an0Var.K;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        zq0Var.a = imageReceiver;
        zq0Var.e = imageReceiver.p();
        zq0Var.k = a02.getScale();
        a02.g(false);
        return zq0Var;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void G() {
        an0 an0Var = this.a;
        int childCount = an0Var.K.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = an0Var.K.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final int H() {
        return this.a.b.size();
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final int R(Object obj) {
        Object valueOf = obj instanceof org.telegram.messenger.gf ? Integer.valueOf(((org.telegram.messenger.gf) obj).C) : obj instanceof org.telegram.messenger.kf ? ((org.telegram.messenger.kf) obj).B : null;
        if (valueOf == null) {
            return -1;
        }
        an0 an0Var = this.a;
        if (!an0Var.b.containsKey(valueOf)) {
            return -1;
        }
        an0Var.b.remove(valueOf);
        int indexOf = an0Var.c.indexOf(valueOf);
        if (indexOf >= 0) {
            an0Var.c.remove(indexOf);
        }
        if (an0Var.e) {
            an0Var.m0();
        }
        return indexOf;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void X(int i7) {
        an0 an0Var = this.a;
        org.telegram.messenger.we weVar = an0Var.J;
        org.telegram.ui.Cells.q5 a02 = an0.a0(an0Var, i7);
        if (a02 != null) {
            if (weVar == null) {
                a02.e((org.telegram.messenger.kf) an0Var.f.get(i7));
                return;
            }
            org.telegram.ui.Components.k9 imageView = a02.getImageView();
            imageView.r();
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.e.get(i7);
            String str = gfVar.c;
            int i10 = gfVar.C;
            String str2 = gfVar.I;
            if (str != null) {
                imageView.h(str, null, org.telegram.ui.ActionBar.m6.R4);
                return;
            }
            if (str2 == null) {
                imageView.setImageDrawable(org.telegram.ui.ActionBar.m6.R4);
                return;
            }
            imageView.s(gfVar.J, gfVar.K, true);
            if (!gfVar.b || gfVar.d()) {
                imageView.h("thumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.m6.R4);
                return;
            }
            imageView.h("vthumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.m6.R4);
        }
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void a0(int i7) {
        an0 an0Var = this.a;
        int childCount = an0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = an0Var.K.getChildAt(i10);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                org.telegram.messenger.we weVar = an0Var.J;
                if (weVar == null ? !(intValue < 0 || intValue >= an0Var.f.size()) : !(intValue < 0 || intValue >= weVar.e.size())) {
                    if (intValue == i7) {
                        q5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final ArrayList c() {
        return this.a.c;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final org.telegram.messenger.jc j(int i7) {
        org.telegram.ui.Cells.q5 a02 = an0.a0(this.a, i7);
        if (a02 != null) {
            return a02.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        int d02;
        boolean z9;
        an0 an0Var = this.a;
        org.telegram.messenger.we weVar = an0Var.J;
        if (weVar != null) {
            if (i7 < 0 || i7 >= weVar.e.size()) {
                return -1;
            }
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) an0Var.J.e.get(i7);
            d02 = an0Var.d0(-1, gfVar);
            if (d02 == -1) {
                gfVar.s = j20Var;
                d02 = an0Var.c.indexOf(Integer.valueOf(gfVar.C));
                z9 = true;
            } else {
                gfVar.s = null;
                z9 = false;
            }
        } else {
            if (i7 < 0 || i7 >= an0Var.f.size()) {
                return -1;
            }
            org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) an0Var.f.get(i7);
            d02 = an0Var.d0(-1, kfVar);
            if (d02 == -1) {
                kfVar.s = j20Var;
                d02 = an0Var.c.indexOf(kfVar.B);
                z9 = true;
            } else {
                kfVar.s = null;
                z9 = false;
            }
        }
        int childCount = an0Var.K.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = an0Var.K.getChildAt(i10);
            if (((Integer) childAt.getTag()).intValue() == i7) {
                ((org.telegram.ui.Cells.q5) childAt).b(an0Var.e ? d02 : -1, z9, false);
            } else {
                i10++;
            }
        }
        an0Var.n0(z9 ? 1 : 2);
        an0Var.s0.A();
        return d02;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        an0 an0Var = this.a;
        ArrayList arrayList = an0Var.f;
        org.telegram.messenger.we weVar = an0Var.J;
        if (an0Var.b.isEmpty()) {
            if (weVar != null) {
                if (i7 < 0 || i7 >= weVar.e.size()) {
                    return;
                }
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.e.get(i7);
                gfVar.s = j20Var;
                an0Var.d0(-1, gfVar);
            } else {
                if (i7 < 0 || i7 >= arrayList.size()) {
                    return;
                }
                org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) arrayList.get(i7);
                kfVar.s = j20Var;
                an0Var.d0(-1, kfVar);
            }
        }
        an0Var.j0(i10, z9);
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean u() {
        an0 an0Var = this.a;
        an0Var.s0.v0(0, true, true);
        an0Var.finishFragment();
        return true;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final HashMap v() {
        return this.a.b;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean x(int i7) {
        an0 an0Var = this.a;
        org.telegram.messenger.we weVar = an0Var.J;
        return weVar != null ? i7 >= 0 && i7 < weVar.e.size() && an0Var.b.containsKey(Integer.valueOf(((org.telegram.messenger.gf) an0Var.J.e.get(i7)).C)) : i7 >= 0 && i7 < an0Var.f.size() && an0Var.b.containsKey(((org.telegram.messenger.kf) an0Var.f.get(i7)).B);
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean z() {
        return this.a.E;
    }
}
