package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import java.io.File;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tp0 b;

    public /* synthetic */ ro0(tp0 tp0Var, int i10) {
        this.a = i10;
        this.b = tp0Var;
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
        org.telegram.ui.ActionBar.g6 N0;
        String[] strArr;
        SparseIntArray Q0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.f6 k10;
        np0 np0Var;
        boolean z10;
        Drawable drawable;
        switch (this.a) {
            case 0:
                tp0 tp0Var = this.b;
                tp0Var.S = !tp0Var.S;
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.h6.N0(string) == null || org.telegram.ui.ActionBar.h6.N0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.h6.N0(string2) == null || !org.telegram.ui.ActionBar.h6.N0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.g6 g6Var = org.telegram.ui.ActionBar.h6.I;
                if (string.equals(string2)) {
                    if (g6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        N0 = !tp0Var.S ? org.telegram.ui.ActionBar.h6.N0(str2) : org.telegram.ui.ActionBar.h6.N0(str);
                        tp0Var.v.clear();
                        strArr = new String[1];
                        String str3 = N0.d;
                        Q0 = str3 == null ? org.telegram.ui.ActionBar.h6.Q0(null, str3, strArr) : org.telegram.ui.ActionBar.h6.Q0(new File(N0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.h6.nl;
                        if (iArr != null) {
                            for (int i11 = 0; i11 < iArr.length; i11++) {
                                tp0Var.v.put(i11, iArr[i11]);
                            }
                        }
                        for (i10 = 0; i10 < Q0.size(); i10++) {
                            tp0Var.v.put(Q0.keyAt(i10), Q0.valueAt(i10));
                        }
                        k10 = N0.k(false);
                        if (k10 != null) {
                            k10.c(Q0, tp0Var.v);
                        }
                        np0Var = tp0Var.h;
                        if (np0Var != null && np0Var.v != null) {
                            cf.c H = org.telegram.ui.ActionBar.h6.H(N0, tp0Var.v, strArr[0], 0, true);
                            ip0 ip0Var = tp0Var.h.v;
                            drawable = (BitmapDrawable) H.b;
                            if (drawable == null) {
                                drawable = (Drawable) H.a;
                            }
                            ip0Var.setOverrideBackground(drawable);
                        }
                        z10 = tp0Var.S;
                        if (tp0Var.a0 != z10) {
                            tp0Var.a0 = z10;
                            org.telegram.ui.Components.ij0 ij0Var = tp0Var.T;
                            ij0Var.P(z10 ? ij0Var.e[0] : 0);
                            org.telegram.ui.Components.ij0 ij0Var2 = tp0Var.T;
                            if (ij0Var2 != null) {
                                ij0Var2.start();
                            }
                        }
                        tp0Var.F0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!tp0Var.S) {
                }
                tp0Var.v.clear();
                strArr = new String[1];
                String str32 = N0.d;
                if (str32 == null) {
                }
                iArr = org.telegram.ui.ActionBar.h6.nl;
                if (iArr != null) {
                }
                while (i10 < Q0.size()) {
                }
                k10 = N0.k(false);
                if (k10 != null) {
                }
                np0Var = tp0Var.h;
                if (np0Var != null) {
                    cf.c H2 = org.telegram.ui.ActionBar.h6.H(N0, tp0Var.v, strArr[0], 0, true);
                    ip0 ip0Var2 = tp0Var.h.v;
                    drawable = (BitmapDrawable) H2.b;
                    if (drawable == null) {
                    }
                    ip0Var2.setOverrideBackground(drawable);
                }
                z10 = tp0Var.S;
                if (tp0Var.a0 != z10) {
                }
                tp0Var.F0();
                break;
            default:
                this.b.D0(2);
                break;
        }
    }
}
