package s4;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.BuildVars;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class b {
    public static boolean i = true;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Serializable d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public sa.a a() {
        String str = this.b == 0 ? " registrationStatus" : "";
        if (((Long) this.f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.g) == null) {
            str = r4.c.u(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new sa.a((String) this.c, this.b, (String) this.d, (String) this.e, ((Long) this.f).longValue(), ((Long) this.g).longValue(), (String) this.h);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean b(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.a;
            if (i12 != 8) {
                if (i12 == 1) {
                    int i13 = aVar.b;
                    int i14 = aVar.d + i13;
                    while (i13 < i14) {
                        if (g(i13, i11 + 1) == i10) {
                            return true;
                        }
                        i13++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(aVar.d, i11 + 1) == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((k0.b) this.g).n((a) arrayList.get(i10));
        }
        m(arrayList);
        this.b = 0;
    }

    public void d() {
        k0.b bVar = (k0.b) this.g;
        c();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.a;
            if (i11 == 1) {
                bVar.n(aVar);
                bVar.O(aVar.b, aVar.d);
            } else if (i11 == 2) {
                bVar.n(aVar);
                int i12 = aVar.b;
                int i13 = aVar.d;
                RecyclerView recyclerView = (RecyclerView) bVar.b;
                recyclerView.e0(i12, i13, true);
                recyclerView.x0 = true;
                recyclerView.u0.c += i13;
            } else if (i11 == 4) {
                bVar.n(aVar);
                bVar.J(aVar.b, aVar.d, aVar.c);
            } else if (i11 == 8) {
                bVar.n(aVar);
                bVar.Y(aVar.b, aVar.d);
            }
        }
        m(arrayList);
        this.b = 0;
    }

    public void e(a aVar) {
        int i10;
        c5.b0 b0Var = (c5.b0) this.c;
        int i11 = aVar.a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int o10 = o(aVar.b, i11);
        int i12 = aVar.b;
        int i13 = aVar.a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < aVar.d; i15++) {
            int o11 = o((i10 * i15) + aVar.b, aVar.a);
            int i16 = aVar.a;
            if (i16 == 2 ? o11 != o10 : !(i16 == 4 && o11 == o10 + 1)) {
                a j10 = j(i16, o10, aVar.c, i14);
                f(j10, i12);
                j10.c = null;
                b0Var.w(j10);
                if (aVar.a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                o10 = o11;
            } else {
                i14++;
            }
        }
        Object obj = aVar.c;
        aVar.c = null;
        b0Var.w(aVar);
        if (i14 > 0) {
            a j11 = j(aVar.a, o10, obj, i14);
            f(j11, i12);
            j11.c = null;
            b0Var.w(j11);
        }
    }

    public void f(a aVar, int i10) {
        k0.b bVar = (k0.b) this.g;
        bVar.n(aVar);
        int i11 = aVar.a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            bVar.J(i10, aVar.d, aVar.c);
        } else {
            int i12 = aVar.d;
            RecyclerView recyclerView = (RecyclerView) bVar.b;
            recyclerView.e0(i10, i12, true);
            recyclerView.x0 = true;
            recyclerView.u0.c += i12;
        }
    }

    public int g(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        while (i11 < size) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.a;
            if (i12 == 8) {
                int i13 = aVar.b;
                if (i13 == i10) {
                    i10 = aVar.d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (aVar.d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = aVar.b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = aVar.d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += aVar.d;
                }
            }
            i11++;
        }
        return i10;
    }

    public boolean h() {
        return ((ArrayList) this.d).size() > 0;
    }

    public void i(String str) {
        int i10;
        ArrayList arrayList = (ArrayList) this.f;
        if (arrayList == null) {
            return;
        }
        while (true) {
            if (arrayList.size() <= 5) {
                break;
            } else {
                arrayList.remove(0);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new Date().toString());
        sb2.append("  ");
        sb2.append(str);
        sb2.append("\n");
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        int i11 = 0;
        for (i10 = 0; i10 < stackTrace.length && i11 < 5; i10++) {
            String stackTraceElement = stackTrace[i10].toString();
            if (!stackTraceElement.startsWith("androidx.recyclerview.widget.") || i11 != 0) {
                sb2.append("\n");
                sb2.append(stackTraceElement);
                sb2.append("\n");
                i11++;
            }
        }
        arrayList.add(sb2.toString());
    }

    public a j(int i10, int i11, Object obj, int i12) {
        a aVar = (a) ((c5.b0) this.c).b();
        if (aVar != null) {
            aVar.a = i10;
            aVar.b = i11;
            aVar.d = i12;
            aVar.c = obj;
            return aVar;
        }
        a aVar2 = new a();
        aVar2.a = i10;
        aVar2.b = i11;
        aVar2.d = i12;
        aVar2.c = obj;
        return aVar2;
    }

    public void k(a aVar) {
        k0.b bVar = (k0.b) this.g;
        ((ArrayList) this.e).add(aVar);
        int i10 = aVar.a;
        if (i10 == 1) {
            bVar.O(aVar.b, aVar.d);
            return;
        }
        if (i10 == 2) {
            int i11 = aVar.b;
            int i12 = aVar.d;
            RecyclerView recyclerView = (RecyclerView) bVar.b;
            recyclerView.e0(i11, i12, false);
            recyclerView.x0 = true;
            return;
        }
        if (i10 == 4) {
            bVar.J(aVar.b, aVar.d, aVar.c);
        } else if (i10 == 8) {
            bVar.Y(aVar.b, aVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x021f, code lost:
    
        if (((java.util.ArrayList) r15.e.d).contains(r8.a) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0292, code lost:
    
        if (((java.util.ArrayList) r13.e.d).contains(r15.a) != false) goto L166;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l() {
        int i10;
        int i11;
        int i12;
        boolean z10;
        char c10;
        a j10;
        int i13;
        int i14;
        a j11;
        boolean z11;
        boolean z12;
        int i15;
        int i16;
        int i17;
        Object obj;
        a aVar;
        c5.b0 b0Var = (c5.b0) this.c;
        k0.b bVar = (k0.b) this.g;
        l2.f fVar = (l2.f) this.h;
        ArrayList arrayList = (ArrayList) this.d;
        fVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z13 = false;
            while (true) {
                i10 = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((a) arrayList.get(size)).a != 8) {
                    z13 = true;
                } else if (z13) {
                    break;
                }
                size--;
            }
            i11 = 2;
            if (size == -1) {
                break;
            }
            int i18 = size + 1;
            b bVar2 = (b) fVar.b;
            c5.b0 b0Var2 = (c5.b0) bVar2.c;
            a aVar2 = (a) arrayList.get(size);
            a aVar3 = (a) arrayList.get(i18);
            int i19 = aVar3.a;
            if (i19 == 1) {
                int i20 = aVar2.d;
                int i21 = aVar3.b;
                int i22 = i20 < i21 ? -1 : 0;
                int i23 = aVar2.b;
                if (i23 < i21) {
                    i22++;
                }
                if (i21 <= i23) {
                    aVar2.b = i23 + aVar3.d;
                }
                int i24 = aVar3.b;
                if (i24 <= i20) {
                    aVar2.d = i20 + aVar3.d;
                }
                aVar3.b = i24 + i22;
                arrayList.set(size, aVar3);
                arrayList.set(i18, aVar2);
            } else if (i19 == 2) {
                int i25 = aVar2.b;
                int i26 = aVar2.d;
                if (i25 < i26) {
                    if (aVar3.b == i25 && aVar3.d == i26 - i25) {
                        z12 = true;
                        z11 = false;
                        i15 = aVar3.b;
                        if (i26 >= i15) {
                        }
                        i16 = aVar2.b;
                        i17 = aVar3.b;
                        if (i16 > i17) {
                        }
                        obj = null;
                        aVar = null;
                        if (z12) {
                        }
                    } else {
                        z11 = false;
                        z12 = false;
                        i15 = aVar3.b;
                        if (i26 >= i15) {
                            aVar3.b = i15 - 1;
                        } else {
                            int i27 = aVar3.d;
                            if (i26 < i15 + i27) {
                                aVar3.d = i27 - 1;
                                aVar2.a = 2;
                                aVar2.d = 1;
                                if (aVar3.d == 0) {
                                    arrayList.remove(i18);
                                    aVar3.c = null;
                                    b0Var2.w(aVar3);
                                }
                            }
                        }
                        i16 = aVar2.b;
                        i17 = aVar3.b;
                        if (i16 > i17) {
                            aVar3.b = i17 + 1;
                        } else {
                            int i28 = i17 + aVar3.d;
                            if (i16 < i28) {
                                obj = null;
                                a j12 = bVar2.j(2, i16 + 1, null, i28 - i16);
                                aVar3.d = aVar2.b - aVar3.b;
                                aVar = j12;
                                if (z12) {
                                    arrayList.set(size, aVar3);
                                    arrayList.remove(i18);
                                    aVar2.c = obj;
                                    b0Var2.w(aVar2);
                                } else {
                                    if (z11) {
                                        if (aVar != null) {
                                            int i29 = aVar2.b;
                                            if (i29 > aVar.b) {
                                                aVar2.b = i29 - aVar.d;
                                            }
                                            int i30 = aVar2.d;
                                            if (i30 > aVar.b) {
                                                aVar2.d = i30 - aVar.d;
                                            }
                                        }
                                        int i31 = aVar2.b;
                                        if (i31 > aVar3.b) {
                                            aVar2.b = i31 - aVar3.d;
                                        }
                                        int i32 = aVar2.d;
                                        if (i32 > aVar3.b) {
                                            aVar2.d = i32 - aVar3.d;
                                        }
                                    } else {
                                        if (aVar != null) {
                                            int i33 = aVar2.b;
                                            if (i33 >= aVar.b) {
                                                aVar2.b = i33 - aVar.d;
                                            }
                                            int i34 = aVar2.d;
                                            if (i34 >= aVar.b) {
                                                aVar2.d = i34 - aVar.d;
                                            }
                                        }
                                        int i35 = aVar2.b;
                                        if (i35 >= aVar3.b) {
                                            aVar2.b = i35 - aVar3.d;
                                        }
                                        int i36 = aVar2.d;
                                        if (i36 >= aVar3.b) {
                                            aVar2.d = i36 - aVar3.d;
                                        }
                                    }
                                    arrayList.set(size, aVar3);
                                    if (aVar2.b != aVar2.d) {
                                        arrayList.set(i18, aVar2);
                                    } else {
                                        arrayList.remove(i18);
                                    }
                                    if (aVar != null) {
                                        arrayList.add(size, aVar);
                                    }
                                }
                            }
                        }
                        obj = null;
                        aVar = null;
                        if (z12) {
                        }
                    }
                } else if (aVar3.b == i26 + 1 && aVar3.d == i25 - i26) {
                    z11 = true;
                    z12 = true;
                    i15 = aVar3.b;
                    if (i26 >= i15) {
                    }
                    i16 = aVar2.b;
                    i17 = aVar3.b;
                    if (i16 > i17) {
                    }
                    obj = null;
                    aVar = null;
                    if (z12) {
                    }
                } else {
                    z11 = true;
                    z12 = false;
                    i15 = aVar3.b;
                    if (i26 >= i15) {
                    }
                    i16 = aVar2.b;
                    i17 = aVar3.b;
                    if (i16 > i17) {
                    }
                    obj = null;
                    aVar = null;
                    if (z12) {
                    }
                }
            } else if (i19 == 4) {
                int i37 = aVar2.d;
                int i38 = aVar3.b;
                if (i37 < i38) {
                    aVar3.b = i38 - 1;
                } else {
                    int i39 = aVar3.d;
                    if (i37 < i38 + i39) {
                        aVar3.d = i39 - 1;
                        j10 = bVar2.j(4, aVar2.b, aVar3.c, 1);
                        i13 = aVar2.b;
                        i14 = aVar3.b;
                        if (i13 > i14) {
                            aVar3.b = i14 + 1;
                        } else {
                            int i40 = i14 + aVar3.d;
                            if (i13 < i40) {
                                int i41 = i40 - i13;
                                j11 = bVar2.j(4, i13 + 1, aVar3.c, i41);
                                aVar3.d -= i41;
                                arrayList.set(i18, aVar2);
                                if (aVar3.d > 0) {
                                    arrayList.set(size, aVar3);
                                } else {
                                    arrayList.remove(size);
                                    aVar3.c = null;
                                    b0Var2.w(aVar3);
                                }
                                if (j10 != null) {
                                    arrayList.add(size, j10);
                                }
                                if (j11 != null) {
                                    arrayList.add(size, j11);
                                }
                            }
                        }
                        j11 = null;
                        arrayList.set(i18, aVar2);
                        if (aVar3.d > 0) {
                        }
                        if (j10 != null) {
                        }
                        if (j11 != null) {
                        }
                    }
                }
                j10 = null;
                i13 = aVar2.b;
                i14 = aVar3.b;
                if (i13 > i14) {
                }
                j11 = null;
                arrayList.set(i18, aVar2);
                if (aVar3.d > 0) {
                }
                if (j10 != null) {
                }
                if (j11 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        int i42 = 0;
        while (i42 < size2) {
            a aVar4 = (a) arrayList.get(i42);
            int i43 = aVar4.a;
            if (i43 == 1) {
                i12 = i11;
                k(aVar4);
            } else if (i43 == i11) {
                int i44 = aVar4.b;
                int i45 = aVar4.d + i44;
                int i46 = i44;
                int i47 = 0;
                char c11 = 65535;
                while (i46 < i45) {
                    RecyclerView recyclerView = (RecyclerView) bVar.b;
                    b1 L = recyclerView.L(i46, true);
                    if (L != null) {
                    }
                    L = null;
                    if (L != null || b(i46)) {
                        if (c11 == 0) {
                            e(j(2, i44, null, i47));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        c10 = 1;
                    } else {
                        if (c11 == 1) {
                            k(j(2, i44, null, i47));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        c10 = 0;
                    }
                    if (z10) {
                        i46 -= i47;
                        i45 -= i47;
                        i47 = 1;
                    } else {
                        i47++;
                    }
                    i46++;
                    c11 = c10;
                }
                if (i47 != aVar4.d) {
                    aVar4.c = null;
                    b0Var.w(aVar4);
                    i12 = 2;
                    aVar4 = j(2, i44, null, i47);
                } else {
                    i12 = 2;
                }
                if (c11 == 0) {
                    e(aVar4);
                } else {
                    k(aVar4);
                }
            } else if (i43 != 4) {
                if (i43 == i10) {
                    k(aVar4);
                }
                i12 = i11;
            } else {
                int i48 = aVar4.b;
                int i49 = aVar4.d + i48;
                int i50 = i48;
                int i51 = 0;
                char c12 = 65535;
                while (i48 < i49) {
                    RecyclerView recyclerView2 = (RecyclerView) bVar.b;
                    b1 L2 = recyclerView2.L(i48, true);
                    if (L2 != null) {
                    }
                    L2 = null;
                    if (L2 != null || b(i48)) {
                        if (c12 == 0) {
                            e(j(4, i50, aVar4.c, i51));
                            i50 = i48;
                            i51 = 0;
                        }
                        c12 = 1;
                    } else {
                        if (c12 == 1) {
                            k(j(4, i50, aVar4.c, i51));
                            i50 = i48;
                            i51 = 0;
                        }
                        c12 = 0;
                    }
                    i51++;
                    i48++;
                }
                if (i51 != aVar4.d) {
                    Object obj2 = aVar4.c;
                    aVar4.c = null;
                    b0Var.w(aVar4);
                    aVar4 = j(4, i50, obj2, i51);
                }
                if (c12 == 0) {
                    e(aVar4);
                } else {
                    k(aVar4);
                }
                i12 = 2;
            }
            i42++;
            i11 = i12;
            i10 = 8;
        }
        arrayList.clear();
    }

    public void m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            aVar.c = null;
            ((c5.b0) this.c).w(aVar);
        }
        arrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String n() {
        String str;
        te.b bVar = te.b.e;
        if (i) {
            k0.b bVar2 = (k0.b) this.f;
            if (bVar2 == null) {
                try {
                    k0.b bVar3 = new k0.b(29);
                    bVar3.b = new SoftReference(new String[3]);
                    this.f = bVar3;
                } catch (Throwable unused) {
                    i = false;
                }
            } else {
                String[] strArr = (String[]) ((SoftReference) bVar2.b).get();
                if (strArr != null) {
                    str = strArr[0];
                    if (str == null) {
                        StringBuffer stringBuffer = new StringBuffer();
                        int i10 = this.b;
                        if (i10 == -1) {
                            throw null;
                        }
                        String str2 = "";
                        if (bVar.c) {
                            String modifier = Modifier.toString(i10);
                            if (modifier.length() != 0) {
                                str2 = modifier.concat(" ");
                            }
                        }
                        stringBuffer.append(str2);
                        if (bVar.b) {
                            ((Class) this.h).getClass();
                            Class cls = (Class) this.h;
                            stringBuffer.append(te.b.a(cls.getName(), cls, bVar.a));
                        }
                        if (bVar.b) {
                            stringBuffer.append(" ");
                        }
                        ((Class) this.e).getClass();
                        Class cls2 = (Class) this.e;
                        if (((String) this.d) == null) {
                            cls2.getClass();
                            this.d = ((Class) this.e).getName();
                        }
                        stringBuffer.append(te.b.a((String) this.d, cls2, bVar.d));
                        stringBuffer.append(".");
                        ((String) this.c).getClass();
                        stringBuffer.append((String) this.c);
                        Class[] clsArr = (Class[]) this.g;
                        if (bVar.b) {
                            stringBuffer.append("(");
                            for (int i11 = 0; i11 < clsArr.length; i11++) {
                                if (i11 > 0) {
                                    stringBuffer.append(", ");
                                }
                                Class cls3 = clsArr[i11];
                                stringBuffer.append(te.b.a(cls3.getName(), cls3, bVar.a));
                            }
                            stringBuffer.append(")");
                        } else if (clsArr.length == 0) {
                            stringBuffer.append("()");
                        } else {
                            stringBuffer.append("(..)");
                        }
                        str = stringBuffer.toString();
                    }
                    if (i) {
                        k0.b bVar4 = (k0.b) this.f;
                        String[] strArr2 = (String[]) ((SoftReference) bVar4.b).get();
                        if (strArr2 == null) {
                            strArr2 = new String[3];
                            bVar4.b = new SoftReference(strArr2);
                        }
                        strArr2[0] = str;
                    }
                    return str;
                }
            }
        }
        str = null;
        if (str == null) {
        }
        if (i) {
        }
        return str;
    }

    public int o(int i10, int i11) {
        int i12;
        int i13;
        c5.b0 b0Var = (c5.b0) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i14 = aVar.a;
            if (i14 == 8) {
                int i15 = aVar.b;
                int i16 = aVar.d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            aVar.b = i15 + 1;
                            aVar.d = i16 + 1;
                        } else if (i11 == 2) {
                            aVar.b = i15 - 1;
                            aVar.d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        aVar.d = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        aVar.b = i15 + 1;
                    } else if (i11 == 2) {
                        aVar.b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = aVar.b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.d;
                    } else if (i14 == 2) {
                        i10 += aVar.d;
                    }
                } else if (i11 == 1) {
                    aVar.b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            if (aVar2.a == 8) {
                int i18 = aVar2.d;
                if (i18 == aVar2.b || i18 < 0) {
                    arrayList.remove(size2);
                    aVar2.c = null;
                    b0Var.w(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.c = null;
                b0Var.w(aVar2);
            }
        }
        return i10;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                te.b bVar = te.b.e;
                return n();
            default:
                return super.toString();
        }
    }

    public b(k0.b bVar) {
        this.a = 0;
        this.c = new c5.b0(30, 9);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = 0;
        this.f = BuildVars.DEBUG_VERSION ? new ArrayList() : null;
        this.g = bVar;
        this.h = new l2.f(this, 17);
    }
}
