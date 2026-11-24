// default package

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ru2 extends xib {
    public final /* synthetic */ byte a0 = 1;
    public final /* synthetic */ Object b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru2(tu2 tu2Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.b0 = tu2Var;
    }

    @Override // xib, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.a0;
        Object obj = this.b0;
        switch (b) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                int L = gm.L(21.0f);
                tu2 tu2Var = (tu2) obj;
                int measuredHeight = (getMeasuredHeight() - tu2Var.V.getMeasuredHeight()) / 2;
                bf0 bf0Var = tu2Var.V;
                bf0Var.layout(L, measuredHeight, bf0Var.getMeasuredWidth() + L, tu2Var.V.getMeasuredHeight() + measuredHeight);
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                int L2 = gm.L(21.0f);
                int measuredHeight2 = getMeasuredHeight();
                PrivacyControlActivity privacyControlActivity = ((bm8) obj).d;
                int measuredHeight3 = (measuredHeight2 - privacyControlActivity.x0.getMeasuredHeight()) / 2;
                bf0 bf0Var2 = privacyControlActivity.x0;
                bf0Var2.layout(L2, measuredHeight3, bf0Var2.getMeasuredWidth() + L2, privacyControlActivity.x0.getMeasuredHeight() + measuredHeight3);
                break;
        }
    }

    @Override // xib, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.a0;
        Object obj = this.b0;
        switch (b) {
            case 0:
                super.onMeasure(i, i2);
                tu2 tu2Var = (tu2) obj;
                tu2Var.V.measure(View.MeasureSpec.makeMeasureSpec(gm.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(30.0f), TLObject.FLAG_30));
                tu2Var.V.setRoundRadius(gm.L(30.0f));
                break;
            default:
                super.onMeasure(i, i2);
                PrivacyControlActivity privacyControlActivity = ((bm8) obj).d;
                privacyControlActivity.x0.measure(View.MeasureSpec.makeMeasureSpec(gm.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(30.0f), TLObject.FLAG_30));
                privacyControlActivity.x0.setRoundRadius(gm.L(30.0f));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru2(bm8 bm8Var, Activity activity) {
        super(activity);
        this.b0 = bm8Var;
    }
}
