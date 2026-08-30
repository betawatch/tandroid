package ph;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class k0 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final File b;
    public MessageObject c;
    public final i0 d;
    public final j0 e;
    public final h0 f;

    public k0(int i10, u6 u6Var, File file, i0 i0Var, j0 j0Var, h0 h0Var) {
        this.a = i10;
        this.b = file;
        this.d = i0Var;
        this.e = j0Var;
        this.f = h0Var;
        if (this.c != null) {
            return;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.c = new MessageObject(i10, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        u6Var.s(new org.telegram.ui.web.y0(this, 5));
    }

    public final void a(boolean z4) {
        if (this.c == null) {
            return;
        }
        int i10 = this.a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        if (z4) {
            MediaController.getInstance().cancelVideoConvert(this.c);
        }
        this.c = null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            return;
        }
        if (i10 != NotificationCenter.fileNewChunkAvailable) {
            if (i10 == NotificationCenter.filePreparingFailed && ((MessageObject) objArr[0]) == this.c) {
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
        if (((MessageObject) objArr[0]) == this.c) {
            ((Long) objArr[2]).getClass();
            long longValue = ((Long) objArr[3]).longValue();
            Float f10 = (Float) objArr[4];
            f10.getClass();
            this.e.run(f10);
            if (longValue > 0) {
                this.d.run();
                VideoEncodingService.stop();
                a(false);
            }
        }
    }
}
