package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wu0 extends org.telegram.ui.Components.j6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ProfileActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu0(ProfileActivity profileActivity, int i3) {
        super("headerShadow", 0);
        this.b = i3;
        switch (i3) {
            case 1:
                this.c = profileActivity;
                super("avatarAnimationProgress", 0);
                break;
            default:
                this.c = profileActivity;
                break;
        }
    }

    @Override // org.telegram.ui.Components.j6
    public final void c(Object obj, float f10) {
        pi.q qVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.f5 f5Var;
        int w02;
        switch (this.b) {
            case 0:
                this.c.b1 = f10;
                break;
            default:
                ProfileActivity profileActivity = this.c;
                boolean z10 = ((profileActivity.R5 > 0.0f ? 1 : (profileActivity.R5 == 0.0f ? 0 : -1)) > 0) != ((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0);
                profileActivity.R5 = f10;
                qVar = ((org.telegram.ui.ActionBar.d2) profileActivity).glassEngine;
                qVar.g();
                if (z10) {
                    profileActivity.P3();
                }
                ProfileActivity.s1(profileActivity);
                profileActivity.x5();
                su0 su0Var = profileActivity.r;
                if (su0Var != null && !profileActivity.p2) {
                    Object tag = su0Var.getTag();
                    su0Var.setTextColor(i0.a.f(f10, tag instanceof Integer ? profileActivity.I3(org.telegram.ui.ActionBar.k6.w0(((Integer) tag).intValue(), profileActivity.A0), Boolean.valueOf(profileActivity.K0[0])) : profileActivity.I3(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, profileActivity.A0), Boolean.TRUE), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Dj, profileActivity.A0)));
                }
                profileActivity.z5();
                tu0 tu0Var = profileActivity.v0;
                if (tu0Var != null) {
                    tu0Var.setActionBarActionMode(f10);
                }
                ci.z0 z0Var = profileActivity.w0;
                if (z0Var != null) {
                    z0Var.setActionBarActionMode(f10);
                }
                profileActivity.d1.invalidate();
                int w03 = profileActivity.h6 != null ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ji, profileActivity.A0);
                int i3 = org.telegram.ui.ActionBar.k6.Cj;
                int w04 = org.telegram.ui.ActionBar.k6.w0(i3, profileActivity.A0);
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, w03, w04);
                profileActivity.f.setTextColor(S0);
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    if (profileActivity.h6 != null) {
                        S0 = -1;
                    }
                    drawable.setColorFilter(S0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.L != null) {
                    profileActivity.L.b(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, profileActivity.A0), w04));
                }
                int w05 = profileActivity.h6 != null ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, profileActivity.A0);
                int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y8, profileActivity.A0);
                kVar = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
                kVar.D(org.telegram.messenger.g0.S0(f10, 1.0f, w05, w06), false);
                org.telegram.messenger.wo woVar = profileActivity.h6;
                int w07 = woVar != null ? 1090519039 : woVar != null ? 553648127 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f8, profileActivity.A0);
                int w08 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z8, profileActivity.A0);
                kVar2 = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
                kVar2.C(org.telegram.messenger.g0.S0(f10, 1.0f, w07, w08), false);
                profileActivity.d1.invalidate();
                if (profileActivity.y != null) {
                    org.telegram.messenger.wo woVar2 = profileActivity.h6;
                    if (woVar2 != null) {
                        w02 = org.telegram.ui.ActionBar.k6.b(0.1f, org.telegram.ui.ActionBar.k6.I.q() ? -0.1f : -0.08f, i0.a.f(0.4f, woVar2.g(), profileActivity.h6.o(org.telegram.ui.ActionBar.k6.I.q()) ? profileActivity.h6.k() : profileActivity.h6.i()));
                    } else {
                        w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ni, profileActivity.A0);
                    }
                    profileActivity.y.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, w02, org.telegram.ui.ActionBar.k6.w0(i3, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.I != null) {
                    profileActivity.I.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, profileActivity.h6 == null ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.oi, profileActivity.A0) : -1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.E != null) {
                    profileActivity.E.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ni, profileActivity.A0), org.telegram.ui.ActionBar.k6.w0(i3, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity.s5();
                ProfileActivity profileActivity2 = profileActivity.p0.n;
                if (profileActivity2.M0) {
                    f5Var = profileActivity2.Q0;
                } else if (profileActivity2.O0) {
                    f5Var = profileActivity2.S0;
                } else {
                    f5Var = profileActivity2.U0;
                    if (f5Var == null) {
                        f5Var = null;
                    }
                }
                if (f5Var != null) {
                    if (profileActivity.N0 || profileActivity.O0 || profileActivity.M0) {
                        profileActivity.z4(0, profileActivity.L3(), true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.b1);
            default:
                return Float.valueOf(this.c.R5);
        }
    }
}
