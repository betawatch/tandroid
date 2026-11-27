// default package

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class tr0 implements SensorEventListener {
    public final /* synthetic */ byte a;
    public long b;
    public float[] c;
    public final /* synthetic */ wr0 d;

    public tr0(wr0 wr0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.d = wr0Var;
                this.c = new float[3];
                break;
            default:
                this.d = wr0Var;
                break;
        }
    }

    public final void c() {
        byte b = this.a;
        wr0 wr0Var = this.d;
        switch (b) {
            case 0:
                if (wr0Var.k != null && this.c != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.c[0]);
                        jSONObject.put("y", -this.c[1]);
                        jSONObject.put("z", -this.c[2]);
                        wr0Var.k.c("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                float[] fArr = this.c;
                if (wr0Var.k != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        wr0Var.k.c("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
        wr0 wr0Var = this.d;
        switch (b) {
            case 0:
                pz pzVar = wr0Var.m;
                if (pzVar != null) {
                    hl.r(pzVar);
                    wr0Var.m = null;
                }
                if (!wr0Var.l && wr0Var.k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.b;
                    this.c = sensorEvent.values;
                    long j = wr0Var.c;
                    if (currentTimeMillis >= j) {
                        c();
                        break;
                    } else {
                        pz pzVar2 = new pz(this, (byte) 25);
                        wr0Var.m = pzVar2;
                        hl.d3(pzVar2, j - currentTimeMillis);
                        break;
                    }
                }
                break;
            default:
                pz pzVar3 = wr0Var.o;
                if (pzVar3 != null) {
                    hl.r(pzVar3);
                    wr0Var.o = null;
                }
                if (!wr0Var.l && wr0Var.k != null) {
                    float[] fArr = this.c;
                    float f = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.b;
                    long j2 = wr0Var.e;
                    if (currentTimeMillis2 >= j2) {
                        c();
                        break;
                    } else {
                        pz pzVar4 = new pz(this, (byte) 26);
                        wr0Var.o = pzVar4;
                        hl.d3(pzVar4, j2 - currentTimeMillis2);
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
