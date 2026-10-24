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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class rw0 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final FrameLayout c;
    public final nw0 d;
    public final ow0 e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ PremiumPreviewFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i10 = premiumPreviewFragment.g0;
        int i11 = i10 == 1 ? 175 : 190;
        addView(frameLayout, w7.z5.q(i11, i11, 1));
        nw0 nw0Var = new nw0(this, context, premiumPreviewFragment.h0 ? 1 : 0, i10 == 1 ? 1 : 0, context);
        this.d = nw0Var;
        frameLayout.addView(nw0Var, w7.z5.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, w7.z5.p(-2, -2, 0.0f, 1, 16, i10 == 1 ? 8 : 20, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, w7.z5.p(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        ow0 ow0Var = new ow0(this, context);
        this.e = ow0Var;
        ow0Var.setOverScrollMode(2);
        ow0Var.setLayoutManager(new s4.b0());
        ow0Var.setAdapter(new qw0(this, context));
        ow0Var.setOnItemClickListener(new h(this, 26));
        final Path path = new Path();
        final float[] fArr = new float[8];
        ow0Var.setSelectorTransformer(new q0.a() { // from class: org.telegram.ui.lw0
            @Override // q0.a
            public final void accept(Object obj) {
                Canvas canvas = (Canvas) obj;
                ow0 ow0Var2 = rw0.this.e;
                View pressedChildView = ow0Var2.getPressedChildView();
                int b10 = pressedChildView == null ? -1 : ow0Var2.T(pressedChildView).b();
                Path path2 = path;
                path2.rewind();
                Rect selectorRect = ow0Var2.getSelectorRect();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr2 = fArr;
                Arrays.fill(fArr2, 0.0f);
                if (b10 == 0) {
                    Arrays.fill(fArr2, 0, 4, AndroidUtilities.dp(12.0f));
                }
                if (b10 == ow0Var2.getAdapter().h() - 1) {
                    Arrays.fill(fArr2, 4, 8, AndroidUtilities.dp(12.0f));
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addView(ow0Var, w7.z5.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
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
            int i10 = 0;
            j10 = 0;
            while (i10 < size) {
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i10);
                i10++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
                if (premiumPreviewFragment.getUserConfig().isPremium() && !tL_premiumSubscriptionOption2.can_purchase_upgrade && !tL_premiumSubscriptionOption2.current) {
                }
                tw0 tw0Var = new tw0(tL_premiumSubscriptionOption2);
                arrayList.add(tw0Var);
                if (premiumPreviewFragment.j0 && tL_premiumSubscriptionOption2.months == 12) {
                    premiumPreviewFragment.e = arrayList.size() - 1;
                }
                if (tL_premiumSubscriptionOption2.current) {
                    premiumPreviewFragment.f = tw0Var;
                }
                if (BuildVars.useInvoiceBilling() && tw0Var.i() > j10) {
                    j10 = tw0Var.i();
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
            tw0 tw0Var2 = premiumPreviewFragment.f;
            if (tw0Var2 != null) {
            }
        }
        if (BuildVars.useInvoiceBilling()) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ((tw0) obj).e = j10;
            }
        } else if (BillingController.getInstance().isReady() && BillingController.PREMIUM_PRODUCT_DETAILS != null) {
            int size3 = arrayList.size();
            boolean z10 = false;
            int i12 = 0;
            long j11 = 0;
            while (i12 < size3) {
                Object obj2 = arrayList.get(i12);
                i12++;
                tw0 tw0Var3 = (tw0) obj2;
                tw0Var3.f = BillingController.PREMIUM_PRODUCT_DETAILS;
                if (tw0Var3.i() > j11) {
                    j11 = tw0Var3.i();
                }
                tw0Var3.a();
                if (tw0Var3.g != null) {
                    z10 = true;
                }
            }
            if (z10) {
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    tw0 tw0Var4 = (tw0) arrayList.get(i13);
                    tw0Var4.a();
                    if (tw0Var4.g == null) {
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
                ((tw0) obj3).e = j11;
            }
        }
        if (premiumPreviewFragment.e == -1) {
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                if (((tw0) arrayList.get(i15)).a.months == 12) {
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
        int i10 = premiumPreviewFragment.g0;
        TextView textView = this.a;
        TextView textView2 = this.b;
        if (i10 == 0) {
            textView.setText(LocaleController.getString(premiumPreviewFragment.p0 ? R.string.TelegramPremiumSubscribedTitle : R.string.TelegramPremium));
            org.telegram.messenger.v0.m((premiumPreviewFragment.getUserConfig().isPremium() || premiumPreviewFragment.p0) ? R.string.TelegramPremiumSubscribedSubtitle : R.string.TelegramPremiumSubtitle, textView2);
        } else if (i10 == 1) {
            textView.setText(LocaleController.getString(premiumPreviewFragment.p0 ? R.string.TelegramPremiumSubscribedTitle : R.string.TelegramBusiness));
            org.telegram.messenger.v0.m((premiumPreviewFragment.getUserConfig().isPremium() || premiumPreviewFragment.p0) ? R.string.TelegramBusinessSubscribedSubtitleTemp : R.string.TelegramBusinessSubtitleTemp, textView2);
        }
        textView2.getLayoutParams().width = Math.min(AndroidUtilities.displaySize.x - AndroidUtilities.dp(42.0f), ei.x3.a(textView2.getText(), textView2.getPaint()));
        boolean z10 = premiumPreviewFragment.p0 || BuildVars.IS_BILLING_UNAVAILABLE || premiumPreviewFragment.d.size() <= 1;
        boolean z11 = this.f;
        ow0 ow0Var = this.e;
        if (!z11 || !z10) {
            ow0Var.setVisibility(z10 ? 8 : 0);
            this.f = true;
        } else if (ow0Var.getVisibility() == 0 && z10 && this.h == z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
            duration.addUpdateListener(new mw0(this, ow0Var, duration, r2));
            duration.addListener(new org.telegram.ui.Components.ql0(11, this, ow0Var));
            duration.setInterpolator(org.telegram.ui.Components.bs.f);
            duration.start();
        }
        this.h = !z10;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
