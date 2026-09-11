package v7;

import w7.pa;
import x7.ia;
import z7.zf;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
