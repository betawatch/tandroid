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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s2 extends FrameLayout implements org.telegram.ui.Cells.l9 {
    public final n2 a;
    public final q2 b;
    public final r2 c;
    public TL_iv.pageBlockSlideshow d;
    public d3 e;
    public d3 f;
    public final int h;
    public int n;
    public int r;
    public float s;
    public int v;
    public final j4 w;
    public final /* synthetic */ l4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(l4 l4Var, Context context, j4 j4Var) {
        super(context);
        this.x = l4Var;
        this.h = AndroidUtilities.dp(18.0f);
        this.w = j4Var;
        if (l4.y1 == null) {
            Paint paint = new Paint(1);
            l4.y1 = paint;
            paint.setColor(-1);
        }
        n2 n2Var = new n2(this, context);
        this.a = n2Var;
        n2Var.b(new o2(this, 0));
        q2 q2Var = new q2(this);
        this.b = q2Var;
        n2Var.setAdapter(q2Var);
        AndroidUtilities.setViewPagerEdgeEffectColor(n2Var, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
        addView(n2Var);
        r2 r2Var = new r2(this, context);
        this.c = r2Var;
        addView(r2Var);
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.e;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.f;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.e;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.f;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.e;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.f;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d == null) {
            return;
        }
        d3 d3Var = this.e;
        l4 l4Var = this.x;
        int i10 = this.h;
        int i11 = 0;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(i10, this.n);
            l4.v(l4Var, canvas, this, 0);
            this.e.draw(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.f != null) {
            canvas.save();
            canvas.translate(i10, this.n + this.r);
            l4.v(l4Var, canvas, this, i11);
            this.f.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVSlideshow));
        if (this.e != null) {
            sb.append(", ");
            sb.append(this.e.d.getText());
        }
        if (this.f != null) {
            sb.append(", ");
            sb.append(this.f.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(8.0f);
        n2 n2Var = this.a;
        n2Var.layout(0, dp, n2Var.getMeasuredWidth(), n2Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        int bottom = n2Var.getBottom() - AndroidUtilities.dp(23.0f);
        r2 r2Var = this.c;
        r2Var.layout(0, bottom, r2Var.getMeasuredWidth(), r2Var.getMeasuredHeight() + bottom);
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
            HashSet hashSet = l4.Y0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            l4 l4Var = this.x;
            d3 p10 = l4.p(l4Var, this, null, richText, dp2, dp3, pageblockslideshow, alignment, 0, this.w);
            this.e = p10;
            int i13 = this.h;
            if (p10 != null) {
                int height = this.e.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.r = height;
                dp = org.telegram.messenger.y3.C(4.0f, height, dp);
                d3 d3Var = this.e;
                d3Var.s = i13;
                d3Var.v = this.n;
            } else {
                this.r = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.d;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.w.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            }
            d3 p11 = l4.p(l4Var, this, null, richText2, dp2, 0, pageblockslideshow2, alignment, 0, this.w);
            this.f = p11;
            if (p11 != null) {
                dp += this.f.d.getHeight() + AndroidUtilities.dp(4.0f);
                d3 d3Var2 = this.f;
                d3Var2.s = i13;
                d3Var2.v = this.n + this.r;
            }
            i12 = AndroidUtilities.dp(16.0f) + dp;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d3 d3Var = this.e;
        int i10 = this.h;
        int i11 = this.n;
        l4 l4Var = this.x;
        if (l4.l(l4Var, this.w, motionEvent, this, d3Var, i10, i11)) {
            return true;
        }
        return l4.l(l4Var, this.w, motionEvent, this, this.f, this.h, this.n + this.r) || super.onTouchEvent(motionEvent);
    }
}
