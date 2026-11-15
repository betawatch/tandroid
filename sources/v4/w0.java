package v4;

import a8.va;
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
import org.telegram.ui.Components.ff;
import org.telegram.ui.ld0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class w0 {
    public int a;
    public int b;
    public final Serializable c;
    public Object d;
    public final Serializable e;
    public Object f;
    public Object g;
    public Object h;

    public w0(Uri uri, String str, String str2) {
        this.c = str;
        this.d = uri;
        this.e = str2;
    }

    public void a(e1 e1Var, boolean z10) {
        RecyclerView.m(e1Var);
        if (e1Var.e(TLObject.FLAG_14)) {
            e1Var.p(0, TLObject.FLAG_14);
            r0.i0.j(e1Var.a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            h0 h0Var = recyclerView.x;
            if (h0Var != null) {
                h0Var.A(e1Var);
            }
            if (recyclerView.v0 != null) {
                recyclerView.f.i(e1Var);
            }
        }
        e1Var.t = null;
        v0 c10 = c();
        c10.getClass();
        int i7 = e1Var.f;
        ArrayList arrayList = c10.b(i7).a;
        if (((u0) c10.a.get(i7)).b <= arrayList.size()) {
            return;
        }
        e1Var.o();
        arrayList.add(e1Var);
    }

    public int b(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i7 >= 0 && i7 < recyclerView.v0.b()) {
            return !recyclerView.v0.g ? i7 : recyclerView.d.f(i7, 0);
        }
        StringBuilder m10 = i5.c.m(i7, "invalid position ", ". State item count is ");
        m10.append(recyclerView.v0.b());
        m10.append(recyclerView.C());
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public v0 c() {
        if (((v0) this.g) == null) {
            this.g = new v0();
        }
        return (v0) this.g;
    }

    public void d(h0 h0Var, h0 h0Var2) {
        ((ArrayList) this.c).clear();
        e();
        v0 c10 = c();
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
        int[] iArr = RecyclerView.R0;
        h2.f fVar = ((RecyclerView) this.h).u0;
        int[] iArr2 = fVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        fVar.c = 0;
    }

    public void f(int i7) {
        ArrayList arrayList = (ArrayList) this.e;
        a((e1) arrayList.get(i7), true);
        arrayList.remove(i7);
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
        if (recyclerView.d0 == null || U.i()) {
            return;
        }
        recyclerView.d0.f(U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(e1 e1Var) {
        boolean z10;
        boolean z11;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        h2.f fVar = recyclerView.u0;
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
            WeakHashMap weakHashMap = r0.i0.a;
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
                        int[] iArr = RecyclerView.R0;
                        if (size > 0) {
                            int i7 = e1Var.c;
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
                                int i13 = ((e1) arrayList.get(i12)).c;
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
                recyclerView.f.i(e1Var);
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
        recyclerView.f.i(e1Var);
        if (r5) {
        }
    }

    public void i(View view) {
        m0 m0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        e1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (m0Var = recyclerView.d0) != null && !m0Var.c(U, U.d())) {
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
    public e1 j(int i7, long j3) {
        int i10;
        int i11;
        e1 e1Var;
        r0.b bVar;
        long j10;
        long j11;
        boolean z10;
        int i12;
        int i13;
        ViewGroup.LayoutParams layoutParams;
        p0 p0Var;
        e1 e1Var2;
        char c10;
        View view;
        e1 e1Var3;
        int i14;
        int size;
        int f10;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        b1 b1Var = recyclerView.v0;
        if (i7 < 0 || i7 >= b1Var.b()) {
            StringBuilder n10 = i5.c.n("Invalid item position ", i7, "(", i7, "). Item count:");
            n10.append(b1Var.b());
            n10.append(recyclerView.C());
            throw new IndexOutOfBoundsException(n10.toString());
        }
        if (b1Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i15 = 0;
                while (true) {
                    if (i15 < size) {
                        e1Var = (e1) ((ArrayList) this.d).get(i15);
                        if (!e1Var.s() && e1Var.c() == i7) {
                            e1Var.a(32);
                            i10 = 1;
                            break;
                        }
                        i15++;
                    } else if (recyclerView.x.b && (f10 = recyclerView.d.f(i7, 0)) > 0 && f10 < recyclerView.x.b()) {
                        long c11 = recyclerView.x.c(f10);
                        for (int i16 = 0; i16 < size; i16++) {
                            e1 e1Var4 = (e1) ((ArrayList) this.d).get(i16);
                            i10 = 1;
                            if (!e1Var4.s() && e1Var4.e == c11) {
                                e1Var4.a(32);
                                e1Var = e1Var4;
                                break;
                            }
                        }
                    }
                }
            }
            i10 = 1;
            e1Var = null;
            i11 = e1Var != null ? i10 : 0;
        } else {
            i10 = 1;
            i11 = 0;
            e1Var = null;
        }
        if (e1Var == null) {
            int size2 = arrayList.size();
            for (int i17 = 0; i17 < size2; i17++) {
                e1Var3 = (e1) arrayList.get(i17);
                if (!e1Var3.s() && e1Var3.c() == i7 && !e1Var3.h() && (b1Var.g || !e1Var3.j())) {
                    e1Var3.a(32);
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
                e1 U = RecyclerView.U(view);
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
                        e1Var3 = null;
                        break;
                    }
                    e1Var3 = (e1) arrayList2.get(i19);
                    if (!e1Var3.h() && e1Var3.c() == i7 && !e1Var3.f()) {
                        arrayList2.remove(i19);
                        break;
                    }
                    i19++;
                }
            } else {
                e1 U2 = RecyclerView.U(view);
                ld0 ld0Var = recyclerView.e;
                va vaVar = (va) ld0Var.c;
                int indexOfChild = ((RecyclerView) ((ff) ld0Var.b).b).indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!vaVar.v(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                vaVar.p(indexOfChild);
                ld0Var.K(view);
                ld0 ld0Var2 = recyclerView.e;
                va vaVar2 = (va) ld0Var2.c;
                int indexOfChild2 = ((RecyclerView) ((ff) ld0Var2.b).b).indexOfChild(view);
                int q10 = (indexOfChild2 == -1 || vaVar2.v(indexOfChild2)) ? -1 : indexOfChild2 - vaVar2.q(indexOfChild2);
                if (q10 == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + U2 + recyclerView.C());
                }
                recyclerView.e.p(q10);
                i(view);
                U2.a(8224);
                e1Var3 = U2;
            }
            if (e1Var3 != null) {
                if (e1Var3.j()) {
                    i14 = b1Var.g;
                } else {
                    int i20 = e1Var3.c;
                    if (i20 < 0 || i20 >= recyclerView.x.b()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e1Var3 + recyclerView.C());
                    }
                    if (b1Var.g || recyclerView.x.d(e1Var3.c) == e1Var3.f) {
                        h0 h0Var = recyclerView.x;
                        if (!h0Var.b || e1Var3.e == h0Var.c(e1Var3.c)) {
                            i14 = i10;
                        }
                    }
                    i14 = 0;
                }
                if (i14 == 0) {
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
                    i11 = i10;
                }
            } else {
                e1Var = e1Var3;
            }
        }
        if (e1Var == null) {
            j10 = 3;
            int f11 = recyclerView.d.f(i7, 0);
            if (f11 < 0 || f11 >= recyclerView.x.b()) {
                StringBuilder n11 = i5.c.n("Inconsistency detected. Invalid item position ", i7, "(offset:", f11, ").state:");
                n11.append(b1Var.b());
                n11.append(recyclerView.C());
                throw new IndexOutOfBoundsException(n11.toString());
            }
            int d = recyclerView.x.d(f11);
            j11 = 4;
            h0 h0Var2 = recyclerView.x;
            if (h0Var2.b) {
                long c12 = h0Var2.c(f11);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        e1 e1Var5 = (e1) arrayList.get(size5);
                        long j12 = e1Var5.e;
                        View view2 = e1Var5.a;
                        if (j12 != c12 || e1Var5.s()) {
                            c10 = ' ';
                        } else if (d == e1Var5.f) {
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
                            if (e1Var6.e != c12 || e1Var6.f()) {
                                size6--;
                            } else if (d == e1Var6.f) {
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
                    e1Var.c = f11;
                    i11 = i10;
                }
            }
            if (e1Var == null) {
                u0 u0Var = (u0) c().a.get(d);
                if (u0Var != null) {
                    ArrayList arrayList5 = u0Var.a;
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
                    int[] iArr = RecyclerView.R0;
                }
                e1Var = e1Var2;
            }
            if (e1Var == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j3 != Long.MAX_VALUE) {
                    long j13 = ((v0) this.g).b(d).c;
                    if (((j13 == 0 || j13 + nanoTime < j3) ? i10 : 0) == 0) {
                        return null;
                    }
                }
                bVar = null;
                e1Var = recyclerView.x.a(recyclerView, d);
                int[] iArr2 = RecyclerView.R0;
                RecyclerView J = RecyclerView.J(e1Var.a);
                if (J != null) {
                    e1Var.b = new WeakReference(J);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                u0 b10 = ((v0) this.g).b(d);
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
        View view3 = e1Var.a;
        if (i11 != 0 && !b1Var.g && e1Var.e(TLObject.FLAG_13)) {
            e1Var.p(0, TLObject.FLAG_13);
            if (b1Var.j) {
                recyclerView.o0(e1Var, recyclerView.d0.l(b1Var, e1Var, m0.b(e1Var) | TLObject.FLAG_12, e1Var.d()));
            }
        }
        if (!b1Var.g || !e1Var.g()) {
            if (e1Var.g()) {
                if (((e1Var.l & 2) != 0 ? i10 : 0) == 0) {
                }
            }
            z10 = false;
            int f12 = recyclerView.d.f(i7, 0);
            e1Var.t = recyclerView;
            int i21 = e1Var.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j3 != Long.MAX_VALUE) {
                long j15 = ((v0) this.g).b(i21).d;
                if (j15 != 0 && j15 + nanoTime3 >= j3) {
                    i13 = 0;
                    i12 = i10;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams == null) {
                        p0Var = (p0) recyclerView.generateDefaultLayoutParams();
                        view3.setLayoutParams(p0Var);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        p0Var = (p0) layoutParams;
                    } else {
                        p0Var = (p0) recyclerView.generateLayoutParams(layoutParams);
                        view3.setLayoutParams(p0Var);
                    }
                    p0Var.a = e1Var;
                    p0Var.d = (i11 != 0 || i13 == 0) ? z10 : i12;
                    return e1Var;
                }
            }
            h0 h0Var3 = recyclerView.x;
            h0Var3.getClass();
            e1Var.c = f12;
            if (h0Var3.b) {
                e1Var.e = h0Var3.c(f12);
            }
            e1Var.p(i10, 519);
            int i22 = n0.g.a;
            Trace.beginSection("RV OnBindView");
            h0Var3.v(e1Var, f12, e1Var.d());
            ArrayList arrayList6 = e1Var.m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            e1Var.l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof p0) {
                ((p0) layoutParams2).c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            u0 b11 = ((v0) this.g).b(e1Var.f);
            long j16 = b11.d;
            if (j16 != 0) {
                nanoTime4 = (nanoTime4 / j11) + ((j16 / j11) * j10);
            }
            b11.d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.P;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap = r0.i0.a;
                i12 = 1;
                if (view3.getImportantForAccessibility() == 0) {
                    view3.setImportantForAccessibility(1);
                }
                View.AccessibilityDelegate d2 = r0.i0.d(view3);
                r0.b bVar2 = d2 == null ? bVar : d2 instanceof r0.a ? ((r0.a) d2).a : new r0.b(d2);
                if (bVar2 == null || bVar2.getClass().equals(r0.b.class)) {
                    e1Var.a(TLObject.FLAG_14);
                    r0.i0.j(view3, recyclerView.C0.e);
                }
            } else {
                i12 = 1;
            }
            if (b1Var.g) {
                e1Var.g = i7;
            }
            i13 = i12;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            p0Var.a = e1Var;
            p0Var.d = (i11 != 0 || i13 == 0) ? z10 : i12;
            return e1Var;
        }
        e1Var.g = i7;
        i12 = i10;
        i13 = 0;
        z10 = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        p0Var.a = e1Var;
        p0Var.d = (i11 != 0 || i13 == 0) ? z10 : i12;
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
        o0 o0Var = ((RecyclerView) this.h).y;
        this.b = this.a + (o0Var != null ? o0Var.i : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            f(size);
        }
    }

    public w0(RecyclerView recyclerView) {
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
