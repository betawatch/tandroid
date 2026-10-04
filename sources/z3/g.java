package z3;

import android.util.Log;
import e9.f0;
import za.a0;
import za.b0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements e2.h, i5.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // e2.h
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                i iVar = (i) this.b;
                a aVar = (a) obj;
                h hVar = new h(aVar.b, ob.a.C2(aVar.a, aVar.c));
                iVar.c.add(hVar);
                long j3 = iVar.j;
                if (j3 == -9223372036854775807L || aVar.d >= j3) {
                    iVar.a(hVar);
                    break;
                }
                break;
            default:
                ((f0) this.b).b((a) obj);
                break;
        }
    }

    @Override // i5.e
    public Object apply(Object obj) {
        ((l2.g) this.b).getClass();
        String c10 = b0.b.c((a0) obj);
        kotlin.jvm.internal.i.d(c10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(c10));
        byte[] bytes = c10.getBytes(xd.a.a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
