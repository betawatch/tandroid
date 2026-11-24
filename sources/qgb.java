// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qgb {
    public final /* synthetic */ byte a;

    public /* synthetic */ qgb(byte b) {
        this.a = b;
    }

    public final int a(xgb xgbVar, int i) {
        switch (this.a) {
            case 0:
            case 3:
            default:
                return TLObject.FLAG_31;
            case 1:
                return 0;
            case 2:
                return i;
        }
    }

    public final int b(xgb xgbVar, int i) {
        switch (this.a) {
            case 0:
                return TLObject.FLAG_31;
            case 1:
            case 3:
            default:
                return 0;
            case 2:
                return i;
        }
    }

    public final int c(int i, int i2) {
        switch (this.a) {
            case 4:
                return i2;
            default:
                return i;
        }
    }
}
