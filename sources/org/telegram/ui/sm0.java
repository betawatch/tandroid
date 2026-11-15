package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class sm0 extends mq0 {
    public final /* synthetic */ ym0 a;

    public sm0(ym0 ym0Var) {
        this.a = ym0Var;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ym0 ym0Var = this.a;
        org.telegram.ui.Cells.q5 a02 = ym0.a0(ym0Var, i7);
        if (a02 == null) {
            return null;
        }
        org.telegram.ui.Components.i9 imageView = a02.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        uq0 uq0Var = new uq0();
        uq0Var.b = iArr[0];
        uq0Var.c = iArr[1];
        uq0Var.d = ym0Var.L;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        uq0Var.a = imageReceiver;
        uq0Var.e = imageReceiver.p();
        uq0Var.k = a02.getScale();
        a02.g(false);
        return uq0Var;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void G() {
        ym0 ym0Var = this.a;
        int childCount = ym0Var.L.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = ym0Var.L.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final int H() {
        return this.a.b.size();
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final int R(Object obj) {
        Object valueOf = obj instanceof org.telegram.messenger.ff ? Integer.valueOf(((org.telegram.messenger.ff) obj).C) : obj instanceof org.telegram.messenger.jf ? ((org.telegram.messenger.jf) obj).B : null;
        if (valueOf == null) {
            return -1;
        }
        ym0 ym0Var = this.a;
        if (!ym0Var.b.containsKey(valueOf)) {
            return -1;
        }
        ym0Var.b.remove(valueOf);
        int indexOf = ym0Var.c.indexOf(valueOf);
        if (indexOf >= 0) {
            ym0Var.c.remove(indexOf);
        }
        if (ym0Var.e) {
            ym0Var.m0();
        }
        return indexOf;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void X(int i7) {
        ym0 ym0Var = this.a;
        org.telegram.messenger.ve veVar = ym0Var.K;
        org.telegram.ui.Cells.q5 a02 = ym0.a0(ym0Var, i7);
        if (a02 != null) {
            if (veVar == null) {
                a02.e((org.telegram.messenger.jf) ym0Var.f.get(i7));
                return;
            }
            org.telegram.ui.Components.i9 imageView = a02.getImageView();
            imageView.r();
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) veVar.e.get(i7);
            String str = ffVar.c;
            int i10 = ffVar.C;
            String str2 = ffVar.I;
            if (str != null) {
                imageView.h(str, null, org.telegram.ui.ActionBar.j6.R4);
                return;
            }
            if (str2 == null) {
                imageView.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
                return;
            }
            imageView.s(ffVar.J, ffVar.K, true);
            if (!ffVar.b || ffVar.d()) {
                imageView.h("thumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.j6.R4);
                return;
            }
            imageView.h("vthumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.j6.R4);
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void a0(int i7) {
        ym0 ym0Var = this.a;
        int childCount = ym0Var.L.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ym0Var.L.getChildAt(i10);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                org.telegram.messenger.ve veVar = ym0Var.K;
                if (veVar == null ? !(intValue < 0 || intValue >= ym0Var.f.size()) : !(intValue < 0 || intValue >= veVar.e.size())) {
                    if (intValue == i7) {
                        q5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final ArrayList c() {
        return this.a.c;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final org.telegram.messenger.ic j(int i7) {
        org.telegram.ui.Cells.q5 a02 = ym0.a0(this.a, i7);
        if (a02 != null) {
            return a02.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final int k(int i7, org.telegram.messenger.g20 g20Var) {
        int d02;
        boolean z10;
        ym0 ym0Var = this.a;
        org.telegram.messenger.ve veVar = ym0Var.K;
        if (veVar != null) {
            if (i7 < 0 || i7 >= veVar.e.size()) {
                return -1;
            }
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) ym0Var.K.e.get(i7);
            d02 = ym0Var.d0(-1, ffVar);
            if (d02 == -1) {
                ffVar.s = g20Var;
                d02 = ym0Var.c.indexOf(Integer.valueOf(ffVar.C));
                z10 = true;
            } else {
                ffVar.s = null;
                z10 = false;
            }
        } else {
            if (i7 < 0 || i7 >= ym0Var.f.size()) {
                return -1;
            }
            org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) ym0Var.f.get(i7);
            d02 = ym0Var.d0(-1, jfVar);
            if (d02 == -1) {
                jfVar.s = g20Var;
                d02 = ym0Var.c.indexOf(jfVar.B);
                z10 = true;
            } else {
                jfVar.s = null;
                z10 = false;
            }
        }
        int childCount = ym0Var.L.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = ym0Var.L.getChildAt(i10);
            if (((Integer) childAt.getTag()).intValue() == i7) {
                ((org.telegram.ui.Cells.q5) childAt).b(ym0Var.e ? d02 : -1, z10, false);
            } else {
                i10++;
            }
        }
        ym0Var.n0(z10 ? 1 : 2);
        ym0Var.t0.y();
        return d02;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        ym0 ym0Var = this.a;
        ArrayList arrayList = ym0Var.f;
        org.telegram.messenger.ve veVar = ym0Var.K;
        if (ym0Var.b.isEmpty()) {
            if (veVar != null) {
                if (i7 < 0 || i7 >= veVar.e.size()) {
                    return;
                }
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) veVar.e.get(i7);
                ffVar.s = g20Var;
                ym0Var.d0(-1, ffVar);
            } else {
                if (i7 < 0 || i7 >= arrayList.size()) {
                    return;
                }
                org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) arrayList.get(i7);
                jfVar.s = g20Var;
                ym0Var.d0(-1, jfVar);
            }
        }
        ym0Var.j0(i10, z10);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean u() {
        ym0 ym0Var = this.a;
        ym0Var.t0.t0(0, true, true);
        ym0Var.finishFragment();
        return true;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final HashMap v() {
        return this.a.b;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean x(int i7) {
        ym0 ym0Var = this.a;
        org.telegram.messenger.ve veVar = ym0Var.K;
        return veVar != null ? i7 >= 0 && i7 < veVar.e.size() && ym0Var.b.containsKey(Integer.valueOf(((org.telegram.messenger.ff) ym0Var.K.e.get(i7)).C)) : i7 >= 0 && i7 < ym0Var.f.size() && ym0Var.b.containsKey(((org.telegram.messenger.jf) ym0Var.f.get(i7)).B);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean z() {
        return this.a.F;
    }
}
