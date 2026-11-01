package qh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s0 implements SensorEventListener {
    public final /* synthetic */ x0 a;

    public s0(x0 x0Var) {
        this.a = x0Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f7 = fArr[0];
        x0 x0Var = this.a;
        x0Var.H6 = f7;
        float f10 = fArr[1];
        x0Var.I6 = f10;
        float f11 = fArr[2];
        if (x0Var.L6) {
            return;
        }
        x0Var.J6 = f7;
        x0Var.K6 = f10;
        x0Var.L6 = true;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
