// default package

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ry8 implements SensorEventListener {
    public final /* synthetic */ wy8 a;

    public ry8(wy8 wy8Var) {
        this.a = wy8Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f = fArr[0];
        wy8 wy8Var = this.a;
        wy8Var.H6 = f;
        float f2 = fArr[1];
        wy8Var.I6 = f2;
        float f3 = fArr[2];
        if (wy8Var.L6) {
            return;
        }
        wy8Var.J6 = f;
        wy8Var.K6 = f2;
        wy8Var.L6 = true;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
