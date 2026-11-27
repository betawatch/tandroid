// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class p3b extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new p3b());
    }

    @Override // a8c
    public final void a(d79 d79Var, View view, b8c b8cVar) {
        q3b q3bVar = (q3b) view;
        boolean z = false;
        q3bVar.b(b8cVar != null && b8cVar.e, true);
        if ((d79Var instanceof q9c) && ((q9c) d79Var).k3) {
            z = true;
        }
        q3bVar.c(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    @Override // a8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        int i = l9cVar.f;
        q3b q3bVar = (q3b) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) b8cVar.H;
        boolean z2 = false;
        q3bVar.d(tL_messages_stickerSet, z, false);
        q3bVar.b(b8cVar.e, false);
        q3bVar.c(q9cVar.k3);
        q3bVar.setOnOptionsClick(b8cVar.E);
        q3bVar.E.setOnClickListener(b8cVar.F);
        q3bVar.F.setOnClickListener(b8cVar.F);
        q3bVar.G.setOnClickListener(b8cVar.F);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            return;
        }
        int i2 = 1;
        boolean D0 = ls6.d0(i).D0(tL_messages_stickerSet.set.id, true);
        boolean p = yac.h(i).p();
        boolean z3 = !p;
        if (!p) {
            for (int i3 = 0; i3 < tL_messages_stickerSet.documents.size(); i3++) {
                if (r47.m3(tL_messages_stickerSet.documents.get(i3))) {
                }
            }
            if (z2) {
                i2 = D0 ? 4 : 3;
            } else if (D0 && !tL_messages_stickerSet.set.official) {
                i2 = 2;
            }
            q3bVar.e(i2);
        }
        z2 = z3;
        if (z2) {
        }
        q3bVar.e(i2);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        q3b q3bVar = new q3b(context, 1);
        if (d79Var instanceof q9c) {
            q3bVar.setOnReorderButtonTouchListener(new g8((q9c) d79Var, q3bVar, (byte) 7));
        }
        return q3bVar;
    }
}
