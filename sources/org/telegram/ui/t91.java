package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t91 extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ v91 c;

    public t91(v91 v91Var) {
        this.c = v91Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 3 || i7 == 2;
    }

    @Override // v4.g0
    public final int b() {
        v91 v91Var = this.c;
        if (v91Var.n0) {
            return 0;
        }
        return v91Var.m0;
    }

    @Override // v4.g0
    public final int d(int i7) {
        v91 v91Var = this.c;
        if (i7 == v91Var.j0 || i7 == v91Var.g0) {
            return 1;
        }
        if (i7 < v91Var.h0 || i7 >= v91Var.i0) {
            return (i7 < v91Var.k0 || i7 >= v91Var.l0) ? 0 : 3;
        }
        return 2;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        View view = d1Var.a;
        v91 v91Var = this.c;
        z91 z91Var = v91Var.v0;
        if (d(i7) == 1) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i7 == v91Var.g0) {
                x3Var.setText(org.telegram.messenger.id.M0(2131743994, null));
            }
            if (i7 == v91Var.j0) {
                x3Var.setText(org.telegram.messenger.id.M0(2131745756, null));
            }
        }
        if (d(i7) == 2) {
            org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) view;
            jaVar.setTopic((TLRPC.TL_forumTopic) v91Var.e0.get(i7 - v91Var.h0));
            jaVar.d = i7 != v91Var.i0 - 1;
        }
        if (d(i7) == 3) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) v91Var.f0.get(i7 - v91Var.k0);
            w91 w91Var = (w91) view;
            w91Var.a5 = i7 != v91Var.l0 - 1;
            i10 = ((org.telegram.ui.ActionBar.f2) z91Var).currentAccount;
            long b22 = org.telegram.messenger.ij.b2(i10, ijVar.k, true, false);
            if (b22 == 0) {
                b22 = 1;
            }
            TLRPC.TL_forumTopic f10 = z91Var.s.f(z91Var.a, b22);
            if (f10 != null) {
                w91Var.g0(f10, org.telegram.messenger.ij.B0(ijVar.k), ijVar, false, false);
                w91Var.setTopicIcon(f10);
            } else {
                org.telegram.messenger.a8.b("cant find topic " + b22);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.t2, org.telegram.ui.w91] */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        boolean z9;
        z91 z91Var = this.c.v0;
        if (i7 == 1) {
            frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
        } else if (i7 == 2) {
            frameLayout = new org.telegram.ui.Cells.ja(viewGroup.getContext());
        } else {
            if (i7 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? w91Var = new w91(z91Var, viewGroup.getContext(), true);
            z9 = ((org.telegram.ui.ActionBar.f2) z91Var).inPreviewMode;
            w91Var.k0 = z9;
            frameLayout = w91Var;
        }
        frameLayout.setLayoutParams(new v4.o0(-1, -2));
        return new org.telegram.ui.Components.xi0(frameLayout);
    }
}
