package p3;

import b2.m0;
import b2.o0;
import b2.s;
import com.google.android.gms.internal.vision.e2;
import e2.d;
import j$.util.Objects;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b implements o0 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        d.b(i11 == -1 || i11 > 0);
        this.a = i10;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z10;
        this.f = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b d(Map map) {
        boolean z10;
        int i10;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z11;
        List list5;
        int i11;
        int i12;
        List list6 = (List) map.get("icy-br");
        boolean z12 = true;
        int i13 = -1;
        if (list6 != null) {
            String str4 = (String) list6.get(0);
            try {
                i12 = Integer.parseInt(str4) * MediaDataController.MAX_STYLE_RUNS_COUNT;
                if (i12 > 0) {
                    z10 = true;
                } else {
                    try {
                        e2.a.n("IcyHeaders", "Invalid bitrate: " + str4);
                        z10 = false;
                        i12 = -1;
                    } catch (NumberFormatException unused) {
                        e2.s("Invalid bitrate header: ", str4, "IcyHeaders");
                        i10 = i12;
                        z10 = false;
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
                        if (list5 == null) {
                        }
                        if (z10) {
                        }
                    }
                }
                i10 = i12;
            } catch (NumberFormatException unused2) {
                i12 = -1;
            }
        } else {
            z10 = false;
            i10 = -1;
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
        if (list5 == null) {
            String str5 = (String) list5.get(0);
            try {
                int parseInt = Integer.parseInt(str5);
                if (parseInt > 0) {
                    i13 = parseInt;
                } else {
                    try {
                        e2.a.n("IcyHeaders", "Invalid metadata interval: " + str5);
                        z12 = z10;
                    } catch (NumberFormatException unused3) {
                        i13 = parseInt;
                        e2.s("Invalid metadata interval: ", str5, "IcyHeaders");
                        i11 = i13;
                        if (z10) {
                        }
                    }
                }
                z10 = z12;
            } catch (NumberFormatException unused4) {
            }
            i11 = i13;
        } else {
            i11 = -1;
        }
        if (z10) {
            return new b(i10, str, str2, str3, z11, i11);
        }
        return null;
    }

    @Override // b2.o0
    public final /* synthetic */ s a() {
        return null;
    }

    @Override // b2.o0
    public final void b(m0 m0Var) {
        String str = this.c;
        if (str != null) {
            m0Var.F = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            m0Var.D = str2;
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a == bVar.a && Objects.equals(this.b, bVar.b) && Objects.equals(this.c, bVar.c) && Objects.equals(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (527 + this.a) * 31;
        String str = this.b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.a + ", metadataInterval=" + this.f;
    }
}
