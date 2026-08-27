package v0;

import android.content.Context;
import android.os.CancellationSignal;
import com.google.firebase.messaging.t;
import h7.h7;
import m.t3;
import org.telegram.ui.kb0;
import w3.b0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j implements h {
    public Context a;

    public j(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        this.a = context;
    }

    public w2.j a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        w2.j jVar = new w2.j();
        jVar.a = y2.a.a(w2.m.a);
        e.a aVar = new e.a(context);
        jVar.b = aVar;
        jVar.c = y2.a.a(new b0(3, aVar, new n1.d(aVar, 24)));
        e.a aVar2 = jVar.b;
        jVar.d = new a9.i(aVar2, 12);
        oc.a a2 = y2.a.a(new xe.b(jVar.d, y2.a.a(new k5.i(aVar2, 10)), false, 17));
        jVar.e = a2;
        za.b bVar = new za.b(2);
        e.a aVar3 = jVar.b;
        a5.n nVar = new a5.n(aVar3, a2, bVar, 4);
        oc.a aVar4 = jVar.a;
        oc.a aVar5 = jVar.c;
        af.h hVar = new af.h();
        hVar.a = aVar4;
        hVar.b = aVar5;
        hVar.c = nVar;
        hVar.d = a2;
        hVar.e = a2;
        t3 t3Var = new t3();
        t3Var.a = aVar3;
        t3Var.b = aVar5;
        t3Var.c = a2;
        t3Var.d = nVar;
        t3Var.e = aVar4;
        t3Var.f = a2;
        t3Var.h = a2;
        jVar.f = y2.a.a(new u2.b(hVar, t3Var, new t(aVar4, a2, nVar, a2, 6), 5));
        return jVar;
    }

    public Object b(Context context, e eVar, rc.c cVar) {
        id.m mVar = new id.m(1, h7.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new g(cancellationSignal));
        sd.b bVar = new sd.b(mVar);
        kb0 kb0Var = new kb0(1);
        kotlin.jvm.internal.j.e(context, "context");
        k b10 = androidx.biometric.s.b(new androidx.biometric.s(this.a, 2), eVar);
        if (b10 == null) {
            bVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            bVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            b10.onCreateCredential(context, eVar, cancellationSignal, kb0Var, bVar);
        }
        Object r10 = mVar.r();
        sc.a aVar = sc.a.a;
        return r10;
    }
}
