package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class y0 extends View implements org.telegram.ui.Cells.h9, c3 {
    public final o50 a;
    public final e4 b;
    public z2 c;
    public int d;
    public final int e;
    public TL_iv.pageBlockAuthorDate f;

    public y0(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.e = org.telegram.messenger.g0.L(8.0f);
        this.a = o50Var;
        this.b = e4Var;
    }

    @Override // org.telegram.ui.c3
    public int getBoundLeft() {
        z2 z2Var = this.c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.s;
        this.a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override // org.telegram.ui.c3
    public int getBoundRight() {
        z2 z2Var = this.c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.s;
        this.a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override // org.telegram.ui.c3
    public int getLastLineBoundRight() {
        z2 z2Var = this.c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.s;
        this.a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null || this.c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.e);
        g4.t(this.a, canvas, this, 0);
        this.c.d(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.a, this.b, z2Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.text.Spannable$Factory] */
    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        TLRPC.WebPage webPage;
        Spannable spannable;
        MetricAffectingSpan[] metricAffectingSpanArr;
        int indexOf;
        int size = View.MeasureSpec.getSize(i7);
        TL_iv.pageBlockAuthorDate pageblockauthordate = this.f;
        int i12 = 1;
        if (pageblockauthordate != null) {
            TL_iv.RichText richText = pageblockauthordate.author;
            e4 e4Var = this.b;
            if (e4Var != null) {
                HashSet hashSet = g4.c1;
                webPage = e4Var.E;
            } else {
                webPage = null;
            }
            CharSequence A = g4.A(this.a, webPage, this, richText, richText, pageblockauthordate, size);
            i11 = size;
            if (A instanceof Spannable) {
                spannable = (Spannable) A;
                metricAffectingSpanArr = (MetricAffectingSpan[]) spannable.getSpans(0, A.length(), MetricAffectingSpan.class);
            } else {
                spannable = null;
                metricAffectingSpanArr = null;
            }
            CharSequence a02 = (this.f.published_date == 0 || TextUtils.isEmpty(A)) ? !TextUtils.isEmpty(A) ? org.telegram.messenger.hd.a0(null, null, 2131754056, A) : org.telegram.messenger.hd.E0().h0().format(this.f.published_date * 1000) : org.telegram.messenger.hd.a0(null, null, 2131754040, org.telegram.messenger.hd.E0().h0().format(this.f.published_date * 1000), A);
            if (metricAffectingSpanArr != null) {
                try {
                    if (metricAffectingSpanArr.length > 0 && (indexOf = TextUtils.indexOf((CharSequence) a02, A)) != -1) {
                        a02 = Spannable.Factory.getInstance().newSpannable(a02);
                        for (int i13 = 0; i13 < metricAffectingSpanArr.length; i13++) {
                            MetricAffectingSpan metricAffectingSpan = metricAffectingSpanArr[i13];
                            a02.setSpan(metricAffectingSpan, spannable.getSpanStart(metricAffectingSpan) + indexOf, spannable.getSpanEnd(metricAffectingSpanArr[i13]) + indexOf, 33);
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            z2 o4 = g4.o(this.a, this, a02, null, i11 - org.telegram.messenger.g0.L(36.0f), this.e, this.f, this.b);
            this.c = o4;
            if (o4 != null) {
                int height = this.c.d.getHeight() + org.telegram.messenger.g0.L(16.0f);
                if (e4Var == null || !e4Var.G) {
                    this.d = org.telegram.messenger.g0.L(18.0f);
                } else {
                    this.d = (int) Math.floor(((i11 - this.c.d.getLineLeft(0)) - this.c.d.getLineWidth(0)) - org.telegram.messenger.g0.L(16.0f));
                }
                z2 z2Var = this.c;
                z2Var.s = this.d;
                z2Var.w = this.e;
                i12 = height;
            } else {
                i12 = 0;
            }
        } else {
            i11 = size;
        }
        setMeasuredDimension(i11, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return g4.j(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
        this.f = pageblockauthordate;
        requestLayout();
    }
}
