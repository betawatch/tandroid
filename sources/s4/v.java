package s4;

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
import org.telegram.messenger.qs;
import org.telegram.ui.Components.vy;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class v {
    public final u a;
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

    public v(u uVar, String str, String str2, boolean z9) {
        this.a = uVar;
        this.b = str;
        this.c = str2;
        this.h = z9;
    }

    public static p a() {
        x.b();
        q qVar = x.c().e;
        if (qVar instanceof p) {
            return (p) qVar;
        }
        return null;
    }

    public final org.telegram.ui.Components.n b(v vVar) {
        if (vVar == null) {
            throw new NullPointerException("route must not be null");
        }
        String str = vVar.c;
        a0.f fVar = this.w;
        if (fVar == null || !fVar.containsKey(str)) {
            return null;
        }
        return new org.telegram.ui.Components.n((o) this.w.get(str));
    }

    public final g3 c() {
        u uVar = this.a;
        uVar.getClass();
        x.b();
        return uVar.a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar == null) {
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }
        if (vVar == this || this.n == 3) {
            return true;
        }
        return TextUtils.equals(((ComponentName) ((vy) c().d).b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO");
    }

    public final boolean e() {
        return DesugarCollections.unmodifiableList(this.v).size() >= 1;
    }

    public final boolean f() {
        return this.u != null && this.g;
    }

    public final boolean g() {
        x.b();
        return x.c().e() == this;
    }

    public final boolean h(r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        x.b();
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            rVar.a();
            if (!rVar.b.isEmpty()) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
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
        int i7;
        int i10;
        v vVar;
        int countActions;
        int i11 = 0;
        if (this.u != mVar) {
            this.u = mVar;
            if (mVar != null) {
                Bundle bundle = mVar.a;
                if (Objects.equals(this.d, bundle.getString("name"))) {
                    i7 = 0;
                } else {
                    this.d = bundle.getString("name");
                    i7 = 1;
                }
                if (!Objects.equals(this.e, bundle.getString("status"))) {
                    this.e = bundle.getString("status");
                    i7 = 1;
                }
                Uri uri = this.f;
                String string = bundle.getString("iconUri");
                if (!Objects.equals(uri, string == null ? null : Uri.parse(string))) {
                    String string2 = bundle.getString("iconUri");
                    this.f = string2 == null ? null : Uri.parse(string2);
                    i7 = 1;
                }
                if (this.g != bundle.getBoolean("enabled", true)) {
                    this.g = bundle.getBoolean("enabled", true);
                    i7 = 1;
                }
                if (this.i != bundle.getInt("connectionState", 0)) {
                    this.i = bundle.getInt("connectionState", 0);
                    i7 = 1;
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
                    i7 = 1;
                }
                if (this.l != bundle.getInt("playbackType", 1)) {
                    this.l = bundle.getInt("playbackType", 1);
                    i7 = 1;
                }
                if (this.m != bundle.getInt("playbackStream", -1)) {
                    this.m = bundle.getInt("playbackStream", -1);
                    i7 = 1;
                }
                if (this.n != bundle.getInt("deviceType")) {
                    this.n = bundle.getInt("deviceType");
                    i7 = 1;
                }
                int i14 = 3;
                if (this.o != bundle.getInt("volumeHandling", 0)) {
                    this.o = bundle.getInt("volumeHandling", 0);
                    i7 = 3;
                }
                if (this.p != bundle.getInt("volume")) {
                    this.p = bundle.getInt("volume");
                    i7 = 3;
                }
                if (this.q != bundle.getInt("volumeMax")) {
                    this.q = bundle.getInt("volumeMax");
                } else {
                    i14 = i7;
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
                ArrayList c10 = mVar.c();
                ArrayList arrayList2 = new ArrayList();
                boolean z9 = c10.size() != this.v.size();
                if (!c10.isEmpty()) {
                    e c11 = x.c();
                    int size = c10.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = c10.get(i15);
                        i15++;
                        c11.getClass();
                        String str = (String) c11.k.get(new q0.b(((ComponentName) this.a.d.b).flattenToShortString(), (String) obj));
                        ArrayList arrayList3 = c11.j;
                        int size2 = arrayList3.size();
                        int i16 = i11;
                        while (true) {
                            if (i16 >= size2) {
                                i10 = i11;
                                vVar = null;
                                break;
                            }
                            Object obj2 = arrayList3.get(i16);
                            i16++;
                            vVar = (v) obj2;
                            i10 = i11;
                            if (vVar.c.equals(str)) {
                                break;
                            }
                            i11 = i10;
                        }
                        if (vVar != null) {
                            arrayList2.add(vVar);
                            if (!z9 && !this.v.contains(vVar)) {
                                z9 = true;
                            }
                        }
                        i11 = i10;
                    }
                }
                if (!z9) {
                    return i14;
                }
                this.v = arrayList2;
                return i14 | 1;
            }
        }
        return 0;
    }

    public final void j(int i7) {
        q qVar;
        q qVar2;
        x.b();
        e c10 = x.c();
        int min = Math.min(this.q, Math.max(0, i7));
        HashMap hashMap = c10.b;
        if (this == c10.d && (qVar2 = c10.e) != null) {
            qVar2.f(min);
        } else {
            if (hashMap.isEmpty() || (qVar = (q) hashMap.get(this.c)) == null) {
                return;
            }
            qVar.f(min);
        }
    }

    public final void k(int i7) {
        q qVar;
        q qVar2;
        x.b();
        if (i7 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.b;
            if (this == c10.d && (qVar2 = c10.e) != null) {
                qVar2.i(i7);
            } else {
                if (hashMap.isEmpty() || (qVar = (q) hashMap.get(this.c)) == null) {
                    return;
                }
                qVar.i(i7);
            }
        }
    }

    public final void l() {
        x.b();
        x.c().i(this, 3);
    }

    public final boolean m(String str) {
        x.b();
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
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
            v a10 = this.a.a(oVar.a.d());
            if (a10 != null) {
                this.w.put(a10.c, oVar);
                int i7 = oVar.b;
                if (i7 == 2 || i7 == 3) {
                    this.v.add(a10);
                }
            }
        }
        x.c().a.b(qs.i4, this);
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
            for (int i7 = 0; i7 < size; i7++) {
                if (i7 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i7) != this) {
                    sb2.append(((v) this.v.get(i7)).c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
