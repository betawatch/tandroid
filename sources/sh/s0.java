package sh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import qh.u9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class s0 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public final /* synthetic */ u0 d;

    public s0(u0 u0Var) {
        this.d = u0Var;
    }

    public final void a() {
        if (this.b == null || this.c == null) {
            return;
        }
        u0 u0Var = this.d;
        if (u0Var.k == null) {
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
                u0Var.k.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        u0 u0Var = this.d;
        u9 u9Var = u0Var.q;
        if (u9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(u9Var);
            u0Var.q = null;
        }
        if (u0Var.l || u0Var.k == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.a;
        if (sensorEvent.sensor.getType() == 1) {
            this.b = sensorEvent.values;
        }
        if (sensorEvent.sensor.getType() == 2) {
            this.c = sensorEvent.values;
        }
        long j10 = u0Var.h;
        if (currentTimeMillis >= j10) {
            a();
            return;
        }
        u9 u9Var2 = new u9(this, 11);
        u0Var.q = u9Var2;
        AndroidUtilities.runOnUIThread(u9Var2, j10 - currentTimeMillis);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
