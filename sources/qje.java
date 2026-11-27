// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qje extends cac {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qje(Unsafe unsafe, byte b) {
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
                if (!eke.g) {
                    eke.d(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    eke.c(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!eke.g) {
                    eke.d(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    eke.c(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // cac
    public final void u(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!eke.g) {
                    eke.d(obj, j, b);
                    break;
                } else {
                    eke.c(obj, j, b);
                    break;
                }
            default:
                if (!eke.g) {
                    eke.d(obj, j, b);
                    break;
                } else {
                    eke.c(obj, j, b);
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
                if (!eke.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!eke.g) {
                    break;
                } else {
                    break;
                }
        }
        return eke.k(obj, j);
    }
}
