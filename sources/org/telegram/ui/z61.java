package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class z61 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final org.telegram.ui.Components.kh0 d;
    public final View e;
    public final org.telegram.ui.Components.do0 f;
    public final org.telegram.ui.Cells.c6 h;
    public y61 n;
    public float r;
    public ValueAnimator s;
    public nz0 v;
    public boolean w;
    public boolean x;
    public final /* synthetic */ k71 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z61(k71 k71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var = k71Var.Z0;
        this.y = k71Var;
        final int i10 = 0;
        this.w = false;
        final int i11 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, e6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i12 = org.telegram.ui.ActionBar.i6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.c0(dp, org.telegram.ui.ActionBar.i6.w0(i12, e6Var)));
        frameLayout.setClipToOutline(true);
        float dp2 = AndroidUtilities.dp(18.0f);
        ai.l2 l2Var = yf.i0.a;
        frameLayout.setOutlineProvider(new yf.h0(0, dp2));
        addView(frameLayout, w7.x5.a(36.0f, 8.0f, 12.0f, 8.0f, 8.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.do0 do0Var = new org.telegram.ui.Components.do0();
        this.f = do0Var;
        do0Var.c(0, false, false);
        int i13 = org.telegram.ui.ActionBar.i6.Je;
        do0Var.a(org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
        imageView.setImageDrawable(do0Var);
        final b61 b61Var = (b61) this;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.v61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        b61 b61Var2 = b61Var;
                        org.telegram.ui.Cells.c6 c6Var = b61Var2.h;
                        if (b61Var2.f.k == 1) {
                            c6Var.setText("");
                            b61Var2.y.v(null, true, false);
                            y61 y61Var = b61Var2.n;
                            if (y61Var != null) {
                                y61Var.G1(null);
                                b61Var2.n.H1(true, true);
                                b61Var2.n.E1();
                            }
                            c6Var.clearAnimation();
                            c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.hs.h).start();
                            b61Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        b61 b61Var3 = b61Var;
                        k71 k71Var2 = b61Var3.y;
                        if (!k71Var2.u()) {
                            k71Var2.q();
                            b61Var3.h.requestFocus();
                            k71.a(k71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        b61 b61Var4 = b61Var;
                        org.telegram.ui.Cells.c6 c6Var2 = b61Var4.h;
                        c6Var2.setText("");
                        b61Var4.y.v(null, true, false);
                        y61 y61Var2 = b61Var4.n;
                        if (y61Var2 != null) {
                            y61Var2.G1(null);
                            b61Var4.n.H1(true, true);
                        }
                        c6Var2.clearAnimation();
                        c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.hs.h).start();
                        b61Var4.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        final int i14 = 2;
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        org.telegram.ui.Components.kh0 kh0Var = new org.telegram.ui.Components.kh0(b61Var, context, z10);
        this.d = kh0Var;
        frameLayout.addView(kh0Var, w7.x5.a(-1.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(b61Var, context, e6Var, i11);
        this.h = c6Var;
        c6Var.addTextChangedListener(new m0(b61Var, 15));
        c6Var.setBackground(null);
        c6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        c6Var.setTextSize(1, 16.0f);
        c6Var.setHint(LocaleController.getString(R.string.Search));
        c6Var.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
        c6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        c6Var.setImeOptions(268435459);
        c6Var.setCursorColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Mh, e6Var));
        c6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        c6Var.setGravity(19);
        c6Var.setCursorWidth(1.5f);
        c6Var.setMaxLines(1);
        c6Var.setSingleLine(true);
        c6Var.setLines(1);
        c6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        kh0Var.addView(c6Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 32.0f, 0.0f, -1, 119));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i12, e6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            kh0Var.addView(view, w7.x5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.v61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        b61 b61Var2 = b61Var;
                        org.telegram.ui.Cells.c6 c6Var2 = b61Var2.h;
                        if (b61Var2.f.k == 1) {
                            c6Var2.setText("");
                            b61Var2.y.v(null, true, false);
                            y61 y61Var = b61Var2.n;
                            if (y61Var != null) {
                                y61Var.G1(null);
                                b61Var2.n.H1(true, true);
                                b61Var2.n.E1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.hs.h).start();
                            b61Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        b61 b61Var3 = b61Var;
                        k71 k71Var2 = b61Var3.y;
                        if (!k71Var2.u()) {
                            k71Var2.q();
                            b61Var3.h.requestFocus();
                            k71.a(k71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        b61 b61Var4 = b61Var;
                        org.telegram.ui.Cells.c6 c6Var22 = b61Var4.h;
                        c6Var22.setText("");
                        b61Var4.y.v(null, true, false);
                        y61 y61Var2 = b61Var4.n;
                        if (y61Var2 != null) {
                            y61Var2.G1(null);
                            b61Var4.n.H1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.hs.h).start();
                        b61Var4.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.i2(b61Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.v61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        b61 b61Var2 = b61Var;
                        org.telegram.ui.Cells.c6 c6Var2 = b61Var2.h;
                        if (b61Var2.f.k == 1) {
                            c6Var2.setText("");
                            b61Var2.y.v(null, true, false);
                            y61 y61Var = b61Var2.n;
                            if (y61Var != null) {
                                y61Var.G1(null);
                                b61Var2.n.H1(true, true);
                                b61Var2.n.E1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.hs.h).start();
                            b61Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        b61 b61Var3 = b61Var;
                        k71 k71Var2 = b61Var3.y;
                        if (!k71Var2.u()) {
                            k71Var2.q();
                            b61Var3.h.requestFocus();
                            k71.a(k71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        b61 b61Var4 = b61Var;
                        org.telegram.ui.Cells.c6 c6Var22 = b61Var4.h;
                        c6Var22.setText("");
                        b61Var4.y.v(null, true, false);
                        y61 y61Var2 = b61Var4.n;
                        if (y61Var2 != null) {
                            y61Var2.G1(null);
                            b61Var4.n.H1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.hs.h).start();
                        b61Var4.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        if (zg.d0.d) {
            return;
        }
        b();
    }

    public static void a(b61 b61Var, boolean z10) {
        if (z10) {
            if (b61Var.v == null) {
                nz0 nz0Var = new nz0(b61Var, 15);
                b61Var.v = nz0Var;
                AndroidUtilities.runOnUIThread(nz0Var, 340L);
                return;
            }
            return;
        }
        nz0 nz0Var2 = b61Var.v;
        if (nz0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(nz0Var2);
            b61Var.v = null;
        }
        AndroidUtilities.updateViewShow(b61Var.c, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        k71 k71Var = this.y;
        int i10 = k71Var.W;
        if (this.n != null || getContext() == null) {
            return;
        }
        int i11 = 2;
        if (i10 == 1 || i10 == 11 || i10 == 2 || i10 == 0 || i10 == 12 || i10 == 4 || i10 == 10 || i10 == 9 || i10 == 14) {
            if (i10 != 0) {
                if (i10 != 4) {
                    if (i10 != 12) {
                        i11 = 0;
                    }
                }
                y61 y61Var = new y61(this, getContext(), i11, k71Var.Z0);
                this.n = y61Var;
                y61Var.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
                y61 y61Var2 = this.n;
                org.telegram.ui.Cells.c6 c6Var = this.h;
                y61Var2.setDontOccupyWidth((int) c6Var.getPaint().measureText(((Object) c6Var.getHint()) + ""));
                final int i12 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.w61
                    public final /* synthetic */ z61 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                z61 z61Var = this.b;
                                z61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                z61Var.c(num.intValue() > 0);
                                z61Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.ux0 ux0Var = (org.telegram.ui.Components.ux0) obj;
                                z61 z61Var2 = this.b;
                                k71 k71Var2 = z61Var2.y;
                                if (z61Var2.n.getSelectedCategory() != ux0Var) {
                                    k71Var2.v(ux0Var.a, false, false);
                                    z61Var2.n.G1(ux0Var);
                                    break;
                                } else {
                                    k71Var2.v(null, false, false);
                                    z61Var2.n.G1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i13 = 1;
                this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.w61
                    public final /* synthetic */ z61 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i13) {
                            case 0:
                                Integer num = (Integer) obj;
                                z61 z61Var = this.b;
                                z61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                z61Var.c(num.intValue() > 0);
                                z61Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.ux0 ux0Var = (org.telegram.ui.Components.ux0) obj;
                                z61 z61Var2 = this.b;
                                k71 k71Var2 = z61Var2.y;
                                if (z61Var2.n.getSelectedCategory() != ux0Var) {
                                    k71Var2.v(ux0Var.a, false, false);
                                    z61Var2.n.G1(ux0Var);
                                    break;
                                } else {
                                    k71Var2.v(null, false, false);
                                    z61Var2.n.G1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, w7.x5.a(-1.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 119));
            }
            i11 = 1;
            y61 y61Var3 = new y61(this, getContext(), i11, k71Var.Z0);
            this.n = y61Var3;
            y61Var3.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
            y61 y61Var22 = this.n;
            org.telegram.ui.Cells.c6 c6Var2 = this.h;
            y61Var22.setDontOccupyWidth((int) c6Var2.getPaint().measureText(((Object) c6Var2.getHint()) + ""));
            final int i122 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.w61
                public final /* synthetic */ z61 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            z61 z61Var = this.b;
                            z61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            z61Var.c(num.intValue() > 0);
                            z61Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.ux0 ux0Var = (org.telegram.ui.Components.ux0) obj;
                            z61 z61Var2 = this.b;
                            k71 k71Var2 = z61Var2.y;
                            if (z61Var2.n.getSelectedCategory() != ux0Var) {
                                k71Var2.v(ux0Var.a, false, false);
                                z61Var2.n.G1(ux0Var);
                                break;
                            } else {
                                k71Var2.v(null, false, false);
                                z61Var2.n.G1(null);
                                break;
                            }
                    }
                }
            });
            final int i132 = 1;
            this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.w61
                public final /* synthetic */ z61 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i132) {
                        case 0:
                            Integer num = (Integer) obj;
                            z61 z61Var = this.b;
                            z61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            z61Var.c(num.intValue() > 0);
                            z61Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.ux0 ux0Var = (org.telegram.ui.Components.ux0) obj;
                            z61 z61Var2 = this.b;
                            k71 k71Var2 = z61Var2.y;
                            if (z61Var2.n.getSelectedCategory() != ux0Var) {
                                k71Var2.v(ux0Var.a, false, false);
                                z61Var2.n.G1(ux0Var);
                                break;
                            } else {
                                k71Var2.v(null, false, false);
                                z61Var2.n.G1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, w7.x5.a(-1.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        }
    }

    public final void c(boolean z10) {
        if (z10 == this.w) {
            return;
        }
        this.w = z10;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new y11(this, 9));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.hs.h);
        this.s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z10) {
        y61 y61Var;
        y61 y61Var2;
        org.telegram.ui.Components.do0 do0Var = this.f;
        int i10 = do0Var.k;
        org.telegram.ui.Cells.c6 c6Var = this.h;
        if (i10 != 2 || ((c6Var.length() == 0 && ((y61Var2 = this.n) == null || y61Var2.getSelectedCategory() == null)) || z10)) {
            ?? r62 = (c6Var.length() > 0 || ((y61Var = this.n) != null && y61Var.m3 > 0.5f && (y61Var.h3 || y61Var.getSelectedCategory() != null))) ? 1 : 0;
            do0Var.b(r62);
            ImageView imageView = this.b;
            imageView.setClickable(r62);
            imageView.setContentDescription(r62 != 0 ? LocaleController.getString(R.string.AccDescrGoBack) : null);
            imageView.setImportantForAccessibility(r62 != 0 ? 1 : 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        if (this.x) {
            this.a.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, this.y.Z0))));
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (zg.d0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }
}
