package s4;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class b extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ e c;

    public b(e eVar) {
        this.c = eVar;
    }

    public static void a(t tVar, int i7, Object obj, int i10) {
        x xVar = tVar.a;
        s sVar = tVar.b;
        int i11 = 65280 & i7;
        if (i11 != 256) {
            if (i11 != 512) {
                if (i11 == 768 && i7 == 769) {
                    sVar.l((z) obj);
                }
                return;
            }
            switch (i7) {
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
        v vVar = (i7 == 264 || i7 == 262) ? (v) ((q0.b) obj).b : (v) obj;
        v vVar2 = (i7 == 264 || i7 == 262) ? (v) ((q0.b) obj).a : null;
        if (vVar != null) {
            boolean z9 = true;
            if ((tVar.d & 2) == 0 && !vVar.h(tVar.c)) {
                z zVar = x.c().u;
                z9 = ((zVar == null ? false : zVar.d) && vVar.d() && i7 == 262 && i10 == 3 && vVar2 != null) ? true ^ vVar2.d() : false;
            }
            if (z9) {
                switch (i7) {
                    case qs.g4 /* 257 */:
                        sVar.d(vVar);
                        break;
                    case qs.h4 /* 258 */:
                        sVar.f(vVar);
                        break;
                    case qs.i4 /* 259 */:
                        sVar.e(vVar);
                        break;
                    case qs.j4 /* 260 */:
                        sVar.k(vVar);
                        break;
                    case qs.k4 /* 261 */:
                        sVar.getClass();
                        break;
                    case qs.l4 /* 262 */:
                        sVar.h(xVar, vVar, i10);
                        break;
                    case qs.m4 /* 263 */:
                        sVar.j(xVar, vVar, i10);
                        break;
                    case qs.n4 /* 264 */:
                        sVar.h(xVar, vVar, i10);
                        break;
                }
            }
        }
    }

    public final void b(int i7, Object obj) {
        obtainMessage(i7, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int q10;
        ArrayList arrayList = this.a;
        e eVar = this.c;
        ArrayList arrayList2 = eVar.i;
        j0 j0Var = eVar.s;
        int i7 = message.what;
        Object obj = message.obj;
        int i10 = message.arg1;
        if (i7 == 259 && eVar.e().c.equals(((v) obj).c)) {
            eVar.o(true);
        }
        int i11 = 0;
        ArrayList arrayList3 = this.b;
        if (i7 == 262) {
            v vVar = (v) ((q0.b) obj).b;
            j0Var.x(vVar);
            if (eVar.v != null && vVar.d()) {
                int size = arrayList3.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    j0Var.w((v) obj2);
                }
                arrayList3.clear();
            }
        } else if (i7 != 264) {
            switch (i7) {
                case qs.g4 /* 257 */:
                    j0Var.v((v) obj);
                    break;
                case qs.h4 /* 258 */:
                    j0Var.w((v) obj);
                    break;
                case qs.i4 /* 259 */:
                    v vVar2 = (v) obj;
                    j0Var.getClass();
                    if (vVar2.c() != j0Var && (q10 = j0Var.q(vVar2)) >= 0) {
                        j0Var.C((i0) j0Var.H.get(q10));
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
                    while (i11 < size3) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        a((t) obj3, i7, obj, i10);
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
