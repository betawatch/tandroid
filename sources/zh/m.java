package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ff0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                x xVar = (x) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (xVar.y == null) {
                    if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents == null) {
                        xVar.F = true;
                    } else {
                        xVar.y = tL_messages_stickerSet;
                    }
                    xVar.e();
                    break;
                }
                break;
            case 1:
                m0 m0Var = (m0) this.b;
                b1 b1Var = m0Var.d;
                if (b1Var != null && !m0Var.isFinished) {
                    b1Var.W0(R.drawable.msg_download, LocaleController.getString(R.string.QrSavedToGallery), null);
                    break;
                }
                break;
            case 2:
                n2 n2Var = (n2) this.b;
                Long l4 = (Long) obj;
                if (!n2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        n2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new ff0(25));
                        break;
                    }
                }
                break;
            case 3:
                p0 p0Var = (p0) this.b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                b1 b1Var2 = p0Var.b;
                if (!p0Var.E && tL_exportedContactToken != null) {
                    p0Var.r = tL_exportedContactToken;
                    p0Var.s = 0L;
                    String str = tL_exportedContactToken.url;
                    String str2 = p0Var.c.b;
                    if (!TextUtils.equals(b1Var2.f, str2) || b1Var2.h) {
                        b1Var2.f = str2;
                        b1Var2.h = false;
                        b1Var2.m5 = null;
                        b1Var2.n5 = 0;
                    }
                    if (!TextUtils.equals(b1Var2.d, str)) {
                        b1Var2.d = str;
                        Utilities.globalQueue.postRunnable(new r0(str, new q0(b1Var2, str, 0)));
                    }
                    b1Var2.setLinkExpires(tL_exportedContactToken.expires);
                    break;
                }
                break;
            default:
                b1 b1Var3 = (b1) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    b1Var3.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        b1Var3.Z7 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                b1Var3.invalidate();
                break;
        }
    }
}
