package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class wm0 extends oq0 {
    public final /* synthetic */ cn0 a;

    public wm0(cn0 cn0Var) {
        this.a = cn0Var;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        cn0 cn0Var = this.a;
        org.telegram.ui.Cells.s5 a02 = cn0.a0(cn0Var, i7);
        if (a02 == null) {
            return null;
        }
        org.telegram.ui.Components.q9 imageView = a02.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.b = iArr[0];
        wq0Var.c = iArr[1];
        wq0Var.d = cn0Var.L;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        wq0Var.a = imageReceiver;
        wq0Var.e = imageReceiver.p();
        wq0Var.k = a02.getScale();
        a02.g(false);
        return wq0Var;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void G() {
        cn0 cn0Var = this.a;
        int childCount = cn0Var.L.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = cn0Var.L.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                ((org.telegram.ui.Cells.s5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int H() {
        return this.a.b.size();
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int R(Object obj) {
        Object valueOf = obj instanceof org.telegram.messenger.ef ? Integer.valueOf(((org.telegram.messenger.ef) obj).C) : obj instanceof org.telegram.messenger.hf ? ((org.telegram.messenger.hf) obj).B : null;
        if (valueOf == null) {
            return -1;
        }
        cn0 cn0Var = this.a;
        if (!cn0Var.b.containsKey(valueOf)) {
            return -1;
        }
        cn0Var.b.remove(valueOf);
        int indexOf = cn0Var.c.indexOf(valueOf);
        if (indexOf >= 0) {
            cn0Var.c.remove(indexOf);
        }
        if (cn0Var.e) {
            cn0Var.m0();
        }
        return indexOf;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void X(int i7) {
        cn0 cn0Var = this.a;
        org.telegram.messenger.ue ueVar = cn0Var.K;
        org.telegram.ui.Cells.s5 a02 = cn0.a0(cn0Var, i7);
        if (a02 != null) {
            if (ueVar == null) {
                a02.e((org.telegram.messenger.hf) cn0Var.f.get(i7));
                return;
            }
            org.telegram.ui.Components.q9 imageView = a02.getImageView();
            imageView.r();
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ueVar.e.get(i7);
            String str = efVar.c;
            int i10 = efVar.C;
            String str2 = efVar.I;
            if (str != null) {
                imageView.h(str, null, org.telegram.ui.ActionBar.n6.R4);
                return;
            }
            if (str2 == null) {
                imageView.setImageDrawable(org.telegram.ui.ActionBar.n6.R4);
                return;
            }
            imageView.s(efVar.J, efVar.K, true);
            if (!efVar.b || efVar.d()) {
                imageView.h("thumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.n6.R4);
                return;
            }
            imageView.h("vthumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.n6.R4);
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void a0(int i7) {
        cn0 cn0Var = this.a;
        int childCount = cn0Var.L.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = cn0Var.L.getChildAt(i10);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                org.telegram.messenger.ue ueVar = cn0Var.K;
                if (ueVar == null ? !(intValue < 0 || intValue >= cn0Var.f.size()) : !(intValue < 0 || intValue >= ueVar.e.size())) {
                    if (intValue == i7) {
                        s5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final ArrayList c() {
        return this.a.c;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final org.telegram.messenger.hc j(int i7) {
        org.telegram.ui.Cells.s5 a02 = cn0.a0(this.a, i7);
        if (a02 != null) {
            return a02.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int k(int i7, org.telegram.messenger.e20 e20Var) {
        int d02;
        boolean z10;
        cn0 cn0Var = this.a;
        org.telegram.messenger.ue ueVar = cn0Var.K;
        if (ueVar != null) {
            if (i7 < 0 || i7 >= ueVar.e.size()) {
                return -1;
            }
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) cn0Var.K.e.get(i7);
            d02 = cn0Var.d0(-1, efVar);
            if (d02 == -1) {
                efVar.s = e20Var;
                d02 = cn0Var.c.indexOf(Integer.valueOf(efVar.C));
                z10 = true;
            } else {
                efVar.s = null;
                z10 = false;
            }
        } else {
            if (i7 < 0 || i7 >= cn0Var.f.size()) {
                return -1;
            }
            org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) cn0Var.f.get(i7);
            d02 = cn0Var.d0(-1, hfVar);
            if (d02 == -1) {
                hfVar.s = e20Var;
                d02 = cn0Var.c.indexOf(hfVar.B);
                z10 = true;
            } else {
                hfVar.s = null;
                z10 = false;
            }
        }
        int childCount = cn0Var.L.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = cn0Var.L.getChildAt(i10);
            if (((Integer) childAt.getTag()).intValue() == i7) {
                ((org.telegram.ui.Cells.s5) childAt).b(cn0Var.e ? d02 : -1, z10, false);
            } else {
                i10++;
            }
        }
        cn0Var.n0(z10 ? 1 : 2);
        cn0Var.t0.u();
        return d02;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        cn0 cn0Var = this.a;
        ArrayList arrayList = cn0Var.f;
        org.telegram.messenger.ue ueVar = cn0Var.K;
        if (cn0Var.b.isEmpty()) {
            if (ueVar != null) {
                if (i7 < 0 || i7 >= ueVar.e.size()) {
                    return;
                }
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ueVar.e.get(i7);
                efVar.s = e20Var;
                cn0Var.d0(-1, efVar);
            } else {
                if (i7 < 0 || i7 >= arrayList.size()) {
                    return;
                }
                org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) arrayList.get(i7);
                hfVar.s = e20Var;
                cn0Var.d0(-1, hfVar);
            }
        }
        cn0Var.j0(i10, z10);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean u() {
        cn0 cn0Var = this.a;
        cn0Var.t0.v0(0, true, true);
        cn0Var.finishFragment();
        return true;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final HashMap v() {
        return this.a.b;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean x(int i7) {
        cn0 cn0Var = this.a;
        org.telegram.messenger.ue ueVar = cn0Var.K;
        return ueVar != null ? i7 >= 0 && i7 < ueVar.e.size() && cn0Var.b.containsKey(Integer.valueOf(((org.telegram.messenger.ef) cn0Var.K.e.get(i7)).C)) : i7 >= 0 && i7 < cn0Var.f.size() && cn0Var.b.containsKey(((org.telegram.messenger.hf) cn0Var.f.get(i7)).B);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean z() {
        return this.a.F;
    }
}
