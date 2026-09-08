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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class t1 extends FrameLayout implements org.telegram.ui.Cells.p9 {
    public final s1 a;
    public final org.telegram.ui.Components.b91 b;
    public b3 c;
    public b3 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public TL_iv.pageBlockEmbed v;
    public final g4 w;
    public final /* synthetic */ i4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(i4 i4Var, Context context, g4 g4Var) {
        super(context);
        this.x = i4Var;
        this.w = g4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b = null;
            this.a = null;
            return;
        }
        org.telegram.ui.Components.b91 b91Var = new org.telegram.ui.Components.b91(context, false, new o1(this));
        this.b = b91Var;
        addView(b91Var);
        i4Var.N.add(this);
        s1 s1Var = new s1(this, context);
        this.a = s1Var;
        s1Var.getSettings().setJavaScriptEnabled(true);
        s1Var.getSettings().setDomStorageEnabled(true);
        s1Var.getSettings().setAllowContentAccess(true);
        s1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
        s1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
        s1Var.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(s1Var, true);
        s1Var.setWebChromeClient(new p1(this, 0));
        s1Var.setWebViewClient(new q1(this));
        addView(s1Var);
    }

    public final void a(boolean z10) {
        s1 s1Var = this.a;
        if (s1Var != null) {
            try {
                s1Var.stopLoading();
                s1Var.loadUrl("about:blank");
                if (z10) {
                    s1Var.destroy();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        this.v = null;
        org.telegram.ui.Components.b91 b91Var = this.b;
        if (b91Var != null) {
            b91Var.b();
        }
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            arrayList.add(b3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.x.V) {
            this.v = null;
        }
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.v == null) {
            return;
        }
        b3 b3Var = this.c;
        i4 i4Var = this.x;
        int i10 = 0;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.e, this.f);
            i4.v(i4Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.e, this.f + this.h);
            i4.v(i4Var, canvas, this, i10);
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
        s1 s1Var = this.a;
        if (s1Var != null) {
            int i14 = this.n;
            s1Var.layout(i14, 0, s1Var.getMeasuredWidth() + i14, s1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.b91 b91Var = this.b;
        if (b91Var == null || b91Var.getParent() != this) {
            return;
        }
        int i15 = this.n;
        b91Var.layout(i15, 0, b91Var.getMeasuredWidth() + i15, b91Var.getMeasuredHeight());
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
        b3 b3Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockEmbed pageblockembed = this.v;
        if (pageblockembed != null) {
            if (pageblockembed.level > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(r15 * 14);
                this.n = dp2;
                this.e = dp2;
                i13 = org.telegram.messenger.wl.v(18.0f, dp2, size);
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
            s1 s1Var = this.a;
            if (s1Var != null) {
                s1Var.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
            }
            org.telegram.ui.Components.b91 b91Var = this.b;
            if (b91Var != null && b91Var.getParent() == this) {
                b91Var.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f) + i18, TLObject.FLAG_30));
            }
            int dp4 = AndroidUtilities.dp(8.0f) + i18;
            this.f = dp4;
            TL_iv.pageBlockEmbed pageblockembed3 = this.v;
            TL_iv.RichText richText = pageblockembed3.caption.text;
            HashSet hashSet = i4.b1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            i4 i4Var = this.x;
            b3 p5 = i4.p(i4Var, this, null, richText, i14, dp4, pageblockembed3, alignment, 0, this.w);
            this.c = p5;
            if (p5 != null) {
                int height = this.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.h = height;
                i18 = org.telegram.messenger.w1.C(4.0f, height, i18);
            } else {
                this.h = 0;
            }
            TL_iv.pageBlockEmbed pageblockembed4 = this.v;
            TL_iv.RichText richText2 = pageblockembed4.caption.credit;
            if (this.w.G) {
                alignment = org.telegram.ui.Components.iw0.a();
            }
            b3 p10 = i4.p(i4Var, this, null, richText2, i14, 0, pageblockembed4, alignment, 0, this.w);
            this.d = p10;
            if (p10 != null) {
                i18 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                b3 b3Var2 = this.d;
                b3Var2.s = this.e;
                b3Var2.v = this.h;
            }
            i12 = AndroidUtilities.dp(5.0f) + i18;
            TL_iv.pageBlockEmbed pageblockembed5 = this.v;
            int i19 = pageblockembed5.level;
            if (i19 <= 0 || pageblockembed5.bottom) {
                if (i19 == 0 && this.c != null) {
                    dp = AndroidUtilities.dp(8.0f);
                }
                b3Var = this.c;
                if (b3Var != null) {
                    b3Var.s = this.e;
                    b3Var.v = this.f;
                }
            } else {
                dp = AndroidUtilities.dp(8.0f);
            }
            i12 += dp;
            b3Var = this.c;
            if (b3Var != null) {
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b3 b3Var = this.c;
        int i10 = this.e;
        int i11 = this.f;
        i4 i4Var = this.x;
        if (i4.l(i4Var, this.w, motionEvent, this, b3Var, i10, i11)) {
            return true;
        }
        return i4.l(i4Var, this.w, motionEvent, this, this.d, this.e, this.f + this.h) || super.onTouchEvent(motionEvent);
    }
}
