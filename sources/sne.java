// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class sne {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(int i, CharSequence charSequence) {
        char charAt;
        if (i >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i) == '<') {
            while (true) {
                i++;
                if (i >= charSequence.length() || (charAt = charSequence.charAt(i)) == '\n' || charAt == '<') {
                    break;
                }
                if (charAt == '>') {
                    return i + 1;
                }
                if (charAt == '\\') {
                    int i2 = i + 1;
                    if (lqe.a(i2, charSequence)) {
                        i = i2;
                    }
                }
            }
            return -1;
        }
        int i3 = 0;
        int i4 = i;
        while (i4 < charSequence.length()) {
            char charAt2 = charSequence.charAt(i4);
            if (charAt2 == 0 || charAt2 == ' ') {
                if (i4 != i) {
                    return i4;
                }
                return -1;
            }
            if (charAt2 == '\\') {
                int i5 = i4 + 1;
                if (lqe.a(i5, charSequence)) {
                    i4 = i5;
                }
            } else if (charAt2 == '(') {
                i3++;
                if (i3 > 32) {
                    return -1;
                }
            } else if (charAt2 != ')') {
                if (Character.isISOControl(charAt2)) {
                    if (i4 != i) {
                    }
                }
            } else {
                if (i3 == 0) {
                    return i4;
                }
                i3--;
            }
            i4++;
        }
        return charSequence.length();
    }

    public static int b(int i, CharSequence charSequence) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case kk7.b1 /* 91 */:
                    return -1;
                case kk7.c1 /* 92 */:
                    int i2 = i + 1;
                    if (!lqe.a(i2, charSequence)) {
                        break;
                    } else {
                        i = i2;
                        break;
                    }
                case kk7.d1 /* 93 */:
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static int c(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return -1;
        }
        char charAt = charSequence.charAt(i);
        char c = '\"';
        if (charAt != '\"') {
            c = '\'';
            if (charAt != '\'') {
                if (charAt != '(') {
                    return -1;
                }
                c = ')';
            }
        }
        int d = d(charSequence, i + 1, c);
        if (d != -1 && d < charSequence.length() && charSequence.charAt(d) == c) {
            return d + 1;
        }
        return -1;
    }

    public static int d(CharSequence charSequence, int i, char c) {
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            if (charAt == '\\') {
                int i2 = i + 1;
                if (lqe.a(i2, charSequence)) {
                    i = i2;
                    i++;
                }
            }
            if (charAt == c) {
                return i;
            }
            if (c == ')' && charAt == '(') {
                return -1;
            }
            i++;
        }
        return charSequence.length();
    }
}
