// default package

import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class v73 implements v63 {
    public final eb4 a;
    public final ln8 b;
    public final ax2 c;
    public final v39 d;
    public int f;
    public xma g;
    public final c5a i;
    public final ycb k;
    public final c5a l;
    public final nh7 e = new nh7();
    public final qx4 h = new qx4((byte) 23);
    public final ycb j = new ycb(new a73(this, 1));

    public v73(eb4 eb4Var, List list, ln8 ln8Var, ax2 ax2Var) {
        this.a = eb4Var;
        this.b = ln8Var;
        this.c = ax2Var;
        fw2 fw2Var = null;
        byte b = 0;
        byte b2 = 5;
        this.d = new v39(new h73(this, fw2Var, b), b2);
        this.i = new c5a(this, list);
        this.k = new ycb(new a73(this, b));
        this.l = new c5a(ax2Var, new s73(this, b), new ai1(this, fw2Var, b2));
    }

    @Override // v63
    public final Object a(eq4 eq4Var, gw2 gw2Var) {
        n6c n6cVar = (n6c) gw2Var.getContext().get(ie7.d);
        if (n6cVar != null) {
            n6cVar.a(this);
        }
        return ppd.c(new n6c(n6cVar, this), new zh1(this, eq4Var, null, (byte) 1), gw2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:11:0x0046, B:13:0x004e, B:15:0x0052, B:16:0x0055), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(gw2 gw2Var) {
        i73 i73Var;
        int i;
        nh7 nh7Var;
        int i2;
        try {
            if (gw2Var instanceof i73) {
                i73Var = (i73) gw2Var;
                int i3 = i73Var.e;
                if ((i3 & TLObject.FLAG_31) != 0) {
                    i73Var.e = i3 - TLObject.FLAG_31;
                    Object obj = i73Var.c;
                    i = i73Var.e;
                    if (i != 0) {
                        qse.b(obj);
                        i73Var.a = this;
                        nh7Var = this.e;
                        i73Var.b = nh7Var;
                        i73Var.e = 1;
                        Object d = nh7Var.d(i73Var);
                        bx2 bx2Var = bx2.a;
                        if (d == bx2Var) {
                            return bx2Var;
                        }
                    } else {
                        if (i != 1) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        nh7 nh7Var2 = i73Var.b;
                        v73 v73Var = i73Var.a;
                        qse.b(obj);
                        nh7Var = nh7Var2;
                        this = v73Var;
                    }
                    i2 = this.f - 1;
                    this.f = i2;
                    if (i2 == 0) {
                        xma xmaVar = this.g;
                        if (xmaVar != null) {
                            xmaVar.cancel(null);
                        }
                        this.g = null;
                    }
                    nh7Var.f(null);
                    return g5c.a;
                }
            }
            i2 = this.f - 1;
            this.f = i2;
            if (i2 == 0) {
            }
            nh7Var.f(null);
            return g5c.a;
        } catch (Throwable th) {
            nh7Var.f(null);
            throw th;
        }
        i73Var = new i73(this, gw2Var);
        Object obj2 = i73Var.c;
        i = i73Var.e;
        if (i != 0) {
        }
    }

    public final kp5 c() {
        return (kp5) this.k.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(8:49|(1:(1:(2:53|54))(3:55|56|57))|58|59|18|(1:20)(1:24)|21|22)(5:9|10|11|(2:13|14)(3:27|(1:29)|(2:31|(1:33)(2:38|39))(2:40|(2:42|43)(2:44|45)))|26)|35|36))|63|6|7|(0)(0)|35|36|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        if (r9 == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a8, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (r1 != r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (r9 != r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ae, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ac, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10, types: [cp2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [sa9] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [v73] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12, types: [v73] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [cp2, pt5] */
    /* JADX WARN: Type inference failed for: r9v8, types: [bp2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(d17 d17Var, gw2 gw2Var) {
        j73 j73Var;
        int i;
        Throwable th;
        Throwable a;
        cp2 cp2Var;
        ?? r9;
        Object c;
        cp2 cp2Var2;
        if (gw2Var instanceof j73) {
            j73Var = (j73) gw2Var;
            int i2 = j73Var.f;
            if ((i2 & TLObject.FLAG_31) != 0) {
                j73Var.f = i2 - TLObject.FLAG_31;
                ?? r11 = j73Var.d;
                i = j73Var.f;
                bx2 bx2Var = bx2.a;
                if (i == 0) {
                    try {
                        if (i != 1) {
                            if (i == 2) {
                                cp2 cp2Var3 = j73Var.c;
                                v73 v73Var = j73Var.b;
                                d17 d17Var2 = (d17) j73Var.a;
                                qse.b(r11);
                                cp2Var = cp2Var3;
                                r9 = v73Var;
                                d17Var = d17Var2;
                            } else if (i != 3) {
                                sc8.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        this = (bp2) j73Var.a;
                        qse.b(r11);
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = new sa9(th);
                        a = ta9.a(r11);
                        ?? r92 = (cp2) this;
                        if (a == null) {
                        }
                        return g5c.a;
                    }
                    a = ta9.a(r11);
                    ?? r922 = (cp2) this;
                    if (a == null) {
                        r922.B(r11);
                    } else {
                        r922.P(a);
                    }
                    return g5c.a;
                }
                qse.b(r11);
                r11 = d17Var.b;
                try {
                    fwa G = this.h.G();
                    if (G instanceof s53) {
                        eq4 eq4Var = d17Var.a;
                        sw2 sw2Var = d17Var.d;
                        j73Var.a = r11;
                        j73Var.f = 1;
                        c = c().c(new r73((v73) this, sw2Var, eq4Var, (fw2) null), j73Var);
                        cp2Var2 = r11;
                    } else {
                        if (!(G instanceof l19 ? true : G instanceof o4c)) {
                            if (G instanceof uf4) {
                                throw ((uf4) G).b;
                            }
                            throw new gp2();
                        }
                        if (G != d17Var.c) {
                            G.getClass();
                            throw ((l19) G).b;
                        }
                        j73Var.a = d17Var;
                        j73Var.b = this;
                        j73Var.c = r11;
                        j73Var.f = 2;
                        Object f = f(j73Var);
                        this = this;
                        cp2Var = r11;
                    }
                    return bx2Var;
                } catch (Throwable th3) {
                    th = th3;
                    this = r11;
                    r11 = new sa9(th);
                    a = ta9.a(r11);
                    ?? r9222 = (cp2) this;
                    if (a == null) {
                    }
                    return g5c.a;
                }
                eq4 eq4Var2 = d17Var.a;
                sw2 sw2Var2 = d17Var.d;
                j73Var.a = cp2Var;
                j73Var.b = null;
                j73Var.c = null;
                j73Var.f = 3;
                c = r9.c().c(new r73((v73) r9, sw2Var2, eq4Var2, (fw2) null), j73Var);
                cp2Var2 = cp2Var;
            }
        }
        j73Var = new j73(this, gw2Var);
        ?? r112 = j73Var.d;
        i = j73Var.f;
        bx2 bx2Var2 = bx2.a;
        if (i == 0) {
        }
        eq4 eq4Var22 = d17Var.a;
        sw2 sw2Var22 = d17Var.d;
        j73Var.a = cp2Var;
        j73Var.b = null;
        j73Var.c = null;
        j73Var.f = 3;
        c = r9.c().c(new r73((v73) r9, sw2Var22, eq4Var22, (fw2) null), j73Var);
        cp2Var2 = cp2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:11:0x0046, B:13:0x004d), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(gw2 gw2Var) {
        k73 k73Var;
        int i;
        nh7 nh7Var;
        int i2;
        try {
            if (gw2Var instanceof k73) {
                k73Var = (k73) gw2Var;
                int i3 = k73Var.e;
                if ((i3 & TLObject.FLAG_31) != 0) {
                    k73Var.e = i3 - TLObject.FLAG_31;
                    Object obj = k73Var.c;
                    i = k73Var.e;
                    fw2 fw2Var = null;
                    if (i != 0) {
                        qse.b(obj);
                        k73Var.a = this;
                        nh7Var = this.e;
                        k73Var.b = nh7Var;
                        k73Var.e = 1;
                        Object d = nh7Var.d(k73Var);
                        bx2 bx2Var = bx2.a;
                        if (d == bx2Var) {
                            return bx2Var;
                        }
                    } else {
                        if (i != 1) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        nh7 nh7Var2 = k73Var.b;
                        v73 v73Var = k73Var.a;
                        qse.b(obj);
                        nh7Var = nh7Var2;
                        this = v73Var;
                    }
                    i2 = this.f + 1;
                    this.f = i2;
                    if (i2 == 1) {
                        this.g = ppd.b(this.c, new l73(this, fw2Var, (byte) 0));
                    }
                    nh7Var.f(null);
                    return g5c.a;
                }
            }
            i2 = this.f + 1;
            this.f = i2;
            if (i2 == 1) {
            }
            nh7Var.f(null);
            return g5c.a;
        } catch (Throwable th) {
            nh7Var.f(null);
            throw th;
        }
        k73Var = new k73(this, gw2Var);
        Object obj2 = k73Var.c;
        i = k73Var.e;
        fw2 fw2Var2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r1.M(r0) != r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        if (r7 != r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(gw2 gw2Var) {
        m73 m73Var;
        int i;
        int intValue;
        v73 v73Var;
        int i2;
        Throwable th;
        try {
            if (gw2Var instanceof m73) {
                m73Var = (m73) gw2Var;
                int i3 = m73Var.e;
                if ((i3 & TLObject.FLAG_31) != 0) {
                    m73Var.e = i3 - TLObject.FLAG_31;
                    Object obj = m73Var.c;
                    i = m73Var.e;
                    bx2 bx2Var = bx2.a;
                    if (i != 0) {
                        qse.b(obj);
                        kp5 c = c();
                        m73Var.a = this;
                        m73Var.e = 1;
                        obj = c.b(m73Var);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                sc8.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i2 = m73Var.b;
                            v73Var = m73Var.a;
                            try {
                                qse.b(obj);
                                return g5c.a;
                            } catch (Throwable th2) {
                                th = th2;
                                v73Var.h.L(new l19(i2, th));
                                throw th;
                            }
                        }
                        this = m73Var.a;
                        qse.b(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    c5a c5aVar = this.i;
                    m73Var.a = this;
                    m73Var.b = intValue;
                    m73Var.e = 2;
                }
            }
            c5a c5aVar2 = this.i;
            m73Var.a = this;
            m73Var.b = intValue;
            m73Var.e = 2;
        } catch (Throwable th3) {
            v73Var = this;
            i2 = intValue;
            th = th3;
            v73Var.h.L(new l19(i2, th));
            throw th;
        }
        m73Var = new m73(this, gw2Var);
        Object obj2 = m73Var.c;
        i = m73Var.e;
        bx2 bx2Var2 = bx2.a;
        if (i != 0) {
        }
        intValue = ((Number) obj2).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(boolean z, fw2 fw2Var) {
        n73 n73Var;
        int i;
        bx2 bx2Var;
        v73 v73Var;
        fwa fwaVar;
        boolean z2;
        v73 v73Var2;
        ku7 ku7Var;
        if (fw2Var instanceof n73) {
            n73Var = (n73) fw2Var;
            int i2 = n73Var.f;
            if ((i2 & TLObject.FLAG_31) != 0) {
                n73Var.f = i2 - TLObject.FLAG_31;
                Object obj = n73Var.d;
                i = n73Var.f;
                fw2 fw2Var2 = null;
                bx2Var = bx2.a;
                if (i != 0) {
                    qse.b(obj);
                    fwa G = this.h.G();
                    if (G instanceof o4c) {
                        sc8.j("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    kp5 c = c();
                    n73Var.a = this;
                    n73Var.b = G;
                    n73Var.c = z;
                    n73Var.f = 1;
                    Object b = c.b(n73Var);
                    if (b != bx2Var) {
                        v73Var = this;
                        fwaVar = G;
                        obj = b;
                    }
                    return bx2Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        v73Var2 = n73Var.a;
                        qse.b(obj);
                        ku7Var = (ku7) obj;
                        fwa fwaVar2 = (fwa) ku7Var.a;
                        if (((Boolean) ku7Var.b).booleanValue()) {
                        }
                        return fwaVar2;
                    }
                    if (i != 3) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v73Var2 = n73Var.a;
                    qse.b(obj);
                    ku7Var = (ku7) obj;
                    fwa fwaVar22 = (fwa) ku7Var.a;
                    if (((Boolean) ku7Var.b).booleanValue()) {
                        v73Var2.h.L(fwaVar22);
                    }
                    return fwaVar22;
                }
                z = n73Var.c;
                fwaVar = n73Var.b;
                v73Var = n73Var.a;
                qse.b(obj);
                int intValue = ((Number) obj).intValue();
                z2 = fwaVar instanceof s53;
                int i3 = !z2 ? fwaVar.a : -1;
                if (!z2 && intValue == i3) {
                    return fwaVar;
                }
                if (z) {
                    kp5 c2 = v73Var.c();
                    p73 p73Var = new p73(v73Var, i3, fw2Var2, (byte) 0);
                    n73Var.a = v73Var;
                    n73Var.b = null;
                    n73Var.f = 3;
                    obj = c2.e(p73Var, n73Var);
                    if (obj != bx2Var) {
                        v73Var2 = v73Var;
                        ku7Var = (ku7) obj;
                        fwa fwaVar222 = (fwa) ku7Var.a;
                        if (((Boolean) ku7Var.b).booleanValue()) {
                        }
                        return fwaVar222;
                    }
                } else {
                    kp5 c3 = v73Var.c();
                    o73 o73Var = new o73(v73Var, null);
                    n73Var.a = v73Var;
                    n73Var.b = null;
                    n73Var.f = 2;
                    obj = c3.c(o73Var, n73Var);
                    if (obj != bx2Var) {
                        v73Var2 = v73Var;
                        ku7Var = (ku7) obj;
                        fwa fwaVar2222 = (fwa) ku7Var.a;
                        if (((Boolean) ku7Var.b).booleanValue()) {
                        }
                        return fwaVar2222;
                    }
                }
                return bx2Var;
            }
        }
        n73Var = new n73(this, fw2Var);
        Object obj2 = n73Var.d;
        i = n73Var.f;
        fw2 fw2Var22 = null;
        bx2Var = bx2.a;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z2 = fwaVar instanceof s53;
        if (!z2) {
        }
        if (!z2) {
        }
        if (z) {
        }
        return bx2Var;
    }

    @Override // v63
    public final hk4 getData() {
        return this.d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|70|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fb, code lost:
    
        if (r12 != r5) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x009e, code lost:
    
        if (r12 != r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00df, code lost:
    
        if (r12 != r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0100, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013e A[Catch: all -> 0x016a, TryCatch #2 {all -> 0x016a, blocks: (B:27:0x012c, B:29:0x013e, B:33:0x0146), top: B:26:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0146 A[Catch: all -> 0x016a, TRY_LEAVE, TryCatch #2 {all -> 0x016a, blocks: (B:27:0x012c, B:29:0x013e, B:33:0x0146), top: B:26:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(boolean z, gw2 gw2Var) {
        q73 q73Var;
        int i;
        c59 c59Var;
        fx2 fx2Var;
        v73 v73Var;
        boolean z2;
        c59 c59Var2;
        fx2 fx2Var2;
        Object c;
        a59 a59Var;
        c59 c59Var3;
        v73 v73Var2;
        int i2;
        Object obj;
        if (gw2Var instanceof q73) {
            q73Var = (q73) gw2Var;
            int i3 = q73Var.r;
            if ((i3 & TLObject.FLAG_31) != 0) {
                q73Var.r = i3 - TLObject.FLAG_31;
                Object obj2 = q73Var.h;
                i = q73Var.r;
                byte b = 1;
                fw2 fw2Var = null;
                bx2 bx2Var = bx2.a;
                switch (i) {
                    case 0:
                        qse.b(obj2);
                        int i4 = 3;
                        if (!z) {
                            kp5 c2 = c();
                            q73Var.a = this;
                            q73Var.e = z;
                            q73Var.r = 3;
                            obj2 = c2.b(q73Var);
                            break;
                        } else {
                            q73Var.a = this;
                            q73Var.e = z;
                            q73Var.r = 1;
                            obj2 = ((hb4) this.j.getValue()).a(new e73(i4, fw2Var), q73Var);
                            break;
                        }
                        return bx2Var;
                    case 1:
                        z = q73Var.e;
                        this = (v73) q73Var.a;
                        qse.b(obj2);
                        int hashCode = obj2 != null ? obj2.hashCode() : 0;
                        kp5 c3 = this.c();
                        q73Var.a = this;
                        q73Var.b = obj2;
                        q73Var.e = z;
                        q73Var.f = hashCode;
                        q73Var.r = 2;
                        Object b2 = c3.b(q73Var);
                        if (b2 != bx2Var) {
                            v73Var2 = this;
                            i2 = hashCode;
                            obj = obj2;
                            obj2 = b2;
                            return new s53(i2, ((Number) obj2).intValue(), obj);
                        }
                        return bx2Var;
                    case 2:
                        i2 = q73Var.f;
                        z = q73Var.e;
                        obj = q73Var.b;
                        v73Var2 = (v73) q73Var.a;
                        try {
                            qse.b(obj2);
                            return new s53(i2, ((Number) obj2).intValue(), obj);
                        } catch (fx2 e) {
                            e = e;
                            this = v73Var2;
                            c59Var = new c59();
                            ln8 ln8Var = this.b;
                            q73Var.a = this;
                            q73Var.b = e;
                            q73Var.c = c59Var;
                            q73Var.d = c59Var;
                            q73Var.e = z;
                            q73Var.r = 5;
                            Object invoke = ((qp4) ln8Var.b).invoke(e);
                            if (invoke != bx2Var) {
                                fx2Var = e;
                                obj2 = invoke;
                                v73Var = this;
                                z2 = z;
                                c59Var2 = c59Var;
                                c59Var2.a = obj2;
                                a59 a59Var2 = new a59();
                                try {
                                    r73 r73Var = new r73(c59Var, v73Var, a59Var2, (fw2) null);
                                    q73Var.a = fx2Var;
                                    q73Var.b = c59Var;
                                    q73Var.c = a59Var2;
                                    q73Var.d = null;
                                    q73Var.r = 6;
                                    if (z2) {
                                    }
                                    if (c != bx2Var) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    fx2Var2 = fx2Var;
                                    tfe.a(fx2Var2, th);
                                    throw fx2Var2;
                                }
                            }
                            return bx2Var;
                        }
                    case 3:
                        z = q73Var.e;
                        this = (v73) q73Var.a;
                        qse.b(obj2);
                        int intValue = ((Number) obj2).intValue();
                        kp5 c4 = this.c();
                        p73 p73Var = new p73(this, intValue, fw2Var, b);
                        q73Var.a = this;
                        q73Var.e = z;
                        q73Var.r = 4;
                        obj2 = c4.e(p73Var, q73Var);
                        break;
                    case 4:
                        boolean z3 = q73Var.e;
                        qse.b(obj2);
                        return (s53) obj2;
                    case 5:
                        z2 = q73Var.e;
                        c59Var2 = q73Var.d;
                        c59Var = (c59) q73Var.c;
                        fx2Var = (fx2) q73Var.b;
                        v73Var = (v73) q73Var.a;
                        qse.b(obj2);
                        c59Var2.a = obj2;
                        a59 a59Var22 = new a59();
                        r73 r73Var2 = new r73(c59Var, v73Var, a59Var22, (fw2) null);
                        q73Var.a = fx2Var;
                        q73Var.b = c59Var;
                        q73Var.c = a59Var22;
                        q73Var.d = null;
                        q73Var.r = 6;
                        if (z2) {
                            c = v73Var.c().c(new e63(r73Var2, fw2Var, b), q73Var);
                        } else {
                            v73Var.getClass();
                            c = r73Var2.invoke(q73Var);
                        }
                        if (c != bx2Var) {
                            a59Var = a59Var22;
                            c59Var3 = c59Var;
                            Object obj3 = c59Var3.a;
                            return new s53(obj3 != null ? obj3.hashCode() : 0, a59Var.a, obj3);
                        }
                        return bx2Var;
                    case 6:
                        a59Var = (a59) q73Var.c;
                        c59Var3 = (c59) q73Var.b;
                        fx2Var2 = (fx2) q73Var.a;
                        try {
                            qse.b(obj2);
                            Object obj32 = c59Var3.a;
                            return new s53(obj32 != null ? obj32.hashCode() : 0, a59Var.a, obj32);
                        } catch (Throwable th2) {
                            th = th2;
                            tfe.a(fx2Var2, th);
                            throw fx2Var2;
                        }
                    default:
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        q73Var = new q73(this, gw2Var);
        Object obj22 = q73Var.h;
        i = q73Var.r;
        byte b3 = 1;
        fw2 fw2Var2 = null;
        bx2 bx2Var2 = bx2.a;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj, boolean z, gw2 gw2Var) {
        t73 t73Var;
        int i;
        a59 a59Var;
        if (gw2Var instanceof t73) {
            t73Var = (t73) gw2Var;
            int i2 = t73Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                t73Var.d = i2 - TLObject.FLAG_31;
                Object obj2 = t73Var.b;
                i = t73Var.d;
                if (i != 0) {
                    qse.b(obj2);
                    a59 a59Var2 = new a59();
                    hb4 hb4Var = (hb4) this.j.getValue();
                    u73 u73Var = new u73(a59Var2, this, obj, z, null);
                    t73Var.a = a59Var2;
                    t73Var.d = 1;
                    Object b = hb4Var.b(u73Var, t73Var);
                    bx2 bx2Var = bx2.a;
                    if (b == bx2Var) {
                        return bx2Var;
                    }
                    a59Var = a59Var2;
                } else {
                    if (i != 1) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a59Var = t73Var.a;
                    qse.b(obj2);
                }
                return new Integer(a59Var.a);
            }
        }
        t73Var = new t73(this, gw2Var);
        Object obj22 = t73Var.b;
        i = t73Var.d;
        if (i != 0) {
        }
        return new Integer(a59Var.a);
    }
}
