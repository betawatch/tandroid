// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qza extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new qza());
    }

    @Override // b4c
    public final void a(o39 o39Var, View view, c4c c4cVar) {
        rza rzaVar = (rza) view;
        boolean z = false;
        rzaVar.b(c4cVar != null && c4cVar.e, true);
        if ((o39Var instanceof q5c) && ((q5c) o39Var).k3) {
            z = true;
        }
        rzaVar.c(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    @Override // b4c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        int i = l5cVar.f;
        rza rzaVar = (rza) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) c4cVar.H;
        boolean z2 = false;
        rzaVar.d(tL_messages_stickerSet, z, false);
        rzaVar.b(c4cVar.e, false);
        rzaVar.c(q5cVar.k3);
        rzaVar.setOnOptionsClick(c4cVar.E);
        rzaVar.E.setOnClickListener(c4cVar.F);
        rzaVar.F.setOnClickListener(c4cVar.F);
        rzaVar.G.setOnClickListener(c4cVar.F);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            return;
        }
        int i2 = 1;
        boolean D0 = hq6.d0(i).D0(tL_messages_stickerSet.set.id, true);
        boolean p = y6c.h(i).p();
        boolean z3 = !p;
        if (!p) {
            for (int i3 = 0; i3 < tL_messages_stickerSet.documents.size(); i3++) {
                if (k27.m3(tL_messages_stickerSet.documents.get(i3))) {
                }
            }
            if (z2) {
                i2 = D0 ? 4 : 3;
            } else if (D0 && !tL_messages_stickerSet.set.official) {
                i2 = 2;
            }
            rzaVar.e(i2);
        }
        z2 = z3;
        if (z2) {
        }
        rzaVar.e(i2);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        rza rzaVar = new rza(context, 1);
        if (o39Var instanceof q5c) {
            rzaVar.setOnReorderButtonTouchListener(new f8((q5c) o39Var, rzaVar, (byte) 7));
        }
        return rzaVar;
    }
}
