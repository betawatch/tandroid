package w3;

import a8.ha;
import c8.g1;
import com.google.android.gms.internal.vision.e2;
import e2.n0;
import e2.p0;
import e2.u;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a implements p0 {
    public final String a;
    public final String b;

    public a(String str, String str2) {
        this.a = ha.d(str);
        this.b = str2;
    }

    @Override // e2.p0
    public final /* synthetic */ u a() {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // e2.p0
    public final void b(n0 n0Var) {
        String str = this.a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c10 = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c10 = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c10 = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c10 = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        String str2 = this.b;
        switch (c10) {
            case 0:
                Integer g10 = g1.g(str2);
                if (g10 != null) {
                    n0Var.p = g10;
                    break;
                }
                break;
            case 1:
                Integer g11 = g1.g(str2);
                if (g11 != null) {
                    n0Var.D = g11;
                    break;
                }
                break;
            case 2:
                Integer g12 = g1.g(str2);
                if (g12 != null) {
                    n0Var.o = g12;
                    break;
                }
                break;
            case 3:
                n0Var.c = str2;
                break;
            case 4:
                n0Var.E = str2;
                break;
            case 5:
                n0Var.a = str2;
                break;
            case 6:
                n0Var.g = str2;
                break;
            case 7:
                Integer g13 = g1.g(str2);
                if (g13 != null) {
                    n0Var.C = g13;
                    break;
                }
                break;
            case '\b':
                n0Var.d = str2;
                break;
            case '\t':
                n0Var.b = str2;
                break;
        }
    }

    @Override // e2.p0
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
        return this.b.hashCode() + e2.h(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
