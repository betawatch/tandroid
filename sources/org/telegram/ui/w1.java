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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class w1 extends FrameLayout implements org.telegram.ui.Cells.k9 {
    public final v1 a;
    public final org.telegram.ui.Components.e91 b;
    public f3 c;
    public f3 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public TL_iv.pageBlockEmbed v;
    public final l4 w;
    public final /* synthetic */ n4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(n4 n4Var, Context context, l4 l4Var) {
        super(context);
        this.x = n4Var;
        this.w = l4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b = null;
            this.a = null;
            return;
        }
        org.telegram.ui.Components.e91 e91Var = new org.telegram.ui.Components.e91(context, false, new r1(this));
        this.b = e91Var;
        addView(e91Var);
        n4Var.K.add(this);
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

    public final void a(boolean z4) {
        v1 v1Var = this.a;
        if (v1Var != null) {
            try {
                v1Var.stopLoading();
                v1Var.loadUrl("about:blank");
                if (z4) {
                    v1Var.destroy();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.v = null;
        org.telegram.ui.Components.e91 e91Var = this.b;
        if (e91Var != null) {
            e91Var.b();
        }
    }

    @Override // org.telegram.ui.Cells.k9
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
        if (!this.x.S) {
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
        n4 n4Var = this.x;
        int i10 = 0;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.e, this.f);
            n4.v(n4Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.e, this.f + this.h);
            n4.v(n4Var, canvas, this, i10);
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
        v1 v1Var = this.a;
        if (v1Var != null) {
            int i14 = this.n;
            v1Var.layout(i14, 0, v1Var.getMeasuredWidth() + i14, v1Var.getMeasuredHeight());
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
        f3 f3Var;
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
            v1 v1Var = this.a;
            if (v1Var != null) {
                v1Var.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
            }
            org.telegram.ui.Components.e91 e91Var = this.b;
            if (e91Var != null && e91Var.getParent() == this) {
                e91Var.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f) + i18, TLObject.FLAG_30));
            }
            int dp4 = AndroidUtilities.dp(8.0f) + i18;
            this.f = dp4;
            TL_iv.pageBlockEmbed pageblockembed3 = this.v;
            TL_iv.RichText richText = pageblockembed3.caption.text;
            HashSet hashSet = n4.Y0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            n4 n4Var = this.x;
            f3 p10 = n4.p(n4Var, this, null, richText, i14, dp4, pageblockembed3, alignment, 0, this.w);
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
            f3 p11 = n4.p(n4Var, this, null, richText2, i14, 0, pageblockembed4, alignment, 0, this.w);
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
        n4 n4Var = this.x;
        if (n4.l(n4Var, this.w, motionEvent, this, f3Var, i10, i11)) {
            return true;
        }
        return n4.l(n4Var, this.w, motionEvent, this, this.d, this.e, this.f + this.h) || super.onTouchEvent(motionEvent);
    }
}
