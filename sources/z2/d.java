package z2;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b2.f;
import b2.w;
import c2.i;
import e2.m0;
import e9.l0;
import e9.n0;
import e9.x1;
import i2.f0;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class d {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final c d;

    public d(Context context, Runnable runnable, Boolean bool) {
        AudioManager e = context == null ? null : i.e(context);
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
        c cVar = new c(runnable);
        this.d = cVar;
        spatializer.addOnSpatializerStateChangedListener(new f0(handler, 1), cVar);
    }

    public final boolean a(f fVar, w wVar) {
        if (this.a == null || !this.b || !c() || !d()) {
            return false;
        }
        String str = wVar.s;
        int i10 = wVar.K;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i10 == 16) {
                i10 = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i10 == -1) {
                i10 = 6;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i10 == 18 || i10 == 21)) {
            i10 = 24;
        }
        int t10 = m0.t(i10);
        if (t10 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(t10);
        int i11 = wVar.L;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(fVar.b(), channelMask.build());
    }

    public final List b() {
        if (this.a == null || !this.b || !c() || !d()) {
            l0 l0Var = n0.b;
            return x1.e;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return n0.y(252);
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
        c cVar;
        Handler handler;
        Spatializer spatializer = this.a;
        if (spatializer == null || (cVar = this.d) == null || (handler = this.c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(cVar);
        handler.removeCallbacksAndMessages(null);
    }
}
