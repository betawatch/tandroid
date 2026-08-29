package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u2 extends FrameLayout implements org.telegram.ui.Cells.j9 {
    public final p2 a;
    public final s2 b;
    public final t2 c;
    public TL_iv.pageBlockSlideshow d;
    public f3 e;
    public f3 f;
    public final int h;
    public int n;
    public int r;
    public float s;
    public int v;
    public final k4 w;
    public final /* synthetic */ m4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(m4 m4Var, Context context, k4 k4Var) {
        super(context);
        this.x = m4Var;
        this.h = AndroidUtilities.dp(18.0f);
        this.w = k4Var;
        if (m4.x1 == null) {
            Paint paint = new Paint(1);
            m4.x1 = paint;
            paint.setColor(-1);
        }
        p2 p2Var = new p2(this, context);
        this.a = p2Var;
        p2Var.b(new q2(this, 0));
        s2 s2Var = new s2(this);
        this.b = s2Var;
        p2Var.setAdapter(s2Var);
        AndroidUtilities.setViewPagerEdgeEffectColor(p2Var, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        addView(p2Var);
        t2 t2Var = new t2(this, context);
        this.c = t2Var;
        addView(t2Var);
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.Cells.j9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.e;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.f;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.e;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.f;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.e;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.f;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d == null) {
            return;
        }
        f3 f3Var = this.e;
        m4 m4Var = this.x;
        int i10 = this.h;
        int i11 = 0;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(i10, this.n);
            m4.v(m4Var, canvas, this, 0);
            this.e.draw(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.f != null) {
            canvas.save();
            canvas.translate(i10, this.n + this.r);
            m4.v(m4Var, canvas, this, i11);
            this.f.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVSlideshow));
        if (this.e != null) {
            sb2.append(", ");
            sb2.append(this.e.d.getText());
        }
        if (this.f != null) {
            sb2.append(", ");
            sb2.append(this.f.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(8.0f);
        p2 p2Var = this.a;
        p2Var.layout(0, dp, p2Var.getMeasuredWidth(), p2Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        int bottom = p2Var.getBottom() - AndroidUtilities.dp(23.0f);
        t2 t2Var = this.c;
        t2Var.layout(0, bottom, t2Var.getMeasuredWidth(), t2Var.getMeasuredHeight() + bottom);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != null) {
            int dp = AndroidUtilities.dp(310.0f);
            this.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
            this.d.items.size();
            this.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
            int dp2 = size - AndroidUtilities.dp(36.0f);
            int dp3 = AndroidUtilities.dp(16.0f) + dp;
            this.n = dp3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.d;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = m4.X0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            m4 m4Var = this.x;
            f3 p10 = m4.p(m4Var, this, null, richText, dp2, dp3, pageblockslideshow, alignment, 0, this.w);
            this.e = p10;
            int i13 = this.h;
            if (p10 != null) {
                int height = this.e.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.r = height;
                dp = org.telegram.messenger.x3.C(4.0f, height, dp);
                f3 f3Var = this.e;
                f3Var.s = i13;
                f3Var.v = this.n;
            } else {
                this.r = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.d;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.w.C) {
                alignment = org.telegram.ui.Components.bw0.a();
            }
            f3 p11 = m4.p(m4Var, this, null, richText2, dp2, 0, pageblockslideshow2, alignment, 0, this.w);
            this.f = p11;
            if (p11 != null) {
                dp += this.f.d.getHeight() + AndroidUtilities.dp(4.0f);
                f3 f3Var2 = this.f;
                f3Var2.s = i13;
                f3Var2.v = this.n + this.r;
            }
            i12 = AndroidUtilities.dp(16.0f) + dp;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f3 f3Var = this.e;
        int i10 = this.h;
        int i11 = this.n;
        m4 m4Var = this.x;
        if (m4.l(m4Var, this.w, motionEvent, this, f3Var, i10, i11)) {
            return true;
        }
        return m4.l(m4Var, this.w, motionEvent, this, this.f, this.h, this.n + this.r) || super.onTouchEvent(motionEvent);
    }
}
