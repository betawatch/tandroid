// default package

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ya3 {
    public final Context a;
    public Boolean b;

    public ya3(Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }

    public final k10 a(o00 o00Var, go4 go4Var) {
        Boolean bool;
        boolean booleanValue;
        go4Var.getClass();
        int i = go4Var.P;
        o00Var.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return k10.d;
        }
        Boolean bool2 = this.b;
        if (bool2 != null) {
            booleanValue = bool2.booleanValue();
        } else {
            Context context = this.a;
            if (context != null) {
                String parameters = i10.e(context).getParameters("offloadVariableRateSupported");
                bool = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                this.b = bool;
            } else {
                bool = Boolean.FALSE;
                this.b = bool;
            }
            booleanValue = bool.booleanValue();
        }
        String str = go4Var.t;
        str.getClass();
        int c = wf7.c(str, go4Var.l);
        if (c == 0 || i2 < hac.s(c)) {
            return k10.d;
        }
        int i3 = go4Var.O;
        if (i3 == -1) {
            i3 = hac.t(go4Var.N);
        }
        if (i3 == 0) {
            return k10.d;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(i3).setEncoding(c).build();
            if (i2 >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, o00Var.b());
                if ((directPlaybackSupport & 1) == 0) {
                    return k10.d;
                }
                r4 = (directPlaybackSupport & 3) == 3;
                j10 j10Var = new j10();
                j10Var.a = true;
                j10Var.b = r4;
                j10Var.c = booleanValue;
                return j10Var.a();
            }
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(build, o00Var.b())) {
                    return k10.d;
                }
                j10 j10Var2 = new j10();
                j10Var2.a = true;
                j10Var2.c = booleanValue;
                return j10Var2.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, o00Var.b());
            if (playbackOffloadSupport == 0) {
                return k10.d;
            }
            j10 j10Var3 = new j10();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                r4 = true;
            }
            j10Var3.a = true;
            j10Var3.b = r4;
            j10Var3.c = booleanValue;
            return j10Var3.a();
        } catch (IllegalArgumentException unused) {
            return k10.d;
        }
    }
}
