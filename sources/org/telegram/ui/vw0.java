package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vw0 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final FrameLayout c;
    public final rw0 d;
    public final sw0 e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ PremiumPreviewFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i10 = premiumPreviewFragment.d0;
        int i11 = i10 == 1 ? 175 : 190;
        addView(frameLayout, k7.c6.q(i11, i11, 1));
        rw0 rw0Var = new rw0(this, context, premiumPreviewFragment.e0 ? 1 : 0, i10 == 1 ? 1 : 0, context);
        this.d = rw0Var;
        frameLayout.addView(rw0Var, k7.c6.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, k7.c6.p(-2, -2, 0.0f, 1, 16, i10 == 1 ? 8 : 20, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, k7.c6.p(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        sw0 sw0Var = new sw0(this, context);
        this.e = sw0Var;
        sw0Var.setOverScrollMode(2);
        sw0Var.setLayoutManager(new f2.j0());
        sw0Var.setAdapter(new uw0(this, context));
        sw0Var.setOnItemClickListener(new j(this, 25));
        final Path path = new Path();
        final float[] fArr = new float[8];
        sw0Var.setSelectorTransformer(new q0.a() { // from class: org.telegram.ui.pw0
            @Override // q0.a
            public final void accept(Object obj) {
                Canvas canvas = (Canvas) obj;
                sw0 sw0Var2 = vw0.this.e;
                View pressedChildView = sw0Var2.getPressedChildView();
                int b10 = pressedChildView == null ? -1 : sw0Var2.T(pressedChildView).b();
                Path path2 = path;
                path2.rewind();
                Rect selectorRect = sw0Var2.getSelectorRect();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr2 = fArr;
                Arrays.fill(fArr2, 0.0f);
                if (b10 == 0) {
                    Arrays.fill(fArr2, 0, 4, AndroidUtilities.dp(12.0f));
                }
                if (b10 == sw0Var2.getAdapter().h() - 1) {
                    Arrays.fill(fArr2, 4, 8, AndroidUtilities.dp(12.0f));
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addView(sw0Var, k7.c6.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00c6, code lost:
    
        if (j$.util.Objects.equals(r5, (r7 == null || (r7 = r7.transaction) == null) ? null : r7.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1")) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00d2, code lost:
    
        r2.clear();
        r1.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00d0, code lost:
    
        if (r5.a.months == 12) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        long j10;
        PremiumPreviewFragment premiumPreviewFragment = this.n;
        ArrayList arrayList = premiumPreviewFragment.d;
        arrayList.clear();
        premiumPreviewFragment.e = -1;
        premiumPreviewFragment.f = null;
        if (premiumPreviewFragment.getMediaDataController().getPremiumPromo() != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = premiumPreviewFragment.getMediaDataController().getPremiumPromo().period_options;
            int size = arrayList2.size();
            j10 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i10);
                i10++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
                if (premiumPreviewFragment.getUserConfig().isPremium() && !tL_premiumSubscriptionOption2.can_purchase_upgrade && !tL_premiumSubscriptionOption2.current) {
                }
                xw0 xw0Var = new xw0(tL_premiumSubscriptionOption2);
                arrayList.add(xw0Var);
                if (premiumPreviewFragment.g0 && tL_premiumSubscriptionOption2.months == 12) {
                    premiumPreviewFragment.e = arrayList.size() - 1;
                }
                if (tL_premiumSubscriptionOption2.current) {
                    premiumPreviewFragment.f = xw0Var;
                }
                if (BuildVars.useInvoiceBilling() && xw0Var.i() > j10) {
                    j10 = xw0Var.i();
                }
            }
        } else {
            j10 = 0;
        }
        if (BuildVars.useInvoiceBilling() && premiumPreviewFragment.getUserConfig().isPremium()) {
            arrayList.clear();
            premiumPreviewFragment.f = null;
        } else {
            if (!BuildVars.useInvoiceBilling() && premiumPreviewFragment.f != null) {
                String lastPremiumTransaction = BillingController.getInstance().getLastPremiumTransaction();
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = premiumPreviewFragment.f.a;
            }
            xw0 xw0Var2 = premiumPreviewFragment.f;
            if (xw0Var2 != null) {
            }
        }
        if (BuildVars.useInvoiceBilling()) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ((xw0) obj).e = j10;
            }
        } else if (BillingController.getInstance().isReady() && BillingController.PREMIUM_PRODUCT_DETAILS != null) {
            int size3 = arrayList.size();
            boolean z4 = false;
            int i12 = 0;
            long j11 = 0;
            while (i12 < size3) {
                Object obj2 = arrayList.get(i12);
                i12++;
                xw0 xw0Var3 = (xw0) obj2;
                xw0Var3.f = BillingController.PREMIUM_PRODUCT_DETAILS;
                if (xw0Var3.i() > j11) {
                    j11 = xw0Var3.i();
                }
                xw0Var3.a();
                if (xw0Var3.g != null) {
                    z4 = true;
                }
            }
            if (z4) {
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    xw0 xw0Var4 = (xw0) arrayList.get(i13);
                    xw0Var4.a();
                    if (xw0Var4.g == null) {
                        arrayList.remove(i13);
                        i13--;
                    }
                    i13++;
                }
            }
            int size4 = arrayList.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj3 = arrayList.get(i14);
                i14++;
                ((xw0) obj3).e = j11;
            }
        }
        if (premiumPreviewFragment.e == -1) {
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                if (((xw0) arrayList.get(i15)).a.months == 12) {
                    premiumPreviewFragment.e = i15;
                    break;
                }
                i15++;
            }
            if (premiumPreviewFragment.e == -1) {
                premiumPreviewFragment.e = 0;
            }
        }
        premiumPreviewFragment.t0(false);
        this.e.getAdapter().l();
    }

    public final void b() {
        PremiumPreviewFragment premiumPreviewFragment = this.n;
        int i10 = premiumPreviewFragment.d0;
        TextView textView = this.a;
        TextView textView2 = this.b;
        if (i10 == 0) {
            textView.setText(LocaleController.getString(premiumPreviewFragment.m0 ? R.string.TelegramPremiumSubscribedTitle : R.string.TelegramPremium));
            org.telegram.messenger.y3.q((premiumPreviewFragment.getUserConfig().isPremium() || premiumPreviewFragment.m0) ? R.string.TelegramPremiumSubscribedSubtitle : R.string.TelegramPremiumSubtitle, textView2);
        } else if (i10 == 1) {
            textView.setText(LocaleController.getString(premiumPreviewFragment.m0 ? R.string.TelegramPremiumSubscribedTitle : R.string.TelegramBusiness));
            org.telegram.messenger.y3.q((premiumPreviewFragment.getUserConfig().isPremium() || premiumPreviewFragment.m0) ? R.string.TelegramBusinessSubscribedSubtitleTemp : R.string.TelegramBusinessSubtitleTemp, textView2);
        }
        textView2.getLayoutParams().width = Math.min(AndroidUtilities.displaySize.x - AndroidUtilities.dp(42.0f), qh.e3.a(textView2.getText(), textView2.getPaint()));
        boolean z4 = premiumPreviewFragment.m0 || BuildVars.IS_BILLING_UNAVAILABLE || premiumPreviewFragment.d.size() <= 1;
        boolean z10 = this.f;
        sw0 sw0Var = this.e;
        if (!z10 || !z4) {
            sw0Var.setVisibility(z4 ? 8 : 0);
            this.f = true;
        } else if (sw0Var.getVisibility() == 0 && z4 && this.h == z4) {
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
            duration.addUpdateListener(new qw0(this, sw0Var, duration, r2));
            duration.addListener(new org.telegram.ui.Components.ex0(7, this, sw0Var));
            duration.setInterpolator(org.telegram.ui.Components.pr.f);
            duration.start();
        }
        this.h = !z4;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
