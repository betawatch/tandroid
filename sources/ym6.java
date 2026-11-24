// default package

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ym6 extends om6 {
    public static final int[] V1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean W1;
    public static boolean X1;
    public int A1;
    public long B1;
    public int C1;
    public int D1;
    public int E1;
    public ot9 F1;
    public long G1;
    public boolean H1;
    public long I1;
    public int J1;
    public long K1;
    public jec L1;
    public jec M1;
    public int N1;
    public boolean O1;
    public int P1;
    public xm6 Q1;
    public vcc R1;
    public long S1;
    public boolean T1;
    public int U1;
    public final Context a1;
    public final boolean b1;
    public final xab c1;
    public final byte d1;
    public final boolean e1;
    public final xcc f1;
    public final qz0 g1;
    public final zj4 h1;
    public final hi2 i1;
    public final long j1;
    public final ycc k1;
    public final PriorityQueue l1;
    public pd0 m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public iec r1;
    public boolean s1;
    public int t1;
    public List u1;
    public Surface v1;
    public rd8 w1;
    public yka x1;
    public boolean y1;
    public int z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ym6(wm6 wm6Var) {
        super(r0.getApplicationContext(), 2, wm6Var.c);
        Context context = wm6Var.a;
        byte b = 2;
        Context applicationContext = context.getApplicationContext();
        this.a1 = applicationContext;
        this.d1 = wm6Var.g;
        this.r1 = null;
        this.c1 = new xab(wm6Var.e, wm6Var.f);
        this.b1 = this.r1 == null;
        this.f1 = new xcc(applicationContext, this, wm6Var.d);
        this.g1 = new qz0();
        this.h1 = new zj4(new cj6(this, b));
        HashSet hashSet = ct6.a;
        this.e1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.x1 = yka.c;
        this.z1 = 1;
        this.A1 = 0;
        this.L1 = jec.d;
        this.P1 = 0;
        this.M1 = null;
        this.N1 = -1000;
        this.S1 = -9223372036854775807L;
        this.i1 = new hi2((byte) 8);
        this.l1 = new PriorityQueue();
        this.j1 = -15000L;
        this.k1 = new ycc();
        this.F1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x064c, code lost:
    
        if (r0.equals("ELUGA_Ray_X") == false) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0796, code lost:
    
        if (r13.equals("JSN-L21") != false) goto L508;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0798 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean J0(String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (ym6.class) {
            if (!W1) {
                HashSet hashSet = ct6.a;
                int i = Build.VERSION.SDK_INT;
                char c = 28;
                if (i <= 28) {
                    String str2 = Build.DEVICE;
                    str2.getClass();
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                z2 = false;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                z2 = true;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                z2 = 2;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                z2 = 3;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                z2 = 4;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                z2 = 5;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                z2 = 6;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                z2 = 7;
                                break;
                            }
                            z2 = -1;
                            break;
                        default:
                            z2 = -1;
                            break;
                    }
                    switch (z2) {
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            z3 = true;
                            break;
                    }
                    X1 = z3;
                    W1 = true;
                }
                if (i > 27 || !"HWEML".equals(Build.DEVICE)) {
                    String str3 = Build.MODEL;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                z = 3;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                z = 4;
                                break;
                            }
                            z = -1;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                z = 5;
                                break;
                            }
                            z = -1;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                z = 6;
                                break;
                            }
                            z = -1;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                z = 7;
                                break;
                            }
                            z = -1;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                z = 8;
                                break;
                            }
                            z = -1;
                            break;
                        default:
                            z = -1;
                            break;
                    }
                    switch (z) {
                        default:
                            if (i <= 26) {
                                String str4 = Build.DEVICE;
                                str4.getClass();
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        if (str4.equals("GIONEE_SWW1609")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2144781185:
                                        if (str4.equals("GIONEE_SWW1627")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2144781160:
                                        if (str4.equals("GIONEE_SWW1631")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2097309513:
                                        if (str4.equals("K50a40")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2022874474:
                                        if (str4.equals("CP8676_I02")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1978993182:
                                        if (str4.equals("NX541J")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1978990237:
                                        if (str4.equals("NX573J")) {
                                            c = 6;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688988:
                                        if (str4.equals("PGN528")) {
                                            c = 7;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688066:
                                        if (str4.equals("PGN610")) {
                                            c = '\b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688065:
                                        if (str4.equals("PGN611")) {
                                            c = '\t';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1931988508:
                                        if (str4.equals("AquaPowerM")) {
                                            c = '\n';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1885099851:
                                        if (str4.equals("RAIJIN")) {
                                            c = 11;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1696512866:
                                        if (str4.equals("XT1663")) {
                                            c = '\f';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1680025915:
                                        if (str4.equals("ComioS1")) {
                                            c = '\r';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1615810839:
                                        if (str4.equals("Phantom6")) {
                                            c = 14;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1600724499:
                                        if (str4.equals("pacificrim")) {
                                            c = 15;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1554255044:
                                        if (str4.equals("vernee_M5")) {
                                            c = 16;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772737:
                                        if (str4.equals("panell_dl")) {
                                            c = 17;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772730:
                                        if (str4.equals("panell_ds")) {
                                            c = 18;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772729:
                                        if (str4.equals("panell_dt")) {
                                            c = 19;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1320080169:
                                        if (str4.equals("GiONEE_GBL7319")) {
                                            c = 20;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1217592143:
                                        if (str4.equals("BRAVIA_ATV2")) {
                                            c = 21;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1180384755:
                                        if (str4.equals("iris60")) {
                                            c = 22;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1139198265:
                                        if (str4.equals("Slate_Pro")) {
                                            c = 23;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1052835013:
                                        if (str4.equals("namath")) {
                                            c = 24;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -993250464:
                                        if (str4.equals("A10-70F")) {
                                            c = 25;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -993250458:
                                        if (str4.equals("A10-70L")) {
                                            c = 26;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -965403638:
                                        if (str4.equals("s905x018")) {
                                            c = 27;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -958336948:
                                        break;
                                    case -879245230:
                                        if (str4.equals("tcl_eu")) {
                                            c = 29;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -842500323:
                                        if (str4.equals("nicklaus_f")) {
                                            c = 30;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -821392978:
                                        if (str4.equals("A7000-a")) {
                                            c = 31;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -797483286:
                                        if (str4.equals("SVP-DTV15")) {
                                            c = ' ';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -794946968:
                                        if (str4.equals("watson")) {
                                            c = '!';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -788334647:
                                        if (str4.equals("whyred")) {
                                            c = '\"';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -782144577:
                                        if (str4.equals("OnePlus5T")) {
                                            c = '#';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -575125681:
                                        if (str4.equals("GiONEE_CBL7513")) {
                                            c = '$';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -521118391:
                                        if (str4.equals("GIONEE_GBL7360")) {
                                            c = '%';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -430914369:
                                        if (str4.equals("Pixi4-7_3G")) {
                                            c = '&';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -290434366:
                                        if (str4.equals("taido_row")) {
                                            c = '\'';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -282781963:
                                        if (str4.equals("BLACK-1X")) {
                                            c = '(';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -277133239:
                                        if (str4.equals("Z12_PRO")) {
                                            c = ')';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -173639913:
                                        if (str4.equals("ELUGA_A3_Pro")) {
                                            c = '*';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -56598463:
                                        if (str4.equals("woods_fn")) {
                                            c = '+';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2126:
                                        if (str4.equals("C1")) {
                                            c = ',';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2564:
                                        if (str4.equals("Q5")) {
                                            c = '-';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2715:
                                        if (str4.equals("V1")) {
                                            c = '.';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2719:
                                        if (str4.equals("V5")) {
                                            c = '/';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3091:
                                        if (str4.equals("b5")) {
                                            c = '0';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3483:
                                        if (str4.equals("mh")) {
                                            c = '1';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 73405:
                                        if (str4.equals("JGZ")) {
                                            c = '2';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 75537:
                                        if (str4.equals("M04")) {
                                            c = '3';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 75739:
                                        if (str4.equals("M5c")) {
                                            c = '4';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76779:
                                        if (str4.equals("MX6")) {
                                            c = '5';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 78669:
                                        if (str4.equals("P85")) {
                                            c = '6';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 79305:
                                        if (str4.equals("PLE")) {
                                            c = '7';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 80618:
                                        if (str4.equals("QX1")) {
                                            c = '8';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 88274:
                                        if (str4.equals("Z80")) {
                                            c = '9';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98846:
                                        if (str4.equals("cv1")) {
                                            c = ':';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98848:
                                        if (str4.equals("cv3")) {
                                            c = ';';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 99329:
                                        if (str4.equals("deb")) {
                                            c = '<';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 101481:
                                        if (str4.equals("flo")) {
                                            c = '=';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1513190:
                                        if (str4.equals("1601")) {
                                            c = '>';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1514184:
                                        if (str4.equals("1713")) {
                                            c = '?';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1514185:
                                        if (str4.equals("1714")) {
                                            c = '@';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133089:
                                        if (str4.equals("F01H")) {
                                            c = 'A';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133091:
                                        if (str4.equals("F01J")) {
                                            c = 'B';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133120:
                                        if (str4.equals("F02H")) {
                                            c = 'C';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133151:
                                        if (str4.equals("F03H")) {
                                            c = 'D';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133182:
                                        if (str4.equals("F04H")) {
                                            c = 'E';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133184:
                                        if (str4.equals("F04J")) {
                                            c = 'F';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2436959:
                                        if (str4.equals("P681")) {
                                            c = 'G';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2463773:
                                        if (str4.equals("Q350")) {
                                            c = 'H';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2464648:
                                        if (str4.equals("Q427")) {
                                            c = 'I';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2689555:
                                        if (str4.equals("XE2X")) {
                                            c = 'J';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3154429:
                                        if (str4.equals("fugu")) {
                                            c = 'K';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3284551:
                                        if (str4.equals("kate")) {
                                            c = 'L';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3351335:
                                        if (str4.equals("mido")) {
                                            c = 'M';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3386211:
                                        if (str4.equals("p212")) {
                                            c = 'N';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 41325051:
                                        if (str4.equals("MEIZU_M5")) {
                                            c = 'O';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 51349633:
                                        if (str4.equals("601LV")) {
                                            c = 'P';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 51350594:
                                        if (str4.equals("602LV")) {
                                            c = 'Q';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 55178625:
                                        if (str4.equals("Aura_Note_2")) {
                                            c = 'R';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 61542055:
                                        if (str4.equals("A1601")) {
                                            c = 'S';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 65355429:
                                        if (str4.equals("E5643")) {
                                            c = 'T';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214468:
                                        if (str4.equals("F3111")) {
                                            c = 'U';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214470:
                                        if (str4.equals("F3113")) {
                                            c = 'V';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214473:
                                        if (str4.equals("F3116")) {
                                            c = 'W';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215429:
                                        if (str4.equals("F3211")) {
                                            c = 'X';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215431:
                                        if (str4.equals("F3213")) {
                                            c = 'Y';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215433:
                                        if (str4.equals("F3215")) {
                                            c = 'Z';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66216390:
                                        if (str4.equals("F3311")) {
                                            c = '[';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76402249:
                                        if (str4.equals("PRO7S")) {
                                            c = '\\';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76404105:
                                        if (str4.equals("Q4260")) {
                                            c = ']';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76404911:
                                        if (str4.equals("Q4310")) {
                                            c = '^';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 80963634:
                                        if (str4.equals("V23GB")) {
                                            c = '_';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 82882791:
                                        if (str4.equals("X3_HK")) {
                                            c = '`';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98715550:
                                        if (str4.equals("i9031")) {
                                            c = 'a';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 101370885:
                                        if (str4.equals("l5460")) {
                                            c = 'b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 102844228:
                                        if (str4.equals("le_x6")) {
                                            c = 'c';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 165221241:
                                        if (str4.equals("A2016a40")) {
                                            c = 'd';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 182191441:
                                        if (str4.equals("CPY83_I00")) {
                                            c = 'e';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 245388979:
                                        if (str4.equals("marino_f")) {
                                            c = 'f';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 287431619:
                                        if (str4.equals("griffin")) {
                                            c = 'g';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 307593612:
                                        if (str4.equals("A7010a48")) {
                                            c = 'h';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 308517133:
                                        if (str4.equals("A7020a48")) {
                                            c = 'i';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316215098:
                                        if (str4.equals("TB3-730F")) {
                                            c = 'j';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316215116:
                                        if (str4.equals("TB3-730X")) {
                                            c = 'k';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316246811:
                                        if (str4.equals("TB3-850F")) {
                                            c = 'l';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316246818:
                                        if (str4.equals("TB3-850M")) {
                                            c = 'm';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 407160593:
                                        if (str4.equals("Pixi5-10_4G")) {
                                            c = 'n';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 507412548:
                                        if (str4.equals("QM16XE_U")) {
                                            c = 'o';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 793982701:
                                        if (str4.equals("GIONEE_WBL5708")) {
                                            c = 'p';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 794038622:
                                        if (str4.equals("GIONEE_WBL7365")) {
                                            c = 'q';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 794040393:
                                        if (str4.equals("GIONEE_WBL7519")) {
                                            c = 'r';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 835649806:
                                        if (str4.equals("manning")) {
                                            c = 's';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 917340916:
                                        if (str4.equals("A7000plus")) {
                                            c = 't';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 958008161:
                                        if (str4.equals("j2xlteins")) {
                                            c = 'u';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1060579533:
                                        if (str4.equals("panell_d")) {
                                            c = 'v';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1150207623:
                                        if (str4.equals("LS-5017")) {
                                            c = 'w';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1176899427:
                                        if (str4.equals("itel_S41")) {
                                            c = 'x';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1280332038:
                                        if (str4.equals("hwALE-H")) {
                                            c = 'y';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1306947716:
                                        if (str4.equals("EverStar_S")) {
                                            c = 'z';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1349174697:
                                        if (str4.equals("htc_e56ml_dtul")) {
                                            c = '{';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1522194893:
                                        if (str4.equals("woods_f")) {
                                            c = '|';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1691543273:
                                        if (str4.equals("CPH1609")) {
                                            c = '}';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1691544261:
                                        if (str4.equals("CPH1715")) {
                                            c = '~';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1709443163:
                                        if (str4.equals("iball8735_9806")) {
                                            c = 127;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1865889110:
                                        if (str4.equals("santoni")) {
                                            c = 128;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1906253259:
                                        if (str4.equals("PB2-670M")) {
                                            c = 129;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1977196784:
                                        if (str4.equals("Infinix-X572")) {
                                            c = 130;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2006372676:
                                        if (str4.equals("BRAVIA_ATV3_4K")) {
                                            c = 131;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2019281702:
                                        if (str4.equals("DM-01K")) {
                                            c = 132;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2029784656:
                                        if (str4.equals("HWBLN-H")) {
                                            c = 133;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2030379515:
                                        if (str4.equals("HWCAM-H")) {
                                            c = 134;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2033393791:
                                        if (str4.equals("ASUS_X00AD_2")) {
                                            c = 135;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2047190025:
                                        if (str4.equals("ELUGA_Note")) {
                                            c = 136;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2047252157:
                                        if (str4.equals("ELUGA_Prim")) {
                                            c = 137;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2048319463:
                                        if (str4.equals("HWVNS-H")) {
                                            c = 138;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2048855701:
                                        if (str4.equals("HWWAS-H")) {
                                            c = 139;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                switch (c) {
                                }
                            }
                            break;
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            break;
                    }
                    X1 = z3;
                    W1 = true;
                }
                z3 = true;
                X1 = z3;
                W1 = true;
            }
        }
        return X1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0079, code lost:
    
        if (r3.equals("video/av01") == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int K0(lm6 lm6Var, go4 go4Var) {
        int i = go4Var.A;
        int i2 = go4Var.B;
        if (i != -1 && i2 != -1) {
            String str = go4Var.t;
            str.getClass();
            char c = 1;
            if ("video/dolby-vision".equals(str)) {
                Pair b = jl2.b(go4Var);
                if (b != null) {
                    int intValue = ((Integer) b.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = "video/hevc";
            }
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 3:
                case 5:
                    return ((i * i2) * 3) / 4;
                case 2:
                    return Math.max(TLObject.FLAG_21, ((i * i2) * 3) / 4);
                case 4:
                    HashSet hashSet = ct6.a;
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !lm6Var.f)))) {
                        return (((hac.g(i2, 16) * hac.g(i, 16)) << 8) * 3) / 4;
                    }
                    break;
                case 6:
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    public static List L0(Context context, go4 go4Var, boolean z, boolean z2) {
        List e;
        String str = go4Var.t;
        if (str == null) {
            ko5 ko5Var = mo5.b;
            return y79.e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !nq5.b(context)) {
            String c = tm6.c(go4Var);
            if (c == null) {
                ko5 ko5Var2 = mo5.b;
                e = y79.e;
            } else {
                e = tm6.e(c, z, z2);
            }
            if (!e.isEmpty()) {
                return e;
            }
        }
        return tm6.g(go4Var, z, z2);
    }

    public static int M0(lm6 lm6Var, go4 go4Var) {
        int i = go4Var.u;
        List list = go4Var.w;
        if (i == -1) {
            return K0(lm6Var, go4Var);
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return go4Var.u + i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00eb, code lost:
    
        if ((r7 + 1) >= 8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
    
        if (r7 < 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ef, code lost:
    
        r2 = ((hq7) r3.get(r7)).b.limit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fc, code lost:
    
        r2 = r5.position();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    @Override // om6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A0(la3 la3Var) {
        boolean z;
        ByteBuffer byteBuffer;
        iq7 iq7Var;
        gp5 gp5Var;
        boolean z2 = false;
        if (!P0(la3Var)) {
            boolean z3 = la3Var.e < this.x;
            ycc yccVar = this.k1;
            if (yccVar != null) {
                long j = yccVar.a == -9223372036854775807L ? -9223372036854775807L : (long) (((r2 - r6) * yccVar.c) + yccVar.b);
                if (j != -9223372036854775807L && j < this.j1) {
                    z = true;
                    if ((!z3 || z) && !la3Var.hasSupplementalData()) {
                        if (la3Var.notDependedOn()) {
                            hi2 hi2Var = this.i1;
                            if (hi2Var != null) {
                                ByteBuffer byteBuffer2 = (ByteBuffer) hi2Var.b;
                                lm6 lm6Var = this.j0;
                                lm6Var.getClass();
                                if (lm6Var.b.equals("video/av01") && (byteBuffer = la3Var.c) != null) {
                                    boolean z4 = z3 || this.U1 <= 0;
                                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                                    asReadOnlyBuffer.flip();
                                    if (byteBuffer2.hasRemaining()) {
                                        hi2Var.X(hse.b(byteBuffer2));
                                        byteBuffer2.position(byteBuffer2.limit());
                                    }
                                    ArrayList b = hse.b(asReadOnlyBuffer);
                                    hi2Var.X(b);
                                    int size = b.size() - 1;
                                    int i = 0;
                                    while (size >= 0) {
                                        hq7 hq7Var = (hq7) b.get(size);
                                        byte b2 = hq7Var.a;
                                        if (b2 != 2 && b2 != 15) {
                                            if ((b2 == 3 && !z4) || ((b2 != 6 && b2 != 3) || (iq7Var = (iq7) hi2Var.c) == null)) {
                                                break;
                                            }
                                            try {
                                                gp5Var = new gp5(iq7Var, hq7Var);
                                            } catch (gq7 unused) {
                                                gp5Var = null;
                                            }
                                            if (gp5Var != null) {
                                                if (gp5Var.b) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        if (((hq7) b.get(size)).a == 6 || ((hq7) b.get(size)).a == 3) {
                                            i++;
                                        }
                                        size--;
                                    }
                                    int limit = asReadOnlyBuffer.limit();
                                    if (limit == 0) {
                                        la3Var.clear();
                                    } else if (limit != asReadOnlyBuffer.limit()) {
                                        pd0 pd0Var = this.m1;
                                        pd0Var.getClass();
                                        if (pd0Var.c + limit < asReadOnlyBuffer.capacity() && !la3Var.getFlag(TLObject.FLAG_30)) {
                                            ByteBuffer byteBuffer3 = la3Var.c;
                                            byteBuffer3.getClass();
                                            byteBuffer3.position(limit);
                                        }
                                    }
                                }
                            }
                            if (z2) {
                                if (!z3) {
                                    this.U1++;
                                }
                                this.l1.add(Long.valueOf(la3Var.e));
                            }
                            return z2;
                        }
                        la3Var.clear();
                        z2 = true;
                        if (z2) {
                        }
                        return z2;
                    }
                }
            }
            z = false;
            if (!z3) {
            }
            if (la3Var.notDependedOn()) {
            }
            z2 = true;
            if (z2) {
            }
            return z2;
        }
        return false;
    }

    @Override // om6, uh0
    public final void B(long j, long j2) {
        iec iecVar = this.r1;
        if (iecVar != null) {
            try {
                iecVar.q(j, j2);
            } catch (hec e) {
                throw e(e, e.a, false, 7001);
            }
        }
        super.B(j, j2);
    }

    @Override // om6
    public final boolean B0() {
        boolean z;
        if (this.E0) {
            go4 go4Var = this.d0;
            long j = this.I;
            if (j != -9223372036854775807L) {
                if (this.U0 + 1 + j <= Long.MAX_VALUE - (this.P0.c + j)) {
                    z = false;
                    if (this.F1 != null || this.H1 || this.O1 || ((go4Var != null && go4Var.v > 0) || z || this.P0.h != -9223372036854775807L)) {
                        return true;
                    }
                }
            }
            z = true;
            if (this.F1 != null) {
            }
            return true;
        }
        return false;
    }

    @Override // om6
    public final boolean C0(lm6 lm6Var) {
        return O0(lm6Var);
    }

    @Override // om6
    public final boolean D0() {
        lm6 lm6Var = this.j0;
        if (this.r1 != null && lm6Var != null) {
            String str = lm6Var.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder") || str.equals("c2.mtk.vp9.decoder")) {
                return true;
            }
        }
        return super.D0();
    }

    @Override // om6, uh0
    public final void E(float f, float f2) {
        super.E(f, f2);
        iec iecVar = this.r1;
        if (iecVar != null) {
            iecVar.d(f);
        } else {
            this.f1.g(f);
        }
        ycc yccVar = this.k1;
        if (yccVar != null) {
            yccVar.c(f);
        }
    }

    @Override // om6
    public final int F0(go4 go4Var) {
        boolean z;
        int i = 0;
        if (!wf7.m(go4Var.t)) {
            return kt6.a(0, 0, 0, 0);
        }
        boolean z2 = go4Var.x != null;
        Context context = this.a1;
        List L0 = L0(context, go4Var, z2, false);
        if (z2 && L0.isEmpty()) {
            L0 = L0(context, go4Var, false, false);
        }
        if (L0.isEmpty()) {
            return kt6.a(1, 0, 0, 0);
        }
        int i2 = go4Var.X;
        if (i2 != 0 && i2 != 2) {
            return kt6.a(2, 0, 0, 0);
        }
        lm6 lm6Var = (lm6) L0.get(0);
        boolean e = lm6Var.e(context, go4Var);
        if (!e) {
            for (int i3 = 1; i3 < L0.size(); i3++) {
                lm6 lm6Var2 = (lm6) L0.get(i3);
                if (lm6Var2.e(context, go4Var)) {
                    z = false;
                    e = true;
                    lm6Var = lm6Var2;
                    break;
                }
            }
        }
        z = true;
        byte b = 4;
        int i4 = e ? 4 : 3;
        int i5 = lm6Var.f(go4Var) ? 16 : 8;
        int i6 = lm6Var.g ? 64 : 0;
        int i7 = z ? 128 : 0;
        byte b2 = 26;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(go4Var.t) && !nq5.b(context)) {
            i7 = 256;
        }
        if (e) {
            List L02 = L0(context, go4Var, z2, true);
            if (!L02.isEmpty()) {
                HashMap hashMap = tm6.a;
                ArrayList arrayList = new ArrayList(L02);
                Collections.sort(arrayList, new i01(new nv4(context, go4Var, b2), b));
                lm6 lm6Var3 = (lm6) arrayList.get(0);
                if (lm6Var3.e(context, go4Var) && lm6Var3.f(go4Var)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // uh0
    public final boolean I(long j) {
        if (this.H0 == -9223372036854775807L || j < this.G1) {
            return false;
        }
        long j2 = this.Q0;
        return j2 == -9223372036854775807L || j > j2;
    }

    @Override // om6
    public final pa3 M(lm6 lm6Var, go4 go4Var, go4 go4Var2, boolean z) {
        int i;
        pa3 b = lm6Var.b(go4Var, go4Var2);
        float f = go4Var.F;
        float f2 = go4Var2.F;
        int i2 = b.e;
        pd0 pd0Var = this.m1;
        pd0Var.getClass();
        if (go4Var2.A > pd0Var.a || go4Var2.B > pd0Var.b) {
            i2 |= 256;
        }
        if (M0(lm6Var, go4Var2) > pd0Var.c) {
            i2 |= 64;
        }
        if (this.A1 != Integer.MIN_VALUE && (i = Build.VERSION.SDK_INT) < 31 && ((i != 30 || Build.MODEL.startsWith("MiTV")) && f != -1.0f && f2 != -1.0f && (!lm6Var.f || !z))) {
            if (Math.abs((Math.max(f2, f) / Math.min(f2, f)) - Math.round(r10)) > 0.01f) {
                i2 |= 65536;
            }
        }
        int i3 = i2;
        return new pa3(lm6Var.a, go4Var, go4Var2, i3 != 0 ? (byte) 0 : b.d, i3);
    }

    @Override // om6
    public final km6 N(IllegalStateException illegalStateException, lm6 lm6Var) {
        Surface surface = this.v1;
        um6 um6Var = new um6(illegalStateException, lm6Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return um6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface N0(lm6 lm6Var) {
        boolean z;
        qd8 qd8Var;
        iec iecVar = this.r1;
        if (iecVar != null) {
            return iecVar.b();
        }
        Surface surface = this.v1;
        if (surface != null) {
            return surface;
        }
        rd8 rd8Var = null;
        if (V0(lm6Var)) {
            return null;
        }
        jte.p(W0(lm6Var));
        rd8 rd8Var2 = this.w1;
        if (rd8Var2 != null && rd8Var2.a != lm6Var.f) {
            if (rd8Var2 != null) {
                rd8Var2.release();
                this.w1 = null;
            } else {
                rd8Var = rd8Var2;
            }
            rd8Var2 = rd8Var;
        }
        if (rd8Var2 != null) {
            return rd8Var2;
        }
        Context context = this.a1;
        boolean z2 = lm6Var.f;
        boolean z3 = false;
        if (!z2) {
            int i = rd8.d;
        } else if (!rd8.b(context)) {
            z = false;
            jte.p(z);
            qd8Var = new qd8("ExoPlayer:PlaceholderSurface");
            int i2 = !z2 ? rd8.d : 0;
            qd8Var.start();
            Handler handler = new Handler(qd8Var.getLooper(), qd8Var);
            qd8Var.b = handler;
            qd8Var.a = new rt3(handler);
            synchronized (qd8Var) {
                qd8Var.b.obtainMessage(1, i2, 0).sendToTarget();
                while (qd8Var.e == null && qd8Var.d == null && qd8Var.c == null) {
                    try {
                        qd8Var.wait();
                    } catch (InterruptedException unused) {
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = qd8Var.d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = qd8Var.c;
            if (error != null) {
                throw error;
            }
            rd8 rd8Var3 = qd8Var.e;
            rd8Var3.getClass();
            this.w1 = rd8Var3;
            return rd8Var3;
        }
        z = true;
        jte.p(z);
        qd8Var = new qd8("ExoPlayer:PlaceholderSurface");
        if (!z2) {
        }
        qd8Var.start();
        Handler handler2 = new Handler(qd8Var.getLooper(), qd8Var);
        qd8Var.b = handler2;
        qd8Var.a = new rt3(handler2);
        synchronized (qd8Var) {
        }
    }

    public final boolean O0(lm6 lm6Var) {
        if (this.r1 != null) {
            return true;
        }
        Surface surface = this.v1;
        return (surface != null && surface.isValid()) || V0(lm6Var) || W0(lm6Var);
    }

    public final boolean P0(la3 la3Var) {
        if (m() || la3Var.isLastSample()) {
            return true;
        }
        long j = this.I;
        return j == -9223372036854775807L || j - (la3Var.e - this.P0.c) <= 100000;
    }

    public final void Q0() {
        if (this.C1 > 0) {
            this.h.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.B1;
            int i = this.C1;
            xab xabVar = this.c1;
            Handler handler = (Handler) xabVar.b;
            if (handler != null) {
                handler.post(new wdc(xabVar, i, j));
            }
            this.C1 = 0;
            this.B1 = elapsedRealtime;
        }
    }

    public final void R0() {
        hm6 hm6Var;
        if (!this.O1 || (hm6Var = this.c0) == null) {
            return;
        }
        this.Q1 = new xm6(this, hm6Var);
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            hm6Var.setParameters(bundle);
        }
    }

    public final void S0(hm6 hm6Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        hm6Var.e(i, j);
        Trace.endSection();
        this.O0.e++;
        this.D1 = 0;
        if (this.r1 == null) {
            jec jecVar = this.L1;
            boolean equals = jecVar.equals(jec.d);
            xab xabVar = this.c1;
            if (!equals && !jecVar.equals(this.M1)) {
                this.M1 = jecVar;
                xabVar.q(jecVar);
            }
            xcc xccVar = this.f1;
            boolean z = xccVar.e != 3;
            xccVar.e = 3;
            xccVar.k.getClass();
            xccVar.g = hac.T(SystemClock.elapsedRealtime());
            if (!z || (surface = this.v1) == null) {
                return;
            }
            xabVar.p(surface);
            this.y1 = true;
        }
    }

    public final void T0(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.v1;
        xab xabVar = this.c1;
        if (surface2 == surface) {
            if (surface != null) {
                jec jecVar = this.M1;
                if (jecVar != null) {
                    xabVar.q(jecVar);
                }
                Surface surface3 = this.v1;
                if (surface3 == null || !this.y1) {
                    return;
                }
                xabVar.p(surface3);
                return;
            }
            return;
        }
        this.v1 = surface;
        iec iecVar = this.r1;
        xcc xccVar = this.f1;
        if (iecVar == null) {
            xccVar.f(surface);
        }
        boolean z = false;
        this.y1 = false;
        byte b = this.n;
        hm6 hm6Var = this.c0;
        if (hm6Var != null) {
            if (this.r1 == null) {
                lm6 lm6Var = this.j0;
                lm6Var.getClass();
                if (!O0(lm6Var) || this.n1) {
                    t0();
                    d0();
                } else {
                    Surface N0 = N0(lm6Var);
                    if (N0 != null) {
                        try {
                            hm6Var.k(N0);
                        } catch (Throwable th) {
                            th.printStackTrace();
                            throw new ceb(th);
                        }
                    } else {
                        if (Build.VERSION.SDK_INT < 35) {
                            rjb.h();
                            return;
                        }
                        hm6Var.d();
                    }
                }
            }
            z = true;
        }
        if (surface != null) {
            jec jecVar2 = this.M1;
            if (jecVar2 != null) {
                xabVar.q(jecVar2);
            }
        } else {
            this.M1 = null;
            iec iecVar2 = this.r1;
            if (iecVar2 != null) {
                iecVar2.l();
            }
        }
        if (b == 2) {
            iec iecVar3 = this.r1;
            if (iecVar3 != null) {
                iecVar3.r(z);
            } else {
                xccVar.c(z);
            }
        }
        R0();
    }

    @Override // om6
    public final int U(la3 la3Var) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.F1 != null || this.O1) && la3Var.e < this.x && !P0(la3Var)) ? 32 : 0;
        }
        return 0;
    }

    public final boolean U0(long j, long j2, boolean z, boolean z2) {
        int F;
        if (this.r1 != null && this.b1) {
            j2 -= -this.S1;
        }
        if (j >= -500000 || z || (F = F(j2)) == 0) {
            return false;
        }
        this.G1 = j2;
        boolean z3 = this.f1.h != -9223372036854775807L;
        PriorityQueue priorityQueue = this.l1;
        Iterator it = priorityQueue.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            if (((Long) it.next()).longValue() < this.x || z3) {
                i2++;
            } else {
                i++;
            }
        }
        priorityQueue.clear();
        ia3 ia3Var = this.O0;
        if (z2) {
            int i3 = ia3Var.d + F;
            ia3Var.f += this.E1;
            ia3Var.d = i3 + i + i2;
        } else {
            ia3Var.j++;
            Y0(F + i, this.E1);
            this.O0.d += i2;
        }
        if (S()) {
            d0();
        }
        iec iecVar = this.r1;
        if (iecVar != null) {
            iecVar.o(false);
        }
        return true;
    }

    @Override // om6
    public final float V(float f, go4 go4Var, go4[] go4VarArr) {
        lm6 lm6Var;
        float f2 = -1.0f;
        for (go4 go4Var2 : go4VarArr) {
            float f3 = go4Var2.F;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f && this.c0 != null) {
            if (this.h1.a() != -9223372036854775807L) {
                f2 = 1.0E9f / r11.a();
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.F1 == null || (lm6Var = this.j0) == null) {
            return f4;
        }
        int i = go4Var.A;
        int i2 = go4Var.B;
        float f5 = -3.4028235E38f;
        if (lm6Var.i) {
            float f6 = lm6Var.l;
            if (f6 != -3.4028235E38f && lm6Var.j == i && lm6Var.k == i2) {
                f5 = f6;
            } else {
                f5 = 1024.0f;
                if (!lm6Var.g(i, i2, 1024.0d)) {
                    float f7 = 0.0f;
                    while (true) {
                        float f8 = f5 - f7;
                        if (Math.abs(f8) <= 5.0f) {
                            break;
                        }
                        float f9 = (f8 / 2.0f) + f7;
                        if (lm6Var.g(i, i2, f9)) {
                            f7 = f9;
                        } else {
                            f5 = f9;
                        }
                    }
                    f5 = f7;
                }
                lm6Var.l = f5;
                lm6Var.j = i;
                lm6Var.k = i2;
            }
        }
        return f4 != -1.0f ? Math.max(f4, f5) : f5;
    }

    public boolean V0(lm6 lm6Var) {
        return Build.VERSION.SDK_INT >= 35 && lm6Var.h;
    }

    @Override // om6
    public final ArrayList W(go4 go4Var, boolean z) {
        boolean z2 = this.O1;
        Context context = this.a1;
        List L0 = L0(context, go4Var, z, z2);
        HashMap hashMap = tm6.a;
        ArrayList arrayList = new ArrayList(L0);
        Collections.sort(arrayList, new i01(new nv4(context, go4Var, (byte) 26), (byte) 4));
        return arrayList;
    }

    public boolean W0(lm6 lm6Var) {
        if (this.O1 || J0(lm6Var.a)) {
            return false;
        }
        return !lm6Var.f || rd8.b(this.a1);
    }

    public final void X0(hm6 hm6Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        hm6Var.c(i);
        Trace.endSection();
        this.O0.f++;
    }

    public final void Y0(int i, int i2) {
        ia3 ia3Var = this.O0;
        ia3Var.h += i;
        int i3 = i + i2;
        ia3Var.g += i3;
        this.C1 += i3;
        int i4 = this.D1 + i3;
        this.D1 = i4;
        ia3Var.i = Math.max(i4, ia3Var.i);
        byte b = this.d1;
        if (b <= 0 || this.C1 < b) {
            return;
        }
        Q0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0127, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x012a, code lost:
    
        r15 = r9;
     */
    @Override // om6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final eq Z(lm6 lm6Var, go4 go4Var, MediaCrypto mediaCrypto, float f) {
        tm2 tm2Var;
        int i;
        pd0 pd0Var;
        int i2;
        int i3;
        Point point;
        int i4;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i5;
        boolean z;
        Pair b;
        int K0;
        String str = lm6Var.c;
        go4[] go4VarArr = this.s;
        go4VarArr.getClass();
        int i6 = go4Var.A;
        float f2 = go4Var.F;
        tm2 tm2Var2 = go4Var.L;
        int i7 = go4Var.B;
        int M0 = M0(lm6Var, go4Var);
        if (go4VarArr.length == 1) {
            if (M0 != -1 && (K0 = K0(lm6Var, go4Var)) != -1) {
                M0 = Math.min((int) (M0 * 1.5f), K0);
            }
            pd0Var = new pd0(i6, i7, M0);
            tm2Var = tm2Var2;
            i = i7;
        } else {
            int length = go4VarArr.length;
            int i8 = i6;
            int i9 = i7;
            int i10 = 0;
            boolean z2 = false;
            while (i10 < length) {
                go4 go4Var2 = go4VarArr[i10];
                go4[] go4VarArr2 = go4VarArr;
                if (tm2Var2 != null && go4Var2.L == null) {
                    fo4 a = go4Var2.a();
                    a.K = tm2Var2;
                    go4Var2 = new go4(a);
                }
                pa3 b2 = lm6Var.b(go4Var, go4Var2);
                int i11 = length;
                int i12 = go4Var2.B;
                if (b2.d != 0) {
                    int i13 = go4Var2.A;
                    i5 = i10;
                    z2 |= i13 == -1 || i12 == -1;
                    i8 = Math.max(i8, i13);
                    i9 = Math.max(i9, i12);
                    M0 = Math.max(M0, M0(lm6Var, go4Var2));
                } else {
                    i5 = i10;
                }
                length = i11;
                i10 = i5 + 1;
                go4VarArr = go4VarArr2;
            }
            if (z2) {
                ncd.f("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i8 + "x" + i9);
                boolean z3 = i7 > i6;
                boolean z4 = z3;
                if (z3) {
                    i3 = i6;
                    i2 = i7;
                } else {
                    i2 = i6;
                    i3 = i7;
                }
                float f3 = i3 / i2;
                int i14 = 0;
                while (true) {
                    tm2Var = tm2Var2;
                    if (i14 >= 9) {
                        break;
                    }
                    int i15 = V1[i14];
                    int i16 = i14;
                    int i17 = (int) (i15 * f3);
                    if (i15 <= i2 || i17 <= i3) {
                        break;
                    }
                    if (!z4) {
                        i15 = i17;
                        i17 = i15;
                    }
                    int i18 = i2;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = lm6Var.d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i4 = i3;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i4 = i3;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(hac.g(i17, widthAlignment) * widthAlignment, hac.g(i15, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i = i7;
                        if (lm6Var.g(point.x, point.y, f2)) {
                            break;
                        }
                    } else {
                        i = i7;
                    }
                    i14 = i16 + 1;
                    i7 = i;
                    tm2Var2 = tm2Var;
                    i2 = i18;
                    i3 = i4;
                }
                if (point != null) {
                    i8 = Math.max(i8, point.x);
                    i9 = Math.max(i9, point.y);
                    fo4 a2 = go4Var.a();
                    a2.z = i8;
                    a2.A = i9;
                    M0 = Math.max(M0, K0(lm6Var, new go4(a2)));
                    ncd.f("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i8 + "x" + i9);
                }
            } else {
                tm2Var = tm2Var2;
                i = i7;
            }
            pd0Var = new pd0(i8, i9, M0);
        }
        this.m1 = pd0Var;
        int i19 = this.O1 ? this.P1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i6);
        mediaFormat.setInteger("height", i);
        tqe.b(mediaFormat, go4Var.w);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        tqe.a(mediaFormat, "rotation-degrees", go4Var.G);
        if (tm2Var != null) {
            tm2 tm2Var3 = tm2Var;
            tqe.a(mediaFormat, "color-transfer", tm2Var3.c);
            tqe.a(mediaFormat, "color-standard", tm2Var3.a);
            tqe.a(mediaFormat, "color-range", tm2Var3.b);
            byte[] bArr = tm2Var3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(go4Var.t) && (b = jl2.b(go4Var)) != null) {
            tqe.a(mediaFormat, "profile", ((Integer) b.first).intValue());
        }
        mediaFormat.setInteger("max-width", pd0Var.a);
        mediaFormat.setInteger("max-height", pd0Var.b);
        tqe.a(mediaFormat, "max-input-size", pd0Var.c);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.e1) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i19 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i19);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.N1));
        }
        K(mediaFormat);
        Surface N0 = N0(lm6Var);
        if (this.r1 != null && !hac.O(this.a1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new eq(lm6Var, mediaFormat, go4Var, N0, mediaCrypto, null);
    }

    public final void Z0(long j) {
        ia3 ia3Var = this.O0;
        ia3Var.k += j;
        ia3Var.l++;
        this.I1 += j;
        this.J1++;
    }

    @Override // om6
    public final void a0(la3 la3Var) {
        ByteBuffer byteBuffer = la3Var.f;
        if (byteBuffer == null || byteBuffer.remaining() < 7) {
            return;
        }
        byte b = byteBuffer.get();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byteBuffer.position(0);
        if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && (b3 == 0 || b3 == 1)) {
            if (this.p1) {
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                byteBuffer.position(0);
                hm6 hm6Var = this.c0;
                hm6Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putByteArray("hdr10-plus-info", bArr);
                hm6Var.setParameters(bundle);
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 37) {
            byte[] bArr2 = jl2.a;
            int remaining = byteBuffer.remaining();
            byte[] bArr3 = jl2.d;
            if (remaining >= bArr3.length) {
                int position = byteBuffer.position();
                for (int i = 0; i < bArr3.length; i++) {
                    if (byteBuffer.get(position + i) != bArr3[i]) {
                        return;
                    }
                }
                byteBuffer.position(5);
                int remaining2 = byteBuffer.remaining();
                byte[] bArr4 = new byte[remaining2];
                byteBuffer.get(bArr4);
                byteBuffer.position(0);
                boolean z = remaining2 > 0;
                this.q1 = z;
                if (z) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putByteArray("hdr-st2094-50-info", bArr4);
                    hm6 hm6Var2 = this.c0;
                    hm6Var2.getClass();
                    hm6Var2.setParameters(bundle2);
                }
            }
        }
    }

    @Override // om6, uh0, ze8
    public final void d(int i, Object obj) {
        if (i == 1) {
            T0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            vcc vccVar = (vcc) obj;
            this.R1 = vccVar;
            iec iecVar = this.r1;
            if (iecVar != null) {
                iecVar.t(vccVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.P1 != intValue) {
                this.P1 = intValue;
                if (this.O1) {
                    t0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.z1 = intValue2;
            hm6 hm6Var = this.c0;
            if (hm6Var != null) {
                hm6Var.j(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.A1 = intValue3;
            iec iecVar2 = this.r1;
            if (iecVar2 != null) {
                iecVar2.k(intValue3);
                return;
            }
            cdc cdcVar = this.f1.b;
            if (cdcVar.i != intValue3) {
                cdcVar.i = intValue3;
                cdcVar.c(true);
                return;
            }
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(wcc.a)) {
                iec iecVar3 = this.r1;
                if (iecVar3 == null || !iecVar3.v()) {
                    return;
                }
                this.r1.u();
                return;
            }
            this.u1 = list;
            iec iecVar4 = this.r1;
            if (iecVar4 != null) {
                iecVar4.p(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            yka ykaVar = (yka) obj;
            if (ykaVar.a == 0 || ykaVar.b == 0) {
                return;
            }
            this.x1 = ykaVar;
            iec iecVar5 = this.r1;
            if (iecVar5 != null) {
                Surface surface = this.v1;
                surface.getClass();
                iecVar5.c(surface, ykaVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.N1 = ((Integer) obj).intValue();
                hm6 hm6Var2 = this.c0;
                if (hm6Var2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.N1));
                    hm6Var2.setParameters(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.v1;
                T0(null);
                obj.getClass();
                ((ym6) obj).d(1, surface2);
                break;
            case 18:
                boolean z = this.F1 != null;
                ot9 ot9Var = (ot9) obj;
                this.F1 = ot9Var;
                if (z != (ot9Var != null)) {
                    G0(this.d0);
                    break;
                }
                break;
            default:
                super.d(i, obj);
                break;
        }
    }

    @Override // uh0
    public final void f() {
        iec iecVar = this.r1;
        if (iecVar == null) {
            xcc xccVar = this.f1;
            if (xccVar.e == 0) {
                xccVar.e = 1;
                return;
            }
            return;
        }
        int i = this.t1;
        if (i == 0 || i == 1) {
            this.t1 = 0;
        } else {
            iecVar.w();
        }
    }

    @Override // om6
    public final boolean f0(go4 go4Var) {
        iec iecVar = this.r1;
        if (iecVar == null || iecVar.v()) {
            return true;
        }
        try {
            return this.r1.n(go4Var);
        } catch (hec e) {
            throw this.e(e, go4Var, false, 7000);
        }
    }

    @Override // om6
    public final void g0(Exception exc) {
        ncd.d("MediaCodecVideoRenderer", "Video codec error", exc);
        xab xabVar = this.c1;
        Handler handler = (Handler) xabVar.b;
        if (handler != null) {
            handler.post(new x4c(xabVar, exc, (byte) 24));
        }
    }

    @Override // om6
    public final void h0(long j, String str, long j2) {
        String str2;
        boolean z;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        xab xabVar = this.c1;
        Handler handler = (Handler) xabVar.b;
        if (handler != null) {
            str2 = str;
            handler.post(new n40((Object) xabVar, (Object) str2, j, j2, (byte) 17));
        } else {
            str2 = str;
        }
        this.n1 = J0(str2);
        lm6 lm6Var = this.j0;
        lm6Var.getClass();
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(lm6Var.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = lm6Var.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.p1 = z;
        if (Build.VERSION.SDK_INT < 37) {
            lm6 lm6Var2 = this.j0;
            lm6Var2.getClass();
            if (lm6Var2.b.equals("video/av01")) {
                z2 = true;
            }
        }
        this.o1 = z2;
        R0();
    }

    @Override // om6
    public final void i0(hl2 hl2Var) {
        xab xabVar = this.c1;
        Handler handler = (Handler) xabVar.b;
        if (handler != null) {
            handler.post(new x4c(xabVar, hl2Var, (byte) 22));
        }
    }

    @Override // om6
    public final void j0(String str) {
        xab xabVar = this.c1;
        Handler handler = (Handler) xabVar.b;
        if (handler != null) {
            handler.post(new x4c(xabVar, str, (byte) 25));
        }
    }

    @Override // om6
    public final pa3 k0(mj4 mj4Var) {
        pa3 k0 = super.k0(mj4Var);
        this.q1 = false;
        go4 go4Var = (go4) mj4Var.c;
        go4Var.getClass();
        xab xabVar = this.c1;
        Handler handler = (Handler) xabVar.b;
        if (handler != null) {
            handler.post(new gcc(xabVar, go4Var, k0, (byte) 3));
        }
        ycc yccVar = this.k1;
        if (yccVar != null) {
            yccVar.b();
        }
        return k0;
    }

    @Override // uh0
    public final String l() {
        return "MediaCodecVideoRenderer";
    }

    @Override // om6
    public final void l0(go4 go4Var, MediaFormat mediaFormat) {
        int integer;
        int i;
        hm6 hm6Var = this.c0;
        if (hm6Var != null) {
            hm6Var.j(this.z1);
        }
        if (this.O1) {
            i = go4Var.A;
            integer = go4Var.B;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                int integer2 = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
                int integer3 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
                i = integer2;
                integer = integer3;
            } else {
                int integer4 = mediaFormat.getInteger("width");
                integer = mediaFormat.getInteger("height");
                i = integer4;
            }
        }
        float f = go4Var.I;
        int i2 = go4Var.G;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.L1 = new jec(f, i, integer);
        iec iecVar = this.r1;
        if (iecVar == null || !this.T1) {
            float f2 = go4Var.F;
            zj4 zj4Var = this.h1;
            zj4Var.f = f2;
            zj4Var.a.c();
            zj4Var.b.c();
            zj4Var.c = false;
            zj4Var.d = -9223372036854775807L;
            zj4Var.e = 0;
            zj4Var.c();
        } else {
            if (i <= 0 || integer <= 0) {
                return;
            }
            fo4 a = go4Var.a();
            a.z = i;
            a.A = integer;
            a.H = f;
            go4 go4Var2 = new go4(a);
            int i4 = this.t1;
            List list = this.u1;
            if (list == null) {
                ko5 ko5Var = mo5.b;
                list = y79.e;
            }
            iecVar.g(go4Var2, this.P0.b, i4, list);
            this.t1 = 2;
        }
        this.T1 = false;
    }

    @Override // uh0
    public final boolean n() {
        if (!this.K0) {
            return false;
        }
        iec iecVar = this.r1;
        return iecVar == null || iecVar.a();
    }

    @Override // om6
    public final void n0(long j) {
        super.n0(j);
        if (this.O1) {
            return;
        }
        this.E1--;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() < r6.s0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // uh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o() {
        boolean z;
        iec iecVar;
        if (this.U != null) {
            if (!p() && this.u0 < 0) {
                if (this.s0 != -9223372036854775807L) {
                    this.h.getClass();
                }
            }
            z = true;
            iecVar = this.r1;
            if (iecVar == null) {
                return iecVar.s(z);
            }
            if (z && (this.c0 == null || this.O1)) {
                return true;
            }
            return this.f1.b(z);
        }
        z = false;
        iecVar = this.r1;
        if (iecVar == null) {
        }
    }

    @Override // om6
    public final void o0() {
        iec iecVar = this.r1;
        if (iecVar != null) {
            iecVar.j();
            long j = this.S1;
            if (j == -9223372036854775807L) {
                j = this.P0.b;
                this.S1 = j;
            }
            this.r1.h(-j);
        } else {
            this.f1.e(2);
        }
        this.T1 = true;
        R0();
    }

    @Override // om6
    public final void p0(la3 la3Var) {
        ByteBuffer byteBuffer;
        int i;
        int i2;
        ByteBuffer byteBuffer2;
        tm2 tm2Var;
        lm6 lm6Var = this.j0;
        lm6Var.getClass();
        String str = lm6Var.b;
        if (str.equals("video/av01") && (byteBuffer2 = la3Var.c) != null) {
            go4 go4Var = this.d0;
            boolean z = (go4Var == null || (tm2Var = go4Var.L) == null || tm2Var.e <= 8) ? false : true;
            if (this.q1 && !byteBuffer2.isReadOnly()) {
                oz0.b(byteBuffer2, false);
            } else if (z && this.o1 && !byteBuffer2.isReadOnly()) {
                oz0.b(byteBuffer2, true);
            }
            hi2 hi2Var = this.i1;
            if (hi2Var != null && la3Var.isKeyFrame()) {
                int position = byteBuffer2.position();
                int limit = byteBuffer2.limit();
                byteBuffer2.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer3 = (ByteBuffer) hi2Var.b;
                byteBuffer3.clear();
                byteBuffer3.put(byteBuffer2);
                byteBuffer3.flip();
                byteBuffer2.position(position);
                byteBuffer2.limit(limit);
            }
        } else if (str.equals("video/hevc") && (byteBuffer = la3Var.c) != null && this.q1 && !byteBuffer.isReadOnly()) {
            ByteBuffer byteBuffer4 = la3Var.c;
            int position2 = byteBuffer4.position();
            int limit2 = byteBuffer4.limit();
            if (limit2 - position2 >= 4) {
                while (position2 < limit2) {
                    int a = lle.a(byteBuffer4, position2, limit2);
                    if (a == limit2 || (i = a + 3) >= limit2 || ((i2 = (byteBuffer4.get(i) & 126) >> 1) >= 0 && i2 <= 31)) {
                        break;
                    }
                    if (i2 == 39) {
                        int i3 = a + 5;
                        i = lle.a(byteBuffer4, i3, limit2);
                        int i4 = 0;
                        while (i3 < i) {
                            int i5 = 0;
                            while (true) {
                                if (i3 >= i) {
                                    break;
                                }
                                int i6 = byteBuffer4.get(i3) & 255;
                                if (i6 != 3 || i4 < 2) {
                                    i4 = i6 == 0 ? i4 + 1 : 0;
                                    int i7 = i3 + 1;
                                    i5 += i6;
                                    if (i6 != 255) {
                                        if (i5 == 4) {
                                            byteBuffer4.put(i3, (byte) -2);
                                        }
                                        i3 = i7;
                                    } else {
                                        i3 = i7;
                                    }
                                } else {
                                    i3++;
                                    i4 = 0;
                                }
                            }
                            if (i3 < i) {
                                int i8 = 0;
                                while (i3 < i) {
                                    int i9 = byteBuffer4.get(i3) & 255;
                                    if (i9 != 3 || i4 < 2) {
                                        i4 = i9 == 0 ? i4 + 1 : 0;
                                        i3++;
                                        i8 += i9;
                                        if (i9 != 255) {
                                            break;
                                        }
                                    } else {
                                        i3++;
                                        i4 = 0;
                                    }
                                }
                                int i10 = 0;
                                while (i10 < i8 && i3 < i) {
                                    int i11 = i3 + 1;
                                    int i12 = byteBuffer4.get(i3) & 255;
                                    if (i12 == 3 && i4 >= 2) {
                                        i10--;
                                    } else if (i12 == 0) {
                                        i4++;
                                        i10++;
                                        i3 = i11;
                                    }
                                    i4 = 0;
                                    i10++;
                                    i3 = i11;
                                }
                            }
                        }
                    }
                    position2 = i;
                }
            }
        }
        this.U1 = 0;
        int U = U(la3Var);
        if ((Build.VERSION.SDK_INT < 34 || (U & 32) == 0) && !this.O1) {
            this.E1++;
        }
    }

    @Override // om6, uh0
    public final void q() {
        xab xabVar = this.c1;
        this.M1 = null;
        R0();
        this.y1 = false;
        this.Q1 = null;
        this.H1 = B0();
        try {
            super.q();
        } finally {
            xabVar.i(this.O0);
            xabVar.q(jec.d);
        }
    }

    @Override // uh0
    public final void r(boolean z, boolean z2) {
        iec iecVar;
        this.O0 = new ia3();
        f99 f99Var = this.d;
        f99Var.getClass();
        boolean z3 = f99Var.b;
        byte b = 0;
        jte.p((z3 && this.P1 == 0) ? false : true);
        if (this.O1 != z3) {
            this.O1 = z3;
            t0();
        }
        ia3 ia3Var = this.O0;
        xab xabVar = this.c1;
        Handler handler = (Handler) xabVar.b;
        if (handler != null) {
            handler.post(new xdc(xabVar, ia3Var, b));
        }
        boolean z4 = this.s1;
        xcc xccVar = this.f1;
        if (!z4) {
            if (this.u1 != null && this.r1 == null) {
                kn3 kn3Var = new kn3(this.a1, xccVar);
                kn3Var.a = true;
                long j = this.j1;
                kn3Var.c = j != -9223372036854775807L ? -j : -9223372036854775807L;
                bfb bfbVar = this.h;
                bfbVar.getClass();
                kn3Var.g = bfbVar;
                jte.p(!kn3Var.b);
                if (((je8) kn3Var.f) == null) {
                    kn3Var.f = new je8();
                }
                le8 le8Var = new le8(kn3Var);
                kn3Var.b = true;
                if (1 >= le8Var.p) {
                    le8Var.p = 1;
                }
                SparseArray sparseArray = le8Var.c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    iecVar = (iec) sparseArray.get(0);
                } else {
                    he8 he8Var = new he8(le8Var, le8Var.a);
                    le8Var.g.add(he8Var);
                    sparseArray.put(0, he8Var);
                    iecVar = he8Var;
                }
                this.r1 = iecVar;
            }
            this.s1 = true;
        }
        iec iecVar2 = this.r1;
        if (iecVar2 == null) {
            bfb bfbVar2 = this.h;
            bfbVar2.getClass();
            xccVar.k = bfbVar2;
            xccVar.e(!z2 ? 1 : 0);
            return;
        }
        iecVar2.i(new k44(this, (byte) 16));
        vcc vccVar = this.R1;
        if (vccVar != null) {
            this.r1.t(vccVar);
        }
        if (this.v1 != null && !this.x1.equals(yka.c)) {
            this.r1.c(this.v1, this.x1);
        }
        this.r1.k(this.A1);
        this.r1.d(this.a0);
        List list = this.u1;
        if (list != null) {
            this.r1.p(list);
        }
        this.t1 = !z2 ? 1 : 0;
        this.S0 = true;
    }

    @Override // om6
    public final boolean r0(long j, long j2, hm6 hm6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, go4 go4Var) {
        zj4 zj4Var;
        hm6Var.getClass();
        long j4 = j3 - this.P0.c;
        boolean z3 = this.f1.h != -9223372036854775807L;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.l1;
            Long l = (Long) priorityQueue.peek();
            zj4Var = this.h1;
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            zj4Var.b(1000 * l.longValue());
            if (l.longValue() < this.x || z3) {
                i5++;
            } else {
                i4++;
            }
        }
        Y0(i4, 0);
        this.O0.d += i5;
        zj4Var.b(j3 * 1000);
        iec iecVar = this.r1;
        if (iecVar != null) {
            if (!z || z2) {
                return iecVar.m(j3, new vm6(this, hm6Var, i, j4));
            }
            X0(hm6Var, i);
            return true;
        }
        int a = this.f1.a(j3, j, j2, this.P0.b, z, z2, zj4Var.a(), zj4Var.h, this.g1);
        qz0 qz0Var = this.g1;
        ycc yccVar = this.k1;
        if (yccVar != null && a != 5 && a != 4) {
            yccVar.a(j3, qz0Var.a);
        }
        if (a == 0) {
            this.h.getClass();
            long nanoTime = System.nanoTime();
            vcc vccVar = this.R1;
            if (vccVar != null) {
                vccVar.c(j4, nanoTime, go4Var, this.e0);
            }
            S0(hm6Var, i, nanoTime);
            Z0(qz0Var.a);
            return true;
        }
        if (a == 1) {
            long j5 = qz0Var.b;
            long j6 = qz0Var.a;
            if (j5 == this.K1) {
                X0(hm6Var, i);
            } else {
                vcc vccVar2 = this.R1;
                if (vccVar2 != null) {
                    vccVar2.c(j4, j5, go4Var, this.e0);
                }
                S0(hm6Var, i, j5);
            }
            Z0(j6);
            this.K1 = j5;
            return true;
        }
        if (a == 2) {
            Trace.beginSection("dropVideoBuffer");
            hm6Var.c(i);
            Trace.endSection();
            Y0(0, 1);
            Z0(qz0Var.a);
            return true;
        }
        if (a == 3) {
            X0(hm6Var, i);
            Z0(qz0Var.a);
            return true;
        }
        if (a == 4 || a == 5) {
            return false;
        }
        dq9.m(String.valueOf(a));
        return false;
    }

    @Override // om6, uh0
    public final void s(long j, boolean z, boolean z2) {
        iec iecVar = this.r1;
        if (iecVar != null && !z) {
            iecVar.o(true);
        }
        if (z2) {
            this.G1 = j;
        }
        super.s(j, z, z2);
        iec iecVar2 = this.r1;
        xcc xccVar = this.f1;
        if (iecVar2 == null) {
            xccVar.b.b();
            xccVar.f = -9223372036854775807L;
            xccVar.e = Math.min(xccVar.e, 1);
            xccVar.h = -9223372036854775807L;
            xccVar.m = false;
        }
        ycc yccVar = this.k1;
        if (yccVar != null) {
            yccVar.b();
        }
        if (z) {
            iec iecVar3 = this.r1;
            if (iecVar3 != null) {
                iecVar3.r(false);
            } else {
                xccVar.c(false);
            }
        }
        R0();
        this.D1 = 0;
    }

    @Override // uh0
    public final void t() {
        iec iecVar = this.r1;
        if (iecVar == null || !this.b1) {
            return;
        }
        iecVar.release();
    }

    @Override // om6
    public final void u0() {
        iec iecVar = this.r1;
        if (iecVar != null) {
            iecVar.j();
        } else {
            long j = this.P0.h;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uh0
    public final void v() {
        try {
            try {
                this.x0 = false;
                v0();
                t0();
            } finally {
                ts2.B(this.X, null);
                this.X = null;
            }
        } finally {
            this.s1 = false;
            this.S1 = -9223372036854775807L;
            this.q1 = false;
            rd8 rd8Var = this.w1;
            if (rd8Var != null) {
                rd8Var.release();
                this.w1 = null;
            }
        }
    }

    @Override // uh0
    public final void w() {
        this.C1 = 0;
        this.h.getClass();
        this.B1 = SystemClock.elapsedRealtime();
        this.I1 = 0L;
        this.J1 = 0;
        iec iecVar = this.r1;
        if (iecVar != null) {
            iecVar.f();
        } else {
            this.f1.d();
        }
    }

    @Override // om6
    public final void w0() {
        super.w0();
        this.l1.clear();
        this.E1 = 0;
        this.U1 = 0;
        this.H1 = false;
        hi2 hi2Var = this.i1;
        if (hi2Var != null) {
            hi2Var.c = null;
            ByteBuffer byteBuffer = (ByteBuffer) hi2Var.b;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override // uh0
    public final void x() {
        Q0();
        int i = this.J1;
        if (i != 0) {
            long j = this.I1;
            xab xabVar = this.c1;
            Handler handler = (Handler) xabVar.b;
            if (handler != null) {
                handler.post(new wdc(xabVar, j, i));
            }
            this.I1 = 0L;
            this.J1 = 0;
        }
        iec iecVar = this.r1;
        if (iecVar != null) {
            iecVar.e();
        } else {
            xcc xccVar = this.f1;
            xccVar.d = false;
            xccVar.h = -9223372036854775807L;
            cdc cdcVar = xccVar.b;
            cdcVar.d = false;
            zcc zccVar = cdcVar.c;
            if (zccVar != null) {
                zccVar.b();
            }
            cdcVar.a();
        }
        ycc yccVar = this.k1;
        if (yccVar != null) {
            yccVar.b();
        }
    }

    @Override // om6, uh0
    public final void y(go4[] go4VarArr, long j, long j2, rz6 rz6Var) {
        super.y(go4VarArr, j, j2, rz6Var);
        ycc yccVar = this.k1;
        if (yccVar != null) {
            yccVar.b();
        }
    }
}
