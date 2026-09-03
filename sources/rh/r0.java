package rh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import ph.ga;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class r0 implements SensorEventListener {
    public final /* synthetic */ int a;
    public long b;
    public float[] c;
    public final /* synthetic */ u0 d;

    public r0(u0 u0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.d = u0Var;
                this.c = new float[3];
                break;
            default:
                this.d = u0Var;
                break;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.d;
                if (u0Var.k != null && this.c != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.c[0]);
                        jSONObject.put("y", -this.c[1]);
                        jSONObject.put("z", -this.c[2]);
                        u0Var.k.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                float[] fArr = this.c;
                u0 u0Var2 = this.d;
                if (u0Var2.k != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        u0Var2.k.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
                u0 u0Var = this.d;
                ga gaVar = u0Var.m;
                if (gaVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar);
                    u0Var.m = null;
                }
                if (!u0Var.l && u0Var.k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.b;
                    this.c = sensorEvent.values;
                    long j10 = u0Var.c;
                    if (currentTimeMillis >= j10) {
                        c();
                        break;
                    } else {
                        ga gaVar2 = new ga(this, 8);
                        u0Var.m = gaVar2;
                        AndroidUtilities.runOnUIThread(gaVar2, j10 - currentTimeMillis);
                        break;
                    }
                }
                break;
            default:
                u0 u0Var2 = this.d;
                ga gaVar3 = u0Var2.o;
                if (gaVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar3);
                    u0Var2.o = null;
                }
                if (!u0Var2.l && u0Var2.k != null) {
                    float[] fArr = this.c;
                    float f10 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f10 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.b;
                    long j11 = u0Var2.e;
                    if (currentTimeMillis2 >= j11) {
                        c();
                        break;
                    } else {
                        ga gaVar4 = new ga(this, 9);
                        u0Var2.o = gaVar4;
                        AndroidUtilities.runOnUIThread(gaVar4, j11 - currentTimeMillis2);
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
