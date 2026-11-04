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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r1 extends FrameLayout implements org.telegram.ui.Cells.g9 {
    public final q1 a;
    public final org.telegram.ui.Components.d71 b;
    public a3 c;
    public a3 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public TL_iv.pageBlockEmbed w;
    public final g4 x;
    public final /* synthetic */ i4 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(i4 i4Var, Context context, g4 g4Var) {
        super(context);
        this.y = i4Var;
        this.x = g4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b = null;
            this.a = null;
            return;
        }
        org.telegram.ui.Components.d71 d71Var = new org.telegram.ui.Components.d71(context, false, new m1(this));
        this.b = d71Var;
        addView(d71Var);
        i4Var.O.add(this);
        q1 q1Var = new q1(this, context);
        this.a = q1Var;
        q1Var.getSettings().setJavaScriptEnabled(true);
        q1Var.getSettings().setDomStorageEnabled(true);
        q1Var.getSettings().setAllowContentAccess(true);
        q1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
        q1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
        q1Var.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(q1Var, true);
        int i3 = 0;
        q1Var.setWebChromeClient(new n1(this, i3));
        q1Var.setWebViewClient(new o1(this, i3));
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
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        this.w = null;
        org.telegram.ui.Components.d71 d71Var = this.b;
        if (d71Var != null) {
            d71Var.b();
        }
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.y.W) {
            this.w = null;
        }
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w == null) {
            return;
        }
        a3 a3Var = this.c;
        i4 i4Var = this.y;
        int i3 = 0;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.e, this.f);
            i4.t(i4Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
            i3 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.e, this.f + this.h);
            i4.t(i4Var, canvas, this, i3);
            this.d.d(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131754868, null));
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        q1 q1Var = this.a;
        if (q1Var != null) {
            int i13 = this.n;
            q1Var.layout(i13, 0, q1Var.getMeasuredWidth() + i13, q1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.d71 d71Var = this.b;
        if (d71Var == null || d71Var.getParent() != this) {
            return;
        }
        int i14 = this.n;
        d71Var.layout(i14, 0, d71Var.getMeasuredWidth() + i14, d71Var.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x013a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int L;
        a3 a3Var;
        int size = View.MeasureSpec.getSize(i3);
        TL_iv.pageBlockEmbed pageblockembed = this.w;
        if (pageblockembed != null) {
            if (pageblockembed.level > 0) {
                int L2 = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(r15 * 14);
                this.n = L2;
                this.e = L2;
                i12 = org.telegram.messenger.camera.q.w(18.0f, L2, size);
                i13 = i12;
            } else {
                this.n = 0;
                this.e = org.telegram.messenger.g0.L(18.0f);
                int L3 = size - org.telegram.messenger.g0.L(36.0f);
                if (this.w.full_width) {
                    i12 = size;
                } else {
                    i12 = size - org.telegram.messenger.g0.L(36.0f);
                    this.n = org.telegram.messenger.g0.L(18.0f) + this.n;
                }
                i13 = L3;
            }
            TL_iv.pageBlockEmbed pageblockembed2 = this.w;
            int i15 = pageblockembed2.w;
            float f10 = i15 == 0 ? 1.0f : size / i15;
            int i16 = this.r;
            if (i16 != 0) {
                i14 = org.telegram.messenger.g0.L(i16);
            } else {
                float f11 = pageblockembed2.h;
                if (i15 == 0) {
                    f11 = org.telegram.messenger.g0.L(f11);
                }
                i14 = (int) (f11 * f10);
            }
            if (i14 == 0) {
                i14 = org.telegram.messenger.g0.L(10.0f);
            }
            int i17 = i14;
            q1 q1Var = this.a;
            if (q1Var != null) {
                q1Var.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
            }
            org.telegram.ui.Components.d71 d71Var = this.b;
            if (d71Var != null && d71Var.getParent() == this) {
                d71Var.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10.0f) + i17, TLObject.FLAG_30));
            }
            int L4 = org.telegram.messenger.g0.L(8.0f) + i17;
            this.f = L4;
            TL_iv.pageBlockEmbed pageblockembed3 = this.w;
            TL_iv.RichText richText = pageblockembed3.caption.text;
            HashSet hashSet = i4.d1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            i4 i4Var = this.y;
            a3 n4 = i4.n(i4Var, this, null, richText, i13, L4, pageblockembed3, alignment, 0, this.x);
            this.c = n4;
            if (n4 != null) {
                int height = this.c.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                this.h = height;
                i17 = org.telegram.messenger.k5.C(4.0f, height, i17);
            } else {
                this.h = 0;
            }
            TL_iv.pageBlockEmbed pageblockembed4 = this.w;
            TL_iv.RichText richText2 = pageblockembed4.caption.credit;
            if (this.x.H) {
                alignment = org.telegram.ui.Components.lu0.a();
            }
            a3 n10 = i4.n(i4Var, this, null, richText2, i13, 0, pageblockembed4, alignment, 0, this.x);
            this.d = n10;
            if (n10 != null) {
                i17 += this.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                a3 a3Var2 = this.d;
                a3Var2.s = this.e;
                a3Var2.w = this.h;
            }
            i11 = org.telegram.messenger.g0.L(5.0f) + i17;
            TL_iv.pageBlockEmbed pageblockembed5 = this.w;
            int i18 = pageblockembed5.level;
            if (i18 <= 0 || pageblockembed5.bottom) {
                if (i18 == 0 && this.c != null) {
                    L = org.telegram.messenger.g0.L(8.0f);
                }
                a3Var = this.c;
                if (a3Var != null) {
                    a3Var.s = this.e;
                    a3Var.w = this.f;
                }
            } else {
                L = org.telegram.messenger.g0.L(8.0f);
            }
            i11 += L;
            a3Var = this.c;
            if (a3Var != null) {
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.c;
        int i3 = this.e;
        int i10 = this.f;
        i4 i4Var = this.y;
        if (i4.j(i4Var, this.x, motionEvent, this, a3Var, i3, i10)) {
            return true;
        }
        return i4.j(i4Var, this.x, motionEvent, this, this.d, this.e, this.f + this.h) || super.onTouchEvent(motionEvent);
    }
}
