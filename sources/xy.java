// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xy implements bma {
    public final /* synthetic */ byte a = 2;
    public final long b;
    public final int c;
    public final byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public xy(int i, long j, int i2) {
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
                sb.append(hac.f0(this.c));
                sb.append(", size=");
                sb.append(this.b);
                sb.append(", minHeaderSize=");
                return hg9.k(sb, this.d, "}");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xy(long j, int i, int i2) {
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xy(int i, int i2, long j) {
        this.d = i;
        this.b = j;
        this.c = i2;
    }
}
