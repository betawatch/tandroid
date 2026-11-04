package tf;

import android.net.Uri;
import android.os.Bundle;
import e6.l;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f {
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
    public f(e eVar) {
        String str;
        int i3;
        l lVar;
        Bundle bundle;
        StringBuilder sb2;
        StringBuilder sb3;
        String str2;
        String str3;
        int i10;
        str = (String) eVar.c;
        this.a = str;
        str.getClass();
        i3 = 3;
        switch (str) {
            case "image/jpeg":
            case "image/png":
                i3 = 4;
                lVar = (l) eVar.h;
                lVar = lVar == null ? new l(i3) : lVar;
                bundle = lVar.b;
                sb2 = new StringBuilder();
                sb3 = new StringBuilder();
                str2 = (String) eVar.e;
                if (str2 != null) {
                    sb2.append(str2);
                }
                str3 = (String) eVar.f;
                if (str3 != null) {
                    sb3.append(str3);
                }
                i10 = eVar.a;
                if (i10 != 0 && eVar.b != 0) {
                    l.c(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i10);
                    int i11 = eVar.b;
                    l.c(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i11);
                    if (sb3.length() > 0) {
                        sb3.append(' ');
                    }
                    sb3.append("(");
                    sb3.append(eVar.a);
                    sb3.append("x");
                    sb3.append(eVar.b);
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
                i3 = 1;
                lVar = (l) eVar.h;
                if (lVar == null) {
                }
                bundle = lVar.b;
                sb2 = new StringBuilder();
                sb3 = new StringBuilder();
                str2 = (String) eVar.e;
                if (str2 != null) {
                }
                str3 = (String) eVar.f;
                if (str3 != null) {
                }
                i10 = eVar.a;
                if (i10 != 0) {
                    l.c(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i10);
                    int i112 = eVar.b;
                    l.c(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i112);
                    if (sb3.length() > 0) {
                    }
                    sb3.append("(");
                    sb3.append(eVar.a);
                    sb3.append("x");
                    sb3.append(eVar.b);
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
                lVar = (l) eVar.h;
                if (lVar == null) {
                }
                bundle = lVar.b;
                sb2 = new StringBuilder();
                sb3 = new StringBuilder();
                str2 = (String) eVar.e;
                if (str2 != null) {
                }
                str3 = (String) eVar.f;
                if (str3 != null) {
                }
                i10 = eVar.a;
                if (i10 != 0) {
                }
                if (sb2.length() > 0) {
                }
                if (sb3.length() > 0) {
                }
                break;
        }
        this.b = lVar;
        this.c = (Uri) eVar.g;
        this.d = (String) eVar.d;
        this.e = eVar.a;
        this.f = eVar.b;
    }
}
