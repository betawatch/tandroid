package ug;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.r2;
import org.telegram.ui.Components.rt;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class k0 {
    public static boolean i = true;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Serializable d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public /* synthetic */ k0(int i7) {
        this.a = i7;
    }

    public boolean a(int i7) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            v4.a aVar = (v4.a) arrayList.get(i10);
            int i11 = aVar.a;
            if (i11 != 8) {
                if (i11 == 1) {
                    int i12 = aVar.b;
                    int i13 = aVar.d + i12;
                    while (i12 < i13) {
                        if (f(i12, i10 + 1) == i7) {
                            return true;
                        }
                        i12++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(aVar.d, i10 + 1) == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((rt) this.f).g0((v4.a) arrayList.get(i7));
        }
        l(arrayList);
        this.b = 0;
    }

    public void c() {
        rt rtVar = (rt) this.f;
        b();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            v4.a aVar = (v4.a) arrayList.get(i7);
            int i10 = aVar.a;
            if (i10 == 1) {
                rtVar.g0(aVar);
                rtVar.k0(aVar.b, aVar.d);
            } else if (i10 == 2) {
                rtVar.g0(aVar);
                int i11 = aVar.b;
                int i12 = aVar.d;
                RecyclerView recyclerView = (RecyclerView) rtVar.b;
                recyclerView.f0(i11, i12, true);
                recyclerView.x0 = true;
                recyclerView.u0.c += i12;
            } else if (i10 == 4) {
                rtVar.g0(aVar);
                rtVar.i0(aVar.b, aVar.d, aVar.c);
            } else if (i10 == 8) {
                rtVar.g0(aVar);
                rtVar.l0(aVar.b, aVar.d);
            }
        }
        l(arrayList);
        this.b = 0;
    }

    public void d(v4.a aVar) {
        int i7;
        f5.u uVar = (f5.u) this.c;
        int i10 = aVar.a;
        if (i10 == 1 || i10 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int n10 = n(aVar.b, i10);
        int i11 = aVar.b;
        int i12 = aVar.a;
        if (i12 == 2) {
            i7 = 0;
        } else {
            if (i12 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i7 = 1;
        }
        int i13 = 1;
        for (int i14 = 1; i14 < aVar.d; i14++) {
            int n11 = n((i7 * i14) + aVar.b, aVar.a);
            int i15 = aVar.a;
            if (i15 == 2 ? n11 != n10 : !(i15 == 4 && n11 == n10 + 1)) {
                v4.a i16 = i(i15, n10, aVar.c, i13);
                e(i16, i11);
                i16.c = null;
                uVar.v(i16);
                if (aVar.a == 4) {
                    i11 += i13;
                }
                i13 = 1;
                n10 = n11;
            } else {
                i13++;
            }
        }
        Object obj = aVar.c;
        aVar.c = null;
        uVar.v(aVar);
        if (i13 > 0) {
            v4.a i17 = i(aVar.a, n10, obj, i13);
            e(i17, i11);
            i17.c = null;
            uVar.v(i17);
        }
    }

    public void e(v4.a aVar, int i7) {
        rt rtVar = (rt) this.f;
        rtVar.g0(aVar);
        int i10 = aVar.a;
        if (i10 != 2) {
            if (i10 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            rtVar.i0(i7, aVar.d, aVar.c);
        } else {
            int i11 = aVar.d;
            RecyclerView recyclerView = (RecyclerView) rtVar.b;
            recyclerView.f0(i7, i11, true);
            recyclerView.x0 = true;
            recyclerView.u0.c += i11;
        }
    }

    public int f(int i7, int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        while (i10 < size) {
            v4.a aVar = (v4.a) arrayList.get(i10);
            int i11 = aVar.a;
            if (i11 == 8) {
                int i12 = aVar.b;
                if (i12 == i7) {
                    i7 = aVar.d;
                } else {
                    if (i12 < i7) {
                        i7--;
                    }
                    if (aVar.d <= i7) {
                        i7++;
                    }
                }
            } else {
                int i13 = aVar.b;
                if (i13 > i7) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = aVar.d;
                    if (i7 < i13 + i14) {
                        return -1;
                    }
                    i7 -= i14;
                } else if (i11 == 1) {
                    i7 += aVar.d;
                }
            }
            i10++;
        }
        return i7;
    }

    public boolean g() {
        return ((ArrayList) this.d).size() > 0;
    }

    public void h(String str) {
        int i7;
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
        int i10 = 0;
        for (i7 = 0; i7 < stackTrace.length && i10 < 5; i7++) {
            String stackTraceElement = stackTrace[i7].toString();
            if (!stackTraceElement.startsWith("androidx.recyclerview.widget.") || i10 != 0) {
                sb2.append("\n");
                sb2.append(stackTraceElement);
                sb2.append("\n");
                i10++;
            }
        }
        arrayList.add(sb2.toString());
    }

    public v4.a i(int i7, int i10, Object obj, int i11) {
        v4.a aVar = (v4.a) ((f5.u) this.c).a();
        if (aVar != null) {
            aVar.a = i7;
            aVar.b = i10;
            aVar.d = i11;
            aVar.c = obj;
            return aVar;
        }
        v4.a aVar2 = new v4.a();
        aVar2.a = i7;
        aVar2.b = i10;
        aVar2.d = i11;
        aVar2.c = obj;
        return aVar2;
    }

    public void j(v4.a aVar) {
        rt rtVar = (rt) this.f;
        ((ArrayList) this.e).add(aVar);
        int i7 = aVar.a;
        if (i7 == 1) {
            rtVar.k0(aVar.b, aVar.d);
            return;
        }
        if (i7 == 2) {
            int i10 = aVar.b;
            int i11 = aVar.d;
            RecyclerView recyclerView = (RecyclerView) rtVar.b;
            recyclerView.f0(i10, i11, false);
            recyclerView.x0 = true;
            return;
        }
        if (i7 == 4) {
            rtVar.i0(aVar.b, aVar.d, aVar.c);
        } else if (i7 == 8) {
            rtVar.l0(aVar.b, aVar.d);
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
    public void k() {
        int i7;
        int i10;
        int i11;
        boolean z9;
        char c10;
        v4.a i12;
        int i13;
        int i14;
        v4.a i15;
        boolean z10;
        boolean z11;
        int i16;
        int i17;
        int i18;
        Object obj;
        v4.a aVar;
        f5.u uVar = (f5.u) this.c;
        rt rtVar = (rt) this.f;
        rt rtVar2 = (rt) this.g;
        ArrayList arrayList = (ArrayList) this.d;
        rtVar2.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z12 = false;
            while (true) {
                i7 = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((v4.a) arrayList.get(size)).a != 8) {
                    z12 = true;
                } else if (z12) {
                    break;
                }
                size--;
            }
            i10 = 2;
            if (size == -1) {
                break;
            }
            int i19 = size + 1;
            k0 k0Var = (k0) rtVar2.b;
            f5.u uVar2 = (f5.u) k0Var.c;
            v4.a aVar2 = (v4.a) arrayList.get(size);
            v4.a aVar3 = (v4.a) arrayList.get(i19);
            int i20 = aVar3.a;
            if (i20 == 1) {
                int i21 = aVar2.d;
                int i22 = aVar3.b;
                int i23 = i21 < i22 ? -1 : 0;
                int i24 = aVar2.b;
                if (i24 < i22) {
                    i23++;
                }
                if (i22 <= i24) {
                    aVar2.b = i24 + aVar3.d;
                }
                int i25 = aVar3.b;
                if (i25 <= i21) {
                    aVar2.d = i21 + aVar3.d;
                }
                aVar3.b = i25 + i23;
                arrayList.set(size, aVar3);
                arrayList.set(i19, aVar2);
            } else if (i20 == 2) {
                int i26 = aVar2.b;
                int i27 = aVar2.d;
                if (i26 < i27) {
                    if (aVar3.b == i26 && aVar3.d == i27 - i26) {
                        z11 = true;
                        z10 = false;
                        i16 = aVar3.b;
                        if (i27 >= i16) {
                        }
                        i17 = aVar2.b;
                        i18 = aVar3.b;
                        if (i17 > i18) {
                        }
                        obj = null;
                        aVar = null;
                        if (z11) {
                        }
                    } else {
                        z10 = false;
                        z11 = false;
                        i16 = aVar3.b;
                        if (i27 >= i16) {
                            aVar3.b = i16 - 1;
                        } else {
                            int i28 = aVar3.d;
                            if (i27 < i16 + i28) {
                                aVar3.d = i28 - 1;
                                aVar2.a = 2;
                                aVar2.d = 1;
                                if (aVar3.d == 0) {
                                    arrayList.remove(i19);
                                    aVar3.c = null;
                                    uVar2.v(aVar3);
                                }
                            }
                        }
                        i17 = aVar2.b;
                        i18 = aVar3.b;
                        if (i17 > i18) {
                            aVar3.b = i18 + 1;
                        } else {
                            int i29 = i18 + aVar3.d;
                            if (i17 < i29) {
                                obj = null;
                                v4.a i30 = k0Var.i(2, i17 + 1, null, i29 - i17);
                                aVar3.d = aVar2.b - aVar3.b;
                                aVar = i30;
                                if (z11) {
                                    arrayList.set(size, aVar3);
                                    arrayList.remove(i19);
                                    aVar2.c = obj;
                                    uVar2.v(aVar2);
                                } else {
                                    if (z10) {
                                        if (aVar != null) {
                                            int i31 = aVar2.b;
                                            if (i31 > aVar.b) {
                                                aVar2.b = i31 - aVar.d;
                                            }
                                            int i32 = aVar2.d;
                                            if (i32 > aVar.b) {
                                                aVar2.d = i32 - aVar.d;
                                            }
                                        }
                                        int i33 = aVar2.b;
                                        if (i33 > aVar3.b) {
                                            aVar2.b = i33 - aVar3.d;
                                        }
                                        int i34 = aVar2.d;
                                        if (i34 > aVar3.b) {
                                            aVar2.d = i34 - aVar3.d;
                                        }
                                    } else {
                                        if (aVar != null) {
                                            int i35 = aVar2.b;
                                            if (i35 >= aVar.b) {
                                                aVar2.b = i35 - aVar.d;
                                            }
                                            int i36 = aVar2.d;
                                            if (i36 >= aVar.b) {
                                                aVar2.d = i36 - aVar.d;
                                            }
                                        }
                                        int i37 = aVar2.b;
                                        if (i37 >= aVar3.b) {
                                            aVar2.b = i37 - aVar3.d;
                                        }
                                        int i38 = aVar2.d;
                                        if (i38 >= aVar3.b) {
                                            aVar2.d = i38 - aVar3.d;
                                        }
                                    }
                                    arrayList.set(size, aVar3);
                                    if (aVar2.b != aVar2.d) {
                                        arrayList.set(i19, aVar2);
                                    } else {
                                        arrayList.remove(i19);
                                    }
                                    if (aVar != null) {
                                        arrayList.add(size, aVar);
                                    }
                                }
                            }
                        }
                        obj = null;
                        aVar = null;
                        if (z11) {
                        }
                    }
                } else if (aVar3.b == i27 + 1 && aVar3.d == i26 - i27) {
                    z10 = true;
                    z11 = true;
                    i16 = aVar3.b;
                    if (i27 >= i16) {
                    }
                    i17 = aVar2.b;
                    i18 = aVar3.b;
                    if (i17 > i18) {
                    }
                    obj = null;
                    aVar = null;
                    if (z11) {
                    }
                } else {
                    z10 = true;
                    z11 = false;
                    i16 = aVar3.b;
                    if (i27 >= i16) {
                    }
                    i17 = aVar2.b;
                    i18 = aVar3.b;
                    if (i17 > i18) {
                    }
                    obj = null;
                    aVar = null;
                    if (z11) {
                    }
                }
            } else if (i20 == 4) {
                int i39 = aVar2.d;
                int i40 = aVar3.b;
                if (i39 < i40) {
                    aVar3.b = i40 - 1;
                } else {
                    int i41 = aVar3.d;
                    if (i39 < i40 + i41) {
                        aVar3.d = i41 - 1;
                        i12 = k0Var.i(4, aVar2.b, aVar3.c, 1);
                        i13 = aVar2.b;
                        i14 = aVar3.b;
                        if (i13 > i14) {
                            aVar3.b = i14 + 1;
                        } else {
                            int i42 = i14 + aVar3.d;
                            if (i13 < i42) {
                                int i43 = i42 - i13;
                                i15 = k0Var.i(4, i13 + 1, aVar3.c, i43);
                                aVar3.d -= i43;
                                arrayList.set(i19, aVar2);
                                if (aVar3.d > 0) {
                                    arrayList.set(size, aVar3);
                                } else {
                                    arrayList.remove(size);
                                    aVar3.c = null;
                                    uVar2.v(aVar3);
                                }
                                if (i12 != null) {
                                    arrayList.add(size, i12);
                                }
                                if (i15 != null) {
                                    arrayList.add(size, i15);
                                }
                            }
                        }
                        i15 = null;
                        arrayList.set(i19, aVar2);
                        if (aVar3.d > 0) {
                        }
                        if (i12 != null) {
                        }
                        if (i15 != null) {
                        }
                    }
                }
                i12 = null;
                i13 = aVar2.b;
                i14 = aVar3.b;
                if (i13 > i14) {
                }
                i15 = null;
                arrayList.set(i19, aVar2);
                if (aVar3.d > 0) {
                }
                if (i12 != null) {
                }
                if (i15 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        int i44 = 0;
        while (i44 < size2) {
            v4.a aVar4 = (v4.a) arrayList.get(i44);
            int i45 = aVar4.a;
            if (i45 == 1) {
                i11 = i10;
                j(aVar4);
            } else if (i45 == i10) {
                int i46 = aVar4.b;
                int i47 = aVar4.d + i46;
                int i48 = i46;
                int i49 = 0;
                char c11 = 65535;
                while (i48 < i47) {
                    RecyclerView recyclerView = (RecyclerView) rtVar.b;
                    v4.d1 L = recyclerView.L(i48, true);
                    if (L != null) {
                    }
                    L = null;
                    if (L != null || a(i48)) {
                        if (c11 == 0) {
                            d(i(2, i46, null, i49));
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        c10 = 1;
                    } else {
                        if (c11 == 1) {
                            j(i(2, i46, null, i49));
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        c10 = 0;
                    }
                    if (z9) {
                        i48 -= i49;
                        i47 -= i49;
                        i49 = 1;
                    } else {
                        i49++;
                    }
                    i48++;
                    c11 = c10;
                }
                if (i49 != aVar4.d) {
                    aVar4.c = null;
                    uVar.v(aVar4);
                    i11 = 2;
                    aVar4 = i(2, i46, null, i49);
                } else {
                    i11 = 2;
                }
                if (c11 == 0) {
                    d(aVar4);
                } else {
                    j(aVar4);
                }
            } else if (i45 != 4) {
                if (i45 == i7) {
                    j(aVar4);
                }
                i11 = i10;
            } else {
                int i50 = aVar4.b;
                int i51 = aVar4.d + i50;
                int i52 = i50;
                int i53 = 0;
                char c12 = 65535;
                while (i50 < i51) {
                    RecyclerView recyclerView2 = (RecyclerView) rtVar.b;
                    v4.d1 L2 = recyclerView2.L(i50, true);
                    if (L2 != null) {
                    }
                    L2 = null;
                    if (L2 != null || a(i50)) {
                        if (c12 == 0) {
                            d(i(4, i52, aVar4.c, i53));
                            i52 = i50;
                            i53 = 0;
                        }
                        c12 = 1;
                    } else {
                        if (c12 == 1) {
                            j(i(4, i52, aVar4.c, i53));
                            i52 = i50;
                            i53 = 0;
                        }
                        c12 = 0;
                    }
                    i53++;
                    i50++;
                }
                if (i53 != aVar4.d) {
                    Object obj2 = aVar4.c;
                    aVar4.c = null;
                    uVar.v(aVar4);
                    aVar4 = i(4, i52, obj2, i53);
                }
                if (c12 == 0) {
                    d(aVar4);
                } else {
                    j(aVar4);
                }
                i11 = 2;
            }
            i44++;
            i10 = i11;
            i7 = 8;
        }
        arrayList.clear();
    }

    public void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            v4.a aVar = (v4.a) arrayList.get(i7);
            aVar.c = null;
            ((f5.u) this.c).v(aVar);
        }
        arrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m() {
        String str;
        ze.b bVar = ze.b.e;
        if (i) {
            z2.d dVar = (z2.d) this.f;
            if (dVar == null) {
                try {
                    z2.d dVar2 = new z2.d();
                    dVar2.b = new SoftReference(new String[3]);
                    this.f = dVar2;
                } catch (Throwable unused) {
                    i = false;
                }
            } else {
                String[] strArr = (String[]) ((SoftReference) dVar.b).get();
                if (strArr != null) {
                    str = strArr[0];
                    if (str == null) {
                        StringBuffer stringBuffer = new StringBuffer();
                        int i7 = this.b;
                        if (i7 == -1) {
                            throw null;
                        }
                        String str2 = "";
                        if (bVar.c) {
                            String modifier = Modifier.toString(i7);
                            if (modifier.length() != 0) {
                                str2 = modifier.concat(" ");
                            }
                        }
                        stringBuffer.append(str2);
                        if (bVar.b) {
                            ((Class) this.h).getClass();
                            Class cls = (Class) this.h;
                            stringBuffer.append(ze.b.a(cls.getName(), cls, bVar.a));
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
                        stringBuffer.append(ze.b.a((String) this.d, cls2, bVar.d));
                        stringBuffer.append(".");
                        ((String) this.c).getClass();
                        stringBuffer.append((String) this.c);
                        Class[] clsArr = (Class[]) this.g;
                        if (bVar.b) {
                            stringBuffer.append("(");
                            for (int i10 = 0; i10 < clsArr.length; i10++) {
                                if (i10 > 0) {
                                    stringBuffer.append(", ");
                                }
                                Class cls3 = clsArr[i10];
                                stringBuffer.append(ze.b.a(cls3.getName(), cls3, bVar.a));
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
                        z2.d dVar3 = (z2.d) this.f;
                        String[] strArr2 = (String[]) ((SoftReference) dVar3.b).get();
                        if (strArr2 == null) {
                            strArr2 = new String[3];
                            dVar3.b = new SoftReference(strArr2);
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

    public int n(int i7, int i10) {
        int i11;
        int i12;
        f5.u uVar = (f5.u) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v4.a aVar = (v4.a) arrayList.get(size);
            int i13 = aVar.a;
            if (i13 == 8) {
                int i14 = aVar.b;
                int i15 = aVar.d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i7 < i12 || i7 > i11) {
                    if (i7 < i14) {
                        if (i10 == 1) {
                            aVar.b = i14 + 1;
                            aVar.d = i15 + 1;
                        } else if (i10 == 2) {
                            aVar.b = i14 - 1;
                            aVar.d = i15 - 1;
                        }
                    }
                } else if (i12 == i14) {
                    if (i10 == 1) {
                        aVar.d = i15 + 1;
                    } else if (i10 == 2) {
                        aVar.d = i15 - 1;
                    }
                    i7++;
                } else {
                    if (i10 == 1) {
                        aVar.b = i14 + 1;
                    } else if (i10 == 2) {
                        aVar.b = i14 - 1;
                    }
                    i7--;
                }
            } else {
                int i16 = aVar.b;
                if (i16 <= i7) {
                    if (i13 == 1) {
                        i7 -= aVar.d;
                    } else if (i13 == 2) {
                        i7 += aVar.d;
                    }
                } else if (i10 == 1) {
                    aVar.b = i16 + 1;
                } else if (i10 == 2) {
                    aVar.b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            v4.a aVar2 = (v4.a) arrayList.get(size2);
            if (aVar2.a == 8) {
                int i17 = aVar2.d;
                if (i17 == aVar2.b || i17 < 0) {
                    arrayList.remove(size2);
                    aVar2.c = null;
                    uVar.v(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.c = null;
                uVar.v(aVar2);
            }
        }
        return i7;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                ze.b bVar = ze.b.e;
                return m();
            default:
                return super.toString();
        }
    }

    public k0(rt rtVar) {
        this.a = 1;
        this.c = new f5.u(30, 13);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = 0;
        boolean z9 = r2.a;
        this.h = new ArrayList();
        this.f = rtVar;
        this.g = new rt(this, 21);
    }
}
