// default package

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vs0 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public float[] d;
    public final /* synthetic */ ws0 e;

    public vs0(ws0 ws0Var) {
        this.e = ws0Var;
    }

    public final void a() {
        if (this.b != null) {
            ws0 ws0Var = this.e;
            if (ws0Var.k != null) {
                this.a = System.currentTimeMillis();
                float[] fArr = this.c;
                if (fArr == null) {
                    fArr = new float[9];
                    this.c = fArr;
                }
                float[] fArr2 = this.d;
                if (fArr2 == null) {
                    fArr2 = new float[4];
                    this.d = fArr2;
                }
                float[] fArr3 = this.b;
                if (fArr3.length > 4) {
                    System.arraycopy(fArr3, 0, fArr2, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(fArr, fArr3);
                }
                SensorManager.getOrientation(this.c, new float[3]);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
                    jSONObject.put("alpha", -r2[0]);
                    jSONObject.put("beta", -r2[1]);
                    jSONObject.put("gamma", r2[2]);
                    ws0Var.k.c("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        ws0 ws0Var = this.e;
        f00 f00Var = ws0Var.s;
        if (f00Var != null) {
            gm.r(f00Var);
            ws0Var.s = null;
        }
        if (ws0Var.l || ws0Var.k == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.a;
        long j = ws0Var.j;
        if (currentTimeMillis < j) {
            f00 f00Var2 = new f00(this, (byte) 29);
            ws0Var.s = f00Var2;
            gm.d3(f00Var2, j - currentTimeMillis);
        } else {
            if (sensorEvent.sensor.getType() == 15) {
                this.b = sensorEvent.values;
            }
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
