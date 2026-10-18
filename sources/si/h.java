package si;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class h extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ k a;

    public h(k kVar) {
        this.a = kVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        k kVar = this.a;
        o oVar = kVar.j;
        if (cameraCaptureSession != kVar.A) {
            return;
        }
        if (kVar.Q) {
            Object tag = captureRequest.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == kVar.U) {
                kVar.R++;
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                boolean z10 = !kVar.P ? !(num == null || num.intValue() == 0) : !(num != null && num.intValue() == 2);
                boolean z11 = !kVar.P || num2 == null || num2.intValue() == 3 || num2.intValue() == 4;
                if (z10 && z11) {
                    oVar.b("torch result confirmed: enabled=" + kVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + kVar.R + ", retries=" + kVar.S);
                    kVar.Q = false;
                } else {
                    int i11 = kVar.R;
                    if (i11 == 3 && (i10 = kVar.S) == 0) {
                        kVar.S = i10 + 1;
                        kVar.R = 0;
                        oVar.b("torch result not applied; rebuilding request: enabled=" + kVar.P + ", resultMode=" + num + ", flashState=" + num2);
                        kVar.g();
                    } else if (i11 >= 6) {
                        oVar.b("torch result failed: enabled=" + kVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + kVar.S);
                        kVar.Q = false;
                    }
                }
            }
        }
        Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l4 == null || l4.longValue() <= kVar.Y0) {
            return;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (kVar.X0 == 0) {
            kVar.X0 = l4.longValue();
            kVar.Z0 = 1L;
        } else {
            long longValue = l4.longValue() - kVar.Y0;
            kVar.b1++;
            kVar.c1 += longValue;
            double d = longValue;
            kVar.d1 = (d * d) + kVar.d1;
            long j10 = kVar.e1;
            if (j10 == 0 || longValue < j10) {
                kVar.e1 = longValue;
            }
            kVar.f1 = Math.max(kVar.f1, longValue);
            if (longValue > 50000000) {
                kVar.g1++;
            }
            if (longValue > 100000000) {
                kVar.h1++;
            }
            kVar.Z0++;
        }
        long j11 = kVar.a1;
        if (j11 != 0) {
            long j12 = elapsedRealtimeNanos - j11;
            kVar.i1++;
            kVar.j1 += j12;
            kVar.k1 = Math.max(kVar.k1, j12);
        }
        kVar.a1 = elapsedRealtimeNanos;
        kVar.Y0 = l4.longValue();
        long longValue2 = l4.longValue() - kVar.X0;
        if (longValue2 < 3000000000L) {
            return;
        }
        float f7 = ((kVar.Z0 - 1) * 1.0E9f) / longValue2;
        n0 n0Var = kVar.J;
        int i12 = n0Var == null ? 0 : n0Var.a;
        StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
        sb2.append(f7);
        sb2.append(", requestedFps=");
        sb2.append(kVar.h.a);
        sb2.append(", activeFps=");
        sb2.append(i12 == 0 ? "unknown" : Integer.valueOf(i12));
        sb2.append(", targetMet=");
        sb2.append(i12 == 0 || f7 >= ((float) i12) * 0.85f);
        sb2.append(", fpsRange=");
        sb2.append(kVar.K);
        sb2.append(", sensorIntervalMs={avg=");
        sb2.append(k.j(kVar.c1, kVar.b1));
        sb2.append(", min=");
        sb2.append(kVar.e1 / 1000000.0f);
        sb2.append(", max=");
        sb2.append(kVar.f1 / 1000000.0f);
        sb2.append(", jitter=");
        sb2.append(k.W(kVar.d1, kVar.c1, kVar.b1));
        sb2.append("}, sensorGaps={over50ms=");
        sb2.append(kVar.g1);
        sb2.append(", over100ms=");
        sb2.append(kVar.h1);
        sb2.append("}, callbackIntervalMs={avg=");
        sb2.append(k.j(kVar.j1, kVar.i1));
        sb2.append(", max=");
        sb2.append(kVar.k1 / 1000000.0f);
        sb2.append("}");
        oVar.b(sb2.toString());
        kVar.O();
        kVar.X0 = l4.longValue();
        kVar.Y0 = l4.longValue();
        kVar.Z0 = 1L;
        kVar.a1 = elapsedRealtimeNanos;
    }
}
