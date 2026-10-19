package zh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class x0 implements SensorEventListener {
    public final /* synthetic */ c1 a;

    public x0(c1 c1Var) {
        this.a = c1Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f7 = fArr[0];
        c1 c1Var = this.a;
        c1Var.I6 = f7;
        float f10 = fArr[1];
        c1Var.J6 = f10;
        float f11 = fArr[2];
        if (c1Var.M6) {
            return;
        }
        c1Var.K6 = f7;
        c1Var.L6 = f10;
        c1Var.M6 = true;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
