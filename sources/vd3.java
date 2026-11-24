// default package

import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class vd3 implements di8 {
    public final /* synthetic */ fe3 a;
    public final /* synthetic */ ae3 b;

    public /* synthetic */ vd3(fe3 fe3Var, ae3 ae3Var) {
        this.a = fe3Var;
        this.b = ae3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r7.b != false) goto L37;
     */
    @Override // di8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        Boolean bool;
        tma tmaVar;
        go4 go4Var = (go4) obj;
        fe3 fe3Var = this.a;
        fe3Var.getClass();
        if (this.b.A0 && ((bool = fe3Var.k) == null || !bool.booleanValue())) {
            int i = go4Var.N;
            if (i != -1 && i > 2) {
                String str = go4Var.t;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32) {
                                tma tmaVar2 = fe3Var.i;
                                if (tmaVar2 != null) {
                                    break;
                                }
                            }
                            break;
                        default:
                            if (Build.VERSION.SDK_INT >= 32 || (tmaVar = fe3Var.i) == null || !tmaVar.b || !tmaVar.c() || !fe3Var.i.d() || !fe3Var.i.a(fe3Var.j, go4Var)) {
                                return false;
                            }
                            break;
                    }
                }
                if (Build.VERSION.SDK_INT >= 32) {
                }
                return false;
            }
        }
        return true;
    }
}
