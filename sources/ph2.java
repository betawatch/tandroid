// default package

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ph2 {
    public final String a;
    public final mt6 b;
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
    public ph2(oh2 oh2Var) {
        String str;
        int i;
        mt6 mt6Var;
        Bundle bundle;
        StringBuilder sb;
        StringBuilder sb2;
        String str2;
        String str3;
        int i2;
        str = (String) oh2Var.c;
        this.a = str;
        str.getClass();
        i = 3;
        switch (str) {
            case "image/jpeg":
            case "image/png":
                i = 4;
                mt6Var = (mt6) oh2Var.h;
                mt6Var = mt6Var == null ? new mt6(i) : mt6Var;
                bundle = mt6Var.b;
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                str2 = (String) oh2Var.e;
                if (str2 != null) {
                    sb.append(str2);
                }
                str3 = (String) oh2Var.f;
                if (str3 != null) {
                    sb2.append(str3);
                }
                i2 = oh2Var.a;
                if (i2 != 0 && oh2Var.b != 0) {
                    mt6.c(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i2);
                    int i3 = oh2Var.b;
                    mt6.c(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i3);
                    if (sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    sb2.append("(");
                    sb2.append(oh2Var.a);
                    sb2.append("x");
                    sb2.append(oh2Var.b);
                    sb2.append(")");
                }
                if (sb.length() > 0) {
                    mt6Var.b("com.google.android.gms.cast.metadata.TITLE", sb.toString());
                } else {
                    mt6Var.b("com.google.android.gms.cast.metadata.TITLE", "No Title");
                }
                if (sb2.length() > 0) {
                    mt6Var.b("com.google.android.gms.cast.metadata.SUBTITLE", sb2.toString());
                    break;
                }
                break;
            case "application/x-mpegURL":
            case "video/mp4":
                i = 1;
                mt6Var = (mt6) oh2Var.h;
                if (mt6Var == null) {
                }
                bundle = mt6Var.b;
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                str2 = (String) oh2Var.e;
                if (str2 != null) {
                }
                str3 = (String) oh2Var.f;
                if (str3 != null) {
                }
                i2 = oh2Var.a;
                if (i2 != 0) {
                    mt6.c(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i2);
                    int i32 = oh2Var.b;
                    mt6.c(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i32);
                    if (sb2.length() > 0) {
                    }
                    sb2.append("(");
                    sb2.append(oh2Var.a);
                    sb2.append("x");
                    sb2.append(oh2Var.b);
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
                    mt6Var = null;
                    break;
                }
                mt6Var = (mt6) oh2Var.h;
                if (mt6Var == null) {
                }
                bundle = mt6Var.b;
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                str2 = (String) oh2Var.e;
                if (str2 != null) {
                }
                str3 = (String) oh2Var.f;
                if (str3 != null) {
                }
                i2 = oh2Var.a;
                if (i2 != 0) {
                }
                if (sb.length() > 0) {
                }
                if (sb2.length() > 0) {
                }
                break;
        }
        this.b = mt6Var;
        this.c = (Uri) oh2Var.g;
        this.d = (String) oh2Var.d;
        this.e = oh2Var.a;
        this.f = oh2Var.b;
    }
}
