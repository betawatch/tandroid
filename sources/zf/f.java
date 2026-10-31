package zf;

import android.util.LongSparseArray;
import android.view.View;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Components.j41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                vp.r1(mVar.F).s.clear();
                vp.d1().edit().remove("installReferer").commit();
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
                        j41 j41Var = o1Var.e;
                        j41Var.a.h(w3Var.getStickerSet());
                        break;
                    }
                }
                break;
        }
    }
}
