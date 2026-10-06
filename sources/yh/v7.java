package yh;

import android.util.Log;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h61;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class v7 implements Utilities.Callback5, e2.h, i5.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // e2.h
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                z3.h hVar = (z3.h) this.b;
                z3.a aVar = (z3.a) obj;
                z3.g gVar = new z3.g(aVar.b, ob.a.C2(aVar.a, aVar.c));
                hVar.c.add(gVar);
                long j3 = hVar.j;
                if (j3 == -9223372036854775807L || aVar.d >= j3) {
                    hVar.a(gVar);
                    break;
                }
                break;
            default:
                ((e9.f0) this.b).b((z3.a) obj);
                break;
        }
    }

    @Override // i5.e
    public Object apply(Object obj) {
        ((k2.e) this.b).getClass();
        String c10 = za.b0.b.c((za.a0) obj);
        kotlin.jvm.internal.i.d(c10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(c10));
        byte[] bytes = c10.getBytes(xd.a.a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w7 w7Var = (w7) this.b;
        h61 h61Var = (h61) obj;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        w7Var.getClass();
        if (h61Var.G instanceof TL_stars.StarsTransaction) {
            z7.n1(w7Var.getContext(), false, 0L, w7Var.c, (TL_stars.StarsTransaction) h61Var.G, w7Var.b);
        }
    }
}
