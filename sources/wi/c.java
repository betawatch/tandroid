package wi;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                ((SharedPreferences) u7.i.b().a).edit().putFloat("x", f10).apply();
                hVar.a.b.f();
                break;
            case 1:
                h hVar2 = (h) this.b;
                ((SharedPreferences) u7.i.b().a).edit().putFloat("y", f10).apply();
                hVar2.a.b.f();
                break;
            default:
                ((h2.f) this.b).e();
                break;
        }
    }
}
