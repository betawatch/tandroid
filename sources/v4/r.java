package v4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class r implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final c5.b f = new c5.b(9);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static f1 c(RecyclerView recyclerView, int i7, long j3) {
        int z10 = recyclerView.e.z();
        for (int i10 = 0; i10 < z10; i10++) {
            f1 U = RecyclerView.U(recyclerView.e.y(i10));
            if (U.c == i7 && !U.h()) {
                return null;
            }
        }
        x0 x0Var = recyclerView.b;
        try {
            try {
                recyclerView.h0();
                f1 j10 = x0Var.j(i7, j3);
                if (j10 != null) {
                    if (!j10.g() || j10.h()) {
                        x0Var.a(j10, false);
                    } else {
                        x0Var.g(j10.a);
                    }
                }
                recyclerView.i0(false);
                return j10;
            } catch (Exception e10) {
                a8.g(e10, true);
                org.telegram.messenger.g0.g3(new p(recyclerView, 0));
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
        q qVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        q qVar2;
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
                        qVar2 = new q();
                        arrayList.add(qVar2);
                    } else {
                        qVar2 = (q) arrayList.get(i11);
                    }
                    int[] iArr = fVar2.d;
                    int i14 = iArr[i13 + 1];
                    qVar2.a = i14 <= abs;
                    qVar2.b = abs;
                    qVar2.c = i14;
                    qVar2.d = recyclerView4;
                    qVar2.e = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(arrayList, f);
        for (int i15 = 0; i15 < arrayList.size() && (recyclerView = (qVar = (q) arrayList.get(i15)).d) != null; i15++) {
            f1 c10 = c(recyclerView, qVar.e, qVar.a ? Long.MAX_VALUE : j3);
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
                        c1 c1Var = recyclerView2.v0;
                        i0 i0Var = recyclerView2.x;
                        c1Var.d = 1;
                        c1Var.e = i0Var.b();
                        c1Var.g = false;
                        c1Var.h = false;
                        c1Var.i = false;
                        for (int i17 = 0; i17 < fVar3.c * 2; i17 += 2) {
                            c(recyclerView2, fVar3.d[i17], j3);
                        }
                        Trace.endSection();
                        qVar.a = false;
                        qVar.b = 0;
                        qVar.c = 0;
                        qVar.d = null;
                        qVar.e = 0;
                    } catch (Throwable th2) {
                        int i18 = n0.g.a;
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
