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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class sz {
    public static final j99 e;
    public static final sz f;
    public static final j99 g;
    public static final to5 h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final po5 c;
    public final po5 d;

    static {
        j99 u = po5.u(12);
        e = u;
        f = new sz(po5.u(rz.d), u, j99.e);
        Object[] objArr = {2, 5, 6};
        rue.a(3, objArr);
        g = po5.o(3, objArr);
        lp lpVar = new lp(4);
        lpVar.x(5, 6);
        lpVar.x(17, 6);
        lpVar.x(7, 6);
        lpVar.x(30, 10);
        lpVar.x(18, 6);
        lpVar.x(6, 8);
        lpVar.x(8, 8);
        lpVar.x(14, 8);
        h = lpVar.d(true);
    }

    public sz(j99 j99Var, po5 po5Var, List list) {
        for (int i = 0; i < j99Var.d; i++) {
            rz rzVar = (rz) j99Var.get(i);
            this.a.put(rzVar.a, rzVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 = Math.max(i2, ((rz) this.a.valueAt(i3)).b);
        }
        this.b = i2;
        this.c = po5.q(po5Var);
        this.d = po5.q(list);
    }

    public static j99 a(int[] iArr, int i) {
        mo5 p = po5.p();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            p.c(new rz(i2, i));
        }
        return p.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        if (r0.equals("Xiaomi") == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static sz b(Context context, Intent intent, oz ozVar, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioManager e2 = j00.e(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? t4.e(e2, ozVar) : null;
        }
        po5 b = audioDeviceInfo != null ? noa.b(audioDeviceInfo) : e;
        if (Build.VERSION.SDK_INT >= 33 && (gcc.Q(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return t4.d(e2, ozVar, b, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? e2.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (eie.a(audioDeviceInfo2.getType())) {
                return new sz(po5.u(rz.d), b, list);
            }
        }
        ap5 ap5Var = new ap5(4);
        ap5Var.c(2);
        if (Build.VERSION.SDK_INT >= 29 && (gcc.Q(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            j99 f2 = sr.f(ozVar);
            f2.getClass();
            ap5Var.d(f2);
            return new sz(a(ype.e(ap5Var.g()), 10), b, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (!str.equals("Amazon")) {
            }
        }
        if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            j99 j99Var = g;
            j99Var.getClass();
            ap5Var.d(j99Var);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new sz(a(ype.e(ap5Var.g()), 10), b, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List a = ype.a(intArrayExtra);
            a.getClass();
            ap5Var.d(a);
        }
        return new sz(a(ype.e(ap5Var.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), b, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
    
        if (r8 != 5) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair c(oz ozVar, ko4 ko4Var) {
        String str = ko4Var.t;
        int i = ko4Var.O;
        int i2 = ko4Var.N;
        str.getClass();
        int c = eg7.c(str, ko4Var.l);
        Integer valueOf = Integer.valueOf(c);
        to5 to5Var = h;
        if (!to5Var.containsKey(valueOf)) {
            return null;
        }
        int i3 = 6;
        SparseArray sparseArray = this.a;
        if (c == 18 && !gcc.k(sparseArray, 18)) {
            c = 6;
        } else if ((c == 8 && !gcc.k(sparseArray, 8)) || (c == 30 && !gcc.k(sparseArray, 30))) {
            c = 7;
        }
        if (!gcc.k(sparseArray, c)) {
            return null;
        }
        rz rzVar = (rz) sparseArray.get(c);
        rzVar.getClass();
        int i4 = rzVar.b;
        bp5 bp5Var = rzVar.c;
        boolean z = false;
        if (i2 == -1 || c == 18) {
            int i5 = ko4Var.P;
            if (i5 == -1) {
                i5 = 48000;
            }
            int i6 = rzVar.a;
            if (bp5Var == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    i4 = sr.h(i6, i5, ozVar);
                } else {
                    Object obj = to5Var.get(Integer.valueOf(i6));
                    i4 = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
        } else {
            if (!ko4Var.t.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                rz rzVar2 = rz.d;
                if (bp5Var != null) {
                    int t = i != -1 ? i : gcc.t(i2);
                    if (t != 0) {
                        z = bp5Var.contains(Integer.valueOf(t));
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
            HashSet hashSet = gt6.a;
            if (i7 <= 26 && "fugu".equals(Build.DEVICE) && i3 == 1) {
                i3 = 2;
            }
            if (i != -1 || i2 != i3) {
                i = gcc.t(i3);
            }
            if (i != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(c), Integer.valueOf(i));
        }
        i3 = i4;
        HashSet hashSet2 = gt6.a;
        if (i7 <= 26) {
            i3 = 2;
        }
        if (i != -1) {
        }
        i = gcc.t(i3);
        if (i != 0) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz)) {
            return false;
        }
        sz szVar = (sz) obj;
        return gcc.m(this.a, szVar.a) && this.b == szVar.b && Objects.equals(this.c, szVar.c) && Objects.equals(this.d, szVar.d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((gcc.n(this.a) + (this.b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
