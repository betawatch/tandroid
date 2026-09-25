package za;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import v7.u7;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class g0 extends kd.j implements rd.p {
    public i0 a;
    public d0 b;
    public k9.h c;
    public b0 d;
    public bb.h e;
    public r f;
    public List h;
    public Map n;
    public int r;
    public final /* synthetic */ i0 s;
    public final /* synthetic */ b0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, b0 b0Var, id.c cVar) {
        super(2, cVar);
        this.s = i0Var;
        this.v = b0Var;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        return new g0(this.s, this.v, cVar);
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((zd.c0) obj, (id.c) obj2)).invokeSuspend(gd.i.a);
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
        bb.h hVar;
        ArrayList a2;
        b0 b0Var;
        Object b11;
        d0 d0Var;
        r rVar;
        i0 i0Var;
        Map subscribers;
        Object a10;
        r currentProcessDetails;
        bb.h sessionsSettings;
        b0 sessionDetails;
        k9.h firebaseApp;
        List appProcessDetails;
        w9.j jVar;
        i0 i0Var2 = this.s;
        k9.h hVar2 = i0Var2.a;
        jd.a aVar = jd.a.a;
        int i10 = this.r;
        if (i10 == 0) {
            u7.b(obj);
            this.r = 1;
            b10 = i0.b(i0Var2, this);
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
                    k9.h hVar3 = this.c;
                    d0 d0Var2 = this.b;
                    i0 i0Var3 = this.a;
                    u7.b(obj);
                    i0Var = i0Var3;
                    d0Var = d0Var2;
                    firebaseApp = hVar3;
                    subscribers = map;
                    a10 = obj;
                    kotlin.jvm.internal.i.d(a10, "getFirebaseInstallationId()");
                    String str = (String) a10;
                    d0Var.getClass();
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
                    i iVar = i.d;
                    i iVar2 = i.c;
                    i iVar3 = i.b;
                    i iVar4 = jVar2 != null ? iVar3 : jVar2.a.a() ? iVar2 : iVar;
                    jVar = (w9.j) subscribers.get(ab.d.a);
                    if (jVar != null) {
                        iVar = iVar3;
                    } else if (jVar.a.a()) {
                        iVar = iVar2;
                    }
                    c0 c0Var = new c0(new l0(str2, str3, i11, j3, new j(iVar4, iVar, sessionsSettings.a()), str), d0.a(firebaseApp));
                    int i12 = i0.g;
                    i0Var.getClass();
                    try {
                        i0Var.d.a(c0Var);
                        Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: ".concat(str2));
                    } catch (RuntimeException e) {
                        Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e);
                    }
                    return gd.i.a;
                }
                List list = this.h;
                rVar = this.f;
                bb.h hVar4 = this.e;
                b0 b0Var2 = this.d;
                k9.h hVar5 = this.c;
                d0 d0Var3 = this.b;
                i0Var = this.a;
                u7.b(obj);
                a2 = list;
                hVar2 = hVar5;
                d0Var = d0Var3;
                b0Var = b0Var2;
                hVar = hVar4;
                b11 = obj;
                subscribers = (Map) b11;
                this.a = i0Var;
                this.b = d0Var;
                this.c = hVar2;
                this.d = b0Var;
                this.e = hVar;
                this.f = rVar;
                this.h = a2;
                this.n = subscribers;
                this.r = 3;
                a10 = i0.a(i0Var2, this);
                if (a10 != aVar) {
                    currentProcessDetails = rVar;
                    sessionsSettings = hVar;
                    sessionDetails = b0Var;
                    firebaseApp = hVar2;
                    appProcessDetails = a2;
                    kotlin.jvm.internal.i.d(a10, "getFirebaseInstallationId()");
                    String str4 = (String) a10;
                    d0Var.getClass();
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
                    i iVar5 = i.d;
                    i iVar22 = i.c;
                    i iVar32 = i.b;
                    if (jVar22 != null) {
                    }
                    jVar = (w9.j) subscribers.get(ab.d.a);
                    if (jVar != null) {
                    }
                    c0 c0Var2 = new c0(new l0(str22, str32, i112, j32, new j(iVar4, iVar5, sessionsSettings.a()), str4), d0.a(firebaseApp));
                    int i122 = i0.g;
                    i0Var.getClass();
                    i0Var.d.a(c0Var2);
                    Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: ".concat(str22));
                    return gd.i.a;
                }
                return aVar;
            }
            u7.b(obj);
            b10 = obj;
        }
        if (((Boolean) b10).booleanValue()) {
            d0 d0Var4 = d0.a;
            hVar = i0Var2.c;
            hVar2.a();
            Context context = hVar2.a;
            kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
            r b12 = s.b(context);
            hVar2.a();
            Context context2 = hVar2.a;
            kotlin.jvm.internal.i.d(context2, "firebaseApp.applicationContext");
            a2 = s.a(context2);
            ab.c cVar = ab.c.a;
            this.a = i0Var2;
            this.b = d0Var4;
            this.c = hVar2;
            b0Var = this.v;
            this.d = b0Var;
            this.e = hVar;
            this.f = b12;
            this.h = a2;
            this.r = 2;
            b11 = cVar.b(this);
            if (b11 != aVar) {
                d0Var = d0Var4;
                rVar = b12;
                i0Var = i0Var2;
                subscribers = (Map) b11;
                this.a = i0Var;
                this.b = d0Var;
                this.c = hVar2;
                this.d = b0Var;
                this.e = hVar;
                this.f = rVar;
                this.h = a2;
                this.n = subscribers;
                this.r = 3;
                a10 = i0.a(i0Var2, this);
                if (a10 != aVar) {
                }
            }
            return aVar;
        }
        return gd.i.a;
    }
}
