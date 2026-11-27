// default package

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class pvc implements SensorEventListener {
    public final float[] a = new float[3];
    public final float[] b = new float[3];
    public int c;
    public final WindowManager d;
    public final SensorManager e;
    public final Sensor f;
    public boolean h;
    public ovc n;

    public pvc(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.e = sensorManager;
        this.f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i, int i2) {
        float f = i;
        float L = hl.L(16.0f) << 1;
        float f2 = (f + L) / f;
        float f3 = i2;
        return Math.max(f2, (L + f3) / f3);
    }

    public final void b(boolean z) {
        if (this.h != z) {
            this.h = z;
            Sensor sensor = this.f;
            if (sensor != null) {
                SensorManager sensorManager = this.e;
                if (z) {
                    sensorManager.registerListener(this, sensor, 1);
                } else {
                    sensorManager.unregisterListener(this);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSensorChanged(SensorEvent sensorEvent) {
        ovc ovcVar;
        float f;
        int rotation = this.d.getDefaultDisplay().getRotation();
        float[] fArr = sensorEvent.values;
        float f2 = fArr[0] / 9.80665f;
        float f3 = fArr[1] / 9.80665f;
        float f4 = fArr[2] / 9.80665f;
        float f5 = f4 * f4;
        float atan2 = (float) ((Math.atan2(f2, Math.sqrt((f3 * f3) + f5)) / 3.141592653589793d) * 2.0d);
        float atan22 = (float) ((Math.atan2(f3, Math.sqrt((f2 * f2) + f5)) / 3.141592653589793d) * 2.0d);
        if (rotation != 1) {
            if (rotation == 2) {
                float f6 = -atan22;
                atan22 = -atan2;
                atan2 = f6;
            } else if (rotation != 3) {
                atan2 = atan22;
                atan22 = atan2;
            } else {
                atan2 = -atan2;
            }
        }
        int i = this.c;
        float[] fArr2 = this.a;
        fArr2[i] = atan2;
        float[] fArr3 = this.b;
        fArr3[i] = atan22;
        this.c = (i + 1) % fArr2.length;
        float f7 = 0.0f;
        float f8 = 0.0f;
        for (int i2 = 0; i2 < fArr2.length; i2++) {
            f7 += fArr2[i2];
            f8 += fArr3[i2];
        }
        float length = f7 / fArr2.length;
        float length2 = f8 / fArr2.length;
        if (length <= 1.0f) {
            f = length < -1.0f ? -2.0f : 2.0f;
            int round = Math.round(hl.N(16.0f) * length2);
            int round2 = Math.round(hl.N(16.0f) * length);
            ovcVar = this.n;
            if (ovcVar == null) {
                ovcVar.e(round, round2);
                return;
            }
            return;
        }
        length = f - length;
        int round3 = Math.round(hl.N(16.0f) * length2);
        int round22 = Math.round(hl.N(16.0f) * length);
        ovcVar = this.n;
        if (ovcVar == null) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
