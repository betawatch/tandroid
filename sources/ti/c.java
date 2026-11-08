package ti;

import ab.d0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                i iVar = (i) this.b;
                d0.b().a.edit().putFloat("x", f10).apply();
                iVar.a.b.f();
                break;
            case 1:
                i iVar2 = (i) this.b;
                d0.b().a.edit().putFloat("y", f10).apply();
                iVar2.a.b.f();
                break;
            default:
                ((h2.f) this.b).e();
                break;
        }
    }
}
