// default package

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class si0 {
    public static final String b;
    public static final String c;
    public static final si0 d;
    public static final si0 e;
    public final boolean a;

    static {
        m41 m41Var = jjb.c;
        b = "\u200e";
        c = "\u200f";
        d = new si0(false);
        e = new si0(true);
    }

    public si0(boolean z) {
        m41 m41Var = jjb.a;
        this.a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006c, code lost:
    
        if (r1 == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006e, code lost:
    
        if (r2 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0073, code lost:
    
        if (r0.c <= 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0079, code lost:
    
        switch(r0.a()) {
            case 14: goto L64;
            case 15: goto L64;
            case 16: goto L63;
            case 17: goto L63;
            case 18: goto L62;
            default: goto L68;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007d, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0080, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0089, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        ri0 ri0Var = new ri0(charSequence);
        ri0Var.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = ri0Var.c;
            if (i4 < ri0Var.b && i == 0) {
                CharSequence charSequence2 = ri0Var.a;
                char charAt = charSequence2.charAt(i4);
                ri0Var.d = charAt;
                boolean isHighSurrogate = Character.isHighSurrogate(charAt);
                int i5 = ri0Var.c;
                if (isHighSurrogate) {
                    int codePointAt = Character.codePointAt(charSequence2, i5);
                    ri0Var.c = Character.charCount(codePointAt) + ri0Var.c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    ri0Var.c = i5 + 1;
                    char c2 = ri0Var.d;
                    directionality = c2 < 1792 ? ri0.e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                }
                i = i3;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(CharSequence charSequence) {
        ri0 ri0Var = new ri0(charSequence);
        ri0Var.c = ri0Var.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (ri0Var.c > 0) {
                byte a = ri0Var.a();
                if (a != 0) {
                    if (a == 1 || a == 2) {
                        if (i != 0) {
                            if (i2 == 0) {
                                break;
                            }
                        }
                    } else if (a != 9) {
                        switch (a) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    break;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SpannableStringBuilder c(CharSequence charSequence) {
        String str;
        m41 m41Var = jjb.c;
        if (charSequence == null) {
            return null;
        }
        boolean i = m41Var.i(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean i2 = (i ? jjb.b : jjb.a).i(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = c;
        String str4 = b;
        boolean z = this.a;
        if (z) {
            if (!i2 || a(charSequence) == -1) {
                str = str3;
                spannableStringBuilder.append((CharSequence) str);
                if (i == z) {
                }
                boolean i3 = (!i ? jjb.b : jjb.a).i(charSequence.length(), charSequence);
                if (z) {
                }
                spannableStringBuilder.append((CharSequence) str2);
                return spannableStringBuilder;
            }
            str = "";
            spannableStringBuilder.append((CharSequence) str);
            if (i == z) {
            }
            boolean i32 = (!i ? jjb.b : jjb.a).i(charSequence.length(), charSequence);
            if (z) {
            }
            spannableStringBuilder.append((CharSequence) str2);
            return spannableStringBuilder;
        }
        if (i2 || a(charSequence) == 1) {
            str = str4;
            spannableStringBuilder.append((CharSequence) str);
            if (i == z) {
                spannableStringBuilder.append(i ? (char) 8235 : (char) 8234);
                spannableStringBuilder.append(charSequence);
                spannableStringBuilder.append((char) 8236);
            } else {
                spannableStringBuilder.append(charSequence);
            }
            boolean i322 = (!i ? jjb.b : jjb.a).i(charSequence.length(), charSequence);
            if (z) {
                if (i322 || b(charSequence) == 1) {
                    str2 = str4;
                }
            } else if (!i322 || b(charSequence) == -1) {
                str2 = str3;
            }
            spannableStringBuilder.append((CharSequence) str2);
            return spannableStringBuilder;
        }
        str = "";
        spannableStringBuilder.append((CharSequence) str);
        if (i == z) {
        }
        boolean i3222 = (!i ? jjb.b : jjb.a).i(charSequence.length(), charSequence);
        if (z) {
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
