package ti;

import a8.me;
import a8.v1;
import aa.b1;
import aa.v0;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.i0;
import androidx.fragment.app.l0;
import androidx.fragment.app.o0;
import androidx.fragment.app.r;
import com.google.firebase.messaging.q;
import e2.n0;
import e2.x;
import f9.o;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.zip.Inflater;
import l.a0;
import l.k;
import li.e3;
import n4.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.r10;
import z3.l;
import z3.m;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class e implements m, o5.b {
    public static volatile e f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ e(int i10, boolean z10) {
        this.a = i10;
    }

    public static void s(long j10, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hashMap.remove(arrayList.get(i10));
        }
    }

    @Override // z3.m
    public void G(byte[] bArr, int i10, int i11, l lVar, e2.j jVar) {
        d2.b bVar;
        int i12;
        int i13;
        int i14;
        int D;
        c4.a aVar = (c4.a) this.d;
        x xVar = (x) this.c;
        x xVar2 = (x) this.b;
        xVar2.L(i10 + i11, bArr);
        xVar2.N(i10);
        if (((Inflater) this.e) == null) {
            this.e = new Inflater();
        }
        if (n0.Q(xVar2, xVar, (Inflater) this.e)) {
            xVar2.L(xVar.c, xVar.a);
        }
        int i15 = 0;
        aVar.d = 0;
        int[] iArr = aVar.b;
        x xVar3 = aVar.a;
        aVar.e = 0;
        aVar.f = 0;
        aVar.g = 0;
        aVar.h = 0;
        aVar.i = 0;
        xVar3.K(0);
        aVar.c = false;
        ArrayList arrayList = new ArrayList();
        while (xVar2.a() >= 3) {
            int i16 = xVar2.c;
            int A = xVar2.A();
            int H = xVar2.H();
            int i17 = xVar2.b + H;
            if (i17 > i16) {
                xVar2.N(i16);
                i12 = i15;
                bVar = null;
            } else {
                char c10 = 128;
                if (A != 128) {
                    switch (A) {
                        case 20:
                            if (H % 5 == 2) {
                                xVar2.O(2);
                                Arrays.fill(iArr, i15);
                                int i18 = H / 5;
                                int i19 = i15;
                                while (i19 < i18) {
                                    int A2 = xVar2.A();
                                    char c11 = c10;
                                    double A3 = xVar2.A();
                                    double A4 = xVar2.A() - 128;
                                    double A5 = xVar2.A() - 128;
                                    iArr[A2] = n0.i((int) ((A5 * 1.772d) + A3), 0, 255) | (xVar2.A() << 24) | (n0.i((int) ((1.402d * A4) + A3), 0, 255) << 16) | (n0.i((int) ((A3 - (0.34414d * A5)) - (A4 * 0.71414d)), 0, 255) << 8);
                                    i19++;
                                    c10 = c11;
                                    aVar = aVar;
                                }
                                aVar.c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (H >= 4) {
                                xVar2.O(3);
                                int i20 = H - 4;
                                if (((128 & xVar2.A()) != 0 ? 1 : i15) != 0) {
                                    if (i20 >= 7 && (D = xVar2.D()) >= 4) {
                                        aVar.h = xVar2.H();
                                        aVar.i = xVar2.H();
                                        xVar3.K(D - 4);
                                        i20 = H - 11;
                                    }
                                }
                                int i21 = xVar3.b;
                                int i22 = xVar3.c;
                                if (i21 < i22 && i20 > 0) {
                                    int min = Math.min(i20, i22 - i21);
                                    xVar2.k(i21, min, xVar3.a);
                                    xVar3.N(i21 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (H >= 19) {
                                aVar.d = xVar2.H();
                                aVar.e = xVar2.H();
                                xVar2.O(11);
                                aVar.f = xVar2.H();
                                aVar.g = xVar2.H();
                                break;
                            }
                            break;
                    }
                    i12 = 0;
                    bVar = null;
                } else {
                    if (aVar.d == 0 || aVar.e == 0 || aVar.h == 0 || aVar.i == 0 || (i13 = xVar3.c) == 0 || xVar3.b != i13 || !aVar.c) {
                        bVar = null;
                    } else {
                        xVar3.N(0);
                        int i23 = aVar.h * aVar.i;
                        int[] iArr2 = new int[i23];
                        int i24 = 0;
                        while (i24 < i23) {
                            int A6 = xVar3.A();
                            if (A6 != 0) {
                                i14 = i24 + 1;
                                iArr2[i24] = iArr[A6];
                            } else {
                                int A7 = xVar3.A();
                                if (A7 != 0) {
                                    i14 = ((A7 & 64) == 0 ? A7 & 63 : ((A7 & 63) << 8) | xVar3.A()) + i24;
                                    Arrays.fill(iArr2, i24, i14, (A7 & 128) == 0 ? iArr[0] : iArr[xVar3.A()]);
                                }
                            }
                            i24 = i14;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.i, Bitmap.Config.ARGB_8888);
                        float f7 = aVar.f;
                        float f10 = aVar.d;
                        float f11 = f7 / f10;
                        float f12 = aVar.g;
                        float f13 = aVar.e;
                        bVar = new d2.b(null, null, null, createBitmap, f12 / f13, 0, 0, f11, 0, TLObject.FLAG_31, -3.4028235E38f, aVar.h / f10, aVar.i / f13, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                    }
                    i12 = 0;
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f = 0;
                    aVar.g = 0;
                    aVar.h = 0;
                    aVar.i = 0;
                    xVar3.K(0);
                    aVar.c = false;
                }
                xVar2.N(i17);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i15 = i12;
        }
        jVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public void a(r rVar) {
        if (((ArrayList) this.b).contains(rVar)) {
            throw new IllegalStateException("Fragment already added: " + rVar);
        }
        synchronized (((ArrayList) this.b)) {
            ((ArrayList) this.b).add(rVar);
        }
        rVar.v = true;
    }

    public ArrayList b(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.b;
        s(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.c;
        s(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.b bVar = (m2.b) list.get(i10);
            if (!hashMap.containsKey(bVar.b) && !hashMap2.containsKey(Integer.valueOf(bVar.c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public v0 c() {
        String str = ((String) this.b) == null ? " processName" : "";
        if (((Integer) this.c) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.d) == null) {
            str = b10.u(str, " importance");
        }
        if (((Boolean) this.e) == null) {
            str = b10.u(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new v0((String) this.b, ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), ((Boolean) this.e).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public b1 d() {
        String str = ((Integer) this.b) == null ? " platform" : "";
        if (((String) this.c) == null) {
            str = str.concat(" version");
        }
        if (((String) this.d) == null) {
            str = b10.u(str, " buildVersion");
        }
        if (((Boolean) this.e) == null) {
            str = b10.u(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new b1(((Integer) this.b).intValue(), (String) this.c, (String) this.d, ((Boolean) this.e).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void e(d dVar) {
        if (((d) this.c) != dVar) {
            return;
        }
        b bVar = (b) this.d;
        if (bVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
            this.d = null;
        }
        b bVar2 = (b) this.e;
        if (bVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar2);
            this.e = null;
        }
        synchronized (j.y) {
            try {
                j jVar = j.A;
                if (jVar != null) {
                    jVar.o();
                    j.A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.c = null;
        dVar.c.run(-1L);
        r();
    }

    public r f(String str) {
        o0 o0Var = (o0) ((HashMap) this.c).get(str);
        if (o0Var != null) {
            return o0Var.c;
        }
        return null;
    }

    public r g(String str) {
        for (o0 o0Var : ((HashMap) this.c).values()) {
            if (o0Var != null) {
                r rVar = o0Var.c;
                if (!str.equals(rVar.e)) {
                    rVar = rVar.L.c.g(str);
                }
                if (rVar != null) {
                    return rVar;
                }
            }
        }
        return null;
    }

    @Override // id.a
    public Object get() {
        return new q((Executor) ((id.a) this.b).get(), (t5.d) ((id.a) this.c).get(), (s4.d) ((k6.c) this.d).get(), (u5.c) ((id.a) this.e).get());
    }

    public k.e h(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k.e eVar = (k.e) arrayList.get(i10);
            if (eVar != null && eVar.b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.c).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var);
            }
        }
        return arrayList;
    }

    @Override // z3.m
    public /* synthetic */ z3.d j(int i10, int i11, byte[] bArr) {
        return b10.a(this, bArr, i11);
    }

    public ArrayList k() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.c).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List l() {
        ArrayList arrayList;
        if (((ArrayList) this.b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.b)) {
            arrayList = new ArrayList((ArrayList) this.b);
        }
        return arrayList;
    }

    public void m(o0 o0Var) {
        r rVar = o0Var.c;
        String str = rVar.e;
        HashMap hashMap = (HashMap) this.c;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(rVar.e, o0Var);
        if (i0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + rVar);
        }
    }

    public void n(o0 o0Var) {
        HashMap hashMap = (HashMap) this.c;
        r rVar = o0Var.c;
        if (rVar.S) {
            ((l0) this.e).f(rVar);
        }
        if (hashMap.get(rVar.e) == o0Var && ((o0) hashMap.put(rVar.e, null)) != null && i0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + rVar);
        }
    }

    public boolean o(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(h(aVar), new l.r((Context) this.c, (l0.a) menuItem));
    }

    public boolean p(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.b;
        k.e h = h(aVar);
        a0.l lVar = (a0.l) this.e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) this.c, (k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(h, menu2);
    }

    public ef.f q(String str) {
        if (str == null) {
            throw new NullPointerException("input must not be null");
        }
        bf.g gVar = new bf.g((ArrayList) this.b, (ff.b) this.d, (ArrayList) this.c);
        int i10 = 0;
        while (true) {
            int length = str.length();
            int i11 = i10;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                char charAt = str.charAt(i11);
                if (charAt == '\n' || charAt == '\r') {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                break;
            }
            gVar.i(str.substring(i10, i11));
            i10 = i11 + 1;
            if (i10 < str.length() && str.charAt(i11) == '\r' && str.charAt(i10) == '\n') {
                i10 = i11 + 2;
            }
        }
        if (str.length() > 0 && (i10 == 0 || i10 < str.length())) {
            gVar.i(str.substring(i10));
        }
        gVar.f(gVar.n);
        ff.a B = gVar.j.B(new s(8, gVar.k, gVar.m));
        Iterator it = gVar.o.iterator();
        while (it.hasNext()) {
            ((gf.a) it.next()).g(B);
        }
        ef.f fVar = (ef.f) gVar.l.b;
        Iterator it2 = ((ArrayList) this.e).iterator();
        if (it2.hasNext()) {
            throw a1.g.j(it2);
        }
        return fVar;
    }

    public void r() {
        boolean z10;
        if (((d) this.c) != null) {
            return;
        }
        d dVar = (d) ((ArrayDeque) this.b).pollFirst();
        this.c = dVar;
        if (dVar == null) {
            return;
        }
        b bVar = new b(this, dVar, 0);
        this.d = bVar;
        AndroidUtilities.runOnUIThread(bVar, 10000L);
        a aVar = dVar.b;
        String str = aVar.b;
        String str2 = aVar.f;
        c cVar = new c(this, dVar);
        s4.d i10 = j.i(str);
        byte[] d = j.d(str2);
        int i11 = 0;
        if (i10 != null && d != null) {
            try {
                z10 = v1.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th2) {
                FileLog.e(th2);
                z10 = false;
            }
            if (z10) {
                synchronized (j.y) {
                    j jVar = j.A;
                    if (jVar != null) {
                        jVar.o();
                        j.A = null;
                    }
                    try {
                        j jVar2 = new j(i10, str2, d);
                        j.A = jVar2;
                        jVar2.x = cVar;
                        r10 r10Var = r10.getInstance();
                        if (r10Var != null) {
                            r10Var.addListener(jVar2);
                        }
                        jVar2.j.execute(new f(jVar2, 1));
                        AndroidUtilities.runOnUIThread(new f(jVar2, 2));
                        i11 = j.A.i.getLocalPort();
                    } catch (Exception e) {
                        FileLog.e(e);
                        j jVar3 = j.A;
                        if (jVar3 != null) {
                            jVar3.o();
                            j.A = null;
                        }
                    }
                }
            }
        }
        dVar.d = i11;
        if (i11 == 0) {
            e(dVar);
        }
    }

    public m2.b t(List list) {
        m2.b bVar;
        HashMap hashMap = (HashMap) this.d;
        ArrayList b10 = b(list);
        if (b10.size() < 2) {
            return (m2.b) o.l(b10, null);
        }
        Collections.sort(b10, new a4.d(26));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((m2.b) b10.get(0)).c;
        int i12 = 0;
        while (true) {
            if (i12 >= b10.size()) {
                break;
            }
            m2.b bVar2 = (m2.b) b10.get(i12);
            if (i11 == bVar2.c) {
                arrayList.add(new Pair(bVar2.b, Integer.valueOf(bVar2.d)));
                i12++;
            } else if (arrayList.size() == 1) {
                return (m2.b) b10.get(0);
            }
        }
        m2.b bVar3 = (m2.b) hashMap.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List subList = b10.subList(0, arrayList.size());
        int i13 = 0;
        for (int i14 = 0; i14 < subList.size(); i14++) {
            i13 += ((m2.b) subList.get(i14)).d;
        }
        int nextInt = ((Random) this.e).nextInt(i13);
        int i15 = 0;
        while (true) {
            if (i10 >= subList.size()) {
                bVar = (m2.b) o.m(subList);
                break;
            }
            bVar = (m2.b) subList.get(i10);
            i15 += bVar.d;
            if (nextInt < i15) {
                break;
            }
            i10++;
        }
        hashMap.put(arrayList, bVar);
        return bVar;
    }

    public String toString() {
        switch (this.a) {
            case 12:
                return ((e3) this.e).toString();
            default:
                return super.toString();
        }
    }

    public Bundle u(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.d;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    @Override // z3.m
    public int y() {
        return 2;
    }

    public e(id.a aVar, id.a aVar2, k6.c cVar, id.a aVar3) {
        this.a = 11;
        this.b = aVar;
        this.c = aVar2;
        this.d = cVar;
        this.e = aVar3;
    }

    public e(me meVar) {
        this.a = 5;
        ArrayList arrayList = (ArrayList) meVar.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) meVar.d;
        LinkedHashSet linkedHashSet2 = bf.g.p;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(bf.g.q.get((Class) it.next()));
        }
        this.b = arrayList2;
        ff.b bVar = (s) meVar.e;
        int i10 = 8;
        bVar = bVar == null ? new sb.b(i10) : bVar;
        this.d = bVar;
        this.e = (ArrayList) meVar.c;
        ArrayList arrayList3 = (ArrayList) meVar.b;
        this.c = arrayList3;
        bVar.B(new s(i10, arrayList3, Collections.EMPTY_MAP));
    }

    public e(int i10) {
        this.a = i10;
        switch (i10) {
            case 3:
                this.b = new ArrayList();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            case 4:
                this.b = new x();
                this.c = new x();
                this.d = new c4.a();
                break;
            case 5:
            case 6:
            default:
                this.b = new ArrayDeque();
                break;
            case 7:
                Random random = new Random();
                this.d = new HashMap();
                this.e = random;
                this.b = new HashMap();
                this.c = new HashMap();
                break;
        }
    }

    public e(e3 e3Var, Object obj, Object obj2, Object[] objArr) {
        this.a = 12;
        this.e = e3Var;
        this.b = obj;
        this.c = obj2;
        this.d = objArr;
    }

    public e(Context context, ActionMode.Callback callback) {
        this.a = 6;
        this.c = context;
        this.b = callback;
        this.d = new ArrayList();
        this.e = new a0.l(0);
    }

    public e(mg.e eVar) {
        this.a = 8;
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        this.e = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        if (eVar.E) {
            TextView textView = new TextView(eVar.getContext());
            this.d = textView;
            linearLayout.addView(textView);
            textView.getLayoutParams().width = AndroidUtilities.dp(36.0f);
            textView.setVisibility(8);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 13.0f);
        }
        TextView textView2 = new TextView(eVar.getContext());
        this.c = textView2;
        linearLayout.addView(textView2, kb1.o(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        b6 b6Var = new b6(eVar.getContext());
        this.b = b6Var;
        linearLayout.addView(b6Var, kb1.r(-1, -2));
        textView2.setGravity(8388611);
        b6Var.setGravity(8388613);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }

    @Override // z3.m
    public /* synthetic */ void reset() {
    }
}
