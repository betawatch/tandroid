package xh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p0 implements SensorEventListener {
    public final /* synthetic */ int a;
    public long b;
    public float[] c;
    public final /* synthetic */ s0 d;

    public p0(s0 s0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.d = s0Var;
                this.c = new float[3];
                break;
            default:
                this.d = s0Var;
                break;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                s0 s0Var = this.d;
                if (s0Var.k != null && this.c != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.c[0]);
                        jSONObject.put("y", -this.c[1]);
                        jSONObject.put("z", -this.c[2]);
                        s0Var.k.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                float[] fArr = this.c;
                s0 s0Var2 = this.d;
                if (s0Var2.k != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        s0Var2.k.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
                    } catch (Exception unused2) {
                    }
                    fArr[0] = 0.0f;
                    fArr[1] = 0.0f;
                    fArr[2] = 0.0f;
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
        int i11 = this.a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.a) {
            case 0:
                s0 s0Var = this.d;
                d0 d0Var = s0Var.m;
                if (d0Var != null) {
                    org.telegram.messenger.i0.r(d0Var);
                    s0Var.m = null;
                }
                if (!s0Var.l && s0Var.k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.b;
                    this.c = sensorEvent.values;
                    long j10 = s0Var.c;
                    if (currentTimeMillis >= j10) {
                        c();
                        break;
                    } else {
                        d0 d0Var2 = new d0(this, 1);
                        s0Var.m = d0Var2;
                        org.telegram.messenger.i0.h3(d0Var2, j10 - currentTimeMillis);
                        break;
                    }
                }
                break;
            default:
                s0 s0Var2 = this.d;
                d0 d0Var3 = s0Var2.o;
                if (d0Var3 != null) {
                    org.telegram.messenger.i0.r(d0Var3);
                    s0Var2.o = null;
                }
                if (!s0Var2.l && s0Var2.k != null) {
                    float[] fArr = this.c;
                    float f7 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f7 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.b;
                    long j11 = s0Var2.e;
                    if (currentTimeMillis2 >= j11) {
                        c();
                        break;
                    } else {
                        d0 d0Var4 = new d0(this, 2);
                        s0Var2.o = d0Var4;
                        org.telegram.messenger.i0.h3(d0Var4, j11 - currentTimeMillis2);
                        break;
                    }
                }
                break;
        }
    }

    private final void a(Sensor sensor, int i10) {
    }

    private final void b(Sensor sensor, int i10) {
    }
}
