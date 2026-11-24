// default package

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ts0 implements SensorEventListener {
    public final /* synthetic */ byte a;
    public long b;
    public float[] c;
    public final /* synthetic */ ws0 d;

    public ts0(ws0 ws0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.d = ws0Var;
                this.c = new float[3];
                break;
            default:
                this.d = ws0Var;
                break;
        }
    }

    public final void c() {
        byte b = this.a;
        ws0 ws0Var = this.d;
        switch (b) {
            case 0:
                if (ws0Var.k != null && this.c != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.c[0]);
                        jSONObject.put("y", -this.c[1]);
                        jSONObject.put("z", -this.c[2]);
                        ws0Var.k.c("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                float[] fArr = this.c;
                if (ws0Var.k != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        ws0Var.k.c("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
    public final void onAccuracyChanged(Sensor sensor, int i) {
        byte b = this.a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        byte b = this.a;
        ws0 ws0Var = this.d;
        switch (b) {
            case 0:
                f00 f00Var = ws0Var.m;
                if (f00Var != null) {
                    gm.r(f00Var);
                    ws0Var.m = null;
                }
                if (!ws0Var.l && ws0Var.k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.b;
                    this.c = sensorEvent.values;
                    long j = ws0Var.c;
                    if (currentTimeMillis >= j) {
                        c();
                        break;
                    } else {
                        f00 f00Var2 = new f00(this, (byte) 26);
                        ws0Var.m = f00Var2;
                        gm.d3(f00Var2, j - currentTimeMillis);
                        break;
                    }
                }
                break;
            default:
                f00 f00Var3 = ws0Var.o;
                if (f00Var3 != null) {
                    gm.r(f00Var3);
                    ws0Var.o = null;
                }
                if (!ws0Var.l && ws0Var.k != null) {
                    float[] fArr = this.c;
                    float f = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.b;
                    long j2 = ws0Var.e;
                    if (currentTimeMillis2 >= j2) {
                        c();
                        break;
                    } else {
                        f00 f00Var4 = new f00(this, (byte) 27);
                        ws0Var.o = f00Var4;
                        gm.d3(f00Var4, j2 - currentTimeMillis2);
                        break;
                    }
                }
                break;
        }
    }

    private final void a(Sensor sensor, int i) {
    }

    private final void b(Sensor sensor, int i) {
    }
}
