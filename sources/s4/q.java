package s4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class q implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final fb.i f = new fb.i(5);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static c1 c(RecyclerView recyclerView, int i10, long j3) {
        int K = recyclerView.e.K();
        for (int i11 = 0; i11 < K; i11++) {
            c1 U = RecyclerView.U(recyclerView.e.J(i11));
            if (U.c == i10 && !U.h()) {
                return null;
            }
        }
        of.e eVar = recyclerView.b;
        try {
            try {
                recyclerView.g0();
                c1 j10 = eVar.j(i10, j3);
                if (j10 != null) {
                    if (!j10.g() || j10.h()) {
                        eVar.a(j10, false);
                    } else {
                        eVar.g(j10.a);
                    }
                }
                recyclerView.h0(false);
                return j10;
            } catch (Exception e7) {
                FileLog.e(e7);
                AndroidUtilities.runOnUIThread(new qg.q0(recyclerView, 8));
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
        a0.h hVar = recyclerView.s0;
        hVar.a = i10;
        hVar.b = i11;
    }

    public final void b(long j3) {
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
            a0.h hVar = recyclerView3.s0;
            if (windowVisibility == 0) {
                hVar.c(recyclerView3, false);
                i10 += hVar.d;
            }
        }
        arrayList.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                a0.h hVar2 = recyclerView4.s0;
                int abs = Math.abs(hVar2.b) + Math.abs(hVar2.a);
                for (int i14 = 0; i14 < hVar2.d * 2; i14 += 2) {
                    if (i12 >= arrayList.size()) {
                        pVar2 = new p();
                        arrayList.add(pVar2);
                    } else {
                        pVar2 = (p) arrayList.get(i12);
                    }
                    int[] iArr = (int[]) hVar2.c;
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
            c1 c10 = c(recyclerView, pVar.e, pVar.a ? Long.MAX_VALUE : j3);
            if (c10 != null && c10.b != null && c10.g() && !c10.h() && (recyclerView2 = (RecyclerView) c10.b.get()) != null) {
                if (recyclerView2.Q && recyclerView2.e.K() != 0) {
                    recyclerView2.o0();
                }
                a0.h hVar3 = recyclerView2.s0;
                hVar3.c(recyclerView2, true);
                if (hVar3.d != 0) {
                    try {
                        int i17 = n0.g.a;
                        Trace.beginSection("RV Nested Prefetch");
                        z0 z0Var = recyclerView2.t0;
                        h0 h0Var = recyclerView2.w;
                        z0Var.d = 1;
                        z0Var.e = h0Var.h();
                        z0Var.g = false;
                        z0Var.h = false;
                        z0Var.i = false;
                        for (int i18 = 0; i18 < hVar3.d * 2; i18 += 2) {
                            c(recyclerView2, ((int[]) hVar3.c)[i18], j3);
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
                long j3 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
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
            int i12 = n0.g.a;
            Trace.endSection();
            throw th2;
        }
    }
}
