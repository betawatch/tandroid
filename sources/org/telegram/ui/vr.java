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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class vr extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.pu0 E;
    public static final org.telegram.ui.Components.pu0 F;
    public static final org.telegram.ui.Components.pu0 G;
    public static final org.telegram.ui.Components.pu0 H;
    public Canvas A;
    public ValueAnimator B;
    public ValueAnimator C;
    public boolean D;
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
        org.telegram.ui.Components.pu0 pu0Var = new org.telegram.ui.Components.pu0(new mg.b(26), new mg.b(27));
        pu0Var.c = 100.0f;
        E = pu0Var;
        org.telegram.ui.Components.pu0 pu0Var2 = new org.telegram.ui.Components.pu0(new mg.b(28), new mg.b(29));
        pu0Var2.c = 100.0f;
        F = pu0Var2;
        org.telegram.ui.Components.pu0 pu0Var3 = new org.telegram.ui.Components.pu0(new tr(0), new tr(1));
        pu0Var3.c = 100.0f;
        G = pu0Var3;
        org.telegram.ui.Components.pu0 pu0Var4 = new org.telegram.ui.Components.pu0(new tr(2), new tr(3));
        pu0Var4.c = 100.0f;
        H = pu0Var4;
    }

    public static void k(o1.j jVar, float f10) {
        o1.k kVar = jVar.u;
        if (kVar == null || f10 != ((float) kVar.i)) {
            jVar.c();
            o1.k kVar2 = new o1.k(f10);
            kVar2.b(400.0f);
            kVar2.a(1.0f);
            kVar2.i = f10;
            jVar.u = kVar2;
            jVar.f();
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

    public final void i(float f10) {
        k(this.h, f10 * 100.0f);
    }

    public final void j(float f10) {
        k(this.f, f10 * 100.0f);
    }

    public final void l(float f10) {
        k(this.n, f10 * 100.0f);
        o1.j jVar = this.r;
        jVar.c();
        if (f10 == 0.0f) {
            this.e = 1.0f;
            return;
        }
        o1.k i9 = org.telegram.ui.Cells.j2.i(1.0f, 500.0f, 0.75f);
        i9.i = 100.0f;
        jVar.u = i9;
        jVar.b = 100.0f;
        jVar.c = true;
        jVar.a = 4000.0f;
        jVar.f();
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
            this.A = new Canvas(this.y);
        }
        this.y.eraseColor(0);
        StaticLayout staticLayout = new StaticLayout(getTransformationMethod().getTransformation(getText(), this), getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(r4, 0, r4.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        this.A.save();
        this.A.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
        staticLayout.draw(this.A);
        this.A.restore();
        this.w = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C = ofFloat;
        ofFloat.addUpdateListener(new f3(this, 8));
        this.C.setDuration(220L);
        this.C.start();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ot, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.c();
        this.h.c();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i9, Rect rect) {
        super.onFocusChanged(z10, i9, rect);
        if (isFocused()) {
            return;
        }
        hideActionMode();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClipDescription primaryClipDescription;
        int i9;
        if (motionEvent.getAction() == 0) {
            this.D = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            sr srVar = getParent() instanceof sr ? (sr) getParent() : null;
            if (motionEvent.getAction() == 1 && this.D) {
                if (!isFocused() || srVar == null) {
                    requestFocus();
                } else {
                    ClipboardManager clipboardManager = (ClipboardManager) f0.e.f(getContext(), ClipboardManager.class);
                    if (clipboardManager == null || clipboardManager.getPrimaryClipDescription() == null || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) {
                        return false;
                    }
                    primaryClipDescription.hasMimeType("text/plain");
                    ClipData.Item itemAt = clipboardManager.getPrimaryClip().getItemAt(0);
                    try {
                        i9 = Integer.parseInt((itemAt == null || itemAt.getText() == null) ? "" : itemAt.getText().toString());
                    } catch (Exception unused) {
                        i9 = -1;
                    }
                    if (i9 > 0) {
                        startActionMode(new ur(this));
                    }
                }
                setSelection(0);
                if (this.s) {
                    AndroidUtilities.showKeyboard(this);
                }
            }
            this.D = false;
        }
        return this.D;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i9, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i9, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z10) {
        this.s = z10;
        setShowSoftInputOnFocus(z10);
    }
}
