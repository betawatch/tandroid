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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v1 extends FrameLayout implements org.telegram.ui.Cells.m9 {
    public final u1 a;
    public final org.telegram.ui.Components.g81 b;
    public e3 c;
    public e3 d;
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
    public v1(l4 l4Var, Context context, j4 j4Var) {
        super(context);
        this.x = l4Var;
        this.w = j4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b = null;
            this.a = null;
            return;
        }
        org.telegram.ui.Components.g81 g81Var = new org.telegram.ui.Components.g81(context, false, new q1(this));
        this.b = g81Var;
        addView(g81Var);
        l4Var.J.add(this);
        u1 u1Var = new u1(this, context);
        this.a = u1Var;
        u1Var.getSettings().setJavaScriptEnabled(true);
        u1Var.getSettings().setDomStorageEnabled(true);
        u1Var.getSettings().setAllowContentAccess(true);
        u1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
        u1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
        u1Var.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(u1Var, true);
        u1Var.setWebChromeClient(new r1(this, 0));
        u1Var.setWebViewClient(new s1(this));
        addView(u1Var);
    }

    public final void a(boolean z10) {
        u1 u1Var = this.a;
        if (u1Var != null) {
            try {
                u1Var.stopLoading();
                u1Var.loadUrl("about:blank");
                if (z10) {
                    u1Var.destroy();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        this.v = null;
        org.telegram.ui.Components.g81 g81Var = this.b;
        if (g81Var != null) {
            g81Var.b();
        }
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.x.R) {
            this.v = null;
        }
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.v == null) {
            return;
        }
        e3 e3Var = this.c;
        l4 l4Var = this.x;
        int i9 = 0;
        if (e3Var != null) {
            canvas.save();
            canvas.translate(this.e, this.f);
            l4.v(l4Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i9 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.e, this.f + this.h);
            l4.v(l4Var, canvas, this, i9);
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        u1 u1Var = this.a;
        if (u1Var != null) {
            int i13 = this.n;
            u1Var.layout(i13, 0, u1Var.getMeasuredWidth() + i13, u1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.g81 g81Var = this.b;
        if (g81Var == null || g81Var.getParent() != this) {
            return;
        }
        int i14 = this.n;
        g81Var.layout(i14, 0, g81Var.getMeasuredWidth() + i14, g81Var.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x013b  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int dp;
        e3 e3Var;
        int size = View.MeasureSpec.getSize(i9);
        TL_iv.pageBlockEmbed pageblockembed = this.v;
        if (pageblockembed != null) {
            if (pageblockembed.level > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(r15 * 14);
                this.n = dp2;
                this.e = dp2;
                i12 = org.telegram.messenger.ll.w(18.0f, dp2, size);
                i13 = i12;
            } else {
                this.n = 0;
                this.e = AndroidUtilities.dp(18.0f);
                int dp3 = size - AndroidUtilities.dp(36.0f);
                if (this.v.full_width) {
                    i12 = size;
                } else {
                    i12 = size - AndroidUtilities.dp(36.0f);
                    this.n = AndroidUtilities.dp(18.0f) + this.n;
                }
                i13 = dp3;
            }
            TL_iv.pageBlockEmbed pageblockembed2 = this.v;
            int i15 = pageblockembed2.w;
            float f10 = i15 == 0 ? 1.0f : size / i15;
            int i16 = this.r;
            if (i16 != 0) {
                i14 = AndroidUtilities.dp(i16);
            } else {
                float f11 = pageblockembed2.h;
                if (i15 == 0) {
                    f11 = AndroidUtilities.dp(f11);
                }
                i14 = (int) (f11 * f10);
            }
            if (i14 == 0) {
                i14 = AndroidUtilities.dp(10.0f);
            }
            int i17 = i14;
            u1 u1Var = this.a;
            if (u1Var != null) {
                u1Var.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
            }
            org.telegram.ui.Components.g81 g81Var = this.b;
            if (g81Var != null && g81Var.getParent() == this) {
                g81Var.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f) + i17, TLObject.FLAG_30));
            }
            int dp4 = AndroidUtilities.dp(8.0f) + i17;
            this.f = dp4;
            TL_iv.pageBlockEmbed pageblockembed3 = this.v;
            TL_iv.RichText richText = pageblockembed3.caption.text;
            HashSet hashSet = l4.X0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            l4 l4Var = this.x;
            e3 p6 = l4.p(l4Var, this, null, richText, i13, dp4, pageblockembed3, alignment, 0, this.w);
            this.c = p6;
            if (p6 != null) {
                int height = this.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.h = height;
                i17 = org.telegram.messenger.l0.C(4.0f, height, i17);
            } else {
                this.h = 0;
            }
            TL_iv.pageBlockEmbed pageblockembed4 = this.v;
            TL_iv.RichText richText2 = pageblockembed4.caption.credit;
            if (this.w.C) {
                alignment = org.telegram.ui.Components.rv0.a();
            }
            e3 p9 = l4.p(l4Var, this, null, richText2, i13, 0, pageblockembed4, alignment, 0, this.w);
            this.d = p9;
            if (p9 != null) {
                i17 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                e3 e3Var2 = this.d;
                e3Var2.s = this.e;
                e3Var2.v = this.h;
            }
            i11 = AndroidUtilities.dp(5.0f) + i17;
            TL_iv.pageBlockEmbed pageblockembed5 = this.v;
            int i18 = pageblockembed5.level;
            if (i18 <= 0 || pageblockembed5.bottom) {
                if (i18 == 0 && this.c != null) {
                    dp = AndroidUtilities.dp(8.0f);
                }
                e3Var = this.c;
                if (e3Var != null) {
                    e3Var.s = this.e;
                    e3Var.v = this.f;
                }
            } else {
                dp = AndroidUtilities.dp(8.0f);
            }
            i11 += dp;
            e3Var = this.c;
            if (e3Var != null) {
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e3 e3Var = this.c;
        int i9 = this.e;
        int i10 = this.f;
        l4 l4Var = this.x;
        if (l4.l(l4Var, this.w, motionEvent, this, e3Var, i9, i10)) {
            return true;
        }
        return l4.l(l4Var, this.w, motionEvent, this, this.d, this.e, this.f + this.h) || super.onTouchEvent(motionEvent);
    }
}
