// default package

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ska {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final rka d;

    public ska(Context context, Runnable runnable, Boolean bool) {
        AudioManager e = context == null ? null : i00.e(context);
        if (e == null || (bool != null && bool.booleanValue())) {
            this.a = null;
            this.b = false;
            this.c = null;
            this.d = null;
            return;
        }
        Spatializer spatializer = e.getSpatializer();
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        Handler handler = new Handler(myLooper);
        this.c = handler;
        rka rkaVar = new rka(runnable);
        this.d = rkaVar;
        spatializer.addOnSpatializerStateChangedListener(new g40(handler, (byte) 0), rkaVar);
    }

    public final boolean a(nz nzVar, fm4 fm4Var) {
        int i;
        if (this.a == null || !this.b || !c() || !d()) {
            return false;
        }
        String str = fm4Var.t;
        int i2 = fm4Var.N;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i2 == 16) {
                i = 12;
            }
            i = i2;
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i2 == -1) {
                i = 6;
            }
            i = i2;
        } else {
            if (Objects.equals(str, "audio/ac4") && (i2 == 18 || i2 == 21)) {
                i = 24;
            }
            i = i2;
        }
        int i3 = fm4Var.O;
        if (i3 == -1 || i2 != i) {
            i3 = g8c.t(i);
        }
        if (i3 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(i3);
        int i4 = fm4Var.P;
        if (i4 != -1) {
            channelMask.setSampleRate(i4);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(nzVar.b(), channelMask.build());
    }

    public final List b() {
        if (this.a == null || !this.b || !c() || !d()) {
            km5 km5Var = mm5.b;
            return w59.e;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return mm5.u(Integer.valueOf(kk7.a4));
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.getSpatializedChannelMasks();
    }

    public final boolean c() {
        Spatializer spatializer = this.a;
        return spatializer != null && spatializer.isAvailable();
    }

    public final boolean d() {
        Spatializer spatializer = this.a;
        return spatializer != null && spatializer.isEnabled();
    }

    public final void e() {
        rka rkaVar;
        Handler handler;
        Spatializer spatializer = this.a;
        if (spatializer == null || (rkaVar = this.d) == null || (handler = this.c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(rkaVar);
        handler.removeCallbacksAndMessages(null);
    }
}
