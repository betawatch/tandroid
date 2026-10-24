package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class su implements View.OnClickListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;
    public final /* synthetic */ uu c;

    public su(uu uuVar, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        this.c = uuVar;
        this.a = context;
        this.b = o2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        if (ey.z4) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false);
        ey.z4 = true;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.k6.P0(string) == null || org.telegram.ui.ActionBar.k6.P0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.k6.P0(string2) == null || !org.telegram.ui.ActionBar.k6.P0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (j6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            boolean q6 = org.telegram.ui.ActionBar.k6.I.q();
            String str3 = str2;
            boolean z10 = !q6;
            org.telegram.ui.ActionBar.j6 P0 = q6 ? org.telegram.ui.ActionBar.k6.P0(str3) : org.telegram.ui.ActionBar.k6.P0(str);
            org.telegram.ui.Components.yj0 yj0Var = this.c.d;
            yj0Var.P(q6 ? yj0Var.e[0] - 1 : 0);
            this.c.e.getImageView().d();
            int[] iArr = {(this.c.e.getImageView().getMeasuredWidth() / 2) + r2, org.telegram.messenger.v0.C(3.0f, this.c.e.getImageView().getMeasuredHeight() / 2, r2)};
            this.c.e.getImageView().getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, P0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z10), this.c.e.getImageView(), this.c.e, new ai.eb(this, this.a, x02, z10, this.b, 5));
        }
        str = string;
        boolean q62 = org.telegram.ui.ActionBar.k6.I.q();
        String str32 = str2;
        boolean z102 = !q62;
        org.telegram.ui.ActionBar.j6 P02 = q62 ? org.telegram.ui.ActionBar.k6.P0(str32) : org.telegram.ui.ActionBar.k6.P0(str);
        org.telegram.ui.Components.yj0 yj0Var2 = this.c.d;
        yj0Var2.P(q62 ? yj0Var2.e[0] - 1 : 0);
        this.c.e.getImageView().d();
        int[] iArr2 = {(this.c.e.getImageView().getMeasuredWidth() / 2) + i10, org.telegram.messenger.v0.C(3.0f, this.c.e.getImageView().getMeasuredHeight() / 2, i11)};
        this.c.e.getImageView().getLocationInWindow(iArr2);
        int i102 = iArr2[0];
        int i112 = iArr2[1];
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, P02, Boolean.FALSE, iArr2, -1, Boolean.valueOf(z102), this.c.e.getImageView(), this.c.e, new ai.eb(this, this.a, x02, z102, this.b, 5));
    }
}
