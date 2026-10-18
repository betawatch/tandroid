package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ru implements View.OnClickListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;
    public final /* synthetic */ tu c;

    public ru(tu tuVar, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.c = tuVar;
        this.a = context;
        this.b = n2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        if (ey.x4) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false);
        int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false);
        ey.x4 = true;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.h6.O0(string) == null || org.telegram.ui.ActionBar.h6.O0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.h6.O0(string2) == null || !org.telegram.ui.ActionBar.h6.O0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.g6 g6Var = org.telegram.ui.ActionBar.h6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (g6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
            String str3 = str2;
            boolean z10 = !q6;
            org.telegram.ui.ActionBar.g6 O0 = q6 ? org.telegram.ui.ActionBar.h6.O0(str3) : org.telegram.ui.ActionBar.h6.O0(str);
            org.telegram.ui.Components.uj0 uj0Var = this.c.d;
            uj0Var.P(q6 ? uj0Var.e[0] - 1 : 0);
            this.c.e.getImageView().d();
            int[] iArr = {(this.c.e.getImageView().getMeasuredWidth() / 2) + r2, org.telegram.messenger.g0.C(3.0f, this.c.e.getImageView().getMeasuredHeight() / 2, r2)};
            this.c.e.getImageView().getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z10), this.c.e.getImageView(), this.c.e, new org.telegram.messenger.w7(this, x02, this.a, x03, z10, this.b));
        }
        str = string;
        boolean q62 = org.telegram.ui.ActionBar.h6.I.q();
        String str32 = str2;
        boolean z102 = !q62;
        org.telegram.ui.ActionBar.g6 O02 = q62 ? org.telegram.ui.ActionBar.h6.O0(str32) : org.telegram.ui.ActionBar.h6.O0(str);
        org.telegram.ui.Components.uj0 uj0Var2 = this.c.d;
        uj0Var2.P(q62 ? uj0Var2.e[0] - 1 : 0);
        this.c.e.getImageView().d();
        int[] iArr2 = {(this.c.e.getImageView().getMeasuredWidth() / 2) + i10, org.telegram.messenger.g0.C(3.0f, this.c.e.getImageView().getMeasuredHeight() / 2, i11)};
        this.c.e.getImageView().getLocationInWindow(iArr2);
        int i102 = iArr2[0];
        int i112 = iArr2[1];
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, O02, Boolean.FALSE, iArr2, -1, Boolean.valueOf(z102), this.c.e.getImageView(), this.c.e, new org.telegram.messenger.w7(this, x02, this.a, x03, z102, this.b));
    }
}
