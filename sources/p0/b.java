package p0;

import android.text.SpannableStringBuilder;
import c2.u;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b {
    public static final String b;
    public static final String c;
    public static final b d;
    public static final b e;
    public final boolean a;

    static {
        u uVar = f.c;
        b = Character.toString((char) 8206);
        c = Character.toString((char) 8207);
        d = new b(false);
        e = new b(true);
    }

    public b(boolean z4) {
        u uVar = f.a;
        this.a = z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0076, code lost:
    
        if (r0.c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007c, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008c, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.c = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = aVar.c;
            if (i13 < aVar.b && i10 == 0) {
                CharSequence charSequence2 = aVar.a;
                char charAt = charSequence2.charAt(i13);
                aVar.d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, aVar.c);
                    aVar.c = Character.charCount(codePointAt) + aVar.c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    aVar.c++;
                    char c3 = aVar.d;
                    directionality = c3 < 1792 ? a.e[c3] : Character.getDirectionality(c3);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i12 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                }
                i10 = i12;
            }
        }
        return -1;
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.c = aVar.b;
        int i10 = 0;
        int i11 = 0;
        while (aVar.c > 0) {
            byte a2 = aVar.a();
            if (a2 != 0) {
                if (a2 == 1 || a2 == 2) {
                    if (i10 == 0) {
                        return 1;
                    }
                    if (i11 == 0) {
                        i11 = i10;
                    }
                } else if (a2 != 9) {
                    switch (a2) {
                        case 14:
                        case 15:
                            if (i11 == i10) {
                                return -1;
                            }
                            i10--;
                            break;
                        case 16:
                        case 17:
                            if (i11 == i10) {
                                return 1;
                            }
                            i10--;
                            break;
                        case 18:
                            i10++;
                            break;
                        default:
                            if (i11 != 0) {
                                break;
                            } else {
                                i11 = i10;
                                break;
                            }
                    }
                } else {
                    continue;
                }
            } else {
                if (i10 == 0) {
                    return -1;
                }
                if (i11 == 0) {
                    i11 = i10;
                }
            }
        }
        return 0;
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        u uVar = f.c;
        if (charSequence == null) {
            return null;
        }
        boolean g10 = uVar.g(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean g11 = (g10 ? f.b : f.a).g(charSequence.length(), charSequence);
        String str = "";
        String str2 = c;
        String str3 = b;
        boolean z4 = this.a;
        spannableStringBuilder.append((CharSequence) ((z4 || !(g11 || a(charSequence) == 1)) ? (!z4 || (g11 && a(charSequence) != -1)) ? "" : str2 : str3));
        if (g10 != z4) {
            spannableStringBuilder.append(g10 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean g12 = (g10 ? f.b : f.a).g(charSequence.length(), charSequence);
        if (!z4 && (g12 || b(charSequence) == 1)) {
            str = str3;
        } else if (z4 && (!g12 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
