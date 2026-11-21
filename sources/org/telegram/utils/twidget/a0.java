package org.telegram.utils.twidget;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.cd0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class a0 extends Binder implements b {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ WidgetEngineService a;

    public a0(WidgetEngineService widgetEngineService) {
        this.a = widgetEngineService;
        attachInterface(this, "org.telegram.utils.twidget.IWidgetEngine");
    }

    @Override // org.telegram.utils.twidget.b
    public final void G0(long j3, float f10) {
        WidgetSandboxNative.width(j3, f10);
    }

    @Override // org.telegram.utils.twidget.b
    public final void J(final long j3) {
        WidgetEngineService.d.execute(new Runnable() { // from class: org.telegram.utils.twidget.z
            @Override // java.lang.Runnable
            public final void run() {
                WidgetSandboxNative.destroy(j3);
                synchronized (l.a) {
                    l.b = Math.max(0, l.b - 1);
                }
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
    public final void Z0(long j3, int i7, float f10, float f11, int i10) {
        WidgetSandboxNative.hover(j3, i7, f10, f11, i10);
    }

    @Override // org.telegram.utils.twidget.b
    public final void b1() {
        if (WidgetEngineService.e) {
            return;
        }
        SystemClock.uptimeMillis();
        try {
            String d = WidgetEngineService.d(new q(this.a.getAssets(), 3));
            SystemClock.uptimeMillis();
            WidgetEngineBackend.warmFonts(this.a.getResources().getDisplayMetrics().density);
            SystemClock.uptimeMillis();
            WidgetSandboxNative.prepare(d.getBytes(StandardCharsets.UTF_8));
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
    public final void j0(long j3, int i7, float f10, float f11, int i10, boolean z10, boolean z11, int i11, int i12) {
        WidgetSandboxNative.touch(j3, i7, f10, f11, i10, z10, z11, i11, i12);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        Parcel parcel3;
        d dVar;
        d dVar2;
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
                byte[] createByteArray6 = parcel.createByteArray();
                boolean z10 = parcel.readInt() != 0;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    dVar2 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngineCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                        c cVar = new c();
                        cVar.a = readStrongBinder;
                        dVar = cVar;
                        long t6 = t(createByteArray, createByteArray2, readFloat, readFloat2, readInt, createByteArray3, createByteArray4, createByteArray5, createByteArray6, z10, dVar);
                        parcel2.writeNoException();
                        parcel2.writeLong(t6);
                        return true;
                    }
                    dVar2 = (d) queryLocalInterface;
                }
                dVar = dVar2;
                long t62 = t(createByteArray, createByteArray2, readFloat, readFloat2, readInt, createByteArray3, createByteArray4, createByteArray5, createByteArray6, z10, dVar);
                parcel2.writeNoException();
                parcel2.writeLong(t62);
                return true;
            case 2:
                J(parcel.readLong());
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
                WidgetSandboxNative.tick(parcel.readLong(), parcel.readFloat(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                return true;
            case 11:
                WidgetSandboxNative.touch(parcel.readLong(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
                return true;
            case 12:
                WidgetSandboxNative.hover(parcel.readLong(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
                return true;
            case 13:
                b1();
                return true;
            case 14:
                parcel3.readInt();
                parcel3.readInt();
                parcel3.createByteArray();
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i7, parcel, parcel2, i10);
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void s(long j3, float f10, boolean z10, boolean z11, boolean z12) {
        WidgetSandboxNative.tick(j3, f10, z10, z11, z12);
    }

    @Override // org.telegram.utils.twidget.b
    public final long t(byte[] bArr, byte[] bArr2, float f10, float f11, int i7, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, boolean z10, d dVar) {
        if (WidgetEngineService.e) {
            throw new IllegalStateException("Widget engine: no seccomp filter on this device");
        }
        SystemClock.uptimeMillis();
        String d = WidgetEngineService.d(new q(this.a.getAssets(), 3));
        SystemClock.uptimeMillis();
        long create = WidgetSandboxNative.create(d.getBytes(StandardCharsets.UTF_8), bArr, bArr2, f10, f11, i7, bArr3, bArr4, bArr5, bArr6, z10, new WidgetEngineBackend(dVar, f11));
        Object obj = l.a;
        synchronized (obj) {
            try {
                l.b++;
                if (!l.c) {
                    l.c = true;
                    Thread thread = new Thread(new cd0(17), "widget-engine-memory");
                    thread.setDaemon(true);
                    thread.start();
                }
                obj.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return create;
    }

    @Override // org.telegram.utils.twidget.b
    public final void u(long j3, long j10, int i7, byte[] bArr) {
        WidgetSandboxNative.answerRequest(j3, j10, i7, bArr);
    }

    @Override // org.telegram.utils.twidget.b
    public final void u0(long j3, boolean z10) {
        WidgetSandboxNative.visible(j3, z10);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
