package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zu0 extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public final /* synthetic */ av0 d;

    public zu0(av0 av0Var, Context context) {
        this.d = av0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 2 || i10 == 4;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.e;
    }

    @Override // s4.g0
    public final int d(int i10) {
        av0 av0Var = this.d;
        if (i10 == av0Var.x) {
            return 4;
        }
        if (i10 == av0Var.n) {
            return 3;
        }
        if (i10 == av0Var.f) {
            return 2;
        }
        return (i10 == av0Var.h || i10 == av0Var.w) ? 1 : 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        String L0;
        av0 av0Var = this.d;
        int i11 = av0Var.D;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
            if (i11 != 1) {
                throw null;
            }
            long keyAt = av0Var.getMessagesController().G0.keyAt(i10 - av0Var.r);
            e5Var.setTag(Long.valueOf(keyAt));
            if (keyAt <= 0) {
                TLRPC.Chat L02 = av0Var.getMessagesController().L0(Long.valueOf(-keyAt));
                if (L02 != null) {
                    int i13 = L02.participants_count;
                    e5Var.c(L02, null, i13 != 0 ? org.telegram.messenger.cd.G(i13, "Members", new Object[0]) : L02.has_geo ? org.telegram.messenger.cd.L0(2131748657, null) : !org.telegram.messenger.w3.t0(L02) ? org.telegram.messenger.cd.L0(2131748656, null) : org.telegram.messenger.cd.L0(2131748653, null), i10 != av0Var.s - 1);
                    return;
                }
                return;
            }
            TLRPC.User Z1 = av0Var.getMessagesController().Z1(Long.valueOf(keyAt));
            if (Z1 != null) {
                if (Z1.bot) {
                    L0 = org.telegram.messenger.cd.L0(2131753156, null).substring(0, 1).toUpperCase() + org.telegram.messenger.cd.L0(2131753156, null).substring(1);
                } else {
                    String str = Z1.phone;
                    L0 = (str == null || str.length() == 0) ? org.telegram.messenger.cd.L0(2131747848, null) : org.telegram.messenger.m5.h(new StringBuilder("+"), Z1.phone, af.b.c());
                }
                e5Var.c(Z1, null, L0, i10 != av0Var.s - 1);
                return;
            }
            return;
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i10 != av0Var.h) {
                if (i10 == av0Var.w) {
                    b9Var.setFixedSize(12);
                    b9Var.setText("");
                    return;
                }
                return;
            }
            if (i11 == 1) {
                b9Var.setFixedSize(0);
                b9Var.setText(org.telegram.messenger.cd.L0(2131753677, null));
                return;
            } else {
                b9Var.setFixedSize(8);
                b9Var.setText(null);
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.a(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
            if (i11 == 1) {
                b5Var.b(R.drawable.msg_contact_add, 5, org.telegram.messenger.cd.L0(2131753692, null), false);
                return;
            } else {
                org.telegram.messenger.cd.L0(2131746883, null);
                throw null;
            }
        }
        if (i12 != 3) {
            return;
        }
        org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
        if (i10 == av0Var.n) {
            if (i11 == 1) {
                p4Var.setText(org.telegram.messenger.cd.G(av0Var.getMessagesController().H0, "BlockedUsersCount", new Object[0]));
            } else {
                p4Var.setText(org.telegram.messenger.cd.L0(2131746855, null));
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout b9Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                b9Var = new org.telegram.ui.Cells.b9(context);
            } else if (i10 == 2) {
                b9Var = new org.telegram.ui.Cells.b5(context);
            } else if (i10 != 4) {
                org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(this.c, org.telegram.ui.ActionBar.t6.L6, 21, 11, false, null);
                p4Var.setHeight(43);
                frameLayout = p4Var;
            } else {
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                p8Var.k(org.telegram.messenger.cd.L0(2131747931, null), false);
                p8Var.g(-1, org.telegram.ui.ActionBar.t6.p7);
                frameLayout = p8Var;
            }
            frameLayout = b9Var;
        } else {
            org.telegram.ui.Cells.e5 e5Var = new org.telegram.ui.Cells.e5(7, 6, this.c, null, true);
            e5Var.setDelegate(new tj0(this, 10));
            frameLayout = e5Var;
        }
        return new org.telegram.ui.Components.ck0(frameLayout);
    }
}
