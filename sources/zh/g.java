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
import org.telegram.ui.mj0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                r rVar = (r) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (rVar.y == null) {
                    if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents == null) {
                        rVar.F = true;
                    } else {
                        rVar.y = tL_messages_stickerSet;
                    }
                    rVar.e();
                    break;
                }
                break;
            case 1:
                f0 f0Var = (f0) this.b;
                u0 u0Var = f0Var.d;
                if (u0Var != null && !f0Var.isFinished) {
                    u0Var.d1(R.drawable.msg_download, LocaleController.getString(R.string.QrSavedToGallery), null);
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
                        AndroidUtilities.runOnUIThread(new mj0(24));
                        break;
                    }
                }
                break;
            case 3:
                i0 i0Var = (i0) this.b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                u0 u0Var2 = i0Var.b;
                if (!i0Var.E && tL_exportedContactToken != null) {
                    i0Var.r = tL_exportedContactToken;
                    i0Var.s = 0L;
                    String str = tL_exportedContactToken.url;
                    String str2 = i0Var.c.b;
                    if (!TextUtils.equals(u0Var2.f, str2) || u0Var2.h) {
                        u0Var2.f = str2;
                        u0Var2.h = false;
                        u0Var2.I5 = null;
                        u0Var2.J5 = 0;
                    }
                    if (!TextUtils.equals(u0Var2.d, str)) {
                        u0Var2.d = str;
                        Utilities.globalQueue.postRunnable(new l0(str, new k0(u0Var2, str, 0)));
                    }
                    u0Var2.setLinkExpires(tL_exportedContactToken.expires);
                    break;
                }
                break;
            default:
                u0 u0Var3 = (u0) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    u0Var3.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        u0Var3.q8 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                u0Var3.invalidate();
                break;
        }
    }
}
