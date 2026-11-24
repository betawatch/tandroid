// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class zw8 {
    public static final zw8 d;
    public final /* synthetic */ byte a;
    public int b;
    public int c;

    static {
        int i = 0;
        d = new zw8(i, i, (byte) 0);
    }

    public /* synthetic */ zw8(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        int i = this.c;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i != 42) {
            return i != 22 ? i != 23 ? 0 : 15 : TLObject.FLAG_30;
        }
        return 16;
    }

    public final int b() {
        return this.b | this.c;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder(zw8.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.b);
                sb.append(", length = ");
                return de9.l(sb, this.c, "]");
            default:
                return super.toString();
        }
    }
}
