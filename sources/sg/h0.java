package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.messenger.tz;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.un;
import org.telegram.ui.vj;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h0 extends FrameLayout {
    public final /* synthetic */ k2 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ jj d;
    public final /* synthetic */ un e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float w;
    public final /* synthetic */ o0 x;
    public final /* synthetic */ k0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, Context context, k2 k2Var, View view, boolean z10, jj jjVar, un unVar, int i10, int i11, boolean z11, float f7, float f10, float f11, o0 o0Var) {
        super(context);
        this.y = k0Var;
        this.a = k2Var;
        this.b = view;
        this.c = z10;
        this.d = jjVar;
        this.e = unVar;
        this.f = i10;
        this.h = i11;
        this.n = z11;
        this.r = f7;
        this.s = f10;
        this.w = f11;
        this.x = o0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0373, code lost:
    
        if (r24.y.c.getImageReceiver().B().k0 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x038d, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r24.y.y) <= 2000) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0538, code lost:
    
        if (((int) org.telegram.messenger.z20.v(r24.y.b.getImageReceiver().B().a0, r24.y.b.getImageReceiver().B().e[0], r8, r8)) < r6.b) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03b5, code lost:
    
        if (r24.y.b.getImageReceiver().B().k0 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x03ca, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r24.y.y) > 2000) goto L197;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c2  */
    /* JADX WARN: Type inference failed for: r4v44, types: [org.telegram.messenger.ImageReceiver] */
    /* JADX WARN: Type inference failed for: r9v17, types: [org.telegram.messenger.jc] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        View view;
        float f7;
        float f10;
        float f11;
        k0 k0Var;
        float f12;
        float f13;
        float f14;
        float f15;
        int i10;
        float f16;
        float f17;
        float f18;
        ?? r92;
        float f19;
        float y3;
        float f20;
        m0 m0Var;
        int paddingTop;
        un unVar;
        jj messageObject;
        k0 k0Var2 = this.y;
        final int i11 = 0;
        if (k0Var2.l) {
            float f21 = k0Var2.m;
            if (f21 != 1.0f) {
                float f22 = f21 + 0.10666667f;
                k0Var2.m = f22;
                if (f22 > 1.0f) {
                    k0Var2.m = 1.0f;
                    org.telegram.messenger.i0.g3(new Runnable(this) { // from class: sg.g0
                        public final /* synthetic */ h0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    this.b.y.c();
                                    break;
                                default:
                                    this.b.y.c();
                                    break;
                            }
                        }
                    });
                }
            }
            float f23 = this.y.m;
            if (f23 != 1.0f) {
                setAlpha(1.0f - f23);
                super.dispatchDraw(canvas);
            }
            invalidate();
            return;
        }
        if (!k0Var2.s) {
            invalidate();
            return;
        }
        kj0 kj0Var = k0Var2.t;
        if (kj0Var != null) {
            kj0Var.a.setAlpha(0.0f);
            this.y.t.c.setAlpha(0.0f);
        }
        k2 k2Var = this.a;
        if (k2Var instanceof un) {
            un unVar2 = (un) k2Var;
            int i12 = this.y.n;
            vj vjVar = unVar2.z0;
            if (vjVar != null) {
                int childCount = vjVar.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    view = unVar2.z0.getChildAt(i13);
                    if (view instanceof q1) {
                        messageObject = ((q1) view).getMessageObject();
                    } else if (view instanceof s0) {
                        messageObject = ((s0) view).getMessageObject();
                    } else {
                        continue;
                    }
                    if (messageObject != null && messageObject.f1() == i12) {
                        break;
                    }
                }
            }
            view = null;
        } else {
            view = this.b;
        }
        float L = this.c ? org.telegram.messenger.i0.L(tz.j() ? 120.0f : 50.0f) : this.d != null ? org.telegram.messenger.i0.L(20.0f) : org.telegram.messenger.i0.L(14.0f);
        final int i14 = 1;
        if (view != null) {
            view.getLocationInWindow(this.y.j);
            k0 k0Var3 = this.y;
            int[] iArr = k0Var3.j;
            f10 = iArr[0];
            f11 = iArr[1];
            if (view instanceof q1) {
                q1 q1Var = (q1) view;
                f7 = 0.10666667f;
                m0Var = q1Var.N.l(k0Var3.p);
                if (q1Var.J && !q1Var.B3()) {
                    f11 += org.telegram.messenger.i0.L(2.0f);
                }
                paddingTop = q1Var.getPaddingTop();
            } else {
                f7 = 0.10666667f;
                if (view instanceof s0) {
                    m0Var = ((s0) view).E0.l(k0Var3.p);
                    paddingTop = view.getPaddingTop();
                } else {
                    if (view instanceof dh.d) {
                        f10 += ((dh.d) view).getReactionCenterX();
                        f11 += view.getMeasuredHeight() / 2.0f;
                    }
                    m0Var = null;
                    if (m0Var != null) {
                        Rect rect = m0Var.s;
                        f10 += rect.left;
                        f11 += rect.top;
                    }
                    unVar = this.e;
                    if (unVar != null) {
                        f11 += unVar.Sa;
                    }
                    k0 k0Var4 = this.y;
                    k0Var4.q = f10;
                    k0Var4.r = f11;
                }
            }
            f11 += paddingTop;
            if (m0Var != null) {
            }
            unVar = this.e;
            if (unVar != null) {
            }
            k0 k0Var42 = this.y;
            k0Var42.q = f10;
            k0Var42.r = f11;
        } else {
            f7 = 0.10666667f;
            if (this.c) {
                float f24 = L / 2.0f;
                f10 = (getMeasuredWidth() / 2.0f) - f24;
                f11 = (getMeasuredHeight() / 2.0f) - f24;
            } else {
                k0 k0Var5 = this.y;
                f10 = k0Var5.q;
                f11 = k0Var5.r;
            }
        }
        k2 k2Var2 = this.a;
        if (k2Var2 != null && k2Var2.getParentActivity() != null && this.a.getFragmentView() != null && this.a.getFragmentView().getParent() != null && this.a.getFragmentView().getVisibility() == 0 && this.a.getFragmentView() != null) {
            this.a.getFragmentView().getLocationOnScreen(this.y.j);
            setAlpha(((View) this.a.getFragmentView().getParent()).getAlpha());
        } else if (!this.c && !(view instanceof dh.d)) {
            return;
        }
        float f25 = (view instanceof dh.d ? this.f : this.f - L) / 2.0f;
        float f26 = f10 - f25;
        float f27 = f11 - f25;
        if (this.c && this.h == 0) {
            f26 += org.telegram.messenger.i0.L(40.0f);
        }
        if (this.h != 1 && !this.c) {
            float f28 = this.y.j[0];
            if (f26 < f28) {
                f26 = f28;
            }
            if (this.f + f26 > getMeasuredWidth() + r12) {
                f26 = (getMeasuredWidth() + this.y.j[0]) - this.f;
            }
        }
        gr grVar = gr.f;
        float interpolation = grVar.getInterpolation(this.y.h);
        if (this.h == 2) {
            f12 = gr.h.getInterpolation(interpolation);
            f13 = grVar.getInterpolation(interpolation);
            k0Var = null;
        } else if (this.n) {
            k0Var = null;
            f12 = gr.h.getInterpolation(this.y.g);
            f13 = grVar.getInterpolation(this.y.g);
        } else {
            k0Var = null;
            f12 = this.y.g;
            f13 = f12;
        }
        float f29 = 1.0f - f12;
        float f30 = (this.r * f29) + f12;
        float f31 = L / this.f;
        if (this.h == 1) {
            f30 = 1.0f;
        } else {
            f26 = (f26 * f12) + (this.s * f29);
            f27 = (f27 * f13) + ((1.0f - f13) * this.w);
        }
        this.y.b.setTranslationX(f26);
        this.y.b.setTranslationY(f27);
        float f32 = 1.0f - interpolation;
        this.y.b.setAlpha(f32);
        this.y.b.setScaleX(f30);
        this.y.b.setScaleY(f30);
        int i15 = this.h;
        if (i15 != 2) {
            if (interpolation != 0.0f) {
                f30 = (f30 * f32) + (f31 * interpolation);
                f26 = (f26 * f32) + (f10 * interpolation);
                f14 = f27 * f32;
                f15 = f11 * interpolation;
            }
            if (i15 != 1) {
                if (this.c) {
                    this.y.d.setAlpha(1.0f);
                } else {
                    this.y.d.setAlpha(interpolation > 0.7f ? (interpolation - 0.7f) / 0.3f : 0.0f);
                }
            }
            if (this.h == 0 && this.c) {
                this.y.c.setAlpha(f32);
            }
            this.y.e.setTranslationX(f26);
            this.y.e.setTranslationY(f27);
            this.y.e.setScaleX(f30);
            this.y.e.setScaleY(f30);
            super.dispatchDraw(canvas);
            i10 = this.h;
            float f33 = 0.045714285f;
            if (i10 != 1 || this.y.c.G) {
                k0 k0Var6 = this.y;
                f16 = k0Var6.g;
                if (f16 != 1.0f) {
                    if (this.n) {
                        k0Var6.g = f16 + 0.045714285f;
                    } else {
                        k0Var6.g = f16 + 0.07272727f;
                    }
                    if (k0Var6.g > 1.0f) {
                        k0Var6.g = 1.0f;
                    }
                }
            }
            if (i10 != 2) {
                k0 k0Var7 = this.y;
                if (!k0Var7.u || i10 != 0) {
                    if (i10 != 1) {
                        i0 i0Var = k0Var7.c;
                        if (i0Var.G) {
                            if (i0Var.getImageReceiver().B() != null) {
                            }
                        }
                    }
                    if (this.x.g != 0) {
                        f17 = 0.7f;
                    } else {
                        f17 = 0.7f;
                    }
                    if (this.h == 1) {
                        i0 i0Var2 = this.y.b;
                        if (i0Var2.G) {
                            if (i0Var2.getImageReceiver().B() != null) {
                            }
                        }
                    }
                    if (this.x.g != 0) {
                    }
                    if (!this.y.x.isEmpty()) {
                        i0 i0Var3 = this.y.b;
                        if (i0Var3.G) {
                            bi0 B = i0Var3.getImageReceiver().B();
                            int i16 = 0;
                            while (i16 < this.y.x.size()) {
                                j0 j0Var = (j0) this.y.x.get(i16);
                                float f34 = j0Var.c;
                                if (B != null && B.k0) {
                                    float r10 = this.y.b.getImageReceiver().B().r();
                                }
                                float f35 = j0Var.d;
                                if (f35 != 1.0f) {
                                    float f36 = f35 + f7;
                                    j0Var.d = f36;
                                    if (f36 > 1.0f) {
                                        j0Var.d = 1.0f;
                                        this.y.x.remove(i16);
                                        i16--;
                                        f18 = f33;
                                        r92 = k0Var;
                                        i16++;
                                        k0Var = r92;
                                        f33 = f18;
                                    }
                                }
                                if (f34 < 0.5f) {
                                    y3 = f34 / 0.5f;
                                    f19 = 1.0f;
                                } else {
                                    f19 = 1.0f;
                                    y3 = m5.y(f34, 0.5f, 0.5f, 1.0f);
                                }
                                float f37 = (f19 - f34) * 0.5f;
                                float f38 = (j0Var.f * f34) + f37;
                                float f39 = ((j0Var.g * f34) + f37) - (j0Var.e * y3);
                                float f40 = (1.0f - j0Var.d) * j0Var.h * f34;
                                float scaleX = (this.y.b.getScaleX() * this.y.b.getWidth() * f38) + this.y.b.getX();
                                float scaleY = (this.y.b.getScaleY() * this.y.b.getHeight() * f39) + this.y.b.getY();
                                int L2 = org.telegram.messenger.i0.L(16.0f);
                                float f41 = L2;
                                float f42 = f41 / 2.0f;
                                f18 = f33;
                                ((j0) this.y.x.get(i16)).a.y0(scaleX - f42, scaleY - f42, f41, f41);
                                ((j0) this.y.x.get(i16)).a.J0(L2 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, j0Var.l);
                                canvas.scale(f40, f40, scaleX, scaleY);
                                canvas.rotate(j0Var.j, scaleX, scaleY);
                                r92 = k0Var;
                                ((j0) this.y.x.get(i16)).a.h(canvas, r92);
                                canvas.restore();
                                float f43 = j0Var.c;
                                if (f43 < 1.0f) {
                                    float f44 = f43 + f18;
                                    j0Var.c = f44;
                                    if (f44 > 1.0f) {
                                        j0Var.c = 1.0f;
                                    }
                                }
                                if (f34 >= 1.0f) {
                                    j0Var.l = a1.g.A(org.telegram.messenger.i0.L(20.0f), 16.0f, 500.0f, j0Var.l);
                                }
                                if (j0Var.k) {
                                    float f45 = j0Var.j;
                                    float f46 = j0Var.i;
                                    float f47 = (f46 / 250.0f) + f45;
                                    j0Var.j = f47;
                                    if (f47 > f46) {
                                        j0Var.k = false;
                                    }
                                } else {
                                    float f48 = j0Var.j;
                                    float f49 = j0Var.i;
                                    float f50 = f48 - (f49 / 250.0f);
                                    j0Var.j = f50;
                                    if (f50 < (-f49)) {
                                        j0Var.k = true;
                                    }
                                }
                                i16++;
                                k0Var = r92;
                                f33 = f18;
                            }
                        }
                    }
                    invalidate();
                }
            }
            f17 = 0.7f;
            k0 k0Var8 = this.y;
            f20 = k0Var8.h;
            if (f20 != 1.0f) {
                int i17 = this.h;
                if (i17 == 1) {
                    k0Var8.h = 1.0f;
                } else {
                    k0Var8.h = (16.0f / (i17 == 2 ? 350.0f : 220.0f)) + f20;
                }
                if (k0Var8.h > f17) {
                    if (!this.c || i17 != 2) {
                        k0.g();
                    } else if (!k0Var8.A) {
                        k0Var8.A = true;
                        try {
                            performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        ((ViewGroup) getParent()).addView(this.y.f.i);
                        k0 k0Var9 = this.y.f;
                        k0Var9.z = true;
                        k0Var9.s = true;
                        k0Var9.y = System.currentTimeMillis();
                        this.y.f.i.setTag(R.id.parent_tag, 1);
                        animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new r(this, i14));
                    }
                }
                k0 k0Var10 = this.y;
                if (k0Var10.h >= 1.0f) {
                    int i18 = this.h;
                    if (i18 == 0 || i18 == 2) {
                        View view2 = this.b;
                        if (view2 instanceof q1) {
                            ((q1) view2).N.b(k0Var10.p);
                        } else if (view2 instanceof s0) {
                            ((s0) view2).E0.b(k0Var10.p);
                        }
                    }
                    this.y.h = 1.0f;
                    if (this.h == 1) {
                        k0.C = k0Var;
                    } else {
                        k0.B = k0Var;
                    }
                    View view3 = this.b;
                    if (view3 != null) {
                        view3.invalidate();
                        View view4 = this.b;
                        if ((view4 instanceof q1) && ((q1) view4).getCurrentMessagesGroup() != null && this.b.getParent() != null) {
                            ((View) this.b.getParent()).invalidate();
                        }
                    }
                    if (!this.c || this.h != 2) {
                        org.telegram.messenger.i0.g3(new Runnable(this) { // from class: sg.g0
                            public final /* synthetic */ h0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        this.b.y.c();
                                        break;
                                    default:
                                        this.b.y.c();
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
        f30 = (this.r * f29) + (f31 * f12);
        f26 = (f10 * f12) + (this.s * f29);
        f14 = (1.0f - f13) * this.w;
        f15 = f11 * f13;
        f27 = f14 + f15;
        if (i15 != 1) {
        }
        if (this.h == 0) {
            this.y.c.setAlpha(f32);
        }
        this.y.e.setTranslationX(f26);
        this.y.e.setTranslationY(f27);
        this.y.e.setScaleX(f30);
        this.y.e.setScaleY(f30);
        super.dispatchDraw(canvas);
        i10 = this.h;
        float f332 = 0.045714285f;
        if (i10 != 1) {
        }
        k0 k0Var62 = this.y;
        f16 = k0Var62.g;
        if (f16 != 1.0f) {
        }
        if (i10 != 2) {
        }
        f17 = 0.7f;
        k0 k0Var82 = this.y;
        f20 = k0Var82.h;
        if (f20 != 1.0f) {
        }
        if (!this.y.x.isEmpty()) {
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            k0 k0Var = this.y;
            if (i10 >= k0Var.x.size()) {
                return;
            }
            ((j0) k0Var.x.get(i10)).a.P();
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            k0 k0Var = this.y;
            if (i10 >= k0Var.x.size()) {
                return;
            }
            ((j0) k0Var.x.get(i10)).a.R();
            i10++;
        }
    }
}
