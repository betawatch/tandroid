package za;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import v7.t7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class e0 extends kd.j implements rd.p {
    public g0 a;
    public b0 b;
    public k9.h c;
    public z d;
    public bb.i e;
    public p f;
    public List h;
    public Map n;
    public int r;
    public final /* synthetic */ g0 s;
    public final /* synthetic */ z v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, z zVar, id.c cVar) {
        super(2, cVar);
        this.s = g0Var;
        this.v = zVar;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        return new e0(this.s, this.v, cVar);
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((zd.c0) obj, (id.c) obj2)).invokeSuspend(gd.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0069, code lost:
    
        if (r5 == r4) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0122  */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List] */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        bb.i iVar;
        ArrayList a2;
        z zVar;
        Object b11;
        b0 b0Var;
        p pVar;
        g0 g0Var;
        Map subscribers;
        Object a10;
        p currentProcessDetails;
        bb.i sessionsSettings;
        z sessionDetails;
        k9.h firebaseApp;
        List appProcessDetails;
        w9.j jVar;
        g0 g0Var2 = this.s;
        k9.h hVar = g0Var2.a;
        jd.a aVar = jd.a.a;
        int i10 = this.r;
        if (i10 == 0) {
            t7.b(obj);
            this.r = 1;
            b10 = g0.b(g0Var2, this);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Map map = this.n;
                    appProcessDetails = this.h;
                    currentProcessDetails = this.f;
                    sessionsSettings = this.e;
                    sessionDetails = this.d;
                    k9.h hVar2 = this.c;
                    b0 b0Var2 = this.b;
                    g0 g0Var3 = this.a;
                    t7.b(obj);
                    g0Var = g0Var3;
                    b0Var = b0Var2;
                    firebaseApp = hVar2;
                    subscribers = map;
                    a10 = obj;
                    kotlin.jvm.internal.i.d(a10, "getFirebaseInstallationId()");
                    String str = (String) a10;
                    b0Var.getClass();
                    kotlin.jvm.internal.i.e(firebaseApp, "firebaseApp");
                    kotlin.jvm.internal.i.e(sessionDetails, "sessionDetails");
                    kotlin.jvm.internal.i.e(sessionsSettings, "sessionsSettings");
                    kotlin.jvm.internal.i.e(currentProcessDetails, "currentProcessDetails");
                    kotlin.jvm.internal.i.e(appProcessDetails, "appProcessDetails");
                    kotlin.jvm.internal.i.e(subscribers, "subscribers");
                    String str2 = sessionDetails.a;
                    String str3 = sessionDetails.b;
                    int i11 = sessionDetails.c;
                    long j3 = sessionDetails.d;
                    w9.j jVar2 = (w9.j) subscribers.get(ab.d.b);
                    i iVar2 = i.d;
                    i iVar3 = i.c;
                    i iVar4 = i.b;
                    i iVar5 = jVar2 != null ? iVar4 : jVar2.a.a() ? iVar3 : iVar2;
                    jVar = (w9.j) subscribers.get(ab.d.a);
                    if (jVar != null) {
                        iVar2 = iVar4;
                    } else if (jVar.a.a()) {
                        iVar2 = iVar3;
                    }
                    a0 a0Var = new a0(new j0(str2, str3, i11, j3, new j(iVar5, iVar2, sessionsSettings.a()), str), b0.a(firebaseApp));
                    int i12 = g0.g;
                    g0Var.getClass();
                    try {
                        g0Var.d.a(a0Var);
                        Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: ".concat(str2));
                    } catch (RuntimeException e7) {
                        Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e7);
                    }
                    return gd.i.a;
                }
                List list = this.h;
                pVar = this.f;
                bb.i iVar6 = this.e;
                z zVar2 = this.d;
                k9.h hVar3 = this.c;
                b0 b0Var3 = this.b;
                g0Var = this.a;
                t7.b(obj);
                a2 = list;
                hVar = hVar3;
                b0Var = b0Var3;
                zVar = zVar2;
                iVar = iVar6;
                b11 = obj;
                subscribers = (Map) b11;
                this.a = g0Var;
                this.b = b0Var;
                this.c = hVar;
                this.d = zVar;
                this.e = iVar;
                this.f = pVar;
                this.h = a2;
                this.n = subscribers;
                this.r = 3;
                a10 = g0.a(g0Var2, this);
                if (a10 != aVar) {
                    currentProcessDetails = pVar;
                    sessionsSettings = iVar;
                    sessionDetails = zVar;
                    firebaseApp = hVar;
                    appProcessDetails = a2;
                    kotlin.jvm.internal.i.d(a10, "getFirebaseInstallationId()");
                    String str4 = (String) a10;
                    b0Var.getClass();
                    kotlin.jvm.internal.i.e(firebaseApp, "firebaseApp");
                    kotlin.jvm.internal.i.e(sessionDetails, "sessionDetails");
                    kotlin.jvm.internal.i.e(sessionsSettings, "sessionsSettings");
                    kotlin.jvm.internal.i.e(currentProcessDetails, "currentProcessDetails");
                    kotlin.jvm.internal.i.e(appProcessDetails, "appProcessDetails");
                    kotlin.jvm.internal.i.e(subscribers, "subscribers");
                    String str22 = sessionDetails.a;
                    String str32 = sessionDetails.b;
                    int i112 = sessionDetails.c;
                    long j32 = sessionDetails.d;
                    w9.j jVar22 = (w9.j) subscribers.get(ab.d.b);
                    i iVar22 = i.d;
                    i iVar32 = i.c;
                    i iVar42 = i.b;
                    if (jVar22 != null) {
                    }
                    jVar = (w9.j) subscribers.get(ab.d.a);
                    if (jVar != null) {
                    }
                    a0 a0Var2 = new a0(new j0(str22, str32, i112, j32, new j(iVar5, iVar22, sessionsSettings.a()), str4), b0.a(firebaseApp));
                    int i122 = g0.g;
                    g0Var.getClass();
                    g0Var.d.a(a0Var2);
                    Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: ".concat(str22));
                    return gd.i.a;
                }
                return aVar;
            }
            t7.b(obj);
            b10 = obj;
        }
        if (((Boolean) b10).booleanValue()) {
            b0 b0Var4 = b0.a;
            iVar = g0Var2.c;
            hVar.a();
            Context context = hVar.a;
            kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
            p b12 = q.b(context);
            hVar.a();
            Context context2 = hVar.a;
            kotlin.jvm.internal.i.d(context2, "firebaseApp.applicationContext");
            a2 = q.a(context2);
            ab.c cVar = ab.c.a;
            this.a = g0Var2;
            this.b = b0Var4;
            this.c = hVar;
            zVar = this.v;
            this.d = zVar;
            this.e = iVar;
            this.f = b12;
            this.h = a2;
            this.r = 2;
            b11 = cVar.b(this);
            if (b11 != aVar) {
                b0Var = b0Var4;
                pVar = b12;
                g0Var = g0Var2;
                subscribers = (Map) b11;
                this.a = g0Var;
                this.b = b0Var;
                this.c = hVar;
                this.d = zVar;
                this.e = iVar;
                this.f = pVar;
                this.h = a2;
                this.n = subscribers;
                this.r = 3;
                a10 = g0.a(g0Var2, this);
                if (a10 != aVar) {
                }
            }
            return aVar;
        }
        return gd.i.a;
    }
}
