// default package

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xg2 {
    public final String a;
    public final ir6 b;
    public final Uri c;
    public final String d;
    public final int e;
    public final int f;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xg2(wg2 wg2Var) {
        String str;
        int i;
        ir6 ir6Var;
        Bundle bundle;
        StringBuilder sb;
        StringBuilder sb2;
        String str2;
        String str3;
        int i2;
        str = (String) wg2Var.c;
        this.a = str;
        str.getClass();
        i = 3;
        switch (str) {
            case "image/jpeg":
            case "image/png":
                i = 4;
                ir6Var = (ir6) wg2Var.h;
                ir6Var = ir6Var == null ? new ir6(i) : ir6Var;
                bundle = ir6Var.b;
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                str2 = (String) wg2Var.e;
                if (str2 != null) {
                    sb.append(str2);
                }
                str3 = (String) wg2Var.f;
                if (str3 != null) {
                    sb2.append(str3);
                }
                i2 = wg2Var.a;
                if (i2 != 0 && wg2Var.b != 0) {
                    ir6.c(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i2);
                    int i3 = wg2Var.b;
                    ir6.c(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i3);
                    if (sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    sb2.append("(");
                    sb2.append(wg2Var.a);
                    sb2.append("x");
                    sb2.append(wg2Var.b);
                    sb2.append(")");
                }
                if (sb.length() > 0) {
                    ir6Var.b("com.google.android.gms.cast.metadata.TITLE", sb.toString());
                } else {
                    ir6Var.b("com.google.android.gms.cast.metadata.TITLE", "No Title");
                }
                if (sb2.length() > 0) {
                    ir6Var.b("com.google.android.gms.cast.metadata.SUBTITLE", sb2.toString());
                    break;
                }
                break;
            case "application/x-mpegURL":
            case "video/mp4":
                i = 1;
                ir6Var = (ir6) wg2Var.h;
                if (ir6Var == null) {
                }
                bundle = ir6Var.b;
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                str2 = (String) wg2Var.e;
                if (str2 != null) {
                }
                str3 = (String) wg2Var.f;
                if (str3 != null) {
                }
                i2 = wg2Var.a;
                if (i2 != 0) {
                    ir6.c(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i2);
                    int i32 = wg2Var.b;
                    ir6.c(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i32);
                    if (sb2.length() > 0) {
                    }
                    sb2.append("(");
                    sb2.append(wg2Var.a);
                    sb2.append("x");
                    sb2.append(wg2Var.b);
                    sb2.append(")");
                    break;
                }
                if (sb.length() > 0) {
                }
                if (sb2.length() > 0) {
                }
                break;
            default:
                if (!str.startsWith("audio/")) {
                    ir6Var = null;
                    break;
                }
                ir6Var = (ir6) wg2Var.h;
                if (ir6Var == null) {
                }
                bundle = ir6Var.b;
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                str2 = (String) wg2Var.e;
                if (str2 != null) {
                }
                str3 = (String) wg2Var.f;
                if (str3 != null) {
                }
                i2 = wg2Var.a;
                if (i2 != 0) {
                }
                if (sb.length() > 0) {
                }
                if (sb2.length() > 0) {
                }
                break;
        }
        this.b = ir6Var;
        this.c = (Uri) wg2Var.g;
        this.d = (String) wg2Var.d;
        this.e = wg2Var.a;
        this.f = wg2Var.b;
    }
}
