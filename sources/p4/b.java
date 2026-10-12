package p4;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class b extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ e c;

    public b(e eVar) {
        this.c = eVar;
    }

    public static void a(u uVar, int i10, Object obj, int i11) {
        y yVar = uVar.a;
        t tVar = uVar.b;
        int i12 = 65280 & i10;
        if (i12 != 256) {
            if (i12 != 512) {
                if (i12 == 768 && i10 == 769) {
                    tVar.l((a0) obj);
                }
                return;
            }
            switch (i10) {
                case 513:
                    tVar.a();
                    break;
                case 514:
                    tVar.c();
                    break;
                case 515:
                    tVar.b();
                    break;
            }
        }
        w wVar = (i10 == 264 || i10 == 262) ? (w) ((q0.b) obj).b : (w) obj;
        w wVar2 = (i10 == 264 || i10 == 262) ? (w) ((q0.b) obj).a : null;
        if (wVar != null) {
            boolean z10 = true;
            if ((uVar.d & 2) == 0 && !wVar.h(uVar.c)) {
                a0 a0Var = y.c().u;
                z10 = ((a0Var == null ? false : a0Var.d) && wVar.d() && i10 == 262 && i11 == 3 && wVar2 != null) ? true ^ wVar2.d() : false;
            }
            if (z10) {
                switch (i10) {
                    case 257:
                        tVar.d(wVar);
                        break;
                    case 258:
                        tVar.f(wVar);
                        break;
                    case 259:
                        tVar.e(wVar);
                        break;
                    case 260:
                        tVar.k(wVar);
                        break;
                    case 261:
                        tVar.getClass();
                        break;
                    case 262:
                        tVar.h(yVar, wVar, i11);
                        break;
                    case 263:
                        tVar.j(yVar, wVar, i11);
                        break;
                    case 264:
                        tVar.h(yVar, wVar, i11);
                        break;
                }
            }
        }
    }

    public final void b(int i10, Object obj) {
        obtainMessage(i10, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int q6;
        ArrayList arrayList = this.a;
        e eVar = this.c;
        ArrayList arrayList2 = eVar.i;
        k0 k0Var = eVar.s;
        int i10 = message.what;
        Object obj = message.obj;
        int i11 = message.arg1;
        if (i10 == 259 && eVar.e().c.equals(((w) obj).c)) {
            eVar.o(true);
        }
        int i12 = 0;
        ArrayList arrayList3 = this.b;
        if (i10 == 262) {
            w wVar = (w) ((q0.b) obj).b;
            k0Var.x(wVar);
            if (eVar.v != null && wVar.d()) {
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj2 = arrayList3.get(i13);
                    i13++;
                    k0Var.w((w) obj2);
                }
                arrayList3.clear();
            }
        } else if (i10 != 264) {
            switch (i10) {
                case 257:
                    k0Var.v((w) obj);
                    break;
                case 258:
                    k0Var.w((w) obj);
                    break;
                case 259:
                    w wVar2 = (w) obj;
                    k0Var.getClass();
                    if (wVar2.c() != k0Var && (q6 = k0Var.q(wVar2)) >= 0) {
                        k0Var.C((j0) k0Var.H.get(q6));
                        break;
                    }
                    break;
            }
        } else {
            w wVar3 = (w) ((q0.b) obj).b;
            arrayList3.add(wVar3);
            k0Var.v(wVar3);
            k0Var.x(wVar3);
        }
        try {
            int size2 = arrayList2.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    int size3 = arrayList.size();
                    while (i12 < size3) {
                        Object obj3 = arrayList.get(i12);
                        i12++;
                        a((u) obj3, i10, obj, i11);
                    }
                    arrayList.clear();
                    return;
                }
                y yVar = (y) ((WeakReference) arrayList2.get(size2)).get();
                if (yVar == null) {
                    arrayList2.remove(size2);
                } else {
                    arrayList.addAll(yVar.b);
                }
            }
        } catch (Throwable th2) {
            arrayList.clear();
            throw th2;
        }
    }
}
