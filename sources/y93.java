// default package

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class y93 extends Handler {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y93(ts6 ts6Var, Looper looper) {
        super(looper);
        this.c = ts6Var;
        this.b = false;
    }

    public final boolean a(Message message, mq6 mq6Var) {
        long min;
        z93 z93Var = (z93) message.obj;
        if (z93Var.b) {
            int i = z93Var.e + 1;
            z93Var.e = i;
            ((aa3) this.c).i.getClass();
            if (i <= 3) {
                e86 e86Var = new e86(z93Var.a, mq6Var.a, SystemClock.elapsedRealtime());
                e86Var.d = mq6Var.b;
                e86Var.e = mq6Var.c;
                e86Var.f = SystemClock.elapsedRealtime() - z93Var.c;
                e86Var.g = mq6Var.d;
                f86 f86Var = new f86(e86Var);
                i2f i2fVar = ((aa3) this.c).i;
                int i2 = z93Var.e;
                i2fVar.getClass();
                for (Throwable bk2Var = mq6Var.getCause() instanceof IOException ? (IOException) mq6Var.getCause() : new bk2(mq6Var.getCause()); bk2Var != null; bk2Var = bk2Var.getCause()) {
                    if ((bk2Var instanceof av7) || (bk2Var instanceof FileNotFoundException) || (bk2Var instanceof ig5) || (bk2Var instanceof m86) || ((bk2Var instanceof r63) && ((r63) bk2Var).a == 2008)) {
                        min = -9223372036854775807L;
                        break;
                    }
                }
                min = Math.min((i2 - 1) * 1000, 5000);
                if (min != -9223372036854775807L) {
                    synchronized (((aa3) this.c).o) {
                        z24 z24Var = ((aa3) this.c).y;
                        if (z24Var != null) {
                            ((jm5) z24Var.b).c(f86Var);
                        }
                    }
                    synchronized (this) {
                        if (this.b) {
                            return false;
                        }
                        sendMessageDelayed(Message.obtain(message), min);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void b() {
        removeCallbacksAndMessages(null);
        this.b = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        f86 f86Var;
        switch (this.a) {
            case 0:
                z93 z93Var = (z93) message.obj;
                try {
                    int i = message.what;
                    if (i == 1) {
                        obj = ((aa3) this.c).k.r((h54) z93Var.d);
                    } else {
                        if (i != 2) {
                            throw new RuntimeException();
                        }
                        aa3 aa3Var = (aa3) this.c;
                        lq6 q = aa3Var.k.q(aa3Var.l, (g54) z93Var.d);
                        synchronized (((aa3) this.c).o) {
                            try {
                                z24 z24Var = ((aa3) this.c).y;
                                if (z24Var != null && (f86Var = q.b) != null) {
                                    e86 a = f86Var.a();
                                    a.a = z93Var.a;
                                    a.f = SystemClock.elapsedRealtime() - z93Var.c;
                                    ((jm5) z24Var.b).c(new f86(a));
                                }
                            } finally {
                            }
                        }
                    }
                } catch (mq6 e) {
                    boolean a2 = a(message, e);
                    obj = e;
                    if (a2) {
                        return;
                    }
                } catch (Exception e2) {
                    lad.g("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                    obj = e2;
                }
                i2f i2fVar = ((aa3) this.c).i;
                long j = z93Var.a;
                i2fVar.getClass();
                synchronized (this) {
                    if (!this.b) {
                        ((aa3) this.c).n.obtainMessage(message.what, Pair.create(z93Var.d, obj)).sendToTarget();
                    }
                }
                return;
            default:
                ts6 ts6Var = (ts6) this.c;
                if (this.b) {
                    switch (message.what) {
                        case 1:
                            mv6.B(message.getData());
                            return;
                        case 2:
                            ts6Var.b((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            ts6Var.a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            return;
                        case 5:
                            return;
                        case 6:
                            return;
                        case 7:
                            mv6.B((Bundle) message.obj);
                            return;
                        case 8:
                            ts6Var.d();
                            return;
                        case 9:
                            ((Integer) message.obj).getClass();
                            return;
                        case 10:
                        default:
                            return;
                        case 11:
                            ((Boolean) message.obj).getClass();
                            return;
                        case 12:
                            ((Integer) message.obj).getClass();
                            return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y93(aa3 aa3Var, Looper looper) {
        super(looper);
        this.c = aa3Var;
    }
}
