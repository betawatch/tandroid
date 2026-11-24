// default package

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tu6 implements IBinder.DeathRecipient {
    public final ro6 a = new ro6(this);
    public kb3 b;
    public so6 c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ dq e;

    public tu6(dq dqVar, byte b) {
        this.d = b;
        this.e = dqVar;
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        byte b = this.d;
        dq dqVar = this.e;
        switch (b) {
            case 0:
                wu6 wu6Var = (wu6) dqVar;
                wu6Var.m0 = mediaMetadataCompat != null ? mediaMetadataCompat.a() : null;
                wu6Var.r();
                wu6Var.q(false);
                break;
            default:
                rv6 rv6Var = (rv6) dqVar;
                rv6Var.c0 = mediaMetadataCompat != null ? mediaMetadataCompat.a() : null;
                rv6Var.f();
                rv6Var.k();
                break;
        }
    }

    public final void b(PlaybackStateCompat playbackStateCompat) {
        switch (this.d) {
            case 0:
                wu6 wu6Var = (wu6) this.e;
                wu6Var.l0 = playbackStateCompat;
                wu6Var.q(false);
                break;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        e(8, null, null);
    }

    public final void d() {
        byte b = this.d;
        dq dqVar = this.e;
        switch (b) {
            case 0:
                wu6 wu6Var = (wu6) dqVar;
                wm4 wm4Var = wu6Var.j0;
                if (wm4Var != null) {
                    wm4Var.g0(wu6Var.k0);
                    wu6Var.j0 = null;
                    break;
                }
                break;
            default:
                rv6 rv6Var = (rv6) dqVar;
                wm4 wm4Var2 = rv6Var.a0;
                if (wm4Var2 != null) {
                    wm4Var2.g0(rv6Var.b0);
                    rv6Var.a0 = null;
                    break;
                }
                break;
        }
    }

    public final void e(int i, Object obj, Bundle bundle) {
        kb3 kb3Var = this.b;
        if (kb3Var != null) {
            Message obtainMessage = kb3Var.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public final void f(Handler handler) {
        if (handler != null) {
            kb3 kb3Var = new kb3(this, handler.getLooper());
            this.b = kb3Var;
            kb3Var.b = true;
        } else {
            kb3 kb3Var2 = this.b;
            if (kb3Var2 != null) {
                kb3Var2.b = false;
                kb3Var2.removeCallbacksAndMessages(null);
                this.b = null;
            }
        }
    }

    public final void c(PlaybackStateCompat playbackStateCompat) {
    }
}
