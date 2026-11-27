// default package

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class yvc {
    public String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public int f;
    public TLRPC.TL_wallPaper g;
    public float h;
    public final boolean i;
    public final boolean j;
    public TLRPC.WallPaper k;
    public Bitmap l;

    public yvc(String str, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        this.a = str;
        this.b = i | (-16777216);
        int i6 = i2 == 0 ? 0 : i2 | (-16777216);
        this.c = i6;
        this.d = i3 == 0 ? 0 : i3 | (-16777216);
        this.e = i4 != 0 ? i4 | (-16777216) : 0;
        this.f = i6 == 0 ? 45 : i5;
        this.h = f;
        this.i = z;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.b));
        sb.append(this.c);
        sb.append(this.d);
        sb.append(this.e);
        sb.append(this.f);
        sb.append(this.h);
        String str = this.a;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        return Utilities.a(sb.toString());
    }

    public final String b() {
        int i = this.c;
        String lowerCase = i != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i >> 16)) & 255), Integer.valueOf(((byte) (i >> 8)) & 255), Byte.valueOf((byte) (i & jn7.d4))).toLowerCase() : null;
        int i2 = this.b;
        String lowerCase2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i2 >> 16)) & 255), Integer.valueOf(((byte) (i2 >> 8)) & 255), Byte.valueOf((byte) (i2 & jn7.d4))).toLowerCase();
        int i3 = this.d;
        String lowerCase3 = i3 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i3 >> 16)) & 255), Integer.valueOf(((byte) (i3 >> 8)) & 255), Byte.valueOf((byte) (i3 & jn7.d4))).toLowerCase() : null;
        int i4 = this.e;
        String lowerCase4 = i4 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i4 >> 16)) & 255), Integer.valueOf(((byte) (i4 >> 8)) & 255), Byte.valueOf((byte) (i4 & jn7.d4))).toLowerCase() : null;
        if (lowerCase != null) {
            if (lowerCase3 == null) {
                String p = qd4.p(lowerCase2, "-", lowerCase);
                if (this.g != null) {
                    StringBuilder l = c00.l(p, "&rotation=");
                    l.append(hl.q1(this.f, true));
                    lowerCase2 = l.toString();
                } else {
                    StringBuilder l2 = c00.l(p, "?rotation=");
                    l2.append(hl.q1(this.f, true));
                    lowerCase2 = l2.toString();
                }
            } else if (lowerCase4 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(lowerCase2);
                sb.append("~");
                sb.append(lowerCase);
                sb.append("~");
                sb.append(lowerCase3);
                lowerCase2 = c00.k(sb, "~", lowerCase4);
            } else {
                lowerCase2 = lowerCase2 + "~" + lowerCase + "~" + lowerCase3;
            }
        }
        TLRPC.TL_wallPaper tL_wallPaper = this.g;
        int i5 = yac.t0;
        if (tL_wallPaper == null) {
            return qu6.o(uc7.s1(i5).N2, "/bg/", lowerCase2, new StringBuilder("https://"));
        }
        String str = "https://" + uc7.s1(i5).N2 + "/bg/" + this.g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase2;
        return this.i ? str.concat("&mode=motion") : str;
    }

    public yvc(int i, int i2, int i3, int i4, String str) {
        this.a = str;
        this.b = i | (-16777216);
        this.c = i2 == 0 ? 0 : i2 | (-16777216);
        this.d = i3 == 0 ? 0 : i3 | (-16777216);
        this.e = i4 != 0 ? i4 | (-16777216) : 0;
        this.h = 1.0f;
        this.j = true;
    }

    public yvc(int i, int i2, int i3, String str) {
        this.a = str;
        this.b = i | (-16777216);
        int i4 = i2 == 0 ? 0 : i2 | (-16777216);
        this.c = i4;
        this.f = i4 == 0 ? 0 : i3;
        this.h = 1.0f;
    }
}
