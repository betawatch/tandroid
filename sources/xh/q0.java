package xh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q0 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public final /* synthetic */ s0 d;

    public q0(s0 s0Var) {
        this.d = s0Var;
    }

    public final void a() {
        if (this.b == null || this.c == null) {
            return;
        }
        s0 s0Var = this.d;
        if (s0Var.k == null) {
            return;
        }
        this.a = System.currentTimeMillis();
        float[] fArr = new float[9];
        if (SensorManager.getRotationMatrix(fArr, new float[9], this.b, this.c)) {
            SensorManager.getOrientation(fArr, new float[3]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("absolute", true);
                jSONObject.put("alpha", -r2[0]);
                jSONObject.put("beta", -r2[1]);
                jSONObject.put("gamma", r2[2]);
                s0Var.k.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        s0 s0Var = this.d;
        d0 d0Var = s0Var.q;
        if (d0Var != null) {
            org.telegram.messenger.i0.r(d0Var);
            s0Var.q = null;
        }
        if (s0Var.l || s0Var.k == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.a;
        if (sensorEvent.sensor.getType() == 1) {
            this.b = sensorEvent.values;
        }
        if (sensorEvent.sensor.getType() == 2) {
            this.c = sensorEvent.values;
        }
        long j10 = s0Var.h;
        if (currentTimeMillis >= j10) {
            a();
            return;
        }
        d0 d0Var2 = new d0(this, 3);
        s0Var.q = d0Var2;
        org.telegram.messenger.i0.h3(d0Var2, j10 - currentTimeMillis);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
