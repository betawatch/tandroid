package v4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class q implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final c5.b f = new c5.b(9);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static e1 c(RecyclerView recyclerView, int i7, long j3) {
        int z10 = recyclerView.e.z();
        for (int i10 = 0; i10 < z10; i10++) {
            e1 U = RecyclerView.U(recyclerView.e.y(i10));
            if (U.c == i7 && !U.h()) {
                return null;
            }
        }
        w0 w0Var = recyclerView.b;
        try {
            try {
                recyclerView.h0();
                e1 j10 = w0Var.j(i7, j3);
                if (j10 != null) {
                    if (!j10.g() || j10.h()) {
                        w0Var.a(j10, false);
                    } else {
                        w0Var.g(j10.a);
                    }
                }
                recyclerView.i0(false);
                return j10;
            } catch (Exception e10) {
                a8.g(e10, true);
                org.telegram.messenger.g0.h3(new q2.d(recyclerView, 27));
                recyclerView.i0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.i0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i7, int i10) {
        if (recyclerView.H && this.b == 0) {
            this.b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        h2.f fVar = recyclerView.u0;
        fVar.a = i7;
        fVar.b = i10;
    }

    public final void b(long j3) {
        p pVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        p pVar2;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i10);
            int windowVisibility = recyclerView3.getWindowVisibility();
            h2.f fVar = recyclerView3.u0;
            if (windowVisibility == 0) {
                fVar.c(recyclerView3, false);
                i7 += fVar.c;
            }
        }
        arrayList.ensureCapacity(i7);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                h2.f fVar2 = recyclerView4.u0;
                int abs = Math.abs(fVar2.b) + Math.abs(fVar2.a);
                for (int i13 = 0; i13 < fVar2.c * 2; i13 += 2) {
                    if (i11 >= arrayList.size()) {
                        pVar2 = new p();
                        arrayList.add(pVar2);
                    } else {
                        pVar2 = (p) arrayList.get(i11);
                    }
                    int[] iArr = fVar2.d;
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
            e1 c10 = c(recyclerView, pVar.e, pVar.a ? Long.MAX_VALUE : j3);
            if (c10 != null && c10.b != null && c10.g() && !c10.h() && (recyclerView2 = (RecyclerView) c10.b.get()) != null) {
                if (recyclerView2.R && recyclerView2.e.z() != 0) {
                    recyclerView2.p0();
                }
                h2.f fVar3 = recyclerView2.u0;
                fVar3.c(recyclerView2, true);
                if (fVar3.c != 0) {
                    try {
                        int i16 = n0.g.a;
                        Trace.beginSection("RV Nested Prefetch");
                        b1 b1Var = recyclerView2.v0;
                        h0 h0Var = recyclerView2.x;
                        b1Var.d = 1;
                        b1Var.e = h0Var.b();
                        b1Var.g = false;
                        b1Var.h = false;
                        b1Var.i = false;
                        for (int i17 = 0; i17 < fVar3.c * 2; i17 += 2) {
                            c(recyclerView2, fVar3.d[i17], j3);
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
            int i7 = n0.g.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j3 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j3 = Math.max(recyclerView.getDrawingTime(), j3);
                    }
                }
                if (j3 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j3) + this.c);
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
