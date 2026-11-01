package v7;

import w7.na;
import x7.ja;
import z7.ag;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class z8 implements qa.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5.q b;

    public /* synthetic */ z8(l5.q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // qa.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("json"), c9.e);
            case 1:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("proto"), c9.d);
            case 2:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("json"), na.e);
            case 3:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("proto"), na.d);
            case 4:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("json"), ja.e);
            case 5:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("proto"), ja.d);
            case 6:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("json"), ag.e);
            default:
                return this.b.a("FIREBASE_ML_SDK", new i5.c("proto"), ag.d);
        }
    }
}
