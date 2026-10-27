package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class u11 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public SharedConfig.ProxyInfo d;
    public Drawable e;
    public final org.telegram.ui.Components.aq f;
    public boolean h;
    public boolean n;
    public int r;
    public final /* synthetic */ ProxyListActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u11(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        this.s = proxyListActivity;
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
        org.telegram.messenger.wh.r(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z10 = LocaleController.isRTL;
        addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 56 : 21, 10.0f, z10 ? 21 : 56, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, org.telegram.ui.Components.kb1.h(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 56 : 21, 35.0f, z11 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_info);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.A6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Edit));
        addView(imageView, org.telegram.ui.Components.kb1.h(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new z50(this, 28));
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 21, null);
        this.f = aqVar;
        aqVar.b(org.telegram.ui.ActionBar.y6.i7, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.k7);
        aqVar.setDrawBackgroundAsArc(14);
        aqVar.setVisibility(8);
        addView(aqVar, org.telegram.ui.Components.kb1.h(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.n == z10 && z11) {
            return;
        }
        this.n = z10;
        float dp = LocaleController.isRTL ? -AndroidUtilities.dp(32.0f) : AndroidUtilities.dp(32.0f);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
            duration.setInterpolator(org.telegram.ui.Components.ds.f);
            duration.addUpdateListener(new eg(this, dp, 4));
            duration.addListener(new s40(7, this, z10));
            duration.start();
            return;
        }
        if (!z10) {
            dp = 0.0f;
        }
        this.a.setTranslationX(dp);
        this.b.setTranslationX(dp);
        ImageView imageView = this.c;
        imageView.setTranslationX(dp);
        boolean z12 = LocaleController.isRTL;
        int dp2 = AndroidUtilities.dp(32.0f);
        if (!z12) {
            dp2 = -dp2;
        }
        float f7 = dp2 + dp;
        org.telegram.ui.Components.aq aqVar = this.f;
        aqVar.setTranslationX(f7);
        imageView.setVisibility(z10 ? 8 : 0);
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        aqVar.setVisibility(z10 ? 0 : 8);
        aqVar.setAlpha(1.0f);
        aqVar.setScaleX(1.0f);
        aqVar.setScaleY(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i10;
        Drawable drawable;
        SharedConfig.ProxyInfo proxyInfo = SharedConfig.currentProxy;
        SharedConfig.ProxyInfo proxyInfo2 = this.d;
        TextView textView = this.b;
        if (proxyInfo == proxyInfo2) {
            ProxyListActivity proxyListActivity = this.s;
            if (proxyListActivity.d) {
                int i11 = proxyListActivity.c;
                if (i11 == 3 || i11 == 5) {
                    i10 = org.telegram.ui.ActionBar.y6.s6;
                    if (proxyInfo2.ping != 0) {
                        StringBuilder sb2 = new StringBuilder();
                        d3.p(R.string.Connected, ", ", sb2);
                        sb2.append(LocaleController.formatString("Ping", R.string.Ping, Long.valueOf(this.d.ping)));
                        textView.setText(sb2.toString());
                    } else {
                        textView.setText(LocaleController.getString(R.string.Connected));
                    }
                    SharedConfig.ProxyInfo proxyInfo3 = this.d;
                    if (!proxyInfo3.checking && !proxyInfo3.available) {
                        proxyInfo3.availableCheckTime = 0L;
                    }
                } else {
                    i10 = org.telegram.ui.ActionBar.y6.z6;
                    textView.setText(LocaleController.getString(R.string.Connecting));
                }
                this.r = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
                textView.setTag(Integer.valueOf(i10));
                textView.setTextColor(this.r);
                drawable = this.e;
                if (drawable == null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
        }
        if (proxyInfo2.checking) {
            textView.setText(LocaleController.getString(R.string.Checking));
            i10 = org.telegram.ui.ActionBar.y6.z6;
        } else if (proxyInfo2.available) {
            if (proxyInfo2.ping != 0) {
                StringBuilder sb3 = new StringBuilder();
                d3.p(R.string.Available, ", ", sb3);
                sb3.append(LocaleController.formatString("Ping", R.string.Ping, Long.valueOf(this.d.ping)));
                textView.setText(sb3.toString());
            } else {
                textView.setText(LocaleController.getString(R.string.Available));
            }
            i10 = org.telegram.ui.ActionBar.y6.w6;
        } else {
            textView.setText(LocaleController.getString(R.string.Unavailable));
            i10 = org.telegram.ui.ActionBar.y6.p7;
        }
        this.r = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        textView.setTag(Integer.valueOf(i10));
        textView.setTextColor(this.r);
        drawable = this.e;
        if (drawable == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), org.telegram.messenger.wh.D(64.0f, 1, TLObject.FLAG_30));
    }

    public void setChecked(boolean z10) {
        TextView textView = this.b;
        if (!z10) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (this.e == null) {
            this.e = getResources().getDrawable(R.drawable.proxy_check).mutate();
        }
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
        }
        if (LocaleController.isRTL) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.e, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(this.e, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void setProxy(SharedConfig.ProxyInfo proxyInfo) {
        String str;
        if (proxyInfo.settings.a == 3) {
            str = a1.g.s(new StringBuilder(), proxyInfo.settings.b, " (WEB)");
        } else {
            str = proxyInfo.settings.b + ":" + proxyInfo.settings.c;
        }
        this.a.setText(str);
        this.d = proxyInfo;
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int x02;
        TextView textView = this.b;
        if (textView != null) {
            try {
                if ((textView.getTag() instanceof Integer) && (x02 = org.telegram.ui.ActionBar.y6.x0(null, ((Integer) textView.getTag()).intValue(), false)) != this.r) {
                    this.r = x02;
                    textView.setTextColor(x02);
                    Drawable drawable = this.e;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
