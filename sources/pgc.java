// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pgc implements g59, h59 {
    public final /* synthetic */ vgc a;

    public /* synthetic */ pgc(vgc vgcVar) {
        this.a = vgcVar;
    }

    @Override // g59
    public final void d(float f, float f2, int i, View view) {
        vgc vgcVar = this.a;
        ugc ugcVar = vgcVar.E;
        if (ugcVar == null || ugcVar.b()) {
            tgc tgcVar = (tgc) view;
            if (i != vgcVar.G || vgcVar.E == null) {
                kac kacVar = vgcVar.m0;
                if (kacVar == null || !((Boolean) kacVar.j(Integer.valueOf(tgcVar.a.a), Integer.valueOf(i))).booleanValue()) {
                    vgcVar.e(tgcVar.a.a, i);
                }
            }
        }
    }

    @Override // h59
    public final boolean g(int i, View view) {
        kac kacVar = this.a.b;
        if (kacVar == null) {
            return false;
        }
        return ((Boolean) kacVar.j(Integer.valueOf(((tgc) view).a.a), view)).booleanValue();
    }

    @Override // g59
    public final boolean u(View view) {
        return false;
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
    }
}
