package pf;

import a0.h;
import android.net.Uri;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import e6.n;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import k2.g0;
import r0.i0;
import s4.a1;
import s4.d1;
import s4.n0;
import s4.p0;
import s4.q0;
import s4.u0;
import s4.v0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    public void a(d1 d1Var, boolean z10) {
        RecyclerView.m(d1Var);
        if (d1Var.e(16384)) {
            d1Var.p(0, 16384);
            i0.j(d1Var.a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            s4.i0 i0Var = recyclerView.w;
            if (i0Var != null) {
                i0Var.A(d1Var);
            }
            if (recyclerView.u0 != null) {
                recyclerView.f.c0(d1Var);
            }
        }
        d1Var.t = null;
        v0 c10 = c();
        c10.getClass();
        int i10 = d1Var.f;
        ArrayList arrayList = c10.b(i10).a;
        if (((u0) c10.a.get(i10)).b <= arrayList.size()) {
            return;
        }
        d1Var.o();
        arrayList.add(d1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.u0.b()) {
            return !recyclerView.u0.g ? i10 : recyclerView.d.g(i10, 0);
        }
        StringBuilder j3 = hg.c.j(i10, "invalid position ", ". State item count is ");
        j3.append(recyclerView.u0.b());
        j3.append(recyclerView.C());
        throw new IndexOutOfBoundsException(j3.toString());
    }

    public v0 c() {
        if (((v0) this.g) == null) {
            this.g = new v0();
        }
        return (v0) this.g;
    }

    public void d(s4.i0 i0Var, s4.i0 i0Var2) {
        ((ArrayList) this.c).clear();
        e();
        v0 c10 = c();
        if (i0Var != null) {
            c10.b--;
        }
        if (c10.b == 0) {
            c10.a();
        }
        if (i0Var2 != null) {
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
        h hVar = ((RecyclerView) this.h).t0;
        int[] iArr2 = (int[]) hVar.c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        hVar.d = 0;
    }

    public void f(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        a((d1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        d1 U = RecyclerView.U(view);
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
    public void h(d1 d1Var) {
        boolean z10;
        boolean z11;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        h hVar = recyclerView.t0;
        boolean k10 = d1Var.k();
        View view = d1Var.a;
        boolean z12 = true;
        if (k10 || view.getParent() != null) {
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(d1Var.k());
            sb2.append(" isAttached:");
            sb2.append(view.getParent() != null);
            sb2.append(recyclerView.C());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d1Var.l()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d1Var + recyclerView.C());
        }
        if (d1Var.r()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.C());
        }
        if ((d1Var.l & 16) == 0) {
            WeakHashMap weakHashMap = i0.a;
            if (view.hasTransientState()) {
                z10 = true;
                if (d1Var.i()) {
                    z12 = false;
                } else {
                    if (this.b <= 0 || d1Var.e(526)) {
                        z11 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.b && size > 0) {
                            f(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.Q0;
                        if (size > 0) {
                            int i10 = d1Var.c;
                            if (((int[]) hVar.c) != null) {
                                int i11 = hVar.d * 2;
                                for (int i12 = 0; i12 < i11; i12 += 2) {
                                    if (((int[]) hVar.c)[i12] == i10) {
                                        break;
                                    }
                                }
                            }
                            int i13 = size - 1;
                            loop1: while (i13 >= 0) {
                                int i14 = ((d1) arrayList.get(i13)).c;
                                if (((int[]) hVar.c) == null) {
                                    break;
                                }
                                int i15 = hVar.d * 2;
                                for (int i16 = 0; i16 < i15; i16 += 2) {
                                    if (((int[]) hVar.c)[i16] == i14) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i13 + 1;
                        }
                        arrayList.add(size, d1Var);
                        z11 = true;
                    }
                    if (z11) {
                        z12 = false;
                    } else {
                        a(d1Var, true);
                    }
                    r5 = z11;
                }
                recyclerView.f.c0(d1Var);
                if (r5 && !z12 && z10) {
                    d1Var.t = null;
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (d1Var.i()) {
        }
        recyclerView.f.c0(d1Var);
        if (r5) {
        }
    }

    public void i(View view) {
        n0 n0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        d1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (n0Var = recyclerView.c0) != null && !n0Var.c(U, U.d())) {
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

    /* JADX WARN: Code restructure failed: missing block: B:242:0x041b, code lost:
    
        if (r12.h() == false) goto L230;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:223:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x052c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0516  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d1 j(int i10, long j3) {
        int i11;
        int i12;
        d1 d1Var;
        r0.b bVar;
        long j10;
        long j11;
        boolean z10;
        int i13;
        int i14;
        ViewGroup.LayoutParams layoutParams;
        q0 q0Var;
        d1 d1Var2;
        char c10;
        View view;
        d1 d1Var3;
        int i15;
        int size;
        int g10;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        a1 a1Var = recyclerView.u0;
        if (i10 < 0 || i10 >= a1Var.b()) {
            StringBuilder k10 = hg.c.k("Invalid item position ", i10, "(", i10, "). Item count:");
            k10.append(a1Var.b());
            k10.append(recyclerView.C());
            throw new IndexOutOfBoundsException(k10.toString());
        }
        if (a1Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i16 = 0;
                while (true) {
                    if (i16 < size) {
                        d1Var = (d1) ((ArrayList) this.d).get(i16);
                        if (!d1Var.s() && d1Var.c() == i10) {
                            d1Var.a(32);
                            i11 = 1;
                            break;
                        }
                        i16++;
                    } else if (recyclerView.w.b && (g10 = recyclerView.d.g(i10, 0)) > 0 && g10 < recyclerView.w.h()) {
                        long i17 = recyclerView.w.i(g10);
                        for (int i18 = 0; i18 < size; i18++) {
                            d1 d1Var4 = (d1) ((ArrayList) this.d).get(i18);
                            i11 = 1;
                            if (!d1Var4.s() && d1Var4.e == i17) {
                                d1Var4.a(32);
                                d1Var = d1Var4;
                                break;
                            }
                        }
                    }
                }
            }
            i11 = 1;
            d1Var = null;
            i12 = d1Var != null ? i11 : 0;
        } else {
            i11 = 1;
            i12 = 0;
            d1Var = null;
        }
        if (d1Var == null) {
            int size2 = arrayList.size();
            for (int i19 = 0; i19 < size2; i19++) {
                d1Var3 = (d1) arrayList.get(i19);
                if (!d1Var3.s() && d1Var3.c() == i10 && !d1Var3.h() && (a1Var.g || !d1Var3.j())) {
                    d1Var3.a(32);
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
                d1 U = RecyclerView.U(view);
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
                        d1Var3 = null;
                        break;
                    }
                    d1Var3 = (d1) arrayList2.get(i21);
                    if (!d1Var3.h() && d1Var3.c() == i10 && !d1Var3.f()) {
                        arrayList2.remove(i21);
                        break;
                    }
                    i21++;
                }
            } else {
                d1 U2 = RecyclerView.U(view);
                la.h hVar = recyclerView.e;
                n nVar = (n) hVar.c;
                int indexOfChild = ((RecyclerView) ((g0) hVar.b).b).indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!nVar.D(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                nVar.z(indexOfChild);
                hVar.Z(view);
                la.h hVar2 = recyclerView.e;
                n nVar2 = (n) hVar2.c;
                int indexOfChild2 = ((RecyclerView) ((g0) hVar2.b).b).indexOfChild(view);
                int A = (indexOfChild2 == -1 || nVar2.D(indexOfChild2)) ? -1 : indexOfChild2 - nVar2.A(indexOfChild2);
                if (A == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + U2 + recyclerView.C());
                }
                recyclerView.e.y(A);
                i(view);
                U2.a(8224);
                d1Var3 = U2;
            }
            if (d1Var3 != null) {
                if (d1Var3.j()) {
                    i15 = a1Var.g;
                } else {
                    int i22 = d1Var3.c;
                    if (i22 < 0 || i22 >= recyclerView.w.h()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d1Var3 + recyclerView.C());
                    }
                    if (a1Var.g || recyclerView.w.j(d1Var3.c) == d1Var3.f) {
                        s4.i0 i0Var = recyclerView.w;
                        if (!i0Var.b || d1Var3.e == i0Var.i(d1Var3.c)) {
                            i15 = i11;
                        }
                    }
                    i15 = 0;
                }
                if (i15 == 0) {
                    d1Var3.a(4);
                    if (d1Var3.k()) {
                        recyclerView.removeDetachedView(d1Var3.a, false);
                        d1Var3.p.k(d1Var3);
                    } else if (d1Var3.s()) {
                        d1Var3.l &= -33;
                    }
                    h(d1Var3);
                    d1Var = null;
                } else {
                    d1Var = d1Var3;
                    i12 = i11;
                }
            } else {
                d1Var = d1Var3;
            }
        }
        if (d1Var == null) {
            j10 = 3;
            int g11 = recyclerView.d.g(i10, 0);
            if (g11 < 0 || g11 >= recyclerView.w.h()) {
                StringBuilder k11 = hg.c.k("Inconsistency detected. Invalid item position ", i10, "(offset:", g11, ").state:");
                k11.append(a1Var.b());
                k11.append(recyclerView.C());
                throw new IndexOutOfBoundsException(k11.toString());
            }
            int j12 = recyclerView.w.j(g11);
            j11 = 4;
            s4.i0 i0Var2 = recyclerView.w;
            if (i0Var2.b) {
                long i23 = i0Var2.i(g11);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        d1 d1Var5 = (d1) arrayList.get(size5);
                        long j13 = d1Var5.e;
                        View view2 = d1Var5.a;
                        if (j13 != i23 || d1Var5.s()) {
                            c10 = ' ';
                        } else if (j12 == d1Var5.f) {
                            d1Var5.a(32);
                            if (d1Var5.j() && !a1Var.g) {
                                d1Var5.p(2, 14);
                            }
                            d1Var = d1Var5;
                        } else {
                            c10 = ' ';
                            arrayList.remove(size5);
                            recyclerView.removeDetachedView(view2, false);
                            d1 U3 = RecyclerView.U(view2);
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
                            d1 d1Var6 = (d1) arrayList2.get(size6);
                            if (d1Var6.e != i23 || d1Var6.f()) {
                                size6--;
                            } else if (j12 == d1Var6.f) {
                                arrayList2.remove(size6);
                                d1Var = d1Var6;
                            } else {
                                f(size6);
                            }
                        }
                        d1Var = null;
                    }
                }
                if (d1Var != null) {
                    d1Var.c = g11;
                    i12 = i11;
                }
            }
            if (d1Var == null) {
                u0 u0Var = (u0) c().a.get(j12);
                if (u0Var != null) {
                    ArrayList arrayList5 = u0Var.a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((d1) arrayList5.get(size7)).f()) {
                                d1Var2 = (d1) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                d1Var2 = null;
                if (d1Var2 != null) {
                    d1Var2.o();
                    int[] iArr = RecyclerView.Q0;
                }
                d1Var = d1Var2;
            }
            if (d1Var == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j3 != Long.MAX_VALUE) {
                    long j14 = ((v0) this.g).b(j12).c;
                    if (((j14 == 0 || j14 + nanoTime < j3) ? i11 : 0) == 0) {
                        return null;
                    }
                }
                bVar = null;
                d1Var = recyclerView.w.e(recyclerView, j12);
                int[] iArr2 = RecyclerView.Q0;
                RecyclerView J = RecyclerView.J(d1Var.a);
                if (J != null) {
                    d1Var.b = new WeakReference(J);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                u0 b10 = ((v0) this.g).b(j12);
                long j15 = b10.c;
                if (j15 != 0) {
                    nanoTime2 = (nanoTime2 / 4) + ((j15 / 4) * 3);
                }
                b10.c = nanoTime2;
            } else {
                bVar = null;
            }
        } else {
            bVar = null;
            j10 = 3;
            j11 = 4;
        }
        View view3 = d1Var.a;
        if (i12 != 0 && !a1Var.g && d1Var.e(8192)) {
            d1Var.p(0, 8192);
            if (a1Var.j) {
                recyclerView.n0(d1Var, recyclerView.c0.l(a1Var, d1Var, n0.b(d1Var) | 4096, d1Var.d()));
            }
        }
        if (!a1Var.g || !d1Var.g()) {
            if (d1Var.g()) {
                if (((d1Var.l & 2) != 0 ? i11 : 0) == 0) {
                }
            }
            z10 = false;
            int g12 = recyclerView.d.g(i10, 0);
            d1Var.t = recyclerView;
            int i24 = d1Var.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j3 != Long.MAX_VALUE) {
                long j16 = ((v0) this.g).b(i24).d;
                if (j16 != 0 && j16 + nanoTime3 >= j3) {
                    i14 = 0;
                    i13 = i11;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams == null) {
                        q0Var = (q0) recyclerView.generateDefaultLayoutParams();
                        view3.setLayoutParams(q0Var);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        q0Var = (q0) layoutParams;
                    } else {
                        q0Var = (q0) recyclerView.generateLayoutParams(layoutParams);
                        view3.setLayoutParams(q0Var);
                    }
                    q0Var.a = d1Var;
                    q0Var.d = (i12 != 0 || i14 == 0) ? z10 : i13;
                    return d1Var;
                }
            }
            s4.i0 i0Var3 = recyclerView.w;
            i0Var3.getClass();
            d1Var.c = g12;
            if (i0Var3.b) {
                d1Var.e = i0Var3.i(g12);
            }
            d1Var.p(i11, 519);
            int i25 = n0.g.a;
            Trace.beginSection("RV OnBindView");
            i0Var3.w(d1Var, g12, d1Var.d());
            ArrayList arrayList6 = d1Var.m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            d1Var.l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof q0) {
                ((q0) layoutParams2).c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            u0 b11 = ((v0) this.g).b(d1Var.f);
            long j17 = b11.d;
            if (j17 != 0) {
                nanoTime4 = (nanoTime4 / j11) + ((j17 / j11) * j10);
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
                    d1Var.a(16384);
                    i0.j(view3, recyclerView.B0.e);
                }
            } else {
                i13 = 1;
            }
            if (a1Var.g) {
                d1Var.g = i10;
            }
            i14 = i13;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            q0Var.a = d1Var;
            q0Var.d = (i12 != 0 || i14 == 0) ? z10 : i13;
            return d1Var;
        }
        d1Var.g = i10;
        i13 = i11;
        i14 = 0;
        z10 = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        q0Var.a = d1Var;
        q0Var.d = (i12 != 0 || i14 == 0) ? z10 : i13;
        return d1Var;
    }

    public void k(d1 d1Var) {
        if (d1Var.q) {
            ((ArrayList) this.d).remove(d1Var);
        } else {
            ((ArrayList) this.c).remove(d1Var);
        }
        d1Var.p = null;
        d1Var.q = false;
        d1Var.l &= -33;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.e;
        p0 p0Var = ((RecyclerView) this.h).x;
        this.b = this.a + (p0Var != null ? p0Var.i : 0);
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
