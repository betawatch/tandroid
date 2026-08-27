package z4;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import d5.g0;
import d5.z;
import java.nio.charset.Charset;
import java.util.List;
import o8.d;
import org.telegram.tgnet.TLObject;
import r4.c;
import r4.f;
import r4.g;
import r4.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a extends f {
    public final z b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final float g;
    public final int h;

    public a(List list) {
        super("Tx3gDecoder");
        this.b = new z();
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.d = 0;
            this.e = -1;
            this.f = "sans-serif";
            this.c = false;
            this.g = 0.85f;
            this.h = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.d = bArr[24];
        this.e = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f = "Serif".equals(new String(bArr, 43, bArr.length - 43, d.c)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.h = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.c = z10;
        if (z10) {
            this.g = g0.g(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.g = 0.85f;
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    @Override // r4.f
    public final g c(int i10, boolean z10, byte[] bArr) {
        String p6;
        z zVar = this.b;
        zVar.A(i10, bArr);
        int i11 = 2;
        if (zVar.a() < 2) {
            throw new i("Unexpected subtitle format.");
        }
        int w10 = zVar.w();
        if (w10 == 0) {
            p6 = "";
        } else {
            int i12 = zVar.b;
            Charset y10 = zVar.y();
            int i13 = w10 - (zVar.b - i12);
            if (y10 == null) {
                y10 = d.c;
            }
            p6 = zVar.p(i13, y10);
        }
        if (p6.isEmpty()) {
            return b.b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p6);
        e(spannableStringBuilder, this.d, 0, 0, spannableStringBuilder.length(), 16711680);
        d(spannableStringBuilder, this.e, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f10 = this.g;
        while (zVar.a() >= 8) {
            int i14 = zVar.b;
            int e9 = zVar.e();
            int e10 = zVar.e();
            if (e10 == 1937013100) {
                if (zVar.a() < i11) {
                    throw new i("Unexpected subtitle format.");
                }
                int w11 = zVar.w();
                int i15 = 0;
                while (i15 < w11) {
                    if (zVar.a() < 12) {
                        throw new i("Unexpected subtitle format.");
                    }
                    int w12 = zVar.w();
                    int w13 = zVar.w();
                    zVar.D(i11);
                    int r10 = zVar.r();
                    zVar.D(1);
                    int e11 = zVar.e();
                    if (w13 > spannableStringBuilder.length()) {
                        StringBuilder o10 = i0.a.o(w13, "Truncating styl end (", ") to cueText.length() (");
                        o10.append(spannableStringBuilder.length());
                        o10.append(").");
                        d5.a.K("Tx3gDecoder", o10.toString());
                        w13 = spannableStringBuilder.length();
                    }
                    int i16 = w13;
                    if (w12 >= i16) {
                        d5.a.K("Tx3gDecoder", "Ignoring styl with start (" + w12 + ") >= end (" + i16 + ").");
                    } else {
                        e(spannableStringBuilder, r10, this.d, w12, i16, 0);
                        d(spannableStringBuilder, e11, this.e, w12, i16, 0);
                    }
                    i15++;
                    i11 = 2;
                }
            } else if (e10 == 1952608120 && this.c) {
                i11 = 2;
                if (zVar.a() < 2) {
                    throw new i("Unexpected subtitle format.");
                }
                f10 = g0.g(zVar.w() / this.h, 0.0f, 0.95f);
            } else {
                i11 = 2;
            }
            zVar.C(i14 + e9);
        }
        return new b(new c(spannableStringBuilder, null, null, null, f10, 0, 0, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f));
    }
}
