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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ra3 extends Handler {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra3(yu6 yu6Var, Looper looper) {
        super(looper);
        this.c = yu6Var;
        this.b = false;
    }

    public final boolean a(Message message, qs6 qs6Var) {
        long min;
        sa3 sa3Var = (sa3) message.obj;
        if (sa3Var.b) {
            int i = sa3Var.e + 1;
            sa3Var.e = i;
            ((ta3) this.c).i.getClass();
            if (i <= 3) {
                ia6 ia6Var = new ia6(sa3Var.a, qs6Var.a, SystemClock.elapsedRealtime());
                ia6Var.d = qs6Var.b;
                ia6Var.e = qs6Var.c;
                ia6Var.f = SystemClock.elapsedRealtime() - sa3Var.c;
                ia6Var.g = qs6Var.d;
                ja6 ja6Var = new ja6(ia6Var);
                z6f z6fVar = ((ta3) this.c).i;
                int i2 = sa3Var.e;
                z6fVar.getClass();
                for (Throwable wk2Var = qs6Var.getCause() instanceof IOException ? (IOException) qs6Var.getCause() : new wk2(qs6Var.getCause()); wk2Var != null; wk2Var = wk2Var.getCause()) {
                    if ((wk2Var instanceof hy7) || (wk2Var instanceof FileNotFoundException) || (wk2Var instanceof ki5) || (wk2Var instanceof qa6) || ((wk2Var instanceof k73) && ((k73) wk2Var).a == 2008)) {
                        min = -9223372036854775807L;
                        break;
                    }
                }
                min = Math.min((i2 - 1) * 1000, 5000);
                if (min != -9223372036854775807L) {
                    synchronized (((ta3) this.c).o) {
                        xh4 xh4Var = ((ta3) this.c).y;
                        if (xh4Var != null) {
                            ((mo5) xh4Var.b).c(ja6Var);
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
        ja6 ja6Var;
        switch (this.a) {
            case 0:
                sa3 sa3Var = (sa3) message.obj;
                try {
                    int i = message.what;
                    if (i == 1) {
                        obj = ((ta3) this.c).k.p((c64) sa3Var.d);
                    } else {
                        if (i != 2) {
                            throw new RuntimeException();
                        }
                        ta3 ta3Var = (ta3) this.c;
                        ps6 o = ta3Var.k.o(ta3Var.l, (b64) sa3Var.d);
                        synchronized (((ta3) this.c).o) {
                            try {
                                xh4 xh4Var = ((ta3) this.c).y;
                                if (xh4Var != null && (ja6Var = o.b) != null) {
                                    ia6 a = ja6Var.a();
                                    a.a = sa3Var.a;
                                    a.f = SystemClock.elapsedRealtime() - sa3Var.c;
                                    ((mo5) xh4Var.b).c(new ja6(a));
                                }
                            } finally {
                            }
                        }
                    }
                } catch (qs6 e) {
                    boolean a2 = a(message, e);
                    obj = e;
                    if (a2) {
                        return;
                    }
                } catch (Exception e2) {
                    efd.g("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                    obj = e2;
                }
                z6f z6fVar = ((ta3) this.c).i;
                long j = sa3Var.a;
                z6fVar.getClass();
                synchronized (this) {
                    if (!this.b) {
                        ((ta3) this.c).n.obtainMessage(message.what, Pair.create(sa3Var.d, obj)).sendToTarget();
                    }
                }
                return;
            default:
                yu6 yu6Var = (yu6) this.c;
                if (this.b) {
                    switch (message.what) {
                        case 1:
                            rx6.D(message.getData());
                            return;
                        case 2:
                            yu6Var.b((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            yu6Var.a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            return;
                        case 5:
                            return;
                        case 6:
                            return;
                        case 7:
                            rx6.D((Bundle) message.obj);
                            return;
                        case 8:
                            yu6Var.d();
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
    public ra3(ta3 ta3Var, Looper looper) {
        super(looper);
        this.c = ta3Var;
    }
}
