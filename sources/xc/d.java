package xc;

import ad.e;
import ad.i;
import ad.j;
import ad.m;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import o1.g;
import org.webrtc.MediaStreamTrack;
import v7.s;
import x7.y5;
import x7.z5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends z5 {
    public static final Set g = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set h = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set i = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", MediaStreamTrack.VIDEO_TRACK_KIND)));
    public final s a;
    public final kb.a b;
    public final ArrayList c = new ArrayList(0);
    public a d = new a("", 0, Collections.EMPTY_MAP, null);
    public boolean e;
    public boolean f;

    public d(s sVar, kb.a aVar) {
        this.a = sVar;
        this.b = aVar;
    }

    public static Map a(j jVar) {
        zc.b bVar = jVar.k;
        int i3 = bVar.a;
        if (i3 <= 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(i3);
        int i10 = 0;
        while (true) {
            if (!(i10 < bVar.a)) {
                return DesugarCollections.unmodifiableMap(hashMap);
            }
            String str = bVar.c[i10];
            String str2 = bVar.b[i10];
            if (str == null) {
                str = "";
            }
            zc.a aVar = new zc.a();
            if (str2 == null) {
                throw new IllegalArgumentException("Object must not be null");
            }
            aVar.a = str2.trim();
            if (str2.length() == 0) {
                throw new IllegalArgumentException("String must not be empty");
            }
            aVar.b = str;
            aVar.c = bVar;
            i10++;
            hashMap.put(aVar.a.toLowerCase(Locale.US), aVar.b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0178, code lost:
    
        if (r8 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x017a, code lost:
    
        r17.append(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x017e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0184, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0185, code lost:
    
        r6.b(r12.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x018e, code lost:
    
        if (r4 != r6.d) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0191, code lost:
    
        r16.f = r11.contains(r6.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x019d, code lost:
    
        if ("p".equals(r3) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x019f, code lost:
    
        x7.y5.a(r17, '\n');
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a2, code lost:
    
        r16.d = r6.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015e, code lost:
    
        r4 = r6.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0164, code lost:
    
        if ("pre".equals(r3) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0166, code lost:
    
        r16.e = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0168, code lost:
    
        r12 = (java.lang.CharSequence) r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x016f, code lost:
    
        if (r4 != r12.length()) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0171, code lost:
    
        r8.getClass();
        r8 = v7.s.M0(r6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Appendable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ad.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Appendable appendable, String str) {
        e eVar;
        b bVar;
        int length;
        m mVar = new m(new ad.a(str), new ad.c(0));
        while (true) {
            if (mVar.e) {
                StringBuilder sb2 = mVar.g;
                int length2 = sb2.length();
                e eVar2 = mVar.l;
                if (length2 > 0) {
                    String sb3 = sb2.toString();
                    sb2.delete(0, sb2.length());
                    mVar.f = null;
                    eVar2.c = sb3;
                    eVar = eVar2;
                } else {
                    String str2 = mVar.f;
                    if (str2 != null) {
                        eVar2.c = str2;
                        mVar.f = null;
                        eVar = eVar2;
                    } else {
                        mVar.e = false;
                        eVar = mVar.d;
                    }
                }
                int i3 = eVar.b;
                if (6 == i3) {
                    return;
                }
                int c2 = g.c(i3);
                s sVar = this.a;
                Set set = i;
                ArrayList arrayList = this.c;
                Set set2 = g;
                if (c2 == 1) {
                    j jVar = (j) eVar;
                    boolean contains = set2.contains(jVar.d);
                    Set set3 = h;
                    if (contains) {
                        String str3 = jVar.d;
                        CharSequence charSequence = (CharSequence) appendable;
                        b bVar2 = new b(charSequence.length(), str3, a(jVar));
                        if (this.f) {
                            int length3 = charSequence.length();
                            if (length3 > 0 && '\n' != charSequence.charAt(length3 - 1)) {
                                y5.a(appendable, '\n');
                            }
                            this.f = false;
                        }
                        if (set3.contains(str3) || jVar.j) {
                            sVar.getClass();
                            String M0 = s.M0(bVar2);
                            if (M0 != null && M0.length() > 0) {
                                try {
                                    appendable.append(M0);
                                } catch (IOException e10) {
                                    throw new RuntimeException(e10);
                                }
                            }
                            int length4 = charSequence.length();
                            if (bVar2.d <= -1) {
                                bVar2.d = length4;
                            }
                        }
                        arrayList.add(bVar2);
                    } else {
                        String str4 = jVar.d;
                        if ("p".equals(this.d.a)) {
                            this.d.b(((CharSequence) appendable).length());
                            y5.a(appendable, '\n');
                            this.d = this.d.e;
                        } else if ("li".equals(str4) && "li".equals(this.d.a)) {
                            this.d.b(((CharSequence) appendable).length());
                            this.d = this.d.e;
                        }
                        if (set.contains(str4)) {
                            this.e = "pre".equals(str4);
                            CharSequence charSequence2 = (CharSequence) appendable;
                            int length5 = charSequence2.length();
                            if (length5 > 0 && '\n' != charSequence2.charAt(length5 - 1)) {
                                y5.a(appendable, '\n');
                            }
                        } else if (this.f) {
                            CharSequence charSequence3 = (CharSequence) appendable;
                            int length6 = charSequence3.length();
                            if (length6 > 0 && '\n' != charSequence3.charAt(length6 - 1)) {
                                y5.a(appendable, '\n');
                            }
                            this.f = false;
                        }
                        CharSequence charSequence4 = (CharSequence) appendable;
                        int length7 = charSequence4.length();
                        Map a10 = a(jVar);
                        a aVar = this.d;
                        a aVar2 = new a(str4, length7, a10, aVar);
                        boolean z10 = set3.contains(str4) || jVar.j;
                        if (z10) {
                            sVar.getClass();
                            String M02 = s.M0(aVar2);
                            if (M02 != null && M02.length() > 0) {
                                try {
                                    appendable.append(M02);
                                } catch (IOException e11) {
                                    throw new RuntimeException(e11);
                                }
                            }
                            aVar2.b(charSequence4.length());
                        }
                        ArrayList arrayList2 = aVar.f;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList(2);
                            aVar.f = arrayList2;
                        }
                        arrayList2.add(aVar2);
                        if (!z10) {
                            this.d = aVar2;
                        }
                    }
                } else if (c2 == 2) {
                    i iVar = (i) eVar;
                    if (set2.contains(iVar.d)) {
                        String str5 = iVar.d;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size <= -1) {
                                bVar = null;
                                break;
                            }
                            bVar = (b) arrayList.get(size);
                            if (str5.equals(bVar.a) && bVar.d < 0) {
                                break;
                            } else {
                                size--;
                            }
                        }
                        if (bVar != null) {
                            CharSequence charSequence5 = (CharSequence) appendable;
                            if (bVar.b == charSequence5.length()) {
                                sVar.getClass();
                                String M03 = s.M0(bVar);
                                if (M03 != null) {
                                    try {
                                        appendable.append(M03);
                                    } catch (IOException e12) {
                                        throw new RuntimeException(e12);
                                    }
                                }
                            }
                            int length8 = charSequence5.length();
                            if (bVar.d <= -1) {
                                bVar.d = length8;
                            }
                        }
                    } else {
                        String str6 = iVar.d;
                        a aVar3 = this.d;
                        while (aVar3 != null && !str6.equals(aVar3.a) && aVar3.d <= -1) {
                            aVar3 = aVar3.e;
                        }
                    }
                } else if (c2 == 4) {
                    e eVar3 = eVar;
                    if (this.e) {
                        try {
                            appendable.append(eVar3.c);
                        } catch (IOException e13) {
                            throw new RuntimeException(e13);
                        }
                    } else {
                        if (this.f) {
                            CharSequence charSequence6 = (CharSequence) appendable;
                            int length9 = charSequence6.length();
                            if (length9 > 0 && '\n' != charSequence6.charAt(length9 - 1)) {
                                y5.a(appendable, '\n');
                            }
                            this.f = false;
                        }
                        String str7 = eVar3.c;
                        this.b.getClass();
                        CharSequence charSequence7 = (CharSequence) appendable;
                        int length10 = charSequence7.length();
                        int length11 = str7.length();
                        boolean z11 = false;
                        for (int i10 = 0; i10 < length11; i10++) {
                            char charAt = str7.charAt(i10);
                            if (Character.isWhitespace(charAt)) {
                                z11 = true;
                            } else {
                                if (z11 && (length = charSequence7.length()) > 0 && !Character.isWhitespace(charSequence7.charAt(length - 1))) {
                                    y5.a(appendable, ' ');
                                }
                                y5.a(appendable, charAt);
                                z11 = false;
                            }
                        }
                        if (z11 && length10 < charSequence7.length()) {
                            y5.a(appendable, ' ');
                        }
                    }
                }
                eVar.b();
            } else {
                mVar.c.d(mVar, mVar.a);
            }
        }
    }
}
