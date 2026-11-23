package q4;

import ab.c0;
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
import android.media.MediaExtractor;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import c8.z;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import gb.i1;
import gb.j1;
import gb.v0;
import h9.s1;
import hi.p7;
import hi.q7;
import hi.u0;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l.a0;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import r0.i0;
import r0.l0;
import r0.l1;
import s4.s0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class q implements SuccessContinuation, r0.m, ce.c, OnCompleteListener, ib.b, g9.k, p7, i6.a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ q(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    public static String g(q qVar) {
        Collection<String> collection = (Collection) qVar.c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) qVar.b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
            sb2.append("/");
            sb2.append(upperCase);
        }
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str == null) {
                sb2.append("/");
            }
            sb2.append("/");
            boolean z10 = true;
            for (String str2 : collection) {
                j6.a.b(str2);
                if (!z10) {
                    sb2.append(",");
                }
                if (!j6.a.a.matcher(str2).matches()) {
                    StringBuilder sb3 = new StringBuilder(str2.length());
                    for (int i7 = 0; i7 < str2.length(); i7++) {
                        char charAt = str2.charAt(i7);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb3.append(charAt);
                        }
                    }
                    str2 = sb3.toString();
                }
                sb2.append(str2);
                z10 = false;
            }
        }
        if (str == null && collection == null) {
            sb2.append("/");
        }
        if (collection == null) {
            sb2.append("/");
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    @Override // ce.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object J(ce.d dVar, kd.c cVar) {
        ce.i iVar;
        jd.a aVar;
        int i7;
        Throwable th2;
        de.h hVar;
        q qVar;
        ce.d dVar2;
        ce.c cVar2;
        switch (this.a) {
            case 10:
                if (cVar instanceof ce.i) {
                    iVar = (ce.i) cVar;
                    int i10 = iVar.b;
                    if ((i10 & TLObject.FLAG_31) != 0) {
                        iVar.b = i10 - TLObject.FLAG_31;
                        Object obj = iVar.a;
                        aVar = jd.a.a;
                        i7 = iVar.b;
                        if (i7 != 0) {
                            z.b(obj);
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
                                z.b(obj);
                                return gd.k.a;
                            }
                            hVar = iVar.f;
                            dVar2 = iVar.e;
                            qVar = iVar.d;
                            try {
                                z.b(obj);
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
                        if (cVar2.J(dVar2, iVar) == aVar) {
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
                if (cVar2.J(dVar2, iVar) == aVar) {
                }
                return gd.k.a;
            default:
                Object J = ((wf.b) this.b).J(new ce.o(new kotlin.jvm.internal.o(), dVar, (ka.b) this.c), cVar);
                return J == jd.a.a ? J : gd.k.a;
        }
    }

    public f3.o a(Object... objArr) {
        Constructor b10;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    b10 = ((ci.v) this.b).b();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            b10 = null;
        }
        if (b10 == null) {
            return null;
        }
        try {
            return (f3.o) b10.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        return ((g9.k) ((h6.o) this.b).b).apply(obj);
    }

    public synchronized Map b() {
        try {
            if (((Map) this.c) == null) {
                this.c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.c;
    }

    public void c(k.a aVar) {
        c0 c0Var = (c0) this.b;
        ((ActionMode.Callback) c0Var.b).onDestroyActionMode(c0Var.o(aVar));
        g.s sVar = (g.s) this.c;
        if (sVar.F != null) {
            sVar.f.getDecorView().removeCallbacks(sVar.G);
        }
        if (sVar.E != null) {
            l0 l0Var = sVar.H;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a10 = i0.a(sVar.E);
            a10.a(0.0f);
            sVar.H = a10;
            a10.d(new g.j(this, 2));
        }
        sVar.y = null;
        ViewGroup viewGroup = sVar.K;
        WeakHashMap weakHashMap = i0.a;
        r0.y.c(viewGroup);
        sVar.y();
    }

    public boolean d(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.s) this.c).K;
        WeakHashMap weakHashMap = i0.a;
        r0.y.c(viewGroup);
        c0 c0Var = (c0) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) c0Var.b;
        k.e o4 = c0Var.o(aVar);
        a0.l lVar = (a0.l) c0Var.e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) c0Var.c, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(o4, menu2);
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
                    ((b) lVar.f.getBroadcastItem(beginBroadcast)).T0(wVar);
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

    @Override // fd.a
    public Object get() {
        return new v0((i1) ((ib.c) this.b).get(), (j1) ((ib.c) this.c).get());
    }

    @Override // hi.p7
    public String l() {
        return "tg|" + ((Uri) this.b).getQueryParameter("id") + "|" + ((Long) this.c);
    }

    @Override // r0.m
    public l1 l1(View view, l1 l1Var) {
        c5.l lVar = (c5.l) this.c;
        l1 g10 = i0.g(view, l1Var);
        if (g10.a.n()) {
            return g10;
        }
        Rect rect = (Rect) this.b;
        rect.left = g10.b();
        rect.top = g10.d();
        rect.right = g10.c();
        rect.bottom = g10.a();
        int childCount = lVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            l1 b10 = i0.b(lVar.getChildAt(i7), g10);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return g10.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // hi.p7
    public Closeable o(MediaExtractor mediaExtractor) {
        q7 q7Var = new q7(((Long) this.c).longValue(), (Uri) this.b);
        mediaExtractor.setDataSource(q7Var);
        return q7Var;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d9.c cVar = (d9.c) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        synchronized (cVar.f) {
            cVar.e.remove(taskCompletionSource);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FileWriter fileWriter;
        switch (this.a) {
            case 3:
                Boolean bool = (Boolean) obj;
                aa.p pVar = (aa.p) this.c;
                if (bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                    }
                    boolean booleanValue = bool.booleanValue();
                    aa.w wVar = pVar.b;
                    if (booleanValue) {
                        wVar.h.trySetResult(null);
                        return ((Task) this.b).onSuccessTask(pVar.e.a, new d6.i(this, 1));
                    }
                    wVar.getClass();
                    throw new IllegalStateException("An invalid data collection token was used.");
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = ga.d.e(((File) pVar.g.c).listFiles(aa.p.r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                ga.d dVar = pVar.m.b.b;
                ga.b.b(ga.d.e(((File) dVar.e).listFiles()));
                ga.b.b(ga.d.e(((File) dVar.f).listFiles()));
                ga.b.b(ga.d.e(((File) dVar.h).listFiles()));
                pVar.q.trySetResult(null);
                return Tasks.forResult(null);
            default:
                ia.c cVar = (ia.c) this.c;
                JSONObject jSONObject = (JSONObject) ((ba.e) this.b).c.a.submit(new aa.s(this, 2)).get();
                FileWriter fileWriter2 = null;
                if (jSONObject != null) {
                    ia.b D0 = ((u0) cVar.c).D0(jSONObject);
                    ze.b bVar = (ze.b) cVar.e;
                    long j3 = D0.c;
                    bVar.getClass();
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
                    }
                    try {
                        jSONObject.put("expires_at", j3);
                        fileWriter = new FileWriter((File) bVar.a);
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
                            ((AtomicReference) cVar.h).set(D0);
                            ((TaskCompletionSource) ((AtomicReference) cVar.i).get()).trySetResult(D0);
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
                    ((AtomicReference) cVar.h).set(D0);
                    ((TaskCompletionSource) ((AtomicReference) cVar.i).get()).trySetResult(D0);
                }
                return Tasks.forResult(null);
        }
    }

    @Override // i6.a
    public void w(Bitmap bitmap) {
        wf.b bVar = (wf.b) this.b;
        bVar.c = bitmap;
        i6.f fVar = (i6.f) this.c;
        fVar.l = bVar;
        fVar.b();
    }

    public /* synthetic */ q(int i7, boolean z10) {
        this.a = i7;
    }

    public q(Context context) {
        this.a = 14;
        this.b = context;
    }

    public /* synthetic */ q(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    public q(int i7) {
        this.a = i7;
        switch (i7) {
            case 15:
                this.b = new ConcurrentHashMap(16, 0.75f, 10);
                this.c = new ReferenceQueue();
                break;
            case 29:
                this.b = new HashMap();
                break;
            default:
                this.b = new AtomicInteger();
                this.c = new AtomicInteger();
                break;
        }
    }

    public q(Animation animation) {
        this.a = 6;
        this.b = animation;
        this.c = null;
    }

    public q(Animator animator) {
        this.a = 6;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    public q(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 23;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            ((int[]) this.b)[i7] = ((Integer) arrayList.get(i7)).intValue();
            ((float[]) this.c)[i7] = ((Float) arrayList2.get(i7)).floatValue();
        }
    }

    public q(int i7, int i10) {
        this.a = 23;
        this.b = new int[]{i7, i10};
        this.c = new float[]{0.0f, 1.0f};
    }

    public q(int i7, int i10, int i11) {
        this.a = 23;
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

    public q(s1 s1Var, int[] iArr) {
        this.a = 26;
        this.b = h9.i0.q(s1Var);
        this.c = iArr;
    }

    public q(c5.l lVar) {
        this.a = 8;
        this.c = lVar;
        this.b = new Rect();
    }

    public q(ci.v vVar) {
        this.a = 18;
        this.b = vVar;
        this.c = new AtomicBoolean(false);
    }
}
