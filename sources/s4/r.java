package s4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class r implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final a5.b f = new a5.b(7);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static e1 c(RecyclerView recyclerView, int i10, long j10) {
        int o10 = recyclerView.e.o();
        for (int i11 = 0; i11 < o10; i11++) {
            e1 U = RecyclerView.U(recyclerView.e.n(i11));
            if (U.c == i10 && !U.h()) {
                return null;
            }
        }
        rf.e eVar = recyclerView.b;
        try {
            try {
                recyclerView.h0();
                e1 j11 = eVar.j(i10, j10);
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
                FileLog.e(e10);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(recyclerView, 14));
                recyclerView.i0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.i0(false);
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
        q qVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        q qVar2;
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
                        qVar2 = new q();
                        arrayList.add(qVar2);
                    } else {
                        qVar2 = (q) arrayList.get(i12);
                    }
                    int[] iArr = (int[]) fVar2.c;
                    int i15 = iArr[i14 + 1];
                    qVar2.a = i15 <= abs;
                    qVar2.b = abs;
                    qVar2.c = i15;
                    qVar2.d = recyclerView4;
                    qVar2.e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList, f);
        for (int i16 = 0; i16 < arrayList.size() && (recyclerView = (qVar = (q) arrayList.get(i16)).d) != null; i16++) {
            e1 c10 = c(recyclerView, qVar.e, qVar.a ? Long.MAX_VALUE : j10);
            if (c10 != null && c10.b != null && c10.g() && !c10.h() && (recyclerView2 = (RecyclerView) c10.b.get()) != null) {
                if (recyclerView2.Q && recyclerView2.e.o() != 0) {
                    recyclerView2.p0();
                }
                e2.f fVar3 = recyclerView2.t0;
                fVar3.c(recyclerView2, true);
                if (fVar3.d != 0) {
                    try {
                        int i17 = n0.g.a;
                        Trace.beginSection("RV Nested Prefetch");
                        b1 b1Var = recyclerView2.u0;
                        h0 h0Var = recyclerView2.w;
                        b1Var.d = 1;
                        b1Var.e = h0Var.h();
                        b1Var.g = false;
                        b1Var.h = false;
                        b1Var.i = false;
                        for (int i18 = 0; i18 < fVar3.d * 2; i18 += 2) {
                            c(recyclerView2, ((int[]) fVar3.c)[i18], j10);
                        }
                        Trace.endSection();
                        qVar.a = false;
                        qVar.b = 0;
                        qVar.c = 0;
                        qVar.d = null;
                        qVar.e = 0;
                    } catch (Throwable th2) {
                        int i19 = n0.g.a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            qVar.a = false;
            qVar.b = 0;
            qVar.c = 0;
            qVar.d = null;
            qVar.e = 0;
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
