// default package

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class y51 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r61 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ v61 f;

    public /* synthetic */ y51(r61 r61Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, v61 v61Var, byte b) {
        this.a = b;
        this.b = r61Var;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = v61Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        ?? r15;
        boolean z;
        m61 m61Var;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                r61 r61Var = this.b;
                ArrayList arrayList = this.c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                v61 v61Var = this.f;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                if (arrayList.isEmpty()) {
                    i = 0;
                } else {
                    try {
                        i = 0;
                    } catch (Exception e) {
                        e = e;
                        i = 0;
                    }
                    try {
                        r61Var.getMessagesStorage().k0(arrayList, arrayList4, false);
                    } catch (Exception e2) {
                        e = e2;
                        fa4.g(e, true);
                        if (!arrayList2.isEmpty()) {
                        }
                        i2 = i;
                        while (i2 < arrayList3.size()) {
                        }
                        Collections.sort(arrayList3, new sa((byte) 12));
                        gl.c3(new y51(r61Var, arrayList4, arrayList5, arrayList3, v61Var, (byte) 1));
                        return;
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        r61Var.getMessagesStorage().P(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e3) {
                        fa4.g(e3, true);
                    }
                }
                i2 = i;
                while (i2 < arrayList3.size()) {
                    if (((l61) arrayList3.get(i2)).c <= 0) {
                        arrayList3.remove(i2);
                        i2--;
                    }
                    i2++;
                }
                Collections.sort(arrayList3, new sa((byte) 12));
                gl.c3(new y51(r61Var, arrayList4, arrayList5, arrayList3, v61Var, (byte) 1));
            default:
                r61 r61Var2 = this.b;
                ArrayList arrayList6 = this.c;
                ArrayList arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                v61 v61Var2 = this.f;
                r61Var2.getMessagesController().b4(arrayList6, true);
                r61Var2.getMessagesController().V3(arrayList7, true);
                boolean z3 = false;
                l61 l61Var = null;
                int i3 = 0;
                while (i3 < arrayList8.size()) {
                    l61 l61Var2 = (l61) arrayList8.get(i3);
                    if (r61Var2.getMessagesController().Z1(l61Var2.a) == null) {
                        l61Var2.a = Long.MAX_VALUE;
                        if (l61Var != null) {
                            SparseArray sparseArray = l61Var.d;
                            int i4 = 0;
                            while (true) {
                                SparseArray sparseArray2 = l61Var2.d;
                                if (i4 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i4);
                                    m61 m61Var2 = (m61) sparseArray2.valueAt(i4);
                                    m61 m61Var3 = (m61) sparseArray.get(keyAt, z3);
                                    if (m61Var3 == null) {
                                        m61Var = new m61();
                                        sparseArray.put(keyAt, m61Var);
                                    } else {
                                        m61Var = m61Var3;
                                    }
                                    m61Var2.getClass();
                                    m61Var.a += m61Var2.a;
                                    l61Var.c += m61Var2.a;
                                    m61Var.b.addAll(m61Var2.b);
                                    i4++;
                                    z2 = z2;
                                    z3 = false;
                                } else {
                                    boolean z4 = z2;
                                    l61Var.b += l61Var2.b;
                                    arrayList8.remove(i3);
                                    i3--;
                                    z = z4 ? 1 : 0;
                                    r15 = z4;
                                }
                            }
                        } else {
                            r15 = z2;
                            l61Var = l61Var2;
                            z = false;
                        }
                        if (z) {
                            Collections.sort(arrayList8, new sa((byte) 12));
                        }
                    } else {
                        r15 = z2;
                    }
                    i3 += r15;
                    z2 = r15;
                    z3 = false;
                }
                boolean z5 = z2;
                v61Var2.b = arrayList8;
                LongSparseArray longSparseArray = v61Var2.c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList8.get(i5);
                    i5++;
                    l61 l61Var3 = (l61) obj;
                    longSparseArray.put(l61Var3.a, l61Var3);
                }
                if (!r61.i0) {
                    r61Var2.e0 = v61Var2;
                    d61 d61Var = r61Var2.N;
                    if (d61Var != null) {
                        d61Var.setCacheModel(v61Var2);
                    }
                    r61Var2.z0(z5);
                    r61Var2.x0();
                    if (r61Var2.Y != null && !r61Var2.L && System.currentTimeMillis() - r61Var2.b0 > 120) {
                        f61 f61Var = r61Var2.Y;
                        long j = r61Var2.H;
                        boolean z6 = j > 0;
                        long j2 = r61Var2.I;
                        float f = 0.0f;
                        float f2 = j2 <= 0 ? 0.0f : j / j2;
                        if (r61Var2.J > 0 && j2 > 0) {
                            f = (j2 - r8) / j2;
                        }
                        f61Var.b(f2, f, z6);
                        break;
                    }
                }
                break;
        }
    }
}
