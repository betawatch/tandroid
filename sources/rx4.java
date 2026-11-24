// default package

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rx4 extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ ux4 c;

    public rx4(ux4 ux4Var) {
        this.c = ux4Var;
    }

    public static void a(au6 au6Var, int i, Object obj, int i2) {
        gu6 gu6Var = au6Var.a;
        zt6 zt6Var = au6Var.b;
        int i3 = 65280 & i;
        if (i3 != 256) {
            if (i3 != 512) {
                if (i3 == 768 && i == 769) {
                    zt6Var.l((iu6) obj);
                }
                return;
            }
            switch (i) {
                case 513:
                    zt6Var.a();
                    break;
                case 514:
                    zt6Var.c();
                    break;
                case 515:
                    zt6Var.b();
                    break;
            }
        }
        eu6 eu6Var = (i == 264 || i == 262) ? (eu6) ((lu7) obj).b : (eu6) obj;
        eu6 eu6Var2 = (i == 264 || i == 262) ? (eu6) ((lu7) obj).a : null;
        if (eu6Var != null) {
            boolean z = true;
            if ((au6Var.d & 2) == 0 && !eu6Var.h(au6Var.c)) {
                iu6 iu6Var = gu6.c().u;
                z = ((iu6Var == null ? false : iu6Var.d) && eu6Var.d() && i == 262 && i2 == 3 && eu6Var2 != null) ? true ^ eu6Var2.d() : false;
            }
            if (z) {
                switch (i) {
                    case kk7.f4 /* 257 */:
                        zt6Var.d(eu6Var);
                        break;
                    case kk7.g4 /* 258 */:
                        zt6Var.f(eu6Var);
                        break;
                    case kk7.h4 /* 259 */:
                        zt6Var.e(eu6Var);
                        break;
                    case kk7.i4 /* 260 */:
                        zt6Var.k(eu6Var);
                        break;
                    case kk7.j4 /* 261 */:
                        zt6Var.getClass();
                        break;
                    case kk7.k4 /* 262 */:
                        zt6Var.h(gu6Var, eu6Var, i2);
                        break;
                    case kk7.l4 /* 263 */:
                        zt6Var.j(gu6Var, eu6Var, i2);
                        break;
                    case kk7.m4 /* 264 */:
                        zt6Var.h(gu6Var, eu6Var, i2);
                        break;
                }
            }
        }
    }

    public final void b(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int q;
        ArrayList arrayList = this.a;
        ux4 ux4Var = this.c;
        ArrayList arrayList2 = ux4Var.i;
        vb8 vb8Var = ux4Var.s;
        int i = message.what;
        Object obj = message.obj;
        int i2 = message.arg1;
        if (i == 259 && ux4Var.e().c.equals(((eu6) obj).c)) {
            ux4Var.o(true);
        }
        int i3 = 0;
        ArrayList arrayList3 = this.b;
        if (i == 262) {
            eu6 eu6Var = (eu6) ((lu7) obj).b;
            vb8Var.x(eu6Var);
            if (ux4Var.v != null && eu6Var.d()) {
                int size = arrayList3.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList3.get(i4);
                    i4++;
                    vb8Var.w((eu6) obj2);
                }
                arrayList3.clear();
            }
        } else if (i != 264) {
            switch (i) {
                case kk7.f4 /* 257 */:
                    vb8Var.v((eu6) obj);
                    break;
                case kk7.g4 /* 258 */:
                    vb8Var.w((eu6) obj);
                    break;
                case kk7.h4 /* 259 */:
                    eu6 eu6Var2 = (eu6) obj;
                    vb8Var.getClass();
                    if (eu6Var2.c() != vb8Var && (q = vb8Var.q(eu6Var2)) >= 0) {
                        vb8Var.C((ub8) vb8Var.I.get(q));
                        break;
                    }
                    break;
            }
        } else {
            eu6 eu6Var3 = (eu6) ((lu7) obj).b;
            arrayList3.add(eu6Var3);
            vb8Var.v(eu6Var3);
            vb8Var.x(eu6Var3);
        }
        try {
            int size2 = arrayList2.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    int size3 = arrayList.size();
                    while (i3 < size3) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        a((au6) obj3, i, obj, i2);
                    }
                    return;
                }
                gu6 gu6Var = (gu6) ((WeakReference) arrayList2.get(size2)).get();
                if (gu6Var == null) {
                    arrayList2.remove(size2);
                } else {
                    arrayList.addAll(gu6Var.b);
                }
            }
        } finally {
            arrayList.clear();
        }
    }
}
