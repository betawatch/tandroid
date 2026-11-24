// default package

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class s93 implements vyb {
    public static final w59 p = mm5.t(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final w59 q = mm5.t(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final w59 r = mm5.t(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final w59 s = mm5.t(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final w59 t = mm5.t(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final w59 u = mm5.t(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static s93 v;
    public final Context a;
    public final qm5 b;
    public final i4d c;
    public final adb d;
    public final boolean e;
    public final nja f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public volatile long l;
    public long m;
    public int n;
    public String o;

    public s93(Context context, HashMap hashMap) {
        boolean z;
        adb adbVar = adb.a;
        this.a = context == null ? null : context.getApplicationContext();
        this.b = qm5.b(hashMap);
        this.c = new i4d((byte) 9);
        this.f = new nja();
        this.d = adbVar;
        this.e = true;
        if (context == null) {
            this.n = 0;
            this.l = 1000000L;
            return;
        }
        ev2 g = ev2.g(context);
        int h = g.h();
        this.n = h;
        this.l = c(h);
        r93 r93Var = new r93(this);
        Executor a = pd0.a();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) g.e;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            aj7 aj7Var = (aj7) it.next();
            if (aj7Var.a.get() == null) {
                copyOnWriteArrayList.remove(aj7Var);
            }
        }
        aj7 aj7Var2 = new aj7(g, r93Var, a);
        synchronized (g.f) {
            ((CopyOnWriteArrayList) g.e).add(aj7Var2);
            z = g.d;
        }
        if (z) {
            aj7Var2.b.execute(new vl6(aj7Var2, (byte) 22));
        }
    }

    public static synchronized s93 d(Context context) {
        s93 s93Var;
        synchronized (s93.class) {
            s93Var = v;
            if (s93Var == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                hashMap.put(2, -9223372036854775807L);
                hashMap.put(3, -9223372036854775807L);
                hashMap.put(4, -9223372036854775807L);
                hashMap.put(5, -9223372036854775807L);
                hashMap.put(10, -9223372036854775807L);
                hashMap.put(9, -9223372036854775807L);
                hashMap.put(7, -9223372036854775807L);
                s93Var = new s93(applicationContext, hashMap);
                v = s93Var;
            }
        }
        return s93Var;
    }

    public final void a(Handler handler, l93 l93Var) {
        l93Var.getClass();
        i4d i4dVar = this.c;
        i4dVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) i4dVar.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            he0 he0Var = (he0) it.next();
            if (he0Var.b == l93Var) {
                he0Var.c = true;
                copyOnWriteArrayList.remove(he0Var);
            }
        }
        copyOnWriteArrayList.add(new he0(handler, l93Var));
    }

    public final synchronized long b() {
        return this.l;
    }

    public final long c(int i) {
        long longValue;
        Integer valueOf = Integer.valueOf(i);
        qm5 qm5Var = this.b;
        Long l = (Long) qm5Var.get(valueOf);
        int i2 = 0;
        if (l == null) {
            l = (Long) qm5Var.get(0);
        } else if (l.longValue() == -9223372036854775807L) {
            String str = this.o;
            if (str == null) {
                str = "";
            }
            switch (str) {
                case "AD":
                case "AI":
                case "BB":
                case "BQ":
                case "CW":
                case "DM":
                case "KN":
                case "KY":
                case "SX":
                case "VC":
                    i2 = 73745;
                    break;
                case "AE":
                    i2 = 50849;
                    break;
                case "AF":
                case "SZ":
                    i2 = 76004;
                    break;
                case "AG":
                case "CI":
                    i2 = 76002;
                    break;
                case "AL":
                    i2 = 74825;
                    break;
                case "AM":
                case "PA":
                    i2 = 75418;
                    break;
                case "AO":
                    i2 = 75555;
                    break;
                case "AQ":
                case "ER":
                case "NU":
                case "SC":
                case "SH":
                    i2 = 74900;
                    break;
                case "AR":
                    i2 = 70802;
                    break;
                case "AS":
                    i2 = 75474;
                    break;
                case "AT":
                case "EE":
                case "HU":
                case "IS":
                case "LV":
                case "MT":
                case "SE":
                    i2 = 65536;
                    break;
                case "AU":
                    i2 = 12888;
                    break;
                case "AW":
                    i2 = 75986;
                    break;
                case "AX":
                case "CX":
                case "LI":
                case "MS":
                case "PM":
                case "SM":
                case "VA":
                    i2 = 74896;
                    break;
                case "AZ":
                case "DJ":
                case "LY":
                case "SL":
                    i2 = 75476;
                    break;
                case "BA":
                case "JO":
                case "TR":
                    i2 = 74313;
                    break;
                case "BD":
                    i2 = 83146;
                    break;
                case "BE":
                    i2 = 69696;
                    break;
                case "BF":
                case "SD":
                case "SY":
                case "TD":
                    i2 = 76060;
                    break;
                case "BG":
                case "PT":
                case "SI":
                    i2 = 69632;
                    break;
                case "BH":
                    i2 = 83545;
                    break;
                case "BI":
                case "GQ":
                case "HT":
                case "NE":
                case "VE":
                case "YE":
                    i2 = 76068;
                    break;
                case "BJ":
                    i2 = 75428;
                    break;
                case "BL":
                case "MP":
                case "PY":
                    i2 = 74897;
                    break;
                case "BM":
                    i2 = 73744;
                    break;
                case "BN":
                    i2 = 73747;
                    break;
                case "BO":
                    i2 = 76049;
                    break;
                case "BR":
                    i2 = 139849;
                    break;
                case "BS":
                    i2 = 74323;
                    break;
                case "BT":
                    i2 = 78987;
                    break;
                case "BW":
                    i2 = 73811;
                    break;
                case "BY":
                    i2 = 75473;
                    break;
                case "BZ":
                case "CK":
                    i2 = 74386;
                    break;
                case "CA":
                case "UA":
                    i2 = 111696;
                    break;
                case "CD":
                case "ML":
                    i2 = 74907;
                    break;
                case "CF":
                    i2 = 75028;
                    break;
                case "CG":
                case "EG":
                case "MG":
                    i2 = 75491;
                    break;
                case "CH":
                    i2 = 65544;
                    break;
                case "CL":
                case "TH":
                    i2 = 74888;
                    break;
                case "CM":
                case "MR":
                    i2 = 75996;
                    break;
                case "CN":
                    i2 = 45634;
                    break;
                case "CO":
                    i2 = 74970;
                    break;
                case "CR":
                case "NI":
                    i2 = 76066;
                    break;
                case "CU":
                case "KI":
                case "NR":
                case "TL":
                    i2 = 76052;
                    break;
                case "CV":
                    i2 = 74266;
                    break;
                case "CY":
                    i2 = 65601;
                    break;
                case "CZ":
                    i2 = 69760;
                    break;
                case "DE":
                    i2 = 42248;
                    break;
                case "DK":
                    i2 = 65664;
                    break;
                case "DO":
                case "LR":
                    i2 = 76067;
                    break;
                case "DZ":
                case "TJ":
                    i2 = 76059;
                    break;
                case "EC":
                    i2 = 74393;
                    break;
                case "ES":
                    i2 = TLObject.FLAG_12;
                    break;
                case "ET":
                    i2 = 84252;
                    break;
                case "FI":
                    i2 = 66048;
                    break;
                case "FJ":
                    i2 = 75411;
                    break;
                case "FK":
                case "NF":
                case "SJ":
                    i2 = 74899;
                    break;
                case "FM":
                    i2 = 74004;
                    break;
                case "FO":
                    i2 = 73872;
                    break;
                case "FR":
                    i2 = 66121;
                    break;
                case "GA":
                    i2 = 73763;
                    break;
                case "GB":
                    i2 = 74953;
                    break;
                case "GD":
                    i2 = 73746;
                    break;
                case "GE":
                    i2 = 74761;
                    break;
                case "GF":
                    i2 = 75475;
                    break;
                case "GG":
                    i2 = 74320;
                    break;
                case "GH":
                    i2 = 74971;
                    break;
                case "GI":
                case "IM":
                case "JE":
                    i2 = 74256;
                    break;
                case "GL":
                case "MC":
                    i2 = 73873;
                    break;
                case "GM":
                case "SS":
                    i2 = 75932;
                    break;
                case "GN":
                    i2 = 75043;
                    break;
                case "GP":
                    i2 = 75338;
                    break;
                case "GR":
                    i2 = 69633;
                    break;
                case "GT":
                    i2 = 74378;
                    break;
                case "GU":
                    i2 = 79634;
                    break;
                case "GW":
                    i2 = 74852;
                    break;
                case "GY":
                    i2 = 75339;
                    break;
                case "HK":
                    i2 = 4616;
                    break;
                case "HR":
                case "KW":
                    i2 = 65537;
                    break;
                case "ID":
                    i2 = 141003;
                    break;
                case "IE":
                    i2 = 70217;
                    break;
                case "IL":
                    i2 = 83601;
                    break;
                case "IN":
                    i2 = 107721;
                    break;
                case "IO":
                    i2 = 73875;
                    break;
                case "IQ":
                    i2 = 74963;
                    break;
                case "IR":
                    i2 = 116436;
                    break;
                case "IT":
                    i2 = 70728;
                    break;
                case "JM":
                    i2 = 74466;
                    break;
                case "JP":
                    i2 = 83608;
                    break;
                case "KE":
                    i2 = 70227;
                    break;
                case "KG":
                    i2 = 74826;
                    break;
                case "KH":
                    i2 = 75009;
                    break;
                case "KM":
                case "VU":
                    i2 = 74972;
                    break;
                case "KR":
                    i2 = 149648;
                    break;
                case "KZ":
                    i2 = 78986;
                    break;
                case "LA":
                    i2 = 75345;
                    break;
                case "LB":
                    i2 = 74827;
                    break;
                case "LC":
                    i2 = 74322;
                    break;
                case "LK":
                case "MM":
                    i2 = 83667;
                    break;
                case "LS":
                case "PG":
                    i2 = 75484;
                    break;
                case "LT":
                    i2 = 66056;
                    break;
                case "LU":
                    i2 = 103620;
                    break;
                case "MA":
                    i2 = 74331;
                    break;
                case "MD":
                    i2 = 73729;
                    break;
                case "ME":
                    i2 = 78338;
                    break;
                case "MF":
                    i2 = 75409;
                    break;
                case "MH":
                case "TM":
                case "TV":
                case "WF":
                    i2 = 75924;
                    break;
                case "MK":
                    i2 = 78337;
                    break;
                case "MN":
                    i2 = 74882;
                    break;
                case "MO":
                    i2 = 47376;
                    break;
                case "MQ":
                    i2 = 75402;
                    break;
                case "MU":
                    i2 = 74763;
                    break;
                case "MV":
                    i2 = 83539;
                    break;
                case "MW":
                    i2 = 74387;
                    break;
                case "MX":
                    i2 = 80162;
                    break;
                case "MY":
                    i2 = 4865;
                    break;
                case "MZ":
                case "WS":
                    i2 = 74891;
                    break;
                case "NA":
                    i2 = 74979;
                    break;
                case "NC":
                case "YT":
                    i2 = 75994;
                    break;
                case "NG":
                    i2 = 74403;
                    break;
                case "NL":
                    i2 = 132874;
                    break;
                case "NO":
                    i2 = 65728;
                    break;
                case "NP":
                    i2 = 75538;
                    break;
                case "NZ":
                    i2 = 83008;
                    break;
                case "OM":
                    i2 = 83034;
                    break;
                case "PE":
                    i2 = 80145;
                    break;
                case "PF":
                    i2 = 74450;
                    break;
                case "PH":
                    i2 = 42634;
                    break;
                case "PK":
                    i2 = 75483;
                    break;
                case "PL":
                    i2 = 148609;
                    break;
                case "PR":
                    i2 = 8834;
                    break;
                case "PS":
                    i2 = 75363;
                    break;
                case "PW":
                    i2 = 74514;
                    break;
                case "QA":
                    i2 = 84257;
                    break;
                case "RE":
                    i2 = 71320;
                    break;
                case "RO":
                    i2 = 78400;
                    break;
                case "RS":
                    i2 = 74241;
                    break;
                case "RU":
                    i2 = 111105;
                    break;
                case "RW":
                    i2 = 73883;
                    break;
                case "SA":
                    i2 = 9291;
                    break;
                case "SB":
                case "ZW":
                    i2 = 75540;
                    break;
                case "SG":
                    i2 = 38618;
                    break;
                case "SK":
                    i2 = 74312;
                    break;
                case "SN":
                    i2 = 74980;
                    break;
                case "SO":
                    i2 = 84178;
                    break;
                case "SR":
                    i2 = 74530;
                    break;
                case "ST":
                    i2 = 74834;
                    break;
                case "SV":
                    i2 = 74394;
                    break;
                case "TC":
                    i2 = 74835;
                    break;
                case "TG":
                    i2 = 73827;
                    break;
                case "TN":
                    i2 = 74315;
                    break;
                case "TO":
                    i2 = 75539;
                    break;
                case "TT":
                    i2 = 73826;
                    break;
                case "TW":
                    break;
                case "TZ":
                    i2 = 78499;
                    break;
                case "UG":
                    i2 = 83611;
                    break;
                case "US":
                    i2 = 45842;
                    break;
                case "UY":
                    i2 = 70730;
                    break;
                case "UZ":
                    i2 = 80081;
                    break;
                case "VG":
                    i2 = 139858;
                    break;
                case "VI":
                    i2 = 74832;
                    break;
                case "VN":
                    i2 = 74816;
                    break;
                case "XK":
                    i2 = 74321;
                    break;
                case "ZA":
                    i2 = 70306;
                    break;
                case "ZM":
                    i2 = 75556;
                    break;
                default:
                    i2 = 74898;
                    break;
            }
            if (i != 2) {
                if (i == 3) {
                    longValue = ((Long) q.get((i2 >> 3) & 7)).longValue();
                } else if (i == 4) {
                    longValue = ((Long) r.get((i2 >> 6) & 7)).longValue();
                } else if (i == 5) {
                    longValue = ((Long) s.get((i2 >> 9) & 7)).longValue();
                } else if (i != 7) {
                    if (i == 9) {
                        longValue = ((Long) u.get((i2 >> 15) & 7)).longValue();
                    } else if (i != 10) {
                        longValue = 1000000;
                    } else {
                        longValue = ((Long) t.get((i2 >> 12) & 7)).longValue();
                    }
                }
                l = Long.valueOf(longValue);
            }
            longValue = ((Long) p.get(i2 & 7)).longValue();
            l = Long.valueOf(longValue);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public final void e(long j, int i, long j2) {
        long j3;
        int i2;
        long j4;
        if (i == 0 && j == 0 && j2 == this.m) {
            return;
        }
        this.m = j2;
        Iterator it = ((CopyOnWriteArrayList) this.c.a).iterator();
        while (it.hasNext()) {
            he0 he0Var = (he0) it.next();
            if (he0Var.c) {
                j3 = j;
                i2 = i;
                j4 = j2;
            } else {
                j3 = j;
                i2 = i;
                j4 = j2;
                he0Var.a.post(new l30((Object) he0Var, i2, j3, j4, (byte) 1));
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
    }

    public final synchronized void f(long j, long j2) {
        this.d.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.j += (int) (elapsedRealtime - this.h);
        this.k += j;
        if (j2 > 0 && j > 0) {
            this.f.a((j * 8000.0f) / j2, (int) Math.sqrt(j));
            if (this.j >= 2000 || this.k >= 524288) {
                this.l = (long) this.f.b();
            }
            e(j, (int) j2, this.l);
            this.h = elapsedRealtime;
            this.i = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r10.k >= 524288) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x000c, code lost:
    
        if ((r11.h & 8) != 8) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0015 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void g(u63 u63Var, boolean z) {
        Throwable th;
        s93 s93Var;
        boolean z2;
        s93 s93Var2;
        try {
            if (z) {
                if (u63Var != null) {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        s93Var = this;
                        throw th;
                    }
                }
                z2 = true;
                if (!z2) {
                    try {
                        gre.p(this.g > 0);
                        try {
                            this.d.getClass();
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            int i = (int) (elapsedRealtime - this.h);
                            this.j += i;
                            long j = this.k;
                            long j2 = this.i;
                            this.k = j + j2;
                            if (i > 0) {
                                this.f.a((j2 * 8000.0f) / i, (int) Math.sqrt(j2));
                                if (this.j < 2000) {
                                }
                                this.l = (long) this.f.b();
                                s93Var2 = this;
                                s93Var2.e(this.i, i, this.l);
                                s93Var2.h = elapsedRealtime;
                                s93Var2.i = 0L;
                            } else {
                                s93Var2 = this;
                            }
                            s93Var2.g--;
                            return;
                        } catch (Throwable th3) {
                            s93Var = this;
                            th = th3;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        s93Var = this;
                        th = th;
                        throw th;
                    }
                }
            }
            z2 = false;
            if (!z2) {
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x000b, code lost:
    
        if ((r2.h & 8) != 8) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0014 A[Catch: all -> 0x002c, TRY_ENTER, TryCatch #0 {, blocks: (B:21:0x0006, B:10:0x0014, B:12:0x0018, B:13:0x0023), top: B:20:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void h(u63 u63Var, boolean z) {
        boolean z2;
        if (z) {
            if (u63Var != null) {
            }
            z2 = true;
            if (z2) {
                return;
            }
            if (this.g == 0) {
                this.d.getClass();
                this.h = SystemClock.elapsedRealtime();
            }
            this.g++;
            return;
        }
        z2 = false;
        if (z2) {
        }
    }
}
