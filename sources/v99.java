// default package

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class v99 {
    public static final he6 k = new he6("RemoteMediaClient", null);
    public final rdd c;
    public final ko9 d;
    public final bu6 e;
    public rjd f;
    public TaskCompletionSource g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final Object a = new Object();
    public final b99 b = new b99(Looper.getMainLooper(), (byte) 3);

    static {
        String str = rdd.v;
    }

    public v99(rdd rddVar) {
        ko9 ko9Var = new ko9(this);
        this.d = ko9Var;
        this.c = rddVar;
        rddVar.h = new j09((Object) this, (byte) 29);
        rddVar.c = ko9Var;
        this.e = new bu6(this);
    }

    public static e2b t() {
        e2b e2bVar = new e2b(null, (byte) 1);
        e2bVar.a(new ohd(new Status(17, null, null, null), (byte) 0));
        return e2bVar;
    }

    public static final void x(fid fidVar) {
        try {
            fidVar.p();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            fidVar.a(new ohd(new Status(2100, null, null, null), (byte) 1));
        }
    }

    public final long a() {
        long o;
        synchronized (this.a) {
            xve.e("Must be called from the main thread.");
            o = this.c.o();
        }
        return o;
    }

    public final int b() {
        int i;
        synchronized (this.a) {
            xve.e("Must be called from the main thread.");
            j07 e = e();
            i = e != null ? e.f : 0;
        }
        return i;
    }

    public final eu6 c() {
        xve.e("Must be called from the main thread.");
        j07 e = e();
        if (e == null) {
            return null;
        }
        Integer num = (Integer) e.O.get(e.x);
        if (num == null) {
            return null;
        }
        return (eu6) e.H.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.a) {
            xve.e("Must be called from the main thread.");
            j07 j07Var = this.c.f;
            mediaInfo = j07Var == null ? null : j07Var.a;
        }
        return mediaInfo;
    }

    public final j07 e() {
        j07 j07Var;
        synchronized (this.a) {
            xve.e("Must be called from the main thread.");
            j07Var = this.c.f;
        }
        return j07Var;
    }

    public final int f() {
        int i;
        synchronized (this.a) {
            xve.e("Must be called from the main thread.");
            j07 e = e();
            i = e != null ? e.e : 1;
        }
        return i;
    }

    public final long g() {
        long j;
        synchronized (this.a) {
            xve.e("Must be called from the main thread.");
            j07 j07Var = this.c.f;
            MediaInfo mediaInfo = j07Var == null ? null : j07Var.a;
            j = mediaInfo != null ? mediaInfo.e : 0L;
        }
        return j;
    }

    public final boolean h() {
        xve.e("Must be called from the main thread.");
        if (i()) {
            return true;
        }
        xve.e("Must be called from the main thread.");
        j07 e = e();
        return (e != null && e.e == 5) || m() || l() || k();
    }

    public final boolean i() {
        xve.e("Must be called from the main thread.");
        j07 e = e();
        return e != null && e.e == 4;
    }

    public final boolean j() {
        xve.e("Must be called from the main thread.");
        MediaInfo d = d();
        return d != null && d.b == 2;
    }

    public final boolean k() {
        xve.e("Must be called from the main thread.");
        j07 e = e();
        return (e == null || e.x == 0) ? false : true;
    }

    public final boolean l() {
        xve.e("Must be called from the main thread.");
        j07 e = e();
        if (e == null) {
            return false;
        }
        if (e.e != 3) {
            return j() && b() == 2;
        }
        return true;
    }

    public final boolean m() {
        xve.e("Must be called from the main thread.");
        j07 e = e();
        return e != null && e.e == 2;
    }

    public final boolean n() {
        xve.e("Must be called from the main thread.");
        j07 e = e();
        return e != null && e.I;
    }

    public final void o(String str) {
        char c;
        int i;
        j07 j07Var;
        int[] j;
        rdd rddVar = this.c;
        ned nedVar = rddVar.o;
        ned nedVar2 = rddVar.n;
        ned nedVar3 = rddVar.j;
        List list = rddVar.d;
        he6 he6Var = rddVar.a;
        he6Var.b("message received: %s", str);
        String str2 = he6Var.a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(TeXSymbolParser.TYPE_ATTR);
            long optLong = jSONObject.optLong("requestId", -1L);
            c = 1;
            try {
                switch (string.hashCode()) {
                    case -1830647528:
                        if (string.equals("LOAD_CANCELLED")) {
                            nedVar3.b(optLong, 2101, rdd.c(jSONObject));
                            return;
                        }
                        return;
                    case -1790231854:
                        if (string.equals("QUEUE_ITEMS")) {
                            rddVar.s.b(optLong, 0, null);
                            rddVar.e("QUEUE_ITEMS", jSONObject);
                            if (rddVar.h != null) {
                                JSONArray jSONArray = jSONObject.getJSONArray("items");
                                eu6[] eu6VarArr = new eu6[jSONArray.length()];
                                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                    eu6VarArr[i2] = new kj4(jSONArray.getJSONObject(i2)).v();
                                }
                                Iterator it = ((v99) rddVar.h.b).i.iterator();
                                while (it.hasNext()) {
                                    ((u99) it.next()).k(eu6VarArr);
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case -1125000185:
                        if (string.equals("INVALID_REQUEST")) {
                            Log.w(str2, he6Var.d("received unexpected error: Invalid Request.", new Object[0]));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                ((ned) it2.next()).b(optLong, 2001, rdd.c(jSONObject));
                            }
                            return;
                        }
                        return;
                    case -262628938:
                        if (string.equals("LOAD_FAILED")) {
                            nedVar3.b(optLong, 2100, rdd.c(jSONObject));
                            return;
                        }
                        return;
                    case 66247144:
                        if (string.equals("ERROR")) {
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                ((ned) it3.next()).b(optLong, 2100, rdd.c(jSONObject));
                            }
                            if (rddVar.h != null) {
                                MediaError b = MediaError.b(jSONObject);
                                Iterator it4 = ((v99) rddVar.h.b).i.iterator();
                                while (it4.hasNext()) {
                                    ((u99) it4.next()).b(b);
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 154411710:
                        if (string.equals("QUEUE_CHANGE")) {
                            rddVar.t.b(optLong, 0, null);
                            rddVar.e("QUEUE_CHANGE", jSONObject);
                            if (rddVar.h != null) {
                                String string2 = jSONObject.getString("changeType");
                                int[] j2 = rdd.j(jSONObject.getJSONArray("itemIds"));
                                int optInt = jSONObject.optInt("insertBefore", 0);
                                if (j2 != null) {
                                    switch (string2.hashCode()) {
                                        case -2130463047:
                                            if (string2.equals("INSERT")) {
                                                Iterator it5 = ((v99) rddVar.h.b).i.iterator();
                                                while (it5.hasNext()) {
                                                    ((u99) it5.next()).j(j2, optInt);
                                                }
                                                return;
                                            }
                                            return;
                                        case -1881281404:
                                            if (string2.equals("REMOVE")) {
                                                Iterator it6 = ((v99) rddVar.h.b).i.iterator();
                                                while (it6.hasNext()) {
                                                    ((u99) it6.next()).l(j2);
                                                }
                                                return;
                                            }
                                            return;
                                        case -1785516855:
                                            if (string2.equals("UPDATE")) {
                                                int[] j3 = rdd.j(jSONObject.getJSONArray("itemIds"));
                                                xve.i(j3, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                                JSONArray optJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                                if (optJSONArray == null) {
                                                    Iterator it7 = ((v99) rddVar.h.b).i.iterator();
                                                    while (it7.hasNext()) {
                                                        ((u99) it7.next()).i(j3);
                                                    }
                                                    return;
                                                }
                                                ArrayList c2 = qd1.c(j3);
                                                int optInt2 = jSONObject.optInt("insertBefore", 0);
                                                int[] j4 = rdd.j(optJSONArray);
                                                xve.h(j4);
                                                ArrayList c3 = qd1.c(j4);
                                                Iterator it8 = ((v99) rddVar.h.b).i.iterator();
                                                while (it8.hasNext()) {
                                                    ((u99) it8.next()).m(c2, c3, optInt2);
                                                }
                                                return;
                                            }
                                            return;
                                        case 1122976047:
                                            if (string2.equals("ITEMS_CHANGE")) {
                                                Iterator it9 = ((v99) rddVar.h.b).i.iterator();
                                                while (it9.hasNext()) {
                                                    ((u99) it9.next()).n(j2);
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            return;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 431600379:
                        if (string.equals("INVALID_PLAYER_STATE")) {
                            Log.w(str2, he6Var.d("received unexpected error: Invalid Player State.", new Object[0]));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                ((ned) it10.next()).b(optLong, 2100, rdd.c(jSONObject));
                            }
                            return;
                        }
                        return;
                    case 823510221:
                        if (string.equals("MEDIA_STATUS")) {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("status");
                            if (jSONArray2.length() > 0) {
                                JSONObject jSONObject2 = jSONArray2.getJSONObject(0);
                                boolean c4 = nedVar3.c(optLong);
                                int i3 = ((!nedVar2.d() || nedVar2.c(optLong)) && (!nedVar.d() || nedVar.c(optLong))) ? 0 : 1;
                                if (c4 || (j07Var = rddVar.f) == null) {
                                    j07 j07Var2 = new j07(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                    j07Var2.b(jSONObject2, 0);
                                    rddVar.f = j07Var2;
                                    rddVar.e = SystemClock.elapsedRealtime();
                                    i = jn7.K1;
                                } else {
                                    i = j07Var.b(jSONObject2, i3);
                                }
                                if ((i & 1) != 0) {
                                    rddVar.e = SystemClock.elapsedRealtime();
                                    rddVar.i = -1;
                                    rddVar.i();
                                }
                                if ((i & 2) != 0) {
                                    rddVar.e = SystemClock.elapsedRealtime();
                                    rddVar.i();
                                }
                                if ((i & 128) != 0) {
                                    rddVar.e = SystemClock.elapsedRealtime();
                                }
                                if ((i & 4) != 0) {
                                    rddVar.f();
                                }
                                if ((i & 8) != 0) {
                                    rddVar.h();
                                }
                                if ((i & 16) != 0) {
                                    rddVar.g();
                                }
                                if ((i & 32) != 0) {
                                    rddVar.e = SystemClock.elapsedRealtime();
                                    j09 j09Var = rddVar.h;
                                    if (j09Var != null) {
                                        v99 v99Var = (v99) j09Var.b;
                                        Iterator it11 = v99Var.h.iterator();
                                        if (it11.hasNext()) {
                                            throw qu6.l(it11);
                                        }
                                        Iterator it12 = v99Var.i.iterator();
                                        while (it12.hasNext()) {
                                            ((u99) it12.next()).a();
                                        }
                                    }
                                }
                                if ((i & 64) != 0) {
                                    rddVar.e = SystemClock.elapsedRealtime();
                                    rddVar.i();
                                }
                            } else {
                                rddVar.f = null;
                                rddVar.i();
                                rddVar.f();
                                rddVar.h();
                                rddVar.g();
                            }
                            Iterator it13 = list.iterator();
                            while (it13.hasNext()) {
                                ((ned) it13.next()).b(optLong, 0, null);
                            }
                            return;
                        }
                        return;
                    case 2107149050:
                        if (string.equals("QUEUE_ITEM_IDS")) {
                            rddVar.r.b(optLong, 0, null);
                            rddVar.e("QUEUE_ITEM_IDS", jSONObject);
                            if (rddVar.h == null || (j = rdd.j(jSONObject.getJSONArray("itemIds"))) == null) {
                                return;
                            }
                            Iterator it14 = ((v99) rddVar.h.b).i.iterator();
                            while (it14.hasNext()) {
                                ((u99) it14.next()).i(j);
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } catch (JSONException e) {
                e = e;
                Object[] objArr = new Object[2];
                objArr[0] = e.getMessage();
                objArr[c] = str;
                Log.w(str2, he6Var.d("Message is malformed (%s); ignoring: %s", objArr));
            }
        } catch (JSONException e2) {
            e = e2;
            c = 1;
        }
    }

    public final void p(u99 u99Var) {
        xve.e("Must be called from the main thread.");
        if (u99Var != null) {
            this.i.add(u99Var);
        }
    }

    public final BasePendingResult q(sw6 sw6Var) {
        xve.e("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        hed hedVar = new hed(this, sw6Var, (byte) 2);
        x(hedVar);
        return hedVar;
    }

    public final void r() {
        xve.e("Must be called from the main thread.");
        int f = f();
        if (f == 4 || f == 2) {
            xve.e("Must be called from the main thread.");
            if (w()) {
                x(new qad(this, (byte) 5));
                return;
            } else {
                t();
                return;
            }
        }
        xve.e("Must be called from the main thread.");
        if (w()) {
            x(new qad(this, (byte) 6));
        } else {
            t();
        }
    }

    public final int s() {
        eu6 c;
        if (d() != null && h()) {
            if (i()) {
                return 6;
            }
            if (m()) {
                return 3;
            }
            if (l()) {
                return 2;
            }
            if (k() && (c = c()) != null && c.a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void u() {
        rjd rjdVar = this.f;
        if (rjdVar == null) {
            return;
        }
        xve.e("Must be called from the main thread.");
        String str = this.c.b;
        qd1.b(str);
        synchronized (rjdVar.D) {
            rjdVar.D.put(str, this);
        }
        wjb b = xjb.b();
        b.a = new rgd(rjdVar, str, this);
        b.d = (char) 8413;
        rjdVar.e(1, b.a());
        xve.e("Must be called from the main thread.");
        if (w()) {
            x(new qad(this, (byte) 0));
        } else {
            t();
        }
    }

    public final void v(rjd rjdVar) {
        v99 v99Var;
        rjd rjdVar2 = this.f;
        if (rjdVar2 != rjdVar) {
            if (rjdVar2 != null) {
                this.c.m();
                this.e.b();
                xve.e("Must be called from the main thread.");
                String str = this.c.b;
                if (TextUtils.isEmpty(str)) {
                    lq5.j("Channel namespace cannot be null or empty");
                    return;
                }
                synchronized (rjdVar2.D) {
                    v99Var = (v99) rjdVar2.D.remove(str);
                }
                wjb b = xjb.b();
                b.a = new rgd(rjdVar2, v99Var, str);
                b.d = (char) 8414;
                rjdVar2.e(1, b.a());
                this.d.b = null;
                this.b.removeCallbacksAndMessages(null);
            }
            this.f = rjdVar;
            if (rjdVar != null) {
                this.d.b = rjdVar;
            }
        }
    }

    public final boolean w() {
        return this.f != null;
    }
}
