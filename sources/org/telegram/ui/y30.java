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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class y30 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ c60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(c60 c60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = c60Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.t tVar;
        c60 c60Var = this.d;
        x30 x30Var = c60Var.b;
        if (c60Var.a2 != 1.0f) {
            if (c60Var.U2 != null && c60Var.Y2) {
                canvas.save();
                float measuredHeight = (c60Var.U2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / c60Var.U2.getAvatarImageView().getMeasuredHeight());
                float f10 = (1.0f - c60Var.a2) * measuredHeight;
                float dp = AndroidUtilities.dp(13.0f);
                float f11 = c60Var.a2;
                int i10 = (int) ((dp * f11) + f10);
                int i11 = (int) ((1.0f - f11) * measuredHeight);
                c60Var.U2.getAvatarWavesDrawable().a(canvas, c60Var.U2.getAvatarImageView().getMeasuredHeight() / 2, c60Var.U2.getAvatarImageView().getMeasuredHeight() / 2, this);
                c60Var.U2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                c60Var.U2.getAvatarImageView().r(i10, i10, i11, i11);
                c60Var.U2.getAvatarImageView().getImageReceiver().draw(canvas);
                c60Var.U2.getAvatarImageView().setRoundRadius(c60Var.U2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (c60Var.X2 != null && c60Var.W2 == null && c60Var.L2) {
                canvas.save();
                float measuredHeight2 = (c60Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / c60Var.X2.getAvatarImageView().getMeasuredHeight());
                float f12 = (1.0f - c60Var.a2) * measuredHeight2;
                float dp2 = AndroidUtilities.dp(13.0f);
                float f13 = c60Var.a2;
                int i12 = (int) ((dp2 * f13) + f12);
                int i13 = (int) ((1.0f - f13) * measuredHeight2);
                c60Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                c60Var.X2.getAvatarImageView().r(i12, i12, i13, i13);
                c60Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                c60Var.X2.getAvatarImageView().setRoundRadius(c60Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        x30Var.setAlpha(c60Var.a2);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (x30Var.f1) {
            for (int i14 = 0; i14 < x30Var.getChildCount(); i14++) {
                childAt = x30Var.getChildAt(i14);
                if (childAt instanceof org.telegram.ui.Components.sh0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (tVar = c60Var.W2) != null && tVar.v && !c60Var.C2) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            x30Var.getChildVisibleRect(childAt, rect, null);
            int i15 = rect.left;
            if (i15 < (-x30Var.getMeasuredWidth())) {
                i15 += x30Var.getMeasuredWidth() * 2;
            } else if (i15 > x30Var.getMeasuredWidth()) {
                i15 -= x30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i15, 0.0f);
            c60Var.W2.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.d).containerView;
        viewGroup.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, TLObject.FLAG_30));
    }
}
