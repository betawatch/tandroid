package xd;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class k extends j {
    public static Integer b(String str) {
        boolean z10;
        int i7;
        int i10;
        kotlin.jvm.internal.j.e(str, "<this>");
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        int i12 = -2147483647;
        if (kotlin.jvm.internal.j.f(charAt, 48) < 0) {
            i7 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z10 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i12 = TLObject.FLAG_31;
                z10 = true;
            }
        } else {
            z10 = false;
            i7 = 0;
        }
        int i13 = -59652323;
        while (i7 < length) {
            int digit = Character.digit((int) str.charAt(i7), 10);
            if (digit < 0) {
                return null;
            }
            if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / 10))) || (i10 = i11 * 10) < i12 + digit) {
                return null;
            }
            i11 = i10 - digit;
            i7++;
        }
        return z10 ? Integer.valueOf(i11) : Integer.valueOf(-i11);
    }
}
