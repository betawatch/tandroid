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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r00 {
    public static final y79 e;
    public static final r00 f;
    public static final y79 g;
    public static final qo5 h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final mo5 c;
    public final mo5 d;

    static {
        y79 u = mo5.u(12);
        e = u;
        f = new r00(mo5.u(q00.d), u, y79.e);
        Object[] objArr = {2, 5, 6};
        ase.a(3, objArr);
        g = mo5.o(3, objArr);
        kq kqVar = new kq(4);
        kqVar.w(5, 6);
        kqVar.w(17, 6);
        kqVar.w(7, 6);
        kqVar.w(30, 10);
        kqVar.w(18, 6);
        kqVar.w(6, 8);
        kqVar.w(8, 8);
        kqVar.w(14, 8);
        h = kqVar.e(true);
    }

    public r00(y79 y79Var, mo5 mo5Var, List list) {
        for (int i = 0; i < y79Var.d; i++) {
            q00 q00Var = (q00) y79Var.get(i);
            this.a.put(q00Var.a, q00Var);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 = Math.max(i2, ((q00) this.a.valueAt(i3)).b);
        }
        this.b = i2;
        this.c = mo5.q(mo5Var);
        this.d = mo5.q(list);
    }

    public static y79 a(int[] iArr, int i) {
        jo5 p = mo5.p();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            p.c(new q00(i2, i));
        }
        return p.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        if (r0.equals("Xiaomi") == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r00 b(Context context, Intent intent, o00 o00Var, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioManager e2 = i10.e(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? s4.e(e2, o00Var) : null;
        }
        mo5 b = audioDeviceInfo != null ? uma.b(audioDeviceInfo) : e;
        if (Build.VERSION.SDK_INT >= 33 && (hac.Q(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return s4.d(e2, o00Var, b, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? e2.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (ofe.a(audioDeviceInfo2.getType())) {
                return new r00(mo5.u(q00.d), b, list);
            }
        }
        xo5 xo5Var = new xo5(4);
        xo5Var.c(2);
        if (Build.VERSION.SDK_INT >= 29 && (hac.Q(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            y79 f2 = rs.f(o00Var);
            f2.getClass();
            xo5Var.d(f2);
            return new r00(a(ine.e(xo5Var.g()), 10), b, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (!str.equals("Amazon")) {
            }
        }
        if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            y79 y79Var = g;
            y79Var.getClass();
            xo5Var.d(y79Var);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new r00(a(ine.e(xo5Var.g()), 10), b, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List a = ine.a(intArrayExtra);
            a.getClass();
            xo5Var.d(a);
        }
        return new r00(a(ine.e(xo5Var.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), b, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
    
        if (r8 != 5) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair c(o00 o00Var, go4 go4Var) {
        String str = go4Var.t;
        int i = go4Var.O;
        int i2 = go4Var.N;
        str.getClass();
        int c = wf7.c(str, go4Var.l);
        Integer valueOf = Integer.valueOf(c);
        qo5 qo5Var = h;
        if (!qo5Var.containsKey(valueOf)) {
            return null;
        }
        int i3 = 6;
        SparseArray sparseArray = this.a;
        if (c == 18 && !hac.k(sparseArray, 18)) {
            c = 6;
        } else if ((c == 8 && !hac.k(sparseArray, 8)) || (c == 30 && !hac.k(sparseArray, 30))) {
            c = 7;
        }
        if (!hac.k(sparseArray, c)) {
            return null;
        }
        q00 q00Var = (q00) sparseArray.get(c);
        q00Var.getClass();
        int i4 = q00Var.b;
        yo5 yo5Var = q00Var.c;
        boolean z = false;
        if (i2 == -1 || c == 18) {
            int i5 = go4Var.P;
            if (i5 == -1) {
                i5 = 48000;
            }
            int i6 = q00Var.a;
            if (yo5Var == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    i4 = rs.h(i6, i5, o00Var);
                } else {
                    Object obj = qo5Var.get(Integer.valueOf(i6));
                    i4 = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
        } else {
            if (!go4Var.t.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                q00 q00Var2 = q00.d;
                if (yo5Var != null) {
                    int t = i != -1 ? i : hac.t(i2);
                    if (t != 0) {
                        z = yo5Var.contains(Integer.valueOf(t));
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
            HashSet hashSet = ct6.a;
            if (i7 <= 26 && "fugu".equals(Build.DEVICE) && i3 == 1) {
                i3 = 2;
            }
            if (i != -1 || i2 != i3) {
                i = hac.t(i3);
            }
            if (i != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(c), Integer.valueOf(i));
        }
        i3 = i4;
        HashSet hashSet2 = ct6.a;
        if (i7 <= 26) {
            i3 = 2;
        }
        if (i != -1) {
        }
        i = hac.t(i3);
        if (i != 0) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r00)) {
            return false;
        }
        r00 r00Var = (r00) obj;
        return hac.m(this.a, r00Var.a) && this.b == r00Var.b && Objects.equals(this.c, r00Var.c) && Objects.equals(this.d, r00Var.d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((hac.n(this.a) + (this.b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
