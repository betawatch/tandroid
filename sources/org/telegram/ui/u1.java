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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class u1 extends FrameLayout implements org.telegram.ui.Cells.l9 {
    public final t1 a;
    public final org.telegram.ui.Components.e91 b;
    public d3 c;
    public d3 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public TL_iv.pageBlockEmbed v;
    public final j4 w;
    public final /* synthetic */ l4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(l4 l4Var, Context context, j4 j4Var) {
        super(context);
        this.x = l4Var;
        this.w = j4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b = null;
            this.a = null;
            return;
        }
        org.telegram.ui.Components.e91 e91Var = new org.telegram.ui.Components.e91(context, false, new p1(this));
        this.b = e91Var;
        addView(e91Var);
        l4Var.K.add(this);
        t1 t1Var = new t1(this, context);
        this.a = t1Var;
        t1Var.getSettings().setJavaScriptEnabled(true);
        t1Var.getSettings().setDomStorageEnabled(true);
        t1Var.getSettings().setAllowContentAccess(true);
        t1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
        t1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
        t1Var.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(t1Var, true);
        t1Var.setWebChromeClient(new q1(this, 0));
        t1Var.setWebViewClient(new r1(this));
        addView(t1Var);
    }

    public final void a(boolean z4) {
        t1 t1Var = this.a;
        if (t1Var != null) {
            try {
                t1Var.stopLoading();
                t1Var.loadUrl("about:blank");
                if (z4) {
                    t1Var.destroy();
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        this.v = null;
        org.telegram.ui.Components.e91 e91Var = this.b;
        if (e91Var != null) {
            e91Var.b();
        }
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.x.S) {
            this.v = null;
        }
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.v == null) {
            return;
        }
        d3 d3Var = this.c;
        l4 l4Var = this.x;
        int i10 = 0;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.e, this.f);
            l4.v(l4Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.e, this.f + this.h);
            l4.v(l4Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbed));
        if (this.c != null) {
            sb.append(", ");
            sb.append(this.c.d.getText());
        }
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        t1 t1Var = this.a;
        if (t1Var != null) {
            int i14 = this.n;
            t1Var.layout(i14, 0, t1Var.getMeasuredWidth() + i14, t1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.e91 e91Var = this.b;
        if (e91Var == null || e91Var.getParent() != this) {
            return;
        }
        int i15 = this.n;
        e91Var.layout(i15, 0, e91Var.getMeasuredWidth() + i15, e91Var.getMeasuredHeight());
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
        d3 d3Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockEmbed pageblockembed = this.v;
        if (pageblockembed != null) {
            if (pageblockembed.level > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(r15 * 14);
                this.n = dp2;
                this.e = dp2;
                i13 = b.t(18.0f, dp2, size);
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
            float f10 = i16 == 0 ? 1.0f : size / i16;
            int i17 = this.r;
            if (i17 != 0) {
                i15 = AndroidUtilities.dp(i17);
            } else {
                float f11 = pageblockembed2.h;
                if (i16 == 0) {
                    f11 = AndroidUtilities.dp(f11);
                }
                i15 = (int) (f11 * f10);
            }
            if (i15 == 0) {
                i15 = AndroidUtilities.dp(10.0f);
            }
            int i18 = i15;
            t1 t1Var = this.a;
            if (t1Var != null) {
                t1Var.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
            }
            org.telegram.ui.Components.e91 e91Var = this.b;
            if (e91Var != null && e91Var.getParent() == this) {
                e91Var.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f) + i18, TLObject.FLAG_30));
            }
            int dp4 = AndroidUtilities.dp(8.0f) + i18;
            this.f = dp4;
            TL_iv.pageBlockEmbed pageblockembed3 = this.v;
            TL_iv.RichText richText = pageblockembed3.caption.text;
            HashSet hashSet = l4.Y0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            l4 l4Var = this.x;
            d3 p10 = l4.p(l4Var, this, null, richText, i14, dp4, pageblockembed3, alignment, 0, this.w);
            this.c = p10;
            if (p10 != null) {
                int height = this.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.h = height;
                i18 = org.telegram.messenger.y3.C(4.0f, height, i18);
            } else {
                this.h = 0;
            }
            TL_iv.pageBlockEmbed pageblockembed4 = this.v;
            TL_iv.RichText richText2 = pageblockembed4.caption.credit;
            if (this.w.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            }
            d3 p11 = l4.p(l4Var, this, null, richText2, i14, 0, pageblockembed4, alignment, 0, this.w);
            this.d = p11;
            if (p11 != null) {
                i18 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                d3 d3Var2 = this.d;
                d3Var2.s = this.e;
                d3Var2.v = this.h;
            }
            i12 = AndroidUtilities.dp(5.0f) + i18;
            TL_iv.pageBlockEmbed pageblockembed5 = this.v;
            int i19 = pageblockembed5.level;
            if (i19 <= 0 || pageblockembed5.bottom) {
                if (i19 == 0 && this.c != null) {
                    dp = AndroidUtilities.dp(8.0f);
                }
                d3Var = this.c;
                if (d3Var != null) {
                    d3Var.s = this.e;
                    d3Var.v = this.f;
                }
            } else {
                dp = AndroidUtilities.dp(8.0f);
            }
            i12 += dp;
            d3Var = this.c;
            if (d3Var != null) {
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d3 d3Var = this.c;
        int i10 = this.e;
        int i11 = this.f;
        l4 l4Var = this.x;
        if (l4.l(l4Var, this.w, motionEvent, this, d3Var, i10, i11)) {
            return true;
        }
        return l4.l(l4Var, this.w, motionEvent, this, this.d, this.e, this.f + this.h) || super.onTouchEvent(motionEvent);
    }
}
