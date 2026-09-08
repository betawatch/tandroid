package x2;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import e2.d0;
import j$.util.Objects;
import k2.a0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final j d;

    public k(Context context, p pVar, Boolean bool) {
        AudioManager e7 = context == null ? null : c2.d.e(context);
        if (e7 == null || (bool != null && bool.booleanValue())) {
            this.a = null;
            this.b = false;
            this.c = null;
            this.d = null;
            return;
        }
        Spatializer spatializer = e7.getSpatializer();
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
        j jVar = new j(pVar);
        this.d = jVar;
        Looper myLooper = Looper.myLooper();
        e2.d.h(myLooper);
        Handler handler = new Handler(myLooper);
        this.c = handler;
        spatializer.addOnSpatializerStateChangedListener(new a0(handler, 0), jVar);
    }

    public final boolean a(b2.e eVar, b2.s sVar) {
        String str = sVar.r;
        String str2 = sVar.r;
        int i10 = sVar.J;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i10 == 16) {
                i10 = 12;
            }
        } else if (Objects.equals(str2, "audio/iamf")) {
            if (i10 == -1) {
                i10 = 6;
            }
        } else if (Objects.equals(str2, "audio/ac4") && (i10 == 18 || i10 == 21)) {
            i10 = 24;
        }
        int s10 = d0.s(i10);
        if (s10 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(s10);
        int i11 = sVar.K;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.canBeSpatialized((AudioAttributes) eVar.b().a, channelMask.build());
    }

    public final boolean b() {
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.isAvailable();
    }

    public final boolean c() {
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.isEnabled();
    }

    public final void d() {
        j jVar;
        Handler handler;
        Spatializer spatializer = this.a;
        if (spatializer == null || (jVar = this.d) == null || (handler = this.c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(jVar);
        handler.removeCallbacksAndMessages(null);
    }
}
