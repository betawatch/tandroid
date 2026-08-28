package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vo0 extends Drawable {
    public static final /* synthetic */ int j = 0;
    public float a = AndroidUtilities.dpf2(10.6665f);
    public final boolean b;
    public Paint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path g;
    public final Path h;
    public final org.telegram.ui.Components.i5 i;

    public vo0(int i9, int i10, int i11) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f = paint3;
        this.g = new Path();
        this.h = new Path();
        this.b = i11 != i9;
        paint.setColor(i9);
        paint2.setColor(i10);
        paint3.setColor(i11);
        this.i = null;
        d();
    }

    public static vo0 a(int i9, int i10) {
        if (i10 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.f6.r8;
            return new vo0(org.telegram.ui.ActionBar.f6.w0(null, iArr[i10], false), org.telegram.ui.ActionBar.f6.w0(null, iArr[i10], false), org.telegram.ui.ActionBar.f6.w0(null, iArr[i10], false));
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(i9).peerColors;
        return b(peerColors != null ? peerColors.getColor(i10) : null, false);
    }

    public static vo0 b(MessagesController.PeerColor peerColor, boolean z10) {
        if (peerColor == null) {
            return new vo0(0, 0, 0);
        }
        return new vo0(peerColor.getColor1(), (!z10 || peerColor.hasColor6(org.telegram.ui.ActionBar.f6.I.q())) ? peerColor.getColor2() : peerColor.getColor1(), z10 ? peerColor.getColor1() : peerColor.getColor3());
    }

    public static vo0 c(int i9, int i10) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(i9).profilePeerColors;
        return b(peerColors == null ? null : peerColors.getColor(i10), true);
    }

    public final void d() {
        Path path = this.h;
        path.rewind();
        float f10 = this.a;
        path.addCircle(f10, f10, f10, Path.Direction.CW);
        Path path2 = this.g;
        path2.rewind();
        path2.moveTo(this.a * 2.0f, 0.0f);
        float f11 = this.a;
        path2.lineTo(f11 * 2.0f, f11 * 2.0f);
        path2.lineTo(0.0f, this.a * 2.0f);
        path2.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.a, getBounds().centerY() - this.a);
        Paint paint = this.c;
        if (paint != null) {
            float f10 = this.a;
            canvas.drawCircle(f10, f10, f10, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.g, this.e);
        if (this.b) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.a - AndroidUtilities.dp(3.66f), this.a - AndroidUtilities.dp(3.66f), this.a + AndroidUtilities.dp(3.66f), this.a + AndroidUtilities.dp(3.66f));
            float f11 = this.a;
            canvas.rotate(45.0f, f11, f11);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.f);
        }
        canvas.restore();
        org.telegram.ui.Components.i5 i5Var = this.i;
        if (i5Var != null) {
            int dp = AndroidUtilities.dp(14.0f) / 2;
            i5Var.setBounds(getBounds().centerX() - dp, getBounds().centerY() - dp, getBounds().centerX() + dp, getBounds().centerY() + dp);
            i5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.i5 i5Var = this.i;
        if (view != null) {
            if (i5Var != null) {
                i5Var.l(view);
            }
            view.addOnAttachStateChangeListener(new e5(this, 3));
        } else if (i5Var != null) {
            i5Var.b();
            i5Var.l(null);
        }
    }

    public final void f(float f10, int i9) {
        if (this.c == null) {
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.c.setStrokeWidth(f10);
        this.c.setColor(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) (this.a * 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (this.a * 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public vo0(long j10, int i9, int i10, int i11) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f = paint3;
        this.g = new Path();
        this.h = new Path();
        this.b = i11 != i9;
        paint.setColor(i9);
        paint2.setColor(i10);
        paint3.setColor(i11);
        d();
        org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(14.0f), null);
        this.i = i5Var;
        i5Var.j(j10, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
