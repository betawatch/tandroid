package w4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        StringBuilder sb = new StringBuilder();
        this.c = sb;
        this.g = i10;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
        this.h = i11;
    }

    public final void a(char c3) {
        StringBuilder sb = this.c;
        if (sb.length() < 32) {
            sb.append(c3);
        }
    }

    public final void b() {
        StringBuilder sb = this.c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
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

    public final v4.b c(int i10) {
        float f10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i11 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i11));
            spannableStringBuilder.append('\n');
            i11++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i12 = this.e + this.f;
        int length = (32 - i12) - spannableStringBuilder.length();
        int i13 = i12 - length;
        int i14 = i10 != Integer.MIN_VALUE ? i10 : (this.g != 2 || (Math.abs(i13) >= 3 && length >= 0)) ? (this.g != 2 || i13 <= 0) ? 0 : 2 : 1;
        if (i14 != 1) {
            f10 = i14 != 2 ? w2.c(i12, 32.0f, 0.8f, 0.1f) : w2.c(32 - length, 32.0f, 0.8f, 0.1f);
        } else {
            f10 = 0.5f;
        }
        int i15 = this.d;
        if (i15 > 7) {
            i15 -= 17;
        } else if (this.g == 1) {
            i15 -= this.h - 1;
        }
        return new v4.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i15, 1, TLObject.FLAG_31, f10, i14, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f);
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
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z10 = aVar.b;
            int i16 = aVar.a;
            if (i16 != 8) {
                boolean z11 = i16 == 7;
                if (i16 != 7) {
                    i15 = c.A[i16];
                }
                z4 = z11;
            }
            int i17 = aVar.c;
            i10++;
            if (i17 != (i10 < arrayList.size() ? ((a) arrayList.get(i10)).c : length)) {
                if (i11 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i17, 33);
                    i11 = -1;
                } else if (i11 == -1 && z10) {
                    i11 = i17;
                }
                if (i12 != -1 && !z4) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i12, i17, 33);
                    i12 = -1;
                } else if (i12 == -1 && z4) {
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
