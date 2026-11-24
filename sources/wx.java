// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class wx implements aka {
    public final /* synthetic */ byte a = 2;
    public final long b;
    public final int c;
    public final byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public wx(int i, long j, int i2) {
        this.c = i;
        this.b = j;
        this.d = i2;
    }

    public final boolean a(int i, int i2) {
        byte b = this.d;
        if (b != 1) {
            if ((b == 2 || b == 3) && ConnectionsManager.getInstance(i).getCurrentTime() >= this.b) {
                return false;
            }
        } else if (this.c >= i2) {
            return false;
        }
        return true;
    }

    public final int b() {
        byte b = this.d;
        if (b != 2) {
            return b != 3 ? 14 : 16;
        }
        return 15;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                sb.append(g8c.f0(this.c));
                sb.append(", size=");
                sb.append(this.b);
                sb.append(", minHeaderSize=");
                return de9.l(sb, this.d, "}");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wx(long j, int i, int i2) {
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wx(int i, int i2, long j) {
        this.d = i;
        this.b = j;
        this.c = i2;
    }
}
