package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.if0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                o2 o2Var = (o2) this.b;
                Long l4 = (Long) obj;
                if (!o2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        o2Var.presentFragment(ProfileActivity.o4(l4.longValue()), true);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new if0(25));
                        break;
                    }
                }
                break;
            case 2:
                r0 r0Var = (r0) this.b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                c1 c1Var = r0Var.b;
                if (!r0Var.E && tL_exportedContactToken != null) {
                    r0Var.r = tL_exportedContactToken;
                    r0Var.s = 0L;
                    String str = tL_exportedContactToken.url;
                    String str2 = r0Var.c.b;
                    if (!TextUtils.equals(c1Var.f, str2) || c1Var.h) {
                        c1Var.f = str2;
                        c1Var.h = false;
                        c1Var.I5 = null;
                        c1Var.J5 = 0;
                    }
                    if (!TextUtils.equals(c1Var.d, str)) {
                        c1Var.d = str;
                        Utilities.globalQueue.postRunnable(new h0(2, str, new t0(c1Var, str, 0)));
                    }
                    c1Var.setLinkExpires(tL_exportedContactToken.expires);
                    break;
                }
                break;
            default:
                c1 c1Var2 = (c1) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    c1Var2.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        c1Var2.q8 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                c1Var2.invalidate();
                break;
        }
    }
}
