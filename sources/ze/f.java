package ze;

import android.net.Uri;
import android.os.Bundle;
import f2.d1;
import o5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
    public f(d1 d1Var) {
        String str;
        int i10;
        l lVar;
        Bundle bundle;
        StringBuilder sb2;
        StringBuilder sb3;
        String str2;
        String str3;
        int i11;
        str = (String) d1Var.c;
        this.a = str;
        str.getClass();
        i10 = 3;
        switch (str) {
            case "image/jpeg":
            case "image/png":
                i10 = 4;
                lVar = (l) d1Var.f;
                lVar = lVar == null ? new l(i10) : lVar;
                bundle = lVar.b;
                sb2 = new StringBuilder();
                sb3 = new StringBuilder();
                str2 = (String) d1Var.g;
                if (str2 != null) {
                    sb2.append(str2);
                }
                str3 = (String) d1Var.h;
                if (str3 != null) {
                    sb3.append(str3);
                }
                i11 = d1Var.a;
                if (i11 != 0 && d1Var.b != 0) {
                    l.c(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i11);
                    int i12 = d1Var.b;
                    l.c(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i12);
                    if (sb3.length() > 0) {
                        sb3.append(' ');
                    }
                    sb3.append("(");
                    sb3.append(d1Var.a);
                    sb3.append("x");
                    sb3.append(d1Var.b);
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
                i10 = 1;
                lVar = (l) d1Var.f;
                if (lVar == null) {
                }
                bundle = lVar.b;
                sb2 = new StringBuilder();
                sb3 = new StringBuilder();
                str2 = (String) d1Var.g;
                if (str2 != null) {
                }
                str3 = (String) d1Var.h;
                if (str3 != null) {
                }
                i11 = d1Var.a;
                if (i11 != 0) {
                    l.c(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i11);
                    int i122 = d1Var.b;
                    l.c(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i122);
                    if (sb3.length() > 0) {
                    }
                    sb3.append("(");
                    sb3.append(d1Var.a);
                    sb3.append("x");
                    sb3.append(d1Var.b);
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
                lVar = (l) d1Var.f;
                if (lVar == null) {
                }
                bundle = lVar.b;
                sb2 = new StringBuilder();
                sb3 = new StringBuilder();
                str2 = (String) d1Var.g;
                if (str2 != null) {
                }
                str3 = (String) d1Var.h;
                if (str3 != null) {
                }
                i11 = d1Var.a;
                if (i11 != 0) {
                }
                if (sb2.length() > 0) {
                }
                if (sb3.length() > 0) {
                }
                break;
        }
        this.b = lVar;
        this.c = (Uri) d1Var.d;
        this.d = (String) d1Var.e;
        this.e = d1Var.a;
        this.f = d1Var.b;
    }
}
