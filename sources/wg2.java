// default package

import android.net.Uri;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class wg2 {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public wg2(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f = DesugarCollections.unmodifiableList(arrayList);
        this.a = 2;
        this.b = 2;
    }

    public final void a(s49 s49Var, boolean z) {
        RecyclerView.m(s49Var);
        if (s49Var.e(TLObject.FLAG_14)) {
            s49Var.p(0, TLObject.FLAG_14);
            jdc.k(s49Var.a, null);
        }
        if (z) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            w39 w39Var = recyclerView.x;
            if (w39Var != null) {
                w39Var.A(s49Var);
            }
            if (recyclerView.v0 != null) {
                recyclerView.f.o(s49Var);
            }
        }
        s49Var.t = null;
        k49 k49Var = (k49) this.g;
        if (k49Var == null) {
            k49Var = new k49();
            this.g = k49Var;
        }
        int i = s49Var.f;
        ArrayList arrayList = k49Var.b(i).a;
        ((j49) k49Var.a.get(i)).getClass();
        if (20 <= arrayList.size()) {
            return;
        }
        s49Var.o();
        arrayList.add(s49Var);
    }

    public final int b(int i) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        p49 p49Var = recyclerView.v0;
        if (i >= 0 && i < p49Var.b()) {
            return !p49Var.g ? i : recyclerView.d.f(i, 0);
        }
        StringBuilder m = de9.m(i, "invalid position ", ". State item count is ");
        m.append(p49Var.b());
        m.append(recyclerView.C());
        throw new IndexOutOfBoundsException(m.toString());
    }

    public final wg2 c(r00 r00Var) {
        return new wg2((fm4) this.c, (fm4) this.d, this.a, this.b, r00Var, (k20) this.f, (aob) this.g, this.h);
    }

    public final boolean d() {
        return Objects.equals(((fm4) this.c).t, "audio/raw");
    }

    public final void e(w39 w39Var, w39 w39Var2) {
        ((ArrayList) this.c).clear();
        f();
        k49 k49Var = (k49) this.g;
        if (k49Var == null) {
            k49Var = new k49();
            this.g = k49Var;
        }
        if (w39Var != null) {
            k49Var.b--;
        }
        if (k49Var.b == 0) {
            k49Var.a();
        }
        if (w39Var2 != null) {
            k49Var.b++;
        }
    }

    public final void f() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.R0;
        on onVar = ((RecyclerView) this.h).u0;
        int[] iArr2 = onVar.a;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        onVar.d = 0;
    }

    public final void g(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        a((s49) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        s49 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.p.l(U);
        } else if (U.s()) {
            U.l &= -33;
        }
        i(U);
        if (recyclerView.d0 == null || U.i()) {
            return;
        }
        recyclerView.d0.f(U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(s49 s49Var) {
        boolean z;
        boolean z2;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        on onVar = recyclerView.u0;
        boolean k = s49Var.k();
        View view = s49Var.a;
        boolean z3 = true;
        if (k || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(s49Var.k());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.C());
            throw new IllegalArgumentException(sb.toString());
        }
        if (s49Var.l()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + s49Var + recyclerView.C());
        }
        if (s49Var.r()) {
            w26.j("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.C()));
            return;
        }
        if ((s49Var.l & 16) == 0) {
            WeakHashMap weakHashMap = jdc.a;
            if (view.hasTransientState()) {
                z = true;
                if (s49Var.i()) {
                    z3 = false;
                } else {
                    if (this.b <= 0 || s49Var.e(526)) {
                        z2 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.b && size > 0) {
                            g(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.R0;
                        if (size > 0) {
                            int i = s49Var.c;
                            if (onVar.a != null) {
                                int i2 = onVar.d << 1;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (onVar.a[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((s49) arrayList.get(i4)).c;
                                if (onVar.a == null) {
                                    break;
                                }
                                int i6 = onVar.d << 1;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (onVar.a[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, s49Var);
                        z2 = true;
                    }
                    if (z2) {
                        z3 = false;
                    } else {
                        a(s49Var, true);
                    }
                    r5 = z2;
                }
                recyclerView.f.o(s49Var);
                if (r5 && !z3 && z) {
                    s49Var.t = null;
                    return;
                }
                return;
            }
        }
        z = false;
        if (s49Var.i()) {
        }
        recyclerView.f.o(s49Var);
        if (r5) {
        }
    }

    public final void j(View view) {
        b49 b49Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        s49 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (b49Var = recyclerView.d0) != null && !b49Var.c(U, U.d())) {
            ArrayList arrayList = (ArrayList) this.d;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.d = arrayList;
            }
            U.p = this;
            U.q = true;
            arrayList.add(U);
            return;
        }
        if (U.h() && !U.j() && !recyclerView.x.b) {
            w26.j("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.C()));
            return;
        }
        U.p = this;
        U.q = false;
        ((ArrayList) this.c).add(U);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s49 k(int i, long j) {
        s49 s49Var;
        int i2;
        int i3;
        s49 s49Var2;
        long j2;
        boolean z;
        int i4;
        int i5;
        ViewGroup.LayoutParams layoutParams;
        e49 e49Var;
        s49 s49Var3;
        View view;
        s49 s49Var4;
        int i6;
        int size;
        int f;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        p49 p49Var = recyclerView.v0;
        if (i < 0 || i >= p49Var.b()) {
            StringBuilder p = ir2.p("Invalid item position ", i, "(", i, "). Item count:");
            p.append(p49Var.b());
            p.append(recyclerView.C());
            throw new IndexOutOfBoundsException(p.toString());
        }
        if (p49Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        s49Var2 = (s49) ((ArrayList) this.d).get(i7);
                        if (!s49Var2.s() && s49Var2.c() == i) {
                            s49Var2.a(32);
                            s49Var = null;
                            i2 = 1;
                            break;
                        }
                        i7++;
                    } else if (recyclerView.x.b && (f = recyclerView.d.f(i, 0)) > 0 && f < recyclerView.x.b()) {
                        long c = recyclerView.x.c(f);
                        for (int i8 = 0; i8 < size; i8++) {
                            s49 s49Var5 = (s49) ((ArrayList) this.d).get(i8);
                            if (!s49Var5.s()) {
                                s49Var = null;
                                i2 = 1;
                                if (s49Var5.e == c) {
                                    s49Var5.a(32);
                                    s49Var2 = s49Var5;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            s49Var = null;
            i2 = 1;
            s49Var2 = null;
            i3 = s49Var2 != null ? i2 : 0;
        } else {
            s49Var = null;
            i2 = 1;
            i3 = 0;
            s49Var2 = null;
        }
        if (s49Var2 == null) {
            int size2 = arrayList.size();
            for (int i9 = 0; i9 < size2; i9++) {
                s49Var4 = (s49) arrayList.get(i9);
                if (!s49Var4.s() && s49Var4.c() == i && !s49Var4.h() && (p49Var.g || !s49Var4.j())) {
                    s49Var4.a(32);
                    break;
                }
            }
            ArrayList arrayList4 = (ArrayList) recyclerView.e.d;
            int size3 = arrayList4.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size3) {
                    view = s49Var;
                    break;
                }
                view = (View) arrayList4.get(i10);
                s49 U = RecyclerView.U(view);
                if (U.c() == i && !U.h() && !U.j()) {
                    break;
                }
                i10++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size4) {
                        s49Var4 = s49Var;
                        break;
                    }
                    s49Var4 = (s49) arrayList2.get(i11);
                    if (!s49Var4.h() && s49Var4.c() == i && !s49Var4.f()) {
                        arrayList2.remove(i11);
                        break;
                    }
                    i11++;
                }
            } else {
                s49 U2 = RecyclerView.U(view);
                mv6 mv6Var = recyclerView.e;
                hg2 hg2Var = (hg2) mv6Var.c;
                int indexOfChild = ((RecyclerView) ((ln8) mv6Var.b).b).indexOfChild(view);
                if (indexOfChild < 0) {
                    w26.i(view, "view is not a child, cannot hide ");
                    return s49Var;
                }
                if (!hg2Var.x(indexOfChild)) {
                    fyb.h(view, "trying to unhide a view that was not hidden");
                    return s49Var;
                }
                hg2Var.q(indexOfChild);
                mv6Var.u0(view);
                mv6 mv6Var2 = recyclerView.e;
                hg2 hg2Var2 = (hg2) mv6Var2.c;
                int indexOfChild2 = ((RecyclerView) ((ln8) mv6Var2.b).b).indexOfChild(view);
                int s = (indexOfChild2 == -1 || hg2Var2.x(indexOfChild2)) ? -1 : indexOfChild2 - hg2Var2.s(indexOfChild2);
                if (s == -1) {
                    StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                    sb.append(U2);
                    fyb.k(sb, recyclerView.C());
                    return s49Var;
                }
                recyclerView.e.w(s);
                j(view);
                U2.a(8224);
                s49Var4 = U2;
            }
            if (s49Var4 != null) {
                if (s49Var4.j()) {
                    i6 = p49Var.g;
                } else {
                    int i12 = s49Var4.c;
                    if (i12 < 0 || i12 >= recyclerView.x.b()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + s49Var4 + recyclerView.C());
                    }
                    if (p49Var.g || recyclerView.x.d(s49Var4.c) == s49Var4.f) {
                        w39 w39Var = recyclerView.x;
                        if (!w39Var.b || s49Var4.e == w39Var.c(s49Var4.c)) {
                            i6 = i2;
                        }
                    }
                    i6 = 0;
                }
                if (i6 == 0) {
                    s49Var4.a(4);
                    if (s49Var4.k()) {
                        recyclerView.removeDetachedView(s49Var4.a, false);
                        s49Var4.p.l(s49Var4);
                    } else if (s49Var4.s()) {
                        s49Var4.l &= -33;
                    }
                    i(s49Var4);
                    s49Var2 = s49Var;
                } else {
                    s49Var2 = s49Var4;
                    i3 = i2;
                }
            } else {
                s49Var2 = s49Var4;
            }
        }
        if (s49Var2 == null) {
            int f2 = recyclerView.d.f(i, 0);
            if (f2 < 0 || f2 >= recyclerView.x.b()) {
                StringBuilder p2 = ir2.p("Inconsistency detected. Invalid item position ", i, "(offset:", f2, ").state:");
                p2.append(p49Var.b());
                p2.append(recyclerView.C());
                throw new IndexOutOfBoundsException(p2.toString());
            }
            int d = recyclerView.x.d(f2);
            j2 = 4;
            w39 w39Var2 = recyclerView.x;
            if (w39Var2.b) {
                long c2 = w39Var2.c(f2);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        s49 s49Var6 = (s49) arrayList.get(size5);
                        long j3 = s49Var6.e;
                        View view2 = s49Var6.a;
                        if (j3 == c2 && !s49Var6.s()) {
                            if (d == s49Var6.f) {
                                s49Var6.a(32);
                                if (s49Var6.j() && !p49Var.g) {
                                    s49Var6.p(2, 14);
                                }
                                s49Var2 = s49Var6;
                            } else {
                                arrayList.remove(size5);
                                recyclerView.removeDetachedView(view2, false);
                                s49 U3 = RecyclerView.U(view2);
                                U3.p = null;
                                U3.q = false;
                                U3.l &= -33;
                                i(U3);
                            }
                        }
                        size5--;
                    } else {
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            s49 s49Var7 = (s49) arrayList2.get(size6);
                            if (s49Var7.e != c2 || s49Var7.f()) {
                                size6--;
                            } else if (d == s49Var7.f) {
                                arrayList2.remove(size6);
                                s49Var2 = s49Var7;
                            } else {
                                g(size6);
                            }
                        }
                        s49Var2 = null;
                    }
                }
                if (s49Var2 != null) {
                    s49Var2.c = f2;
                    i3 = i2;
                }
            }
            if (s49Var2 == null) {
                k49 k49Var = (k49) this.g;
                if (k49Var == null) {
                    k49Var = new k49();
                    this.g = k49Var;
                }
                j49 j49Var = (j49) k49Var.a.get(d);
                if (j49Var != null) {
                    ArrayList arrayList5 = j49Var.a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((s49) arrayList5.get(size7)).f()) {
                                s49Var3 = (s49) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                s49Var3 = null;
                if (s49Var3 != null) {
                    s49Var3.o();
                    int[] iArr = RecyclerView.R0;
                }
                s49Var2 = s49Var3;
            }
            if (s49Var2 == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j4 = ((k49) this.g).b(d).b;
                    if (j4 != 0 && j4 + nanoTime >= j) {
                        return null;
                    }
                }
                s49Var = null;
                s49Var2 = recyclerView.x.a(recyclerView, d);
                int[] iArr2 = RecyclerView.R0;
                RecyclerView J = RecyclerView.J(s49Var2.a);
                if (J != null) {
                    s49Var2.b = new WeakReference(J);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                j49 b = ((k49) this.g).b(d);
                long j5 = b.b;
                if (j5 != 0) {
                    nanoTime2 = (nanoTime2 / 4) + ((j5 / 4) * 3);
                }
                b.b = nanoTime2;
            } else {
                s49Var = null;
            }
        } else {
            j2 = 4;
        }
        View view3 = s49Var2.a;
        if (i3 != 0 && !p49Var.g && s49Var2.e(TLObject.FLAG_13)) {
            s49Var2.p(0, TLObject.FLAG_13);
            if (p49Var.j) {
                recyclerView.p0(s49Var2, recyclerView.d0.l(p49Var, s49Var2, b49.b(s49Var2) | TLObject.FLAG_12, s49Var2.d()));
            }
        }
        if (p49Var.g && s49Var2.g()) {
            s49Var2.g = i;
        } else if (!s49Var2.g() || (s49Var2.l & 2) != 0 || s49Var2.h()) {
            z = false;
            int f3 = recyclerView.d.f(i, 0);
            s49Var2.t = recyclerView;
            int i13 = s49Var2.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                long j6 = ((k49) this.g).b(i13).c;
                if (j6 != 0 && j6 + nanoTime3 >= j) {
                    i5 = 0;
                    i4 = i2;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams == null) {
                        e49Var = (e49) recyclerView.generateDefaultLayoutParams();
                        view3.setLayoutParams(e49Var);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        e49Var = (e49) layoutParams;
                    } else {
                        e49Var = (e49) recyclerView.generateLayoutParams(layoutParams);
                        view3.setLayoutParams(e49Var);
                    }
                    e49Var.a = s49Var2;
                    e49Var.d = (i3 != 0 || i5 == 0) ? z : i4;
                    return s49Var2;
                }
            }
            w39 w39Var3 = recyclerView.x;
            w39Var3.getClass();
            s49Var2.c = f3;
            if (w39Var3.b) {
                s49Var2.e = w39Var3.c(f3);
            }
            s49Var2.p(i2, 519);
            int i14 = mxb.a;
            Trace.beginSection("RV OnBindView");
            w39Var3.u(s49Var2, f3, s49Var2.d());
            ArrayList arrayList6 = s49Var2.m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            s49Var2.l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof e49) {
                ((e49) layoutParams2).c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            j49 b2 = ((k49) this.g).b(s49Var2.f);
            long j7 = b2.c;
            if (j7 != 0) {
                nanoTime4 = (nanoTime4 / j2) + ((j7 / j2) * 3);
            }
            b2.c = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.P;
            if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                i4 = 1;
            } else {
                WeakHashMap weakHashMap = jdc.a;
                i4 = 1;
                if (view3.getImportantForAccessibility() == 0) {
                    view3.setImportantForAccessibility(1);
                }
                View.AccessibilityDelegate e = jdc.e(view3);
                Object q4Var = e == null ? s49Var : e instanceof p4 ? ((p4) e).a : new q4(e);
                if (q4Var == null || q4Var.getClass().equals(q4.class)) {
                    s49Var2.a(TLObject.FLAG_14);
                    jdc.k(view3, recyclerView.C0.e);
                }
            }
            if (p49Var.g) {
                s49Var2.g = i;
            }
            i5 = i4;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            e49Var.a = s49Var2;
            e49Var.d = (i3 != 0 || i5 == 0) ? z : i4;
            return s49Var2;
        }
        i4 = i2;
        i5 = 0;
        z = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        e49Var.a = s49Var2;
        e49Var.d = (i3 != 0 || i5 == 0) ? z : i4;
        return s49Var2;
    }

    public final void l(s49 s49Var) {
        if (s49Var.q) {
            ((ArrayList) this.d).remove(s49Var);
        } else {
            ((ArrayList) this.c).remove(s49Var);
        }
        s49Var.p = null;
        s49Var.q = false;
        s49Var.l &= -33;
    }

    public final void m() {
        ArrayList arrayList = (ArrayList) this.e;
        d49 d49Var = ((RecyclerView) this.h).y;
        this.b = this.a + (d49Var != null ? d49Var.i : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            g(size);
        }
    }

    public wg2(fm4 fm4Var, fm4 fm4Var2, int i, int i2, r00 r00Var, k20 k20Var, aob aobVar, Object obj) {
        this.c = fm4Var;
        this.d = fm4Var2;
        this.a = i;
        this.b = i2;
        this.e = r00Var;
        this.f = k20Var;
        this.g = aobVar;
        this.h = obj;
    }

    public wg2(String str, Uri uri, String str2) {
        this.c = str;
        this.g = uri;
        this.d = str2;
    }
}
