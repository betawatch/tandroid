package org.telegram.utils.twidget;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.SystemClock;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class x0 extends Binder implements d {
    public final y0 a;
    public final WidgetSandboxBackend b;
    public volatile long c;
    public final ByteArrayOutputStream d;
    public final Semaphore e;
    public double f;
    public long i;
    public final /* synthetic */ z0 j;

    public x0(z0 z0Var, y0 y0Var, WidgetSandboxBackend widgetSandboxBackend) {
        this.j = z0Var;
        attachInterface(this, "org.telegram.utils.twidget.IWidgetEngineCallback");
        this.d = new ByteArrayOutputStream();
        this.e = new Semaphore(4);
        this.f = 2000.0d;
        this.i = SystemClock.elapsedRealtime();
        this.a = y0Var;
        this.b = widgetSandboxBackend;
    }

    @Override // org.telegram.utils.twidget.d
    public final byte[] A(final int i7, final int i10, final int i11, final int i12, final int i13) {
        return (byte[]) h1(new p0() { // from class: org.telegram.utils.twidget.v0
            @Override // org.telegram.utils.twidget.p0
            public final Object run() {
                return x0.this.b.canvasRead(i7, i10, i11, i12, i13);
            }
        });
    }

    @Override // org.telegram.utils.twidget.d
    public final void D(int i7) {
        h1(new q0(this, i7, 1));
    }

    @Override // org.telegram.utils.twidget.d
    public final void F(final byte[] bArr, final byte[] bArr2, final double d, final int i7, final int i10, final float f10, final float f11, final int i11, final int i12) {
        h1(new p0() { // from class: org.telegram.utils.twidget.u0
            @Override // org.telegram.utils.twidget.p0
            public final Object run() {
                int i13;
                x0 x0Var = x0.this;
                byte[] i14 = x0Var.i1(bArr);
                int i15 = i7;
                if (i15 >= 0 && (i13 = i10) >= 0 && i15 <= 16384 && i13 <= 16384) {
                    float f12 = f10;
                    if (f12 > 0.0f && f12 <= 10.0f) {
                        WidgetSandboxBackend widgetSandboxBackend = x0Var.b;
                        byte[] bArr3 = bArr2;
                        if (bArr3 == null) {
                            bArr3 = new byte[]{123, 125};
                        }
                        widgetSandboxBackend.record(i14, bArr3, d, i15, i13, f12, f11, i11, i12);
                        return null;
                    }
                }
                throw new IllegalArgumentException("Frame size");
            }
        });
    }

    @Override // org.telegram.utils.twidget.d
    public final float[] G(final int i7, final byte[] bArr, final float f10, final int i10, final boolean z10, final byte[] bArr2) {
        return (float[]) h1(new p0() { // from class: org.telegram.utils.twidget.r0
            @Override // org.telegram.utils.twidget.p0
            public final Object run() {
                return x0.this.b.defineFont(i7, bArr, f10, i10, z10, bArr2);
            }
        });
    }

    @Override // org.telegram.utils.twidget.d
    public final void J0(final int i7, final int i10, final byte[] bArr) {
        h1(new p0() { // from class: org.telegram.utils.twidget.w0
            @Override // org.telegram.utils.twidget.p0
            public final Object run() {
                x0 x0Var = this;
                x0Var.b.recordLayer(i7, i10, x0Var.i1(bArr));
                return null;
            }
        });
    }

    @Override // org.telegram.utils.twidget.d
    public final void Q0(byte[] bArr) {
        h1(new s0(this, bArr, 1));
    }

    @Override // org.telegram.utils.twidget.d
    public final void R0(int i7, float f10) {
        try {
            this.b.state(i7, f10);
        } catch (Throwable unused) {
        }
    }

    @Override // org.telegram.utils.twidget.d
    public final void f1(int i7) {
        h1(new q0(this, i7, 0));
    }

    @Override // org.telegram.utils.twidget.d
    public final void h0(byte[] bArr) {
        h1(new s0(this, bArr, 0));
    }

    public final Object h1(p0 p0Var) {
        if (this.a.s == 0) {
            this.a.s = Binder.getCallingPid();
        }
        if (!this.e.tryAcquire()) {
            throw new IllegalStateException("Widget engine: too many calls at once");
        }
        try {
            if (!this.j.m.tryAcquire()) {
                throw new IllegalStateException("Widget engine: too many calls at once");
            }
            try {
                return p0Var.run();
            } finally {
                this.j.m.release();
            }
        } finally {
        }
    }

    public final synchronized byte[] i1(byte[] bArr) {
        if (bArr != null) {
            return bArr;
        }
        byte[] byteArray = this.d.toByteArray();
        this.d.reset();
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
                x(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
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
                R0(parcel.readInt(), parcel.readFloat());
                return true;
            case 11:
                t0(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createIntArray());
                parcel2.writeNoException();
                return true;
            case 12:
                byte[] A = A(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeByteArray(A);
                return true;
            case 13:
                D(parcel.readInt());
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i7, parcel, parcel2, i10);
        }
    }

    @Override // org.telegram.utils.twidget.d
    public final float p0(int i7, byte[] bArr) {
        return ((Float) h1(new t0(i7, 1, this, bArr))).floatValue();
    }

    @Override // org.telegram.utils.twidget.d
    public final void t0(int i7, int i10, int i11, int[] iArr) {
        h1(new s(this, i7, i10, i11, iArr, 2));
    }

    @Override // org.telegram.utils.twidget.d
    public final void v0(int i7, byte[] bArr) {
        h1(new t0(i7, 0, this, bArr));
    }

    @Override // org.telegram.utils.twidget.d
    public final void x(int i7, int i10, int i11, byte[] bArr) {
        h1(new s(this, i7, i10, i11, bArr, 1));
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
