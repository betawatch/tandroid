package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class o0 extends Binder implements d {
    public final q0 a;
    public final int b;
    public final WidgetSandboxBackend c;
    public volatile long d;
    public final ByteArrayOutputStream e;
    public final /* synthetic */ r0 f;

    public o0(r0 r0Var, q0 q0Var, int i7, WidgetSandboxBackend widgetSandboxBackend) {
        this.f = r0Var;
        attachInterface(this, "org.telegram.utils.twidget.IWidgetEngineCallback");
        this.e = new ByteArrayOutputStream();
        this.a = q0Var;
        this.b = i7;
        this.c = widgetSandboxBackend;
    }

    @Override // org.telegram.utils.twidget.d
    public final byte[] A(int i7, int i10, int i11, int i12, int i13) {
        try {
            return this.c.canvasRead(i7, i10, i11, i12, i13);
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override // org.telegram.utils.twidget.d
    public final void D(int i7) {
        try {
            this.c.canvasRelease(i7);
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override // org.telegram.utils.twidget.d
    public final void F(byte[] bArr, byte[] bArr2, double d, int i7, int i10, float f10, float f11, int i11, int i12) {
        byte[] i13 = i1(bArr);
        try {
            if (i7 < 0 || i10 < 0 || i7 > 16384 || i10 > 16384 || f10 <= 0.0f || f10 > 10.0f) {
                throw new IllegalArgumentException("Frame size");
            }
            WidgetSandboxBackend widgetSandboxBackend = this.c;
            if (bArr2 == null) {
                bArr2 = new byte[]{123, 125};
            }
            widgetSandboxBackend.record(i13, bArr2, d, i7, i10, f10, f11, i11, i12);
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override // org.telegram.utils.twidget.d
    public final float[] G(int i7, byte[] bArr, float f10, int i10, boolean z9, byte[] bArr2) {
        try {
            return this.c.defineFont(i7, bArr, f10, i10, z9, bArr2);
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override // org.telegram.utils.twidget.d
    public final void J0(int i7, int i10, byte[] bArr) {
        try {
            this.c.recordLayer(i7, i10, i1(bArr));
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override // org.telegram.utils.twidget.d
    public final synchronized void Q0(byte[] bArr) {
        if (bArr != null) {
            if (this.e.size() + bArr.length <= 16777216) {
                this.e.write(bArr, 0, bArr.length);
            }
        }
        this.e.reset();
        throw new IllegalStateException("Widget engine: argument too large");
    }

    @Override // org.telegram.utils.twidget.d
    public final void Z0(int i7, Bitmap bitmap) {
        try {
            this.c.defineImage(i7, bitmap);
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override // org.telegram.utils.twidget.d
    public final void f1(int i7) {
        this.c.deleteFont(i7);
    }

    @Override // org.telegram.utils.twidget.d
    public final void h0(byte[] bArr) {
        try {
            this.c.selectableText(i1(bArr));
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    public final b h1() {
        b bVar;
        synchronized (this.f.b) {
            try {
                q0 q0Var = this.a;
                bVar = q0Var.b == this.b ? q0Var.a : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public final synchronized byte[] i1(byte[] bArr) {
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
                float[] G = G(parcel.readInt(), parcel.createByteArray(), parcel.readFloat(), parcel.readInt(), parcel.readInt() != 0, parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeFloatArray(G);
                return true;
            case 2:
                float p02 = p0(parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeFloat(p02);
                return true;
            case 3:
                f1(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 4:
                Z0(parcel.readInt(), (Bitmap) (parcel.readInt() != 0 ? Bitmap.CREATOR.createFromParcel(parcel) : null));
                parcel2.writeNoException();
                return true;
            case 5:
                Q0(parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 6:
                F(parcel.createByteArray(), parcel.createByteArray(), parcel.readDouble(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                J0(parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 8:
                h0(parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 9:
                v0(parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 10:
                t0(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createIntArray());
                parcel2.writeNoException();
                return true;
            case 11:
                byte[] A = A(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeByteArray(A);
                return true;
            case 12:
                D(parcel.readInt());
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i7, parcel, parcel2, i10);
        }
    }

    @Override // org.telegram.utils.twidget.d
    public final float p0(int i7, byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length <= 262144) {
                    return this.c.textWidth(i7, bArr);
                }
            } catch (Exception e10) {
                throw new IllegalStateException(e10.toString());
            }
        }
        throw new IllegalArgumentException("Text too long");
    }

    @Override // org.telegram.utils.twidget.d
    public final void t0(int i7, int i10, int i11, int[] iArr) {
        try {
            WidgetSandboxBackend widgetSandboxBackend = this.c;
            if (iArr == null) {
                iArr = new int[0];
            }
            widgetSandboxBackend.canvasRun(i7, i10, i11, iArr);
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override // org.telegram.utils.twidget.d
    public final void v0(int i7, byte[] bArr) {
        try {
            this.c.signal(i7, i1(bArr));
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
