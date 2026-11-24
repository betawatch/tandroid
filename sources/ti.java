// default package

import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ti extends FrameLayout {
    public final /* synthetic */ oh2[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(Activity activity, oh2[] oh2VarArr) {
        super(activity);
        this.a = oh2VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        oh2[] oh2VarArr = this.a;
        if (oh2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), oh2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
