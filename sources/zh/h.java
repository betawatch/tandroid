package zh;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ h(l lVar, int i7) {
        this.a = i7;
        this.b = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        l lVar = this.b;
        switch (i7) {
            case 0:
                lVar.dismiss();
                break;
            case 1:
                int value = lVar.X1.getValue();
                int e10 = (int) lVar.g2.e();
                if (value >= e10) {
                    lVar.g1(value);
                    break;
                } else {
                    org.telegram.messenger.g0.F3(lVar.V1);
                    org.telegram.messenger.camera.q.s(id.G(e10, "Gift2AuctionMinimumBidIncreased", new Object[0]), new gc(lVar.c, lVar.I0), R.raw.info, 36);
                    break;
                }
            default:
                lVar.X1.setValueAnimated((int) lVar.g2.e());
                break;
        }
    }
}
