package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xy0 extends org.telegram.ui.Components.l6 {
    public final /* synthetic */ ProfileActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy0(ProfileActivity profileActivity) {
        super("avatarAnimationProgress", 0);
        this.b = profileActivity;
    }

    @Override // org.telegram.ui.Components.l6
    public final void c(Object obj, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.v0 v0Var;
        int v02;
        ProfileActivity profileActivity = this.b;
        profileActivity.A5 = f10;
        Drawable[] drawableArr = profileActivity.A;
        Drawable[] drawableArr2 = profileActivity.E;
        Drawable[] drawableArr3 = profileActivity.y;
        oy0 oy0Var = profileActivity.q0;
        if (oy0Var != null) {
            oy0Var.setActionBarActionMode(f10);
        }
        hh.v0 v0Var2 = profileActivity.r0;
        if (v0Var2 != null) {
            v0Var2.setActionBarActionMode(f10);
        }
        profileActivity.Z0.invalidate();
        int v03 = profileActivity.M5 != null ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.vh, profileActivity.v0);
        int i10 = org.telegram.ui.ActionBar.g6.Oi;
        int v04 = org.telegram.ui.ActionBar.g6.v0(i10, profileActivity.v0);
        int offsetColor = AndroidUtilities.getOffsetColor(v03, v04, f10, 1.0f);
        profileActivity.f[1].setTextColor(offsetColor);
        Drawable drawable = profileActivity.x;
        if (drawable != null) {
            if (profileActivity.M5 != null) {
                offsetColor = -1;
            }
            drawable.setColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.H != null) {
            profileActivity.H.b(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h8, profileActivity.v0), v04, f10, 1.0f));
        }
        int v05 = profileActivity.M5 != null ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v8, profileActivity.v0);
        int v06 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y8, profileActivity.v0);
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        kVar.D(AndroidUtilities.getOffsetColor(v05, v06, f10, 1.0f), false);
        MessagesController.PeerColor peerColor = profileActivity.M5;
        int v07 = peerColor != null ? 1090519039 : peerColor != null ? 553648127 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f8, profileActivity.v0);
        int v08 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z8, profileActivity.v0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        kVar2.C(AndroidUtilities.getOffsetColor(v07, v08, f10, 1.0f), false);
        profileActivity.Z0.invalidate();
        profileActivity.P0.setIconColor(profileActivity.M5 != null ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v8, profileActivity.v0));
        profileActivity.M0.setIconColor(profileActivity.M5 != null ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v8, profileActivity.v0));
        profileActivity.N0.setIconColor(profileActivity.M5 != null ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v8, profileActivity.v0));
        profileActivity.O0.setIconColor(profileActivity.M5 != null ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v8, profileActivity.v0));
        if (drawableArr3[0] != null) {
            drawableArr3[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, profileActivity.v0), org.telegram.ui.ActionBar.g6.v0(i10, profileActivity.v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr3[1] != null) {
            MessagesController.PeerColor peerColor2 = profileActivity.M5;
            if (peerColor2 != null) {
                v02 = org.telegram.ui.ActionBar.g6.b(0.1f, org.telegram.ui.ActionBar.g6.I.q() ? -0.1f : -0.08f, i0.b.d(0.4f, peerColor2.getColor2(), profileActivity.M5.hasColor6(org.telegram.ui.ActionBar.g6.I.q()) ? profileActivity.M5.getColor5() : profileActivity.M5.getColor3()));
            } else {
                v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, profileActivity.v0);
            }
            drawableArr3[1].setColorFilter(AndroidUtilities.getOffsetColor(v02, org.telegram.ui.ActionBar.g6.v0(i10, profileActivity.v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[0] != null) {
            drawableArr2[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ah, profileActivity.v0), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, profileActivity.v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[1] != null) {
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(profileActivity.M5 == null ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ah, profileActivity.v0) : -1, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, profileActivity.v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[0] != null) {
            drawableArr[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, profileActivity.v0), org.telegram.ui.ActionBar.g6.v0(i10, profileActivity.v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[1] != null) {
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, profileActivity.v0), org.telegram.ui.ActionBar.g6.v0(i10, profileActivity.v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        profileActivity.X4();
        ProfileActivity profileActivity2 = profileActivity.k0.n;
        if (profileActivity2.H0) {
            v0Var = profileActivity2.M0;
        } else if (profileActivity2.J0) {
            v0Var = profileActivity2.O0;
        } else {
            v0Var = profileActivity2.Q0;
            if (v0Var == null) {
                v0Var = null;
            }
        }
        if (v0Var != null) {
            if (profileActivity.I0 || profileActivity.J0 || profileActivity.H0) {
                profileActivity.l4(0, profileActivity.y3(), true);
            }
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(this.b.A5);
    }
}
