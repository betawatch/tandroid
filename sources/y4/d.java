package y4;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import d5.f0;
import d7.u;
import g7.n8;
import g7.y7;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final f f;
    public final String[] g;
    public final String h;
    public final String i;
    public final d j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public d(String str, String str2, long j10, long j11, f fVar, String[] strArr, String str3, String str4, d dVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = fVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j10;
        this.e = j11;
        str3.getClass();
        this.h = str3;
        this.j = dVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static d a(String str) {
        return new d(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            r4.a aVar = new r4.a();
            aVar.a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((r4.a) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final d b(int i9) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (d) arrayList.get(i9);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z10) {
        String str = this.a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z10 || equals || (equals2 && this.i != null)) {
            long j10 = this.d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i9 = 0; i9 < this.m.size(); i9++) {
            ((d) this.m.get(i9)).d(treeSet, z10 || equals);
        }
    }

    public final boolean f(long j10) {
        long j11 = this.e;
        long j12 = this.d;
        if (j12 == -9223372036854775807L && j11 == -9223372036854775807L) {
            return true;
        }
        if (j12 <= j10 && j11 == -9223372036854775807L) {
            return true;
        }
        if (j12 != -9223372036854775807L || j10 >= j11) {
            return j12 <= j10 && j10 < j11;
        }
        return true;
    }

    public final void g(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j10) && "div".equals(this.a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i9 = 0; i9 < c(); i9++) {
            b(i9).g(j10, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0024 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0246 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j10, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        int i9;
        d dVar;
        int i10;
        int i11;
        Map map2 = map;
        if (f(j10)) {
            String str2 = this.h;
            String str3 = "".equals(str2) ? str : str2;
            for (Map.Entry entry : this.l.entrySet()) {
                String str4 = (String) entry.getKey();
                HashMap hashMap2 = this.k;
                int intValue = hashMap2.containsKey(str4) ? ((Integer) hashMap2.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    r4.a aVar = (r4.a) treeMap.get(str4);
                    aVar.getClass();
                    e eVar = (e) hashMap.get(str3);
                    eVar.getClass();
                    int i12 = eVar.j;
                    f a2 = n8.a(this.f, this.g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.a = spannableStringBuilder;
                    }
                    if (a2 != null) {
                        int i13 = a2.h;
                        int i14 = 1;
                        if (((i13 == -1 && a2.i == -1) ? -1 : (i13 == 1 ? (char) 1 : (char) 0) | (a2.i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i15 = a2.h;
                            if (i15 == -1) {
                                if (a2.i == -1) {
                                    i14 = 1;
                                    i11 = -1;
                                    StyleSpan styleSpan = new StyleSpan(i11);
                                    i9 = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i14 = 1;
                                }
                            }
                            i11 = (i15 == i14 ? 1 : 0) | (a2.i == i14 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i11);
                            i9 = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i9 = 33;
                        }
                        if (a2.f == i14) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i9);
                        }
                        if (a2.g == i14) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i9);
                        }
                        if (a2.c) {
                            if (!a2.c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            y7.a(new ForegroundColorSpan(a2.b), spannableStringBuilder, intValue, intValue2);
                        }
                        if (a2.e) {
                            if (!a2.e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            y7.a(new BackgroundColorSpan(a2.d), spannableStringBuilder, intValue, intValue2);
                        }
                        if (a2.a != null) {
                            y7.a(new TypefaceSpan(a2.a), spannableStringBuilder, intValue, intValue2);
                        }
                        b bVar = a2.r;
                        int i16 = 23;
                        if (bVar != null) {
                            if (bVar.a == -1 && i12 != 2) {
                            }
                            y7.a(new v9.d(i16), spannableStringBuilder, intValue, intValue2);
                        }
                        int i17 = a2.m;
                        if (i17 == 2) {
                            d dVar2 = this.j;
                            while (true) {
                                if (dVar2 == null) {
                                    dVar2 = null;
                                    break;
                                }
                                f a3 = n8.a(dVar2.f, dVar2.g, map2);
                                if (a3 != null && a3.m == 1) {
                                    break;
                                } else {
                                    dVar2 = dVar2.j;
                                }
                            }
                            if (dVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(dVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        dVar = null;
                                        break;
                                    }
                                    dVar = (d) arrayDeque.pop();
                                    f a10 = n8.a(dVar.f, dVar.g, map2);
                                    if (a10 != null && a10.m == 3) {
                                        break;
                                    }
                                    for (int c10 = dVar.c() - 1; c10 >= 0; c10--) {
                                        arrayDeque.push(dVar.b(c10));
                                    }
                                }
                                if (dVar != null) {
                                    if (dVar.c() == 1 && dVar.b(0).b != null) {
                                        String str5 = dVar.b(0).b;
                                        int i18 = f0.a;
                                        f a11 = n8.a(dVar.f, dVar.g, map2);
                                        if ((a11 != null ? a11.n : -1) == -1) {
                                            n8.a(dVar2.f, dVar2.g, map2);
                                        }
                                        spannableStringBuilder.setSpan(new u(23), intValue, intValue2, 33);
                                        if (a2.q == 1) {
                                            y7.a(new za.a(22), spannableStringBuilder, intValue, intValue2);
                                        }
                                        i10 = a2.j;
                                        if (i10 == 1) {
                                            y7.a(new AbsoluteSizeSpan((int) a2.k, true), spannableStringBuilder, intValue, intValue2);
                                        } else if (i10 == 2) {
                                            y7.a(new RelativeSizeSpan(a2.k), spannableStringBuilder, intValue, intValue2);
                                        } else if (i10 == 3) {
                                            y7.a(new RelativeSizeSpan(a2.k / 100.0f), spannableStringBuilder, intValue, intValue2);
                                        }
                                        if ("p".equals(this.a)) {
                                            float f10 = a2.s;
                                            if (f10 != Float.MAX_VALUE) {
                                                aVar.q = (f10 * (-90.0f)) / 100.0f;
                                            }
                                            Layout.Alignment alignment = a2.o;
                                            if (alignment != null) {
                                                aVar.c = alignment;
                                            }
                                            Layout.Alignment alignment2 = a2.p;
                                            if (alignment2 != null) {
                                                aVar.d = alignment2;
                                            }
                                        }
                                    }
                                    d5.a.v("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    if (a2.q == 1) {
                                    }
                                    i10 = a2.j;
                                    if (i10 == 1) {
                                    }
                                    if ("p".equals(this.a)) {
                                    }
                                }
                            }
                        } else if (i17 == 3 || i17 == 4) {
                            spannableStringBuilder.setSpan(new a(), intValue, intValue2, 33);
                        }
                        if (a2.q == 1) {
                        }
                        i10 = a2.j;
                        if (i10 == 1) {
                        }
                        if ("p".equals(this.a)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
            int i19 = 0;
            while (i19 < c()) {
                b(i19).h(j10, map2, hashMap, str3, treeMap);
                i19++;
                map2 = map;
            }
        }
    }

    public final void i(long j10, boolean z10, String str, TreeMap treeMap) {
        HashMap hashMap = this.k;
        hashMap.clear();
        HashMap hashMap2 = this.l;
        hashMap2.clear();
        String str2 = this.a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.c && z10) {
            SpannableStringBuilder e10 = e(str4, treeMap);
            String str5 = this.b;
            str5.getClass();
            e10.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z10) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((r4.a) entry.getValue()).a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i9 = 0; i9 < c(); i9++) {
                b(i9).i(j10, z10 || equals, str4, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e11 = e(str4, treeMap);
                int length = e11.length() - 1;
                while (length >= 0 && e11.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && e11.charAt(length) != '\n') {
                    e11.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((r4.a) entry2.getValue()).a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
