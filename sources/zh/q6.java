package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class q6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;

    public /* synthetic */ q6(r6 r6Var, int i10) {
        this.a = i10;
        this.b = r6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                r6.c(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                r6.b(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
        }
    }
}
