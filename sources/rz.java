// default package

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import j$.util.Objects;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class rz {
    public static final w59 e;
    public static final rz f;
    public static final w59 g;
    public static final qm5 h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final mm5 c;
    public final mm5 d;

    static {
        w59 u = mm5.u(12);
        e = u;
        f = new rz(mm5.u(qz.d), u, w59.e);
        Object[] objArr = {2, 5, 6};
        xpe.a(3, objArr);
        g = mm5.o(3, objArr);
        kp kpVar = new kp(4);
        kpVar.w(5, 6);
        kpVar.w(17, 6);
        kpVar.w(7, 6);
        kpVar.w(30, 10);
        kpVar.w(18, 6);
        kpVar.w(6, 8);
        kpVar.w(8, 8);
        kpVar.w(14, 8);
        h = kpVar.c(true);
    }

    public rz(w59 w59Var, mm5 mm5Var, List list) {
        for (int i = 0; i < w59Var.d; i++) {
            qz qzVar = (qz) w59Var.get(i);
            this.a.put(qzVar.a, qzVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 = Math.max(i2, ((qz) this.a.valueAt(i3)).b);
        }
        this.b = i2;
        this.c = mm5.q(mm5Var);
        this.d = mm5.q(list);
    }

    public static w59 a(int[] iArr, int i) {
        jm5 p = mm5.p();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            p.c(new qz(i2, i));
        }
        return p.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        if (r0.equals("Xiaomi") == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static rz b(Context context, Intent intent, nz nzVar, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioManager e2 = i00.e(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? s4.e(e2, nzVar) : null;
        }
        mm5 b = audioDeviceInfo != null ? tka.b(audioDeviceInfo) : e;
        if (Build.VERSION.SDK_INT >= 33 && (g8c.Q(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return s4.d(e2, nzVar, b, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? e2.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (nde.a(audioDeviceInfo2.getType())) {
                return new rz(mm5.u(qz.d), b, list);
            }
        }
        xm5 xm5Var = new xm5(4);
        xm5Var.c(2);
        if (Build.VERSION.SDK_INT >= 29 && (g8c.Q(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            w59 f2 = rr.f(nzVar);
            f2.getClass();
            xm5Var.d(f2);
            return new rz(a(gle.e(xm5Var.g()), 10), b, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (!str.equals("Amazon")) {
            }
        }
        if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            w59 w59Var = g;
            w59Var.getClass();
            xm5Var.d(w59Var);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new rz(a(gle.e(xm5Var.g()), 10), b, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List a = gle.a(intArrayExtra);
            a.getClass();
            xm5Var.d(a);
        }
        return new rz(a(gle.e(xm5Var.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), b, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
    
        if (r8 != 5) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair c(nz nzVar, fm4 fm4Var) {
        String str = fm4Var.t;
        int i = fm4Var.O;
        int i2 = fm4Var.N;
        str.getClass();
        int c = ud7.c(str, fm4Var.l);
        Integer valueOf = Integer.valueOf(c);
        qm5 qm5Var = h;
        if (!qm5Var.containsKey(valueOf)) {
            return null;
        }
        int i3 = 6;
        SparseArray sparseArray = this.a;
        if (c == 18 && !g8c.k(sparseArray, 18)) {
            c = 6;
        } else if ((c == 8 && !g8c.k(sparseArray, 8)) || (c == 30 && !g8c.k(sparseArray, 30))) {
            c = 7;
        }
        if (!g8c.k(sparseArray, c)) {
            return null;
        }
        qz qzVar = (qz) sparseArray.get(c);
        qzVar.getClass();
        int i4 = qzVar.b;
        ym5 ym5Var = qzVar.c;
        boolean z = false;
        if (i2 == -1 || c == 18) {
            int i5 = fm4Var.P;
            if (i5 == -1) {
                i5 = 48000;
            }
            int i6 = qzVar.a;
            if (ym5Var == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    i4 = rr.h(i6, i5, nzVar);
                } else {
                    Object obj = qm5Var.get(Integer.valueOf(i6));
                    i4 = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
        } else {
            if (!fm4Var.t.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                qz qzVar2 = qz.d;
                if (ym5Var != null) {
                    int t = i != -1 ? i : g8c.t(i2);
                    if (t != 0) {
                        z = ym5Var.contains(Integer.valueOf(t));
                    }
                } else if (i2 <= i4) {
                    z = true;
                }
                if (!z) {
                    return null;
                }
            } else if (i2 > 10) {
                return null;
            }
            i4 = i2;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 <= 28) {
            if (i4 == 7) {
                i3 = 8;
            } else if (i4 != 3) {
                if (i4 != 4) {
                }
            }
            HashSet hashSet = cr6.a;
            if (i7 <= 26 && "fugu".equals(Build.DEVICE) && i3 == 1) {
                i3 = 2;
            }
            if (i != -1 || i2 != i3) {
                i = g8c.t(i3);
            }
            if (i != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(c), Integer.valueOf(i));
        }
        i3 = i4;
        HashSet hashSet2 = cr6.a;
        if (i7 <= 26) {
            i3 = 2;
        }
        if (i != -1) {
        }
        i = g8c.t(i3);
        if (i != 0) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz)) {
            return false;
        }
        rz rzVar = (rz) obj;
        return g8c.m(this.a, rzVar.a) && this.b == rzVar.b && Objects.equals(this.c, rzVar.c) && Objects.equals(this.d, rzVar.d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((g8c.n(this.a) + (this.b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
