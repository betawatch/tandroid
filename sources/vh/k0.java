package vh;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.at;
import org.telegram.messenger.kj;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class k0 implements vs {
    public final int a;
    public final File b;
    public kj c;
    public final i0 d;
    public final j0 e;
    public final h0 f;

    public k0(int i10, n5 n5Var, File file, i0 i0Var, j0 j0Var, h0 h0Var) {
        this.a = i10;
        this.b = file;
        this.d = i0Var;
        this.e = j0Var;
        this.f = h0Var;
        if (this.c != null) {
            return;
        }
        at.f(i10).b(this, at.a2);
        at.f(i10).b(this, at.b2);
        at.f(i10).b(this, at.c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.c = new kj(i10, tL_message, null, false, false);
        n5Var.s(new ph.h1(this, 21));
    }

    public final void a(boolean z10) {
        if (this.c == null) {
            return;
        }
        int i10 = this.a;
        at.f(i10).n(this, at.a2);
        at.f(i10).n(this, at.b2);
        at.f(i10).n(this, at.c2);
        if (z10) {
            MediaController.B().i(this.c);
        }
        this.c = null;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.a2) {
            return;
        }
        if (i10 != at.b2) {
            if (i10 == at.c2 && ((kj) objArr[0]) == this.c) {
                a(false);
                try {
                    File file = this.b;
                    if (file != null) {
                        file.delete();
                    }
                } catch (Exception unused) {
                }
                this.f.run();
                return;
            }
            return;
        }
        if (((kj) objArr[0]) == this.c) {
            ((Long) objArr[2]).getClass();
            long longValue = ((Long) objArr[3]).longValue();
            Float f7 = (Float) objArr[4];
            f7.getClass();
            this.e.a(f7);
            if (longValue > 0) {
                this.d.run();
                VideoEncodingService videoEncodingService = VideoEncodingService.e;
                if (videoEncodingService != null) {
                    videoEncodingService.stopSelf();
                }
                a(false);
            }
        }
    }
}
