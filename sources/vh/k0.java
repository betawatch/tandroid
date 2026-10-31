package vh;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.jj;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k0 implements us {
    public final int a;
    public final File b;
    public jj c;
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
        zs.f(i10).b(this, zs.a2);
        zs.f(i10).b(this, zs.b2);
        zs.f(i10).b(this, zs.c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.c = new jj(i10, tL_message, null, false, false);
        n5Var.s(new ph.h1(this, 21));
    }

    public final void a(boolean z10) {
        if (this.c == null) {
            return;
        }
        int i10 = this.a;
        zs.f(i10).n(this, zs.a2);
        zs.f(i10).n(this, zs.b2);
        zs.f(i10).n(this, zs.c2);
        if (z10) {
            MediaController.B().i(this.c);
        }
        this.c = null;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.a2) {
            return;
        }
        if (i10 != zs.b2) {
            if (i10 == zs.c2 && ((jj) objArr[0]) == this.c) {
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
        if (((jj) objArr[0]) == this.c) {
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
