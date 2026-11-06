package q4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f6.e0;
import g6.d0;
import h9.f1;
import h9.t1;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileWriter;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l.a0;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import r0.i0;
import r0.k1;
import r0.l0;
import s4.s0;
import zd.b0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class q implements SuccessContinuation, r0.m, ce.c, OnCompleteListener, lf.b, f5.y, com.google.android.gms.common.api.internal.p, ib.b, g9.k, i6.a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ q(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    @Override // ce.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B(ce.d dVar, kd.c cVar) {
        ce.i iVar;
        jd.a aVar;
        int i7;
        Throwable th2;
        de.h hVar;
        q qVar;
        ce.d dVar2;
        ce.c cVar2;
        switch (this.a) {
            case 11:
                if (cVar instanceof ce.i) {
                    iVar = (ce.i) cVar;
                    int i10 = iVar.b;
                    if ((i10 & TLObject.FLAG_31) != 0) {
                        iVar.b = i10 - TLObject.FLAG_31;
                        Object obj = iVar.a;
                        aVar = jd.a.a;
                        i7 = iVar.b;
                        if (i7 != 0) {
                            af.b.c(obj);
                            de.h hVar2 = new de.h(dVar, iVar.getContext());
                            try {
                                m1.m mVar = (m1.m) this.b;
                                iVar.d = this;
                                iVar.e = dVar;
                                iVar.f = hVar2;
                                iVar.b = 1;
                                if (mVar.invoke(hVar2, iVar) == aVar) {
                                    return aVar;
                                }
                                qVar = this;
                                dVar2 = dVar;
                                hVar = hVar2;
                            } catch (Throwable th3) {
                                th2 = th3;
                                hVar = hVar2;
                                hVar.releaseIntercepted();
                                throw th2;
                            }
                        } else {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                af.b.c(obj);
                                return gd.k.a;
                            }
                            hVar = iVar.f;
                            dVar2 = iVar.e;
                            qVar = iVar.d;
                            try {
                                af.b.c(obj);
                            } catch (Throwable th4) {
                                th2 = th4;
                                hVar.releaseIntercepted();
                                throw th2;
                            }
                        }
                        hVar.releaseIntercepted();
                        cVar2 = (ce.c) qVar.c;
                        iVar.d = null;
                        iVar.e = null;
                        iVar.f = null;
                        iVar.b = 2;
                        if (cVar2.B(dVar2, iVar) == aVar) {
                            return aVar;
                        }
                        return gd.k.a;
                    }
                }
                iVar = new ce.i(this, cVar);
                Object obj2 = iVar.a;
                aVar = jd.a.a;
                i7 = iVar.b;
                if (i7 != 0) {
                }
                hVar.releaseIntercepted();
                cVar2 = (ce.c) qVar.c;
                iVar.d = null;
                iVar.e = null;
                iVar.f = null;
                iVar.b = 2;
                if (cVar2.B(dVar2, iVar) == aVar) {
                }
                return gd.k.a;
            default:
                Object B = ((wf.b) this.b).B(new ce.o(new kotlin.jvm.internal.o(), dVar, (ka.b) this.c), cVar);
                return B == jd.a.a ? B : gd.k.a;
        }
    }

    @Override // r0.m
    public k1 S0(View view, k1 k1Var) {
        c5.k kVar = (c5.k) this.c;
        k1 g10 = i0.g(view, k1Var);
        if (g10.a.n()) {
            return g10;
        }
        Rect rect = (Rect) this.b;
        rect.left = g10.b();
        rect.top = g10.d();
        rect.right = g10.c();
        rect.bottom = g10.a();
        int childCount = kVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            k1 b10 = i0.b(kVar.getChildAt(i7), g10);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return g10.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    public f5.d a() {
        if (((f5.l) this.b) != null) {
            return new f5.d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        e0 e0Var = (e0) this.b;
        String str = (String) this.c;
        j6.w wVar = (j6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        q6.m.i("Not connected to device", e0Var.G == 2);
        j6.f fVar = (j6.f) wVar.n();
        Parcel P0 = fVar.P0();
        P0.writeString(str);
        fVar.U0(P0, 5);
        synchronized (e0Var.t) {
            try {
                if (e0Var.q != null) {
                    taskCompletionSource.setException(q6.m.l(new Status(2001, null, null, null)));
                } else {
                    e0Var.q = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        return ((g9.k) ((d0) this.b).b).apply(obj);
    }

    @Override // lf.b
    public lf.a b(wf.b bVar) {
        List list = (List) this.c;
        List list2 = (List) bVar.b;
        int size = list2 != null ? list2.size() : 0;
        if (size > 0) {
            ArrayList arrayList = new ArrayList(list.size() + size);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new ed.i(bVar, (List) this.b, list);
    }

    public void c(k.a aVar) {
        ui.e eVar = (ui.e) this.b;
        ((ActionMode.Callback) eVar.b).onDestroyActionMode(eVar.r(aVar));
        g.s sVar = (g.s) this.c;
        if (sVar.E != null) {
            sVar.f.getDecorView().removeCallbacks(sVar.F);
        }
        if (sVar.D != null) {
            l0 l0Var = sVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a10 = i0.a(sVar.D);
            a10.a(0.0f);
            sVar.G = a10;
            a10.d(new g.j(this, 2));
        }
        sVar.y = null;
        ViewGroup viewGroup = sVar.J;
        WeakHashMap weakHashMap = i0.a;
        r0.y.c(viewGroup);
        sVar.w();
    }

    public boolean d(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.s) this.c).J;
        WeakHashMap weakHashMap = i0.a;
        r0.y.c(viewGroup);
        ui.e eVar = (ui.e) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) eVar.b;
        k.e r10 = eVar.r(aVar);
        a0.l lVar = (a0.l) eVar.e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) eVar.c, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(r10, menu2);
    }

    public void e(android.support.v4.media.session.s sVar, Handler handler) {
        l lVar = (l) this.b;
        synchronized (lVar.d) {
            lVar.l = sVar;
            lVar.a.setCallback((android.support.v4.media.session.r) sVar.e, handler);
            sVar.d0(lVar, handler);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.List] */
    public void f(w wVar) {
        l lVar = (l) this.b;
        lVar.g = wVar;
        synchronized (lVar.d) {
            for (int beginBroadcast = lVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) lVar.f.getBroadcastItem(beginBroadcast)).x0(wVar);
                } catch (RemoteException | SecurityException e10) {
                    h2.a.d("MediaSessionCompat", "Dead object in setPlaybackState.", e10);
                }
            }
            lVar.f.finishBroadcast();
        }
        MediaSession mediaSession = lVar.a;
        if (wVar.x == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(wVar.a, wVar.b, wVar.d, wVar.n);
            builder.setBufferedPosition(wVar.c);
            builder.setActions(wVar.e);
            builder.setErrorMessage(wVar.h);
            for (v vVar : wVar.r) {
                vVar.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(vVar.a, vVar.b, vVar.c);
                builder2.setExtras(vVar.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(wVar.s);
            builder.setExtras(wVar.w);
            wVar.x = builder.build();
        }
        mediaSession.setPlaybackState(wVar.x);
    }

    public void g(f5.l lVar) {
        this.b = lVar;
        if (lVar.a() != null) {
            lVar.a().getClass();
            String str = lVar.a().d;
            if (str != null) {
                this.c = str;
            }
        }
    }

    @Override // fd.a
    public Object get() {
        Context appContext = (Context) ((d9.o) this.b).a;
        id.h blockingDispatcher = (id.h) ((ib.c) this.c).get();
        kotlin.jvm.internal.j.e(appContext, "appContext");
        kotlin.jvm.internal.j.e(blockingDispatcher, "blockingDispatcher");
        return gb.r.a(jb.j.a, new f1(new gb.p(0), 15), b0.b(blockingDispatcher), new gb.q(appContext, 0));
    }

    public void h(g3 g3Var) {
        try {
            o(g3Var, (p3) this.b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void i(g3 g3Var, int i7, long j3) {
        try {
            o3 o3Var = (o3) ((p3) this.b).g();
            o3Var.c();
            p3.p((p3) o3Var.b, i7);
            p3 p3Var = (p3) o3Var.a();
            this.b = p3Var;
            if (j3 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.b, j3);
                p3Var = (p3) o3Var2.a();
            }
            o(g3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void j(g3 g3Var, long j3, boolean z9) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.b, z9);
            f3Var.c();
            g3.r((g3) f3Var.b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.b;
            } else {
                o3 o3Var = (o3) ((p3) this.b).g();
                o3Var.c();
                p3.r((p3) o3Var.b, j3);
                p3Var = (p3) o3Var.a();
            }
            o(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void k(g3 g3Var, int i7, long j3, boolean z9) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.b).g();
            o3Var.c();
            p3.p((p3) o3Var.b, i7);
            this.b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.b, z9);
            f3Var.c();
            g3.r((g3) f3Var.b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.b, j3);
                p3Var = (p3) o3Var2.a();
            }
            o(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void l(l3 l3Var) {
        try {
            w3 t6 = x3.t();
            t6.d((p3) this.b);
            t6.c();
            x3.p((x3) t6.b, l3Var);
            ((ca.i) this.c).m((x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void m(a4 a4Var) {
        try {
            ca.i iVar = (ca.i) this.c;
            w3 t6 = x3.t();
            t6.d((p3) this.b);
            t6.c();
            x3.r((x3) t6.b, a4Var);
            iVar.m((x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void n(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t6 = x3.t();
            t6.d((p3) this.b);
            t6.c();
            x3.s((x3) t6.b, b4Var);
            ((ca.i) this.c).m((x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void o(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t6 = x3.t();
            t6.d(p3Var);
            t6.c();
            x3.n((x3) t6.b, g3Var);
            ((ca.i) this.c).m((x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d9.c cVar = (d9.c) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        synchronized (cVar.f) {
            cVar.e.remove(taskCompletionSource);
        }
    }

    @Override // i6.a
    public void p(Bitmap bitmap) {
        wf.b bVar = (wf.b) this.b;
        bVar.c = bitmap;
        i6.f fVar = (i6.f) this.c;
        fVar.l = bVar;
        fVar.b();
    }

    public void q(i3 i3Var, p3 p3Var) {
        try {
            w3 t6 = x3.t();
            t6.d(p3Var);
            t6.c();
            x3.o((x3) t6.b, i3Var);
            ((ca.i) this.c).m((x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FileWriter fileWriter;
        switch (this.a) {
            case 3:
                Boolean bool = (Boolean) obj;
                aa.q qVar = (aa.q) this.c;
                if (bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                    }
                    boolean booleanValue = bool.booleanValue();
                    aa.x xVar = qVar.b;
                    if (booleanValue) {
                        xVar.h.trySetResult(null);
                        return ((Task) this.b).onSuccessTask(qVar.e.a, new d6.i(this, 2));
                    }
                    xVar.getClass();
                    throw new IllegalStateException("An invalid data collection token was used.");
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = ga.d.i(((File) qVar.g.d).listFiles(aa.q.r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                ga.d dVar = qVar.m.b.b;
                ga.b.b(ga.d.i(((File) dVar.f).listFiles()));
                ga.b.b(ga.d.i(((File) dVar.h).listFiles()));
                ga.b.b(ga.d.i(((File) dVar.n).listFiles()));
                qVar.q.trySetResult(null);
                return Tasks.forResult(null);
            default:
                ia.c cVar = (ia.c) this.c;
                JSONObject jSONObject = (JSONObject) ((ba.e) this.b).c.a.submit(new aa.t(this, 2)).get();
                FileWriter fileWriter2 = null;
                if (jSONObject != null) {
                    ia.b y10 = ((gf.g) cVar.c).y(jSONObject);
                    f1 f1Var = (f1) cVar.e;
                    long j3 = y10.c;
                    f1Var.getClass();
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
                    }
                    try {
                        jSONObject.put("expires_at", j3);
                        fileWriter = new FileWriter((File) f1Var.b);
                        try {
                            try {
                                fileWriter.write(jSONObject.toString());
                                fileWriter.flush();
                            } catch (Throwable th2) {
                                th = th2;
                                fileWriter2 = fileWriter;
                                aa.g.b(fileWriter2, "Failed to close settings writer.");
                                throw th;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                            aa.g.b(fileWriter, "Failed to close settings writer.");
                            ia.c.d("Loaded settings: ", jSONObject);
                            String str = (String) ((ia.e) cVar.b).f;
                            SharedPreferences.Editor edit = ((Context) cVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                            edit.putString("existing_instance_identifier", str);
                            edit.apply();
                            ((AtomicReference) cVar.h).set(y10);
                            ((TaskCompletionSource) ((AtomicReference) cVar.i).get()).trySetResult(y10);
                            return Tasks.forResult(null);
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileWriter = null;
                    } catch (Throwable th3) {
                        th = th3;
                        aa.g.b(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                    aa.g.b(fileWriter, "Failed to close settings writer.");
                    ia.c.d("Loaded settings: ", jSONObject);
                    String str2 = (String) ((ia.e) cVar.b).f;
                    SharedPreferences.Editor edit2 = ((Context) cVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit2.putString("existing_instance_identifier", str2);
                    edit2.apply();
                    ((AtomicReference) cVar.h).set(y10);
                    ((TaskCompletionSource) ((AtomicReference) cVar.i).get()).trySetResult(y10);
                }
                return Tasks.forResult(null);
        }
    }

    public /* synthetic */ q(int i7, boolean z9) {
        this.a = i7;
    }

    public q(Context context) {
        this.a = 14;
        this.b = context;
    }

    public /* synthetic */ q(Object obj, Object obj2, boolean z9, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    public q(Context context, p3 p3Var) {
        this.a = 21;
        ca.i iVar = new ca.i(2);
        try {
            o5.s.b(context);
            iVar.c = o5.s.a().c(m5.a.e).a("PLAY_BILLING_LIBRARY", new l5.c("proto"), new w7.s(8, false));
        } catch (Throwable unused) {
            iVar.b = true;
        }
        this.c = iVar;
        this.b = p3Var;
    }

    public q(int i7) {
        this.a = i7;
        switch (i7) {
            case 15:
                this.b = new ConcurrentHashMap(16, 0.75f, 10);
                this.c = new ReferenceQueue();
                break;
            default:
                this.b = new AtomicInteger();
                this.c = new AtomicInteger();
                break;
        }
    }

    public q(Animation animation) {
        this.a = 7;
        this.b = animation;
        this.c = null;
    }

    public q(Animator animator) {
        this.a = 7;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    public q(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 25;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            ((int[]) this.b)[i7] = ((Integer) arrayList.get(i7)).intValue();
            ((float[]) this.c)[i7] = ((Float) arrayList2.get(i7)).floatValue();
        }
    }

    public q(int i7, int i10) {
        this.a = 25;
        this.b = new int[]{i7, i10};
        this.c = new float[]{0.0f, 1.0f};
    }

    public q(int i7, int i10, int i11) {
        this.a = 25;
        this.b = new int[]{i7, i10, i11};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public q(d3.e eVar) {
        this.a = 16;
        this.c = eVar;
    }

    public q(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i7 = s0.b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    if (queryBroadcastReceivers.size() > 1) {
                        h2.a.l("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                    }
                    componentName = null;
                }
                if (componentName == null) {
                    h2.a.g("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                this.b = new n(context, str, bundle);
            } else if (i10 >= 28) {
                this.b = new m(context, str, bundle);
            } else {
                this.b = new l(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            e(new j(1), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((l) this.b).a.setMediaButtonReceiver(pendingIntent);
            p pVar = ((l) this.b).c;
            u uVar = new u();
            DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                uVar.a = new g(context, pVar);
            } else {
                uVar.a = new f(context, pVar);
            }
            this.c = uVar;
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public q(t1 t1Var, int[] iArr) {
        this.a = 27;
        this.b = h9.i0.q(t1Var);
        this.c = iArr;
    }

    public q(c5.k kVar) {
        this.a = 9;
        this.c = kVar;
        this.b = new Rect();
    }
}
