package v7;

import w7.pa;
import x7.ia;
import z7.ag;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class a9 implements qa.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5.r b;

    public /* synthetic */ a9(l5.r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // qa.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("json"), d9.e);
            case 1:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("proto"), d9.d);
            case 2:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("json"), pa.e);
            case 3:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("proto"), pa.d);
            case 4:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("json"), ia.e);
            case 5:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("proto"), ia.d);
            case 6:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("json"), ag.e);
            default:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("proto"), ag.d);
        }
    }
}
