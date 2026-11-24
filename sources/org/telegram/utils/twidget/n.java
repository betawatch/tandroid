package org.telegram.utils.twidget;

import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class n extends Binder implements hj5 {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ WidgetEngineService a;

    public n(WidgetEngineService widgetEngineService) {
        this.a = widgetEngineService;
        attachInterface(this, "org.telegram.utils.twidget.IWidgetEngine");
    }

    @Override // hj5
    public final void B(long j, boolean z) {
        WidgetSandboxNative.visible(j, z);
    }

    @Override // hj5
    public final void E(long j, float f) {
        WidgetSandboxNative.width(j, f);
    }

    @Override // hj5
    public final long H(byte[] bArr, byte[] bArr2, float f, float f2, int i, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, boolean z, jj5 jj5Var) {
        if (WidgetEngineService.e) {
            sc8.j("Widget engine: no seccomp filter on this device");
            return 0L;
        }
        SystemClock.uptimeMillis();
        String f3 = WidgetEngineService.f(new dkc(this.a.getAssets(), (byte) 8));
        SystemClock.uptimeMillis();
        long create = WidgetSandboxNative.create(f3.getBytes(StandardCharsets.UTF_8), bArr, bArr2, f, f2, i, bArr3, bArr4, bArr5, bArr6, z, new WidgetEngineBackend(jj5Var, f2));
        Object obj = odd.a;
        synchronized (obj) {
            odd.b++;
            obj.notifyAll();
        }
        return create;
    }

    @Override // hj5
    public final void I(long j) {
        WidgetSandboxNative.repaint(j);
    }

    @Override // hj5
    public final void L(long j, int i, float f, float f2, int i2) {
        WidgetSandboxNative.hover(j, i, f, f2, i2);
    }

    @Override // hj5
    public final void M(long j, byte[] bArr) {
        WidgetSandboxNative.safeArea(j, bArr);
    }

    @Override // hj5
    public final void k(long j, float f, boolean z, boolean z2, boolean z3) {
        WidgetSandboxNative.tick(j, f, z, z2, z3);
    }

    @Override // hj5
    public final void l(long j, long j2, int i, byte[] bArr) {
        WidgetSandboxNative.answerRequest(j, j2, i, bArr);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcel parcel3;
        jj5 jj5Var;
        boolean z;
        boolean z2;
        if (i < 1 || i > 16777215) {
            parcel3 = parcel;
        } else {
            parcel3 = parcel;
            parcel3.enforceInterface("org.telegram.utils.twidget.IWidgetEngine");
        }
        if (i == 1598968902) {
            parcel2.writeString("org.telegram.utils.twidget.IWidgetEngine");
            return true;
        }
        switch (i) {
            case 1:
                byte[] createByteArray = parcel.createByteArray();
                byte[] createByteArray2 = parcel.createByteArray();
                float readFloat = parcel.readFloat();
                float readFloat2 = parcel.readFloat();
                int readInt = parcel.readInt();
                byte[] createByteArray3 = parcel.createByteArray();
                byte[] createByteArray4 = parcel.createByteArray();
                byte[] createByteArray5 = parcel.createByteArray();
                boolean z3 = false;
                byte[] createByteArray6 = parcel.createByteArray();
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    jj5Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngineCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof jj5)) {
                        ij5 ij5Var = new ij5();
                        ij5Var.a = readStrongBinder;
                        jj5Var = ij5Var;
                    } else {
                        jj5Var = (jj5) queryLocalInterface;
                    }
                }
                long H = H(createByteArray, createByteArray2, readFloat, readFloat2, readInt, createByteArray3, createByteArray4, createByteArray5, createByteArray6, z3, jj5Var);
                parcel2.writeNoException();
                parcel2.writeLong(H);
                return true;
            case 2:
                r(parcel.readLong());
                return true;
            case 3:
                WidgetSandboxNative.visible(parcel.readLong(), parcel.readInt() != 0);
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
                long readLong = parcel.readLong();
                boolean z4 = false;
                float readFloat3 = parcel.readFloat();
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = z;
                    z = true;
                } else {
                    z2 = z;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                WidgetSandboxNative.tick(readLong, readFloat3, z4, z, z2);
                return true;
            case 11:
                WidgetSandboxNative.touch(parcel.readLong(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
                return true;
            case 12:
                WidgetSandboxNative.hover(parcel.readLong(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
                return true;
            case 13:
                w(parcel3.readInt() != 0);
                return true;
            case 14:
                v(parcel3.readStrongBinder());
                parcel2.writeNoException();
                return true;
            case 15:
                parcel3.readInt();
                parcel3.readInt();
                parcel3.createByteArray();
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // hj5
    public final void r(final long j) {
        WidgetEngineService.d.execute(new Runnable() { // from class: org.telegram.utils.twidget.m
            @Override // java.lang.Runnable
            public final void run() {
                WidgetSandboxNative.destroy(j);
                synchronized (odd.a) {
                    odd.b = Math.max(0, odd.b - 1);
                }
            }
        });
    }

    @Override // hj5
    public final void s(long j, byte[] bArr) {
        WidgetSandboxNative.data(j, bArr);
    }

    @Override // hj5
    public final void u(long j, byte[] bArr) {
        WidgetSandboxNative.theme(j, bArr);
    }

    @Override // hj5
    public final void v(IBinder iBinder) {
        if (WidgetEngineService.e || Build.VERSION.SDK_INT < 29) {
            return;
        }
        WidgetEngineService.fileGate(iBinder);
    }

    @Override // hj5
    public final void w(boolean z) {
        if (WidgetEngineService.e) {
            return;
        }
        SystemClock.uptimeMillis();
        try {
            String f = WidgetEngineService.f(new dkc(this.a.getAssets(), (byte) 8));
            SystemClock.uptimeMillis();
            WidgetEngineBackend.warmFonts(this.a.getResources().getDisplayMetrics().density);
            SystemClock.uptimeMillis();
            WidgetSandboxNative.prepare(f.getBytes(StandardCharsets.UTF_8), z);
        } catch (RuntimeException e) {
            Log.e("WidgetEngine", "warmup failed", e);
        }
    }

    @Override // hj5
    public final void y(long j, int i, float f, float f2, int i2, boolean z, boolean z2, int i3, int i4) {
        WidgetSandboxNative.touch(j, i, f, f2, i2, z, z2, i3, i4);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
