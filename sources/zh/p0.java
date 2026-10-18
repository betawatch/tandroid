package zh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class p0 implements SensorEventListener {
    public final /* synthetic */ u0 a;

    public p0(u0 u0Var) {
        this.a = u0Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f7 = fArr[0];
        u0 u0Var = this.a;
        u0Var.I6 = f7;
        float f10 = fArr[1];
        u0Var.J6 = f10;
        float f11 = fArr[2];
        if (u0Var.M6) {
            return;
        }
        u0Var.K6 = f7;
        u0Var.L6 = f10;
        u0Var.M6 = true;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
