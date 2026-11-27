// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class vlf extends cac {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vlf(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override // cac
    public final double k(Object obj, long j) {
        byte b = this.b;
        Unsafe unsafe = this.a;
        switch (b) {
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }

    @Override // cac
    public final float p(Object obj, long j) {
        byte b = this.b;
        Unsafe unsafe = this.a;
        switch (b) {
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    @Override // cac
    public final void s(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!wlf.g) {
                    wlf.d(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    wlf.c(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!wlf.g) {
                    wlf.d(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    wlf.c(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // cac
    public final void u(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!wlf.g) {
                    wlf.d(obj, j, b);
                    break;
                } else {
                    wlf.c(obj, j, b);
                    break;
                }
            default:
                if (!wlf.g) {
                    wlf.d(obj, j, b);
                    break;
                } else {
                    wlf.c(obj, j, b);
                    break;
                }
        }
    }

    @Override // cac
    public final void v(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // cac
    public final void w(Object obj, long j, float f) {
        byte b = this.b;
        Unsafe unsafe = this.a;
        switch (b) {
            case 0:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // cac
    public final boolean x(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (!wlf.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!wlf.g) {
                    break;
                } else {
                    break;
                }
        }
        return wlf.k(obj, j);
    }
}
