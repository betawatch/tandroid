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
import org.telegram.ui.Components.qf;
import org.telegram.ui.md0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class x0 {
    public int a;
    public int b;
    public final Serializable c;
    public Object d;
    public final Serializable e;
    public Object f;
    public Object g;
    public Object h;

    public x0(Uri uri, String str, String str2) {
        this.c = str;
        this.d = uri;
        this.e = str2;
    }

    public void a(f1 f1Var, boolean z10) {
        RecyclerView.m(f1Var);
        if (f1Var.e(TLObject.FLAG_14)) {
            f1Var.p(0, TLObject.FLAG_14);
            r0.i0.j(f1Var.a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            i0 i0Var = recyclerView.x;
            if (i0Var != null) {
                i0Var.A(f1Var);
            }
            if (recyclerView.v0 != null) {
                recyclerView.f.i(f1Var);
            }
        }
        f1Var.t = null;
        w0 c10 = c();
        c10.getClass();
        int i7 = f1Var.f;
        ArrayList arrayList = c10.b(i7).a;
        if (((v0) c10.a.get(i7)).b <= arrayList.size()) {
            return;
        }
        f1Var.o();
        arrayList.add(f1Var);
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

    public w0 c() {
        if (((w0) this.g) == null) {
            this.g = new w0();
        }
        return (w0) this.g;
    }

    public void d(i0 i0Var, i0 i0Var2) {
        ((ArrayList) this.c).clear();
        e();
        w0 c10 = c();
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
        a((f1) arrayList.get(i7), true);
        arrayList.remove(i7);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        f1 U = RecyclerView.U(view);
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
    public void h(f1 f1Var) {
        boolean z10;
        boolean z11;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        h2.f fVar = recyclerView.u0;
        boolean k10 = f1Var.k();
        View view = f1Var.a;
        boolean z12 = true;
        if (k10 || view.getParent() != null) {
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(f1Var.k());
            sb2.append(" isAttached:");
            sb2.append(view.getParent() != null);
            sb2.append(recyclerView.C());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (f1Var.l()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f1Var + recyclerView.C());
        }
        if (f1Var.r()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.C());
        }
        if ((f1Var.l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.a;
            if (view.hasTransientState()) {
                z10 = true;
                if (f1Var.i()) {
                    z12 = false;
                } else {
                    if (this.b <= 0 || f1Var.e(526)) {
                        z11 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.b && size > 0) {
                            f(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.R0;
                        if (size > 0) {
                            int i7 = f1Var.c;
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
                                int i13 = ((f1) arrayList.get(i12)).c;
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
                        arrayList.add(size, f1Var);
                        z11 = true;
                    }
                    if (z11) {
                        z12 = false;
                    } else {
                        a(f1Var, true);
                    }
                    r5 = z11;
                }
                recyclerView.f.i(f1Var);
                if (r5 && !z12 && z10) {
                    f1Var.t = null;
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (f1Var.i()) {
        }
        recyclerView.f.i(f1Var);
        if (r5) {
        }
    }

    public void i(View view) {
        n0 n0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        f1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (n0Var = recyclerView.d0) != null && !n0Var.c(U, U.d())) {
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
    public f1 j(int i7, long j3) {
        int i10;
        int i11;
        f1 f1Var;
        r0.b bVar;
        long j10;
        long j11;
        boolean z10;
        int i12;
        int i13;
        ViewGroup.LayoutParams layoutParams;
        q0 q0Var;
        f1 f1Var2;
        char c10;
        View view;
        f1 f1Var3;
        int i14;
        int size;
        int f10;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        c1 c1Var = recyclerView.v0;
        if (i7 < 0 || i7 >= c1Var.b()) {
            StringBuilder n10 = i5.c.n("Invalid item position ", i7, "(", i7, "). Item count:");
            n10.append(c1Var.b());
            n10.append(recyclerView.C());
            throw new IndexOutOfBoundsException(n10.toString());
        }
        if (c1Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i15 = 0;
                while (true) {
                    if (i15 < size) {
                        f1Var = (f1) ((ArrayList) this.d).get(i15);
                        if (!f1Var.s() && f1Var.c() == i7) {
                            f1Var.a(32);
                            i10 = 1;
                            break;
                        }
                        i15++;
                    } else if (recyclerView.x.b && (f10 = recyclerView.d.f(i7, 0)) > 0 && f10 < recyclerView.x.b()) {
                        long c11 = recyclerView.x.c(f10);
                        for (int i16 = 0; i16 < size; i16++) {
                            f1 f1Var4 = (f1) ((ArrayList) this.d).get(i16);
                            i10 = 1;
                            if (!f1Var4.s() && f1Var4.e == c11) {
                                f1Var4.a(32);
                                f1Var = f1Var4;
                                break;
                            }
                        }
                    }
                }
            }
            i10 = 1;
            f1Var = null;
            i11 = f1Var != null ? i10 : 0;
        } else {
            i10 = 1;
            i11 = 0;
            f1Var = null;
        }
        if (f1Var == null) {
            int size2 = arrayList.size();
            for (int i17 = 0; i17 < size2; i17++) {
                f1Var3 = (f1) arrayList.get(i17);
                if (!f1Var3.s() && f1Var3.c() == i7 && !f1Var3.h() && (c1Var.g || !f1Var3.j())) {
                    f1Var3.a(32);
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
                f1 U = RecyclerView.U(view);
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
                        f1Var3 = null;
                        break;
                    }
                    f1Var3 = (f1) arrayList2.get(i19);
                    if (!f1Var3.h() && f1Var3.c() == i7 && !f1Var3.f()) {
                        arrayList2.remove(i19);
                        break;
                    }
                    i19++;
                }
            } else {
                f1 U2 = RecyclerView.U(view);
                md0 md0Var = recyclerView.e;
                va vaVar = (va) md0Var.c;
                int indexOfChild = ((RecyclerView) ((qf) md0Var.b).b).indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!vaVar.G(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                vaVar.C(indexOfChild);
                md0Var.K(view);
                md0 md0Var2 = recyclerView.e;
                va vaVar2 = (va) md0Var2.c;
                int indexOfChild2 = ((RecyclerView) ((qf) md0Var2.b).b).indexOfChild(view);
                int D = (indexOfChild2 == -1 || vaVar2.G(indexOfChild2)) ? -1 : indexOfChild2 - vaVar2.D(indexOfChild2);
                if (D == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + U2 + recyclerView.C());
                }
                recyclerView.e.p(D);
                i(view);
                U2.a(8224);
                f1Var3 = U2;
            }
            if (f1Var3 != null) {
                if (f1Var3.j()) {
                    i14 = c1Var.g;
                } else {
                    int i20 = f1Var3.c;
                    if (i20 < 0 || i20 >= recyclerView.x.b()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f1Var3 + recyclerView.C());
                    }
                    if (c1Var.g || recyclerView.x.d(f1Var3.c) == f1Var3.f) {
                        i0 i0Var = recyclerView.x;
                        if (!i0Var.b || f1Var3.e == i0Var.c(f1Var3.c)) {
                            i14 = i10;
                        }
                    }
                    i14 = 0;
                }
                if (i14 == 0) {
                    f1Var3.a(4);
                    if (f1Var3.k()) {
                        recyclerView.removeDetachedView(f1Var3.a, false);
                        f1Var3.p.k(f1Var3);
                    } else if (f1Var3.s()) {
                        f1Var3.l &= -33;
                    }
                    h(f1Var3);
                    f1Var = null;
                } else {
                    f1Var = f1Var3;
                    i11 = i10;
                }
            } else {
                f1Var = f1Var3;
            }
        }
        if (f1Var == null) {
            j10 = 3;
            int f11 = recyclerView.d.f(i7, 0);
            if (f11 < 0 || f11 >= recyclerView.x.b()) {
                StringBuilder n11 = i5.c.n("Inconsistency detected. Invalid item position ", i7, "(offset:", f11, ").state:");
                n11.append(c1Var.b());
                n11.append(recyclerView.C());
                throw new IndexOutOfBoundsException(n11.toString());
            }
            int d = recyclerView.x.d(f11);
            j11 = 4;
            i0 i0Var2 = recyclerView.x;
            if (i0Var2.b) {
                long c12 = i0Var2.c(f11);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        f1 f1Var5 = (f1) arrayList.get(size5);
                        long j12 = f1Var5.e;
                        View view2 = f1Var5.a;
                        if (j12 != c12 || f1Var5.s()) {
                            c10 = ' ';
                        } else if (d == f1Var5.f) {
                            f1Var5.a(32);
                            if (f1Var5.j() && !c1Var.g) {
                                f1Var5.p(2, 14);
                            }
                            f1Var = f1Var5;
                        } else {
                            c10 = ' ';
                            arrayList.remove(size5);
                            recyclerView.removeDetachedView(view2, false);
                            f1 U3 = RecyclerView.U(view2);
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
                            f1 f1Var6 = (f1) arrayList2.get(size6);
                            if (f1Var6.e != c12 || f1Var6.f()) {
                                size6--;
                            } else if (d == f1Var6.f) {
                                arrayList2.remove(size6);
                                f1Var = f1Var6;
                            } else {
                                f(size6);
                            }
                        }
                        f1Var = null;
                    }
                }
                if (f1Var != null) {
                    f1Var.c = f11;
                    i11 = i10;
                }
            }
            if (f1Var == null) {
                v0 v0Var = (v0) c().a.get(d);
                if (v0Var != null) {
                    ArrayList arrayList5 = v0Var.a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((f1) arrayList5.get(size7)).f()) {
                                f1Var2 = (f1) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                f1Var2 = null;
                if (f1Var2 != null) {
                    f1Var2.o();
                    int[] iArr = RecyclerView.R0;
                }
                f1Var = f1Var2;
            }
            if (f1Var == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j3 != Long.MAX_VALUE) {
                    long j13 = ((w0) this.g).b(d).c;
                    if (((j13 == 0 || j13 + nanoTime < j3) ? i10 : 0) == 0) {
                        return null;
                    }
                }
                bVar = null;
                f1Var = recyclerView.x.a(recyclerView, d);
                int[] iArr2 = RecyclerView.R0;
                RecyclerView J = RecyclerView.J(f1Var.a);
                if (J != null) {
                    f1Var.b = new WeakReference(J);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                v0 b10 = ((w0) this.g).b(d);
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
        View view3 = f1Var.a;
        if (i11 != 0 && !c1Var.g && f1Var.e(TLObject.FLAG_13)) {
            f1Var.p(0, TLObject.FLAG_13);
            if (c1Var.j) {
                recyclerView.o0(f1Var, recyclerView.d0.l(c1Var, f1Var, n0.b(f1Var) | TLObject.FLAG_12, f1Var.d()));
            }
        }
        if (!c1Var.g || !f1Var.g()) {
            if (f1Var.g()) {
                if (((f1Var.l & 2) != 0 ? i10 : 0) == 0) {
                }
            }
            z10 = false;
            int f12 = recyclerView.d.f(i7, 0);
            f1Var.t = recyclerView;
            int i21 = f1Var.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j3 != Long.MAX_VALUE) {
                long j15 = ((w0) this.g).b(i21).d;
                if (j15 != 0 && j15 + nanoTime3 >= j3) {
                    i13 = 0;
                    i12 = i10;
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
                    q0Var.a = f1Var;
                    q0Var.d = (i11 != 0 || i13 == 0) ? z10 : i12;
                    return f1Var;
                }
            }
            i0 i0Var3 = recyclerView.x;
            i0Var3.getClass();
            f1Var.c = f12;
            if (i0Var3.b) {
                f1Var.e = i0Var3.c(f12);
            }
            f1Var.p(i10, 519);
            int i22 = n0.g.a;
            Trace.beginSection("RV OnBindView");
            i0Var3.v(f1Var, f12, f1Var.d());
            ArrayList arrayList6 = f1Var.m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            f1Var.l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof q0) {
                ((q0) layoutParams2).c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            v0 b11 = ((w0) this.g).b(f1Var.f);
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
                    f1Var.a(TLObject.FLAG_14);
                    r0.i0.j(view3, recyclerView.C0.e);
                }
            } else {
                i12 = 1;
            }
            if (c1Var.g) {
                f1Var.g = i7;
            }
            i13 = i12;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            q0Var.a = f1Var;
            q0Var.d = (i11 != 0 || i13 == 0) ? z10 : i12;
            return f1Var;
        }
        f1Var.g = i7;
        i12 = i10;
        i13 = 0;
        z10 = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        q0Var.a = f1Var;
        q0Var.d = (i11 != 0 || i13 == 0) ? z10 : i12;
        return f1Var;
    }

    public void k(f1 f1Var) {
        if (f1Var.q) {
            ((ArrayList) this.d).remove(f1Var);
        } else {
            ((ArrayList) this.c).remove(f1Var);
        }
        f1Var.p = null;
        f1Var.q = false;
        f1Var.l &= -33;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.e;
        p0 p0Var = ((RecyclerView) this.h).y;
        this.b = this.a + (p0Var != null ? p0Var.i : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            f(size);
        }
    }

    public x0(RecyclerView recyclerView) {
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
