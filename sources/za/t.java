package za;

import android.util.Log;
import j$.util.Objects;
import java.util.Collection;
import java.util.Map;
import v7.t7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class t extends kd.j implements rd.p {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, id.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        switch (this.a) {
            case 0:
                return new t((y) this.c, cVar, 0);
            default:
                return new t((String) this.c, cVar, 1);
        }
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        zd.c0 c0Var = (zd.c0) obj;
        id.c cVar = (id.c) obj2;
        switch (this.a) {
        }
        return ((t) create(c0Var, cVar)).invokeSuspend(gd.i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                jd.a aVar = jd.a.a;
                int i10 = this.b;
                if (i10 == 0) {
                    t7.b(obj);
                    y yVar = (y) this.c;
                    o0.a aVar2 = yVar.d;
                    ce.j jVar = new ce.j(yVar, 1);
                    this.b = 1;
                    if (aVar2.z(jVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t7.b(obj);
                }
                return gd.i.a;
            default:
                jd.a aVar3 = jd.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    t7.b(obj);
                    ab.c cVar = ab.c.a;
                    this.b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t7.b(obj);
                }
                Collection<w9.j> values = ((Map) obj).values();
                String str = (String) this.c;
                for (w9.j jVar2 : values) {
                    ab.e eVar = new ab.e(str);
                    jVar2.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    w9.i iVar = jVar2.b;
                    synchronized (iVar) {
                        if (!Objects.equals(iVar.c, str)) {
                            w9.i.a(iVar.a, iVar.b, str);
                            iVar.c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + ab.d.a + " of new session " + str);
                }
                return gd.i.a;
        }
    }
}
