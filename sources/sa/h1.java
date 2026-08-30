package sa;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class h1 {
    public static final x0 A;
    public static final v0 B;
    public static final x0 a;
    public static final x0 b;
    public static final a1 c;
    public static final y0 d;
    public static final y0 e;
    public static final y0 f;
    public static final y0 g;
    public static final x0 h;
    public static final x0 i;
    public static final x0 j;
    public static final c0 k;
    public static final y0 l;
    public static final h0 m;
    public static final i0 n;
    public static final j0 o;
    public static final x0 p;
    public static final x0 q;
    public static final x0 r;
    public static final x0 s;
    public static final x0 t;
    public static final x0 u;
    public static final x0 v;
    public static final x0 w;
    public static final p x;
    public static final x0 y;
    public static final u0 z;

    static {
        int i10 = 0;
        a = new x0(Class.class, new l0().nullSafe(), i10);
        b = new x0(BitSet.class, new w0().nullSafe(), i10);
        z0 z0Var = new z0();
        c = new a1();
        d = new y0(Boolean.TYPE, Boolean.class, z0Var);
        e = new y0(Byte.TYPE, Byte.class, new b1());
        f = new y0(Short.TYPE, Short.class, new c1());
        g = new y0(Integer.TYPE, Integer.class, new d1());
        int i11 = 0;
        h = new x0(AtomicInteger.class, new e1().nullSafe(), i11);
        i = new x0(AtomicBoolean.class, new f1().nullSafe(), i11);
        j = new x0(AtomicIntegerArray.class, new b0().nullSafe(), i11);
        k = new c0();
        new d0();
        new e0();
        l = new y0(Character.TYPE, Character.class, new f0());
        g0 g0Var = new g0();
        m = new h0();
        n = new i0();
        o = new j0();
        int i12 = 0;
        p = new x0(String.class, g0Var, i12);
        q = new x0(StringBuilder.class, new k0(), i12);
        r = new x0(StringBuffer.class, new m0(), i12);
        s = new x0(URL.class, new n0(), i12);
        t = new x0(URI.class, new o0(), i12);
        u = new x0(InetAddress.class, new p0(), 1);
        int i13 = 0;
        v = new x0(UUID.class, new q0(), i13);
        w = new x0(Currency.class, new r0().nullSafe(), i13);
        x = new p(new s0(), 2);
        y = new x0(Locale.class, new t0(), 0);
        u0 u0Var = new u0();
        z = u0Var;
        A = new x0(pa.i.class, u0Var, 1);
        B = new v0();
    }
}
