package u4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final b5.b f = new b5.b(9);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static d1 c(RecyclerView recyclerView, int i3, long j10) {
        int u10 = recyclerView.e.u();
        for (int i10 = 0; i10 < u10; i10++) {
            d1 U = RecyclerView.U(recyclerView.e.t(i10));
            if (U.c == i3 && !U.h()) {
                return null;
            }
        }
        tf.e eVar = recyclerView.b;
        try {
            try {
                recyclerView.h0();
                d1 j11 = eVar.j(i3, j10);
                if (j11 != null) {
                    if (!j11.g() || j11.h()) {
                        eVar.a(j11, false);
                    } else {
                        eVar.g(j11.a);
                    }
                }
                recyclerView.i0(false);
                return j11;
            } catch (Exception e10) {
                a8.g(e10, true);
                org.telegram.messenger.g0.h3(new r4.u(recyclerView, 13));
                recyclerView.i0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.i0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i3, int i10) {
        if (recyclerView.H && this.b == 0) {
            this.b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        g2.g gVar = recyclerView.u0;
        gVar.a = i3;
        gVar.b = i10;
    }

    public final void b(long j10) {
        p pVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        p pVar2;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i10);
            int windowVisibility = recyclerView3.getWindowVisibility();
            g2.g gVar = recyclerView3.u0;
            if (windowVisibility == 0) {
                gVar.c(recyclerView3, false);
                i3 += gVar.c;
            }
        }
        arrayList.ensureCapacity(i3);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                g2.g gVar2 = recyclerView4.u0;
                int abs = Math.abs(gVar2.b) + Math.abs(gVar2.a);
                for (int i13 = 0; i13 < gVar2.c * 2; i13 += 2) {
                    if (i11 >= arrayList.size()) {
                        pVar2 = new p();
                        arrayList.add(pVar2);
                    } else {
                        pVar2 = (p) arrayList.get(i11);
                    }
                    int[] iArr = gVar2.d;
                    int i14 = iArr[i13 + 1];
                    pVar2.a = i14 <= abs;
                    pVar2.b = abs;
                    pVar2.c = i14;
                    pVar2.d = recyclerView4;
                    pVar2.e = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(arrayList, f);
        for (int i15 = 0; i15 < arrayList.size() && (recyclerView = (pVar = (p) arrayList.get(i15)).d) != null; i15++) {
            d1 c2 = c(recyclerView, pVar.e, pVar.a ? Long.MAX_VALUE : j10);
            if (c2 != null && c2.b != null && c2.g() && !c2.h() && (recyclerView2 = (RecyclerView) c2.b.get()) != null) {
                if (recyclerView2.R && recyclerView2.e.u() != 0) {
                    recyclerView2.p0();
                }
                g2.g gVar3 = recyclerView2.u0;
                gVar3.c(recyclerView2, true);
                if (gVar3.c != 0) {
                    try {
                        int i16 = n0.g.a;
                        Trace.beginSection("RV Nested Prefetch");
                        a1 a1Var = recyclerView2.v0;
                        h0 h0Var = recyclerView2.x;
                        a1Var.d = 1;
                        a1Var.e = h0Var.b();
                        a1Var.g = false;
                        a1Var.h = false;
                        a1Var.i = false;
                        for (int i17 = 0; i17 < gVar3.c * 2; i17 += 2) {
                            c(recyclerView2, gVar3.d[i17], j10);
                        }
                        Trace.endSection();
                        pVar.a = false;
                        pVar.b = 0;
                        pVar.c = 0;
                        pVar.d = null;
                        pVar.e = 0;
                    } catch (Throwable th2) {
                        int i18 = n0.g.a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            pVar.a = false;
            pVar.b = 0;
            pVar.c = 0;
            pVar.d = null;
            pVar.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        try {
            int i3 = n0.g.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j10) + this.c);
                }
            }
            this.b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.b = 0L;
            int i11 = n0.g.a;
            Trace.endSection();
            throw th2;
        }
    }
}
