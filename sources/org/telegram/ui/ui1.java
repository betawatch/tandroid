package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ui1 {
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

    public ui1(int i10, int i11, String str, int i12) {
        this.a = str;
        this.b = i10 | (-16777216);
        int i13 = i11 == 0 ? 0 : i11 | (-16777216);
        this.c = i13;
        this.f = i13 == 0 ? 0 : i12;
        this.h = 1.0f;
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
        return Utilities.MD5(sb.toString());
    }

    public final String b() {
        int i10 = this.c;
        String lowerCase = i10 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase() : null;
        int i11 = this.b;
        String lowerCase2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (i11 >> 8)) & 255), Byte.valueOf((byte) (i11 & 255))).toLowerCase();
        int i12 = this.d;
        String lowerCase3 = i12 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (i12 >> 8)) & 255), Byte.valueOf((byte) (i12 & 255))).toLowerCase() : null;
        int i13 = this.e;
        String lowerCase4 = i13 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (i13 >> 8)) & 255), Byte.valueOf((byte) (i13 & 255))).toLowerCase() : null;
        if (lowerCase == null || lowerCase3 == null) {
            if (lowerCase != null) {
                String z4 = android.support.v4.media.a.z(lowerCase2, "-", lowerCase);
                if (this.g != null) {
                    StringBuilder f10 = vh.w2.f(z4, "&rotation=");
                    f10.append(AndroidUtilities.getWallpaperRotation(this.f, true));
                    lowerCase2 = f10.toString();
                } else {
                    StringBuilder f11 = vh.w2.f(z4, "?rotation=");
                    f11.append(AndroidUtilities.getWallpaperRotation(this.f, true));
                    lowerCase2 = f11.toString();
                }
            }
        } else if (lowerCase4 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(lowerCase2);
            sb.append("~");
            sb.append(lowerCase);
            sb.append("~");
            sb.append(lowerCase3);
            lowerCase2 = android.support.v4.media.a.r(sb, "~", lowerCase4);
        } else {
            lowerCase2 = lowerCase2 + "~" + lowerCase + "~" + lowerCase3;
        }
        if (this.g == null) {
            return android.support.v4.media.a.p(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/bg/", lowerCase2, new StringBuilder("https://"));
        }
        String str = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + this.g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase2;
        return this.j ? vh.w2.k(str, "&mode=motion") : str;
    }

    public ui1(String str, int i10, int i11, int i12, int i13) {
        this.a = str;
        this.b = i10 | (-16777216);
        this.c = i11 == 0 ? 0 : i11 | (-16777216);
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.e = i13 != 0 ? i13 | (-16777216) : 0;
        this.h = 1.0f;
        this.k = true;
    }

    public ui1(String str, int i10, int i11, int i12, int i13, int i14, float f10, boolean z4, File file) {
        this.a = str;
        this.b = i10 | (-16777216);
        int i15 = i11 == 0 ? 0 : i11 | (-16777216);
        this.c = i15;
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.e = i13 != 0 ? i13 | (-16777216) : 0;
        this.f = i15 == 0 ? 45 : i14;
        this.h = f10;
        this.i = file;
        this.j = z4;
    }
}
