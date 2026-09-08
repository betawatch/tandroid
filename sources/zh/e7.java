package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class e7 extends FrameLayout {
    public final org.telegram.ui.Components.q6 a;
    public final ImageView b;
    public int c;
    public boolean d;

    public e7(Context context) {
        super(context);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, false, false);
        this.a = q6Var;
        q6Var.getDrawable().o(true, true, false);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        addView(q6Var, w7.x5.i(-1.0f, -1.0f, 8388627, 22.0f, 0.0f, 58.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.arrow_more);
        addView(imageView, w7.x5.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 17.0f, 0.0f));
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
            canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
