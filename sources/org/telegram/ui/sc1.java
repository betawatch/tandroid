package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class sc1 {
    public String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public int f;
    public TLRPC.TL_wallPaper g;
    public float h;
    public final File i;
    public final boolean j;
    public final boolean k;
    public TLRPC.WallPaper l;
    public Bitmap m;

    public sc1(int i7, int i10, int i11, String str) {
        this.a = str;
        this.b = i7 | (-16777216);
        int i12 = i10 == 0 ? 0 : i10 | (-16777216);
        this.c = i12;
        this.f = i12 == 0 ? 0 : i11;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.b));
        sb2.append(this.c);
        sb2.append(this.d);
        sb2.append(this.e);
        sb2.append(this.f);
        sb2.append(this.h);
        String str = this.a;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        return Utilities.a(sb2.toString());
    }

    public final String b() {
        int i7 = this.c;
        String lowerCase = i7 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i7 >> 16)) & 255), Integer.valueOf(((byte) (i7 >> 8)) & 255), Byte.valueOf((byte) (i7 & org.telegram.messenger.qs.e4))).toLowerCase() : null;
        int i10 = this.b;
        String lowerCase2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & org.telegram.messenger.qs.e4))).toLowerCase();
        int i11 = this.d;
        String lowerCase3 = i11 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (i11 >> 8)) & 255), Byte.valueOf((byte) (i11 & org.telegram.messenger.qs.e4))).toLowerCase() : null;
        int i12 = this.e;
        String lowerCase4 = i12 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (i12 >> 8)) & 255), Byte.valueOf((byte) (i12 & org.telegram.messenger.qs.e4))).toLowerCase() : null;
        if (lowerCase == null || lowerCase3 == null) {
            if (lowerCase != null) {
                String D = a8.p0.D(lowerCase2, "-", lowerCase);
                if (this.g != null) {
                    StringBuilder j3 = rf.b.j(D, "&rotation=");
                    j3.append(org.telegram.messenger.g0.s1(this.f, true));
                    lowerCase2 = j3.toString();
                } else {
                    StringBuilder j10 = rf.b.j(D, "?rotation=");
                    j10.append(org.telegram.messenger.g0.s1(this.f, true));
                    lowerCase2 = j10.toString();
                }
            }
        } else if (lowerCase4 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(lowerCase2);
            sb2.append("~");
            sb2.append(lowerCase);
            sb2.append("~");
            sb2.append(lowerCase3);
            lowerCase2 = a8.p0.s(sb2, "~", lowerCase4);
        } else {
            lowerCase2 = lowerCase2 + "~" + lowerCase + "~" + lowerCase3;
        }
        if (this.g == null) {
            return org.telegram.ui.Cells.f1.n(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).U2, "/bg/", lowerCase2, new StringBuilder("https://"));
        }
        String str = "https://" + org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).U2 + "/bg/" + this.g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase2;
        return this.j ? rf.b.r(str, "&mode=motion") : str;
    }

    public sc1(String str, int i7, int i10, int i11, int i12) {
        this.a = str;
        this.b = i7 | (-16777216);
        this.c = i10 == 0 ? 0 : i10 | (-16777216);
        this.d = i11 == 0 ? 0 : i11 | (-16777216);
        this.e = i12 != 0 ? i12 | (-16777216) : 0;
        this.h = 1.0f;
        this.k = true;
    }

    public sc1(String str, int i7, int i10, int i11, int i12, int i13, float f10, boolean z9, File file) {
        this.a = str;
        this.b = i7 | (-16777216);
        int i14 = i10 == 0 ? 0 : i10 | (-16777216);
        this.c = i14;
        this.d = i11 == 0 ? 0 : i11 | (-16777216);
        this.e = i12 != 0 ? i12 | (-16777216) : 0;
        this.f = i14 == 0 ? 45 : i13;
        this.h = f10;
        this.i = file;
        this.j = z9;
    }
}
