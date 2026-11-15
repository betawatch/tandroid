package org.telegram.utils.twidget;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class r0 extends Binder implements d {
    public final t0 a;
    public final int b;
    public final WidgetSandboxBackend c;
    public volatile long d;
    public final ByteArrayOutputStream e;
    public final /* synthetic */ u0 f;

    public r0(u0 u0Var, t0 t0Var, int i7, WidgetSandboxBackend widgetSandboxBackend) {
        this.f = u0Var;
        attachInterface(this, "org.telegram.utils.twidget.IWidgetEngineCallback");
        this.e = new ByteArrayOutputStream();
        this.a = t0Var;
        this.b = i7;
        this.c = widgetSandboxBackend;
    }

    public static Object i1(o0 o0Var) {
        try {
            return o0Var.run();
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    @Override // org.telegram.utils.twidget.d
    public final byte[] B(int i7, int i10, int i11, int i12, int i13) {
        try {
            return this.c.canvasRead(i7, i10, i11, i12, i13);
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    @Override // org.telegram.utils.twidget.d
    public final void E(int i7) {
        try {
            this.c.canvasRelease(i7);
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    @Override // org.telegram.utils.twidget.d
    public final void G(final byte[] bArr, final byte[] bArr2, final double d, final int i7, final int i10, final float f10, final float f11, final int i11, final int i12) {
        i1(new o0() { // from class: org.telegram.utils.twidget.p0
            @Override // org.telegram.utils.twidget.o0
            public final Object run() {
                int i13;
                r0 r0Var = r0.this;
                byte[] j12 = r0Var.j1(bArr);
                int i14 = i7;
                if (i14 >= 0 && (i13 = i10) >= 0 && i14 <= 16384 && i13 <= 16384) {
                    float f12 = f10;
                    if (f12 > 0.0f && f12 <= 10.0f) {
                        WidgetSandboxBackend widgetSandboxBackend = r0Var.c;
                        byte[] bArr3 = bArr2;
                        if (bArr3 == null) {
                            bArr3 = new byte[]{123, 125};
                        }
                        widgetSandboxBackend.record(j12, bArr3, d, i14, i13, f12, f11, i11, i12);
                        return null;
                    }
                }
                throw new IllegalArgumentException("Frame size");
            }
        });
    }

    @Override // org.telegram.utils.twidget.d
    public final float[] H(int i7, byte[] bArr, float f10, int i10, boolean z10, byte[] bArr2) {
        try {
            return this.c.defineFont(i7, bArr, f10, i10, z10, bArr2);
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    @Override // org.telegram.utils.twidget.d
    public final void K0(int i7, int i10, byte[] bArr) {
        try {
            this.c.recordLayer(i7, i10, j1(bArr));
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.utils.twidget.d
    public final void R0(byte[] bArr) {
        i1(new t(3, bArr, this));
    }

    @Override // org.telegram.utils.twidget.d
    public final void f1(int i7) {
        try {
            this.c.deleteFont(i7);
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    public final b h1() {
        b bVar;
        synchronized (this.f.b) {
            try {
                t0 t0Var = this.a;
                bVar = t0Var.b == this.b ? t0Var.a : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // org.telegram.utils.twidget.d
    public final void i0(byte[] bArr) {
        try {
            this.c.selectableText(j1(bArr));
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    public final synchronized byte[] j1(byte[] bArr) {
        if (bArr != null) {
            return bArr;
        }
        byte[] byteArray = this.e.toByteArray();
        this.e.reset();
        return byteArray;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface("org.telegram.utils.twidget.IWidgetEngineCallback");
        }
        if (i7 == 1598968902) {
            parcel2.writeString("org.telegram.utils.twidget.IWidgetEngineCallback");
            return true;
        }
        switch (i7) {
            case 1:
                float[] H = H(parcel.readInt(), parcel.createByteArray(), parcel.readFloat(), parcel.readInt(), parcel.readInt() != 0, parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeFloatArray(H);
                return true;
            case 2:
                float q02 = q0(parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeFloat(q02);
                return true;
            case 3:
                f1(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 4:
                y(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 5:
                R0(parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 6:
                G(parcel.createByteArray(), parcel.createByteArray(), parcel.readDouble(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                K0(parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 8:
                i0(parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 9:
                w0(parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 10:
                u0(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createIntArray());
                parcel2.writeNoException();
                return true;
            case 11:
                byte[] B = B(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeByteArray(B);
                return true;
            case 12:
                E(parcel.readInt());
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i7, parcel, parcel2, i10);
        }
    }

    @Override // org.telegram.utils.twidget.d
    public final float q0(final int i7, final byte[] bArr) {
        return ((Float) i1(new o0() { // from class: org.telegram.utils.twidget.q0
            @Override // org.telegram.utils.twidget.o0
            public final Object run() {
                r0 r0Var = r0.this;
                r0Var.getClass();
                byte[] bArr2 = bArr;
                if (bArr2 == null || bArr2.length > 262144) {
                    throw new IllegalArgumentException("Text too long");
                }
                return Float.valueOf(r0Var.c.textWidth(i7, bArr2));
            }
        })).floatValue();
    }

    @Override // org.telegram.utils.twidget.d
    public final void u0(int i7, int i10, int i11, int[] iArr) {
        try {
            WidgetSandboxBackend widgetSandboxBackend = this.c;
            if (iArr == null) {
                iArr = new int[0];
            }
            widgetSandboxBackend.canvasRun(i7, i10, i11, iArr);
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    @Override // org.telegram.utils.twidget.d
    public final void w0(int i7, byte[] bArr) {
        try {
            this.c.signal(i7, j1(bArr));
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    @Override // org.telegram.utils.twidget.d
    public final void y(int i7, int i10, int i11, byte[] bArr) {
        try {
            this.c.defineImage(i7, i10, i11, j1(bArr));
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
