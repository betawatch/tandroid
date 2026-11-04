package r4;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ e c;

    public b(e eVar) {
        this.c = eVar;
    }

    public static void a(t tVar, int i3, Object obj, int i10) {
        y yVar = tVar.a;
        s sVar = tVar.b;
        int i11 = 65280 & i3;
        if (i11 != 256) {
            if (i11 != 512) {
                if (i11 == 768 && i3 == 769) {
                    sVar.l((a0) obj);
                }
                return;
            }
            switch (i3) {
                case 513:
                    sVar.a();
                    break;
                case 514:
                    sVar.c();
                    break;
                case 515:
                    sVar.b();
                    break;
            }
        }
        w wVar = (i3 == 264 || i3 == 262) ? (w) ((q0.b) obj).b : (w) obj;
        w wVar2 = (i3 == 264 || i3 == 262) ? (w) ((q0.b) obj).a : null;
        if (wVar != null) {
            boolean z10 = true;
            if ((tVar.d & 2) == 0 && !wVar.h(tVar.c)) {
                a0 a0Var = y.c().u;
                z10 = ((a0Var == null ? false : a0Var.d) && wVar.d() && i3 == 262 && i10 == 3 && wVar2 != null) ? true ^ wVar2.d() : false;
            }
            if (z10) {
                switch (i3) {
                    case hs.g4 /* 257 */:
                        sVar.d(wVar);
                        break;
                    case hs.h4 /* 258 */:
                        sVar.f(wVar);
                        break;
                    case hs.i4 /* 259 */:
                        sVar.e(wVar);
                        break;
                    case hs.j4 /* 260 */:
                        sVar.k(wVar);
                        break;
                    case hs.k4 /* 261 */:
                        sVar.getClass();
                        break;
                    case hs.l4 /* 262 */:
                        sVar.h(yVar, wVar, i10);
                        break;
                    case hs.m4 /* 263 */:
                        sVar.j(yVar, wVar, i10);
                        break;
                    case hs.n4 /* 264 */:
                        sVar.h(yVar, wVar, i10);
                        break;
                }
            }
        }
    }

    public final void b(int i3, Object obj) {
        obtainMessage(i3, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int q10;
        ArrayList arrayList = this.a;
        e eVar = this.c;
        ArrayList arrayList2 = eVar.i;
        k0 k0Var = eVar.s;
        int i3 = message.what;
        Object obj = message.obj;
        int i10 = message.arg1;
        if (i3 == 259 && eVar.e().c.equals(((w) obj).c)) {
            eVar.o(true);
        }
        int i11 = 0;
        ArrayList arrayList3 = this.b;
        if (i3 == 262) {
            w wVar = (w) ((q0.b) obj).b;
            k0Var.x(wVar);
            if (eVar.v != null && wVar.d()) {
                int size = arrayList3.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    k0Var.w((w) obj2);
                }
                arrayList3.clear();
            }
        } else if (i3 != 264) {
            switch (i3) {
                case hs.g4 /* 257 */:
                    k0Var.v((w) obj);
                    break;
                case hs.h4 /* 258 */:
                    k0Var.w((w) obj);
                    break;
                case hs.i4 /* 259 */:
                    w wVar2 = (w) obj;
                    k0Var.getClass();
                    if (wVar2.c() != k0Var && (q10 = k0Var.q(wVar2)) >= 0) {
                        k0Var.C((j0) k0Var.I.get(q10));
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
                    while (i11 < size3) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        a((t) obj3, i3, obj, i10);
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
