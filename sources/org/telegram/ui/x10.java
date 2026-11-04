package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x10 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ x30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x10(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = x30Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.r rVar;
        x30 x30Var = this.d;
        w10 w10Var = x30Var.j1;
        if (x30Var.V3 != 1.0f) {
            if (x30Var.P4 != null && x30Var.T4) {
                canvas.save();
                float measuredHeight = (x30Var.P4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / x30Var.P4.getAvatarImageView().getMeasuredHeight());
                float f10 = (1.0f - x30Var.V3) * measuredHeight;
                float L = org.telegram.messenger.g0.L(13.0f);
                float f11 = x30Var.V3;
                int i3 = (int) ((L * f11) + f10);
                int i10 = (int) ((1.0f - f11) * measuredHeight);
                x30Var.P4.getAvatarWavesDrawable().a(canvas, x30Var.P4.getAvatarImageView().getMeasuredHeight() / 2, x30Var.P4.getAvatarImageView().getMeasuredHeight() / 2, this);
                x30Var.P4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                x30Var.P4.getAvatarImageView().t(i3, i3, i10, i10);
                x30Var.P4.getAvatarImageView().getImageReceiver().h(canvas, null);
                x30Var.P4.getAvatarImageView().setRoundRadius(x30Var.P4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (x30Var.S4 != null && x30Var.R4 == null && x30Var.G4) {
                canvas.save();
                float measuredHeight2 = (x30Var.S4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / x30Var.S4.getAvatarImageView().getMeasuredHeight());
                float f12 = (1.0f - x30Var.V3) * measuredHeight2;
                float L2 = org.telegram.messenger.g0.L(13.0f);
                float f13 = x30Var.V3;
                int i11 = (int) ((L2 * f13) + f12);
                int i12 = (int) ((1.0f - f13) * measuredHeight2);
                x30Var.S4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                x30Var.S4.getAvatarImageView().t(i11, i11, i12, i12);
                x30Var.S4.getAvatarImageView().getImageReceiver().h(canvas, null);
                x30Var.S4.getAvatarImageView().setRoundRadius(x30Var.S4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        w10Var.setAlpha(x30Var.V3);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (w10Var.j1) {
            for (int i13 = 0; i13 < w10Var.getChildCount(); i13++) {
                childAt = w10Var.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Components.tf0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (rVar = x30Var.R4) != null && rVar.w && !x30Var.x4) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            w10Var.getChildVisibleRect(childAt, rect, null);
            int i14 = rect.left;
            if (i14 < (-w10Var.getMeasuredWidth())) {
                i14 += w10Var.getMeasuredWidth() * 2;
            } else if (i14 > w10Var.getMeasuredWidth()) {
                i14 -= w10Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i14, 0.0f);
            x30Var.R4.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.d.b.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, TLObject.FLAG_30));
    }
}
