package zi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class h extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ l a;

    public h(l lVar) {
        this.a = lVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i7;
        l lVar = this.a;
        p pVar = lVar.j;
        if (cameraCaptureSession != lVar.z) {
            return;
        }
        if (lVar.P) {
            Object tag = captureRequest.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == lVar.T) {
                lVar.Q++;
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                boolean z10 = !lVar.O ? !(num == null || num.intValue() == 0) : !(num != null && num.intValue() == 2);
                boolean z11 = !lVar.O || num2 == null || num2.intValue() == 3 || num2.intValue() == 4;
                if (z10 && z11) {
                    pVar.b("torch result confirmed: enabled=" + lVar.O + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + lVar.Q + ", retries=" + lVar.R);
                    lVar.P = false;
                } else {
                    int i10 = lVar.Q;
                    if (i10 == 3 && (i7 = lVar.R) == 0) {
                        lVar.R = i7 + 1;
                        lVar.Q = 0;
                        pVar.b("torch result not applied; rebuilding request: enabled=" + lVar.O + ", resultMode=" + num + ", flashState=" + num2);
                        lVar.f();
                    } else if (i10 >= 6) {
                        pVar.b("torch result failed: enabled=" + lVar.O + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + lVar.R);
                        lVar.P = false;
                    }
                }
            }
        }
        Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null || l10.longValue() <= lVar.W0) {
            return;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (lVar.V0 == 0) {
            lVar.V0 = l10.longValue();
            lVar.X0 = 1L;
        } else {
            long longValue = l10.longValue() - lVar.W0;
            lVar.Z0++;
            lVar.a1 += longValue;
            double d = longValue;
            lVar.b1 = (d * d) + lVar.b1;
            long j3 = lVar.c1;
            if (j3 == 0 || longValue < j3) {
                lVar.c1 = longValue;
            }
            lVar.d1 = Math.max(lVar.d1, longValue);
            if (longValue > 50000000) {
                lVar.e1++;
            }
            if (longValue > 100000000) {
                lVar.f1++;
            }
            lVar.X0++;
        }
        long j10 = lVar.Y0;
        if (j10 != 0) {
            long j11 = elapsedRealtimeNanos - j10;
            lVar.g1++;
            lVar.h1 += j11;
            lVar.i1 = Math.max(lVar.i1, j11);
        }
        lVar.Y0 = elapsedRealtimeNanos;
        lVar.W0 = l10.longValue();
        long longValue2 = l10.longValue() - lVar.V0;
        if (longValue2 < 3000000000L) {
            return;
        }
        float f10 = ((lVar.X0 - 1) * 1.0E9f) / longValue2;
        q0 q0Var = lVar.I;
        int i11 = q0Var == null ? 0 : q0Var.a;
        StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
        sb2.append(f10);
        sb2.append(", requestedFps=");
        sb2.append(lVar.h.a);
        sb2.append(", activeFps=");
        sb2.append(i11 == 0 ? "unknown" : Integer.valueOf(i11));
        sb2.append(", targetMet=");
        sb2.append(i11 == 0 || f10 >= ((float) i11) * 0.85f);
        sb2.append(", fpsRange=");
        sb2.append(lVar.J);
        sb2.append(", sensorIntervalMs={avg=");
        sb2.append(l.i(lVar.a1, lVar.Z0));
        sb2.append(", min=");
        sb2.append(lVar.c1 / 1000000.0f);
        sb2.append(", max=");
        sb2.append(lVar.d1 / 1000000.0f);
        sb2.append(", jitter=");
        sb2.append(l.U(lVar.b1, lVar.a1, lVar.Z0));
        sb2.append("}, sensorGaps={over50ms=");
        sb2.append(lVar.e1);
        sb2.append(", over100ms=");
        sb2.append(lVar.f1);
        sb2.append("}, callbackIntervalMs={avg=");
        sb2.append(l.i(lVar.h1, lVar.g1));
        sb2.append(", max=");
        sb2.append(lVar.i1 / 1000000.0f);
        sb2.append("}");
        pVar.b(sb2.toString());
        lVar.N();
        lVar.V0 = l10.longValue();
        lVar.W0 = l10.longValue();
        lVar.X0 = 1L;
        lVar.Y0 = elapsedRealtimeNanos;
    }
}
