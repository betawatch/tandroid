package z4;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import d5.f0;
import d5.y;
import j3.r0;
import java.nio.charset.Charset;
import java.util.List;
import n8.d;
import org.telegram.tgnet.TLObject;
import r4.e;
import r4.f;
import r4.h;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends e {
    public final y b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final float g;
    public final int h;

    public a(List list) {
        super("Tx3gDecoder");
        this.b = new y();
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
        int i9 = bArr[25] * 20;
        this.h = i9;
        boolean z10 = (bArr[0] & 32) != 0;
        this.c = z10;
        if (z10) {
            this.g = f0.g(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i9, 0.0f, 0.95f);
        } else {
            this.g = 0.85f;
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i9, int i10, int i11, int i12, int i13) {
        if (i9 != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i9 >>> 8) | ((i9 & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int i9, int i10, int i11, int i12, int i13) {
        if (i9 != i10) {
            int i14 = i13 | 33;
            boolean z10 = (i9 & 1) != 0;
            boolean z11 = (i9 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i11, i12, i14);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i11, i12, i14);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, i14);
            }
            boolean z12 = (i9 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i11, i12, i14);
        }
    }

    @Override // r4.e
    public final f c(int i9, boolean z10, byte[] bArr) {
        String p6;
        y yVar = this.b;
        yVar.A(i9, bArr);
        int i10 = 2;
        if (yVar.a() < 2) {
            throw new h("Unexpected subtitle format.");
        }
        int w8 = yVar.w();
        if (w8 == 0) {
            p6 = "";
        } else {
            int i11 = yVar.b;
            Charset y10 = yVar.y();
            int i12 = w8 - (yVar.b - i11);
            if (y10 == null) {
                y10 = d.c;
            }
            p6 = yVar.p(i12, y10);
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
        while (yVar.a() >= 8) {
            int i13 = yVar.b;
            int e10 = yVar.e();
            int e11 = yVar.e();
            if (e11 == 1937013100) {
                if (yVar.a() < i10) {
                    throw new h("Unexpected subtitle format.");
                }
                int w10 = yVar.w();
                int i14 = 0;
                while (i14 < w10) {
                    if (yVar.a() < 12) {
                        throw new h("Unexpected subtitle format.");
                    }
                    int w11 = yVar.w();
                    int w12 = yVar.w();
                    yVar.D(i10);
                    int r10 = yVar.r();
                    yVar.D(1);
                    int e12 = yVar.e();
                    if (w12 > spannableStringBuilder.length()) {
                        StringBuilder p9 = r0.p(w12, "Truncating styl end (", ") to cueText.length() (");
                        p9.append(spannableStringBuilder.length());
                        p9.append(").");
                        d5.a.K("Tx3gDecoder", p9.toString());
                        w12 = spannableStringBuilder.length();
                    }
                    int i15 = w12;
                    if (w11 >= i15) {
                        d5.a.K("Tx3gDecoder", "Ignoring styl with start (" + w11 + ") >= end (" + i15 + ").");
                    } else {
                        e(spannableStringBuilder, r10, this.d, w11, i15, 0);
                        d(spannableStringBuilder, e12, this.e, w11, i15, 0);
                    }
                    i14++;
                    i10 = 2;
                }
            } else if (e11 == 1952608120 && this.c) {
                i10 = 2;
                if (yVar.a() < 2) {
                    throw new h("Unexpected subtitle format.");
                }
                f10 = f0.g(yVar.w() / this.h, 0.0f, 0.95f);
            } else {
                i10 = 2;
            }
            yVar.C(i13 + e10);
        }
        return new b(new r4.b(spannableStringBuilder, null, null, null, f10, 0, 0, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f));
    }
}
