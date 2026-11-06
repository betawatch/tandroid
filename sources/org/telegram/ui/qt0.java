package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class qt0 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public final /* synthetic */ rt0 d;

    public qt0(rt0 rt0Var, Context context) {
        this.d = rt0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 0 || i7 == 2 || i7 == 4;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.e;
    }

    @Override // v4.g0
    public final int d(int i7) {
        rt0 rt0Var = this.d;
        if (i7 == rt0Var.x) {
            return 4;
        }
        if (i7 == rt0Var.n) {
            return 3;
        }
        if (i7 == rt0Var.f) {
            return 2;
        }
        return (i7 == rt0Var.h || i7 == rt0Var.w) ? 1 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        String M0;
        rt0 rt0Var = this.d;
        int i10 = rt0Var.D;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            if (i10 != 1) {
                throw null;
            }
            long keyAt = rt0Var.getMessagesController().G0.keyAt(i7 - rt0Var.r);
            a5Var.setTag(Long.valueOf(keyAt));
            if (keyAt <= 0) {
                TLRPC.Chat M02 = rt0Var.getMessagesController().M0(Long.valueOf(-keyAt));
                if (M02 != null) {
                    int i12 = M02.participants_count;
                    a5Var.c(M02, null, i12 != 0 ? org.telegram.messenger.hd.G(i12, "Members", new Object[0]) : M02.has_geo ? org.telegram.messenger.hd.M0(2131748641, null) : !org.telegram.messenger.t3.t0(M02) ? org.telegram.messenger.hd.M0(2131748640, null) : org.telegram.messenger.hd.M0(2131748637, null), i7 != rt0Var.s - 1);
                    return;
                }
                return;
            }
            TLRPC.User a22 = rt0Var.getMessagesController().a2(Long.valueOf(keyAt));
            if (a22 != null) {
                if (a22.bot) {
                    M0 = org.telegram.messenger.hd.M0(2131753156, null).substring(0, 1).toUpperCase() + org.telegram.messenger.hd.M0(2131753156, null).substring(1);
                } else {
                    String str = a22.phone;
                    M0 = (str == null || str.length() == 0) ? org.telegram.messenger.hd.M0(2131747831, null) : org.telegram.messenger.k5.i(new StringBuilder("+"), a22.phone, pf.b.c());
                }
                a5Var.c(a22, null, M0, i7 != rt0Var.s - 1);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 != rt0Var.h) {
                if (i7 == rt0Var.w) {
                    z8Var.setFixedSize(12);
                    z8Var.setText("");
                    return;
                }
                return;
            }
            if (i10 == 1) {
                z8Var.setFixedSize(0);
                z8Var.setText(org.telegram.messenger.hd.M0(2131753677, null));
                return;
            } else {
                z8Var.setFixedSize(8);
                z8Var.setText(null);
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            x4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
            if (i10 == 1) {
                x4Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.hd.M0(2131753692, null), false);
                return;
            } else {
                org.telegram.messenger.hd.M0(2131746867, null);
                throw null;
            }
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
        if (i7 == rt0Var.n) {
            if (i10 == 1) {
                n4Var.setText(org.telegram.messenger.hd.G(rt0Var.getMessagesController().H0, "BlockedUsersCount", new Object[0]));
            } else {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746839, null));
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        FrameLayout z8Var;
        if (i7 != 0) {
            Context context = this.c;
            if (i7 == 1) {
                z8Var = new org.telegram.ui.Cells.z8(context);
            } else if (i7 == 2) {
                z8Var = new org.telegram.ui.Cells.x4(context);
            } else if (i7 != 4) {
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.k6.L6, 21, 11, false, null);
                n4Var.setHeight(43);
                frameLayout = n4Var;
            } else {
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                m8Var.k(org.telegram.messenger.hd.M0(2131747914, null), false);
                m8Var.g(-1, org.telegram.ui.ActionBar.k6.p7);
                frameLayout = m8Var;
            }
            frameLayout = z8Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.c, 7, 6, true, null);
            a5Var.setDelegate(new li0(this, 9));
            frameLayout = a5Var;
        }
        return new org.telegram.ui.Components.xi0(frameLayout);
    }
}
