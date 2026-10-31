package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r7 extends FrameLayout {
    public final org.telegram.ui.Components.f6 a;
    public final ImageView b;
    public int c;
    public boolean d;

    public r7(Context context) {
        super(context);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
        this.a = f6Var;
        f6Var.getDrawable().r(true, true);
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        addView(f6Var, w7.b6.i(-1.0f, -1.0f, 8388627, 22.0f, 0.0f, 58.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.arrow_more);
        addView(imageView, w7.b6.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c = ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.d) {
            canvas.drawRect(cd.X ? 0.0f : org.telegram.messenger.i0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? org.telegram.messenger.i0.L(22.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
    }
}
