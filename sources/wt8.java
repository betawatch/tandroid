// default package

import android.os.SystemClock;
import org.telegram.tgnet.RequestTimeDelegate;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wt8 implements RequestTimeDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fba b;

    public /* synthetic */ wt8(fba fbaVar, byte b) {
        this.a = b;
        this.b = fbaVar;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public final void run(final long j) {
        byte b = this.a;
        final fba fbaVar = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                gl.c3(new Runnable() { // from class: xt8
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        long j2 = j;
                        fba fbaVar2 = fbaVar;
                        switch (b3) {
                            case 0:
                                fbaVar2.e = SystemClock.elapsedRealtime();
                                fbaVar2.c = false;
                                if (j2 == -1) {
                                    fbaVar2.d = false;
                                    fbaVar2.b = 0L;
                                } else {
                                    fbaVar2.b = j2;
                                    fbaVar2.d = true;
                                }
                                kk7.e().k(kk7.D4, fbaVar2);
                                break;
                            default:
                                fbaVar2.e = SystemClock.elapsedRealtime();
                                fbaVar2.c = false;
                                if (j2 == -1) {
                                    fbaVar2.d = false;
                                    fbaVar2.b = 0L;
                                } else {
                                    fbaVar2.b = j2;
                                    fbaVar2.d = true;
                                }
                                kk7.e().k(kk7.D4, fbaVar2);
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 1;
                gl.c3(new Runnable() { // from class: xt8
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        long j2 = j;
                        fba fbaVar2 = fbaVar;
                        switch (b32) {
                            case 0:
                                fbaVar2.e = SystemClock.elapsedRealtime();
                                fbaVar2.c = false;
                                if (j2 == -1) {
                                    fbaVar2.d = false;
                                    fbaVar2.b = 0L;
                                } else {
                                    fbaVar2.b = j2;
                                    fbaVar2.d = true;
                                }
                                kk7.e().k(kk7.D4, fbaVar2);
                                break;
                            default:
                                fbaVar2.e = SystemClock.elapsedRealtime();
                                fbaVar2.c = false;
                                if (j2 == -1) {
                                    fbaVar2.d = false;
                                    fbaVar2.b = 0L;
                                } else {
                                    fbaVar2.b = j2;
                                    fbaVar2.d = true;
                                }
                                kk7.e().k(kk7.D4, fbaVar2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
