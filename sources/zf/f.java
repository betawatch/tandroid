package zf;

import android.util.LongSparseArray;
import android.view.View;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Components.k41;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                m mVar = (m) this.b;
                wp.r1(mVar.F).s.clear();
                wp.d1().edit().remove("installReferer").commit();
                mVar.f();
                break;
            case 1:
                ((r) this.b).run();
                break;
            case 2:
                ((h0) this.b).K();
                break;
            default:
                o1 o1Var = (o1) this.b;
                LongSparseArray longSparseArray = o1Var.n;
                w3 w3Var = (w3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = w3Var.getStickerSet();
                if (stickerSet != null && o1Var.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (!w3Var.r) {
                        o1Var.F(stickerSet, w3Var);
                        break;
                    } else {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        k41 k41Var = o1Var.e;
                        k41Var.a.h(w3Var.getStickerSet());
                        break;
                    }
                }
                break;
        }
    }
}
