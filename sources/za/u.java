package za;

import android.util.Log;
import j$.util.Objects;
import java.util.Collection;
import java.util.Map;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class u extends ld.j implements sd.p {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, jd.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
    }

    @Override // ld.a
    public final jd.c create(Object obj, jd.c cVar) {
        switch (this.a) {
            case 0:
                return new u((a0) this.c, cVar, 0);
            default:
                return new u((String) this.c, cVar, 1);
        }
    }

    @Override // sd.p
    public final Object invoke(Object obj, Object obj2) {
        ae.d0 d0Var = (ae.d0) obj;
        jd.c cVar = (jd.c) obj2;
        switch (this.a) {
        }
        return ((u) create(d0Var, cVar)).invokeSuspend(hd.i.a);
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                kd.a aVar = kd.a.a;
                int i10 = this.b;
                if (i10 == 0) {
                    a8.b(obj);
                    a0 a0Var = (a0) this.c;
                    z zVar = a0Var.d;
                    de.j jVar = new de.j(a0Var, 1);
                    this.b = 1;
                    if (zVar.z(jVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a8.b(obj);
                }
                return hd.i.a;
            default:
                kd.a aVar2 = kd.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    a8.b(obj);
                    ab.c cVar = ab.c.a;
                    this.b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a8.b(obj);
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
                return hd.i.a;
        }
    }
}
