package th;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b8;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.messenger.y20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c5 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d5 b;

    public /* synthetic */ c5(d5 d5Var, int i10) {
        this.a = i10;
        this.b = d5Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        int i10 = this.a;
        d5 d5Var = this.b;
        switch (i10) {
            case 0:
                vh.n5 n5Var = d5Var.c;
                n5Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = n5Var.c0;
                int i11 = wp.D8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                d5Var.c(tL_inputFileStoryDocument);
                break;
            default:
                y20 y20Var = (y20) obj;
                d5Var.F = y20Var;
                d5Var.E.p0 = y20Var;
                d5Var.D = y20Var.r / 1000;
                if (!y20Var.c()) {
                    if (new File(d5Var.E.p0.o).renameTo(new File(d5Var.e))) {
                        b8.G(d5Var.M.a).i0(false, 33554432, d5Var.e, false);
                        break;
                    }
                } else {
                    MediaController.B().h0(d5Var.E, false, false, false);
                    break;
                }
                break;
        }
    }
}
