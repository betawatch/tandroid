package zh;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ i(m mVar, int i7) {
        this.a = i7;
        this.b = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        m mVar = this.b;
        switch (i7) {
            case 0:
                mVar.dismiss();
                break;
            case 1:
                int value = mVar.U1.getValue();
                int e10 = (int) mVar.d2.e();
                if (value >= e10) {
                    mVar.g1(value);
                    break;
                } else {
                    org.telegram.messenger.g0.F3(mVar.S1);
                    org.telegram.messenger.camera.q.s(hd.G(e10, "Gift2AuctionMinimumBidIncreased", new Object[0]), new hc(mVar.c, mVar.I0), R.raw.info, 36);
                    break;
                }
            default:
                mVar.U1.setValueAnimated((int) mVar.d2.e());
                break;
        }
    }
}
