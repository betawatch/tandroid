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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                t0 t0Var = f0Var.d;
                if (t0Var != null && !f0Var.isFinished) {
                    t0Var.c1(R.drawable.msg_download, LocaleController.getString(R.string.QrSavedToGallery), null);
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
                        AndroidUtilities.runOnUIThread(new ff0(24));
                        break;
                    }
                }
                break;
            case 3:
                i0 i0Var = (i0) this.b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                t0 t0Var2 = i0Var.b;
                if (!i0Var.E && tL_exportedContactToken != null) {
                    i0Var.r = tL_exportedContactToken;
                    i0Var.s = 0L;
                    String str = tL_exportedContactToken.url;
                    String str2 = i0Var.c.b;
                    if (!TextUtils.equals(t0Var2.f, str2) || t0Var2.h) {
                        t0Var2.f = str2;
                        t0Var2.h = false;
                        t0Var2.I5 = null;
                        t0Var2.J5 = 0;
                    }
                    if (!TextUtils.equals(t0Var2.d, str)) {
                        t0Var2.d = str;
                        Utilities.globalQueue.postRunnable(new uf.c(29, str, new j0(t0Var2, str, 0)));
                    }
                    t0Var2.setLinkExpires(tL_exportedContactToken.expires);
                    break;
                }
                break;
            default:
                t0 t0Var3 = (t0) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    t0Var3.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        t0Var3.q8 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                t0Var3.invalidate();
                break;
        }
    }
}
