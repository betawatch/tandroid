// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ta3 implements x76, h59 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ta3(tk tkVar, int i, qe8 qe8Var, qe8 qe8Var2) {
        this.b = tkVar;
        this.a = i;
    }

    @Override // h59
    public final boolean g(int i, View view) {
        u29 u29Var;
        v29 v29Var = (v29) this.b;
        if (this.a == 5 || (u29Var = v29Var.h0) == null || !(view instanceof t29)) {
            return false;
        }
        u29Var.g(v29Var, ((t29) view).e, true, false);
        return true;
    }

    @Override // x76
    public final void invoke(Object obj) {
        tk tkVar = (tk) this.b;
        uk ukVar = (uk) obj;
        ukVar.getClass();
        ukVar.w(tkVar, this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ta3(v29 v29Var, int i) {
        this.b = v29Var;
        this.a = i;
    }
}
