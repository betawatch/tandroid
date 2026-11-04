package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z40 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public final /* synthetic */ a50 d;

    public z40(a50 a50Var, Context context) {
        this.d = a50Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int b10 = d1Var.b();
        a50 a50Var = this.d;
        return b10 == a50Var.r || b10 == a50Var.n || b10 == a50Var.s || b10 == 0;
    }

    @Override // u4.h0
    public final int b() {
        a50 a50Var = this.d;
        if (a50Var.e) {
            return 0;
        }
        return a50Var.x;
    }

    @Override // u4.h0
    public final int d(int i3) {
        a50 a50Var = this.d;
        if (i3 == a50Var.n || i3 == a50Var.s || i3 == a50Var.r) {
            return 0;
        }
        if (i3 == a50Var.w || i3 == a50Var.h) {
            return 1;
        }
        return i3 == 0 ? 2 : 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        a50 a50Var = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
            if (i3 == a50Var.n) {
                v9Var.b(org.telegram.messenger.bd.M0(2131751762, null), true);
                return;
            } else if (i3 == a50Var.s) {
                v9Var.b(org.telegram.messenger.bd.M0(2131745468, null), false);
                return;
            } else {
                if (i3 == a50Var.r) {
                    v9Var.b(org.telegram.messenger.bd.M0(2131746033, null), true);
                    return;
                }
                return;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = a50Var.f;
            j8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            j8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        if (i3 == a50Var.w) {
            y8Var.setText("");
            return;
        }
        if (i3 == a50Var.h) {
            TLRPC.Chat M0 = a50Var.getMessagesController().M0(Long.valueOf(a50Var.d));
            if (!org.telegram.messenger.t3.T(M0) || M0.megagroup) {
                y8Var.setText(org.telegram.messenger.bd.M0(2131748919, null));
            } else {
                y8Var.setText(org.telegram.messenger.bd.M0(2131752386, null));
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i3 == 0) {
            FrameLayout v9Var = new org.telegram.ui.Cells.v9(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, v9Var, null);
            frameLayout = v9Var;
        } else if (i3 != 1) {
            org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(context);
            TextView textView = new TextView(context);
            j8Var.a = textView;
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
            j8Var.addView(textView, b8.mf.d(-1, -2.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, j8Var, null);
            frameLayout = j8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.y8(context);
        }
        return new org.telegram.ui.Components.bj0(frameLayout);
    }
}
