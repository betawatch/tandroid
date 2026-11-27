// default package

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class ur0 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public final /* synthetic */ wr0 d;

    public ur0(wr0 wr0Var) {
        this.d = wr0Var;
    }

    public final void a() {
        if (this.b == null || this.c == null) {
            return;
        }
        wr0 wr0Var = this.d;
        if (wr0Var.k != null) {
            this.a = System.currentTimeMillis();
            float[] fArr = new float[9];
            if (SensorManager.getRotationMatrix(fArr, new float[9], this.b, this.c)) {
                SensorManager.getOrientation(fArr, new float[3]);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", true);
                    jSONObject.put("alpha", -r7[0]);
                    jSONObject.put("beta", -r7[1]);
                    jSONObject.put("gamma", r7[2]);
                    wr0Var.k.c("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        wr0 wr0Var = this.d;
        pz pzVar = wr0Var.q;
        if (pzVar != null) {
            hl.r(pzVar);
            wr0Var.q = null;
        }
        if (wr0Var.l || wr0Var.k == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.a;
        if (sensorEvent.sensor.getType() == 1) {
            this.b = sensorEvent.values;
        }
        if (sensorEvent.sensor.getType() == 2) {
            this.c = sensorEvent.values;
        }
        long j = wr0Var.h;
        if (currentTimeMillis >= j) {
            a();
            return;
        }
        pz pzVar2 = new pz(this, (byte) 27);
        wr0Var.q = pzVar2;
        hl.d3(pzVar2, j - currentTimeMillis);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
