package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import java.io.File;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aq0 b;

    public /* synthetic */ yo0(aq0 aq0Var, int i10) {
        this.a = i10;
        this.b = aq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4 A[LOOP:1: B:37:0x00ae->B:39:0x00b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.h6 O0;
        String[] strArr;
        SparseIntArray R0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.g6 k10;
        up0 up0Var;
        boolean z10;
        Drawable drawable;
        switch (this.a) {
            case 0:
                aq0 aq0Var = this.b;
                aq0Var.S = !aq0Var.S;
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.i6.O0(string) == null || org.telegram.ui.ActionBar.i6.O0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.i6.O0(string2) == null || !org.telegram.ui.ActionBar.i6.O0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.h6 h6Var = org.telegram.ui.ActionBar.i6.I;
                if (string.equals(string2)) {
                    if (h6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        O0 = !aq0Var.S ? org.telegram.ui.ActionBar.i6.O0(str2) : org.telegram.ui.ActionBar.i6.O0(str);
                        aq0Var.v.clear();
                        strArr = new String[1];
                        String str3 = O0.d;
                        R0 = str3 == null ? org.telegram.ui.ActionBar.i6.R0(null, str3, strArr) : org.telegram.ui.ActionBar.i6.R0(new File(O0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.i6.ql;
                        if (iArr != null) {
                            for (int i11 = 0; i11 < iArr.length; i11++) {
                                aq0Var.v.put(i11, iArr[i11]);
                            }
                        }
                        for (i10 = 0; i10 < R0.size(); i10++) {
                            aq0Var.v.put(R0.keyAt(i10), R0.valueAt(i10));
                        }
                        k10 = O0.k(false);
                        if (k10 != null) {
                            k10.c(R0, aq0Var.v);
                        }
                        up0Var = aq0Var.h;
                        if (up0Var != null && up0Var.v != null) {
                            ci.u5 H = org.telegram.ui.ActionBar.i6.H(O0, aq0Var.v, strArr[0], 0, true);
                            pp0 pp0Var = aq0Var.h.v;
                            drawable = (BitmapDrawable) H.b;
                            if (drawable == null) {
                                drawable = (Drawable) H.a;
                            }
                            pp0Var.setOverrideBackground(drawable);
                        }
                        z10 = aq0Var.S;
                        if (aq0Var.a0 != z10) {
                            aq0Var.a0 = z10;
                            org.telegram.ui.Components.ck0 ck0Var = aq0Var.T;
                            ck0Var.P(z10 ? ck0Var.e[0] : 0);
                            org.telegram.ui.Components.ck0 ck0Var2 = aq0Var.T;
                            if (ck0Var2 != null) {
                                ck0Var2.start();
                            }
                        }
                        aq0Var.F0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!aq0Var.S) {
                }
                aq0Var.v.clear();
                strArr = new String[1];
                String str32 = O0.d;
                if (str32 == null) {
                }
                iArr = org.telegram.ui.ActionBar.i6.ql;
                if (iArr != null) {
                }
                while (i10 < R0.size()) {
                }
                k10 = O0.k(false);
                if (k10 != null) {
                }
                up0Var = aq0Var.h;
                if (up0Var != null) {
                    ci.u5 H2 = org.telegram.ui.ActionBar.i6.H(O0, aq0Var.v, strArr[0], 0, true);
                    pp0 pp0Var2 = aq0Var.h.v;
                    drawable = (BitmapDrawable) H2.b;
                    if (drawable == null) {
                    }
                    pp0Var2.setOverrideBackground(drawable);
                }
                z10 = aq0Var.S;
                if (aq0Var.a0 != z10) {
                }
                aq0Var.F0();
                break;
            default:
                this.b.D0(2);
                break;
        }
    }
}
