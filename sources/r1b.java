// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r1b extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new r1b());
    }

    @Override // b6c
    public final void a(r59 r59Var, View view, c6c c6cVar) {
        s1b s1bVar = (s1b) view;
        boolean z = false;
        s1bVar.b(c6cVar != null && c6cVar.e, true);
        if ((r59Var instanceof q7c) && ((q7c) r59Var).k3) {
            z = true;
        }
        s1bVar.c(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    @Override // b6c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        int i = l7cVar.f;
        s1b s1bVar = (s1b) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) c6cVar.H;
        boolean z2 = false;
        s1bVar.d(tL_messages_stickerSet, z, false);
        s1bVar.b(c6cVar.e, false);
        s1bVar.c(q7cVar.k3);
        s1bVar.setOnOptionsClick(c6cVar.E);
        s1bVar.E.setOnClickListener(c6cVar.F);
        s1bVar.F.setOnClickListener(c6cVar.F);
        s1bVar.G.setOnClickListener(c6cVar.F);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            return;
        }
        int i2 = 1;
        boolean D0 = hs6.d0(i).D0(tL_messages_stickerSet.set.id, true);
        boolean p = z8c.h(i).p();
        boolean z3 = !p;
        if (!p) {
            for (int i3 = 0; i3 < tL_messages_stickerSet.documents.size(); i3++) {
                if (k47.m3(tL_messages_stickerSet.documents.get(i3))) {
                }
            }
            if (z2) {
                i2 = D0 ? 4 : 3;
            } else if (D0 && !tL_messages_stickerSet.set.official) {
                i2 = 2;
            }
            s1bVar.e(i2);
        }
        z2 = z3;
        if (z2) {
        }
        s1bVar.e(i2);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        s1b s1bVar = new s1b(context, 1);
        if (r59Var instanceof q7c) {
            s1bVar.setOnReorderButtonTouchListener(new f8((q7c) r59Var, s1bVar, (byte) 7));
        }
        return s1bVar;
    }
}
