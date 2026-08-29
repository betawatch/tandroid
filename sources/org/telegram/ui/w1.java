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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w1 extends FrameLayout implements org.telegram.ui.Cells.j9 {
    public final v1 a;
    public final org.telegram.ui.Components.s81 b;
    public f3 c;
    public f3 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public TL_iv.pageBlockEmbed v;
    public final k4 w;
    public final /* synthetic */ m4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(m4 m4Var, Context context, k4 k4Var) {
        super(context);
        this.x = m4Var;
        this.w = k4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b = null;
            this.a = null;
            return;
        }
        org.telegram.ui.Components.s81 s81Var = new org.telegram.ui.Components.s81(context, false, new r1(this));
        this.b = s81Var;
        addView(s81Var);
        m4Var.J.add(this);
        v1 v1Var = new v1(this, context);
        this.a = v1Var;
        v1Var.getSettings().setJavaScriptEnabled(true);
        v1Var.getSettings().setDomStorageEnabled(true);
        v1Var.getSettings().setAllowContentAccess(true);
        v1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
        v1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
        v1Var.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(v1Var, true);
        v1Var.setWebChromeClient(new s1(this, 0));
        v1Var.setWebViewClient(new t1(this));
        addView(v1Var);
    }

    public final void a(boolean z10) {
        v1 v1Var = this.a;
        if (v1Var != null) {
            try {
                v1Var.stopLoading();
                v1Var.loadUrl("about:blank");
                if (z10) {
                    v1Var.destroy();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        this.v = null;
        org.telegram.ui.Components.s81 s81Var = this.b;
        if (s81Var != null) {
            s81Var.b();
        }
    }

    @Override // org.telegram.ui.Cells.j9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.x.R) {
            this.v = null;
        }
        f3 f3Var = this.c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.v == null) {
            return;
        }
        f3 f3Var = this.c;
        m4 m4Var = this.x;
        int i10 = 0;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.e, this.f);
            m4.v(m4Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.e, this.f + this.h);
            m4.v(m4Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbed));
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
        v1 v1Var = this.a;
        if (v1Var != null) {
            int i14 = this.n;
            v1Var.layout(i14, 0, v1Var.getMeasuredWidth() + i14, v1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.s81 s81Var = this.b;
        if (s81Var == null || s81Var.getParent() != this) {
            return;
        }
        int i15 = this.n;
        s81Var.layout(i15, 0, s81Var.getMeasuredWidth() + i15, s81Var.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x013b  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int dp;
        f3 f3Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockEmbed pageblockembed = this.v;
        if (pageblockembed != null) {
            if (pageblockembed.level > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(r15 * 14);
                this.n = dp2;
                this.e = dp2;
                i13 = b.u(18.0f, dp2, size);
                i14 = i13;
            } else {
                this.n = 0;
                this.e = AndroidUtilities.dp(18.0f);
                int dp3 = size - AndroidUtilities.dp(36.0f);
                if (this.v.full_width) {
                    i13 = size;
                } else {
                    i13 = size - AndroidUtilities.dp(36.0f);
                    this.n = AndroidUtilities.dp(18.0f) + this.n;
                }
                i14 = dp3;
            }
            TL_iv.pageBlockEmbed pageblockembed2 = this.v;
            int i16 = pageblockembed2.w;
            float f9 = i16 == 0 ? 1.0f : size / i16;
            int i17 = this.r;
            if (i17 != 0) {
                i15 = AndroidUtilities.dp(i17);
            } else {
                float f10 = pageblockembed2.h;
                if (i16 == 0) {
                    f10 = AndroidUtilities.dp(f10);
                }
                i15 = (int) (f10 * f9);
            }
            if (i15 == 0) {
                i15 = AndroidUtilities.dp(10.0f);
            }
            int i18 = i15;
            v1 v1Var = this.a;
            if (v1Var != null) {
                v1Var.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
            }
            org.telegram.ui.Components.s81 s81Var = this.b;
            if (s81Var != null && s81Var.getParent() == this) {
                s81Var.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f) + i18, TLObject.FLAG_30));
            }
            int dp4 = AndroidUtilities.dp(8.0f) + i18;
            this.f = dp4;
            TL_iv.pageBlockEmbed pageblockembed3 = this.v;
            TL_iv.RichText richText = pageblockembed3.caption.text;
            HashSet hashSet = m4.X0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            m4 m4Var = this.x;
            f3 p10 = m4.p(m4Var, this, null, richText, i14, dp4, pageblockembed3, alignment, 0, this.w);
            this.c = p10;
            if (p10 != null) {
                int height = this.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.h = height;
                i18 = org.telegram.messenger.x3.C(4.0f, height, i18);
            } else {
                this.h = 0;
            }
            TL_iv.pageBlockEmbed pageblockembed4 = this.v;
            TL_iv.RichText richText2 = pageblockembed4.caption.credit;
            if (this.w.C) {
                alignment = org.telegram.ui.Components.bw0.a();
            }
            f3 p11 = m4.p(m4Var, this, null, richText2, i14, 0, pageblockembed4, alignment, 0, this.w);
            this.d = p11;
            if (p11 != null) {
                i18 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                f3 f3Var2 = this.d;
                f3Var2.s = this.e;
                f3Var2.v = this.h;
            }
            i12 = AndroidUtilities.dp(5.0f) + i18;
            TL_iv.pageBlockEmbed pageblockembed5 = this.v;
            int i19 = pageblockembed5.level;
            if (i19 <= 0 || pageblockembed5.bottom) {
                if (i19 == 0 && this.c != null) {
                    dp = AndroidUtilities.dp(8.0f);
                }
                f3Var = this.c;
                if (f3Var != null) {
                    f3Var.s = this.e;
                    f3Var.v = this.f;
                }
            } else {
                dp = AndroidUtilities.dp(8.0f);
            }
            i12 += dp;
            f3Var = this.c;
            if (f3Var != null) {
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f3 f3Var = this.c;
        int i10 = this.e;
        int i11 = this.f;
        m4 m4Var = this.x;
        if (m4.l(m4Var, this.w, motionEvent, this, f3Var, i10, i11)) {
            return true;
        }
        return m4.l(m4Var, this.w, motionEvent, this, this.d, this.e, this.f + this.h) || super.onTouchEvent(motionEvent);
    }
}
