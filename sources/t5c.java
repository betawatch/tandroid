// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class t5c {
    public static s5c a(Object obj) {
        fs4 fs4Var = (fs4) obj;
        s5c s5cVar = fs4Var.unknownFields;
        if (s5cVar != s5c.f) {
            return s5cVar;
        }
        s5c s5cVar2 = new s5c(0, new int[8], new Object[8], true);
        fs4Var.unknownFields = s5cVar2;
        return s5cVar2;
    }

    public static boolean b(int i, af0 af0Var, Object obj) {
        ak2 ak2Var = (ak2) af0Var.d;
        int i2 = af0Var.a;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            af0Var.B(0);
            ((s5c) obj).c(i3 << 3, Long.valueOf(ak2Var.n()));
            return true;
        }
        if (i4 == 1) {
            af0Var.B(1);
            ((s5c) obj).c((i3 << 3) | 1, Long.valueOf(ak2Var.k()));
            return true;
        }
        if (i4 == 2) {
            ((s5c) obj).c((i3 << 3) | 2, af0Var.h());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw zp5.b();
            }
            af0Var.B(5);
            ((s5c) obj).c((i3 << 3) | 5, Integer.valueOf(ak2Var.j()));
            return true;
        }
        s5c s5cVar = new s5c(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new zp5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (af0Var.c() != Integer.MAX_VALUE && b(i7, af0Var, s5cVar)) {
        }
        if (i6 != af0Var.a) {
            throw new zp5("Protocol message end-group tag did not match expected tag.");
        }
        if (s5cVar.e) {
            s5cVar.e = false;
        }
        ((s5c) obj).c(i5 | 3, s5cVar);
        return true;
    }
}
