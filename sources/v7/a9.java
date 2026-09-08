package v7;

import w7.pa;
import x7.ia;
import z7.zf;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class a9 implements pa.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5.q b;

    public /* synthetic */ a9(l5.q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // pa.b
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
                return this.b.a("FIREBASE_ML_SDK", new i5.c("json"), zf.e);
            default:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("proto"), zf.d);
        }
    }
}
