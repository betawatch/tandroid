// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qeb {
    public final /* synthetic */ byte a;

    public /* synthetic */ qeb(byte b) {
        this.a = b;
    }

    public final int a(xeb xebVar, int i) {
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

    public final int b(xeb xebVar, int i) {
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
