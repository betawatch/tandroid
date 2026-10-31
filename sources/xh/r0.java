package xh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class r0 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public float[] d;
    public final /* synthetic */ s0 e;

    public r0(s0 s0Var) {
        this.e = s0Var;
    }

    public final void a() {
        if (this.b == null) {
            return;
        }
        s0 s0Var = this.e;
        if (s0Var.k == null) {
            return;
        }
        this.a = System.currentTimeMillis();
        if (this.c == null) {
            this.c = new float[9];
        }
        if (this.d == null) {
            this.d = new float[4];
        }
        float[] fArr = this.b;
        if (fArr.length > 4) {
            System.arraycopy(fArr, 0, this.d, 0, 4);
            SensorManager.getRotationMatrixFromVector(this.c, this.d);
        } else {
            SensorManager.getRotationMatrixFromVector(this.c, fArr);
        }
        SensorManager.getOrientation(this.c, new float[3]);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("absolute", false);
            jSONObject.put("alpha", -r2[0]);
            jSONObject.put("beta", -r2[1]);
            jSONObject.put("gamma", r2[2]);
            s0Var.k.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
        } catch (Exception unused) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        s0 s0Var = this.e;
        d0 d0Var = s0Var.s;
        if (d0Var != null) {
            org.telegram.messenger.i0.r(d0Var);
            s0Var.s = null;
        }
        if (s0Var.l || s0Var.k == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.a;
        long j10 = s0Var.j;
        if (currentTimeMillis < j10) {
            d0 d0Var2 = new d0(this, 4);
            s0Var.s = d0Var2;
            org.telegram.messenger.i0.h3(d0Var2, j10 - currentTimeMillis);
        } else {
            if (sensorEvent.sensor.getType() == 15) {
                this.b = sensorEvent.values;
            }
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
