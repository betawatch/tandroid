package xh;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s0 {
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
    public org.telegram.ui.web.v0 k;
    public boolean l;
    public d0 m;
    public d0 o;
    public d0 q;
    public d0 s;
    public final p0 n = new p0(this, 0);
    public final p0 p = new p0(this, 1);
    public final q0 r = new q0(this);
    public final r0 t = new r0(this);

    public s0(Context context) {
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
            d0 d0Var = this.m;
            if (d0Var != null) {
                org.telegram.messenger.i0.r(d0Var);
                this.m = null;
            }
            Sensor sensor2 = this.d;
            if (sensor2 != null) {
                sensorManager.unregisterListener(this.p, sensor2);
            }
            d0 d0Var2 = this.o;
            if (d0Var2 != null) {
                org.telegram.messenger.i0.r(d0Var2);
                this.o = null;
            }
            Sensor sensor3 = this.g;
            q0 q0Var = this.r;
            if (sensor3 != null) {
                sensorManager.unregisterListener(q0Var, sensor3);
            }
            Sensor sensor4 = this.f;
            if (sensor4 != null) {
                sensorManager.unregisterListener(q0Var, sensor4);
            }
            d0 d0Var3 = this.q;
            if (d0Var3 != null) {
                org.telegram.messenger.i0.r(d0Var3);
                this.q = null;
            }
            Sensor sensor5 = this.i;
            if (sensor5 != null) {
                sensorManager.unregisterListener(this.t, sensor5);
            }
            d0 d0Var4 = this.s;
            if (d0Var4 != null) {
                org.telegram.messenger.i0.r(d0Var4);
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

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        r0 r0Var = this.t;
        q0 q0Var = this.r;
        if (z10) {
            if (this.i != null) {
                d0 d0Var = this.s;
                if (d0Var != null) {
                    org.telegram.messenger.i0.r(d0Var);
                    this.s = null;
                }
                if (!this.l && (sensor = this.i) != null) {
                    sensorManager.unregisterListener(r0Var, sensor);
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
                    sensorManager.registerListener(q0Var, sensor2, a(j10));
                    sensorManager.registerListener(q0Var, this.f, a(j10));
                    return true;
                }
            }
        } else {
            if (this.f != null || this.g != null) {
                d0 d0Var2 = this.q;
                if (d0Var2 != null) {
                    org.telegram.messenger.i0.r(d0Var2);
                    this.q = null;
                }
                if (!this.l) {
                    Sensor sensor3 = this.g;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(q0Var, sensor3);
                    }
                    Sensor sensor4 = this.f;
                    if (sensor4 != null) {
                        sensorManager.unregisterListener(q0Var, sensor4);
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
                    sensorManager.registerListener(r0Var, defaultSensor2, a(j10));
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
        d0 d0Var = this.m;
        if (d0Var != null) {
            org.telegram.messenger.i0.r(d0Var);
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
        d0 d0Var = this.o;
        if (d0Var != null) {
            org.telegram.messenger.i0.r(d0Var);
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
            q0 q0Var = this.r;
            if (sensor != null) {
                sensorManager.unregisterListener(q0Var, sensor);
            }
            Sensor sensor2 = this.f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(q0Var, sensor2);
            }
            Sensor sensor3 = this.i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.t, sensor3);
            }
        }
        d0 d0Var = this.q;
        if (d0Var != null) {
            org.telegram.messenger.i0.r(d0Var);
            this.q = null;
        }
        d0 d0Var2 = this.s;
        if (d0Var2 != null) {
            org.telegram.messenger.i0.r(d0Var2);
            this.s = null;
        }
        this.g = null;
        this.f = null;
        this.i = null;
        return true;
    }
}
