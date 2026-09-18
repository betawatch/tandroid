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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class x61 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final org.telegram.ui.Components.jg0 d;
    public final View e;
    public final org.telegram.ui.Components.ym0 f;
    public final org.telegram.ui.Cells.b6 h;
    public w61 n;
    public float r;
    public ValueAnimator s;
    public g01 v;
    public boolean w;
    public boolean x;
    public final /* synthetic */ i71 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x61(i71 i71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var = i71Var.Z0;
        this.y = i71Var;
        final int i10 = 0;
        this.w = false;
        final int i11 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i12 = org.telegram.ui.ActionBar.j6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i12, f6Var)));
        frameLayout.setClipToOutline(true);
        float dp2 = AndroidUtilities.dp(18.0f);
        ai.k2 k2Var = yf.j0.a;
        frameLayout.setOutlineProvider(new yf.h0(0, dp2));
        addView(frameLayout, w7.x5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.ym0 ym0Var = new org.telegram.ui.Components.ym0();
        this.f = ym0Var;
        ym0Var.c(0, false, false);
        int i13 = org.telegram.ui.ActionBar.j6.Je;
        ym0Var.a(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        imageView.setImageDrawable(ym0Var);
        final z51 z51Var = (z51) this;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.t61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        z51 z51Var2 = z51Var;
                        org.telegram.ui.Cells.b6 b6Var = z51Var2.h;
                        if (z51Var2.f.k == 1) {
                            b6Var.setText("");
                            z51Var2.y.v(null, true, false);
                            w61 w61Var = z51Var2.n;
                            if (w61Var != null) {
                                w61Var.G1(null);
                                z51Var2.n.H1(true, true);
                                z51Var2.n.E1();
                            }
                            b6Var.clearAnimation();
                            b6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            z51Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        z51 z51Var3 = z51Var;
                        i71 i71Var2 = z51Var3.y;
                        if (!i71Var2.u()) {
                            i71Var2.q();
                            z51Var3.h.requestFocus();
                            i71.a(i71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        z51 z51Var4 = z51Var;
                        org.telegram.ui.Cells.b6 b6Var2 = z51Var4.h;
                        b6Var2.setText("");
                        z51Var4.y.v(null, true, false);
                        w61 w61Var2 = z51Var4.n;
                        if (w61Var2 != null) {
                            w61Var2.G1(null);
                            z51Var4.n.H1(true, true);
                        }
                        b6Var2.clearAnimation();
                        b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        z51Var4.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        final int i14 = 2;
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        org.telegram.ui.Components.jg0 jg0Var = new org.telegram.ui.Components.jg0(z51Var, context, z10);
        this.d = jg0Var;
        frameLayout.addView(jg0Var, w7.x5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.b6 b6Var = new org.telegram.ui.Cells.b6(z51Var, context, f6Var, i11);
        this.h = b6Var;
        b6Var.addTextChangedListener(new l0(z51Var, 15));
        b6Var.setBackground(null);
        b6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        b6Var.setTextSize(1, 16.0f);
        b6Var.setHint(LocaleController.getString(R.string.Search));
        b6Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        b6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        b6Var.setImeOptions(268435459);
        b6Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Mh, f6Var));
        b6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        b6Var.setGravity(19);
        b6Var.setCursorWidth(1.5f);
        b6Var.setMaxLines(1);
        b6Var.setSingleLine(true);
        b6Var.setLines(1);
        b6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        jg0Var.addView(b6Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            jg0Var.addView(view, w7.x5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.t61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        z51 z51Var2 = z51Var;
                        org.telegram.ui.Cells.b6 b6Var2 = z51Var2.h;
                        if (z51Var2.f.k == 1) {
                            b6Var2.setText("");
                            z51Var2.y.v(null, true, false);
                            w61 w61Var = z51Var2.n;
                            if (w61Var != null) {
                                w61Var.G1(null);
                                z51Var2.n.H1(true, true);
                                z51Var2.n.E1();
                            }
                            b6Var2.clearAnimation();
                            b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            z51Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        z51 z51Var3 = z51Var;
                        i71 i71Var2 = z51Var3.y;
                        if (!i71Var2.u()) {
                            i71Var2.q();
                            z51Var3.h.requestFocus();
                            i71.a(i71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        z51 z51Var4 = z51Var;
                        org.telegram.ui.Cells.b6 b6Var22 = z51Var4.h;
                        b6Var22.setText("");
                        z51Var4.y.v(null, true, false);
                        w61 w61Var2 = z51Var4.n;
                        if (w61Var2 != null) {
                            w61Var2.G1(null);
                            z51Var4.n.H1(true, true);
                        }
                        b6Var22.clearAnimation();
                        b6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        z51Var4.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(z51Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.t61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        z51 z51Var2 = z51Var;
                        org.telegram.ui.Cells.b6 b6Var2 = z51Var2.h;
                        if (z51Var2.f.k == 1) {
                            b6Var2.setText("");
                            z51Var2.y.v(null, true, false);
                            w61 w61Var = z51Var2.n;
                            if (w61Var != null) {
                                w61Var.G1(null);
                                z51Var2.n.H1(true, true);
                                z51Var2.n.E1();
                            }
                            b6Var2.clearAnimation();
                            b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            z51Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        z51 z51Var3 = z51Var;
                        i71 i71Var2 = z51Var3.y;
                        if (!i71Var2.u()) {
                            i71Var2.q();
                            z51Var3.h.requestFocus();
                            i71.a(i71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        z51 z51Var4 = z51Var;
                        org.telegram.ui.Cells.b6 b6Var22 = z51Var4.h;
                        b6Var22.setText("");
                        z51Var4.y.v(null, true, false);
                        w61 w61Var2 = z51Var4.n;
                        if (w61Var2 != null) {
                            w61Var2.G1(null);
                            z51Var4.n.H1(true, true);
                        }
                        b6Var22.clearAnimation();
                        b6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        z51Var4.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        if (zg.f0.d) {
            return;
        }
        b();
    }

    public static void a(z51 z51Var, boolean z10) {
        if (z10) {
            if (z51Var.v == null) {
                g01 g01Var = new g01(z51Var, 14);
                z51Var.v = g01Var;
                AndroidUtilities.runOnUIThread(g01Var, 340L);
                return;
            }
            return;
        }
        g01 g01Var2 = z51Var.v;
        if (g01Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(g01Var2);
            z51Var.v = null;
        }
        AndroidUtilities.updateViewShow(z51Var.c, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        i71 i71Var = this.y;
        int i10 = i71Var.W;
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
                w61 w61Var = new w61(this, getContext(), i11, i71Var.Z0);
                this.n = w61Var;
                w61Var.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
                w61 w61Var2 = this.n;
                org.telegram.ui.Cells.b6 b6Var = this.h;
                w61Var2.setDontOccupyWidth((int) b6Var.getPaint().measureText(((Object) b6Var.getHint()) + ""));
                final int i12 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.u61
                    public final /* synthetic */ x61 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                x61 x61Var = this.b;
                                x61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                x61Var.c(num.intValue() > 0);
                                x61Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.tw0 tw0Var = (org.telegram.ui.Components.tw0) obj;
                                x61 x61Var2 = this.b;
                                i71 i71Var2 = x61Var2.y;
                                if (x61Var2.n.getSelectedCategory() != tw0Var) {
                                    i71Var2.v(tw0Var.a, false, false);
                                    x61Var2.n.G1(tw0Var);
                                    break;
                                } else {
                                    i71Var2.v(null, false, false);
                                    x61Var2.n.G1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i13 = 1;
                this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.u61
                    public final /* synthetic */ x61 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i13) {
                            case 0:
                                Integer num = (Integer) obj;
                                x61 x61Var = this.b;
                                x61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                x61Var.c(num.intValue() > 0);
                                x61Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.tw0 tw0Var = (org.telegram.ui.Components.tw0) obj;
                                x61 x61Var2 = this.b;
                                i71 i71Var2 = x61Var2.y;
                                if (x61Var2.n.getSelectedCategory() != tw0Var) {
                                    i71Var2.v(tw0Var.a, false, false);
                                    x61Var2.n.G1(tw0Var);
                                    break;
                                } else {
                                    i71Var2.v(null, false, false);
                                    x61Var2.n.G1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, w7.x5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i11 = 1;
            w61 w61Var3 = new w61(this, getContext(), i11, i71Var.Z0);
            this.n = w61Var3;
            w61Var3.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
            w61 w61Var22 = this.n;
            org.telegram.ui.Cells.b6 b6Var2 = this.h;
            w61Var22.setDontOccupyWidth((int) b6Var2.getPaint().measureText(((Object) b6Var2.getHint()) + ""));
            final int i122 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.u61
                public final /* synthetic */ x61 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            x61 x61Var = this.b;
                            x61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            x61Var.c(num.intValue() > 0);
                            x61Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.tw0 tw0Var = (org.telegram.ui.Components.tw0) obj;
                            x61 x61Var2 = this.b;
                            i71 i71Var2 = x61Var2.y;
                            if (x61Var2.n.getSelectedCategory() != tw0Var) {
                                i71Var2.v(tw0Var.a, false, false);
                                x61Var2.n.G1(tw0Var);
                                break;
                            } else {
                                i71Var2.v(null, false, false);
                                x61Var2.n.G1(null);
                                break;
                            }
                    }
                }
            });
            final int i132 = 1;
            this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.u61
                public final /* synthetic */ x61 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i132) {
                        case 0:
                            Integer num = (Integer) obj;
                            x61 x61Var = this.b;
                            x61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            x61Var.c(num.intValue() > 0);
                            x61Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.tw0 tw0Var = (org.telegram.ui.Components.tw0) obj;
                            x61 x61Var2 = this.b;
                            i71 i71Var2 = x61Var2.y;
                            if (x61Var2.n.getSelectedCategory() != tw0Var) {
                                i71Var2.v(tw0Var.a, false, false);
                                x61Var2.n.G1(tw0Var);
                                break;
                            } else {
                                i71Var2.v(null, false, false);
                                x61Var2.n.G1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, w7.x5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
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
        ofFloat.addUpdateListener(new k21(this, 8));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.qr.h);
        this.s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z10) {
        w61 w61Var;
        w61 w61Var2;
        org.telegram.ui.Components.ym0 ym0Var = this.f;
        int i10 = ym0Var.k;
        org.telegram.ui.Cells.b6 b6Var = this.h;
        if (i10 != 2 || ((b6Var.length() == 0 && ((w61Var2 = this.n) == null || w61Var2.getSelectedCategory() == null)) || z10)) {
            ?? r62 = (b6Var.length() > 0 || ((w61Var = this.n) != null && w61Var.o3 > 0.5f && (w61Var.j3 || w61Var.getSelectedCategory() != null))) ? 1 : 0;
            ym0Var.b(r62);
            ImageView imageView = this.b;
            imageView.setClickable(r62);
            imageView.setContentDescription(r62 != 0 ? LocaleController.getString(R.string.AccDescrGoBack) : null);
            imageView.setImportantForAccessibility(r62 != 0 ? 1 : 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        if (this.x) {
            this.a.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.y.Z0))));
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (zg.f0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }
}
