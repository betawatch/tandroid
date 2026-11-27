// default package

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ow2 extends c79 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ rw2 d;

    public ow2(rw2 rw2Var, ArrayList arrayList) {
        this.d = rw2Var;
        this.c = arrayList;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override // j79
    public final int b() {
        return this.c.size();
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        qw2 qw2Var = (qw2) f89Var.a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.c.get(i);
        de0 de0Var = qw2Var.a;
        qw2Var.d = stickerSetCovered;
        boolean z = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
        ema emaVar = qw2Var.b;
        if (z) {
            emaVar.l(ob6.M0(2131748016, null), false);
            de0Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        emaVar.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            de0Var.j(null, null, null, null, null, 0);
            return;
        }
        TLRPC.PhotoSize w = xb4.w(document.thumbs, 90, false, null, false);
        ggb f = lp3.f(stickerSetCovered.cover, aob.a7, 1.0f, qw2Var.c);
        TLRPC.Document document2 = stickerSetCovered.cover;
        if (f == null) {
            de0Var.n(jn5.c(w, document2), null, "webp", null, stickerSetCovered);
        } else if (w != null) {
            de0Var.n(jn5.c(w, document2), null, "webp", f, stickerSetCovered);
        } else {
            de0Var.n(jn5.b(document2), null, "webp", f, stickerSetCovered);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        qw2 qw2Var = new qw2(viewGroup.getContext(), this.d.c0);
        qw2Var.setLayoutParams(new r79(-2, hl.L(48.0f)));
        return new n69(qw2Var);
    }
}
