package s4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import d5.f0;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public b(int i9, int i10) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.c = sb2;
        this.g = i9;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
        this.h = i10;
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
                int i9 = aVar.c;
                if (i9 != length) {
                    return;
                }
                aVar.c = i9 - 1;
            }
        }
    }

    public final r4.b c(int i9) {
        float f10;
        int i10 = this.e + this.f;
        int i11 = 32 - i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i12 >= arrayList.size()) {
                break;
            }
            CharSequence charSequence = (CharSequence) arrayList.get(i12);
            int i13 = f0.a;
            if (charSequence.length() > i11) {
                charSequence = charSequence.subSequence(0, i11);
            }
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append('\n');
            i12++;
        }
        SpannableString d = d();
        int i14 = f0.a;
        int length = d.length();
        CharSequence charSequence2 = d;
        if (length > i11) {
            charSequence2 = d.subSequence(0, i11);
        }
        spannableStringBuilder.append(charSequence2);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i11 - spannableStringBuilder.length();
        int i15 = i10 - length2;
        int i16 = i9 != Integer.MIN_VALUE ? i9 : (this.g != 2 || (Math.abs(i15) >= 3 && length2 >= 0)) ? (this.g != 2 || i15 <= 0) ? 0 : 2 : 1;
        if (i16 != 1) {
            f10 = i16 != 2 ? j2.b(i10, 32.0f, 0.8f, 0.1f) : j2.b(32 - length2, 32.0f, 0.8f, 0.1f);
        } else {
            f10 = 0.5f;
        }
        int i17 = this.d;
        if (i17 > 7) {
            i17 -= 17;
        } else if (this.g == 1) {
            i17 -= this.h - 1;
        }
        return new r4.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i17, 1, TLObject.FLAG_31, f10, i16, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
        int length = spannableStringBuilder.length();
        int i9 = 0;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        int i13 = -1;
        int i14 = -1;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.a;
            if (i9 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i9);
            boolean z11 = aVar.b;
            int i15 = aVar.a;
            if (i15 != 8) {
                boolean z12 = i15 == 7;
                if (i15 != 7) {
                    i14 = c.A[i15];
                }
                z10 = z12;
            }
            int i16 = aVar.c;
            i9++;
            if (i16 != (i9 < arrayList.size() ? ((a) arrayList.get(i9)).c : length)) {
                if (i10 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i16, 33);
                    i10 = -1;
                } else if (i10 == -1 && z11) {
                    i10 = i16;
                }
                if (i11 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i11, i16, 33);
                    i11 = -1;
                } else if (i11 == -1 && z10) {
                    i11 = i16;
                }
                if (i14 != i13) {
                    if (i13 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), i12, i16, 33);
                    }
                    i13 = i14;
                    i12 = i16;
                }
            }
        }
        if (i10 != -1 && i10 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
        }
        if (i11 != -1 && i11 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
        }
        if (i12 != length && i13 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), i12, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
    }
}
