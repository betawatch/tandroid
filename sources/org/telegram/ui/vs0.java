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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class vs0 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final FrameLayout c;
    public final di.bc d;
    public final br0 e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ PremiumPreviewFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i7 = premiumPreviewFragment.h0;
        int i10 = i7 == 1 ? org.telegram.messenger.ls.F2 : org.telegram.messenger.ls.U2;
        addView(frameLayout, c8.ma.r(i10, i10, 1));
        di.bc bcVar = new di.bc(this, context, premiumPreviewFragment.i0 ? 1 : 0, i7 == 1 ? 1 : 0, context);
        this.d = bcVar;
        frameLayout.addView(bcVar, c8.ma.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        addView(textView, c8.ma.q(-2, -2, 0.0f, 1, 16, i7 == 1 ? 8 : 20, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, c8.ma.q(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        br0 br0Var = new br0(this, context);
        this.e = br0Var;
        br0Var.setOverScrollMode(2);
        br0Var.setLayoutManager(new v4.c0());
        br0Var.setAdapter(new us0(this, context));
        br0Var.setOnItemClickListener(new h(this, 25));
        final Path path = new Path();
        final float[] fArr = new float[8];
        br0Var.setSelectorTransformer(new q0.a() { // from class: org.telegram.ui.rs0
            @Override // q0.a
            public final void accept(Object obj) {
                Canvas canvas = (Canvas) obj;
                br0 br0Var2 = vs0.this.e;
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
        addView(br0Var, c8.ma.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
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
                xs0 xs0Var = new xs0(tL_premiumSubscriptionOption2);
                arrayList.add(xs0Var);
                if (premiumPreviewFragment.k0 && tL_premiumSubscriptionOption2.months == 12) {
                    premiumPreviewFragment.e = arrayList.size() - 1;
                }
                if (tL_premiumSubscriptionOption2.current) {
                    premiumPreviewFragment.f = xs0Var;
                }
                if (org.telegram.messenger.s2.b() && xs0Var.i() > j3) {
                    j3 = xs0Var.i();
                }
            }
        } else {
            j3 = 0;
        }
        if (org.telegram.messenger.s2.b() && premiumPreviewFragment.getUserConfig().q()) {
            arrayList.clear();
            premiumPreviewFragment.f = null;
        } else {
            if (!org.telegram.messenger.s2.b() && premiumPreviewFragment.f != null) {
                String str = org.telegram.messenger.r1.i().e;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = premiumPreviewFragment.f.a;
            }
            xs0 xs0Var2 = premiumPreviewFragment.f;
            if (xs0Var2 != null) {
            }
        }
        if (org.telegram.messenger.s2.b()) {
            int size2 = arrayList.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList.get(i10);
                i10++;
                ((xs0) obj).e = j3;
            }
        } else if (org.telegram.messenger.r1.i().k() && org.telegram.messenger.r1.l != null) {
            int size3 = arrayList.size();
            boolean z10 = false;
            int i11 = 0;
            long j10 = 0;
            while (i11 < size3) {
                Object obj2 = arrayList.get(i11);
                i11++;
                xs0 xs0Var3 = (xs0) obj2;
                xs0Var3.f = org.telegram.messenger.r1.l;
                if (xs0Var3.i() > j10) {
                    j10 = xs0Var3.i();
                }
                xs0Var3.a();
                if (xs0Var3.g != null) {
                    z10 = true;
                }
            }
            if (z10) {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    xs0 xs0Var4 = (xs0) arrayList.get(i12);
                    xs0Var4.a();
                    if (xs0Var4.g == null) {
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
                ((xs0) obj3).e = j10;
            }
        }
        if (premiumPreviewFragment.e == -1) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                if (((xs0) arrayList.get(i14)).a.months == 12) {
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
        br0 br0Var;
        PremiumPreviewFragment premiumPreviewFragment = this.n;
        int i7 = premiumPreviewFragment.h0;
        TextView textView = this.a;
        TextView textView2 = this.b;
        if (i7 == 0) {
            textView.setText(org.telegram.messenger.hd.N0(premiumPreviewFragment.q0 ? 2131743985 : 2131743988, null));
            textView2.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0((premiumPreviewFragment.getUserConfig().q() || premiumPreviewFragment.q0) ? 2131743986 : 2131743984, null)));
        } else if (i7 == 1) {
            textView.setText(org.telegram.messenger.hd.N0(premiumPreviewFragment.q0 ? 2131743985 : 2131744009, null));
            textView2.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0((premiumPreviewFragment.getUserConfig().q() || premiumPreviewFragment.q0) ? 2131744007 : 2131744004, null)));
        }
        textView2.getLayoutParams().width = Math.min(org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(42.0f), hi.l3.a(textView2.getText(), textView2.getPaint()));
        if (!premiumPreviewFragment.q0) {
            boolean z12 = org.telegram.messenger.s2.a;
            if (premiumPreviewFragment.d.size() > 1) {
                z10 = false;
                z11 = this.f;
                br0Var = this.e;
                if (z11 || !z10) {
                    br0Var.setVisibility(z10 ? 8 : 0);
                    this.f = true;
                } else if (br0Var.getVisibility() == 0 && z10 && this.h == z10) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                    duration.addUpdateListener(new ss0(this, br0Var, duration, r2));
                    duration.addListener(new org.telegram.ui.Components.h10(13, this, br0Var));
                    duration.setInterpolator(org.telegram.ui.Components.nr.f);
                    duration.start();
                }
                this.h = !z10;
            }
        }
        z10 = true;
        z11 = this.f;
        br0Var = this.e;
        if (z11) {
        }
        br0Var.setVisibility(z10 ? 8 : 0);
        this.f = true;
        this.h = !z10;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
