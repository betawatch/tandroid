package zh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class w0 implements SensorEventListener {
    public final /* synthetic */ b1 a;

    public w0(b1 b1Var) {
        this.a = b1Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f7 = fArr[0];
        b1 b1Var = this.a;
        b1Var.o6 = f7;
        float f10 = fArr[1];
        b1Var.p6 = f10;
        float f11 = fArr[2];
        if (b1Var.s6) {
            return;
        }
        b1Var.q6 = f7;
        b1Var.r6 = f10;
        b1Var.s6 = true;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
