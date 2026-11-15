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
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class rs0 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final FrameLayout c;
    public final di.xb d;
    public final zq0 e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ PremiumPreviewFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i7 = premiumPreviewFragment.h0;
        int i10 = i7 == 1 ? org.telegram.messenger.ns.F2 : org.telegram.messenger.ns.U2;
        addView(frameLayout, c8.ja.r(i10, i10, 1));
        di.xb xbVar = new di.xb(this, context, premiumPreviewFragment.i0 ? 1 : 0, i7 == 1 ? 1 : 0, context);
        this.d = xbVar;
        frameLayout.addView(xbVar, c8.ja.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        addView(textView, c8.ja.q(-2, -2, 0.0f, 1, 16, i7 == 1 ? 8 : 20, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, c8.ja.q(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        zq0 zq0Var = new zq0(this, context);
        this.e = zq0Var;
        zq0Var.setOverScrollMode(2);
        zq0Var.setLayoutManager(new v4.b0());
        zq0Var.setAdapter(new qs0(this, context));
        zq0Var.setOnItemClickListener(new h(this, 25));
        final Path path = new Path();
        final float[] fArr = new float[8];
        zq0Var.setSelectorTransformer(new q0.a() { // from class: org.telegram.ui.ns0
            @Override // q0.a
            public final void accept(Object obj) {
                Canvas canvas = (Canvas) obj;
                zq0 zq0Var2 = rs0.this.e;
                View pressedChildView = zq0Var2.getPressedChildView();
                int b10 = pressedChildView == null ? -1 : zq0Var2.T(pressedChildView).b();
                Path path2 = path;
                path2.rewind();
                Rect selectorRect = zq0Var2.getSelectorRect();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr2 = fArr;
                Arrays.fill(fArr2, 0.0f);
                if (b10 == 0) {
                    Arrays.fill(fArr2, 0, 4, org.telegram.messenger.g0.L(12.0f));
                }
                if (b10 == zq0Var2.getAdapter().b() - 1) {
                    Arrays.fill(fArr2, 4, 8, org.telegram.messenger.g0.L(12.0f));
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addView(zq0Var, c8.ja.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00c0, code lost:
    
        if (j$.util.Objects.equals(r5, (r7 == null || (r7 = r7.transaction) == null) ? null : r7.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1")) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00cc, code lost:
    
        r2.clear();
        r1.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00ca, code lost:
    
        if (r5.a.months == 12) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        long j3;
        PremiumPreviewFragment premiumPreviewFragment = this.n;
        ArrayList arrayList = premiumPreviewFragment.d;
        arrayList.clear();
        premiumPreviewFragment.e = -1;
        premiumPreviewFragment.f = null;
        if (premiumPreviewFragment.getMediaDataController().E != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = premiumPreviewFragment.getMediaDataController().E.period_options;
            int size = arrayList2.size();
            int i7 = 0;
            j3 = 0;
            while (i7 < size) {
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i7);
                i7++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
                if (premiumPreviewFragment.getUserConfig().q() && !tL_premiumSubscriptionOption2.can_purchase_upgrade && !tL_premiumSubscriptionOption2.current) {
                }
                ts0 ts0Var = new ts0(tL_premiumSubscriptionOption2);
                arrayList.add(ts0Var);
                if (premiumPreviewFragment.k0 && tL_premiumSubscriptionOption2.months == 12) {
                    premiumPreviewFragment.e = arrayList.size() - 1;
                }
                if (tL_premiumSubscriptionOption2.current) {
                    premiumPreviewFragment.f = ts0Var;
                }
                if (org.telegram.messenger.r2.b() && ts0Var.i() > j3) {
                    j3 = ts0Var.i();
                }
            }
        } else {
            j3 = 0;
        }
        if (org.telegram.messenger.r2.b() && premiumPreviewFragment.getUserConfig().q()) {
            arrayList.clear();
            premiumPreviewFragment.f = null;
        } else {
            if (!org.telegram.messenger.r2.b() && premiumPreviewFragment.f != null) {
                String str = org.telegram.messenger.r1.i().e;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = premiumPreviewFragment.f.a;
            }
            ts0 ts0Var2 = premiumPreviewFragment.f;
            if (ts0Var2 != null) {
            }
        }
        if (org.telegram.messenger.r2.b()) {
            int size2 = arrayList.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList.get(i10);
                i10++;
                ((ts0) obj).e = j3;
            }
        } else if (org.telegram.messenger.r1.i().k() && org.telegram.messenger.r1.l != null) {
            int size3 = arrayList.size();
            boolean z10 = false;
            int i11 = 0;
            long j10 = 0;
            while (i11 < size3) {
                Object obj2 = arrayList.get(i11);
                i11++;
                ts0 ts0Var3 = (ts0) obj2;
                ts0Var3.f = org.telegram.messenger.r1.l;
                if (ts0Var3.i() > j10) {
                    j10 = ts0Var3.i();
                }
                ts0Var3.a();
                if (ts0Var3.g != null) {
                    z10 = true;
                }
            }
            if (z10) {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    ts0 ts0Var4 = (ts0) arrayList.get(i12);
                    ts0Var4.a();
                    if (ts0Var4.g == null) {
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
            }
            int size4 = arrayList.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj3 = arrayList.get(i13);
                i13++;
                ((ts0) obj3).e = j10;
            }
        }
        if (premiumPreviewFragment.e == -1) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                if (((ts0) arrayList.get(i14)).a.months == 12) {
                    premiumPreviewFragment.e = i14;
                    break;
                }
                i14++;
            }
            if (premiumPreviewFragment.e == -1) {
                premiumPreviewFragment.e = 0;
            }
        }
        premiumPreviewFragment.y0(false);
        this.e.getAdapter().f();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z10;
        boolean z11;
        zq0 zq0Var;
        PremiumPreviewFragment premiumPreviewFragment = this.n;
        int i7 = premiumPreviewFragment.h0;
        TextView textView = this.a;
        TextView textView2 = this.b;
        if (i7 == 0) {
            textView.setText(org.telegram.messenger.hd.M0(premiumPreviewFragment.q0 ? 2131744228 : 2131744231, null));
            textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0((premiumPreviewFragment.getUserConfig().q() || premiumPreviewFragment.q0) ? 2131744229 : 2131744227, null)));
        } else if (i7 == 1) {
            textView.setText(org.telegram.messenger.hd.M0(premiumPreviewFragment.q0 ? 2131744228 : 2131744252, null));
            textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0((premiumPreviewFragment.getUserConfig().q() || premiumPreviewFragment.q0) ? 2131744250 : 2131744247, null)));
        }
        textView2.getLayoutParams().width = Math.min(org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(42.0f), hi.l3.a(textView2.getText(), textView2.getPaint()));
        if (!premiumPreviewFragment.q0) {
            boolean z12 = org.telegram.messenger.r2.a;
            if (premiumPreviewFragment.d.size() > 1) {
                z10 = false;
                z11 = this.f;
                zq0Var = this.e;
                if (z11 || !z10) {
                    zq0Var.setVisibility(z10 ? 8 : 0);
                    this.f = true;
                } else if (zq0Var.getVisibility() == 0 && z10 && this.h == z10) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                    duration.addUpdateListener(new os0(this, zq0Var, duration, r2));
                    duration.addListener(new org.telegram.ui.Components.y50(12, this, zq0Var));
                    duration.setInterpolator(org.telegram.ui.Components.er.f);
                    duration.start();
                }
                this.h = !z10;
            }
        }
        z10 = true;
        z11 = this.f;
        zq0Var = this.e;
        if (z11) {
        }
        zq0Var.setVisibility(z10 ? 8 : 0);
        this.f = true;
        this.h = !z10;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
