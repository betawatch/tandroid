package p5;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
import l3.g0;
import o5.e0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends f {
    public static final s5.b m = new s5.b("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final q e;
    public final b f;
    public final com.google.android.gms.internal.cast.q g;
    public final r5.h h;
    public e0 i;
    public q5.h j;
    public CastDevice k;
    public o4 l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.q qVar, r5.h hVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = bVar;
        this.g = qVar;
        this.h = hVar;
        j6.a f9 = f();
        j jVar = new j(this);
        s5.b bVar2 = com.google.android.gms.internal.cast.e.a;
        q qVar2 = null;
        if (f9 != null) {
            try {
                qVar2 = com.google.android.gms.internal.cast.e.b(context).U0(bVar, f9, jVar);
            } catch (RemoteException | d e10) {
                com.google.android.gms.internal.cast.e.a.a(e10, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.e = qVar2;
    }

    public static void g(c cVar, int i10) {
        r5.h hVar = cVar.h;
        if (hVar.q) {
            hVar.q = false;
            q5.h hVar2 = hVar.n;
            if (hVar2 != null) {
                c0 c0Var = hVar.m;
                z5.l.e("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar2.i.remove(c0Var);
                }
            }
            hVar.c.J0(null);
            a5.j jVar = hVar.h;
            if (jVar != null) {
                jVar.x();
                jVar.e = null;
            }
            a5.j jVar2 = hVar.i;
            if (jVar2 != null) {
                jVar2.x();
                jVar2.e = null;
            }
            android.support.v4.media.session.d0 d0Var = hVar.p;
            if (d0Var != null) {
                d0Var.d(null, null);
                hVar.p.e(new MediaMetadataCompat(new Bundle()));
                hVar.j(0, null);
            }
            android.support.v4.media.session.d0 d0Var2 = hVar.p;
            if (d0Var2 != null) {
                d0Var2.c(false);
                hVar.p.b();
                hVar.p = null;
            }
            hVar.n = null;
            hVar.o = null;
            hVar.h();
            if (i10 == 0) {
                hVar.i();
            }
        }
        e0 e0Var = cVar.i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
            b10.c = o5.z.b;
            b10.a = 8403;
            e0Var.e(1, b10.b());
            e0Var.h();
            com.google.android.gms.common.api.internal.n nVar = za.c.i(e0Var.f, e0Var.k, "castDeviceControllerListenerKey").c;
            z5.l.i(nVar, "Key must not be null");
            e0Var.c(nVar, 8415);
            cVar.i = null;
        }
        cVar.k = null;
        q5.h hVar3 = cVar.j;
        if (hVar3 != null) {
            hVar3.v(null);
            cVar.j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        s5.b bVar = m;
        q qVar = cVar.e;
        if (qVar == null) {
            return;
        }
        int i10 = 0;
        try {
            if (!task.isSuccessful()) {
                Exception exception = task.getException();
                if (!(exception instanceof com.google.android.gms.common.api.f)) {
                    o oVar = (o) qVar;
                    Parcel M0 = oVar.M0();
                    M0.writeInt(2476);
                    oVar.Q0(M0, 5);
                    return;
                }
                int statusCode = ((com.google.android.gms.common.api.f) exception).getStatusCode();
                o oVar2 = (o) qVar;
                Parcel M02 = oVar2.M0();
                M02.writeInt(statusCode);
                oVar2.Q0(M02, 5);
                return;
            }
            s5.u uVar = (s5.u) task.getResult();
            Status status = uVar.a;
            if (!status.b()) {
                bVar.b("%s() -> failure result", str);
                int i11 = status.a;
                o oVar3 = (o) qVar;
                Parcel M03 = oVar3.M0();
                M03.writeInt(i11);
                oVar3.Q0(M03, 5);
                return;
            }
            bVar.b("%s() -> success result", str);
            q5.h hVar = new q5.h(new s5.n());
            cVar.j = hVar;
            hVar.v(cVar.i);
            cVar.j.p(new c0(cVar, i10));
            cVar.j.u();
            r5.h hVar2 = cVar.h;
            q5.h hVar3 = cVar.j;
            z5.l.e("Must be called from the main thread.");
            hVar2.a(hVar3, cVar.k);
            o5.d dVar = uVar.b;
            z5.l.h(dVar);
            String str2 = uVar.c;
            String str3 = uVar.d;
            z5.l.h(str3);
            boolean z10 = uVar.e;
            o oVar4 = (o) qVar;
            Parcel M04 = oVar4.M0();
            com.google.android.gms.internal.cast.u.c(M04, dVar);
            M04.writeString(str2);
            M04.writeString(str3);
            M04.writeInt(z10 ? 1 : 0);
            oVar4.Q0(M04, 4);
        } catch (RemoteException e10) {
            bVar.a(e10, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Bundle bundle) {
        boolean z10;
        s5.b bVar = f.b;
        x xVar = this.a;
        CastDevice b10 = CastDevice.b(bundle);
        this.k = b10;
        int i10 = 1;
        if (b10 != null) {
            e0 e0Var = this.i;
            if (e0Var != null) {
                com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
                b11.c = o5.z.b;
                b11.a = 8403;
                e0Var.e(1, b11.b());
                e0Var.h();
                com.google.android.gms.common.api.internal.n nVar = za.c.i(e0Var.f, e0Var.k, "castDeviceControllerListenerKey").c;
                z5.l.i(nVar, "Key must not be null");
                e0Var.c(nVar, 8415);
                this.i = null;
            }
            m.b("Acquiring a connection to Google Play Services for %s", this.k);
            CastDevice castDevice = this.k;
            z5.l.h(castDevice);
            Bundle bundle2 = new Bundle();
            b bVar2 = this.f;
            q5.a aVar = bVar2 == null ? null : bVar2.f;
            q5.f fVar = aVar != null ? aVar.d : null;
            boolean z11 = aVar != null && aVar.e;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", fVar != null);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z11);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.g.i);
            g0 g0Var = new g0(castDevice, new d0(this));
            g0Var.d = bundle2;
            o5.e eVar = new o5.e(g0Var);
            Context context = this.c;
            int i11 = o5.g.a;
            e0 e0Var2 = new e0(context, eVar);
            e0Var2.E.add(new i(this));
            this.i = e0Var2;
            com.google.android.gms.common.api.internal.p i12 = za.c.i(e0Var2.f, e0Var2.k, "castDeviceControllerListenerKey");
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r();
            rVar.b = true;
            o4.g gVar = new o4.g(e0Var2, i10);
            o5.z zVar = o5.z.c;
            rVar.e = i12;
            rVar.c = gVar;
            rVar.d = zVar;
            rVar.f = new w5.c[]{o5.y.a};
            rVar.a = 8428;
            e0Var2.b(rVar.a());
            return;
        }
        z5.l.e("Must be called from the main thread.");
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel O0 = vVar.O0(vVar.M0(), 9);
                int i13 = com.google.android.gms.internal.cast.u.a;
                z10 = O0.readInt() != 0;
                O0.recycle();
            } catch (RemoteException e10) {
                bVar.a(e10, "Unable to call %s on %s.", "isResuming", x.class.getSimpleName());
            }
            if (z10) {
                if (xVar == null) {
                    return;
                }
                try {
                    v vVar2 = (v) xVar;
                    Parcel M0 = vVar2.M0();
                    M0.writeInt(2151);
                    vVar2.Q0(M0, 12);
                    return;
                } catch (RemoteException e11) {
                    bVar.a(e11, "Unable to call %s on %s.", "notifyFailedToStartSession", x.class.getSimpleName());
                    return;
                }
            }
            if (xVar == null) {
                return;
            }
            try {
                v vVar3 = (v) xVar;
                Parcel M02 = vVar3.M0();
                M02.writeInt(2153);
                vVar3.Q0(M02, 15);
                return;
            } catch (RemoteException e12) {
                bVar.a(e12, "Unable to call %s on %s.", "notifyFailedToResumeSession", x.class.getSimpleName());
                return;
            }
        }
        z10 = false;
        if (z10) {
        }
    }
}
