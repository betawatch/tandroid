// default package

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class yu6 implements IBinder.DeathRecipient {
    public final vo6 a = new vo6(this);
    public ra3 b;
    public wo6 c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ ep e;

    public yu6(ep epVar, byte b) {
        this.d = b;
        this.e = epVar;
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        byte b = this.d;
        ep epVar = this.e;
        switch (b) {
            case 0:
                bv6 bv6Var = (bv6) epVar;
                bv6Var.m0 = mediaMetadataCompat != null ? mediaMetadataCompat.a() : null;
                bv6Var.r();
                bv6Var.q(false);
                break;
            default:
                wv6 wv6Var = (wv6) epVar;
                wv6Var.c0 = mediaMetadataCompat != null ? mediaMetadataCompat.a() : null;
                wv6Var.f();
                wv6Var.k();
                break;
        }
    }

    public final void b(PlaybackStateCompat playbackStateCompat) {
        switch (this.d) {
            case 0:
                bv6 bv6Var = (bv6) this.e;
                bv6Var.l0 = playbackStateCompat;
                bv6Var.q(false);
                break;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        e(8, null, null);
    }

    public final void d() {
        byte b = this.d;
        ep epVar = this.e;
        switch (b) {
            case 0:
                bv6 bv6Var = (bv6) epVar;
                um4 um4Var = bv6Var.j0;
                if (um4Var != null) {
                    um4Var.e0(bv6Var.k0);
                    bv6Var.j0 = null;
                    break;
                }
                break;
            default:
                wv6 wv6Var = (wv6) epVar;
                um4 um4Var2 = wv6Var.a0;
                if (um4Var2 != null) {
                    um4Var2.e0(wv6Var.b0);
                    wv6Var.a0 = null;
                    break;
                }
                break;
        }
    }

    public final void e(int i, Object obj, Bundle bundle) {
        ra3 ra3Var = this.b;
        if (ra3Var != null) {
            Message obtainMessage = ra3Var.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public final void f(Handler handler) {
        if (handler != null) {
            ra3 ra3Var = new ra3(this, handler.getLooper());
            this.b = ra3Var;
            ra3Var.b = true;
        } else {
            ra3 ra3Var2 = this.b;
            if (ra3Var2 != null) {
                ra3Var2.b = false;
                ra3Var2.removeCallbacksAndMessages(null);
                this.b = null;
            }
        }
    }

    public final void c(PlaybackStateCompat playbackStateCompat) {
    }
}
