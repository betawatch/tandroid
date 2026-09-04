package t3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.r6;
import v7.x7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class a implements o0 {
    public final String a;
    public final String b;

    public a(String str, String str2) {
        this.a = r6.c(str);
        this.b = str2;
    }

    @Override // b2.o0
    public final /* synthetic */ s a() {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // b2.o0
    public final void b(m0 m0Var) {
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
                Integer g10 = x7.g(str2);
                if (g10 != null) {
                    m0Var.o = g10;
                    break;
                }
                break;
            case 1:
                Integer g11 = x7.g(str2);
                if (g11 != null) {
                    m0Var.C = g11;
                    break;
                }
                break;
            case 2:
                Integer g12 = x7.g(str2);
                if (g12 != null) {
                    m0Var.n = g12;
                    break;
                }
                break;
            case 3:
                m0Var.c = str2;
                break;
            case 4:
                m0Var.D = str2;
                break;
            case 5:
                m0Var.a = str2;
                break;
            case 6:
                m0Var.g = str2;
                break;
            case 7:
                Integer g13 = x7.g(str2);
                if (g13 != null) {
                    m0Var.B = g13;
                    break;
                }
                break;
            case '\b':
                m0Var.d = str2;
                break;
            case '\t':
                m0Var.b = str2;
                break;
        }
    }

    @Override // b2.o0
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
        return this.b.hashCode() + a4.a.h(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
