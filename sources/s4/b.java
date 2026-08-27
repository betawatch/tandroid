package s4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import d5.g0;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b {
    public final ArrayList a;
    public final ArrayList b;
    public final StringBuilder c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public b(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.c = sb2;
        this.g = i10;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
        this.h = i11;
    }

    public final void a(char c10) {
        StringBuilder sb2 = this.c;
        if (sb2.length() < 32) {
            sb2.append(c10);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i10 = aVar.c;
                if (i10 != length) {
                    return;
                }
                aVar.c = i10 - 1;
            }
        }
    }

    public final r4.c c(int i10) {
        float f10;
        int i11 = this.e + this.f;
        int i12 = 32 - i11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i13 >= arrayList.size()) {
                break;
            }
            CharSequence charSequence = (CharSequence) arrayList.get(i13);
            int i14 = g0.a;
            if (charSequence.length() > i12) {
                charSequence = charSequence.subSequence(0, i12);
            }
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append('\n');
            i13++;
        }
        SpannableString d = d();
        int i15 = g0.a;
        int length = d.length();
        CharSequence charSequence2 = d;
        if (length > i12) {
            charSequence2 = d.subSequence(0, i12);
        }
        spannableStringBuilder.append(charSequence2);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i12 - spannableStringBuilder.length();
        int i16 = i11 - length2;
        int i17 = i10 != Integer.MIN_VALUE ? i10 : (this.g != 2 || (Math.abs(i16) >= 3 && length2 >= 0)) ? (this.g != 2 || i16 <= 0) ? 0 : 2 : 1;
        if (i17 != 1) {
            f10 = i17 != 2 ? s3.c.c(i11, 32.0f, 0.8f, 0.1f) : s3.c.c(32 - length2, 32.0f, 0.8f, 0.1f);
        } else {
            f10 = 0.5f;
        }
        int i18 = this.d;
        if (i18 > 7) {
            i18 -= 17;
        } else if (this.g == 1) {
            i18 -= this.h - 1;
        }
        return new r4.c(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i18, 1, TLObject.FLAG_31, f10, i17, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
        int length = spannableStringBuilder.length();
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        int i14 = -1;
        int i15 = -1;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z11 = aVar.b;
            int i16 = aVar.a;
            if (i16 != 8) {
                boolean z12 = i16 == 7;
                if (i16 != 7) {
                    i15 = c.A[i16];
                }
                z10 = z12;
            }
            int i17 = aVar.c;
            i10++;
            if (i17 != (i10 < arrayList.size() ? ((a) arrayList.get(i10)).c : length)) {
                if (i11 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i17, 33);
                    i11 = -1;
                } else if (i11 == -1 && z11) {
                    i11 = i17;
                }
                if (i12 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i12, i17, 33);
                    i12 = -1;
                } else if (i12 == -1 && z10) {
                    i12 = i17;
                }
                if (i15 != i14) {
                    if (i14 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), i13, i17, 33);
                    }
                    i14 = i15;
                    i13 = i17;
                }
            }
        }
        if (i11 != -1 && i11 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
        }
        if (i12 != -1 && i12 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i12, length, 33);
        }
        if (i13 != length && i14 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), i13, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
    }
}
