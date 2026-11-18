package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class s91 extends org.telegram.ui.Components.bk0 {
    public final /* synthetic */ u91 c;

    public s91(u91 u91Var) {
        this.c = u91Var;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 3 || i7 == 2;
    }

    @Override // v4.i0
    public final int b() {
        u91 u91Var = this.c;
        if (u91Var.o0) {
            return 0;
        }
        return u91Var.n0;
    }

    @Override // v4.i0
    public final int d(int i7) {
        u91 u91Var = this.c;
        if (i7 == u91Var.k0 || i7 == u91Var.h0) {
            return 1;
        }
        if (i7 < u91Var.i0 || i7 >= u91Var.j0) {
            return (i7 < u91Var.l0 || i7 >= u91Var.m0) ? 0 : 3;
        }
        return 2;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        View view = f1Var.a;
        u91 u91Var = this.c;
        y91 y91Var = u91Var.w0;
        if (d(i7) == 1) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            if (i7 == u91Var.h0) {
                y3Var.setText(org.telegram.messenger.gd.M0(2131743759, null));
            }
            if (i7 == u91Var.k0) {
                y3Var.setText(org.telegram.messenger.gd.M0(2131745561, null));
            }
        }
        if (d(i7) == 2) {
            org.telegram.ui.Cells.la laVar = (org.telegram.ui.Cells.la) view;
            laVar.setTopic((TLRPC.TL_forumTopic) u91Var.f0.get(i7 - u91Var.i0));
            laVar.d = i7 != u91Var.j0 - 1;
        }
        if (d(i7) == 3) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) u91Var.g0.get(i7 - u91Var.l0);
            v91 v91Var = (v91) view;
            v91Var.b5 = i7 != u91Var.m0 - 1;
            i10 = ((org.telegram.ui.ActionBar.h2) y91Var).currentAccount;
            long b22 = org.telegram.messenger.fj.b2(i10, fjVar.k, true, false);
            if (b22 == 0) {
                b22 = 1;
            }
            TLRPC.TL_forumTopic f10 = y91Var.s.f(y91Var.a, b22);
            if (f10 != null) {
                v91Var.f0(f10, org.telegram.messenger.fj.B0(fjVar.k), fjVar, false, false);
                v91Var.setTopicIcon(f10);
            } else {
                org.telegram.messenger.a8.b("cant find topic " + b22);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.u2, org.telegram.ui.v91] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        boolean z10;
        y91 y91Var = this.c.w0;
        if (i7 == 1) {
            frameLayout = new org.telegram.ui.Cells.y3(viewGroup.getContext(), null);
        } else if (i7 == 2) {
            frameLayout = new org.telegram.ui.Cells.la(viewGroup.getContext());
        } else {
            if (i7 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? v91Var = new v91(y91Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.h2) y91Var).inPreviewMode;
            v91Var.l0 = z10;
            frameLayout = v91Var;
        }
        frameLayout.setLayoutParams(new v4.q0(-1, -2));
        return new org.telegram.ui.Components.kj0(frameLayout);
    }
}
