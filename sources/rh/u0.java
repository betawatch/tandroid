package rh;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import org.telegram.messenger.AndroidUtilities;
import ph.ga;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class u0 {
    public final SensorManager a;
    public Sensor b;
    public long c;
    public Sensor d;
    public long e;
    public Sensor f;
    public Sensor g;
    public long h;
    public Sensor i;
    public long j;
    public org.telegram.ui.web.y0 k;
    public boolean l;
    public ga m;
    public ga o;
    public ga q;
    public ga s;
    public final r0 n = new r0(this, 0);
    public final r0 p = new r0(this, 1);
    public final s0 r = new s0(this);
    public final t0 t = new t0(this);

    public u0(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
    }

    public static int a(long j10) {
        if (j10 >= 160) {
            return 3;
        }
        return j10 >= 60 ? 2 : 1;
    }

    public final void b() {
        if (this.l) {
            return;
        }
        this.l = true;
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            Sensor sensor = this.b;
            if (sensor != null) {
                sensorManager.unregisterListener(this.n, sensor);
            }
            ga gaVar = this.m;
            if (gaVar != null) {
                AndroidUtilities.cancelRunOnUIThread(gaVar);
                this.m = null;
            }
            Sensor sensor2 = this.d;
            if (sensor2 != null) {
                sensorManager.unregisterListener(this.p, sensor2);
            }
            ga gaVar2 = this.o;
            if (gaVar2 != null) {
                AndroidUtilities.cancelRunOnUIThread(gaVar2);
                this.o = null;
            }
            Sensor sensor3 = this.g;
            s0 s0Var = this.r;
            if (sensor3 != null) {
                sensorManager.unregisterListener(s0Var, sensor3);
            }
            Sensor sensor4 = this.f;
            if (sensor4 != null) {
                sensorManager.unregisterListener(s0Var, sensor4);
            }
            ga gaVar3 = this.q;
            if (gaVar3 != null) {
                AndroidUtilities.cancelRunOnUIThread(gaVar3);
                this.q = null;
            }
            Sensor sensor5 = this.i;
            if (sensor5 != null) {
                sensorManager.unregisterListener(this.t, sensor5);
            }
            ga gaVar4 = this.s;
            if (gaVar4 != null) {
                AndroidUtilities.cancelRunOnUIThread(gaVar4);
                this.s = null;
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        if (this.b == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            this.b = defaultSensor;
            if (defaultSensor == null) {
                return false;
            }
            this.c = j10;
            if (!this.l) {
                sensorManager.registerListener(this.n, defaultSensor, a(j10));
            }
        }
        return true;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        if (this.d == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(4);
            this.d = defaultSensor;
            if (defaultSensor == null) {
                return false;
            }
            this.e = j10;
            if (!this.l) {
                sensorManager.registerListener(this.p, defaultSensor, a(j10));
            }
        }
        return true;
    }

    public final boolean e(long j10, boolean z4) {
        Sensor sensor;
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        t0 t0Var = this.t;
        s0 s0Var = this.r;
        if (z4) {
            if (this.i != null) {
                ga gaVar = this.s;
                if (gaVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar);
                    this.s = null;
                }
                if (!this.l && (sensor = this.i) != null) {
                    sensorManager.unregisterListener(t0Var, sensor);
                }
                this.i = null;
            }
            if (this.f == null || this.g == null) {
                this.g = sensorManager.getDefaultSensor(1);
                Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                this.f = defaultSensor;
                Sensor sensor2 = this.g;
                if (sensor2 == null || defaultSensor == null) {
                    return false;
                }
                this.h = j10;
                if (!this.l) {
                    sensorManager.registerListener(s0Var, sensor2, a(j10));
                    sensorManager.registerListener(s0Var, this.f, a(j10));
                    return true;
                }
            }
        } else {
            if (this.f != null || this.g != null) {
                ga gaVar2 = this.q;
                if (gaVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar2);
                    this.q = null;
                }
                if (!this.l) {
                    Sensor sensor3 = this.g;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(s0Var, sensor3);
                    }
                    Sensor sensor4 = this.f;
                    if (sensor4 != null) {
                        sensorManager.unregisterListener(s0Var, sensor4);
                    }
                }
                this.g = null;
                this.f = null;
            }
            if (this.i == null) {
                Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                this.i = defaultSensor2;
                if (defaultSensor2 == null) {
                    return false;
                }
                this.j = j10;
                if (!this.l) {
                    sensorManager.registerListener(t0Var, defaultSensor2, a(j10));
                }
            }
        }
        return true;
    }

    public final boolean f() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.b;
        if (sensor == null) {
            return true;
        }
        if (!this.l) {
            sensorManager.unregisterListener(this.n, sensor);
        }
        ga gaVar = this.m;
        if (gaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(gaVar);
            this.m = null;
        }
        this.b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.l) {
            sensorManager.unregisterListener(this.p, sensor);
        }
        ga gaVar = this.o;
        if (gaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(gaVar);
            this.o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.g;
        if (sensor == null && this.f == null && this.i == null) {
            return true;
        }
        if (!this.l) {
            s0 s0Var = this.r;
            if (sensor != null) {
                sensorManager.unregisterListener(s0Var, sensor);
            }
            Sensor sensor2 = this.f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(s0Var, sensor2);
            }
            Sensor sensor3 = this.i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.t, sensor3);
            }
        }
        ga gaVar = this.q;
        if (gaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(gaVar);
            this.q = null;
        }
        ga gaVar2 = this.s;
        if (gaVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(gaVar2);
            this.s = null;
        }
        this.g = null;
        this.f = null;
        this.i = null;
        return true;
    }
}
