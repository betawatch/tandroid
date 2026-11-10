package wf;

import android.net.Uri;
import android.os.Bundle;
import f6.l;
import v4.v0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class e {
    public final String a;
    public final l b;
    public final Uri c;
    public final String d;
    public final int e;
    public final int f;

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(v0 v0Var) {
        String str;
        int i7;
        l lVar;
        Bundle bundle;
        StringBuilder sb2;
        StringBuilder sb3;
        String str2;
        String str3;
        int i10;
        str = (String) v0Var.c;
        this.a = str;
        str.getClass();
        i7 = 3;
        switch (str) {
            case "image/jpeg":
            case "image/png":
                i7 = 4;
                lVar = (l) v0Var.f;
                lVar = lVar == null ? new l(i7) : lVar;
                bundle = lVar.b;
                sb2 = new StringBuilder();
                sb3 = new StringBuilder();
                str2 = (String) v0Var.g;
                if (str2 != null) {
                    sb2.append(str2);
                }
                str3 = (String) v0Var.h;
                if (str3 != null) {
                    sb3.append(str3);
                }
                i10 = v0Var.a;
                if (i10 != 0 && v0Var.b != 0) {
                    l.c(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i10);
                    int i11 = v0Var.b;
                    l.c(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i11);
                    if (sb3.length() > 0) {
                        sb3.append(' ');
                    }
                    sb3.append("(");
                    sb3.append(v0Var.a);
                    sb3.append("x");
                    sb3.append(v0Var.b);
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
                i7 = 1;
                lVar = (l) v0Var.f;
                if (lVar == null) {
                }
                bundle = lVar.b;
                sb2 = new StringBuilder();
                sb3 = new StringBuilder();
                str2 = (String) v0Var.g;
                if (str2 != null) {
                }
                str3 = (String) v0Var.h;
                if (str3 != null) {
                }
                i10 = v0Var.a;
                if (i10 != 0) {
                    l.c(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i10);
                    int i112 = v0Var.b;
                    l.c(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i112);
                    if (sb3.length() > 0) {
                    }
                    sb3.append("(");
                    sb3.append(v0Var.a);
                    sb3.append("x");
                    sb3.append(v0Var.b);
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
                lVar = (l) v0Var.f;
                if (lVar == null) {
                }
                bundle = lVar.b;
                sb2 = new StringBuilder();
                sb3 = new StringBuilder();
                str2 = (String) v0Var.g;
                if (str2 != null) {
                }
                str3 = (String) v0Var.h;
                if (str3 != null) {
                }
                i10 = v0Var.a;
                if (i10 != 0) {
                }
                if (sb2.length() > 0) {
                }
                if (sb3.length() > 0) {
                }
                break;
        }
        this.b = lVar;
        this.c = (Uri) v0Var.d;
        this.d = (String) v0Var.e;
        this.e = v0Var.a;
        this.f = v0Var.b;
    }
}
