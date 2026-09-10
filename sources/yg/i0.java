package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.a2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.eo;
import org.telegram.ui.wj;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i0 extends FrameLayout {
    public final /* synthetic */ p2 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ eo e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float v;
    public final /* synthetic */ p0 w;
    public final /* synthetic */ l0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, Context context, p2 p2Var, View view, boolean z10, MessageObject messageObject, eo eoVar, int i10, int i11, boolean z11, float f7, float f10, float f11, p0 p0Var) {
        super(context);
        this.x = l0Var;
        this.a = p2Var;
        this.b = view;
        this.c = z10;
        this.d = messageObject;
        this.e = eoVar;
        this.f = i10;
        this.h = i11;
        this.n = z11;
        this.r = f7;
        this.s = f10;
        this.v = f11;
        this.w = p0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x038f, code lost:
    
        if (r23.x.c.getImageReceiver().getLottieAnimation().l0 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03ab, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r23.x.y) <= 2000) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0558, code lost:
    
        if (((int) org.telegram.messenger.em.c(r23.x.b.getImageReceiver().getLottieAnimation().b0, r23.x.b.getImageReceiver().getLottieAnimation().e[0], r8, r8)) < r6.b) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03d5, code lost:
    
        if (r23.x.b.getImageReceiver().getLottieAnimation().l0 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x03ea, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r23.x.y) > 2000) goto L199;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02dd  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int dp;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i10;
        float f17;
        float f18;
        float f19;
        float y3;
        float f20;
        n0 n0Var;
        int paddingTop;
        eo eoVar;
        MessageObject messageObject;
        l0 l0Var = this.x;
        if (l0Var.l) {
            float f21 = l0Var.m;
            if (f21 != 1.0f) {
                float f22 = f21 + 0.10666667f;
                l0Var.m = f22;
                if (f22 > 1.0f) {
                    l0Var.m = 1.0f;
                    final int i11 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: yg.h0
                        public final /* synthetic */ i0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    this.b.x.c();
                                    break;
                                default:
                                    this.b.x.c();
                                    break;
                            }
                        }
                    });
                }
            }
            float f23 = this.x.m;
            if (f23 != 1.0f) {
                setAlpha(1.0f - f23);
                super.dispatchDraw(canvas);
            }
            invalidate();
            return;
        }
        if (!l0Var.s) {
            invalidate();
            return;
        }
        nk0 nk0Var = l0Var.t;
        if (nk0Var != null) {
            nk0Var.a.setAlpha(0.0f);
            this.x.t.c.setAlpha(0.0f);
        }
        p2 p2Var = this.a;
        if (p2Var instanceof eo) {
            eo eoVar2 = (eo) p2Var;
            int i12 = this.x.n;
            wj wjVar = eoVar2.x0;
            if (wjVar != null) {
                int childCount = wjVar.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    view = eoVar2.x0.getChildAt(i13);
                    if (view instanceof t1) {
                        messageObject = ((t1) view).getMessageObject();
                    } else if (view instanceof w0) {
                        messageObject = ((w0) view).getMessageObject();
                    } else {
                        continue;
                    }
                    if (messageObject != null && messageObject.getId() == i12) {
                        break;
                    }
                }
            }
            view = null;
        } else {
            view = this.b;
        }
        if (this.c) {
            dp = AndroidUtilities.dp(SharedConfig.deviceIsHigh() ? 120.0f : 50.0f);
        } else {
            MessageObject messageObject2 = this.d;
            dp = (messageObject2 == null || !messageObject2.shouldDrawReactionsInLayout()) ? AndroidUtilities.dp(14.0f) : AndroidUtilities.dp(20.0f);
        }
        float f24 = dp;
        if (view != null) {
            view.getLocationInWindow(this.x.j);
            l0 l0Var2 = this.x;
            int[] iArr = l0Var2.j;
            f10 = iArr[0];
            f11 = iArr[1];
            if (view instanceof t1) {
                t1 t1Var = (t1) view;
                f7 = 0.10666667f;
                n0Var = t1Var.N.m(l0Var2.p);
                if (t1Var.J && !t1Var.f4()) {
                    f11 += AndroidUtilities.dp(2.0f);
                }
                paddingTop = t1Var.getPaddingTop();
            } else {
                f7 = 0.10666667f;
                if (view instanceof w0) {
                    n0Var = ((w0) view).C0.m(l0Var2.p);
                    paddingTop = view.getPaddingTop();
                } else {
                    if (view instanceof kh.c) {
                        f10 += ((kh.c) view).getReactionCenterX();
                        f11 += view.getMeasuredHeight() / 2.0f;
                    }
                    n0Var = null;
                    if (n0Var != null) {
                        Rect rect = n0Var.t;
                        f10 += rect.left;
                        f11 += rect.top;
                    }
                    eoVar = this.e;
                    if (eoVar != null) {
                        f11 += eoVar.ya;
                    }
                    l0 l0Var3 = this.x;
                    l0Var3.q = f10;
                    l0Var3.r = f11;
                }
            }
            f11 += paddingTop;
            if (n0Var != null) {
            }
            eoVar = this.e;
            if (eoVar != null) {
            }
            l0 l0Var32 = this.x;
            l0Var32.q = f10;
            l0Var32.r = f11;
        } else {
            f7 = 0.10666667f;
            if (this.c) {
                float f25 = f24 / 2.0f;
                f10 = (getMeasuredWidth() / 2.0f) - f25;
                f11 = (getMeasuredHeight() / 2.0f) - f25;
            } else {
                l0 l0Var4 = this.x;
                f10 = l0Var4.q;
                f11 = l0Var4.r;
            }
        }
        p2 p2Var2 = this.a;
        if (p2Var2 != null && p2Var2.getParentActivity() != null && this.a.getFragmentView() != null && this.a.getFragmentView().getParent() != null && this.a.getFragmentView().getVisibility() == 0 && this.a.getFragmentView() != null) {
            this.a.getFragmentView().getLocationOnScreen(this.x.j);
            setAlpha(((View) this.a.getFragmentView().getParent()).getAlpha());
        } else if (!this.c && !(view instanceof kh.c)) {
            return;
        }
        float f26 = (view instanceof kh.c ? this.f : this.f - f24) / 2.0f;
        float f27 = f10 - f26;
        float f28 = f11 - f26;
        if (this.c && this.h == 0) {
            f27 += AndroidUtilities.dp(40.0f);
        }
        if (this.h != 1 && !this.c) {
            float f29 = this.x.j[0];
            if (f27 < f29) {
                f27 = f29;
            }
            if (this.f + f27 > getMeasuredWidth() + r12) {
                f27 = (getMeasuredWidth() + this.x.j[0]) - this.f;
            }
        }
        wr wrVar = wr.f;
        float interpolation = wrVar.getInterpolation(this.x.h);
        if (this.h == 2) {
            f13 = wr.h.getInterpolation(interpolation);
            f14 = wrVar.getInterpolation(interpolation);
            f12 = 2.0f;
        } else if (this.n) {
            f12 = 2.0f;
            f13 = wr.h.getInterpolation(this.x.g);
            f14 = wrVar.getInterpolation(this.x.g);
        } else {
            f12 = 2.0f;
            f13 = this.x.g;
            f14 = f13;
        }
        float f30 = 1.0f - f13;
        float f31 = (this.r * f30) + f13;
        float f32 = f24 / this.f;
        if (this.h == 1) {
            f31 = 1.0f;
        } else {
            f27 = (f27 * f13) + (this.s * f30);
            f28 = (f28 * f14) + ((1.0f - f14) * this.v);
        }
        this.x.b.setTranslationX(f27);
        this.x.b.setTranslationY(f28);
        float f33 = 1.0f - interpolation;
        this.x.b.setAlpha(f33);
        this.x.b.setScaleX(f31);
        this.x.b.setScaleY(f31);
        int i14 = this.h;
        if (i14 != 2) {
            if (interpolation != 0.0f) {
                f31 = (f31 * f33) + (f32 * interpolation);
                f27 = (f27 * f33) + (f10 * interpolation);
                f15 = f28 * f33;
                f16 = f11 * interpolation;
            }
            if (i14 != 1) {
                if (this.c) {
                    this.x.d.setAlpha(1.0f);
                } else {
                    this.x.d.setAlpha(interpolation > 0.7f ? (interpolation - 0.7f) / 0.3f : 0.0f);
                }
            }
            if (this.h == 0 && this.c) {
                this.x.c.setAlpha(f33);
            }
            this.x.e.setTranslationX(f27);
            this.x.e.setTranslationY(f28);
            this.x.e.setScaleX(f31);
            this.x.e.setScaleY(f31);
            super.dispatchDraw(canvas);
            i10 = this.h;
            if (i10 != 1 || this.x.c.G) {
                l0 l0Var5 = this.x;
                f17 = l0Var5.g;
                if (f17 != 1.0f) {
                    if (this.n) {
                        l0Var5.g = f17 + 0.045714285f;
                    } else {
                        l0Var5.g = f17 + 0.07272727f;
                    }
                    if (l0Var5.g > 1.0f) {
                        l0Var5.g = 1.0f;
                    }
                }
            }
            if (i10 != 2) {
                l0 l0Var6 = this.x;
                if (!l0Var6.u || i10 != 0) {
                    if (i10 != 1) {
                        j0 j0Var = l0Var6.c;
                        if (j0Var.G) {
                            if (j0Var.getImageReceiver().getLottieAnimation() != null) {
                            }
                        }
                    }
                    if (this.w.g != 0) {
                        f18 = 0.7f;
                    } else {
                        f18 = 0.7f;
                    }
                    if (this.h == 1) {
                        j0 j0Var2 = this.x.b;
                        if (j0Var2.G) {
                            if (j0Var2.getImageReceiver().getLottieAnimation() != null) {
                            }
                        }
                    }
                    if (this.w.g != 0) {
                    }
                    if (!this.x.x.isEmpty()) {
                        j0 j0Var3 = this.x.b;
                        if (j0Var3.G) {
                            hj0 lottieAnimation = j0Var3.getImageReceiver().getLottieAnimation();
                            int i15 = 0;
                            while (i15 < this.x.x.size()) {
                                k0 k0Var = (k0) this.x.x.get(i15);
                                float f34 = k0Var.c;
                                if (lottieAnimation != null && lottieAnimation.l0) {
                                    float r10 = this.x.b.getImageReceiver().getLottieAnimation().r();
                                }
                                float f35 = k0Var.d;
                                if (f35 != 1.0f) {
                                    float f36 = f35 + f7;
                                    k0Var.d = f36;
                                    if (f36 > 1.0f) {
                                        k0Var.d = 1.0f;
                                        this.x.x.remove(i15);
                                        i15--;
                                        i15++;
                                    }
                                }
                                if (f34 < 0.5f) {
                                    y3 = f34 / 0.5f;
                                    f19 = 1.0f;
                                } else {
                                    f19 = 1.0f;
                                    y3 = a2.y(f34, 0.5f, 0.5f, 1.0f);
                                }
                                float f37 = (f19 - f34) * 0.5f;
                                float f38 = (k0Var.f * f34) + f37;
                                float f39 = ((k0Var.g * f34) + f37) - (k0Var.e * y3);
                                float f40 = (1.0f - k0Var.d) * k0Var.h * f34;
                                float scaleX = (this.x.b.getScaleX() * this.x.b.getWidth() * f38) + this.x.b.getX();
                                float scaleY = (this.x.b.getScaleY() * this.x.b.getHeight() * f39) + this.x.b.getY();
                                int dp2 = AndroidUtilities.dp(16.0f);
                                float f41 = dp2;
                                float f42 = f41 / f12;
                                ((k0) this.x.x.get(i15)).a.setImageCoords(scaleX - f42, scaleY - f42, f41, f41);
                                ((k0) this.x.x.get(i15)).a.setRoundRadius(dp2 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, k0Var.l);
                                canvas.scale(f40, f40, scaleX, scaleY);
                                canvas.rotate(k0Var.j, scaleX, scaleY);
                                ((k0) this.x.x.get(i15)).a.draw(canvas);
                                canvas.restore();
                                float f43 = k0Var.c;
                                if (f43 < 1.0f) {
                                    float f44 = f43 + 0.045714285f;
                                    k0Var.c = f44;
                                    if (f44 > 1.0f) {
                                        k0Var.c = 1.0f;
                                    }
                                }
                                if (f34 >= 1.0f) {
                                    k0Var.l = a4.a.A(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, k0Var.l);
                                }
                                if (k0Var.k) {
                                    float f45 = k0Var.j;
                                    float f46 = k0Var.i;
                                    float f47 = (f46 / 250.0f) + f45;
                                    k0Var.j = f47;
                                    if (f47 > f46) {
                                        k0Var.k = false;
                                    }
                                } else {
                                    float f48 = k0Var.j;
                                    float f49 = k0Var.i;
                                    float f50 = f48 - (f49 / 250.0f);
                                    k0Var.j = f50;
                                    if (f50 < (-f49)) {
                                        k0Var.k = true;
                                    }
                                }
                                i15++;
                            }
                        }
                    }
                    invalidate();
                }
            }
            f18 = 0.7f;
            l0 l0Var7 = this.x;
            f20 = l0Var7.h;
            if (f20 != 1.0f) {
                int i16 = this.h;
                if (i16 == 1) {
                    l0Var7.h = 1.0f;
                } else {
                    l0Var7.h = (16.0f / (i16 == 2 ? 350.0f : 220.0f)) + f20;
                }
                if (l0Var7.h > f18) {
                    if (!this.c || i16 != 2) {
                        l0.g();
                    } else if (!l0Var7.A) {
                        l0Var7.A = true;
                        try {
                            performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        ((ViewGroup) getParent()).addView(this.x.f.i);
                        l0 l0Var8 = this.x.f;
                        l0Var8.z = true;
                        l0Var8.s = true;
                        l0Var8.y = System.currentTimeMillis();
                        this.x.f.i.setTag(R.id.parent_tag, 1);
                        animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new b(this, 2));
                    }
                }
                l0 l0Var9 = this.x;
                if (l0Var9.h >= 1.0f) {
                    int i17 = this.h;
                    if (i17 == 0 || i17 == 2) {
                        View view2 = this.b;
                        if (view2 instanceof t1) {
                            ((t1) view2).N.b(l0Var9.p);
                        } else if (view2 instanceof w0) {
                            ((w0) view2).C0.b(l0Var9.p);
                        }
                    }
                    this.x.h = 1.0f;
                    if (this.h == 1) {
                        l0.C = null;
                    } else {
                        l0.B = null;
                    }
                    View view3 = this.b;
                    if (view3 != null) {
                        view3.invalidate();
                        View view4 = this.b;
                        if ((view4 instanceof t1) && ((t1) view4).getCurrentMessagesGroup() != null && this.b.getParent() != null) {
                            ((View) this.b.getParent()).invalidate();
                        }
                    }
                    if (!this.c || this.h != 2) {
                        final int i18 = 1;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: yg.h0
                            public final /* synthetic */ i0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i18) {
                                    case 0:
                                        this.b.x.c();
                                        break;
                                    default:
                                        this.b.x.c();
                                        break;
                                }
                            }
                        });
                    }
                }
            }
            if (!this.x.x.isEmpty()) {
            }
            invalidate();
        }
        f31 = (this.r * f30) + (f32 * f13);
        f27 = (f10 * f13) + (this.s * f30);
        f15 = (1.0f - f14) * this.v;
        f16 = f11 * f14;
        f28 = f15 + f16;
        if (i14 != 1) {
        }
        if (this.h == 0) {
            this.x.c.setAlpha(f33);
        }
        this.x.e.setTranslationX(f27);
        this.x.e.setTranslationY(f28);
        this.x.e.setScaleX(f31);
        this.x.e.setScaleY(f31);
        super.dispatchDraw(canvas);
        i10 = this.h;
        if (i10 != 1) {
        }
        l0 l0Var52 = this.x;
        f17 = l0Var52.g;
        if (f17 != 1.0f) {
        }
        if (i10 != 2) {
        }
        f18 = 0.7f;
        l0 l0Var72 = this.x;
        f20 = l0Var72.h;
        if (f20 != 1.0f) {
        }
        if (!this.x.x.isEmpty()) {
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            l0 l0Var = this.x;
            if (i10 >= l0Var.x.size()) {
                return;
            }
            ((k0) l0Var.x.get(i10)).a.onAttachedToWindow();
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            l0 l0Var = this.x;
            if (i10 >= l0Var.x.size()) {
                return;
            }
            ((k0) l0Var.x.get(i10)).a.onDetachedFromWindow();
            i10++;
        }
    }
}
