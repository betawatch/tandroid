package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xh1 {
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

    public xh1(int i9, int i10, String str, int i11) {
        this.a = str;
        this.b = i9 | (-16777216);
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
        return Utilities.MD5(sb2.toString());
    }

    public final String b() {
        int i9 = this.c;
        String lowerCase = i9 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i9 >> 16)) & 255), Integer.valueOf(((byte) (i9 >> 8)) & 255), Byte.valueOf((byte) (i9 & 255))).toLowerCase() : null;
        int i10 = this.b;
        String lowerCase2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase();
        int i11 = this.d;
        String lowerCase3 = i11 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (i11 >> 8)) & 255), Byte.valueOf((byte) (i11 & 255))).toLowerCase() : null;
        int i12 = this.e;
        String lowerCase4 = i12 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (i12 >> 8)) & 255), Byte.valueOf((byte) (i12 & 255))).toLowerCase() : null;
        if (lowerCase == null || lowerCase3 == null) {
            if (lowerCase != null) {
                String z10 = aa.d.z(lowerCase2, "-", lowerCase);
                if (this.g != null) {
                    StringBuilder e10 = ta.b.e(z10, "&rotation=");
                    e10.append(AndroidUtilities.getWallpaperRotation(this.f, true));
                    lowerCase2 = e10.toString();
                } else {
                    StringBuilder e11 = ta.b.e(z10, "?rotation=");
                    e11.append(AndroidUtilities.getWallpaperRotation(this.f, true));
                    lowerCase2 = e11.toString();
                }
            }
        } else if (lowerCase4 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(lowerCase2);
            sb2.append("~");
            sb2.append(lowerCase);
            sb2.append("~");
            sb2.append(lowerCase3);
            lowerCase2 = aa.d.r(sb2, "~", lowerCase4);
        } else {
            lowerCase2 = lowerCase2 + "~" + lowerCase + "~" + lowerCase3;
        }
        if (this.g == null) {
            return aa.d.p(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/bg/", lowerCase2, new StringBuilder("https://"));
        }
        String str = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + this.g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase2;
        return this.j ? ta.b.j(str, "&mode=motion") : str;
    }

    public xh1(String str, int i9, int i10, int i11, int i12) {
        this.a = str;
        this.b = i9 | (-16777216);
        this.c = i10 == 0 ? 0 : i10 | (-16777216);
        this.d = i11 == 0 ? 0 : i11 | (-16777216);
        this.e = i12 != 0 ? i12 | (-16777216) : 0;
        this.h = 1.0f;
        this.k = true;
    }

    public xh1(String str, int i9, int i10, int i11, int i12, int i13, float f10, boolean z10, File file) {
        this.a = str;
        this.b = i9 | (-16777216);
        int i14 = i10 == 0 ? 0 : i10 | (-16777216);
        this.c = i14;
        this.d = i11 == 0 ? 0 : i11 | (-16777216);
        this.e = i12 != 0 ? i12 | (-16777216) : 0;
        this.f = i14 == 0 ? 45 : i13;
        this.h = f10;
        this.i = file;
        this.j = z10;
    }
}
