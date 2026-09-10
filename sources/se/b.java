package se;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import t7.s;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class b {
    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(int i10, CharSequence charSequence) {
        char charAt;
        if (i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i10) == '<') {
            while (true) {
                i10++;
                if (i10 >= charSequence.length() || (charAt = charSequence.charAt(i10)) == '\n' || charAt == '<') {
                    break;
                }
                if (charAt == '>') {
                    return i10 + 1;
                }
                if (charAt == '\\') {
                    int i11 = i10 + 1;
                    if (s.a(i11, charSequence)) {
                        i10 = i11;
                    }
                }
            }
            return -1;
        }
        int i12 = 0;
        int i13 = i10;
        while (i13 < charSequence.length()) {
            char charAt2 = charSequence.charAt(i13);
            if (charAt2 == 0 || charAt2 == ' ') {
                if (i13 != i10) {
                    return i13;
                }
                return -1;
            }
            if (charAt2 == '\\') {
                int i14 = i13 + 1;
                if (s.a(i14, charSequence)) {
                    i13 = i14;
                }
            } else if (charAt2 == '(') {
                i12++;
                if (i12 > 32) {
                    return -1;
                }
            } else if (charAt2 != ')') {
                if (Character.isISOControl(charAt2)) {
                    if (i13 != i10) {
                    }
                }
            } else {
                if (i12 == 0) {
                    return i13;
                }
                i12--;
            }
            i13++;
        }
        return charSequence.length();
    }

    public static int c(int i10, CharSequence charSequence) {
        while (i10 < charSequence.length()) {
            switch (charSequence.charAt(i10)) {
                case '[':
                    return -1;
                case '\\':
                    int i11 = i10 + 1;
                    if (!s.a(i11, charSequence)) {
                        break;
                    } else {
                        i10 = i11;
                        break;
                    }
                case ']':
                    return i10;
            }
            i10++;
        }
        return charSequence.length();
    }

    public static int d(int i10, CharSequence charSequence) {
        if (i10 >= charSequence.length()) {
            return -1;
        }
        char charAt = charSequence.charAt(i10);
        char c10 = '\"';
        if (charAt != '\"') {
            c10 = '\'';
            if (charAt != '\'') {
                if (charAt != '(') {
                    return -1;
                }
                c10 = ')';
            }
        }
        int e = e(charSequence, i10 + 1, c10);
        if (e != -1 && e < charSequence.length() && charSequence.charAt(e) == c10) {
            return e + 1;
        }
        return -1;
    }

    public static int e(CharSequence charSequence, int i10, char c10) {
        while (i10 < charSequence.length()) {
            char charAt = charSequence.charAt(i10);
            if (charAt == '\\') {
                int i11 = i10 + 1;
                if (s.a(i11, charSequence)) {
                    i10 = i11;
                    i10++;
                }
            }
            if (charAt == c10) {
                return i10;
            }
            if (c10 == ')' && charAt == '(') {
                return -1;
            }
            i10++;
        }
        return charSequence.length();
    }
}
