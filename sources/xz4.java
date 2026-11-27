// default package

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class xz4 extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ a05 c;

    public xz4(a05 a05Var) {
        this.c = a05Var;
    }

    public static void a(fw6 fw6Var, int i, Object obj, int i2) {
        lw6 lw6Var = fw6Var.a;
        ew6 ew6Var = fw6Var.b;
        int i3 = 65280 & i;
        if (i3 != 256) {
            if (i3 != 512) {
                if (i3 == 768 && i == 769) {
                    ew6Var.l((nw6) obj);
                }
                return;
            }
            switch (i) {
                case 513:
                    ew6Var.a();
                    break;
                case 514:
                    ew6Var.c();
                    break;
                case 515:
                    ew6Var.b();
                    break;
            }
        }
        jw6 jw6Var = (i == 264 || i == 262) ? (jw6) ((sx7) obj).b : (jw6) obj;
        jw6 jw6Var2 = (i == 264 || i == 262) ? (jw6) ((sx7) obj).a : null;
        if (jw6Var != null) {
            boolean z = true;
            if ((fw6Var.d & 2) == 0 && !jw6Var.h(fw6Var.c)) {
                nw6 nw6Var = lw6.c().u;
                z = ((nw6Var == null ? false : nw6Var.d) && jw6Var.d() && i == 262 && i2 == 3 && jw6Var2 != null) ? true ^ jw6Var2.d() : false;
            }
            if (z) {
                switch (i) {
                    case jn7.f4 /* 257 */:
                        ew6Var.d(jw6Var);
                        break;
                    case jn7.g4 /* 258 */:
                        ew6Var.f(jw6Var);
                        break;
                    case jn7.h4 /* 259 */:
                        ew6Var.e(jw6Var);
                        break;
                    case jn7.i4 /* 260 */:
                        ew6Var.k(jw6Var);
                        break;
                    case jn7.j4 /* 261 */:
                        ew6Var.getClass();
                        break;
                    case jn7.k4 /* 262 */:
                        ew6Var.h(lw6Var, jw6Var, i2);
                        break;
                    case jn7.l4 /* 263 */:
                        ew6Var.j(lw6Var, jw6Var, i2);
                        break;
                    case jn7.m4 /* 264 */:
                        ew6Var.h(lw6Var, jw6Var, i2);
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
        a05 a05Var = this.c;
        ArrayList arrayList2 = a05Var.i;
        kf8 kf8Var = a05Var.s;
        int i = message.what;
        Object obj = message.obj;
        int i2 = message.arg1;
        if (i == 259 && a05Var.e().c.equals(((jw6) obj).c)) {
            a05Var.o(true);
        }
        int i3 = 0;
        ArrayList arrayList3 = this.b;
        if (i == 262) {
            jw6 jw6Var = (jw6) ((sx7) obj).b;
            kf8Var.x(jw6Var);
            if (a05Var.v != null && jw6Var.d()) {
                int size = arrayList3.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList3.get(i4);
                    i4++;
                    kf8Var.w((jw6) obj2);
                }
                arrayList3.clear();
            }
        } else if (i != 264) {
            switch (i) {
                case jn7.f4 /* 257 */:
                    kf8Var.v((jw6) obj);
                    break;
                case jn7.g4 /* 258 */:
                    kf8Var.w((jw6) obj);
                    break;
                case jn7.h4 /* 259 */:
                    jw6 jw6Var2 = (jw6) obj;
                    kf8Var.getClass();
                    if (jw6Var2.c() != kf8Var && (q = kf8Var.q(jw6Var2)) >= 0) {
                        kf8Var.C((jf8) kf8Var.I.get(q));
                        break;
                    }
                    break;
            }
        } else {
            jw6 jw6Var3 = (jw6) ((sx7) obj).b;
            arrayList3.add(jw6Var3);
            kf8Var.v(jw6Var3);
            kf8Var.x(jw6Var3);
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
                        a((fw6) obj3, i, obj, i2);
                    }
                    return;
                }
                lw6 lw6Var = (lw6) ((WeakReference) arrayList2.get(size2)).get();
                if (lw6Var == null) {
                    arrayList2.remove(size2);
                } else {
                    arrayList.addAll(lw6Var.b);
                }
            }
        } finally {
            arrayList.clear();
        }
    }
}
