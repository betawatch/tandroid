package r5;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.n4;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
import l7.w0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class c extends f {
    public static final u5.b m = new u5.b("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final q e;
    public final b f;
    public final com.google.android.gms.internal.cast.o g;
    public final t5.h h;
    public q5.e0 i;
    public s5.h j;
    public CastDevice k;
    public n4 l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.o oVar, t5.h hVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = bVar;
        this.g = oVar;
        this.h = hVar;
        l6.a f10 = f();
        j jVar = new j(this);
        u5.b bVar2 = com.google.android.gms.internal.cast.d.a;
        q qVar = null;
        if (f10 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.d.b(context).U0(bVar, f10, jVar);
            } catch (RemoteException | d e6) {
                com.google.android.gms.internal.cast.d.a.a(e6, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            }
        }
        this.e = qVar;
    }

    public static void g(c cVar, int i10) {
        t5.h hVar = cVar.h;
        if (hVar.q) {
            hVar.q = false;
            s5.h hVar2 = hVar.n;
            if (hVar2 != null) {
                d0 d0Var = hVar.m;
                b6.m.e("Must be called from the main thread.");
                if (d0Var != null) {
                    hVar2.i.remove(d0Var);
                }
            }
            hVar.c.J0(null);
            c5.j jVar = hVar.h;
            if (jVar != null) {
                jVar.C();
                jVar.e = null;
            }
            c5.j jVar2 = hVar.i;
            if (jVar2 != null) {
                jVar2.C();
                jVar2.e = null;
            }
            android.support.v4.media.session.c0 c0Var = hVar.p;
            if (c0Var != null) {
                c0Var.d(null, null);
                hVar.p.e(new MediaMetadataCompat(new Bundle()));
                hVar.j(0, null);
            }
            android.support.v4.media.session.c0 c0Var2 = hVar.p;
            if (c0Var2 != null) {
                c0Var2.c(false);
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
        q5.e0 e0Var = cVar.i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.v e6 = com.google.android.gms.common.api.internal.w.e();
            e6.c = q5.z.b;
            e6.a = 8403;
            e0Var.e(1, e6.e());
            e0Var.h();
            com.google.android.gms.common.api.internal.n nVar = y5.h.h(e0Var.f, e0Var.k, "castDeviceControllerListenerKey").c;
            b6.m.i(nVar, "Key must not be null");
            e0Var.c(nVar, 8415);
            cVar.i = null;
        }
        cVar.k = null;
        s5.h hVar3 = cVar.j;
        if (hVar3 != null) {
            hVar3.v(null);
            cVar.j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        u5.b bVar = m;
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
            u5.u uVar = (u5.u) task.getResult();
            Status status = uVar.a;
            if (!status.e()) {
                bVar.b("%s() -> failure result", str);
                int i11 = status.a;
                o oVar3 = (o) qVar;
                Parcel M03 = oVar3.M0();
                M03.writeInt(i11);
                oVar3.Q0(M03, 5);
                return;
            }
            bVar.b("%s() -> success result", str);
            s5.h hVar = new s5.h(new u5.n());
            cVar.j = hVar;
            hVar.v(cVar.i);
            cVar.j.p(new d0(cVar, i10));
            cVar.j.u();
            t5.h hVar2 = cVar.h;
            s5.h hVar3 = cVar.j;
            b6.m.e("Must be called from the main thread.");
            hVar2.a(hVar3, cVar.k);
            q5.d dVar = uVar.b;
            b6.m.h(dVar);
            String str2 = uVar.c;
            String str3 = uVar.d;
            b6.m.h(str3);
            boolean z4 = uVar.e;
            o oVar4 = (o) qVar;
            Parcel M04 = oVar4.M0();
            com.google.android.gms.internal.cast.s.c(M04, dVar);
            M04.writeString(str2);
            M04.writeString(str3);
            M04.writeInt(z4 ? 1 : 0);
            oVar4.Q0(M04, 4);
        } catch (RemoteException e6) {
            bVar.a(e6, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Bundle bundle) {
        boolean z4;
        u5.b bVar = f.b;
        x xVar = this.a;
        CastDevice e6 = CastDevice.e(bundle);
        this.k = e6;
        if (e6 != null) {
            q5.e0 e0Var = this.i;
            if (e0Var != null) {
                com.google.android.gms.common.api.internal.v e10 = com.google.android.gms.common.api.internal.w.e();
                e10.c = q5.z.b;
                e10.a = 8403;
                e0Var.e(1, e10.e());
                e0Var.h();
                com.google.android.gms.common.api.internal.n nVar = y5.h.h(e0Var.f, e0Var.k, "castDeviceControllerListenerKey").c;
                b6.m.i(nVar, "Key must not be null");
                e0Var.c(nVar, 8415);
                this.i = null;
            }
            m.b("Acquiring a connection to Google Play Services for %s", this.k);
            CastDevice castDevice = this.k;
            b6.m.h(castDevice);
            Bundle bundle2 = new Bundle();
            b bVar2 = this.f;
            s5.a aVar = bVar2 == null ? null : bVar2.f;
            s5.f fVar = aVar != null ? aVar.d : null;
            boolean z10 = aVar != null && aVar.e;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", fVar != null);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z10);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.g.i);
            w0 w0Var = new w0(castDevice, new e0(this));
            w0Var.d = bundle2;
            q5.e eVar = new q5.e(w0Var);
            Context context = this.c;
            int i10 = q5.g.a;
            q5.e0 e0Var2 = new q5.e0(context, eVar);
            e0Var2.E.add(new i(this));
            this.i = e0Var2;
            com.google.android.gms.common.api.internal.p h = y5.h.h(e0Var2.f, e0Var2.k, "castDeviceControllerListenerKey");
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r();
            rVar.b = true;
            org.telegram.ui.web.e0 e0Var3 = new org.telegram.ui.web.e0(e0Var2, 4);
            q5.z zVar = q5.z.c;
            rVar.e = h;
            rVar.c = e0Var3;
            rVar.d = zVar;
            rVar.f = new y5.c[]{q5.y.a};
            rVar.a = 8428;
            e0Var2.b(rVar.a());
            return;
        }
        b6.m.e("Must be called from the main thread.");
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel O0 = vVar.O0(vVar.M0(), 9);
                int i11 = com.google.android.gms.internal.cast.s.a;
                z4 = O0.readInt() != 0;
                O0.recycle();
            } catch (RemoteException e11) {
                bVar.a(e11, "Unable to call %s on %s.", "isResuming", x.class.getSimpleName());
            }
            if (z4) {
                if (xVar == null) {
                    return;
                }
                try {
                    v vVar2 = (v) xVar;
                    Parcel M0 = vVar2.M0();
                    M0.writeInt(2151);
                    vVar2.Q0(M0, 12);
                    return;
                } catch (RemoteException e12) {
                    bVar.a(e12, "Unable to call %s on %s.", "notifyFailedToStartSession", x.class.getSimpleName());
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
            } catch (RemoteException e13) {
                bVar.a(e13, "Unable to call %s on %s.", "notifyFailedToResumeSession", x.class.getSimpleName());
                return;
            }
        }
        z4 = false;
        if (z4) {
        }
    }
}
