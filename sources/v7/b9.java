package v7;

import w7.pa;
import x7.ia;
import z7.zf;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class b9 implements pa.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5.q b;

    public /* synthetic */ b9(l5.q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // pa.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("json"), e9.e);
            case 1:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("proto"), e9.d);
            case 2:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("json"), pa.e);
            case 3:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("proto"), pa.d);
            case 4:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("json"), ia.e);
            case 5:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("proto"), ia.d);
            case 6:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("json"), zf.e);
            default:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("proto"), zf.d);
        }
    }
}
