package p4;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class b extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ e c;

    public b(e eVar) {
        this.c = eVar;
    }

    public static void a(t tVar, int i10, Object obj, int i11) {
        x xVar = tVar.a;
        s sVar = tVar.b;
        int i12 = 65280 & i10;
        if (i12 != 256) {
            if (i12 != 512) {
                if (i12 == 768 && i10 == 769) {
                    sVar.l((z) obj);
                }
                return;
            }
            switch (i10) {
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
        v vVar = (i10 == 264 || i10 == 262) ? (v) ((q0.b) obj).b : (v) obj;
        v vVar2 = (i10 == 264 || i10 == 262) ? (v) ((q0.b) obj).a : null;
        if (vVar != null) {
            boolean z10 = true;
            if ((tVar.d & 2) == 0 && !vVar.h(tVar.c)) {
                z zVar = x.c().u;
                z10 = ((zVar == null ? false : zVar.d) && vVar.d() && i10 == 262 && i11 == 3 && vVar2 != null) ? true ^ vVar2.d() : false;
            }
            if (z10) {
                switch (i10) {
                    case 257:
                        sVar.d(vVar);
                        break;
                    case 258:
                        sVar.f(vVar);
                        break;
                    case 259:
                        sVar.e(vVar);
                        break;
                    case 260:
                        sVar.k(vVar);
                        break;
                    case 261:
                        sVar.getClass();
                        break;
                    case 262:
                        sVar.h(xVar, vVar, i11);
                        break;
                    case 263:
                        sVar.j(xVar, vVar, i11);
                        break;
                    case 264:
                        sVar.h(xVar, vVar, i11);
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
        j0 j0Var = eVar.s;
        int i10 = message.what;
        Object obj = message.obj;
        int i11 = message.arg1;
        if (i10 == 259 && eVar.e().c.equals(((v) obj).c)) {
            eVar.o(true);
        }
        int i12 = 0;
        ArrayList arrayList3 = this.b;
        if (i10 == 262) {
            v vVar = (v) ((q0.b) obj).b;
            j0Var.x(vVar);
            if (eVar.v != null && vVar.d()) {
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj2 = arrayList3.get(i13);
                    i13++;
                    j0Var.w((v) obj2);
                }
                arrayList3.clear();
            }
        } else if (i10 != 264) {
            switch (i10) {
                case 257:
                    j0Var.v((v) obj);
                    break;
                case 258:
                    j0Var.w((v) obj);
                    break;
                case 259:
                    v vVar2 = (v) obj;
                    j0Var.getClass();
                    if (vVar2.c() != j0Var && (q6 = j0Var.q(vVar2)) >= 0) {
                        j0Var.C((i0) j0Var.H.get(q6));
                        break;
                    }
                    break;
            }
        } else {
            v vVar3 = (v) ((q0.b) obj).b;
            arrayList3.add(vVar3);
            j0Var.v(vVar3);
            j0Var.x(vVar3);
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
                        a((t) obj3, i10, obj, i11);
                    }
                    arrayList.clear();
                    return;
                }
                x xVar = (x) ((WeakReference) arrayList2.get(size2)).get();
                if (xVar == null) {
                    arrayList2.remove(size2);
                } else {
                    arrayList.addAll(xVar.b);
                }
            }
        } catch (Throwable th2) {
            arrayList.clear();
            throw th2;
        }
    }
}
