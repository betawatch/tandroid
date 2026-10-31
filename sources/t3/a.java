package t3;

import a1.g;
import b2.r0;
import b2.t0;
import b2.x;
import v7.c8;
import v7.r6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a implements t0 {
    public final String a;
    public final String b;

    public a(String str, String str2) {
        this.a = r6.d(str);
        this.b = str2;
    }

    @Override // b2.t0
    public final /* synthetic */ x a() {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // b2.t0
    public final void b(r0 r0Var) {
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
                Integer g10 = c8.g(str2);
                if (g10 != null) {
                    r0Var.p = g10;
                    break;
                }
                break;
            case 1:
                Integer g11 = c8.g(str2);
                if (g11 != null) {
                    r0Var.D = g11;
                    break;
                }
                break;
            case 2:
                Integer g12 = c8.g(str2);
                if (g12 != null) {
                    r0Var.o = g12;
                    break;
                }
                break;
            case 3:
                r0Var.c = str2;
                break;
            case 4:
                r0Var.E = str2;
                break;
            case 5:
                r0Var.a = str2;
                break;
            case 6:
                r0Var.g = str2;
                break;
            case 7:
                Integer g13 = c8.g(str2);
                if (g13 != null) {
                    r0Var.C = g13;
                    break;
                }
                break;
            case '\b':
                r0Var.d = str2;
                break;
            case '\t':
                r0Var.b = str2;
                break;
        }
    }

    @Override // b2.t0
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
        return this.b.hashCode() + g.f(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
