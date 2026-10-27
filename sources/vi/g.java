package vi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class g extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ j a;

    public g(j jVar) {
        this.a = jVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        j jVar = this.a;
        n nVar = jVar.j;
        if (cameraCaptureSession != jVar.A) {
            return;
        }
        if (jVar.Q) {
            Object tag = captureRequest.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == jVar.U) {
                jVar.R++;
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                boolean z10 = !jVar.P ? !(num == null || num.intValue() == 0) : !(num != null && num.intValue() == 2);
                boolean z11 = !jVar.P || num2 == null || num2.intValue() == 3 || num2.intValue() == 4;
                if (z10 && z11) {
                    nVar.b("torch result confirmed: enabled=" + jVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + jVar.R + ", retries=" + jVar.S);
                    jVar.Q = false;
                } else {
                    int i11 = jVar.R;
                    if (i11 == 3 && (i10 = jVar.S) == 0) {
                        jVar.S = i10 + 1;
                        jVar.R = 0;
                        nVar.b("torch result not applied; rebuilding request: enabled=" + jVar.P + ", resultMode=" + num + ", flashState=" + num2);
                        jVar.g();
                    } else if (i11 >= 6) {
                        nVar.b("torch result failed: enabled=" + jVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + jVar.S);
                        jVar.Q = false;
                    }
                }
            }
        }
        Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l4 == null || l4.longValue() <= jVar.Z0) {
            return;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (jVar.Y0 == 0) {
            jVar.Y0 = l4.longValue();
            jVar.a1 = 1L;
        } else {
            long longValue = l4.longValue() - jVar.Z0;
            jVar.c1++;
            jVar.d1 += longValue;
            double d = longValue;
            jVar.e1 = (d * d) + jVar.e1;
            long j10 = jVar.f1;
            if (j10 == 0 || longValue < j10) {
                jVar.f1 = longValue;
            }
            jVar.g1 = Math.max(jVar.g1, longValue);
            if (longValue > 50000000) {
                jVar.h1++;
            }
            if (longValue > 100000000) {
                jVar.i1++;
            }
            jVar.a1++;
        }
        long j11 = jVar.b1;
        if (j11 != 0) {
            long j12 = elapsedRealtimeNanos - j11;
            jVar.j1++;
            jVar.k1 += j12;
            jVar.l1 = Math.max(jVar.l1, j12);
        }
        jVar.b1 = elapsedRealtimeNanos;
        jVar.Z0 = l4.longValue();
        long longValue2 = l4.longValue() - jVar.Y0;
        if (longValue2 < 3000000000L) {
            return;
        }
        float f7 = ((jVar.a1 - 1) * 1.0E9f) / longValue2;
        p0 p0Var = jVar.J;
        int i12 = p0Var == null ? 0 : p0Var.a;
        StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
        sb2.append(f7);
        sb2.append(", requestedFps=");
        sb2.append(jVar.h.a);
        sb2.append(", activeFps=");
        sb2.append(i12 == 0 ? "unknown" : Integer.valueOf(i12));
        sb2.append(", targetMet=");
        sb2.append(i12 == 0 || f7 >= ((float) i12) * 0.85f);
        sb2.append(", fpsRange=");
        sb2.append(jVar.K);
        sb2.append(", sensorIntervalMs={avg=");
        sb2.append(j.j(jVar.d1, jVar.c1));
        sb2.append(", min=");
        sb2.append(jVar.f1 / 1000000.0f);
        sb2.append(", max=");
        sb2.append(jVar.g1 / 1000000.0f);
        sb2.append(", jitter=");
        sb2.append(j.W(jVar.e1, jVar.d1, jVar.c1));
        sb2.append("}, sensorGaps={over50ms=");
        sb2.append(jVar.h1);
        sb2.append(", over100ms=");
        sb2.append(jVar.i1);
        sb2.append("}, callbackIntervalMs={avg=");
        sb2.append(j.j(jVar.k1, jVar.j1));
        sb2.append(", max=");
        sb2.append(jVar.l1 / 1000000.0f);
        sb2.append("}");
        nVar.b(sb2.toString());
        jVar.O();
        jVar.Y0 = l4.longValue();
        jVar.Z0 = l4.longValue();
        jVar.a1 = 1L;
        jVar.b1 = elapsedRealtimeNanos;
    }
}
