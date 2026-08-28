package we;

import android.net.Uri;
import android.os.Bundle;
import f2.g1;
import m5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final l b;
    public final Uri c;
    public final String d;
    public final int e;
    public final int f;

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(g1 g1Var) {
        String str;
        int i9;
        l lVar;
        Bundle bundle;
        StringBuilder sb2;
        StringBuilder sb3;
        String str2;
        String str3;
        int i10;
        str = (String) g1Var.c;
        this.a = str;
        str.getClass();
        i9 = 3;
        switch (str) {
            case "image/jpeg":
            case "image/png":
                i9 = 4;
                lVar = (l) g1Var.f;
                lVar = lVar == null ? new l(i9) : lVar;
                bundle = lVar.b;
                sb2 = new StringBuilder();
                sb3 = new StringBuilder();
                str2 = (String) g1Var.g;
                if (str2 != null) {
                    sb2.append(str2);
                }
                str3 = (String) g1Var.h;
                if (str3 != null) {
                    sb3.append(str3);
                }
                i10 = g1Var.a;
                if (i10 != 0 && g1Var.b != 0) {
                    l.c(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i10);
                    int i11 = g1Var.b;
                    l.c(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i11);
                    if (sb3.length() > 0) {
                        sb3.append(' ');
                    }
                    sb3.append("(");
                    sb3.append(g1Var.a);
                    sb3.append("x");
                    sb3.append(g1Var.b);
                    sb3.append(")");
                }
                if (sb2.length() > 0) {
                    lVar.b("com.google.android.gms.cast.metadata.TITLE", sb2.toString());
                } else {
                    lVar.b("com.google.android.gms.cast.metadata.TITLE", "No Title");
                }
                if (sb3.length() > 0) {
                    lVar.b("com.google.android.gms.cast.metadata.SUBTITLE", sb3.toString());
                    break;
                }
                break;
            case "application/x-mpegURL":
            case "video/mp4":
                i9 = 1;
                lVar = (l) g1Var.f;
                if (lVar == null) {
                }
                bundle = lVar.b;
                sb2 = new StringBuilder();
                sb3 = new StringBuilder();
                str2 = (String) g1Var.g;
                if (str2 != null) {
                }
                str3 = (String) g1Var.h;
                if (str3 != null) {
                }
                i10 = g1Var.a;
                if (i10 != 0) {
                    l.c(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i10);
                    int i112 = g1Var.b;
                    l.c(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i112);
                    if (sb3.length() > 0) {
                    }
                    sb3.append("(");
                    sb3.append(g1Var.a);
                    sb3.append("x");
                    sb3.append(g1Var.b);
                    sb3.append(")");
                    break;
                }
                if (sb2.length() > 0) {
                }
                if (sb3.length() > 0) {
                }
                break;
            default:
                if (!str.startsWith("audio/")) {
                    lVar = null;
                    break;
                }
                lVar = (l) g1Var.f;
                if (lVar == null) {
                }
                bundle = lVar.b;
                sb2 = new StringBuilder();
                sb3 = new StringBuilder();
                str2 = (String) g1Var.g;
                if (str2 != null) {
                }
                str3 = (String) g1Var.h;
                if (str3 != null) {
                }
                i10 = g1Var.a;
                if (i10 != 0) {
                }
                if (sb2.length() > 0) {
                }
                if (sb3.length() > 0) {
                }
                break;
        }
        this.b = lVar;
        this.c = (Uri) g1Var.d;
        this.d = (String) g1Var.e;
        this.e = g1Var.a;
        this.f = g1Var.b;
    }
}
