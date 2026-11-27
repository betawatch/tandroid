// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class t9c {
    public static s9c a(Object obj) {
        ju4 ju4Var = (ju4) obj;
        s9c s9cVar = ju4Var.unknownFields;
        if (s9cVar != s9c.f) {
            return s9cVar;
        }
        s9c s9cVar2 = new s9c(0, new int[8], new Object[8], true);
        ju4Var.unknownFields = s9cVar2;
        return s9cVar2;
    }

    public static boolean b(int i, cf0 cf0Var, Object obj) {
        vk2 vk2Var = (vk2) cf0Var.d;
        int i2 = cf0Var.a;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            cf0Var.B(0);
            ((s9c) obj).c(i3 << 3, Long.valueOf(vk2Var.n()));
            return true;
        }
        if (i4 == 1) {
            cf0Var.B(1);
            ((s9c) obj).c((i3 << 3) | 1, Long.valueOf(vk2Var.k()));
            return true;
        }
        if (i4 == 2) {
            ((s9c) obj).c((i3 << 3) | 2, cf0Var.h());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw bs5.b();
            }
            cf0Var.B(5);
            ((s9c) obj).c((i3 << 3) | 5, Integer.valueOf(vk2Var.j()));
            return true;
        }
        s9c s9cVar = new s9c(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new bs5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (cf0Var.c() != Integer.MAX_VALUE && b(i7, cf0Var, s9cVar)) {
        }
        if (i6 != cf0Var.a) {
            throw new bs5("Protocol message end-group tag did not match expected tag.");
        }
        if (s9cVar.e) {
            s9cVar.e = false;
        }
        ((s9c) obj).c(i5 | 3, s9cVar);
        return true;
    }
}
