package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z91 extends View {
    public ImageReceiver a;
    public ImageReceiver b;
    public View c;
    public org.telegram.ui.Components.ge0 d;
    public Path e;
    public Drawable f;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int dp = measuredWidth - AndroidUtilities.dp(46.0f);
        int dp2 = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(dp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.b.setImageCoords(dp2 - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f;
        drawable.setBounds(org.telegram.messenger.rl.v(2, measuredWidth, drawable), org.telegram.messenger.rl.e(2, measuredHeight, drawable), org.telegram.messenger.rl.A(2, measuredWidth, drawable), org.telegram.messenger.rl.y(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.e;
        path.reset();
        path.addCircle(dp2, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.c != null) {
            float dp3 = AndroidUtilities.dp(60.0f);
            CropAreaView cropAreaView = this.d.b.a;
            float f10 = dp3 / cropAreaView.a;
            float top = (0.0f - this.d.getTop()) - cropAreaView.c;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(f10, f10, 0.0f, 0.0f);
            canvas.translate(left, top);
            canvas.translate((dp2 - AndroidUtilities.dp(30.0f)) / f10, (measuredHeight - AndroidUtilities.dp(30.0f)) / f10);
            PhotoViewer.t1().c4 = true;
            this.c.draw(canvas);
            PhotoViewer.t1().c4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.c.invalidate();
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.onAttachedToWindow();
        this.b.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.onDetachedFromWindow();
        this.b.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), TLObject.FLAG_30));
    }
}
