// default package

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class szd extends c6c {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ szd(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override // c6c
    public final double A(Object obj, long j) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // c6c
    public final byte B(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (!uzd.h) {
                    break;
                } else {
                    break;
                }
            default:
                if (!uzd.h) {
                    break;
                } else {
                    break;
                }
        }
        return uzd.n(obj, j);
    }

    @Override // c6c
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

    @Override // c6c
    public final void n(Object obj, long j, float f) {
        byte b = this.b;
        int floatToIntBits = Float.floatToIntBits(f);
        switch (b) {
            case 0:
                this.a.putInt(obj, j, floatToIntBits);
                break;
            default:
                this.a.putInt(obj, j, floatToIntBits);
                break;
        }
    }

    @Override // c6c
    public final void o(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!uzd.h) {
                    uzd.e(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    uzd.b(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!uzd.h) {
                    uzd.e(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    uzd.b(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // c6c
    public final boolean y(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (uzd.h) {
                    if (uzd.m(obj, j) == 0) {
                    }
                } else if (uzd.n(obj, j) == 0) {
                }
                break;
            default:
                if (uzd.h) {
                    if (uzd.m(obj, j) == 0) {
                    }
                } else if (uzd.n(obj, j) == 0) {
                }
                break;
        }
        return true;
    }

    @Override // c6c
    public final float z(Object obj, long j) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }
}
