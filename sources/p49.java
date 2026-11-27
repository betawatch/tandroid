// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class p49 extends FrameLayout {
    public final /* synthetic */ e a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ r47 d;
    public final /* synthetic */ zu1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float w;
    public final /* synthetic */ w49 x;
    public final /* synthetic */ s49 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p49(s49 s49Var, Context context, e eVar, View view, boolean z, r47 r47Var, zu1 zu1Var, int i, int i2, boolean z2, float f, float f2, float f3, w49 w49Var) {
        super(context);
        this.y = s49Var;
        this.a = eVar;
        this.b = view;
        this.c = z;
        this.d = r47Var;
        this.e = zu1Var;
        this.f = i;
        this.h = i2;
        this.n = z2;
        this.r = f;
        this.s = f2;
        this.w = f3;
        this.x = w49Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0317, code lost:
    
        if (r5.c.H != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0361, code lost:
    
        if (r24.y.c.getImageReceiver().y().l0 == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x037b, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r24.y.y) <= 2000) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0529, code lost:
    
        if (((int) uh9.x(r24.y.b.getImageReceiver().y().b0, r24.y.b.getImageReceiver().y().e[0], r8, r8)) < r5.b) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x03a3, code lost:
    
        if (r24.y.b.getImageReceiver().y().l0 == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x03b8, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r24.y.y) > 2000) goto L195;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Type inference failed for: r4v42, types: [org.telegram.messenger.ImageReceiver] */
    /* JADX WARN: Type inference failed for: r9v17, types: [ln5] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        View view;
        float f;
        float f2;
        float f3;
        s49 s49Var;
        float f4;
        float f5;
        float f6;
        float f7;
        int i;
        s49 s49Var2;
        float f8;
        float f9;
        float f10;
        float f11;
        ?? r9;
        float f12;
        float x;
        float f13;
        float f14;
        u49 u49Var;
        int paddingTop;
        zu1 zu1Var;
        r47 messageObject;
        s49 s49Var3 = this.y;
        final byte b = 0;
        if (s49Var3.l) {
            float f15 = s49Var3.m;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                s49Var3.m = f16;
                if (f16 > 1.0f) {
                    s49Var3.m = 1.0f;
                    hl.c3(new Runnable(this) { // from class: o49
                        public final /* synthetic */ p49 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            p49 p49Var = this.b;
                            switch (b2) {
                                case 0:
                                    p49Var.y.c();
                                    break;
                                default:
                                    p49Var.y.c();
                                    break;
                            }
                        }
                    });
                }
            }
            float f17 = this.y.m;
            if (f17 != 1.0f) {
                setAlpha(1.0f - f17);
                super.dispatchDraw(canvas);
            }
            invalidate();
            return;
        }
        if (!s49Var3.s) {
            invalidate();
            return;
        }
        g49 g49Var = s49Var3.t;
        if (g49Var != null) {
            g49Var.a.setAlpha(0.0f);
            this.y.t.c.setAlpha(0.0f);
        }
        e eVar = this.a;
        if (eVar instanceof zu1) {
            zu1 zu1Var2 = (zu1) eVar;
            int i2 = this.y.n;
            wq1 wq1Var = zu1Var2.A0;
            if (wq1Var != null) {
                int childCount = wq1Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    view = zu1Var2.A0.getChildAt(i3);
                    if (view instanceof wb2) {
                        messageObject = ((wb2) view).getMessageObject();
                    } else if (view instanceof dl1) {
                        messageObject = ((dl1) view).getMessageObject();
                    } else {
                        continue;
                    }
                    if (messageObject != null && messageObject.e1() == i2) {
                        break;
                    }
                }
            }
            view = null;
        } else {
            view = this.b;
        }
        float L = this.c ? hl.L(xea.j() ? 120.0f : 50.0f) : this.d != null ? hl.L(20.0f) : hl.L(14.0f);
        final byte b2 = 1;
        if (view != null) {
            view.getLocationInWindow(this.y.j);
            s49 s49Var4 = this.y;
            int[] iArr = s49Var4.j;
            f2 = iArr[0];
            f3 = iArr[1];
            if (view instanceof wb2) {
                wb2 wb2Var = (wb2) view;
                f = 0.10666667f;
                u49Var = wb2Var.O.k(s49Var4.p);
                if (wb2Var.K && !wb2Var.I3()) {
                    f3 += hl.L(2.0f);
                }
                paddingTop = wb2Var.getPaddingTop();
            } else {
                f = 0.10666667f;
                if (view instanceof dl1) {
                    u49Var = ((dl1) view).F0.k(s49Var4.p);
                    paddingTop = view.getPaddingTop();
                } else {
                    if (view instanceof v95) {
                        f2 += ((v95) view).getReactionCenterX();
                        f3 += view.getMeasuredHeight() / 2.0f;
                    }
                    u49Var = null;
                    if (u49Var != null) {
                        Rect rect = u49Var.s;
                        f2 += rect.left;
                        f3 += rect.top;
                    }
                    zu1Var = this.e;
                    if (zu1Var != null) {
                        f3 += zu1Var.Wa;
                    }
                    s49 s49Var5 = this.y;
                    s49Var5.q = f2;
                    s49Var5.r = f3;
                }
            }
            f3 += paddingTop;
            if (u49Var != null) {
            }
            zu1Var = this.e;
            if (zu1Var != null) {
            }
            s49 s49Var52 = this.y;
            s49Var52.q = f2;
            s49Var52.r = f3;
        } else {
            f = 0.10666667f;
            if (this.c) {
                float f18 = L / 2.0f;
                f2 = (getMeasuredWidth() / 2.0f) - f18;
                f3 = (getMeasuredHeight() / 2.0f) - f18;
            } else {
                s49 s49Var6 = this.y;
                f2 = s49Var6.q;
                f3 = s49Var6.r;
            }
        }
        e eVar2 = this.a;
        if (eVar2 != null && eVar2.getParentActivity() != null && this.a.getFragmentView() != null && this.a.getFragmentView().getParent() != null && this.a.getFragmentView().getVisibility() == 0 && this.a.getFragmentView() != null) {
            this.a.getFragmentView().getLocationOnScreen(this.y.j);
            setAlpha(((View) this.a.getFragmentView().getParent()).getAlpha());
        } else if (!this.c && !(view instanceof v95)) {
            return;
        }
        boolean z = view instanceof v95;
        int i4 = this.f;
        float f19 = (z ? i4 : i4 - L) / 2.0f;
        float f20 = f2 - f19;
        float f21 = f3 - f19;
        if (this.c && this.h == 0) {
            f20 += hl.L(40.0f);
        }
        if (this.h != 1 && !this.c) {
            float f22 = this.y.j[0];
            if (f20 < f22) {
                f20 = f22;
            }
            if (this.f + f20 > getMeasuredWidth() + r12) {
                f20 = (getMeasuredWidth() + this.y.j[0]) - this.f;
            }
        }
        k43 k43Var = k43.f;
        float interpolation = k43Var.getInterpolation(this.y.h);
        if (this.h == 2) {
            f4 = k43.h.getInterpolation(interpolation);
            f5 = k43Var.getInterpolation(interpolation);
            s49Var = null;
        } else if (this.n) {
            s49Var = null;
            f4 = k43.h.getInterpolation(this.y.g);
            f5 = k43Var.getInterpolation(this.y.g);
        } else {
            s49Var = null;
            f4 = this.y.g;
            f5 = f4;
        }
        float f23 = 1.0f - f4;
        float f24 = (this.r * f23) + f4;
        float f25 = L / this.f;
        if (this.h == 1) {
            f24 = 1.0f;
        } else {
            f20 = (f20 * f4) + (this.s * f23);
            f21 = (f21 * f5) + ((1.0f - f5) * this.w);
        }
        this.y.b.setTranslationX(f20);
        this.y.b.setTranslationY(f21);
        float f26 = 1.0f - interpolation;
        this.y.b.setAlpha(f26);
        this.y.b.setScaleX(f24);
        this.y.b.setScaleY(f24);
        int i5 = this.h;
        if (i5 != 2) {
            if (interpolation != 0.0f) {
                f24 = (f24 * f26) + (f25 * interpolation);
                f20 = (f20 * f26) + (f2 * interpolation);
                f6 = f21 * f26;
                f7 = f3 * interpolation;
            }
            if (i5 != 1) {
                boolean z2 = this.c;
                q49 q49Var = this.y.d;
                if (z2) {
                    q49Var.setAlpha(1.0f);
                } else {
                    q49Var.setAlpha(interpolation > 0.7f ? (interpolation - 0.7f) / 0.3f : 0.0f);
                }
            }
            if (this.h == 0 && this.c) {
                this.y.c.setAlpha(f26);
            }
            this.y.e.setTranslationX(f20);
            this.y.e.setTranslationY(f21);
            this.y.e.setScaleX(f24);
            this.y.e.setScaleY(f24);
            super.dispatchDraw(canvas);
            i = this.h;
            float f27 = 0.045714285f;
            if (i != 1) {
                s49Var2 = this.y;
            }
            s49Var2 = this.y;
            f8 = s49Var2.g;
            if (f8 != 1.0f) {
                if (this.n) {
                    f9 = f8 + 0.045714285f;
                    s49Var2.g = f9;
                } else {
                    f9 = f8 + 0.07272727f;
                    s49Var2.g = f9;
                }
                if (f9 > 1.0f) {
                    s49Var2.g = 1.0f;
                }
            }
            if (i != 2 && (!s49Var2.u || i != 0)) {
                if (i != 1) {
                    q49 q49Var2 = s49Var2.c;
                    if (q49Var2.H) {
                        if (q49Var2.getImageReceiver().y() != null) {
                        }
                    }
                }
                if (this.x.g == 0) {
                    f10 = 0.7f;
                } else {
                    f10 = 0.7f;
                }
                if (this.h == 1) {
                    q49 q49Var3 = this.y.b;
                    if (q49Var3.H) {
                        if (q49Var3.getImageReceiver().y() != null) {
                        }
                    }
                }
                if (this.x.g != 0) {
                }
                if (!this.y.x.isEmpty()) {
                    q49 q49Var4 = this.y.b;
                    if (q49Var4.H) {
                        b29 y = q49Var4.getImageReceiver().y();
                        int i6 = 0;
                        while (i6 < this.y.x.size()) {
                            r49 r49Var = (r49) this.y.x.get(i6);
                            float f28 = r49Var.c;
                            if (y != null && y.l0) {
                                float m = this.y.b.getImageReceiver().y().m();
                            }
                            float f29 = r49Var.d;
                            if (f29 != 1.0f) {
                                float f30 = f29 + f;
                                r49Var.d = f30;
                                if (f30 > 1.0f) {
                                    r49Var.d = 1.0f;
                                    this.y.x.remove(i6);
                                    i6--;
                                    f11 = f27;
                                    r9 = s49Var;
                                    i6++;
                                    s49Var = r9;
                                    f27 = f11;
                                }
                            }
                            if (f28 < 0.5f) {
                                x = f28 / 0.5f;
                                f12 = 1.0f;
                            } else {
                                f12 = 1.0f;
                                x = qd4.x(f28, 0.5f, 0.5f, 1.0f);
                            }
                            float f31 = (f12 - f28) * 0.5f;
                            float f32 = (r49Var.f * f28) + f31;
                            float f33 = ((r49Var.g * f28) + f31) - (r49Var.e * x);
                            float f34 = (1.0f - r49Var.d) * r49Var.h * f28;
                            float scaleX = (this.y.b.getScaleX() * this.y.b.getWidth() * f32) + this.y.b.getX();
                            float scaleY = (this.y.b.getScaleY() * this.y.b.getHeight() * f33) + this.y.b.getY();
                            int L2 = hl.L(16.0f);
                            float f35 = L2;
                            float f36 = f35 / 2.0f;
                            f11 = f27;
                            ((r49) this.y.x.get(i6)).a.i0(scaleX - f36, scaleY - f36, f35, f35);
                            ((r49) this.y.x.get(i6)).a.q0(L2 >> 1);
                            canvas.save();
                            canvas.translate(0.0f, r49Var.l);
                            canvas.scale(f34, f34, scaleX, scaleY);
                            canvas.rotate(r49Var.j, scaleX, scaleY);
                            r9 = s49Var;
                            ((r49) this.y.x.get(i6)).a.h(canvas, r9);
                            canvas.restore();
                            float f37 = r49Var.c;
                            if (f37 < 1.0f) {
                                float f38 = f37 + f11;
                                r49Var.c = f38;
                                if (f38 > 1.0f) {
                                    r49Var.c = 1.0f;
                                }
                            }
                            if (f28 >= 1.0f) {
                                r49Var.l = qu6.d(hl.L(20.0f), 16.0f, 500.0f, r49Var.l);
                            }
                            boolean z3 = r49Var.k;
                            float f39 = r49Var.j;
                            float f40 = r49Var.i;
                            if (z3) {
                                float f41 = (f40 / 250.0f) + f39;
                                r49Var.j = f41;
                                if (f41 > f40) {
                                    r49Var.k = false;
                                }
                            } else {
                                float f42 = f39 - (f40 / 250.0f);
                                r49Var.j = f42;
                                if (f42 < (-f40)) {
                                    r49Var.k = true;
                                }
                            }
                            i6++;
                            s49Var = r9;
                            f27 = f11;
                        }
                    }
                }
                invalidate();
            }
            f10 = 0.7f;
            s49 s49Var7 = this.y;
            f13 = s49Var7.h;
            if (f13 != 1.0f) {
                int i7 = this.h;
                if (i7 == 1) {
                    s49Var7.h = 1.0f;
                    f14 = 1.0f;
                } else {
                    f14 = f13 + (16.0f / (i7 == 2 ? 350.0f : 220.0f));
                    s49Var7.h = f14;
                }
                if (f14 > f10) {
                    if (!this.c || i7 != 2) {
                        s49.g();
                    } else if (!s49Var7.A) {
                        s49Var7.A = true;
                        try {
                            performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        ((ViewGroup) getParent()).addView(this.y.f.i);
                        s49 s49Var8 = this.y.f;
                        s49Var8.z = true;
                        s49Var8.s = true;
                        s49Var8.y = System.currentTimeMillis();
                        this.y.f.i.setTag(R.id.parent_tag, 1);
                        animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new n88(this, (byte) 27));
                    }
                }
                s49 s49Var9 = this.y;
                if (s49Var9.h >= 1.0f) {
                    int i8 = this.h;
                    if (i8 == 0 || i8 == 2) {
                        View view2 = this.b;
                        if (view2 instanceof wb2) {
                            ((wb2) view2).O.b(s49Var9.p);
                        } else if (view2 instanceof dl1) {
                            ((dl1) view2).F0.b(s49Var9.p);
                        }
                    }
                    this.y.h = 1.0f;
                    if (this.h == 1) {
                        s49.C = s49Var;
                    } else {
                        s49.B = s49Var;
                    }
                    View view3 = this.b;
                    if (view3 != null) {
                        view3.invalidate();
                        View view4 = this.b;
                        if ((view4 instanceof wb2) && ((wb2) view4).getCurrentMessagesGroup() != null && this.b.getParent() != null) {
                            ((View) this.b.getParent()).invalidate();
                        }
                    }
                    if (!this.c || this.h != 2) {
                        hl.c3(new Runnable(this) { // from class: o49
                            public final /* synthetic */ p49 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b22 = b2;
                                p49 p49Var = this.b;
                                switch (b22) {
                                    case 0:
                                        p49Var.y.c();
                                        break;
                                    default:
                                        p49Var.y.c();
                                        break;
                                }
                            }
                        });
                    }
                }
            }
            if (!this.y.x.isEmpty()) {
            }
            invalidate();
        }
        f24 = (this.r * f23) + (f25 * f4);
        f20 = (f2 * f4) + (this.s * f23);
        f6 = (1.0f - f5) * this.w;
        f7 = f3 * f5;
        f21 = f6 + f7;
        if (i5 != 1) {
        }
        if (this.h == 0) {
            this.y.c.setAlpha(f26);
        }
        this.y.e.setTranslationX(f20);
        this.y.e.setTranslationY(f21);
        this.y.e.setScaleX(f24);
        this.y.e.setScaleY(f24);
        super.dispatchDraw(canvas);
        i = this.h;
        float f272 = 0.045714285f;
        if (i != 1) {
        }
        s49Var2 = this.y;
        f8 = s49Var2.g;
        if (f8 != 1.0f) {
        }
        if (i != 2) {
            if (i != 1) {
            }
            if (this.x.g == 0) {
            }
            if (this.h == 1) {
            }
            if (this.x.g != 0) {
            }
            if (!this.y.x.isEmpty()) {
            }
            invalidate();
        }
        f10 = 0.7f;
        s49 s49Var72 = this.y;
        f13 = s49Var72.h;
        if (f13 != 1.0f) {
        }
        if (!this.y.x.isEmpty()) {
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ArrayList arrayList = this.y.x;
        super.onAttachedToWindow();
        for (int i = 0; i < arrayList.size(); i++) {
            ((r49) arrayList.get(i)).a.I();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList = this.y.x;
        super.onDetachedFromWindow();
        for (int i = 0; i < arrayList.size(); i++) {
            ((r49) arrayList.get(i)).a.K();
        }
    }
}
