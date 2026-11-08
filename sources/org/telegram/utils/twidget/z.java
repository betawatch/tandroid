package org.telegram.utils.twidget;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class z extends Binder implements b {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ WidgetEngineService a;

    public z(WidgetEngineService widgetEngineService) {
        this.a = widgetEngineService;
        attachInterface(this, "org.telegram.utils.twidget.IWidgetEngine");
    }

    @Override // org.telegram.utils.twidget.b
    public final void G0(long j3, float f10) {
        WidgetSandboxNative.width(j3, f10);
    }

    @Override // org.telegram.utils.twidget.b
    public final void J(final long j3) {
        WidgetEngineService.d.execute(new Runnable() { // from class: org.telegram.utils.twidget.y
            @Override // java.lang.Runnable
            public final void run() {
                WidgetSandboxNative.destroy(j3);
            }
        });
    }

    @Override // org.telegram.utils.twidget.b
    public final void M0(long j3) {
        WidgetSandboxNative.repaint(j3);
    }

    @Override // org.telegram.utils.twidget.b
    public final void R(long j3, byte[] bArr) {
        WidgetSandboxNative.data(j3, bArr);
    }

    @Override // org.telegram.utils.twidget.b
    public final void Y0(long j3, int i7, float f10, float f11, int i10) {
        WidgetSandboxNative.hover(j3, i7, f10, f11, i10);
    }

    @Override // org.telegram.utils.twidget.b
    public final void b1() {
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            WidgetEngineService.a(this.a.getAssets());
            Log.i("WidgetEngine", "warm: bundles in " + (SystemClock.uptimeMillis() - uptimeMillis) + " ms");
        } catch (RuntimeException e10) {
            Log.e("WidgetEngine", "warmup failed", e10);
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void d1(long j3, byte[] bArr) {
        WidgetSandboxNative.safeArea(j3, bArr);
    }

    @Override // org.telegram.utils.twidget.b
    public final void e0(long j3, byte[] bArr) {
        WidgetSandboxNative.theme(j3, bArr);
    }

    @Override // org.telegram.utils.twidget.b
    public final void j0(long j3, int i7, float f10, float f11, int i10, boolean z9, boolean z10, int i11, int i12) {
        WidgetSandboxNative.touch(j3, i7, f10, f11, i10, z9, z10, i11, i12);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        Parcel parcel3;
        d dVar;
        boolean z9;
        boolean z10;
        if (i7 < 1 || i7 > 16777215) {
            parcel3 = parcel;
        } else {
            parcel3 = parcel;
            parcel3.enforceInterface("org.telegram.utils.twidget.IWidgetEngine");
        }
        if (i7 == 1598968902) {
            parcel2.writeString("org.telegram.utils.twidget.IWidgetEngine");
            return true;
        }
        switch (i7) {
            case 1:
                byte[] createByteArray = parcel.createByteArray();
                byte[] createByteArray2 = parcel.createByteArray();
                float readFloat = parcel.readFloat();
                float readFloat2 = parcel.readFloat();
                int readInt = parcel.readInt();
                byte[] createByteArray3 = parcel.createByteArray();
                byte[] createByteArray4 = parcel.createByteArray();
                byte[] createByteArray5 = parcel.createByteArray();
                boolean z11 = false;
                byte[] createByteArray6 = parcel.createByteArray();
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    dVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngineCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                        c cVar = new c();
                        cVar.a = readStrongBinder;
                        dVar = cVar;
                    } else {
                        dVar = (d) queryLocalInterface;
                    }
                }
                long t6 = t(createByteArray, createByteArray2, readFloat, readFloat2, readInt, createByteArray3, createByteArray4, createByteArray5, createByteArray6, z11, dVar);
                parcel2.writeNoException();
                parcel2.writeLong(t6);
                return true;
            case 2:
                J(parcel.readLong());
                return true;
            case 3:
                boolean z12 = false;
                long readLong = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z12 = true;
                }
                WidgetSandboxNative.visible(readLong, z12);
                return true;
            case 4:
                WidgetSandboxNative.theme(parcel.readLong(), parcel.createByteArray());
                return true;
            case 5:
                WidgetSandboxNative.width(parcel.readLong(), parcel.readFloat());
                return true;
            case 6:
                WidgetSandboxNative.data(parcel.readLong(), parcel.createByteArray());
                return true;
            case 7:
                WidgetSandboxNative.safeArea(parcel.readLong(), parcel.createByteArray());
                return true;
            case 8:
                WidgetSandboxNative.answerRequest(parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.createByteArray());
                return true;
            case 9:
                WidgetSandboxNative.repaint(parcel.readLong());
                return true;
            case 10:
                boolean z13 = false;
                long readLong2 = parcel3.readLong();
                float readFloat3 = parcel.readFloat();
                if (parcel.readInt() != 0) {
                    z9 = false;
                    z13 = true;
                } else {
                    z9 = false;
                }
                if (parcel.readInt() != 0) {
                    z10 = z9;
                    z9 = true;
                } else {
                    z10 = z9;
                }
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                WidgetSandboxNative.tick(readLong2, readFloat3, z13, z9, z10);
                return true;
            case 11:
                WidgetSandboxNative.touch(parcel3.readLong(), parcel3.readInt(), parcel3.readFloat(), parcel3.readFloat(), parcel3.readInt(), parcel3.readInt() != 0, parcel3.readInt() != 0, parcel3.readInt(), parcel3.readInt());
                return true;
            case 12:
                WidgetSandboxNative.hover(parcel3.readLong(), parcel3.readInt(), parcel3.readFloat(), parcel3.readFloat(), parcel3.readInt());
                return true;
            case 13:
                b1();
                return true;
            case 14:
                v(parcel3.readInt() != 0, parcel3.readInt() != 0, parcel3.createByteArray());
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i7, parcel, parcel2, i10);
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void s(long j3, float f10, boolean z9, boolean z10, boolean z11) {
        WidgetSandboxNative.tick(j3, f10, z9, z10, z11);
    }

    @Override // org.telegram.utils.twidget.b
    public final long t(byte[] bArr, byte[] bArr2, float f10, float f11, int i7, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, boolean z9, d dVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        String a10 = WidgetEngineService.a(this.a.getAssets());
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        long create = WidgetSandboxNative.create(a10.getBytes(StandardCharsets.UTF_8), bArr, bArr2, f10, f11, i7, bArr3, bArr4, bArr5, bArr6, z9, new WidgetEngineBackend(dVar, f11));
        Log.i("WidgetEngine", "session in " + (SystemClock.uptimeMillis() - uptimeMillis) + " ms (bundles " + uptimeMillis2 + " ms)");
        return create;
    }

    @Override // org.telegram.utils.twidget.b
    public final void u(long j3, long j10, int i7, byte[] bArr) {
        WidgetSandboxNative.answerRequest(j3, j10, i7, bArr);
    }

    @Override // org.telegram.utils.twidget.b
    public final void u0(long j3, boolean z9) {
        WidgetSandboxNative.visible(j3, z9);
    }

    @Override // org.telegram.utils.twidget.b
    public final void v(boolean z9, boolean z10, byte[] bArr) {
        WidgetSandboxNative.conformance(z9);
        WidgetSandboxNative.attackScan(z10);
        WidgetSandboxNative.limits(bArr);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
