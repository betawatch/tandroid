package za;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import w7.z8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class m0 extends Handler {
    public boolean a;
    public long b;
    public final ArrayList c;

    public m0(Looper looper) {
        super(looper);
        this.c = new ArrayList();
    }

    public final void a(Messenger messenger) {
        if (this.a) {
            Object b10 = k9.h.c().b(j0.class);
            kotlin.jvm.internal.i.d(b10, "Firebase.app[SessionGenerator::class.java]");
            c(messenger, ((j0) b10).b().a);
            return;
        }
        Object b11 = k9.h.c().b(s.class);
        kotlin.jvm.internal.i.d(b11, "Firebase.app[SessionDatastore::class.java]");
        m mVar = (m) ((z) ((s) b11)).c.get();
        String str = mVar != null ? mVar.a : null;
        Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + str);
        if (str != null) {
            c(messenger, str);
        }
    }

    public final void b() {
        Object b10 = k9.h.c().b(j0.class);
        kotlin.jvm.internal.i.d(b10, "Firebase.app[SessionGenerator::class.java]");
        j0 j0Var = (j0) b10;
        int i10 = j0Var.d + 1;
        j0Var.d = i10;
        String a2 = i10 == 0 ? j0Var.c : j0Var.a();
        String str = j0Var.c;
        int i11 = j0Var.d;
        j0Var.a.getClass();
        j0Var.e = new a0(i11, System.currentTimeMillis() * 1000, a2, str);
        j0Var.b();
        StringBuilder sb2 = new StringBuilder("Generated new session ");
        Object b11 = k9.h.c().b(j0.class);
        kotlin.jvm.internal.i.d(b11, "Firebase.app[SessionGenerator::class.java]");
        sb2.append(((j0) b11).b().a);
        Log.d("SessionLifecycleService", sb2.toString());
        StringBuilder sb3 = new StringBuilder("Broadcasting new session: ");
        Object b12 = k9.h.c().b(j0.class);
        kotlin.jvm.internal.i.d(b12, "Firebase.app[SessionGenerator::class.java]");
        sb3.append(((j0) b12).b());
        Log.d("SessionLifecycleService", sb3.toString());
        Object b13 = k9.h.c().b(d0.class);
        kotlin.jvm.internal.i.d(b13, "Firebase.app[SessionFirelogPublisher::class.java]");
        Object b14 = k9.h.c().b(j0.class);
        kotlin.jvm.internal.i.d(b14, "Firebase.app[SessionGenerator::class.java]");
        h0 h0Var = (h0) ((d0) b13);
        id.c cVar = null;
        zd.e0.q(zd.e0.b(h0Var.e), new f0(h0Var, ((j0) b14).b(), null));
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            Messenger it = (Messenger) obj;
            kotlin.jvm.internal.i.d(it, "it");
            a(it);
        }
        Object b15 = k9.h.c().b(s.class);
        kotlin.jvm.internal.i.d(b15, "Firebase.app[SessionDatastore::class.java]");
        Object b16 = k9.h.c().b(j0.class);
        kotlin.jvm.internal.i.d(b16, "Firebase.app[SessionGenerator::class.java]");
        String sessionId = ((j0) b16).b().a;
        z zVar = (z) ((s) b15);
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        zd.e0.q(zd.e0.b(zVar.b), new bb.i(zVar, sessionId, cVar, 5));
    }

    public final void c(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message obtain = Message.obtain(null, 3, 0, 0);
            obtain.setData(bundle);
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
            Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
            this.c.remove(messenger);
        } catch (Exception e) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0124, code lost:
    
        if (yd.a.b(r9) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0153, code lost:
    
        if (yd.a.b(r9) == false) goto L44;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message msg) {
        long a2;
        kotlin.jvm.internal.i.e(msg, "msg");
        if (this.b > msg.getWhen()) {
            Log.d("SessionLifecycleService", "Ignoring old message from " + msg.getWhen() + " which is older than " + this.b + '.');
            return;
        }
        int i10 = msg.what;
        if (i10 != 1) {
            if (i10 == 2) {
                Log.d("SessionLifecycleService", "Activity backgrounding at " + msg.getWhen());
                this.b = msg.getWhen();
                return;
            }
            if (i10 != 4) {
                Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + msg);
                super.handleMessage(msg);
                return;
            }
            Messenger messenger = msg.replyTo;
            ArrayList arrayList = this.c;
            arrayList.add(messenger);
            Messenger messenger2 = msg.replyTo;
            kotlin.jvm.internal.i.d(messenger2, "msg.replyTo");
            a(messenger2);
            Log.d("SessionLifecycleService", "Client " + msg.replyTo + " bound at " + msg.getWhen() + ". Clients: " + arrayList.size());
            return;
        }
        Log.d("SessionLifecycleService", "Activity foregrounding at " + msg.getWhen() + '.');
        if (this.a) {
            long when = msg.getWhen() - this.b;
            bb.h.c.getClass();
            Object b10 = k9.h.c().b(bb.h.class);
            kotlin.jvm.internal.i.d(b10, "Firebase.app[SessionsSettings::class.java]");
            bb.h hVar = (bb.h) b10;
            Bundle bundle = (Bundle) hVar.a.b;
            yd.a aVar = null;
            yd.a aVar2 = bundle.containsKey("firebase_sessions_sessions_restart_timeout") ? new yd.a(z8.a(bundle.getInt("firebase_sessions_sessions_restart_timeout"), yd.c.d)) : null;
            if (aVar2 != null) {
                a2 = aVar2.a;
                int i11 = yd.a.d;
                if (a2 > 0) {
                }
            }
            bb.e eVar = hVar.b.c.b;
            if (eVar == null) {
                kotlin.jvm.internal.i.h("sessionConfigs");
                throw null;
            }
            Integer num = eVar.c;
            if (num != null) {
                int i12 = yd.a.d;
                aVar = new yd.a(z8.a(num.intValue(), yd.c.d));
            }
            if (aVar != null) {
                a2 = aVar.a;
                int i13 = yd.a.d;
                if (a2 > 0) {
                }
            }
            int i14 = yd.a.d;
            a2 = z8.a(30, yd.c.e);
            if (when > (((((int) a2) & 1) != 1 || yd.a.b(a2)) ? yd.a.c(a2, yd.c.c) : a2 >> 1)) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                b();
            }
        } else {
            Log.d("SessionLifecycleService", "Cold start detected.");
            this.a = true;
            b();
        }
        this.b = msg.getWhen();
    }
}
