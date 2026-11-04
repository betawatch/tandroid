package r4;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.g3;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w {
    public final v a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Uri f;
    public boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public Bundle s;
    public IntentSender t;
    public m u;
    public a0.f w;
    public final ArrayList k = new ArrayList();
    public int r = -1;
    public ArrayList v = new ArrayList();

    public w(v vVar, String str, String str2, boolean z10) {
        this.a = vVar;
        this.b = str;
        this.c = str2;
        this.h = z10;
    }

    public static p a() {
        y.b();
        q qVar = y.c().e;
        if (qVar instanceof p) {
            return (p) qVar;
        }
        return null;
    }

    public final y00 b(w wVar) {
        if (wVar == null) {
            throw new NullPointerException("route must not be null");
        }
        String str = wVar.c;
        a0.f fVar = this.w;
        if (fVar == null || !fVar.containsKey(str)) {
            return null;
        }
        return new y00((o) this.w.get(str));
    }

    public final g3 c() {
        v vVar = this.a;
        vVar.getClass();
        y.b();
        return vVar.a;
    }

    public final boolean d() {
        y.b();
        w wVar = y.c().v;
        if (wVar == null) {
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }
        if (wVar == this || this.n == 3) {
            return true;
        }
        return TextUtils.equals(((ComponentName) ((nh) c().d).b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO");
    }

    public final boolean e() {
        return DesugarCollections.unmodifiableList(this.v).size() >= 1;
    }

    public final boolean f() {
        return this.u != null && this.g;
    }

    public final boolean g() {
        y.b();
        return y.c().e() == this;
    }

    public final boolean h(r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        y.b();
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            rVar.a();
            if (!rVar.b.isEmpty()) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        Iterator it = rVar.b.iterator();
                        while (it.hasNext()) {
                            if (intentFilter.hasCategory((String) it.next())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0102, code lost:
    
        if (r5.hasNext() == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(m mVar) {
        int i3;
        int i10;
        w wVar;
        int countActions;
        int i11 = 0;
        if (this.u != mVar) {
            this.u = mVar;
            if (mVar != null) {
                Bundle bundle = mVar.a;
                if (Objects.equals(this.d, bundle.getString("name"))) {
                    i3 = 0;
                } else {
                    this.d = bundle.getString("name");
                    i3 = 1;
                }
                if (!Objects.equals(this.e, bundle.getString("status"))) {
                    this.e = bundle.getString("status");
                    i3 = 1;
                }
                Uri uri = this.f;
                String string = bundle.getString("iconUri");
                if (!Objects.equals(uri, string == null ? null : Uri.parse(string))) {
                    String string2 = bundle.getString("iconUri");
                    this.f = string2 == null ? null : Uri.parse(string2);
                    i3 = 1;
                }
                if (this.g != bundle.getBoolean("enabled", true)) {
                    this.g = bundle.getBoolean("enabled", true);
                    i3 = 1;
                }
                if (this.i != bundle.getInt("connectionState", 0)) {
                    this.i = bundle.getInt("connectionState", 0);
                    i3 = 1;
                }
                ArrayList b10 = mVar.b();
                ArrayList arrayList = this.k;
                if (arrayList != b10) {
                    if (arrayList != null) {
                        ListIterator listIterator = arrayList.listIterator();
                        ListIterator listIterator2 = b10.listIterator();
                        loop0: while (listIterator.hasNext() && listIterator2.hasNext()) {
                            IntentFilter intentFilter = (IntentFilter) listIterator.next();
                            IntentFilter intentFilter2 = (IntentFilter) listIterator2.next();
                            if (intentFilter != intentFilter2) {
                                if (intentFilter == null || intentFilter2 == null || (countActions = intentFilter.countActions()) != intentFilter2.countActions()) {
                                    break;
                                }
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= countActions) {
                                        int countCategories = intentFilter.countCategories();
                                        if (countCategories != intentFilter2.countCategories()) {
                                            break;
                                        }
                                        for (int i13 = 0; i13 < countCategories; i13++) {
                                            if (!intentFilter.getCategory(i13).equals(intentFilter2.getCategory(i13))) {
                                                break loop0;
                                            }
                                        }
                                    } else {
                                        if (!intentFilter.getAction(i12).equals(intentFilter2.getAction(i12))) {
                                            break loop0;
                                        }
                                        i12++;
                                    }
                                }
                            }
                        }
                        if (!listIterator.hasNext()) {
                        }
                    }
                    arrayList.clear();
                    arrayList.addAll(mVar.b());
                    i3 = 1;
                }
                if (this.l != bundle.getInt("playbackType", 1)) {
                    this.l = bundle.getInt("playbackType", 1);
                    i3 = 1;
                }
                if (this.m != bundle.getInt("playbackStream", -1)) {
                    this.m = bundle.getInt("playbackStream", -1);
                    i3 = 1;
                }
                if (this.n != bundle.getInt("deviceType")) {
                    this.n = bundle.getInt("deviceType");
                    i3 = 1;
                }
                int i14 = 3;
                if (this.o != bundle.getInt("volumeHandling", 0)) {
                    this.o = bundle.getInt("volumeHandling", 0);
                    i3 = 3;
                }
                if (this.p != bundle.getInt("volume")) {
                    this.p = bundle.getInt("volume");
                    i3 = 3;
                }
                if (this.q != bundle.getInt("volumeMax")) {
                    this.q = bundle.getInt("volumeMax");
                } else {
                    i14 = i3;
                }
                if (this.r != bundle.getInt("presentationDisplayId", -1)) {
                    this.r = bundle.getInt("presentationDisplayId", -1);
                    i14 |= 5;
                }
                if (!Objects.equals(this.s, bundle.getBundle("extras"))) {
                    this.s = bundle.getBundle("extras");
                    i14 |= 1;
                }
                if (!Objects.equals(this.t, (IntentSender) bundle.getParcelable("settingsIntent"))) {
                    this.t = (IntentSender) bundle.getParcelable("settingsIntent");
                    i14 |= 1;
                }
                if (this.j != bundle.getBoolean("canDisconnect", false)) {
                    this.j = bundle.getBoolean("canDisconnect", false);
                    i14 |= 5;
                }
                ArrayList c2 = mVar.c();
                ArrayList arrayList2 = new ArrayList();
                boolean z10 = c2.size() != this.v.size();
                if (!c2.isEmpty()) {
                    e c10 = y.c();
                    int size = c2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = c2.get(i15);
                        i15++;
                        c10.getClass();
                        String str = (String) c10.k.get(new q0.b(((ComponentName) this.a.d.b).flattenToShortString(), (String) obj));
                        ArrayList arrayList3 = c10.j;
                        int size2 = arrayList3.size();
                        int i16 = i11;
                        while (true) {
                            if (i16 >= size2) {
                                i10 = i11;
                                wVar = null;
                                break;
                            }
                            Object obj2 = arrayList3.get(i16);
                            i16++;
                            wVar = (w) obj2;
                            i10 = i11;
                            if (wVar.c.equals(str)) {
                                break;
                            }
                            i11 = i10;
                        }
                        if (wVar != null) {
                            arrayList2.add(wVar);
                            if (!z10 && !this.v.contains(wVar)) {
                                z10 = true;
                            }
                        }
                        i11 = i10;
                    }
                }
                if (!z10) {
                    return i14;
                }
                this.v = arrayList2;
                return i14 | 1;
            }
        }
        return 0;
    }

    public final void j(int i3) {
        q qVar;
        q qVar2;
        y.b();
        e c2 = y.c();
        int min = Math.min(this.q, Math.max(0, i3));
        HashMap hashMap = c2.b;
        if (this == c2.d && (qVar2 = c2.e) != null) {
            qVar2.f(min);
        } else {
            if (hashMap.isEmpty() || (qVar = (q) hashMap.get(this.c)) == null) {
                return;
            }
            qVar.f(min);
        }
    }

    public final void k(int i3) {
        q qVar;
        q qVar2;
        y.b();
        if (i3 != 0) {
            e c2 = y.c();
            HashMap hashMap = c2.b;
            if (this == c2.d && (qVar2 = c2.e) != null) {
                qVar2.i(i3);
            } else {
                if (hashMap.isEmpty() || (qVar = (q) hashMap.get(this.c)) == null) {
                    return;
                }
                qVar.i(i3);
            }
        }
    }

    public final void l() {
        y.b();
        y.c().i(this, 3);
    }

    public final boolean m(String str) {
        y.b();
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (((IntentFilter) obj).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final void n(Collection collection) {
        this.v.clear();
        if (this.w == null) {
            this.w = new a0.f(0);
        }
        this.w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            w a10 = this.a.a(oVar.a.d());
            if (a10 != null) {
                this.w.put(a10.c, oVar);
                int i3 = oVar.b;
                if (i3 == 2 || i3 == 3) {
                    this.v.add(a10);
                }
            }
        }
        y.c().a.b(hs.i4, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.e);
        sb2.append(", iconUri=");
        sb2.append(this.f);
        sb2.append(", enabled=");
        sb2.append(this.g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.i);
        sb2.append(", canDisconnect=");
        sb2.append(this.j);
        sb2.append(", playbackType=");
        sb2.append(this.l);
        sb2.append(", playbackStream=");
        sb2.append(this.m);
        sb2.append(", deviceType=");
        sb2.append(this.n);
        sb2.append(", volumeHandling=");
        sb2.append(this.o);
        sb2.append(", volume=");
        sb2.append(this.p);
        sb2.append(", volumeMax=");
        sb2.append(this.q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.r);
        sb2.append(", extras=");
        sb2.append(this.s);
        sb2.append(", settingsIntent=");
        sb2.append(this.t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.a.d.b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (i3 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i3) != this) {
                    sb2.append(((w) this.v.get(i3)).c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
