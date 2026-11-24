// default package

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tz4 extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ wz4 c;

    public tz4(wz4 wz4Var) {
        this.c = wz4Var;
    }

    public static void a(aw6 aw6Var, int i, Object obj, int i2) {
        gw6 gw6Var = aw6Var.a;
        zv6 zv6Var = aw6Var.b;
        int i3 = 65280 & i;
        if (i3 != 256) {
            if (i3 != 512) {
                if (i3 == 768 && i == 769) {
                    zv6Var.l((iw6) obj);
                }
                return;
            }
            switch (i) {
                case 513:
                    zv6Var.a();
                    break;
                case 514:
                    zv6Var.c();
                    break;
                case 515:
                    zv6Var.b();
                    break;
            }
        }
        ew6 ew6Var = (i == 264 || i == 262) ? (ew6) ((mw7) obj).b : (ew6) obj;
        ew6 ew6Var2 = (i == 264 || i == 262) ? (ew6) ((mw7) obj).a : null;
        if (ew6Var != null) {
            boolean z = true;
            if ((aw6Var.d & 2) == 0 && !ew6Var.h(aw6Var.c)) {
                iw6 iw6Var = gw6.c().u;
                z = ((iw6Var == null ? false : iw6Var.d) && ew6Var.d() && i == 262 && i2 == 3 && ew6Var2 != null) ? true ^ ew6Var2.d() : false;
            }
            if (z) {
                switch (i) {
                    case nm7.f4 /* 257 */:
                        zv6Var.d(ew6Var);
                        break;
                    case nm7.g4 /* 258 */:
                        zv6Var.f(ew6Var);
                        break;
                    case nm7.h4 /* 259 */:
                        zv6Var.e(ew6Var);
                        break;
                    case nm7.i4 /* 260 */:
                        zv6Var.k(ew6Var);
                        break;
                    case nm7.j4 /* 261 */:
                        zv6Var.getClass();
                        break;
                    case nm7.k4 /* 262 */:
                        zv6Var.h(gw6Var, ew6Var, i2);
                        break;
                    case nm7.l4 /* 263 */:
                        zv6Var.j(gw6Var, ew6Var, i2);
                        break;
                    case nm7.m4 /* 264 */:
                        zv6Var.h(gw6Var, ew6Var, i2);
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
        wz4 wz4Var = this.c;
        ArrayList arrayList2 = wz4Var.i;
        yd8 yd8Var = wz4Var.s;
        int i = message.what;
        Object obj = message.obj;
        int i2 = message.arg1;
        if (i == 259 && wz4Var.e().c.equals(((ew6) obj).c)) {
            wz4Var.o(true);
        }
        int i3 = 0;
        ArrayList arrayList3 = this.b;
        if (i == 262) {
            ew6 ew6Var = (ew6) ((mw7) obj).b;
            yd8Var.x(ew6Var);
            if (wz4Var.v != null && ew6Var.d()) {
                int size = arrayList3.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList3.get(i4);
                    i4++;
                    yd8Var.w((ew6) obj2);
                }
                arrayList3.clear();
            }
        } else if (i != 264) {
            switch (i) {
                case nm7.f4 /* 257 */:
                    yd8Var.v((ew6) obj);
                    break;
                case nm7.g4 /* 258 */:
                    yd8Var.w((ew6) obj);
                    break;
                case nm7.h4 /* 259 */:
                    ew6 ew6Var2 = (ew6) obj;
                    yd8Var.getClass();
                    if (ew6Var2.c() != yd8Var && (q = yd8Var.q(ew6Var2)) >= 0) {
                        yd8Var.C((xd8) yd8Var.I.get(q));
                        break;
                    }
                    break;
            }
        } else {
            ew6 ew6Var3 = (ew6) ((mw7) obj).b;
            arrayList3.add(ew6Var3);
            yd8Var.v(ew6Var3);
            yd8Var.x(ew6Var3);
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
                        a((aw6) obj3, i, obj, i2);
                    }
                    return;
                }
                gw6 gw6Var = (gw6) ((WeakReference) arrayList2.get(size2)).get();
                if (gw6Var == null) {
                    arrayList2.remove(size2);
                } else {
                    arrayList.addAll(gw6Var.b);
                }
            }
        } finally {
            arrayList.clear();
        }
    }
}
