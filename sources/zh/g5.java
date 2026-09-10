package zh;

import bi.r9;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class g5 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;

    public /* synthetic */ g5(h5 h5Var, int i10) {
        this.a = i10;
        this.b = h5Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                h5 h5Var = this.b;
                r9 r9Var = h5Var.c;
                r9Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(r9Var.c0);
                h5Var.c(tL_inputFileStoryDocument);
                break;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                h5 h5Var2 = this.b;
                h5Var2.F = videoEditedInfo;
                h5Var2.E.videoEditedInfo = videoEditedInfo;
                h5Var2.y = videoEditedInfo.estimatedDuration / 1000;
                if (!videoEditedInfo.needConvert()) {
                    if (new File(h5Var2.E.videoEditedInfo.originalPath).renameTo(new File(h5Var2.e))) {
                        FileLoader.getInstance(h5Var2.M.a).uploadFile(h5Var2.e, false, false, 33554432);
                        break;
                    }
                } else {
                    MediaController.getInstance().scheduleVideoConvert(h5Var2.E, false, false, false);
                    break;
                }
                break;
        }
    }
}
