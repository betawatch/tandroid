package sf;

import a0.k;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.biometric.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.m0;
import androidx.fragment.app.p0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h5.d0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import k7.c6;
import k9.t0;
import k9.z0;
import l.b0;
import l.l;
import l.s;
import ld.e0;
import o3.m;
import o4.r;
import o4.v;
import o4.v0;
import o4.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.t5;
import q5.g0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e implements a3.b, z, m {
    public static volatile e f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public static final Message l(e eVar, ArrayList arrayList, int i10) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((Message) obj2).what == i10) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public boolean A(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(s(aVar), new s((Context) this.c, (l0.a) menuItem));
    }

    public boolean B(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.b;
        k.e s6 = s(aVar);
        k kVar = (k) this.e;
        Menu menu2 = (Menu) kVar.get(menu);
        if (menu2 == null) {
            menu2 = new b0((Context) this.c, (l) menu);
            kVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(s6, menu2);
    }

    public ne.f C(String str) {
        if (str == null) {
            throw new NullPointerException("input must not be null");
        }
        ke.e eVar = new ke.e((ArrayList) this.b, (oe.b) this.d, (ArrayList) this.c);
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
            eVar.i(str.substring(i10, i11));
            i10 = i11 + 1;
            if (i10 < str.length() && str.charAt(i11) == '\r' && str.charAt(i10) == '\n') {
                i10 = i11 + 2;
            }
        }
        if (str.length() > 0 && (i10 == 0 || i10 < str.length())) {
            eVar.i(str.substring(i10));
        }
        eVar.f(eVar.n);
        oe.a w10 = eVar.j.w(new f7.b(22, eVar.k, eVar.m));
        Iterator it = eVar.o.iterator();
        while (it.hasNext()) {
            ((pe.a) it.next()).g(w10);
        }
        ne.f fVar = (ne.f) eVar.l.b;
        Iterator it2 = ((ArrayList) this.e).iterator();
        if (!it2.hasNext()) {
            return fVar;
        }
        it2.next().getClass();
        throw new ClassCastException();
    }

    public void D() {
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
        String i10 = j.i(str);
        byte[] d = j.d(str2);
        int i11 = 0;
        if (!TextUtils.isEmpty(i10) && d != null && j.h()) {
            synchronized (j.t) {
                j jVar = j.v;
                if (jVar != null) {
                    jVar.m();
                    j.v = null;
                }
                try {
                    j jVar2 = new j(i10, str2, d);
                    j.v = jVar2;
                    jVar2.s = cVar;
                    h10 h10Var = h10.getInstance();
                    if (h10Var != null) {
                        h10Var.addListener(jVar2);
                    }
                    jVar2.h.execute(new f(jVar2, 2));
                    AndroidUtilities.runOnUIThread(new f(jVar2, 1));
                    i11 = j.v.g.getLocalPort();
                } catch (Exception e6) {
                    FileLog.e(e6);
                    j jVar3 = j.v;
                    if (jVar3 != null) {
                        jVar3.m();
                        j.v = null;
                    }
                }
            }
        }
        dVar.d = i11;
        if (i11 == 0) {
            p(dVar);
        }
    }

    public void E(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.d;
        if (!linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
    }

    public void F(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.d).drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.j.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        e0.q(e0.b((uc.h) this.b), new k1.c(this, arrayList, null, 5));
    }

    public Bundle G(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.d;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public Task H(Callable callable) {
        Task continueWith;
        synchronized (this.d) {
            continueWith = ((Task) this.c).continueWith((Executor) this.b, new o5.i(callable, 16));
            this.c = continueWith.continueWith((Executor) this.b, new ab.a(9));
        }
        return continueWith;
    }

    public Task I(Callable callable) {
        Task continueWithTask;
        synchronized (this.d) {
            continueWithTask = ((Task) this.c).continueWithTask((Executor) this.b, new o5.i(callable, 16));
            this.c = continueWithTask.continueWith((Executor) this.b, new ab.a(9));
        }
        return continueWithTask;
    }

    @Override // o4.z
    public void a(int i10, v vVar, o4.j jVar, r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.c).q(jVar, z(rVar));
        }
    }

    @Override // o3.m
    public void b(int i10, v vVar) {
        if (y(i10, vVar)) {
            ((o3.l) this.d).a();
        }
    }

    @Override // o3.m
    public void c(int i10, v vVar, int i11) {
        if (y(i10, vVar)) {
            ((o3.l) this.d).c(i11);
        }
    }

    @Override // o4.z
    public void d(int i10, v vVar, o4.j jVar, r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.c).o(jVar, z(rVar));
        }
    }

    @Override // o3.m
    public void e(int i10, v vVar, Exception exc) {
        if (y(i10, vVar)) {
            ((o3.l) this.d).d(exc);
        }
    }

    @Override // o4.z
    public void f(int i10, v vVar, r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.c).i(z(rVar));
        }
    }

    @Override // o4.z
    public void g(int i10, v vVar, o4.j jVar, r rVar, IOException iOException, boolean z4) {
        if (y(i10, vVar)) {
            ((b4.e0) this.c).t(jVar, z(rVar), iOException, z4);
        }
    }

    @Override // rc.a
    public Object get() {
        Executor executor = (Executor) ((rc.a) this.b).get();
        f3.d dVar = (f3.d) ((rc.a) this.c).get();
        androidx.biometric.e eVar = (androidx.biometric.e) ((androidx.biometric.e) this.d).get();
        g3.c cVar = (g3.c) ((rc.a) this.e).get();
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s();
        sVar.a = executor;
        sVar.b = dVar;
        sVar.c = eVar;
        sVar.d = cVar;
        return sVar;
    }

    @Override // o4.z
    public void h(int i10, v vVar, o4.j jVar, r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.c).v(jVar, z(rVar));
        }
    }

    @Override // o4.z
    public void i(int i10, v vVar, r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.c).B(z(rVar));
        }
    }

    @Override // o3.m
    public void j(int i10, v vVar) {
        if (y(i10, vVar)) {
            ((o3.l) this.d).b();
        }
    }

    @Override // o3.m
    public void k(int i10, v vVar) {
        if (y(i10, vVar)) {
            ((o3.l) this.d).e();
        }
    }

    public void m(androidx.fragment.app.s sVar) {
        if (((ArrayList) this.b).contains(sVar)) {
            throw new IllegalStateException("Fragment already added: " + sVar);
        }
        synchronized (((ArrayList) this.b)) {
            ((ArrayList) this.b).add(sVar);
        }
        sVar.v = true;
    }

    public t0 n() {
        String str = ((String) this.b) == null ? " processName" : "";
        if (((Integer) this.c) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.d) == null) {
            str = w.c.e(str, " importance");
        }
        if (((Boolean) this.e) == null) {
            str = w.c.e(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new t0((String) this.b, ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), ((Boolean) this.e).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public z0 o() {
        String str = ((Integer) this.b) == null ? " platform" : "";
        if (((String) this.c) == null) {
            str = str.concat(" version");
        }
        if (((String) this.d) == null) {
            str = w.c.e(str, " buildVersion");
        }
        if (((Boolean) this.e) == null) {
            str = w.c.e(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new z0(((Integer) this.b).intValue(), (String) this.c, (String) this.d, ((Boolean) this.e).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void p(d dVar) {
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
        synchronized (j.t) {
            try {
                j jVar = j.v;
                if (jVar != null) {
                    jVar.m();
                    j.v = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.c = null;
        dVar.c.run(-1L);
        D();
    }

    public androidx.fragment.app.s q(String str) {
        p0 p0Var = (p0) ((HashMap) this.c).get(str);
        if (p0Var != null) {
            return p0Var.c;
        }
        return null;
    }

    public androidx.fragment.app.s r(String str) {
        for (p0 p0Var : ((HashMap) this.c).values()) {
            if (p0Var != null) {
                androidx.fragment.app.s sVar = p0Var.c;
                if (!str.equals(sVar.e)) {
                    sVar = sVar.I.c.r(str);
                }
                if (sVar != null) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public k.e s(k.a aVar) {
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

    public ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.c).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return ((f0) this.e).toString();
            default:
                return super.toString();
        }
    }

    public ArrayList u() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.c).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List v() {
        ArrayList arrayList;
        if (((ArrayList) this.b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.b)) {
            arrayList = new ArrayList((ArrayList) this.b);
        }
        return arrayList;
    }

    public void w(p0 p0Var) {
        androidx.fragment.app.s sVar = p0Var.c;
        String str = sVar.e;
        HashMap hashMap = (HashMap) this.c;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.e, p0Var);
        if (j0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void x(p0 p0Var) {
        HashMap hashMap = (HashMap) this.c;
        androidx.fragment.app.s sVar = p0Var.c;
        if (sVar.P) {
            ((m0) this.e).f(sVar);
        }
        if (hashMap.get(sVar.e) == p0Var && ((p0) hashMap.put(sVar.e, null)) != null && j0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public boolean y(int i10, v vVar) {
        v vVar2;
        Object obj = this.b;
        v0 v0Var = (v0) this.e;
        if (vVar != null) {
            v0Var.getClass();
            vVar2 = v0Var.s(vVar);
            if (vVar2 == null) {
                return false;
            }
        } else {
            vVar2 = null;
        }
        v0Var.getClass();
        b4.e0 e0Var = (b4.e0) this.c;
        if (e0Var.b != i10 || !d0.a((v) e0Var.c, vVar2)) {
            this.c = new b4.e0((CopyOnWriteArrayList) v0Var.c.d, i10, vVar2);
        }
        o3.l lVar = (o3.l) this.d;
        if (lVar.a == i10 && d0.a(lVar.b, vVar2)) {
            return true;
        }
        this.d = new o3.l(v0Var.d.c, i10, vVar2);
        return true;
    }

    public r z(r rVar) {
        v0 v0Var = (v0) this.e;
        Object obj = this.b;
        long j10 = rVar.f;
        v0Var.t(obj, j10);
        long j11 = rVar.g;
        v0Var.t(obj, j11);
        return (j10 == j10 && j11 == j11) ? rVar : new r(rVar.a, rVar.b, rVar.c, rVar.d, rVar.e, j10, j11);
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public e(c5.j jVar) {
        this.a = 10;
        ArrayList arrayList = (ArrayList) jVar.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) jVar.d;
        LinkedHashSet linkedHashSet2 = ke.e.p;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(ke.e.q.get((Class) it.next()));
        }
        this.b = arrayList2;
        oe.b bVar = (g0) jVar.e;
        bVar = bVar == null ? new db.a(14) : bVar;
        this.d = bVar;
        this.e = (ArrayList) jVar.c;
        ArrayList arrayList3 = (ArrayList) jVar.b;
        this.c = arrayList3;
        bVar.w(new f7.b(22, arrayList3, Collections.EMPTY_MAP));
    }

    public e(uc.h hVar) {
        this.a = 8;
        this.b = hVar;
        this.d = new LinkedBlockingDeque(20);
        this.e = new jf.a(this, 1);
    }

    public e(ExecutorService executorService) {
        this.a = 4;
        this.c = Tasks.forResult(null);
        this.d = new Object();
        this.e = new ThreadLocal();
        this.b = executorService;
        executorService.execute(new androidx.activity.i(this, 24));
    }

    public e(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new ArrayList();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            default:
                this.b = new ArrayDeque();
                break;
        }
    }

    public e(f0 f0Var, Object obj, Object obj2, Object[] objArr) {
        this.a = 2;
        this.e = f0Var;
        this.b = obj;
        this.c = obj2;
        this.d = objArr;
    }

    public e(Context context, ActionMode.Callback callback) {
        this.a = 5;
        this.c = context;
        this.b = callback;
        this.d = new ArrayList();
        this.e = new k(0);
    }

    public e(v0 v0Var, Object obj) {
        this.a = 9;
        this.e = v0Var;
        this.c = v0Var.a(null);
        this.d = new o3.l(v0Var.d.c, 0, null);
        this.b = obj;
    }

    public e(yf.e eVar) {
        this.a = 13;
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        this.e = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        if (eVar.B) {
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
        linearLayout.addView(textView2, c6.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        t5 t5Var = new t5(eVar.getContext());
        this.b = t5Var;
        linearLayout.addView(t5Var, c6.n(-1, -2));
        textView2.setGravity(8388611);
        t5Var.setGravity(8388613);
        t5Var.setTypeface(AndroidUtilities.bold());
        t5Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }
}
