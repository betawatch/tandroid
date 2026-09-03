package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class z30 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ d60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z30(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = d60Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.u uVar;
        d60 d60Var = this.d;
        y30 y30Var = d60Var.b;
        if (d60Var.a2 != 1.0f) {
            if (d60Var.U2 != null && d60Var.Y2) {
                canvas.save();
                float measuredHeight = (d60Var.U2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / d60Var.U2.getAvatarImageView().getMeasuredHeight());
                float f10 = (1.0f - d60Var.a2) * measuredHeight;
                float dp = AndroidUtilities.dp(13.0f);
                float f11 = d60Var.a2;
                int i10 = (int) ((dp * f11) + f10);
                int i11 = (int) ((1.0f - f11) * measuredHeight);
                d60Var.U2.getAvatarWavesDrawable().a(canvas, d60Var.U2.getAvatarImageView().getMeasuredHeight() / 2, d60Var.U2.getAvatarImageView().getMeasuredHeight() / 2, this);
                d60Var.U2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                d60Var.U2.getAvatarImageView().r(i10, i10, i11, i11);
                d60Var.U2.getAvatarImageView().getImageReceiver().draw(canvas);
                d60Var.U2.getAvatarImageView().setRoundRadius(d60Var.U2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (d60Var.X2 != null && d60Var.W2 == null && d60Var.L2) {
                canvas.save();
                float measuredHeight2 = (d60Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / d60Var.X2.getAvatarImageView().getMeasuredHeight());
                float f12 = (1.0f - d60Var.a2) * measuredHeight2;
                float dp2 = AndroidUtilities.dp(13.0f);
                float f13 = d60Var.a2;
                int i12 = (int) ((dp2 * f13) + f12);
                int i13 = (int) ((1.0f - f13) * measuredHeight2);
                d60Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                d60Var.X2.getAvatarImageView().r(i12, i12, i13, i13);
                d60Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                d60Var.X2.getAvatarImageView().setRoundRadius(d60Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        y30Var.setAlpha(d60Var.a2);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (y30Var.f1) {
            for (int i14 = 0; i14 < y30Var.getChildCount(); i14++) {
                childAt = y30Var.getChildAt(i14);
                if (childAt instanceof org.telegram.ui.Components.uh0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (uVar = d60Var.W2) != null && uVar.v && !d60Var.C2) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            y30Var.getChildVisibleRect(childAt, rect, null);
            int i15 = rect.left;
            if (i15 < (-y30Var.getMeasuredWidth())) {
                i15 += y30Var.getMeasuredWidth() * 2;
            } else if (i15 > y30Var.getMeasuredWidth()) {
                i15 -= y30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i15, 0.0f);
            d60Var.W2.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.d).containerView;
        viewGroup.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, TLObject.FLAG_30));
    }
}
