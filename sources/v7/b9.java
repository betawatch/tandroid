package v7;

import w7.pa;
import x7.ja;
import z7.zf;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class b9 implements pa.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5.r b;

    public /* synthetic */ b9(l5.r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
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
                return this.b.a("FIREBASE_ML_SDK", new i5.c("json"), ja.e);
            case 5:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("proto"), ja.d);
            case 6:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("json"), zf.e);
            default:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("proto"), zf.d);
        }
    }
}
