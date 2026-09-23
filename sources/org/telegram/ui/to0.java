package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import java.io.File;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class to0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ up0 b;

    public /* synthetic */ to0(up0 up0Var, int i10) {
        this.a = i10;
        this.b = up0Var;
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
        op0 op0Var;
        boolean z10;
        Drawable drawable;
        switch (this.a) {
            case 0:
                up0 up0Var = this.b;
                up0Var.S = !up0Var.S;
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
                        N0 = !up0Var.S ? org.telegram.ui.ActionBar.h6.N0(str2) : org.telegram.ui.ActionBar.h6.N0(str);
                        up0Var.v.clear();
                        strArr = new String[1];
                        String str3 = N0.d;
                        Q0 = str3 == null ? org.telegram.ui.ActionBar.h6.Q0(null, str3, strArr) : org.telegram.ui.ActionBar.h6.Q0(new File(N0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.h6.nl;
                        if (iArr != null) {
                            for (int i11 = 0; i11 < iArr.length; i11++) {
                                up0Var.v.put(i11, iArr[i11]);
                            }
                        }
                        for (i10 = 0; i10 < Q0.size(); i10++) {
                            up0Var.v.put(Q0.keyAt(i10), Q0.valueAt(i10));
                        }
                        k10 = N0.k(false);
                        if (k10 != null) {
                            k10.c(Q0, up0Var.v);
                        }
                        op0Var = up0Var.h;
                        if (op0Var != null && op0Var.v != null) {
                            cf.c H = org.telegram.ui.ActionBar.h6.H(N0, up0Var.v, strArr[0], 0, true);
                            jp0 jp0Var = up0Var.h.v;
                            drawable = (BitmapDrawable) H.b;
                            if (drawable == null) {
                                drawable = (Drawable) H.a;
                            }
                            jp0Var.setOverrideBackground(drawable);
                        }
                        z10 = up0Var.S;
                        if (up0Var.a0 != z10) {
                            up0Var.a0 = z10;
                            org.telegram.ui.Components.yi0 yi0Var = up0Var.T;
                            yi0Var.P(z10 ? yi0Var.e[0] : 0);
                            org.telegram.ui.Components.yi0 yi0Var2 = up0Var.T;
                            if (yi0Var2 != null) {
                                yi0Var2.start();
                            }
                        }
                        up0Var.F0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!up0Var.S) {
                }
                up0Var.v.clear();
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
                op0Var = up0Var.h;
                if (op0Var != null) {
                    cf.c H2 = org.telegram.ui.ActionBar.h6.H(N0, up0Var.v, strArr[0], 0, true);
                    jp0 jp0Var2 = up0Var.h.v;
                    drawable = (BitmapDrawable) H2.b;
                    if (drawable == null) {
                    }
                    jp0Var2.setOverrideBackground(drawable);
                }
                z10 = up0Var.S;
                if (up0Var.a0 != z10) {
                }
                up0Var.F0();
                break;
            default:
                this.b.D0(2);
                break;
        }
    }
}
