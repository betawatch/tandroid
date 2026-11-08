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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class us0 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final FrameLayout c;
    public final bi.qd d;
    public final br0 e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ PremiumPreviewFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i7 = premiumPreviewFragment.g0;
        int i10 = i7 == 1 ? org.telegram.messenger.qs.F2 : org.telegram.messenger.qs.U2;
        addView(frameLayout, c8.ha.r(i10, i10, 1));
        bi.qd qdVar = new bi.qd(this, context, premiumPreviewFragment.h0 ? 1 : 0, i7 == 1 ? 1 : 0, context);
        this.d = qdVar;
        frameLayout.addView(qdVar, c8.ha.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        addView(textView, c8.ha.q(-2, -2, 0.0f, 1, 16, i7 == 1 ? 8 : 20, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, c8.ha.q(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        br0 br0Var = new br0(this, context);
        this.e = br0Var;
        br0Var.setOverScrollMode(2);
        br0Var.setLayoutManager(new v4.b0());
        br0Var.setAdapter(new ts0(this, context));
        br0Var.setOnItemClickListener(new h(this, 25));
        final Path path = new Path();
        final float[] fArr = new float[8];
        br0Var.setSelectorTransformer(new q0.a() { // from class: org.telegram.ui.qs0
            @Override // q0.a
            public final void accept(Object obj) {
                Canvas canvas = (Canvas) obj;
                br0 br0Var2 = us0.this.e;
                View pressedChildView = br0Var2.getPressedChildView();
                int b10 = pressedChildView == null ? -1 : br0Var2.T(pressedChildView).b();
                Path path2 = path;
                path2.rewind();
                Rect selectorRect = br0Var2.getSelectorRect();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr2 = fArr;
                Arrays.fill(fArr2, 0.0f);
                if (b10 == 0) {
                    Arrays.fill(fArr2, 0, 4, org.telegram.messenger.g0.L(12.0f));
                }
                if (b10 == br0Var2.getAdapter().b() - 1) {
                    Arrays.fill(fArr2, 4, 8, org.telegram.messenger.g0.L(12.0f));
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addView(br0Var, c8.ha.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
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
        if (premiumPreviewFragment.getMediaDataController().D != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = premiumPreviewFragment.getMediaDataController().D.period_options;
            int size = arrayList2.size();
            int i7 = 0;
            j3 = 0;
            while (i7 < size) {
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i7);
                i7++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
                if (premiumPreviewFragment.getUserConfig().q() && !tL_premiumSubscriptionOption2.can_purchase_upgrade && !tL_premiumSubscriptionOption2.current) {
                }
                ws0 ws0Var = new ws0(tL_premiumSubscriptionOption2);
                arrayList.add(ws0Var);
                if (premiumPreviewFragment.j0 && tL_premiumSubscriptionOption2.months == 12) {
                    premiumPreviewFragment.e = arrayList.size() - 1;
                }
                if (tL_premiumSubscriptionOption2.current) {
                    premiumPreviewFragment.f = ws0Var;
                }
                if (org.telegram.messenger.r2.b() && ws0Var.i() > j3) {
                    j3 = ws0Var.i();
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
            ws0 ws0Var2 = premiumPreviewFragment.f;
            if (ws0Var2 != null) {
            }
        }
        if (org.telegram.messenger.r2.b()) {
            int size2 = arrayList.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList.get(i10);
                i10++;
                ((ws0) obj).e = j3;
            }
        } else if (org.telegram.messenger.r1.i().k() && org.telegram.messenger.r1.l != null) {
            int size3 = arrayList.size();
            boolean z9 = false;
            int i11 = 0;
            long j10 = 0;
            while (i11 < size3) {
                Object obj2 = arrayList.get(i11);
                i11++;
                ws0 ws0Var3 = (ws0) obj2;
                ws0Var3.f = org.telegram.messenger.r1.l;
                if (ws0Var3.i() > j10) {
                    j10 = ws0Var3.i();
                }
                ws0Var3.a();
                if (ws0Var3.g != null) {
                    z9 = true;
                }
            }
            if (z9) {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    ws0 ws0Var4 = (ws0) arrayList.get(i12);
                    ws0Var4.a();
                    if (ws0Var4.g == null) {
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
                ((ws0) obj3).e = j10;
            }
        }
        if (premiumPreviewFragment.e == -1) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                if (((ws0) arrayList.get(i14)).a.months == 12) {
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
        boolean z9;
        boolean z10;
        br0 br0Var;
        PremiumPreviewFragment premiumPreviewFragment = this.n;
        int i7 = premiumPreviewFragment.g0;
        TextView textView = this.a;
        TextView textView2 = this.b;
        if (i7 == 0) {
            textView.setText(org.telegram.messenger.id.M0(premiumPreviewFragment.p0 ? 2131744231 : 2131744234, null));
            textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0((premiumPreviewFragment.getUserConfig().q() || premiumPreviewFragment.p0) ? 2131744232 : 2131744230, null)));
        } else if (i7 == 1) {
            textView.setText(org.telegram.messenger.id.M0(premiumPreviewFragment.p0 ? 2131744231 : 2131744255, null));
            textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0((premiumPreviewFragment.getUserConfig().q() || premiumPreviewFragment.p0) ? 2131744253 : 2131744250, null)));
        }
        textView2.getLayoutParams().width = Math.min(org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(42.0f), fi.m3.a(textView2.getText(), textView2.getPaint()));
        if (!premiumPreviewFragment.p0) {
            boolean z11 = org.telegram.messenger.r2.a;
            if (premiumPreviewFragment.d.size() > 1) {
                z9 = false;
                z10 = this.f;
                br0Var = this.e;
                if (z10 || !z9) {
                    br0Var.setVisibility(z9 ? 8 : 0);
                    this.f = true;
                } else if (br0Var.getVisibility() == 0 && z9 && this.h == z9) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                    duration.addUpdateListener(new rs0(r2, br0Var, this, duration));
                    duration.addListener(new org.telegram.ui.Components.v50(12, this, br0Var));
                    duration.setInterpolator(org.telegram.ui.Components.xq.f);
                    duration.start();
                }
                this.h = !z9;
            }
        }
        z9 = true;
        z10 = this.f;
        br0Var = this.e;
        if (z10) {
        }
        br0Var.setVisibility(z9 ? 8 : 0);
        this.f = true;
        this.h = !z9;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
