package zh;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                int value = lVar.U1.getValue();
                int e10 = (int) lVar.d2.e();
                if (value >= e10) {
                    lVar.g1(value);
                    break;
                } else {
                    org.telegram.messenger.g0.F3(lVar.S1);
                    org.telegram.messenger.camera.q.s(id.G(e10, "Gift2AuctionMinimumBidIncreased", new Object[0]), new hc(lVar.c, lVar.I0), R.raw.info, 36);
                    break;
                }
            default:
                lVar.U1.setValueAnimated((int) lVar.d2.e());
                break;
        }
    }
}
