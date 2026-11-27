// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class w4f extends cac {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w4f(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override // cac
    public final byte j(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!a5f.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!a5f.g) {
                    break;
                } else {
                    break;
                }
        }
        return a5f.o(j, obj);
    }

    @Override // cac
    public final void l(long j, Object obj, byte b) {
        switch (this.b) {
            case 0:
                if (!a5f.g) {
                    a5f.j(obj, j, b);
                    break;
                } else {
                    a5f.h(j, obj, b);
                    break;
                }
            default:
                if (!a5f.g) {
                    a5f.j(obj, j, b);
                    break;
                } else {
                    a5f.h(j, obj, b);
                    break;
                }
        }
    }

    @Override // cac
    public final void m(Object obj, long j, double d) {
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
    public final void n(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                this.a.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                this.a.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // cac
    public final void o(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!a5f.g) {
                    a5f.j(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    a5f.h(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!a5f.g) {
                    a5f.j(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    a5f.h(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // cac
    public final boolean q(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (a5f.g) {
                    if (a5f.n(j, obj) == 0) {
                    }
                } else if (a5f.o(j, obj) == 0) {
                }
                break;
            default:
                if (a5f.g) {
                    if (a5f.n(j, obj) == 0) {
                    }
                } else if (a5f.o(j, obj) == 0) {
                }
                break;
        }
        return true;
    }

    @Override // cac
    public final float r(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // cac
    public final double t(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }
}
