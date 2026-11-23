package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class rt0 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public final /* synthetic */ st0 d;

    public rt0(st0 st0Var, Context context) {
        this.d = st0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 0 || i7 == 2 || i7 == 4;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.e;
    }

    @Override // v4.i0
    public final int d(int i7) {
        st0 st0Var = this.d;
        if (i7 == st0Var.x) {
            return 4;
        }
        if (i7 == st0Var.n) {
            return 3;
        }
        if (i7 == st0Var.f) {
            return 2;
        }
        return (i7 == st0Var.h || i7 == st0Var.w) ? 1 : 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        String N0;
        st0 st0Var = this.d;
        int i10 = st0Var.E;
        int i11 = f1Var.f;
        View view = f1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            if (i10 != 1) {
                throw null;
            }
            long keyAt = st0Var.getMessagesController().H0.keyAt(i7 - st0Var.r);
            b5Var.setTag(Long.valueOf(keyAt));
            if (keyAt <= 0) {
                TLRPC.Chat O0 = st0Var.getMessagesController().O0(Long.valueOf(-keyAt));
                if (O0 != null) {
                    int i12 = O0.participants_count;
                    b5Var.c(O0, null, i12 != 0 ? org.telegram.messenger.hd.G(i12, "Members", new Object[0]) : O0.has_geo ? org.telegram.messenger.hd.N0(2131748449, null) : !org.telegram.messenger.v3.t0(O0) ? org.telegram.messenger.hd.N0(2131748448, null) : org.telegram.messenger.hd.N0(2131748445, null), i7 != st0Var.s - 1);
                    return;
                }
                return;
            }
            TLRPC.User c22 = st0Var.getMessagesController().c2(Long.valueOf(keyAt));
            if (c22 != null) {
                if (c22.bot) {
                    N0 = org.telegram.messenger.hd.N0(2131753153, null).substring(0, 1).toUpperCase() + org.telegram.messenger.hd.N0(2131753153, null).substring(1);
                } else {
                    String str = c22.phone;
                    N0 = (str == null || str.length() == 0) ? org.telegram.messenger.hd.N0(2131747638, null) : org.telegram.messenger.o10.h(new StringBuilder("+"), c22.phone, pf.b.c());
                }
                b5Var.c(c22, null, N0, i7 != st0Var.s - 1);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i7 != st0Var.h) {
                if (i7 == st0Var.w) {
                    a9Var.setFixedSize(12);
                    a9Var.setText("");
                    return;
                }
                return;
            }
            if (i10 == 1) {
                a9Var.setFixedSize(0);
                a9Var.setText(org.telegram.messenger.hd.N0(2131753674, null));
                return;
            } else {
                a9Var.setFixedSize(8);
                a9Var.setText(null);
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            y4Var.a(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
            if (i10 == 1) {
                y4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.hd.N0(2131753689, null), false);
                return;
            } else {
                org.telegram.messenger.hd.N0(2131746674, null);
                throw null;
            }
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
        if (i7 == st0Var.n) {
            if (i10 == 1) {
                o4Var.setText(org.telegram.messenger.hd.G(st0Var.getMessagesController().I0, "BlockedUsersCount", new Object[0]));
            } else {
                o4Var.setText(org.telegram.messenger.hd.N0(2131746646, null));
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        FrameLayout a9Var;
        if (i7 != 0) {
            Context context = this.c;
            if (i7 == 1) {
                a9Var = new org.telegram.ui.Cells.a9(context);
            } else if (i7 == 2) {
                a9Var = new org.telegram.ui.Cells.y4(context);
            } else if (i7 != 4) {
                org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(this.c, org.telegram.ui.ActionBar.m6.L6, 21, 11, false, null);
                o4Var.setHeight(43);
                frameLayout = o4Var;
            } else {
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                n8Var.k(org.telegram.messenger.hd.N0(2131747721, null), false);
                n8Var.g(-1, org.telegram.ui.ActionBar.m6.p7);
                frameLayout = n8Var;
            }
            frameLayout = a9Var;
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(this.c, 7, 6, true, null);
            b5Var.setDelegate(new qi0(this, 9));
            frameLayout = b5Var;
        }
        return new org.telegram.ui.Components.mj0(frameLayout);
    }
}
