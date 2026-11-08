package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import c8.ab;
import h9.h2;
import h9.t1;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class j {
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public final m a;
    public final j1 b;
    public final e2.y0 c;
    public final e2.y0 d;
    public final Bundle e;
    public final Bundle f;
    public final e1 g;
    public final h9.i0 h;
    public final h9.i0 i;
    public final MediaSession.Token j;
    public final h9.i0 k;

    static {
        String str = h2.m0.a;
        l = Integer.toString(0, 36);
        m = Integer.toString(1, 36);
        n = Integer.toString(2, 36);
        o = Integer.toString(9, 36);
        p = Integer.toString(14, 36);
        q = Integer.toString(13, 36);
        r = Integer.toString(3, 36);
        s = Integer.toString(4, 36);
        t = Integer.toString(5, 36);
        u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        w = Integer.toString(7, 36);
        x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        y = Integer.toString(12, 36);
    }

    public j(m mVar, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, j1 j1Var, e2.y0 y0Var, e2.y0 y0Var2, Bundle bundle, Bundle bundle2, e1 e1Var, MediaSession.Token token) {
        this.a = mVar;
        this.h = i0Var;
        this.i = i0Var2;
        this.k = i0Var3;
        this.b = j1Var;
        this.c = y0Var;
        this.d = y0Var2;
        this.e = bundle;
        this.f = bundle2;
        this.g = e1Var;
        this.j = token;
    }

    public final Bundle a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt(l, 1010001300);
        bundle.putBinder(m, this.a.asBinder());
        bundle.putParcelable(n, null);
        h9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = o;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
            int size = i0Var.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = i0Var.get(i10);
                i10++;
                arrayList.add(((d) obj).k(i7));
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        h9.i0 i0Var2 = this.i;
        if (!i0Var2.isEmpty()) {
            if (i7 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                int size2 = i0Var2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = i0Var2.get(i11);
                    i11++;
                    arrayList2.add(((d) obj2).k(i7));
                }
                bundle.putParcelableArrayList(p, arrayList2);
            } else {
                t1 g10 = d.g(i0Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(g10.d);
                h9.g0 listIterator = g10.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList3.add(((d) listIterator.next()).k(i7));
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        h9.i0 i0Var3 = this.k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            int size3 = i0Var3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = i0Var3.get(i12);
                i12++;
                arrayList4.add(((d) obj3).k(i7));
            }
            bundle.putParcelableArrayList(q, arrayList4);
        }
        j1 j1Var = this.b;
        j1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        h2 it = j1Var.a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((i1) it.next()).a());
        }
        bundle2.putParcelableArrayList(j1.b, arrayList5);
        bundle.putBundle(r, bundle2);
        String str2 = s;
        e2.y0 y0Var = this.c;
        bundle.putBundle(str2, y0Var.b());
        String str3 = t;
        e2.y0 y0Var2 = this.d;
        bundle.putBundle(str3, y0Var2.b());
        bundle.putBundle(u, this.e);
        bundle.putBundle(v, this.f);
        bundle.putBundle(w, this.g.e(ab.a(y0Var, y0Var2), false, false).f(i7));
        bundle.putInt(x, 9);
        MediaSession.Token token = this.j;
        if (token != null) {
            bundle.putParcelable(y, token);
        }
        return bundle;
    }
}
