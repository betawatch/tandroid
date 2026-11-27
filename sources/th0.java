// default package

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class th0 {
    public static final String b;
    public static final String c;
    public static final th0 d;
    public static final th0 e;
    public final boolean a;

    static {
        n31 n31Var = elb.c;
        b = "\u200e";
        c = "\u200f";
        d = new th0(false);
        e = new th0(true);
    }

    public th0(boolean z) {
        n31 n31Var = elb.a;
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
        sh0 sh0Var = new sh0(charSequence);
        sh0Var.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = sh0Var.c;
            if (i4 < sh0Var.b && i == 0) {
                CharSequence charSequence2 = sh0Var.a;
                char charAt = charSequence2.charAt(i4);
                sh0Var.d = charAt;
                boolean isHighSurrogate = Character.isHighSurrogate(charAt);
                int i5 = sh0Var.c;
                if (isHighSurrogate) {
                    int codePointAt = Character.codePointAt(charSequence2, i5);
                    sh0Var.c = Character.charCount(codePointAt) + sh0Var.c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    sh0Var.c = i5 + 1;
                    char c2 = sh0Var.d;
                    directionality = c2 < 1792 ? sh0.e[c2] : Character.getDirectionality(c2);
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
        sh0 sh0Var = new sh0(charSequence);
        sh0Var.c = sh0Var.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (sh0Var.c > 0) {
                byte a = sh0Var.a();
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
        n31 n31Var = elb.c;
        if (charSequence == null) {
            return null;
        }
        boolean i = n31Var.i(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean i2 = (i ? elb.b : elb.a).i(charSequence.length(), charSequence);
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
                boolean i3 = (!i ? elb.b : elb.a).i(charSequence.length(), charSequence);
                if (z) {
                }
                spannableStringBuilder.append((CharSequence) str2);
                return spannableStringBuilder;
            }
            str = "";
            spannableStringBuilder.append((CharSequence) str);
            if (i == z) {
            }
            boolean i32 = (!i ? elb.b : elb.a).i(charSequence.length(), charSequence);
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
            boolean i322 = (!i ? elb.b : elb.a).i(charSequence.length(), charSequence);
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
        boolean i3222 = (!i ? elb.b : elb.a).i(charSequence.length(), charSequence);
        if (z) {
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
