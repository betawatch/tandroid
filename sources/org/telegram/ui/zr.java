package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class zr extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.qw0 I;
    public static final org.telegram.ui.Components.qw0 J;
    public static final org.telegram.ui.Components.qw0 K;
    public static final org.telegram.ui.Components.qw0 L;
    public Canvas E;
    public ValueAnimator F;
    public ValueAnimator G;
    public boolean H;
    public float b;
    public float c;
    public float d;
    public float e;
    public o1.j f;
    public o1.j h;
    public o1.j n;
    public o1.j r;
    public boolean s;
    public float v;
    public float w;
    public boolean x;
    public Bitmap y;

    static {
        org.telegram.ui.Components.qw0 qw0Var = new org.telegram.ui.Components.qw0(new cg(4), new cg(5));
        qw0Var.c = 100.0f;
        I = qw0Var;
        org.telegram.ui.Components.qw0 qw0Var2 = new org.telegram.ui.Components.qw0(new cg(6), new cg(7));
        qw0Var2.c = 100.0f;
        J = qw0Var2;
        org.telegram.ui.Components.qw0 qw0Var3 = new org.telegram.ui.Components.qw0(new cg(8), new cg(9));
        qw0Var3.c = 100.0f;
        K = qw0Var3;
        org.telegram.ui.Components.qw0 qw0Var4 = new org.telegram.ui.Components.qw0(new cg(10), new cg(11));
        qw0Var4.c = 100.0f;
        L = qw0Var4;
    }

    public static void k(o1.j jVar, float f7) {
        o1.k kVar = jVar.u;
        if (kVar == null || f7 != ((float) kVar.i)) {
            jVar.c();
            o1.k kVar2 = new o1.k(f7);
            kVar2.b(400.0f);
            kVar2.a(1.0f);
            kVar2.i = f7;
            jVar.u = kVar2;
            jVar.h();
        }
    }

    public float getErrorProgress() {
        return this.c;
    }

    public float getFocusedProgress() {
        return this.b;
    }

    public float getSuccessProgress() {
        return this.d;
    }

    public float getSuccessScaleProgress() {
        return this.e;
    }

    public final void i(float f7) {
        k(this.h, f7 * 100.0f);
    }

    public final void j(float f7) {
        k(this.f, f7 * 100.0f);
    }

    public final void l(float f7) {
        k(this.n, f7 * 100.0f);
        o1.j jVar = this.r;
        jVar.c();
        if (f7 == 0.0f) {
            this.e = 1.0f;
            return;
        }
        o1.k l4 = d3.l(1.0f, 500.0f, 0.75f);
        l4.i = 100.0f;
        jVar.u = l4;
        jVar.b = 100.0f;
        jVar.c = true;
        jVar.a = 4000.0f;
        jVar.h();
    }

    public final void m() {
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0 || getLayout() == null) {
            return;
        }
        Bitmap bitmap = this.y;
        if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.y.getWidth() != getMeasuredWidth()) {
            Bitmap bitmap2 = this.y;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.y = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.E = new Canvas(this.y);
        }
        this.y.eraseColor(0);
        StaticLayout staticLayout = new StaticLayout(getTransformationMethod().getTransformation(getText(), this), getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(r4, 0, r4.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        this.E.save();
        this.E.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
        staticLayout.draw(this.E);
        this.E.restore();
        this.w = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new b3(this, 7));
        this.G.setDuration(220L);
        this.G.start();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.lu, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.c();
        this.h.c();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (isFocused()) {
            return;
        }
        hideActionMode();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClipDescription primaryClipDescription;
        int i10;
        if (motionEvent.getAction() == 0) {
            this.H = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            xr xrVar = getParent() instanceof xr ? (xr) getParent() : null;
            if (motionEvent.getAction() == 1 && this.H) {
                if (!isFocused() || xrVar == null) {
                    requestFocus();
                } else {
                    ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService(ClipboardManager.class);
                    if (clipboardManager == null || clipboardManager.getPrimaryClipDescription() == null || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) {
                        return false;
                    }
                    primaryClipDescription.hasMimeType("text/plain");
                    ClipData.Item itemAt = clipboardManager.getPrimaryClip().getItemAt(0);
                    try {
                        i10 = Integer.parseInt((itemAt == null || itemAt.getText() == null) ? "" : itemAt.getText().toString());
                    } catch (Exception unused) {
                        i10 = -1;
                    }
                    if (i10 > 0) {
                        startActionMode(new yr(this));
                    }
                }
                setSelection(0);
                if (this.s) {
                    AndroidUtilities.showKeyboard(this);
                }
            }
            this.H = false;
        }
        return this.H;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i10, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z10) {
        this.s = z10;
        setShowSoftInputOnFocus(z10);
    }
}
