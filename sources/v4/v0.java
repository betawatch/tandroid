package v4;

import a8.ua;
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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.vy;
import org.telegram.ui.ky0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class v0 {
    public int a;
    public int b;
    public final Serializable c;
    public Object d;
    public final Serializable e;
    public Object f;
    public Object g;
    public Object h;

    public v0(Uri uri, String str, String str2) {
        this.c = str;
        this.d = uri;
        this.e = str2;
    }

    public void a(d1 d1Var, boolean z9) {
        RecyclerView.m(d1Var);
        if (d1Var.e(TLObject.FLAG_14)) {
            d1Var.p(0, TLObject.FLAG_14);
            r0.i0.j(d1Var.a, null);
        }
        if (z9) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            g0 g0Var = recyclerView.x;
            if (g0Var != null) {
                g0Var.A(d1Var);
            }
            if (recyclerView.u0 != null) {
                recyclerView.f.T0(d1Var);
            }
        }
        d1Var.t = null;
        u0 c10 = c();
        c10.getClass();
        int i7 = d1Var.f;
        ArrayList arrayList = c10.b(i7).a;
        if (((t0) c10.a.get(i7)).b <= arrayList.size()) {
            return;
        }
        d1Var.o();
        arrayList.add(d1Var);
    }

    public int b(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i7 >= 0 && i7 < recyclerView.u0.b()) {
            return !recyclerView.u0.g ? i7 : recyclerView.d.f(i7, 0);
        }
        StringBuilder n10 = jg.g.n(i7, "invalid position ", ". State item count is ");
        n10.append(recyclerView.u0.b());
        n10.append(recyclerView.C());
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public u0 c() {
        if (((u0) this.g) == null) {
            this.g = new u0();
        }
        return (u0) this.g;
    }

    public void d(g0 g0Var, g0 g0Var2) {
        ((ArrayList) this.c).clear();
        e();
        u0 c10 = c();
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
        h2.f fVar = ((RecyclerView) this.h).t0;
        int[] iArr2 = fVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        fVar.c = 0;
    }

    public void f(int i7) {
        ArrayList arrayList = (ArrayList) this.e;
        a((d1) arrayList.get(i7), true);
        arrayList.remove(i7);
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

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(d1 d1Var) {
        boolean z9;
        boolean z10;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        h2.f fVar = recyclerView.t0;
        boolean k10 = d1Var.k();
        View view = d1Var.a;
        boolean z11 = true;
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
            WeakHashMap weakHashMap = r0.i0.a;
            if (view.hasTransientState()) {
                z9 = true;
                if (d1Var.i()) {
                    z11 = false;
                } else {
                    if (this.b <= 0 || d1Var.e(526)) {
                        z10 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.b && size > 0) {
                            f(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.Q0;
                        if (size > 0) {
                            int i7 = d1Var.c;
                            if (fVar.d != null) {
                                int i10 = fVar.c * 2;
                                for (int i11 = 0; i11 < i10; i11 += 2) {
                                    if (fVar.d[i11] == i7) {
                                        break;
                                    }
                                }
                            }
                            int i12 = size - 1;
                            loop1: while (i12 >= 0) {
                                int i13 = ((d1) arrayList.get(i12)).c;
                                if (fVar.d == null) {
                                    break;
                                }
                                int i14 = fVar.c * 2;
                                for (int i15 = 0; i15 < i14; i15 += 2) {
                                    if (fVar.d[i15] == i13) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i12 + 1;
                        }
                        arrayList.add(size, d1Var);
                        z10 = true;
                    }
                    if (z10) {
                        z11 = false;
                    } else {
                        a(d1Var, true);
                    }
                    r5 = z10;
                }
                recyclerView.f.T0(d1Var);
                if (r5 && !z11 && z9) {
                    d1Var.t = null;
                    return;
                }
                return;
            }
        }
        z9 = false;
        if (d1Var.i()) {
        }
        recyclerView.f.T0(d1Var);
        if (r5) {
        }
    }

    public void i(View view) {
        l0 l0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        d1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (l0Var = recyclerView.c0) != null && !l0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.p = this;
            U.q = true;
            ((ArrayList) this.d).add(U);
            return;
        }
        if (U.h() && !U.j() && !recyclerView.x.b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        }
        U.p = this;
        U.q = false;
        ((ArrayList) this.c).add(U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x0419, code lost:
    
        if (r12.h() == false) goto L230;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:223:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x052a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0514  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d1 j(int i7, long j3) {
        int i10;
        int i11;
        d1 d1Var;
        r0.b bVar;
        long j10;
        long j11;
        boolean z9;
        int i12;
        int i13;
        ViewGroup.LayoutParams layoutParams;
        o0 o0Var;
        d1 d1Var2;
        char c10;
        View view;
        d1 d1Var3;
        int i14;
        int size;
        int f10;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        a1 a1Var = recyclerView.u0;
        if (i7 < 0 || i7 >= a1Var.b()) {
            StringBuilder o4 = jg.g.o("Invalid item position ", i7, "(", i7, "). Item count:");
            o4.append(a1Var.b());
            o4.append(recyclerView.C());
            throw new IndexOutOfBoundsException(o4.toString());
        }
        if (a1Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i15 = 0;
                while (true) {
                    if (i15 < size) {
                        d1Var = (d1) ((ArrayList) this.d).get(i15);
                        if (!d1Var.s() && d1Var.c() == i7) {
                            d1Var.a(32);
                            i10 = 1;
                            break;
                        }
                        i15++;
                    } else if (recyclerView.x.b && (f10 = recyclerView.d.f(i7, 0)) > 0 && f10 < recyclerView.x.b()) {
                        long c11 = recyclerView.x.c(f10);
                        for (int i16 = 0; i16 < size; i16++) {
                            d1 d1Var4 = (d1) ((ArrayList) this.d).get(i16);
                            i10 = 1;
                            if (!d1Var4.s() && d1Var4.e == c11) {
                                d1Var4.a(32);
                                d1Var = d1Var4;
                                break;
                            }
                        }
                    }
                }
            }
            i10 = 1;
            d1Var = null;
            i11 = d1Var != null ? i10 : 0;
        } else {
            i10 = 1;
            i11 = 0;
            d1Var = null;
        }
        if (d1Var == null) {
            int size2 = arrayList.size();
            for (int i17 = 0; i17 < size2; i17++) {
                d1Var3 = (d1) arrayList.get(i17);
                if (!d1Var3.s() && d1Var3.c() == i7 && !d1Var3.h() && (a1Var.g || !d1Var3.j())) {
                    d1Var3.a(32);
                    break;
                }
            }
            ArrayList arrayList4 = (ArrayList) recyclerView.e.d;
            int size3 = arrayList4.size();
            int i18 = 0;
            while (true) {
                if (i18 >= size3) {
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i18);
                d1 U = RecyclerView.U(view);
                if (U.c() == i7 && !U.h() && !U.j()) {
                    break;
                }
                i18++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size4) {
                        d1Var3 = null;
                        break;
                    }
                    d1Var3 = (d1) arrayList2.get(i19);
                    if (!d1Var3.h() && d1Var3.c() == i7 && !d1Var3.f()) {
                        arrayList2.remove(i19);
                        break;
                    }
                    i19++;
                }
            } else {
                d1 U2 = RecyclerView.U(view);
                ky0 ky0Var = recyclerView.e;
                ua uaVar = (ua) ky0Var.c;
                int indexOfChild = ((RecyclerView) ((vy) ky0Var.b).b).indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!uaVar.E(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                uaVar.A(indexOfChild);
                ky0Var.M(view);
                ky0 ky0Var2 = recyclerView.e;
                ua uaVar2 = (ua) ky0Var2.c;
                int indexOfChild2 = ((RecyclerView) ((vy) ky0Var2.b).b).indexOfChild(view);
                int B = (indexOfChild2 == -1 || uaVar2.E(indexOfChild2)) ? -1 : indexOfChild2 - uaVar2.B(indexOfChild2);
                if (B == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + U2 + recyclerView.C());
                }
                recyclerView.e.p(B);
                i(view);
                U2.a(8224);
                d1Var3 = U2;
            }
            if (d1Var3 != null) {
                if (d1Var3.j()) {
                    i14 = a1Var.g;
                } else {
                    int i20 = d1Var3.c;
                    if (i20 < 0 || i20 >= recyclerView.x.b()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d1Var3 + recyclerView.C());
                    }
                    if (a1Var.g || recyclerView.x.d(d1Var3.c) == d1Var3.f) {
                        g0 g0Var = recyclerView.x;
                        if (!g0Var.b || d1Var3.e == g0Var.c(d1Var3.c)) {
                            i14 = i10;
                        }
                    }
                    i14 = 0;
                }
                if (i14 == 0) {
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
                    i11 = i10;
                }
            } else {
                d1Var = d1Var3;
            }
        }
        if (d1Var == null) {
            j10 = 3;
            int f11 = recyclerView.d.f(i7, 0);
            if (f11 < 0 || f11 >= recyclerView.x.b()) {
                StringBuilder o10 = jg.g.o("Inconsistency detected. Invalid item position ", i7, "(offset:", f11, ").state:");
                o10.append(a1Var.b());
                o10.append(recyclerView.C());
                throw new IndexOutOfBoundsException(o10.toString());
            }
            int d = recyclerView.x.d(f11);
            j11 = 4;
            g0 g0Var2 = recyclerView.x;
            if (g0Var2.b) {
                long c12 = g0Var2.c(f11);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        d1 d1Var5 = (d1) arrayList.get(size5);
                        long j12 = d1Var5.e;
                        View view2 = d1Var5.a;
                        if (j12 != c12 || d1Var5.s()) {
                            c10 = ' ';
                        } else if (d == d1Var5.f) {
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
                            if (d1Var6.e != c12 || d1Var6.f()) {
                                size6--;
                            } else if (d == d1Var6.f) {
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
                    d1Var.c = f11;
                    i11 = i10;
                }
            }
            if (d1Var == null) {
                t0 t0Var = (t0) c().a.get(d);
                if (t0Var != null) {
                    ArrayList arrayList5 = t0Var.a;
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
                    long j13 = ((u0) this.g).b(d).c;
                    if (((j13 == 0 || j13 + nanoTime < j3) ? i10 : 0) == 0) {
                        return null;
                    }
                }
                bVar = null;
                d1Var = recyclerView.x.a(recyclerView, d);
                int[] iArr2 = RecyclerView.Q0;
                RecyclerView J = RecyclerView.J(d1Var.a);
                if (J != null) {
                    d1Var.b = new WeakReference(J);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                t0 b10 = ((u0) this.g).b(d);
                long j14 = b10.c;
                if (j14 != 0) {
                    nanoTime2 = (nanoTime2 / 4) + ((j14 / 4) * 3);
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
        if (i11 != 0 && !a1Var.g && d1Var.e(TLObject.FLAG_13)) {
            d1Var.p(0, TLObject.FLAG_13);
            if (a1Var.j) {
                recyclerView.o0(d1Var, recyclerView.c0.l(a1Var, d1Var, l0.b(d1Var) | TLObject.FLAG_12, d1Var.d()));
            }
        }
        if (!a1Var.g || !d1Var.g()) {
            if (d1Var.g()) {
                if (((d1Var.l & 2) != 0 ? i10 : 0) == 0) {
                }
            }
            z9 = false;
            int f12 = recyclerView.d.f(i7, 0);
            d1Var.t = recyclerView;
            int i21 = d1Var.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j3 != Long.MAX_VALUE) {
                long j15 = ((u0) this.g).b(i21).d;
                if (j15 != 0 && j15 + nanoTime3 >= j3) {
                    i13 = 0;
                    i12 = i10;
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
                    o0Var.a = d1Var;
                    o0Var.d = (i11 != 0 || i13 == 0) ? z9 : i12;
                    return d1Var;
                }
            }
            g0 g0Var3 = recyclerView.x;
            g0Var3.getClass();
            d1Var.c = f12;
            if (g0Var3.b) {
                d1Var.e = g0Var3.c(f12);
            }
            d1Var.p(i10, 519);
            int i22 = n0.g.a;
            Trace.beginSection("RV OnBindView");
            g0Var3.v(d1Var, f12, d1Var.d());
            ArrayList arrayList6 = d1Var.m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            d1Var.l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof o0) {
                ((o0) layoutParams2).c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            t0 b11 = ((u0) this.g).b(d1Var.f);
            long j16 = b11.d;
            if (j16 != 0) {
                nanoTime4 = (nanoTime4 / j11) + ((j16 / j11) * j10);
            }
            b11.d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.O;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap = r0.i0.a;
                i12 = 1;
                if (view3.getImportantForAccessibility() == 0) {
                    view3.setImportantForAccessibility(1);
                }
                View.AccessibilityDelegate d2 = r0.i0.d(view3);
                r0.b bVar2 = d2 == null ? bVar : d2 instanceof r0.a ? ((r0.a) d2).a : new r0.b(d2);
                if (bVar2 == null || bVar2.getClass().equals(r0.b.class)) {
                    d1Var.a(TLObject.FLAG_14);
                    r0.i0.j(view3, recyclerView.B0.e);
                }
            } else {
                i12 = 1;
            }
            if (a1Var.g) {
                d1Var.g = i7;
            }
            i13 = i12;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            o0Var.a = d1Var;
            o0Var.d = (i11 != 0 || i13 == 0) ? z9 : i12;
            return d1Var;
        }
        d1Var.g = i7;
        i12 = i10;
        i13 = 0;
        z9 = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        o0Var.a = d1Var;
        o0Var.d = (i11 != 0 || i13 == 0) ? z9 : i12;
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
        n0 n0Var = ((RecyclerView) this.h).y;
        this.b = this.a + (n0Var != null ? n0Var.i : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            f(size);
        }
    }

    public v0(RecyclerView recyclerView) {
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
