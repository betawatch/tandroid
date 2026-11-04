package v3;

import b8.od;
import b8.xb;
import d2.p0;
import d2.r0;
import d2.v;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements r0 {
    public final String a;
    public final String b;

    public a(String str, String str2) {
        this.a = xb.d(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // d2.r0
    public final void a(p0 p0Var) {
        String str = this.a;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c2 = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c2 = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c2 = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c2 = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c2 = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c2 = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c2 = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c2 = '\t';
                    break;
                }
                break;
        }
        String str2 = this.b;
        switch (c2) {
            case 0:
                Integer g7 = od.g(str2);
                if (g7 != null) {
                    p0Var.p = g7;
                    break;
                }
                break;
            case 1:
                Integer g10 = od.g(str2);
                if (g10 != null) {
                    p0Var.D = g10;
                    break;
                }
                break;
            case 2:
                Integer g11 = od.g(str2);
                if (g11 != null) {
                    p0Var.o = g11;
                    break;
                }
                break;
            case 3:
                p0Var.c = str2;
                break;
            case 4:
                p0Var.E = str2;
                break;
            case 5:
                p0Var.a = str2;
                break;
            case 6:
                p0Var.g = str2;
                break;
            case 7:
                Integer g12 = od.g(str2);
                if (g12 != null) {
                    p0Var.C = g12;
                    break;
                }
                break;
            case '\b':
                p0Var.d = str2;
                break;
            case '\t':
                p0Var.b = str2;
                break;
        }
    }

    @Override // d2.r0
    public final /* synthetic */ v b() {
        return null;
    }

    @Override // d2.r0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && this.b.equals(aVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + com.google.android.recaptcha.internal.a.g(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
