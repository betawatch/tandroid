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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tma {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final sma d;

    public tma(Context context, Runnable runnable, Boolean bool) {
        AudioManager e = context == null ? null : i10.e(context);
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
        sma smaVar = new sma(runnable);
        this.d = smaVar;
        spatializer.addOnSpatializerStateChangedListener(new g50(handler, (byte) 0), smaVar);
    }

    public final boolean a(o00 o00Var, go4 go4Var) {
        int i;
        if (this.a == null || !this.b || !c() || !d()) {
            return false;
        }
        String str = go4Var.t;
        int i2 = go4Var.N;
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
        int i3 = go4Var.O;
        if (i3 == -1 || i2 != i) {
            i3 = hac.t(i);
        }
        if (i3 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(i3);
        int i4 = go4Var.P;
        if (i4 != -1) {
            channelMask.setSampleRate(i4);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(o00Var.b(), channelMask.build());
    }

    public final List b() {
        if (this.a == null || !this.b || !c() || !d()) {
            ko5 ko5Var = mo5.b;
            return y79.e;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return mo5.u(Integer.valueOf(nm7.a4));
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
        sma smaVar;
        Handler handler;
        Spatializer spatializer = this.a;
        if (spatializer == null || (smaVar = this.d) == null || (handler = this.c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(smaVar);
        handler.removeCallbacksAndMessages(null);
    }
}
