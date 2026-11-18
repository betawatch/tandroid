package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class rt0 extends org.telegram.ui.Components.bk0 {
    public final Context c;
    public final /* synthetic */ st0 d;

    public rt0(st0 st0Var, Context context) {
        this.d = st0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.bk0
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
        String M0;
        st0 st0Var = this.d;
        int i10 = st0Var.E;
        int i11 = f1Var.f;
        View view = f1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            if (i10 != 1) {
                throw null;
            }
            long keyAt = st0Var.getMessagesController().H0.keyAt(i7 - st0Var.r);
            a5Var.setTag(Long.valueOf(keyAt));
            if (keyAt <= 0) {
                TLRPC.Chat O0 = st0Var.getMessagesController().O0(Long.valueOf(-keyAt));
                if (O0 != null) {
                    int i12 = O0.participants_count;
                    a5Var.c(O0, null, i12 != 0 ? org.telegram.messenger.gd.G(i12, "Members", new Object[0]) : O0.has_geo ? org.telegram.messenger.gd.M0(2131748450, null) : !org.telegram.messenger.v3.t0(O0) ? org.telegram.messenger.gd.M0(2131748449, null) : org.telegram.messenger.gd.M0(2131748446, null), i7 != st0Var.s - 1);
                    return;
                }
                return;
            }
            TLRPC.User c22 = st0Var.getMessagesController().c2(Long.valueOf(keyAt));
            if (c22 != null) {
                if (c22.bot) {
                    M0 = org.telegram.messenger.gd.M0(2131753154, null).substring(0, 1).toUpperCase() + org.telegram.messenger.gd.M0(2131753154, null).substring(1);
                } else {
                    String str = c22.phone;
                    M0 = (str == null || str.length() == 0) ? org.telegram.messenger.gd.M0(2131747639, null) : org.telegram.messenger.n10.h(new StringBuilder("+"), c22.phone, pf.b.c());
                }
                a5Var.c(c22, null, M0, i7 != st0Var.s - 1);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 != st0Var.h) {
                if (i7 == st0Var.w) {
                    z8Var.setFixedSize(12);
                    z8Var.setText("");
                    return;
                }
                return;
            }
            if (i10 == 1) {
                z8Var.setFixedSize(0);
                z8Var.setText(org.telegram.messenger.gd.M0(2131753675, null));
                return;
            } else {
                z8Var.setFixedSize(8);
                z8Var.setText(null);
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            x4Var.a(org.telegram.ui.ActionBar.n6.v6, org.telegram.ui.ActionBar.n6.u6);
            if (i10 == 1) {
                x4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.gd.M0(2131753690, null), false);
                return;
            } else {
                org.telegram.messenger.gd.M0(2131746675, null);
                throw null;
            }
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
        if (i7 == st0Var.n) {
            if (i10 == 1) {
                n4Var.setText(org.telegram.messenger.gd.G(st0Var.getMessagesController().I0, "BlockedUsersCount", new Object[0]));
            } else {
                n4Var.setText(org.telegram.messenger.gd.M0(2131746647, null));
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        FrameLayout z8Var;
        if (i7 != 0) {
            Context context = this.c;
            if (i7 == 1) {
                z8Var = new org.telegram.ui.Cells.z8(context);
            } else if (i7 == 2) {
                z8Var = new org.telegram.ui.Cells.x4(context);
            } else if (i7 != 4) {
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.n6.L6, 21, 11, false, null);
                n4Var.setHeight(43);
                frameLayout = n4Var;
            } else {
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                m8Var.k(org.telegram.messenger.gd.M0(2131747722, null), false);
                m8Var.g(-1, org.telegram.ui.ActionBar.n6.p7);
                frameLayout = m8Var;
            }
            frameLayout = z8Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.c, 7, 6, true, null);
            a5Var.setDelegate(new qi0(this, 9));
            frameLayout = a5Var;
        }
        return new org.telegram.ui.Components.kj0(frameLayout);
    }
}
