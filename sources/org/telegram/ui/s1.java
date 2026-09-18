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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class s1 extends FrameLayout implements org.telegram.ui.Cells.p9 {
    public final r1 a;
    public final org.telegram.ui.Components.q91 b;
    public a3 c;
    public a3 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public TL_iv.pageBlockEmbed v;
    public final f4 w;
    public final /* synthetic */ h4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(h4 h4Var, Context context, f4 f4Var) {
        super(context);
        this.x = h4Var;
        this.w = f4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b = null;
            this.a = null;
            return;
        }
        org.telegram.ui.Components.q91 q91Var = new org.telegram.ui.Components.q91(context, false, new n1(this));
        this.b = q91Var;
        addView(q91Var);
        h4Var.N.add(this);
        r1 r1Var = new r1(this, context);
        this.a = r1Var;
        r1Var.getSettings().setJavaScriptEnabled(true);
        r1Var.getSettings().setDomStorageEnabled(true);
        r1Var.getSettings().setAllowContentAccess(true);
        r1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
        r1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
        r1Var.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(r1Var, true);
        r1Var.setWebChromeClient(new o1(this, 0));
        r1Var.setWebViewClient(new p1(this));
        addView(r1Var);
    }

    public final void a(boolean z10) {
        r1 r1Var = this.a;
        if (r1Var != null) {
            try {
                r1Var.stopLoading();
                r1Var.loadUrl("about:blank");
                if (z10) {
                    r1Var.destroy();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.v = null;
        org.telegram.ui.Components.q91 q91Var = this.b;
        if (q91Var != null) {
            q91Var.b();
        }
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
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
            a3Var.attach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.x.V) {
            this.v = null;
        }
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.v == null) {
            return;
        }
        a3 a3Var = this.c;
        h4 h4Var = this.x;
        int i10 = 0;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.e, this.f);
            h4.v(h4Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.e, this.f + this.h);
            h4.v(h4Var, canvas, this, i10);
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
        r1 r1Var = this.a;
        if (r1Var != null) {
            int i14 = this.n;
            r1Var.layout(i14, 0, r1Var.getMeasuredWidth() + i14, r1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.q91 q91Var = this.b;
        if (q91Var == null || q91Var.getParent() != this) {
            return;
        }
        int i15 = this.n;
        q91Var.layout(i15, 0, q91Var.getMeasuredWidth() + i15, q91Var.getMeasuredHeight());
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
        a3 a3Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockEmbed pageblockembed = this.v;
        if (pageblockembed != null) {
            if (pageblockembed.level > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(r15 * 14);
                this.n = dp2;
                this.e = dp2;
                i13 = org.telegram.messenger.wh.z(18.0f, dp2, size);
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
            r1 r1Var = this.a;
            if (r1Var != null) {
                r1Var.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
            }
            org.telegram.ui.Components.q91 q91Var = this.b;
            if (q91Var != null && q91Var.getParent() == this) {
                q91Var.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f) + i18, TLObject.FLAG_30));
            }
            int dp4 = AndroidUtilities.dp(8.0f) + i18;
            this.f = dp4;
            TL_iv.pageBlockEmbed pageblockembed3 = this.v;
            TL_iv.RichText richText = pageblockembed3.caption.text;
            HashSet hashSet = h4.b1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            h4 h4Var = this.x;
            a3 p5 = h4.p(h4Var, this, null, richText, i14, dp4, pageblockembed3, alignment, 0, this.w);
            this.c = p5;
            if (p5 != null) {
                int height = this.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.h = height;
                i18 = org.telegram.messenger.q.D(4.0f, height, i18);
            } else {
                this.h = 0;
            }
            TL_iv.pageBlockEmbed pageblockembed4 = this.v;
            TL_iv.RichText richText2 = pageblockembed4.caption.credit;
            if (this.w.G) {
                alignment = org.telegram.ui.Components.vw0.a();
            }
            a3 p10 = h4.p(h4Var, this, null, richText2, i14, 0, pageblockembed4, alignment, 0, this.w);
            this.d = p10;
            if (p10 != null) {
                i18 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                a3 a3Var2 = this.d;
                a3Var2.s = this.e;
                a3Var2.v = this.h;
            }
            i12 = AndroidUtilities.dp(5.0f) + i18;
            TL_iv.pageBlockEmbed pageblockembed5 = this.v;
            int i19 = pageblockembed5.level;
            if (i19 <= 0 || pageblockembed5.bottom) {
                if (i19 == 0 && this.c != null) {
                    dp = AndroidUtilities.dp(8.0f);
                }
                a3Var = this.c;
                if (a3Var != null) {
                    a3Var.s = this.e;
                    a3Var.v = this.f;
                }
            } else {
                dp = AndroidUtilities.dp(8.0f);
            }
            i12 += dp;
            a3Var = this.c;
            if (a3Var != null) {
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.c;
        int i10 = this.e;
        int i11 = this.f;
        h4 h4Var = this.x;
        if (h4.l(h4Var, this.w, motionEvent, this, a3Var, i10, i11)) {
            return true;
        }
        return h4.l(h4Var, this.w, motionEvent, this, this.d, this.e, this.f + this.h) || super.onTouchEvent(motionEvent);
    }
}
