package r3;

import b8.zb;
import d2.p0;
import d2.r0;
import d2.v;
import j$.util.Objects;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements r0 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public b(int i3, String str, String str2, String str3, boolean z10, int i10) {
        zb.f(i10 == -1 || i10 > 0);
        this.a = i3;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z10;
        this.f = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b d(Map map) {
        boolean z10;
        int i3;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z11;
        List list5;
        int i10;
        List list6 = (List) map.get("icy-br");
        boolean z12 = true;
        int i11 = -1;
        if (list6 != null) {
            String str4 = (String) list6.get(0);
            try {
                i10 = Integer.parseInt(str4) * 1000;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    try {
                        g2.a.l("IcyHeaders", "Invalid bitrate: " + str4);
                        z10 = false;
                        i10 = -1;
                    } catch (NumberFormatException unused) {
                        com.google.android.recaptcha.internal.a.q("Invalid bitrate header: ", str4, "IcyHeaders");
                        z10 = false;
                        i3 = i10;
                        list = (List) map.get("icy-genre");
                        if (list == null) {
                        }
                        list2 = (List) map.get("icy-name");
                        if (list2 == null) {
                        }
                        list3 = (List) map.get("icy-url");
                        if (list3 == null) {
                        }
                        list4 = (List) map.get("icy-pub");
                        if (list4 == null) {
                        }
                        list5 = (List) map.get("icy-metaint");
                        if (list5 != null) {
                        }
                        int i12 = i11;
                        if (z10) {
                        }
                    }
                }
            } catch (NumberFormatException unused2) {
                i10 = -1;
            }
            i3 = i10;
        } else {
            z10 = false;
            i3 = -1;
        }
        list = (List) map.get("icy-genre");
        if (list == null) {
            str = (String) list.get(0);
            z10 = true;
        } else {
            str = null;
        }
        list2 = (List) map.get("icy-name");
        if (list2 == null) {
            str2 = (String) list2.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        list3 = (List) map.get("icy-url");
        if (list3 == null) {
            str3 = (String) list3.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        list4 = (List) map.get("icy-pub");
        if (list4 == null) {
            z11 = ((String) list4.get(0)).equals("1");
            z10 = true;
        } else {
            z11 = false;
        }
        list5 = (List) map.get("icy-metaint");
        if (list5 != null) {
            String str5 = (String) list5.get(0);
            try {
                int parseInt = Integer.parseInt(str5);
                if (parseInt > 0) {
                    i11 = parseInt;
                } else {
                    try {
                        g2.a.l("IcyHeaders", "Invalid metadata interval: " + str5);
                        z12 = z10;
                    } catch (NumberFormatException unused3) {
                        i11 = parseInt;
                        com.google.android.recaptcha.internal.a.q("Invalid metadata interval: ", str5, "IcyHeaders");
                        int i122 = i11;
                        if (z10) {
                        }
                    }
                }
                z10 = z12;
            } catch (NumberFormatException unused4) {
            }
        }
        int i1222 = i11;
        if (z10) {
            return new b(i3, str, str2, str3, z11, i1222);
        }
        return null;
    }

    @Override // d2.r0
    public final void a(p0 p0Var) {
        String str = this.c;
        if (str != null) {
            p0Var.G = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            p0Var.E = str2;
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a == bVar.a && Objects.equals(this.b, bVar.b) && Objects.equals(this.c, bVar.c) && Objects.equals(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = (527 + this.a) * 31;
        String str = this.b;
        int hashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.a + ", metadataInterval=" + this.f;
    }
}
