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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class u1 extends FrameLayout implements org.telegram.ui.Cells.n9 {
    public final t1 a;
    public final org.telegram.ui.Components.da1 b;
    public c3 c;
    public c3 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public TL_iv.pageBlockEmbed v;
    public final i4 w;
    public final /* synthetic */ k4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(k4 k4Var, Context context, i4 i4Var) {
        super(context);
        this.x = k4Var;
        this.w = i4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b = null;
            this.a = null;
            return;
        }
        org.telegram.ui.Components.da1 da1Var = new org.telegram.ui.Components.da1(context, false, new p1(this));
        this.b = da1Var;
        addView(da1Var);
        k4Var.N.add(this);
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

    public final void a(boolean z10) {
        t1 t1Var = this.a;
        if (t1Var != null) {
            try {
                t1Var.stopLoading();
                t1Var.loadUrl("about:blank");
                if (z10) {
                    t1Var.destroy();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.v = null;
        org.telegram.ui.Components.da1 da1Var = this.b;
        if (da1Var != null) {
            da1Var.b();
        }
    }

    @Override // org.telegram.ui.Cells.n9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            arrayList.add(c3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.x.V) {
            this.v = null;
        }
        c3 c3Var = this.c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.v == null) {
            return;
        }
        c3 c3Var = this.c;
        k4 k4Var = this.x;
        int i10 = 0;
        if (c3Var != null) {
            canvas.save();
            canvas.translate(this.e, this.f);
            k4.v(k4Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.e, this.f + this.h);
            k4.v(k4Var, canvas, this, i10);
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
        t1 t1Var = this.a;
        if (t1Var != null) {
            int i14 = this.n;
            t1Var.layout(i14, 0, t1Var.getMeasuredWidth() + i14, t1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.da1 da1Var = this.b;
        if (da1Var == null || da1Var.getParent() != this) {
            return;
        }
        int i15 = this.n;
        da1Var.layout(i15, 0, da1Var.getMeasuredWidth() + i15, da1Var.getMeasuredHeight());
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
        int dp;
        c3 c3Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockEmbed pageblockembed = this.v;
        if (pageblockembed != null) {
            if (pageblockembed.level > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(r15 * 14);
                this.n = dp2;
                this.e = dp2;
                i13 = org.telegram.messenger.sl.y(18.0f, dp2, size);
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
            float f7 = i16 == 0 ? 1.0f : size / i16;
            int i17 = this.r;
            if (i17 != 0) {
                i15 = AndroidUtilities.dp(i17);
            } else {
                float f10 = pageblockembed2.h;
                if (i16 == 0) {
                    f10 = AndroidUtilities.dp(f10);
                }
                i15 = (int) (f10 * f7);
            }
            if (i15 == 0) {
                i15 = AndroidUtilities.dp(10.0f);
            }
            int i18 = i15;
            t1 t1Var = this.a;
            if (t1Var != null) {
                t1Var.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
            }
            org.telegram.ui.Components.da1 da1Var = this.b;
            if (da1Var != null && da1Var.getParent() == this) {
                da1Var.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f) + i18, TLObject.FLAG_30));
            }
            int dp4 = AndroidUtilities.dp(8.0f) + i18;
            this.f = dp4;
            TL_iv.pageBlockEmbed pageblockembed3 = this.v;
            TL_iv.RichText richText = pageblockembed3.caption.text;
            HashSet hashSet = k4.c1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            k4 k4Var = this.x;
            c3 p5 = k4.p(k4Var, this, null, richText, i14, dp4, pageblockembed3, alignment, 0, this.w);
            this.c = p5;
            if (p5 != null) {
                int height = this.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.h = height;
                i18 = org.telegram.messenger.v0.C(4.0f, height, i18);
            } else {
                this.h = 0;
            }
            TL_iv.pageBlockEmbed pageblockembed4 = this.v;
            TL_iv.RichText richText2 = pageblockembed4.caption.credit;
            if (this.w.G) {
                alignment = org.telegram.ui.Components.ix0.a();
            }
            c3 p9 = k4.p(k4Var, this, null, richText2, i14, 0, pageblockembed4, alignment, 0, this.w);
            this.d = p9;
            if (p9 != null) {
                i18 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                c3 c3Var2 = this.d;
                c3Var2.s = this.e;
                c3Var2.v = this.h;
            }
            i12 = AndroidUtilities.dp(5.0f) + i18;
            TL_iv.pageBlockEmbed pageblockembed5 = this.v;
            int i19 = pageblockembed5.level;
            if (i19 <= 0 || pageblockembed5.bottom) {
                if (i19 == 0 && this.c != null) {
                    dp = AndroidUtilities.dp(8.0f);
                }
                c3Var = this.c;
                if (c3Var != null) {
                    c3Var.s = this.e;
                    c3Var.v = this.f;
                }
            } else {
                dp = AndroidUtilities.dp(8.0f);
            }
            i12 += dp;
            c3Var = this.c;
            if (c3Var != null) {
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c3 c3Var = this.c;
        int i10 = this.e;
        int i11 = this.f;
        k4 k4Var = this.x;
        if (k4.l(k4Var, this.w, motionEvent, this, c3Var, i10, i11)) {
            return true;
        }
        return k4.l(k4Var, this.w, motionEvent, this, this.d, this.e, this.f + this.h) || super.onTouchEvent(motionEvent);
    }
}
