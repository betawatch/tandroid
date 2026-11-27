// default package

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class y3d {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final h5d b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final p5d i;
    public t8a m;
    public IInterface n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final l5d k = new IBinder.DeathRecipient() { // from class: l5d
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            y3d y3dVar = y3d.this;
            int i = 0;
            y3dVar.b.b("reportBinderDeath", new Object[0]);
            if (y3dVar.j.get() != null) {
                grb.o();
                return;
            }
            y3dVar.b.b("%s : Binder has died.", y3dVar.c);
            ArrayList arrayList = y3dVar.d;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((j5d) obj).a(new RemoteException(String.valueOf(y3dVar.c).concat(" : Binder has died.")));
            }
            y3dVar.d.clear();
            synchronized (y3dVar.f) {
                y3dVar.e();
            }
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [l5d] */
    public y3d(Context context, h5d h5dVar, String str, Intent intent, p5d p5dVar) {
        this.a = context;
        this.b = h5dVar;
        this.c = str;
        this.h = intent;
        this.i = p5dVar;
    }

    public static void b(y3d y3dVar, j5d j5dVar) {
        IInterface iInterface = y3dVar.n;
        h5d h5dVar = y3dVar.b;
        ArrayList arrayList = y3dVar.d;
        int i = 0;
        if (iInterface != null || y3dVar.g) {
            if (!y3dVar.g) {
                j5dVar.run();
                return;
            } else {
                h5dVar.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(j5dVar);
                return;
            }
        }
        h5dVar.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(j5dVar);
        t8a t8aVar = new t8a(y3dVar, (byte) 1);
        y3dVar.m = t8aVar;
        y3dVar.g = true;
        if (y3dVar.a.bindService(y3dVar.h, t8aVar, 1)) {
            return;
        }
        h5dVar.b("Failed to bind to the service.", new Object[0]);
        y3dVar.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((j5d) obj).a(new z3d("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = o;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.c)) {
                HandlerThread handlerThread = new HandlerThread(this.c, 10);
                handlerThread.start();
                hashMap.put(this.c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.c);
        }
        return handler;
    }

    public final void c(j5d j5dVar, TaskCompletionSource taskCompletionSource) {
        a().post(new n5d(this, j5dVar.c(), taskCompletionSource, j5dVar));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new x3d(this, (byte) 1));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
