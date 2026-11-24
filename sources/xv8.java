// default package

import android.os.SystemClock;
import org.telegram.tgnet.RequestTimeDelegate;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xv8 implements RequestTimeDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fda b;

    public /* synthetic */ xv8(fda fdaVar, byte b) {
        this.a = b;
        this.b = fdaVar;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public final void run(final long j) {
        byte b = this.a;
        final fda fdaVar = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                gm.c3(new Runnable() { // from class: yv8
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        long j2 = j;
                        fda fdaVar2 = fdaVar;
                        switch (b3) {
                            case 0:
                                fdaVar2.e = SystemClock.elapsedRealtime();
                                fdaVar2.c = false;
                                if (j2 == -1) {
                                    fdaVar2.d = false;
                                    fdaVar2.b = 0L;
                                } else {
                                    fdaVar2.b = j2;
                                    fdaVar2.d = true;
                                }
                                nm7.e().k(nm7.F4, fdaVar2);
                                break;
                            default:
                                fdaVar2.e = SystemClock.elapsedRealtime();
                                fdaVar2.c = false;
                                if (j2 == -1) {
                                    fdaVar2.d = false;
                                    fdaVar2.b = 0L;
                                } else {
                                    fdaVar2.b = j2;
                                    fdaVar2.d = true;
                                }
                                nm7.e().k(nm7.F4, fdaVar2);
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 1;
                gm.c3(new Runnable() { // from class: yv8
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        long j2 = j;
                        fda fdaVar2 = fdaVar;
                        switch (b32) {
                            case 0:
                                fdaVar2.e = SystemClock.elapsedRealtime();
                                fdaVar2.c = false;
                                if (j2 == -1) {
                                    fdaVar2.d = false;
                                    fdaVar2.b = 0L;
                                } else {
                                    fdaVar2.b = j2;
                                    fdaVar2.d = true;
                                }
                                nm7.e().k(nm7.F4, fdaVar2);
                                break;
                            default:
                                fdaVar2.e = SystemClock.elapsedRealtime();
                                fdaVar2.c = false;
                                if (j2 == -1) {
                                    fdaVar2.d = false;
                                    fdaVar2.b = 0L;
                                } else {
                                    fdaVar2.b = j2;
                                    fdaVar2.d = true;
                                }
                                nm7.e().k(nm7.F4, fdaVar2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
