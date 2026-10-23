package s4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.web.a2;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class q implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final gb.i f = new gb.i(5);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static b1 c(RecyclerView recyclerView, int i10, long j10) {
        int L = recyclerView.e.L();
        for (int i11 = 0; i11 < L; i11++) {
            b1 U = RecyclerView.U(recyclerView.e.K(i11));
            if (U.c == i10 && !U.h()) {
                return null;
            }
        }
        qf.e eVar = recyclerView.b;
        try {
            try {
                recyclerView.g0();
                b1 j11 = eVar.j(i10, j10);
                if (j11 != null) {
                    if (!j11.g() || j11.h()) {
                        eVar.a(j11, false);
                    } else {
                        eVar.g(j11.a);
                    }
                }
                recyclerView.h0(false);
                return j11;
            } catch (Exception e7) {
                FileLog.e(e7);
                AndroidUtilities.runOnUIThread(new a2(recyclerView, 20));
                recyclerView.h0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.h0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.G && this.b == 0) {
            this.b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        e2.f fVar = recyclerView.t0;
        fVar.a = i10;
        fVar.b = i11;
    }

    public final void b(long j10) {
        p pVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        p pVar2;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i11);
            int windowVisibility = recyclerView3.getWindowVisibility();
            e2.f fVar = recyclerView3.t0;
            if (windowVisibility == 0) {
                fVar.c(recyclerView3, false);
                i10 += fVar.d;
            }
        }
        arrayList.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                e2.f fVar2 = recyclerView4.t0;
                int abs = Math.abs(fVar2.b) + Math.abs(fVar2.a);
                for (int i14 = 0; i14 < fVar2.d * 2; i14 += 2) {
                    if (i12 >= arrayList.size()) {
                        pVar2 = new p();
                        arrayList.add(pVar2);
                    } else {
                        pVar2 = (p) arrayList.get(i12);
                    }
                    int[] iArr = (int[]) fVar2.c;
                    int i15 = iArr[i14 + 1];
                    pVar2.a = i15 <= abs;
                    pVar2.b = abs;
                    pVar2.c = i15;
                    pVar2.d = recyclerView4;
                    pVar2.e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList, f);
        for (int i16 = 0; i16 < arrayList.size() && (recyclerView = (pVar = (p) arrayList.get(i16)).d) != null; i16++) {
            b1 c10 = c(recyclerView, pVar.e, pVar.a ? Long.MAX_VALUE : j10);
            if (c10 != null && c10.b != null && c10.g() && !c10.h() && (recyclerView2 = (RecyclerView) c10.b.get()) != null) {
                if (recyclerView2.Q && recyclerView2.e.L() != 0) {
                    recyclerView2.o0();
                }
                e2.f fVar3 = recyclerView2.t0;
                fVar3.c(recyclerView2, true);
                if (fVar3.d != 0) {
                    try {
                        int i17 = n0.g.a;
                        Trace.beginSection("RV Nested Prefetch");
                        y0 y0Var = recyclerView2.u0;
                        g0 g0Var = recyclerView2.w;
                        y0Var.d = 1;
                        y0Var.e = g0Var.h();
                        y0Var.g = false;
                        y0Var.h = false;
                        y0Var.i = false;
                        for (int i18 = 0; i18 < fVar3.d * 2; i18 += 2) {
                            c(recyclerView2, ((int[]) fVar3.c)[i18], j10);
                        }
                        Trace.endSection();
                        pVar.a = false;
                        pVar.b = 0;
                        pVar.c = 0;
                        pVar.d = null;
                        pVar.e = 0;
                    } catch (Throwable th2) {
                        int i19 = n0.g.a;
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
            int i10 = n0.g.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
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
            int i12 = n0.g.a;
            Trace.endSection();
            throw th2;
        }
    }
}
