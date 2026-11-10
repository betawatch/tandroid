package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x51 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ThemeActivity a;

    public x51(ThemeActivity themeActivity) {
        this.a = themeActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0156  */
    @Override // org.telegram.ui.ActionBar.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7) {
        if (i7 == -1) {
            this.a.finishFragment();
            return;
        }
        if (i7 == 1) {
            this.a.B0();
            return;
        }
        if (i7 == 2) {
            org.telegram.ui.ActionBar.j6 k10 = org.telegram.ui.ActionBar.m6.D0().k(false);
            if (k10.r == null) {
                this.a.getMessagesController().y4(k10.b, k10);
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.s4, k10.b, k10);
                return;
            }
            String str = "https://" + this.a.getMessagesController().U2 + "/addtheme/" + k10.r.slug;
            this.a.showDialog(new org.telegram.ui.Components.mo0(this.a.getParentActivity(), null, str, false, str, false, null));
            return;
        }
        if (i7 == 3) {
            this.a.C0();
            return;
        }
        if (i7 == 4) {
            if (this.a.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a.getParentActivity());
            alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131744146, "ThemeResetToDefaultsTitle");
            alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131744147, "ThemeResetToDefaultsText");
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746118, "Reset"), new oi0(this, 18));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            this.a.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                return;
            }
            return;
        }
        if (i7 == 5) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
            String str2 = "Blue";
            String string = sharedPreferences.getString("lastDayTheme", "Blue");
            if (org.telegram.ui.ActionBar.m6.Q0(string) == null || org.telegram.ui.ActionBar.m6.Q0(string).q()) {
                string = "Blue";
            }
            String str3 = "Dark Blue";
            String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            if (org.telegram.ui.ActionBar.m6.Q0(string2) == null || !org.telegram.ui.ActionBar.m6.Q0(string2).q()) {
                string2 = "Dark Blue";
            }
            org.telegram.ui.ActionBar.l6 l6Var = org.telegram.ui.ActionBar.m6.I;
            if (!string.equals(string2)) {
                str3 = string2;
            } else if (l6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                str3 = string2;
                boolean equals = str2.equals(l6Var.m());
                org.telegram.ui.ActionBar.l6 Q0 = !equals ? org.telegram.ui.ActionBar.m6.Q0(str3) : org.telegram.ui.ActionBar.m6.Q0(str2);
                int[] iArr = {(this.a.s.getIconView().getMeasuredWidth() / 2) + r9, (this.a.s.getIconView().getMeasuredHeight() / 2) + r9};
                this.a.s.getIconView().getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), this.a.s.getIconView());
                this.a.F0(true);
                org.telegram.ui.ActionBar.m6.M1(this.a);
            }
            str2 = string;
            boolean equals2 = str2.equals(l6Var.m());
            if (!equals2) {
            }
            int[] iArr2 = {(this.a.s.getIconView().getMeasuredWidth() / 2) + i10, (this.a.s.getIconView().getMeasuredHeight() / 2) + i11};
            this.a.s.getIconView().getLocationInWindow(iArr2);
            int i102 = iArr2[0];
            int i112 = iArr2[1];
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, Q0, Boolean.FALSE, iArr2, -1, Boolean.valueOf(equals2), this.a.s.getIconView());
            this.a.F0(true);
            org.telegram.ui.ActionBar.m6.M1(this.a);
        }
    }
}
