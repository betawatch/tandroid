package qi;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import com.google.android.gms.internal.play_billing.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ki.l1;
import org.telegram.messenger.ks;
import p4.r0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public abstract class j {
    public static int c;
    public static final p a = new p(new r0(24), new r0(25));
    public static final LinkedHashMap b = new LinkedHashMap(8, 0.75f, true);
    public static final Object d = new Object();
    public static final ArrayList e = new ArrayList();

    public static void a(Spannable spannable, int i7, s0 s0Var) {
        if (i7 == 0) {
            return;
        }
        boolean z10 = spannable instanceof d;
        for (c cVar : (c[]) (z10 ? d.a((d) spannable, i7, c.class) : spannable.getSpans(0, i7, c.class))) {
            d(spannable, i7, cVar);
            spannable.removeSpan(cVar);
        }
        for (h hVar : (h[]) (z10 ? d.a((d) spannable, i7, h.class) : spannable.getSpans(0, i7, h.class))) {
            d(spannable, i7, hVar);
            spannable.removeSpan(hVar);
        }
        if (s0Var == null) {
            return;
        }
        int[] b10 = s0Var.b();
        for (int i10 = 0; i10 < b10.length; i10 += 3) {
            int i11 = b10[i10];
            int i12 = b10[i10 + 1];
            int i13 = b10[i10 + 2];
            if (i11 >= 0 && i12 <= i7 && i11 < i12) {
                int i14 = i13 & ks.e4;
                if (i14 != 0) {
                    spannable.setSpan(new c(i14), i11, i12, 33);
                }
                if ((i13 & 768) != 0) {
                    spannable.setSpan(new h(i13), i11, i12, 33);
                }
            }
        }
    }

    public static SpannableString b(CharSequence charSequence, String str) {
        if (charSequence == null) {
            charSequence = "";
        }
        String b10 = p.b(str);
        if (b10.isEmpty() || charSequence.length() == 0) {
            return new SpannableString(charSequence);
        }
        String charSequence2 = charSequence.toString();
        b bVar = new b(b10, charSequence2);
        boolean z10 = !(charSequence instanceof Spanned) && charSequence2.length() <= 65536;
        LinkedHashMap linkedHashMap = b;
        synchronized (linkedHashMap) {
            if (z10) {
                try {
                    SpannableString spannableString = (SpannableString) linkedHashMap.get(bVar);
                    if (spannableString != null) {
                        return spannableString;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            d dVar = new d(charSequence);
            if (z10) {
                linkedHashMap.put(bVar, dVar);
                c += charSequence2.length();
                while (true) {
                    LinkedHashMap linkedHashMap2 = b;
                    if (linkedHashMap2.size() <= 8 && c <= 65536) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                    c -= ((b) entry.getKey()).b.length();
                    linkedHashMap2.remove(entry.getKey());
                }
            }
            c(dVar, dVar.length(), b10);
            return dVar;
        }
    }

    public static void c(Spannable spannable, int i7, String str) {
        i iVar;
        i iVar2;
        o oVar;
        if (spannable == null) {
            return;
        }
        if (i7 < 0 || i7 > spannable.length()) {
            throw new IndexOutOfBoundsException();
        }
        f fVar = new f(spannable.subSequence(0, i7).toString());
        long j3 = (0 << 32) | (i7 & 4294967295L);
        synchronized (d) {
            try {
                ArrayList arrayList = e;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        iVar = new i(spannable);
                        arrayList.add(iVar);
                        break;
                    }
                    iVar = (i) it.next();
                    Spannable spannable2 = (Spannable) iVar.a.get();
                    if (spannable2 == null) {
                        it.remove();
                    } else if (spannable2 == spannable) {
                        break;
                    }
                }
                iVar2 = iVar;
                f fVar2 = (f) iVar2.b.put(Long.valueOf(j3), fVar);
                if (fVar2 != null && (oVar = fVar2.b) != null) {
                    oVar.a = null;
                }
            } finally {
            }
        }
        o d2 = a.d(fVar.a, str, new l1(i7, 4, j3, iVar2, fVar));
        synchronized (d) {
            try {
                if (iVar2.b.get(Long.valueOf(j3)) == fVar) {
                    fVar.b = d2;
                } else {
                    d2.a = null;
                }
            } finally {
            }
        }
    }

    public static void d(Spannable spannable, int i7, CharacterStyle characterStyle) {
        int spanStart;
        int spanEnd;
        if (spannable instanceof d) {
            d dVar = (d) spannable;
            spanStart = d.b(dVar, characterStyle);
            spanEnd = d.c(dVar, characterStyle);
        } else {
            spanStart = spannable.getSpanStart(characterStyle);
            spanEnd = spannable.getSpanEnd(characterStyle);
        }
        if (spanStart >= 0 && spanStart < 0) {
            spannable.setSpan(characterStyle instanceof c ? new c(((c) characterStyle).a) : new h(((h) characterStyle).b), spanStart, Math.min(0, spanEnd), 33);
        }
        if (spanEnd > i7) {
            spannable.setSpan(characterStyle instanceof c ? new c(((c) characterStyle).a) : new h(((h) characterStyle).b), Math.max(i7, spanStart), spanEnd, 33);
        }
    }
}
