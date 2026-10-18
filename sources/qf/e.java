package qf;

import android.net.Uri;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import m.g3;
import r0.i0;
import s4.b1;
import s4.g0;
import s4.l0;
import s4.n0;
import s4.o0;
import s4.s0;
import s4.t0;
import s4.y0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class e {
    public int a;
    public int b;
    public final Serializable c;
    public Serializable d;
    public Serializable e;
    public Object f;
    public Object g;
    public Object h;

    public e(Uri uri, String str, String str2) {
        this.c = str;
        this.g = uri;
        this.d = str2;
    }

    public void a(b1 b1Var, boolean z10) {
        RecyclerView.m(b1Var);
        if (b1Var.e(16384)) {
            b1Var.p(0, 16384);
            i0.j(b1Var.a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            g0 g0Var = recyclerView.w;
            if (g0Var != null) {
                g0Var.A(b1Var);
            }
            if (recyclerView.u0 != null) {
                recyclerView.f.p0(b1Var);
            }
        }
        b1Var.t = null;
        t0 c10 = c();
        c10.getClass();
        int i10 = b1Var.f;
        ArrayList arrayList = c10.b(i10).a;
        if (((s0) c10.a.get(i10)).b <= arrayList.size()) {
            return;
        }
        b1Var.o();
        arrayList.add(b1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.u0.b()) {
            return !recyclerView.u0.g ? i10 : recyclerView.d.g(i10, 0);
        }
        StringBuilder l4 = i2.d.l(i10, "invalid position ", ". State item count is ");
        l4.append(recyclerView.u0.b());
        l4.append(recyclerView.C());
        throw new IndexOutOfBoundsException(l4.toString());
    }

    public t0 c() {
        if (((t0) this.g) == null) {
            this.g = new t0();
        }
        return (t0) this.g;
    }

    public void d(g0 g0Var, g0 g0Var2) {
        ((ArrayList) this.c).clear();
        e();
        t0 c10 = c();
        if (g0Var != null) {
            c10.b--;
        }
        if (c10.b == 0) {
            c10.a();
        }
        if (g0Var2 != null) {
            c10.b++;
        } else {
            c10.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.Q0;
        e2.f fVar = ((RecyclerView) this.h).t0;
        int[] iArr2 = (int[]) fVar.c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        fVar.d = 0;
    }

    public void f(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        a((b1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        b1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.p.k(U);
        } else if (U.s()) {
            U.l &= -33;
        }
        h(U);
        if (recyclerView.c0 == null || U.i()) {
            return;
        }
        recyclerView.c0.f(U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(b1 b1Var) {
        boolean z10;
        boolean z11;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        e2.f fVar = recyclerView.t0;
        boolean k10 = b1Var.k();
        View view = b1Var.a;
        boolean z12 = true;
        if (k10 || view.getParent() != null) {
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(b1Var.k());
            sb2.append(" isAttached:");
            sb2.append(view.getParent() != null);
            sb2.append(recyclerView.C());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (b1Var.l()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + b1Var + recyclerView.C());
        }
        if (b1Var.r()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.C());
        }
        if ((b1Var.l & 16) == 0) {
            WeakHashMap weakHashMap = i0.a;
            if (view.hasTransientState()) {
                z10 = true;
                if (b1Var.i()) {
                    z12 = false;
                } else {
                    if (this.b <= 0 || b1Var.e(526)) {
                        z11 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.b && size > 0) {
                            f(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.Q0;
                        if (size > 0) {
                            int i10 = b1Var.c;
                            if (((int[]) fVar.c) != null) {
                                int i11 = fVar.d * 2;
                                for (int i12 = 0; i12 < i11; i12 += 2) {
                                    if (((int[]) fVar.c)[i12] == i10) {
                                        break;
                                    }
                                }
                            }
                            int i13 = size - 1;
                            loop1: while (i13 >= 0) {
                                int i14 = ((b1) arrayList.get(i13)).c;
                                if (((int[]) fVar.c) == null) {
                                    break;
                                }
                                int i15 = fVar.d * 2;
                                for (int i16 = 0; i16 < i15; i16 += 2) {
                                    if (((int[]) fVar.c)[i16] == i14) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i13 + 1;
                        }
                        arrayList.add(size, b1Var);
                        z11 = true;
                    }
                    if (z11) {
                        z12 = false;
                    } else {
                        a(b1Var, true);
                    }
                    r5 = z11;
                }
                recyclerView.f.p0(b1Var);
                if (r5 && !z12 && z10) {
                    b1Var.t = null;
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (b1Var.i()) {
        }
        recyclerView.f.p0(b1Var);
        if (r5) {
        }
    }

    public void i(View view) {
        l0 l0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        b1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (l0Var = recyclerView.c0) != null && !l0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.p = this;
            U.q = true;
            ((ArrayList) this.d).add(U);
            return;
        }
        if (U.h() && !U.j() && !recyclerView.w.b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        }
        U.p = this;
        U.q = false;
        ((ArrayList) this.c).add(U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x0417, code lost:
    
        if (r12.h() == false) goto L230;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0528 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0512  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b1 j(int i10, long j10) {
        int i11;
        int i12;
        b1 b1Var;
        r0.b bVar;
        long j11;
        long j12;
        boolean z10;
        int i13;
        int i14;
        ViewGroup.LayoutParams layoutParams;
        o0 o0Var;
        b1 b1Var2;
        char c10;
        View view;
        b1 b1Var3;
        int i15;
        int size;
        int g10;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        y0 y0Var = recyclerView.u0;
        if (i10 < 0 || i10 >= y0Var.b()) {
            StringBuilder m10 = i2.d.m("Invalid item position ", i10, "(", i10, "). Item count:");
            m10.append(y0Var.b());
            m10.append(recyclerView.C());
            throw new IndexOutOfBoundsException(m10.toString());
        }
        if (y0Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i16 = 0;
                while (true) {
                    if (i16 < size) {
                        b1Var = (b1) ((ArrayList) this.d).get(i16);
                        if (!b1Var.s() && b1Var.c() == i10) {
                            b1Var.a(32);
                            i11 = 1;
                            break;
                        }
                        i16++;
                    } else if (recyclerView.w.b && (g10 = recyclerView.d.g(i10, 0)) > 0 && g10 < recyclerView.w.h()) {
                        long i17 = recyclerView.w.i(g10);
                        for (int i18 = 0; i18 < size; i18++) {
                            b1 b1Var4 = (b1) ((ArrayList) this.d).get(i18);
                            i11 = 1;
                            if (!b1Var4.s() && b1Var4.e == i17) {
                                b1Var4.a(32);
                                b1Var = b1Var4;
                                break;
                            }
                        }
                    }
                }
            }
            i11 = 1;
            b1Var = null;
            i12 = b1Var != null ? i11 : 0;
        } else {
            i11 = 1;
            i12 = 0;
            b1Var = null;
        }
        if (b1Var == null) {
            int size2 = arrayList.size();
            for (int i19 = 0; i19 < size2; i19++) {
                b1Var3 = (b1) arrayList.get(i19);
                if (!b1Var3.s() && b1Var3.c() == i10 && !b1Var3.h() && (y0Var.g || !b1Var3.j())) {
                    b1Var3.a(32);
                    break;
                }
            }
            ArrayList arrayList4 = (ArrayList) recyclerView.e.d;
            int size3 = arrayList4.size();
            int i20 = 0;
            while (true) {
                if (i20 >= size3) {
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i20);
                b1 U = RecyclerView.U(view);
                if (U.c() == i10 && !U.h() && !U.j()) {
                    break;
                }
                i20++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size4) {
                        b1Var3 = null;
                        break;
                    }
                    b1Var3 = (b1) arrayList2.get(i21);
                    if (!b1Var3.h() && b1Var3.c() == i10 && !b1Var3.f()) {
                        arrayList2.remove(i21);
                        break;
                    }
                    i21++;
                }
            } else {
                b1 U2 = RecyclerView.U(view);
                g3 g3Var = recyclerView.e;
                ad.d dVar = (ad.d) g3Var.c;
                int indexOfChild = ((ih.g) g3Var.b).a.indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!dVar.D(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                dVar.z(indexOfChild);
                g3Var.S(view);
                g3 g3Var2 = recyclerView.e;
                ad.d dVar2 = (ad.d) g3Var2.c;
                int indexOfChild2 = ((ih.g) g3Var2.b).a.indexOfChild(view);
                int A = (indexOfChild2 == -1 || dVar2.D(indexOfChild2)) ? -1 : indexOfChild2 - dVar2.A(indexOfChild2);
                if (A == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + U2 + recyclerView.C());
                }
                recyclerView.e.t(A);
                i(view);
                U2.a(8224);
                b1Var3 = U2;
            }
            if (b1Var3 != null) {
                if (b1Var3.j()) {
                    i15 = y0Var.g;
                } else {
                    int i22 = b1Var3.c;
                    if (i22 < 0 || i22 >= recyclerView.w.h()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + b1Var3 + recyclerView.C());
                    }
                    if (y0Var.g || recyclerView.w.j(b1Var3.c) == b1Var3.f) {
                        g0 g0Var = recyclerView.w;
                        if (!g0Var.b || b1Var3.e == g0Var.i(b1Var3.c)) {
                            i15 = i11;
                        }
                    }
                    i15 = 0;
                }
                if (i15 == 0) {
                    b1Var3.a(4);
                    if (b1Var3.k()) {
                        recyclerView.removeDetachedView(b1Var3.a, false);
                        b1Var3.p.k(b1Var3);
                    } else if (b1Var3.s()) {
                        b1Var3.l &= -33;
                    }
                    h(b1Var3);
                    b1Var = null;
                } else {
                    b1Var = b1Var3;
                    i12 = i11;
                }
            } else {
                b1Var = b1Var3;
            }
        }
        if (b1Var == null) {
            j11 = 3;
            int g11 = recyclerView.d.g(i10, 0);
            if (g11 < 0 || g11 >= recyclerView.w.h()) {
                StringBuilder m11 = i2.d.m("Inconsistency detected. Invalid item position ", i10, "(offset:", g11, ").state:");
                m11.append(y0Var.b());
                m11.append(recyclerView.C());
                throw new IndexOutOfBoundsException(m11.toString());
            }
            int j13 = recyclerView.w.j(g11);
            j12 = 4;
            g0 g0Var2 = recyclerView.w;
            if (g0Var2.b) {
                long i23 = g0Var2.i(g11);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        b1 b1Var5 = (b1) arrayList.get(size5);
                        long j14 = b1Var5.e;
                        View view2 = b1Var5.a;
                        if (j14 != i23 || b1Var5.s()) {
                            c10 = ' ';
                        } else if (j13 == b1Var5.f) {
                            b1Var5.a(32);
                            if (b1Var5.j() && !y0Var.g) {
                                b1Var5.p(2, 14);
                            }
                            b1Var = b1Var5;
                        } else {
                            c10 = ' ';
                            arrayList.remove(size5);
                            recyclerView.removeDetachedView(view2, false);
                            b1 U3 = RecyclerView.U(view2);
                            U3.p = null;
                            U3.q = false;
                            U3.l &= -33;
                            h(U3);
                        }
                        size5--;
                    } else {
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            b1 b1Var6 = (b1) arrayList2.get(size6);
                            if (b1Var6.e != i23 || b1Var6.f()) {
                                size6--;
                            } else if (j13 == b1Var6.f) {
                                arrayList2.remove(size6);
                                b1Var = b1Var6;
                            } else {
                                f(size6);
                            }
                        }
                        b1Var = null;
                    }
                }
                if (b1Var != null) {
                    b1Var.c = g11;
                    i12 = i11;
                }
            }
            if (b1Var == null) {
                s0 s0Var = (s0) c().a.get(j13);
                if (s0Var != null) {
                    ArrayList arrayList5 = s0Var.a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((b1) arrayList5.get(size7)).f()) {
                                b1Var2 = (b1) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                b1Var2 = null;
                if (b1Var2 != null) {
                    b1Var2.o();
                    int[] iArr = RecyclerView.Q0;
                }
                b1Var = b1Var2;
            }
            if (b1Var == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j10 != Long.MAX_VALUE) {
                    long j15 = ((t0) this.g).b(j13).c;
                    if (((j15 == 0 || j15 + nanoTime < j10) ? i11 : 0) == 0) {
                        return null;
                    }
                }
                bVar = null;
                b1Var = recyclerView.w.d(recyclerView, j13);
                int[] iArr2 = RecyclerView.Q0;
                RecyclerView J = RecyclerView.J(b1Var.a);
                if (J != null) {
                    b1Var.b = new WeakReference(J);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                s0 b10 = ((t0) this.g).b(j13);
                long j16 = b10.c;
                if (j16 != 0) {
                    nanoTime2 = (nanoTime2 / 4) + ((j16 / 4) * 3);
                }
                b10.c = nanoTime2;
            } else {
                bVar = null;
            }
        } else {
            bVar = null;
            j11 = 3;
            j12 = 4;
        }
        View view3 = b1Var.a;
        if (i12 != 0 && !y0Var.g && b1Var.e(8192)) {
            b1Var.p(0, 8192);
            if (y0Var.j) {
                recyclerView.n0(b1Var, recyclerView.c0.l(y0Var, b1Var, l0.b(b1Var) | 4096, b1Var.d()));
            }
        }
        if (!y0Var.g || !b1Var.g()) {
            if (b1Var.g()) {
                if (((b1Var.l & 2) != 0 ? i11 : 0) == 0) {
                }
            }
            z10 = false;
            int g12 = recyclerView.d.g(i10, 0);
            b1Var.t = recyclerView;
            int i24 = b1Var.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j10 != Long.MAX_VALUE) {
                long j17 = ((t0) this.g).b(i24).d;
                if (j17 != 0 && j17 + nanoTime3 >= j10) {
                    i14 = 0;
                    i13 = i11;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams == null) {
                        o0Var = (o0) recyclerView.generateDefaultLayoutParams();
                        view3.setLayoutParams(o0Var);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        o0Var = (o0) layoutParams;
                    } else {
                        o0Var = (o0) recyclerView.generateLayoutParams(layoutParams);
                        view3.setLayoutParams(o0Var);
                    }
                    o0Var.a = b1Var;
                    o0Var.d = (i12 != 0 || i14 == 0) ? z10 : i13;
                    return b1Var;
                }
            }
            g0 g0Var3 = recyclerView.w;
            g0Var3.getClass();
            b1Var.c = g12;
            if (g0Var3.b) {
                b1Var.e = g0Var3.i(g12);
            }
            b1Var.p(i11, 519);
            int i25 = n0.g.a;
            Trace.beginSection("RV OnBindView");
            g0Var3.w(b1Var, g12, b1Var.d());
            ArrayList arrayList6 = b1Var.m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            b1Var.l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof o0) {
                ((o0) layoutParams2).c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            s0 b11 = ((t0) this.g).b(b1Var.f);
            long j18 = b11.d;
            if (j18 != 0) {
                nanoTime4 = (nanoTime4 / j12) + ((j18 / j12) * j11);
            }
            b11.d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.O;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap = i0.a;
                i13 = 1;
                if (view3.getImportantForAccessibility() == 0) {
                    view3.setImportantForAccessibility(1);
                }
                View.AccessibilityDelegate d = i0.d(view3);
                r0.b bVar2 = d == null ? bVar : d instanceof r0.a ? ((r0.a) d).a : new r0.b(d);
                if (bVar2 == null || bVar2.getClass().equals(r0.b.class)) {
                    b1Var.a(16384);
                    i0.j(view3, recyclerView.B0.e);
                }
            } else {
                i13 = 1;
            }
            if (y0Var.g) {
                b1Var.g = i10;
            }
            i14 = i13;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            o0Var.a = b1Var;
            o0Var.d = (i12 != 0 || i14 == 0) ? z10 : i13;
            return b1Var;
        }
        b1Var.g = i10;
        i13 = i11;
        i14 = 0;
        z10 = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        o0Var.a = b1Var;
        o0Var.d = (i12 != 0 || i14 == 0) ? z10 : i13;
        return b1Var;
    }

    public void k(b1 b1Var) {
        if (b1Var.q) {
            ((ArrayList) this.d).remove(b1Var);
        } else {
            ((ArrayList) this.c).remove(b1Var);
        }
        b1Var.p = null;
        b1Var.q = false;
        b1Var.l &= -33;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.e;
        n0 n0Var = ((RecyclerView) this.h).x;
        this.b = this.a + (n0Var != null ? n0Var.i : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            f(size);
        }
    }

    public e(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f = DesugarCollections.unmodifiableList(arrayList);
        this.a = 2;
        this.b = 2;
    }
}
