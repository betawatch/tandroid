package ra;

import androidx.recyclerview.widget.RecyclerView;
import c5.b0;
import ih.h;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;
import k2.g0;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Cells.p6;
import s4.c1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class a {
    public static boolean i = true;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Serializable d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public b a() {
        String str = this.b == 0 ? " registrationStatus" : "";
        if (((Long) this.g) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.h) == null) {
            str = p6.t(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new b((String) this.c, this.b, (String) this.d, (String) this.e, ((Long) this.g).longValue(), ((Long) this.h).longValue(), (String) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean b(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            s4.a aVar = (s4.a) arrayList.get(i11);
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
            ((h) this.f).a((s4.a) arrayList.get(i10));
        }
        m(arrayList);
        this.b = 0;
    }

    public void d() {
        h hVar = (h) this.f;
        c();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            s4.a aVar = (s4.a) arrayList.get(i10);
            int i11 = aVar.a;
            if (i11 == 1) {
                hVar.a(aVar);
                hVar.c(aVar.b, aVar.d);
            } else if (i11 == 2) {
                hVar.a(aVar);
                int i12 = aVar.b;
                int i13 = aVar.d;
                RecyclerView recyclerView = hVar.a;
                recyclerView.e0(i12, i13, true);
                recyclerView.w0 = true;
                recyclerView.t0.c += i13;
            } else if (i11 == 4) {
                hVar.a(aVar);
                hVar.b(aVar.b, aVar.d, aVar.c);
            } else if (i11 == 8) {
                hVar.a(aVar);
                hVar.d(aVar.b, aVar.d);
            }
        }
        m(arrayList);
        this.b = 0;
    }

    public void e(s4.a aVar) {
        int i10;
        b0 b0Var = (b0) this.c;
        int i11 = aVar.a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int o9 = o(aVar.b, i11);
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
            int o10 = o((i10 * i15) + aVar.b, aVar.a);
            int i16 = aVar.a;
            if (i16 == 2 ? o10 != o9 : !(i16 == 4 && o10 == o9 + 1)) {
                s4.a j3 = j(i16, o9, aVar.c, i14);
                f(j3, i12);
                j3.c = null;
                b0Var.i(j3);
                if (aVar.a == 4) {
                    i12 += i14;
                }
                o9 = o10;
                i14 = 1;
            } else {
                i14++;
            }
        }
        Object obj = aVar.c;
        aVar.c = null;
        b0Var.i(aVar);
        if (i14 > 0) {
            s4.a j10 = j(aVar.a, o9, obj, i14);
            f(j10, i12);
            j10.c = null;
            b0Var.i(j10);
        }
    }

    public void f(s4.a aVar, int i10) {
        h hVar = (h) this.f;
        hVar.a(aVar);
        int i11 = aVar.a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            hVar.b(i10, aVar.d, aVar.c);
        } else {
            int i12 = aVar.d;
            RecyclerView recyclerView = hVar.a;
            recyclerView.e0(i10, i12, true);
            recyclerView.w0 = true;
            recyclerView.t0.c += i12;
        }
    }

    public int g(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        while (i11 < size) {
            s4.a aVar = (s4.a) arrayList.get(i11);
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
        ArrayList arrayList = (ArrayList) this.h;
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

    public s4.a j(int i10, int i11, Object obj, int i12) {
        s4.a aVar = (s4.a) ((b0) this.c).a();
        if (aVar != null) {
            aVar.a = i10;
            aVar.b = i11;
            aVar.d = i12;
            aVar.c = obj;
            return aVar;
        }
        s4.a aVar2 = new s4.a();
        aVar2.a = i10;
        aVar2.b = i11;
        aVar2.d = i12;
        aVar2.c = obj;
        return aVar2;
    }

    public void k(s4.a aVar) {
        h hVar = (h) this.f;
        ((ArrayList) this.e).add(aVar);
        int i10 = aVar.a;
        if (i10 == 1) {
            hVar.c(aVar.b, aVar.d);
            return;
        }
        if (i10 == 2) {
            int i11 = aVar.b;
            int i12 = aVar.d;
            RecyclerView recyclerView = hVar.a;
            recyclerView.e0(i11, i12, false);
            recyclerView.w0 = true;
            return;
        }
        if (i10 == 4) {
            hVar.b(aVar.b, aVar.d, aVar.c);
        } else if (i10 == 8) {
            hVar.d(aVar.b, aVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x021b, code lost:
    
        if (((java.util.ArrayList) r15.e.b).contains(r8.a) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x028a, code lost:
    
        if (((java.util.ArrayList) r13.e.b).contains(r15.a) != false) goto L165;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l() {
        int i10;
        int i11;
        boolean z10;
        char c10;
        s4.a j3;
        int i12;
        int i13;
        s4.a j10;
        boolean z11;
        boolean z12;
        Object obj;
        s4.a aVar;
        b0 b0Var = (b0) this.c;
        h hVar = (h) this.f;
        g0 g0Var = (g0) this.g;
        ArrayList arrayList = (ArrayList) this.d;
        g0Var.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z13 = false;
            while (true) {
                i10 = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((s4.a) arrayList.get(size)).a != 8) {
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
            int i14 = size + 1;
            a aVar2 = (a) g0Var.b;
            b0 b0Var2 = (b0) aVar2.c;
            s4.a aVar3 = (s4.a) arrayList.get(size);
            s4.a aVar4 = (s4.a) arrayList.get(i14);
            int i15 = aVar4.a;
            if (i15 == 1) {
                int i16 = aVar3.d;
                int i17 = aVar4.b;
                int i18 = i16 < i17 ? -1 : 0;
                int i19 = aVar3.b;
                if (i19 < i17) {
                    i18++;
                }
                if (i17 <= i19) {
                    aVar3.b = i19 + aVar4.d;
                }
                int i20 = aVar4.b;
                if (i20 <= i16) {
                    aVar3.d = i16 + aVar4.d;
                }
                aVar4.b = i20 + i18;
                arrayList.set(size, aVar4);
                arrayList.set(i14, aVar3);
            } else if (i15 == 2) {
                int i21 = aVar3.b;
                int i22 = aVar3.d;
                if (i21 < i22) {
                    if (aVar4.b == i21 && aVar4.d == i22 - i21) {
                        z11 = false;
                        z12 = true;
                    } else {
                        z11 = false;
                        z12 = false;
                    }
                } else if (aVar4.b == i22 + 1 && aVar4.d == i21 - i22) {
                    z11 = true;
                    z12 = true;
                } else {
                    z11 = true;
                    z12 = false;
                }
                int i23 = aVar4.b;
                if (i22 < i23) {
                    aVar4.b = i23 - 1;
                } else {
                    int i24 = aVar4.d;
                    if (i22 < i23 + i24) {
                        aVar4.d = i24 - 1;
                        aVar3.a = 2;
                        aVar3.d = 1;
                        if (aVar4.d == 0) {
                            arrayList.remove(i14);
                            aVar4.c = null;
                            b0Var2.i(aVar4);
                        }
                    }
                }
                int i25 = aVar3.b;
                int i26 = aVar4.b;
                if (i25 <= i26) {
                    aVar4.b = i26 + 1;
                } else {
                    int i27 = i26 + aVar4.d;
                    if (i25 < i27) {
                        obj = null;
                        s4.a j11 = aVar2.j(2, i25 + 1, null, i27 - i25);
                        aVar4.d = aVar3.b - aVar4.b;
                        aVar = j11;
                        if (z12) {
                            if (z11) {
                                if (aVar != null) {
                                    int i28 = aVar3.b;
                                    if (i28 > aVar.b) {
                                        aVar3.b = i28 - aVar.d;
                                    }
                                    int i29 = aVar3.d;
                                    if (i29 > aVar.b) {
                                        aVar3.d = i29 - aVar.d;
                                    }
                                }
                                int i30 = aVar3.b;
                                if (i30 > aVar4.b) {
                                    aVar3.b = i30 - aVar4.d;
                                }
                                int i31 = aVar3.d;
                                if (i31 > aVar4.b) {
                                    aVar3.d = i31 - aVar4.d;
                                }
                            } else {
                                if (aVar != null) {
                                    int i32 = aVar3.b;
                                    if (i32 >= aVar.b) {
                                        aVar3.b = i32 - aVar.d;
                                    }
                                    int i33 = aVar3.d;
                                    if (i33 >= aVar.b) {
                                        aVar3.d = i33 - aVar.d;
                                    }
                                }
                                int i34 = aVar3.b;
                                if (i34 >= aVar4.b) {
                                    aVar3.b = i34 - aVar4.d;
                                }
                                int i35 = aVar3.d;
                                if (i35 >= aVar4.b) {
                                    aVar3.d = i35 - aVar4.d;
                                }
                            }
                            arrayList.set(size, aVar4);
                            if (aVar3.b != aVar3.d) {
                                arrayList.set(i14, aVar3);
                            } else {
                                arrayList.remove(i14);
                            }
                            if (aVar != null) {
                                arrayList.add(size, aVar);
                            }
                        } else {
                            arrayList.set(size, aVar4);
                            arrayList.remove(i14);
                            aVar3.c = obj;
                            b0Var2.i(aVar3);
                        }
                    }
                }
                obj = null;
                aVar = null;
                if (z12) {
                }
            } else if (i15 == 4) {
                int i36 = aVar3.d;
                int i37 = aVar4.b;
                if (i36 < i37) {
                    aVar4.b = i37 - 1;
                } else {
                    int i38 = aVar4.d;
                    if (i36 < i37 + i38) {
                        aVar4.d = i38 - 1;
                        j3 = aVar2.j(4, aVar3.b, aVar4.c, 1);
                        i12 = aVar3.b;
                        i13 = aVar4.b;
                        if (i12 > i13) {
                            aVar4.b = i13 + 1;
                        } else {
                            int i39 = i13 + aVar4.d;
                            if (i12 < i39) {
                                int i40 = i39 - i12;
                                j10 = aVar2.j(4, i12 + 1, aVar4.c, i40);
                                aVar4.d -= i40;
                                arrayList.set(i14, aVar3);
                                if (aVar4.d > 0) {
                                    arrayList.set(size, aVar4);
                                } else {
                                    arrayList.remove(size);
                                    aVar4.c = null;
                                    b0Var2.i(aVar4);
                                }
                                if (j3 != null) {
                                    arrayList.add(size, j3);
                                }
                                if (j10 != null) {
                                    arrayList.add(size, j10);
                                }
                            }
                        }
                        j10 = null;
                        arrayList.set(i14, aVar3);
                        if (aVar4.d > 0) {
                        }
                        if (j3 != null) {
                        }
                        if (j10 != null) {
                        }
                    }
                }
                j3 = null;
                i12 = aVar3.b;
                i13 = aVar4.b;
                if (i12 > i13) {
                }
                j10 = null;
                arrayList.set(i14, aVar3);
                if (aVar4.d > 0) {
                }
                if (j3 != null) {
                }
                if (j10 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        int i41 = 0;
        while (i41 < size2) {
            s4.a aVar5 = (s4.a) arrayList.get(i41);
            int i42 = aVar5.a;
            if (i42 == 1) {
                k(aVar5);
            } else if (i42 == i11) {
                int i43 = aVar5.b;
                int i44 = aVar5.d + i43;
                int i45 = i43;
                int i46 = 0;
                char c11 = 65535;
                while (i45 < i44) {
                    RecyclerView recyclerView = hVar.a;
                    c1 L = recyclerView.L(i45, true);
                    if (L != null) {
                    }
                    L = null;
                    if (L != null || b(i45)) {
                        if (c11 == 0) {
                            e(j(2, i43, null, i46));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        c10 = 1;
                    } else {
                        if (c11 == 1) {
                            k(j(2, i43, null, i46));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        c10 = 0;
                    }
                    if (z10) {
                        i45 -= i46;
                        i44 -= i46;
                        i46 = 1;
                    } else {
                        i46++;
                    }
                    i45++;
                    c11 = c10;
                }
                if (i46 != aVar5.d) {
                    aVar5.c = null;
                    b0Var.i(aVar5);
                    aVar5 = j(2, i43, null, i46);
                }
                if (c11 == 0) {
                    e(aVar5);
                } else {
                    k(aVar5);
                }
            } else if (i42 == 4) {
                int i47 = aVar5.b;
                int i48 = aVar5.d + i47;
                int i49 = i47;
                int i50 = 0;
                char c12 = 65535;
                while (i47 < i48) {
                    RecyclerView recyclerView2 = hVar.a;
                    c1 L2 = recyclerView2.L(i47, true);
                    if (L2 != null) {
                    }
                    L2 = null;
                    if (L2 != null || b(i47)) {
                        if (c12 == 0) {
                            e(j(4, i49, aVar5.c, i50));
                            i49 = i47;
                            i50 = 0;
                        }
                        c12 = 1;
                    } else {
                        if (c12 == 1) {
                            k(j(4, i49, aVar5.c, i50));
                            i49 = i47;
                            i50 = 0;
                        }
                        c12 = 0;
                    }
                    i50++;
                    i47++;
                }
                if (i50 != aVar5.d) {
                    Object obj2 = aVar5.c;
                    aVar5.c = null;
                    b0Var.i(aVar5);
                    aVar5 = j(4, i49, obj2, i50);
                }
                if (c12 == 0) {
                    e(aVar5);
                } else {
                    k(aVar5);
                }
            } else if (i42 == i10) {
                k(aVar5);
            }
            i41++;
            i11 = 2;
            i10 = 8;
        }
        arrayList.clear();
    }

    public void m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            s4.a aVar = (s4.a) arrayList.get(i10);
            aVar.c = null;
            ((b0) this.c).i(aVar);
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
        re.b bVar = re.b.e;
        if (i) {
            g0 g0Var = (g0) this.f;
            if (g0Var == null) {
                try {
                    g0 g0Var2 = new g0(19);
                    g0Var2.b = new SoftReference(new String[3]);
                    this.f = g0Var2;
                } catch (Throwable unused) {
                    i = false;
                }
            } else {
                String[] strArr = (String[]) ((SoftReference) g0Var.b).get();
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
                            stringBuffer.append(re.b.a(cls.getName(), cls, bVar.a));
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
                        stringBuffer.append(re.b.a((String) this.d, cls2, bVar.d));
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
                                stringBuffer.append(re.b.a(cls3.getName(), cls3, bVar.a));
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
                        g0 g0Var3 = (g0) this.f;
                        String[] strArr2 = (String[]) ((SoftReference) g0Var3.b).get();
                        if (strArr2 == null) {
                            strArr2 = new String[3];
                            g0Var3.b = new SoftReference(strArr2);
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
        b0 b0Var = (b0) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s4.a aVar = (s4.a) arrayList.get(size);
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
            s4.a aVar2 = (s4.a) arrayList.get(size2);
            if (aVar2.a == 8) {
                int i18 = aVar2.d;
                if (i18 == aVar2.b || i18 < 0) {
                    arrayList.remove(size2);
                    aVar2.c = null;
                    b0Var.i(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.c = null;
                b0Var.i(aVar2);
            }
        }
        return i10;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                re.b bVar = re.b.e;
                return n();
            default:
                return super.toString();
        }
    }

    public a(h hVar) {
        this.a = 2;
        this.c = new b0(30, 6);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = 0;
        this.h = BuildVars.DEBUG_VERSION ? new ArrayList() : null;
        this.f = hVar;
        this.g = new g0(this, 20);
    }
}
