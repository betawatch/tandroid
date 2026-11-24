// default package

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class q5c implements vcb {
    public final yw7 a = new yw7();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int h;

    public q5c(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.h = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.h = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = hac.h((((bArr[10] & 255) << 8) | (bArr[11] & 255)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i & nm7.d4) << 24) | (i >>> 8)), i3, i4, i5 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (z || z2) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    @Override // vcb
    public final /* synthetic */ lcb g(int i, int i2, byte[] bArr) {
        return hg9.c(this, bArr, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vcb
    public final void p(byte[] bArr, int i, int i2, ucb ucbVar, fu2 fu2Var) {
        String y;
        int i3;
        int i4;
        yw7 yw7Var = this.a;
        yw7Var.L(i + i2, bArr);
        yw7Var.N(i);
        int i5 = 1;
        int i6 = 0;
        int i7 = 2;
        jte.f(yw7Var.a() >= 2);
        int H = yw7Var.H();
        if (H == 0) {
            y = "";
        } else {
            int i8 = yw7Var.b;
            Charset J = yw7Var.J();
            int i9 = H - (yw7Var.b - i8);
            if (J == null) {
                J = StandardCharsets.UTF_8;
            }
            y = yw7Var.y(i9, J);
        }
        if (y.isEmpty()) {
            ko5 ko5Var = mo5.b;
            fu2Var.accept(new i53(-9223372036854775807L, -9223372036854775807L, y79.e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(y);
        b(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.f;
        while (yw7Var.a() >= 8) {
            int i10 = yw7Var.b;
            int m = yw7Var.m();
            int m2 = yw7Var.m();
            if (m2 == 1937013100) {
                jte.f(yw7Var.a() >= i7 ? i5 : i6);
                int H2 = yw7Var.H();
                int i11 = i6;
                while (i11 < H2) {
                    jte.f(yw7Var.a() >= 12 ? i5 : i6);
                    int H3 = yw7Var.H();
                    int H4 = yw7Var.H();
                    yw7Var.O(i7);
                    int i12 = i11;
                    int A = yw7Var.A();
                    yw7Var.O(i5);
                    int m3 = yw7Var.m();
                    if (H4 > spannableStringBuilder.length()) {
                        StringBuilder l = hg9.l(H4, "Truncating styl end (", ") to cueText.length() (");
                        l.append(spannableStringBuilder.length());
                        l.append(").");
                        ncd.f("Tx3gParser", l.toString());
                        H4 = spannableStringBuilder.length();
                    }
                    if (H3 >= H4) {
                        ncd.f("Tx3gParser", "Ignoring styl with start (" + H3 + ") >= end (" + H4 + ").");
                        i4 = i12;
                    } else {
                        i4 = i12;
                        int i13 = H4;
                        b(spannableStringBuilder, A, this.c, H3, i13, 0);
                        a(spannableStringBuilder, m3, this.d, H3, i13, 0);
                    }
                    i11 = i4 + 1;
                    i5 = 1;
                    i6 = 0;
                    i7 = 2;
                }
                i3 = i7;
            } else if (m2 == 1952608120 && this.b) {
                i3 = 2;
                jte.f(yw7Var.a() >= 2);
                f = hac.h(yw7Var.H() / this.h, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            yw7Var.N(i10 + m);
            i7 = i3;
            i5 = 1;
            i6 = 0;
        }
        fu2Var.accept(new i53(-9223372036854775807L, -9223372036854775807L, mo5.u(new f53(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f, 0))));
    }

    @Override // vcb
    public final int r() {
        return 2;
    }

    @Override // vcb
    public final void reset() {
    }
}
