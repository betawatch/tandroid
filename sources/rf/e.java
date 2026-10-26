package rf;

import a8.lg;
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
import jg.s0;
import r0.i0;
import s4.b1;
import s4.e1;
import s4.h0;
import s4.m0;
import s4.p0;
import s4.q0;
import s4.v0;
import s4.w0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    public void a(e1 e1Var, boolean z10) {
        RecyclerView.m(e1Var);
        if (e1Var.e(16384)) {
            e1Var.p(0, 16384);
            i0.k(e1Var.a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            h0 h0Var = recyclerView.w;
            if (h0Var != null) {
                h0Var.A(e1Var);
            }
            if (recyclerView.u0 != null) {
                recyclerView.f.z0(e1Var);
            }
        }
        e1Var.t = null;
        w0 c10 = c();
        c10.getClass();
        int i10 = e1Var.f;
        ArrayList arrayList = c10.b(i10).a;
        if (((v0) c10.a.get(i10)).b <= arrayList.size()) {
            return;
        }
        e1Var.o();
        arrayList.add(e1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.u0.b()) {
            return !recyclerView.u0.g ? i10 : recyclerView.d.g(i10, 0);
        }
        StringBuilder k10 = ic.a.k(i10, "invalid position ", ". State item count is ");
        k10.append(recyclerView.u0.b());
        k10.append(recyclerView.C());
        throw new IndexOutOfBoundsException(k10.toString());
    }

    public w0 c() {
        if (((w0) this.g) == null) {
            this.g = new w0();
        }
        return (w0) this.g;
    }

    public void d(h0 h0Var, h0 h0Var2) {
        ((ArrayList) this.c).clear();
        e();
        w0 c10 = c();
        if (h0Var != null) {
            c10.b--;
        }
        if (c10.b == 0) {
            c10.a();
        }
        if (h0Var2 != null) {
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
        a((e1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        e1 U = RecyclerView.U(view);
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
    public void h(e1 e1Var) {
        boolean z10;
        boolean z11;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        e2.f fVar = recyclerView.t0;
        boolean k10 = e1Var.k();
        View view = e1Var.a;
        boolean z12 = true;
        if (k10 || view.getParent() != null) {
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(e1Var.k());
            sb2.append(" isAttached:");
            sb2.append(view.getParent() != null);
            sb2.append(recyclerView.C());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (e1Var.l()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + e1Var + recyclerView.C());
        }
        if (e1Var.r()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.C());
        }
        if ((e1Var.l & 16) == 0) {
            WeakHashMap weakHashMap = i0.a;
            if (view.hasTransientState()) {
                z10 = true;
                if (e1Var.i()) {
                    z12 = false;
                } else {
                    if (this.b <= 0 || e1Var.e(526)) {
                        z11 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.b && size > 0) {
                            f(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.Q0;
                        if (size > 0) {
                            int i10 = e1Var.c;
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
                                int i14 = ((e1) arrayList.get(i13)).c;
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
                        arrayList.add(size, e1Var);
                        z11 = true;
                    }
                    if (z11) {
                        z12 = false;
                    } else {
                        a(e1Var, true);
                    }
                    r5 = z11;
                }
                recyclerView.f.z0(e1Var);
                if (r5 && !z12 && z10) {
                    e1Var.t = null;
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (e1Var.i()) {
        }
        recyclerView.f.z0(e1Var);
        if (r5) {
        }
    }

    public void i(View view) {
        m0 m0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        e1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (m0Var = recyclerView.c0) != null && !m0Var.c(U, U.d())) {
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
    public e1 j(int i10, long j10) {
        int i11;
        int i12;
        e1 e1Var;
        r0.b bVar;
        long j11;
        long j12;
        boolean z10;
        int i13;
        int i14;
        ViewGroup.LayoutParams layoutParams;
        q0 q0Var;
        e1 e1Var2;
        char c10;
        View view;
        e1 e1Var3;
        int i15;
        int size;
        int g7;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        b1 b1Var = recyclerView.u0;
        if (i10 < 0 || i10 >= b1Var.b()) {
            StringBuilder n10 = c3.h0.n("Invalid item position ", i10, "(", i10, "). Item count:");
            n10.append(b1Var.b());
            n10.append(recyclerView.C());
            throw new IndexOutOfBoundsException(n10.toString());
        }
        if (b1Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i16 = 0;
                while (true) {
                    if (i16 < size) {
                        e1Var = (e1) ((ArrayList) this.d).get(i16);
                        if (!e1Var.s() && e1Var.c() == i10) {
                            e1Var.a(32);
                            i11 = 1;
                            break;
                        }
                        i16++;
                    } else if (recyclerView.w.b && (g7 = recyclerView.d.g(i10, 0)) > 0 && g7 < recyclerView.w.h()) {
                        long i17 = recyclerView.w.i(g7);
                        for (int i18 = 0; i18 < size; i18++) {
                            e1 e1Var4 = (e1) ((ArrayList) this.d).get(i18);
                            i11 = 1;
                            if (!e1Var4.s() && e1Var4.e == i17) {
                                e1Var4.a(32);
                                e1Var = e1Var4;
                                break;
                            }
                        }
                    }
                }
            }
            i11 = 1;
            e1Var = null;
            i12 = e1Var != null ? i11 : 0;
        } else {
            i11 = 1;
            i12 = 0;
            e1Var = null;
        }
        if (e1Var == null) {
            int size2 = arrayList.size();
            for (int i19 = 0; i19 < size2; i19++) {
                e1Var3 = (e1) arrayList.get(i19);
                if (!e1Var3.s() && e1Var3.c() == i10 && !e1Var3.h() && (b1Var.g || !e1Var3.j())) {
                    e1Var3.a(32);
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
                e1 U = RecyclerView.U(view);
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
                        e1Var3 = null;
                        break;
                    }
                    e1Var3 = (e1) arrayList2.get(i21);
                    if (!e1Var3.h() && e1Var3.c() == i10 && !e1Var3.f()) {
                        arrayList2.remove(i21);
                        break;
                    }
                    i21++;
                }
            } else {
                e1 U2 = RecyclerView.U(view);
                s4.d dVar = recyclerView.e;
                lg lgVar = (lg) dVar.c;
                int indexOfChild = ((RecyclerView) ((s0) dVar.b).b).indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!lgVar.z(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                lgVar.v(indexOfChild);
                dVar.t(view);
                s4.d dVar2 = recyclerView.e;
                lg lgVar2 = (lg) dVar2.c;
                int indexOfChild2 = ((RecyclerView) ((s0) dVar2.b).b).indexOfChild(view);
                int w10 = (indexOfChild2 == -1 || lgVar2.z(indexOfChild2)) ? -1 : indexOfChild2 - lgVar2.w(indexOfChild2);
                if (w10 == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + U2 + recyclerView.C());
                }
                recyclerView.e.i(w10);
                i(view);
                U2.a(8224);
                e1Var3 = U2;
            }
            if (e1Var3 != null) {
                if (e1Var3.j()) {
                    i15 = b1Var.g;
                } else {
                    int i22 = e1Var3.c;
                    if (i22 < 0 || i22 >= recyclerView.w.h()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e1Var3 + recyclerView.C());
                    }
                    if (b1Var.g || recyclerView.w.j(e1Var3.c) == e1Var3.f) {
                        h0 h0Var = recyclerView.w;
                        if (!h0Var.b || e1Var3.e == h0Var.i(e1Var3.c)) {
                            i15 = i11;
                        }
                    }
                    i15 = 0;
                }
                if (i15 == 0) {
                    e1Var3.a(4);
                    if (e1Var3.k()) {
                        recyclerView.removeDetachedView(e1Var3.a, false);
                        e1Var3.p.k(e1Var3);
                    } else if (e1Var3.s()) {
                        e1Var3.l &= -33;
                    }
                    h(e1Var3);
                    e1Var = null;
                } else {
                    e1Var = e1Var3;
                    i12 = i11;
                }
            } else {
                e1Var = e1Var3;
            }
        }
        if (e1Var == null) {
            j11 = 3;
            int g10 = recyclerView.d.g(i10, 0);
            if (g10 < 0 || g10 >= recyclerView.w.h()) {
                StringBuilder n11 = c3.h0.n("Inconsistency detected. Invalid item position ", i10, "(offset:", g10, ").state:");
                n11.append(b1Var.b());
                n11.append(recyclerView.C());
                throw new IndexOutOfBoundsException(n11.toString());
            }
            int j13 = recyclerView.w.j(g10);
            j12 = 4;
            h0 h0Var2 = recyclerView.w;
            if (h0Var2.b) {
                long i23 = h0Var2.i(g10);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        e1 e1Var5 = (e1) arrayList.get(size5);
                        long j14 = e1Var5.e;
                        View view2 = e1Var5.a;
                        if (j14 != i23 || e1Var5.s()) {
                            c10 = ' ';
                        } else if (j13 == e1Var5.f) {
                            e1Var5.a(32);
                            if (e1Var5.j() && !b1Var.g) {
                                e1Var5.p(2, 14);
                            }
                            e1Var = e1Var5;
                        } else {
                            c10 = ' ';
                            arrayList.remove(size5);
                            recyclerView.removeDetachedView(view2, false);
                            e1 U3 = RecyclerView.U(view2);
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
                            e1 e1Var6 = (e1) arrayList2.get(size6);
                            if (e1Var6.e != i23 || e1Var6.f()) {
                                size6--;
                            } else if (j13 == e1Var6.f) {
                                arrayList2.remove(size6);
                                e1Var = e1Var6;
                            } else {
                                f(size6);
                            }
                        }
                        e1Var = null;
                    }
                }
                if (e1Var != null) {
                    e1Var.c = g10;
                    i12 = i11;
                }
            }
            if (e1Var == null) {
                v0 v0Var = (v0) c().a.get(j13);
                if (v0Var != null) {
                    ArrayList arrayList5 = v0Var.a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((e1) arrayList5.get(size7)).f()) {
                                e1Var2 = (e1) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                e1Var2 = null;
                if (e1Var2 != null) {
                    e1Var2.o();
                    int[] iArr = RecyclerView.Q0;
                }
                e1Var = e1Var2;
            }
            if (e1Var == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j10 != Long.MAX_VALUE) {
                    long j15 = ((w0) this.g).b(j13).c;
                    if (((j15 == 0 || j15 + nanoTime < j10) ? i11 : 0) == 0) {
                        return null;
                    }
                }
                bVar = null;
                e1Var = recyclerView.w.g(recyclerView, j13);
                int[] iArr2 = RecyclerView.Q0;
                RecyclerView J = RecyclerView.J(e1Var.a);
                if (J != null) {
                    e1Var.b = new WeakReference(J);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                v0 b10 = ((w0) this.g).b(j13);
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
        View view3 = e1Var.a;
        if (i12 != 0 && !b1Var.g && e1Var.e(8192)) {
            e1Var.p(0, 8192);
            if (b1Var.j) {
                recyclerView.o0(e1Var, recyclerView.c0.l(b1Var, e1Var, m0.b(e1Var) | 4096, e1Var.d()));
            }
        }
        if (!b1Var.g || !e1Var.g()) {
            if (e1Var.g()) {
                if (((e1Var.l & 2) != 0 ? i11 : 0) == 0) {
                }
            }
            z10 = false;
            int g11 = recyclerView.d.g(i10, 0);
            e1Var.t = recyclerView;
            int i24 = e1Var.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j10 != Long.MAX_VALUE) {
                long j17 = ((w0) this.g).b(i24).d;
                if (j17 != 0 && j17 + nanoTime3 >= j10) {
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
                    q0Var.a = e1Var;
                    q0Var.d = (i12 != 0 || i14 == 0) ? z10 : i13;
                    return e1Var;
                }
            }
            h0 h0Var3 = recyclerView.w;
            h0Var3.getClass();
            e1Var.c = g11;
            if (h0Var3.b) {
                e1Var.e = h0Var3.i(g11);
            }
            e1Var.p(i11, 519);
            int i25 = n0.g.a;
            Trace.beginSection("RV OnBindView");
            h0Var3.w(e1Var, g11, e1Var.d());
            ArrayList arrayList6 = e1Var.m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            e1Var.l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof q0) {
                ((q0) layoutParams2).c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            v0 b11 = ((w0) this.g).b(e1Var.f);
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
                    e1Var.a(16384);
                    i0.k(view3, recyclerView.B0.e);
                }
            } else {
                i13 = 1;
            }
            if (b1Var.g) {
                e1Var.g = i10;
            }
            i14 = i13;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            q0Var.a = e1Var;
            q0Var.d = (i12 != 0 || i14 == 0) ? z10 : i13;
            return e1Var;
        }
        e1Var.g = i10;
        i13 = i11;
        i14 = 0;
        z10 = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        q0Var.a = e1Var;
        q0Var.d = (i12 != 0 || i14 == 0) ? z10 : i13;
        return e1Var;
    }

    public void k(e1 e1Var) {
        if (e1Var.q) {
            ((ArrayList) this.d).remove(e1Var);
        } else {
            ((ArrayList) this.c).remove(e1Var);
        }
        e1Var.p = null;
        e1Var.q = false;
        e1Var.l &= -33;
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
