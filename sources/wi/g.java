package wi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class g extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ k a;

    public g(k kVar) {
        this.a = kVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i7;
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
                boolean z9 = !kVar.P ? !(num == null || num.intValue() == 0) : !(num != null && num.intValue() == 2);
                boolean z10 = !kVar.P || num2 == null || num2.intValue() == 3 || num2.intValue() == 4;
                if (z9 && z10) {
                    oVar.b("torch result confirmed: enabled=" + kVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + kVar.R + ", retries=" + kVar.S);
                    kVar.Q = false;
                } else {
                    int i10 = kVar.R;
                    if (i10 == 3 && (i7 = kVar.S) == 0) {
                        kVar.S = i7 + 1;
                        kVar.R = 0;
                        oVar.b("torch result not applied; rebuilding request: enabled=" + kVar.P + ", resultMode=" + num + ", flashState=" + num2);
                        kVar.f();
                    } else if (i10 >= 6) {
                        oVar.b("torch result failed: enabled=" + kVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + kVar.S);
                        kVar.Q = false;
                    }
                }
            }
        }
        Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null || l10.longValue() <= kVar.X0) {
            return;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (kVar.W0 == 0) {
            kVar.W0 = l10.longValue();
            kVar.Y0 = 1L;
        } else {
            long longValue = l10.longValue() - kVar.X0;
            kVar.a1++;
            kVar.b1 += longValue;
            double d = longValue;
            kVar.c1 = (d * d) + kVar.c1;
            long j3 = kVar.d1;
            if (j3 == 0 || longValue < j3) {
                kVar.d1 = longValue;
            }
            kVar.e1 = Math.max(kVar.e1, longValue);
            if (longValue > 50000000) {
                kVar.f1++;
            }
            if (longValue > 100000000) {
                kVar.g1++;
            }
            kVar.Y0++;
        }
        long j10 = kVar.Z0;
        if (j10 != 0) {
            long j11 = elapsedRealtimeNanos - j10;
            kVar.h1++;
            kVar.i1 += j11;
            kVar.j1 = Math.max(kVar.j1, j11);
        }
        kVar.Z0 = elapsedRealtimeNanos;
        kVar.X0 = l10.longValue();
        long longValue2 = l10.longValue() - kVar.W0;
        if (longValue2 < 3000000000L) {
            return;
        }
        float f10 = ((kVar.Y0 - 1) * 1.0E9f) / longValue2;
        o0 o0Var = kVar.J;
        int i11 = o0Var == null ? 0 : o0Var.a;
        StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
        sb2.append(f10);
        sb2.append(", requestedFps=");
        sb2.append(kVar.h.a);
        sb2.append(", activeFps=");
        sb2.append(i11 == 0 ? "unknown" : Integer.valueOf(i11));
        sb2.append(", targetMet=");
        sb2.append(i11 == 0 || f10 >= ((float) i11) * 0.85f);
        sb2.append(", fpsRange=");
        sb2.append(kVar.K);
        sb2.append(", sensorIntervalMs={avg=");
        sb2.append(k.i(kVar.b1, kVar.a1));
        sb2.append(", min=");
        sb2.append(kVar.d1 / 1000000.0f);
        sb2.append(", max=");
        sb2.append(kVar.e1 / 1000000.0f);
        sb2.append(", jitter=");
        sb2.append(k.V(kVar.c1, kVar.b1, kVar.a1));
        sb2.append("}, sensorGaps={over50ms=");
        sb2.append(kVar.f1);
        sb2.append(", over100ms=");
        sb2.append(kVar.g1);
        sb2.append("}, callbackIntervalMs={avg=");
        sb2.append(k.i(kVar.i1, kVar.h1));
        sb2.append(", max=");
        sb2.append(kVar.j1 / 1000000.0f);
        sb2.append("}");
        oVar.b(sb2.toString());
        kVar.O();
        kVar.W0 = l10.longValue();
        kVar.X0 = l10.longValue();
        kVar.Y0 = 1L;
        kVar.Z0 = elapsedRealtimeNanos;
    }
}
