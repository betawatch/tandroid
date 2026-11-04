package tf;

import android.net.Uri;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import b8.ig;
import g2.g;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import k2.p1;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.nh;
import r0.i0;
import u4.a1;
import u4.d1;
import u4.h0;
import u4.m0;
import u4.o0;
import u4.p0;
import u4.u0;
import u4.v0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        if (d1Var.e(TLObject.FLAG_14)) {
            d1Var.p(0, TLObject.FLAG_14);
            i0.j(d1Var.a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            h0 h0Var = recyclerView.x;
            if (h0Var != null) {
                h0Var.A(d1Var);
            }
            if (recyclerView.v0 != null) {
                recyclerView.f.W0(d1Var);
            }
        }
        d1Var.t = null;
        v0 c2 = c();
        c2.getClass();
        int i3 = d1Var.f;
        ArrayList arrayList = c2.b(i3).a;
        if (((u0) c2.a.get(i3)).b <= arrayList.size()) {
            return;
        }
        d1Var.o();
        arrayList.add(d1Var);
    }

    public int b(int i3) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i3 >= 0 && i3 < recyclerView.v0.b()) {
            return !recyclerView.v0.g ? i3 : recyclerView.d.f(i3, 0);
        }
        StringBuilder m10 = p1.m(i3, "invalid position ", ". State item count is ");
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
        v0 c2 = c();
        if (h0Var != null) {
            c2.b--;
        }
        if (c2.b == 0) {
            c2.a();
        }
        if (h0Var2 != null) {
            c2.b++;
        } else {
            c2.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.R0;
        g gVar = ((RecyclerView) this.h).u0;
        int[] iArr2 = gVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        gVar.c = 0;
    }

    public void f(int i3) {
        ArrayList arrayList = (ArrayList) this.e;
        a((d1) arrayList.get(i3), true);
        arrayList.remove(i3);
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
    public void h(d1 d1Var) {
        boolean z10;
        boolean z11;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        g gVar = recyclerView.u0;
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
                        int[] iArr = RecyclerView.R0;
                        if (size > 0) {
                            int i3 = d1Var.c;
                            if (gVar.d != null) {
                                int i10 = gVar.c * 2;
                                for (int i11 = 0; i11 < i10; i11 += 2) {
                                    if (gVar.d[i11] == i3) {
                                        break;
                                    }
                                }
                            }
                            int i12 = size - 1;
                            loop1: while (i12 >= 0) {
                                int i13 = ((d1) arrayList.get(i12)).c;
                                if (gVar.d == null) {
                                    break;
                                }
                                int i14 = gVar.c * 2;
                                for (int i15 = 0; i15 < i14; i15 += 2) {
                                    if (gVar.d[i15] == i13) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i12 + 1;
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
                recyclerView.f.W0(d1Var);
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
        recyclerView.f.W0(d1Var);
        if (r5) {
        }
    }

    public void i(View view) {
        m0 m0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        d1 U = RecyclerView.U(view);
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
    public d1 j(int i3, long j10) {
        int i10;
        int i11;
        d1 d1Var;
        r0.b bVar;
        long j11;
        long j12;
        boolean z10;
        int i12;
        int i13;
        ViewGroup.LayoutParams layoutParams;
        p0 p0Var;
        d1 d1Var2;
        char c2;
        View view;
        d1 d1Var3;
        int i14;
        int size;
        int f10;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        a1 a1Var = recyclerView.v0;
        if (i3 < 0 || i3 >= a1Var.b()) {
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m("Invalid item position ", i3, "(", i3, "). Item count:");
            m10.append(a1Var.b());
            m10.append(recyclerView.C());
            throw new IndexOutOfBoundsException(m10.toString());
        }
        if (a1Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i15 = 0;
                while (true) {
                    if (i15 < size) {
                        d1Var = (d1) ((ArrayList) this.d).get(i15);
                        if (!d1Var.s() && d1Var.c() == i3) {
                            d1Var.a(32);
                            i10 = 1;
                            break;
                        }
                        i15++;
                    } else if (recyclerView.x.b && (f10 = recyclerView.d.f(i3, 0)) > 0 && f10 < recyclerView.x.b()) {
                        long c10 = recyclerView.x.c(f10);
                        for (int i16 = 0; i16 < size; i16++) {
                            d1 d1Var4 = (d1) ((ArrayList) this.d).get(i16);
                            i10 = 1;
                            if (!d1Var4.s() && d1Var4.e == c10) {
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
                if (!d1Var3.s() && d1Var3.c() == i3 && !d1Var3.h() && (a1Var.g || !d1Var3.j())) {
                    d1Var3.a(32);
                    break;
                }
            }
            ArrayList arrayList4 = (ArrayList) recyclerView.e.c;
            int size3 = arrayList4.size();
            int i18 = 0;
            while (true) {
                if (i18 >= size3) {
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i18);
                d1 U = RecyclerView.U(view);
                if (U.c() == i3 && !U.h() && !U.j()) {
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
                    if (!d1Var3.h() && d1Var3.c() == i3 && !d1Var3.f()) {
                        arrayList2.remove(i19);
                        break;
                    }
                    i19++;
                }
            } else {
                d1 U2 = RecyclerView.U(view);
                p7.d dVar = recyclerView.e;
                ig igVar = (ig) dVar.d;
                int indexOfChild = ((RecyclerView) ((nh) dVar.b).b).indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!igVar.E(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                igVar.a(indexOfChild);
                dVar.H(view);
                p7.d dVar2 = recyclerView.e;
                ig igVar2 = (ig) dVar2.d;
                int indexOfChild2 = ((RecyclerView) ((nh) dVar2.b).b).indexOfChild(view);
                int y9 = (indexOfChild2 == -1 || igVar2.E(indexOfChild2)) ? -1 : indexOfChild2 - igVar2.y(indexOfChild2);
                if (y9 == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + U2 + recyclerView.C());
                }
                recyclerView.e.k(y9);
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
                        h0 h0Var = recyclerView.x;
                        if (!h0Var.b || d1Var3.e == h0Var.c(d1Var3.c)) {
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
            j11 = 3;
            int f11 = recyclerView.d.f(i3, 0);
            if (f11 < 0 || f11 >= recyclerView.x.b()) {
                StringBuilder m11 = com.google.android.recaptcha.internal.a.m("Inconsistency detected. Invalid item position ", i3, "(offset:", f11, ").state:");
                m11.append(a1Var.b());
                m11.append(recyclerView.C());
                throw new IndexOutOfBoundsException(m11.toString());
            }
            int d = recyclerView.x.d(f11);
            j12 = 4;
            h0 h0Var2 = recyclerView.x;
            if (h0Var2.b) {
                long c11 = h0Var2.c(f11);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        d1 d1Var5 = (d1) arrayList.get(size5);
                        long j13 = d1Var5.e;
                        View view2 = d1Var5.a;
                        if (j13 != c11 || d1Var5.s()) {
                            c2 = ' ';
                        } else if (d == d1Var5.f) {
                            d1Var5.a(32);
                            if (d1Var5.j() && !a1Var.g) {
                                d1Var5.p(2, 14);
                            }
                            d1Var = d1Var5;
                        } else {
                            c2 = ' ';
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
                            if (d1Var6.e != c11 || d1Var6.f()) {
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
                u0 u0Var = (u0) c().a.get(d);
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
                    int[] iArr = RecyclerView.R0;
                }
                d1Var = d1Var2;
            }
            if (d1Var == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j10 != Long.MAX_VALUE) {
                    long j14 = ((v0) this.g).b(d).c;
                    if (((j14 == 0 || j14 + nanoTime < j10) ? i10 : 0) == 0) {
                        return null;
                    }
                }
                bVar = null;
                d1Var = recyclerView.x.a(recyclerView, d);
                int[] iArr2 = RecyclerView.R0;
                RecyclerView J = RecyclerView.J(d1Var.a);
                if (J != null) {
                    d1Var.b = new WeakReference(J);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                u0 b10 = ((v0) this.g).b(d);
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
            j11 = 3;
            j12 = 4;
        }
        View view3 = d1Var.a;
        if (i11 != 0 && !a1Var.g && d1Var.e(TLObject.FLAG_13)) {
            d1Var.p(0, TLObject.FLAG_13);
            if (a1Var.j) {
                recyclerView.o0(d1Var, recyclerView.d0.l(a1Var, d1Var, m0.b(d1Var) | TLObject.FLAG_12, d1Var.d()));
            }
        }
        if (!a1Var.g || !d1Var.g()) {
            if (d1Var.g()) {
                if (((d1Var.l & 2) != 0 ? i10 : 0) == 0) {
                }
            }
            z10 = false;
            int f12 = recyclerView.d.f(i3, 0);
            d1Var.t = recyclerView;
            int i21 = d1Var.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j10 != Long.MAX_VALUE) {
                long j16 = ((v0) this.g).b(i21).d;
                if (j16 != 0 && j16 + nanoTime3 >= j10) {
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
                    p0Var.a = d1Var;
                    p0Var.d = (i11 != 0 || i13 == 0) ? z10 : i12;
                    return d1Var;
                }
            }
            h0 h0Var3 = recyclerView.x;
            h0Var3.getClass();
            d1Var.c = f12;
            if (h0Var3.b) {
                d1Var.e = h0Var3.c(f12);
            }
            d1Var.p(i10, 519);
            int i22 = n0.g.a;
            Trace.beginSection("RV OnBindView");
            h0Var3.v(d1Var, f12, d1Var.d());
            ArrayList arrayList6 = d1Var.m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            d1Var.l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof p0) {
                ((p0) layoutParams2).c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            u0 b11 = ((v0) this.g).b(d1Var.f);
            long j17 = b11.d;
            if (j17 != 0) {
                nanoTime4 = (nanoTime4 / j12) + ((j17 / j12) * j11);
            }
            b11.d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.P;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap = i0.a;
                i12 = 1;
                if (view3.getImportantForAccessibility() == 0) {
                    view3.setImportantForAccessibility(1);
                }
                View.AccessibilityDelegate d10 = i0.d(view3);
                r0.b bVar2 = d10 == null ? bVar : d10 instanceof r0.a ? ((r0.a) d10).a : new r0.b(d10);
                if (bVar2 == null || bVar2.getClass().equals(r0.b.class)) {
                    d1Var.a(TLObject.FLAG_14);
                    i0.j(view3, recyclerView.C0.e);
                }
            } else {
                i12 = 1;
            }
            if (a1Var.g) {
                d1Var.g = i3;
            }
            i13 = i12;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            p0Var.a = d1Var;
            p0Var.d = (i11 != 0 || i13 == 0) ? z10 : i12;
            return d1Var;
        }
        d1Var.g = i3;
        i12 = i10;
        i13 = 0;
        z10 = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        p0Var.a = d1Var;
        p0Var.d = (i11 != 0 || i13 == 0) ? z10 : i12;
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
        o0 o0Var = ((RecyclerView) this.h).y;
        this.b = this.a + (o0Var != null ? o0Var.i : 0);
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
