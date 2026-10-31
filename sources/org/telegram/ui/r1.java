package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r1 extends FrameLayout implements org.telegram.ui.Cells.j9 {
    public final q1 a;
    public final org.telegram.ui.Components.m81 b;
    public z2 c;
    public z2 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public TL_iv.pageBlockEmbed w;
    public final f4 x;
    public final /* synthetic */ h4 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(h4 h4Var, Context context, f4 f4Var) {
        super(context);
        this.y = h4Var;
        this.x = f4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b = null;
            this.a = null;
            return;
        }
        org.telegram.ui.Components.m81 m81Var = new org.telegram.ui.Components.m81(context, false, new n1(this));
        this.b = m81Var;
        addView(m81Var);
        h4Var.N.add(this);
        q1 q1Var = new q1(this, context);
        this.a = q1Var;
        q1Var.getSettings().setJavaScriptEnabled(true);
        q1Var.getSettings().setDomStorageEnabled(true);
        q1Var.getSettings().setAllowContentAccess(true);
        q1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
        q1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
        q1Var.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(q1Var, true);
        q1Var.setWebChromeClient(new o1(this, 0));
        q1Var.setWebViewClient(new ji.i(this, 1));
        addView(q1Var);
    }

    public final void a(boolean z10) {
        q1 q1Var = this.a;
        if (q1Var != null) {
            try {
                q1Var.stopLoading();
                q1Var.loadUrl("about:blank");
                if (z10) {
                    q1Var.destroy();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        this.w = null;
        org.telegram.ui.Components.m81 m81Var = this.b;
        if (m81Var != null) {
            m81Var.b();
        }
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.y.V) {
            this.w = null;
        }
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w == null) {
            return;
        }
        z2 z2Var = this.c;
        h4 h4Var = this.y;
        int i10 = 0;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.e, this.f);
            h4.t(h4Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.e, this.f + this.h);
            h4.t(h4Var, canvas, this, i10);
            this.d.d(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.cd.L0(2131754868, null));
        if (this.c != null) {
            sb2.append(", ");
            sb2.append(this.c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        q1 q1Var = this.a;
        if (q1Var != null) {
            int i14 = this.n;
            q1Var.layout(i14, 0, q1Var.getMeasuredWidth() + i14, q1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.m81 m81Var = this.b;
        if (m81Var == null || m81Var.getParent() != this) {
            return;
        }
        int i15 = this.n;
        m81Var.layout(i15, 0, m81Var.getMeasuredWidth() + i15, m81Var.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x013a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int L;
        z2 z2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockEmbed pageblockembed = this.w;
        if (pageblockembed != null) {
            if (pageblockembed.level > 0) {
                int L2 = org.telegram.messenger.i0.L(18.0f) + org.telegram.messenger.i0.L(r15 * 14);
                this.n = L2;
                this.e = L2;
                i13 = org.telegram.messenger.z20.w(18.0f, L2, size);
                i14 = i13;
            } else {
                this.n = 0;
                this.e = org.telegram.messenger.i0.L(18.0f);
                int L3 = size - org.telegram.messenger.i0.L(36.0f);
                if (this.w.full_width) {
                    i13 = size;
                } else {
                    i13 = size - org.telegram.messenger.i0.L(36.0f);
                    this.n = org.telegram.messenger.i0.L(18.0f) + this.n;
                }
                i14 = L3;
            }
            TL_iv.pageBlockEmbed pageblockembed2 = this.w;
            int i16 = pageblockembed2.w;
            float f7 = i16 == 0 ? 1.0f : size / i16;
            int i17 = this.r;
            if (i17 != 0) {
                i15 = org.telegram.messenger.i0.L(i17);
            } else {
                float f10 = pageblockembed2.h;
                if (i16 == 0) {
                    f10 = org.telegram.messenger.i0.L(f10);
                }
                i15 = (int) (f10 * f7);
            }
            if (i15 == 0) {
                i15 = org.telegram.messenger.i0.L(10.0f);
            }
            int i18 = i15;
            q1 q1Var = this.a;
            if (q1Var != null) {
                q1Var.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
            }
            org.telegram.ui.Components.m81 m81Var = this.b;
            if (m81Var != null && m81Var.getParent() == this) {
                m81Var.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(10.0f) + i18, TLObject.FLAG_30));
            }
            int L4 = org.telegram.messenger.i0.L(8.0f) + i18;
            this.f = L4;
            TL_iv.pageBlockEmbed pageblockembed3 = this.w;
            TL_iv.RichText richText = pageblockembed3.caption.text;
            HashSet hashSet = h4.c1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            h4 h4Var = this.y;
            z2 n10 = h4.n(h4Var, this, null, richText, i14, L4, pageblockembed3, alignment, 0, this.x);
            this.c = n10;
            if (n10 != null) {
                int height = this.c.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
                this.h = height;
                i18 = org.telegram.messenger.m5.C(4.0f, height, i18);
            } else {
                this.h = 0;
            }
            TL_iv.pageBlockEmbed pageblockembed4 = this.w;
            TL_iv.RichText richText2 = pageblockembed4.caption.credit;
            if (this.x.G) {
                alignment = org.telegram.ui.Components.ov0.a();
            }
            z2 n11 = h4.n(h4Var, this, null, richText2, i14, 0, pageblockembed4, alignment, 0, this.x);
            this.d = n11;
            if (n11 != null) {
                i18 += this.d.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
                z2 z2Var2 = this.d;
                z2Var2.s = this.e;
                z2Var2.w = this.h;
            }
            i12 = org.telegram.messenger.i0.L(5.0f) + i18;
            TL_iv.pageBlockEmbed pageblockembed5 = this.w;
            int i19 = pageblockembed5.level;
            if (i19 <= 0 || pageblockembed5.bottom) {
                if (i19 == 0 && this.c != null) {
                    L = org.telegram.messenger.i0.L(8.0f);
                }
                z2Var = this.c;
                if (z2Var != null) {
                    z2Var.s = this.e;
                    z2Var.w = this.f;
                }
            } else {
                L = org.telegram.messenger.i0.L(8.0f);
            }
            i12 += L;
            z2Var = this.c;
            if (z2Var != null) {
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z2 z2Var = this.c;
        int i10 = this.e;
        int i11 = this.f;
        h4 h4Var = this.y;
        if (h4.j(h4Var, this.x, motionEvent, this, z2Var, i10, i11)) {
            return true;
        }
        return h4.j(h4Var, this.x, motionEvent, this, this.d, this.e, this.f + this.h) || super.onTouchEvent(motionEvent);
    }
}
