package zh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class o0 implements SensorEventListener {
    public final /* synthetic */ t0 a;

    public o0(t0 t0Var) {
        this.a = t0Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f7 = fArr[0];
        t0 t0Var = this.a;
        t0Var.I6 = f7;
        float f10 = fArr[1];
        t0Var.J6 = f10;
        float f11 = fArr[2];
        if (t0Var.M6) {
            return;
        }
        t0Var.K6 = f7;
        t0Var.L6 = f10;
        t0Var.M6 = true;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
