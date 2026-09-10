package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class o5 extends View {
    public final y2 a;
    public boolean b;
    public final org.telegram.ui.Components.d6 c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.p5 f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;

    public o5(Context context, y2 y2Var) {
        super(context);
        this.c = new org.telegram.ui.Components.d6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.a = y2Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.e.onAttachedToWindow();
        this.s = true;
        org.telegram.ui.Components.p5 p5Var = this.f;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        this.s = false;
        org.telegram.ui.Components.p5 p5Var = this.f;
        if (p5Var != null) {
            p5Var.o(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        if (this.n) {
            float d = this.c.d(this.b ? 1.0f : 0.0f, false);
            y2 y2Var = this.a;
            if (d < 1.0f) {
                Drawable drawable = y2Var.o;
                Drawable drawable2 = y2Var.o;
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                drawable2.setAlpha(255);
                drawable2.draw(canvas);
            }
            if (d > 0.0f) {
                Drawable drawable3 = y2Var.p;
                Drawable drawable4 = y2Var.p;
                drawable3.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                drawable4.setAlpha((int) (d * 255.0f));
                drawable4.draw(canvas);
                return;
            }
            return;
        }
        if (!this.h) {
            return;
        }
        org.telegram.ui.Components.p5 p5Var = this.f;
        ImageReceiver imageReceiver = this.d;
        ImageReceiver imageReceiver2 = p5Var != null ? p5Var.k : imageReceiver;
        if (this.r) {
            ImageReceiver imageReceiver3 = this.e;
            if (imageReceiver3.getBitmap() != null) {
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                float f7 = measuredWidth / 2.0f;
                float f10 = measuredWidth * 2;
                imageReceiver3.setImageCoords(getPaddingLeft() - f7, getPaddingTop() - f7, f10, f10);
                if (imageReceiver3.getLottieAnimation() != null && imageReceiver3.getLottieAnimation().A()) {
                    this.r = false;
                    imageReceiver.setCrossfadeAlpha((byte) 0);
                }
                imageReceiver2 = imageReceiver3;
                if (imageReceiver2 == null) {
                    imageReceiver2.draw(canvas);
                    return;
                }
                return;
            }
        }
        if (imageReceiver2 != null) {
            imageReceiver2.setImageCoords(getPaddingLeft(), getPaddingTop(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        }
        if (imageReceiver2 == null) {
        }
    }

    public void setAllowDrawReaction(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setReaction(yg.p0 p0Var) {
        String str;
        String str2;
        this.n = p0Var == null || ((str2 = p0Var.f) != null && str2.equals("❤"));
        if (p0Var == null || (str = p0Var.f) == null || !str.equals("❤")) {
            this.b = false;
        } else {
            this.b = true;
        }
        org.telegram.ui.Components.p5 p5Var = this.f;
        if (p5Var != null) {
            p5Var.o(this);
        }
        this.f = null;
        if (p0Var != null) {
            if (p0Var.g != 0) {
                org.telegram.ui.Components.p5 p5Var2 = new org.telegram.ui.Components.p5(3, UserConfig.selectedAccount, p0Var.g);
                this.f = p5Var2;
                if (this.s) {
                    p5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(p0Var.f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.j6.a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
