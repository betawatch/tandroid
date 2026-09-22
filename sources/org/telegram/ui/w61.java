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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class w61 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final org.telegram.ui.Components.ig0 d;
    public final View e;
    public final org.telegram.ui.Components.xm0 f;
    public final org.telegram.ui.Cells.c6 h;
    public v61 n;
    public float r;
    public ValueAnimator s;
    public f01 v;
    public boolean w;
    public boolean x;
    public final /* synthetic */ h71 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w61(h71 h71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var = h71Var.Z0;
        this.y = h71Var;
        final int i10 = 0;
        this.w = false;
        final int i11 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, e6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i12 = org.telegram.ui.ActionBar.i6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.b0(dp, org.telegram.ui.ActionBar.i6.v0(i12, e6Var)));
        frameLayout.setClipToOutline(true);
        float dp2 = AndroidUtilities.dp(18.0f);
        ai.k2 k2Var = yf.i0.a;
        frameLayout.setOutlineProvider(new yf.h0(0, dp2));
        addView(frameLayout, w7.x5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.xm0 xm0Var = new org.telegram.ui.Components.xm0();
        this.f = xm0Var;
        xm0Var.c(0, false, false);
        int i13 = org.telegram.ui.ActionBar.i6.Je;
        xm0Var.a(org.telegram.ui.ActionBar.i6.v0(i13, e6Var));
        imageView.setImageDrawable(xm0Var);
        final y51 y51Var = (y51) this;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.s61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        y51 y51Var2 = y51Var;
                        org.telegram.ui.Cells.c6 c6Var = y51Var2.h;
                        if (y51Var2.f.k == 1) {
                            c6Var.setText("");
                            y51Var2.y.v(null, true, false);
                            v61 v61Var = y51Var2.n;
                            if (v61Var != null) {
                                v61Var.F1(null);
                                y51Var2.n.G1(true, true);
                                y51Var2.n.D1();
                            }
                            c6Var.clearAnimation();
                            c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            y51Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        y51 y51Var3 = y51Var;
                        h71 h71Var2 = y51Var3.y;
                        if (!h71Var2.u()) {
                            h71Var2.q();
                            y51Var3.h.requestFocus();
                            h71.a(h71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        y51 y51Var4 = y51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = y51Var4.h;
                        c6Var2.setText("");
                        y51Var4.y.v(null, true, false);
                        v61 v61Var2 = y51Var4.n;
                        if (v61Var2 != null) {
                            v61Var2.F1(null);
                            y51Var4.n.G1(true, true);
                        }
                        c6Var2.clearAnimation();
                        c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        y51Var4.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        final int i14 = 2;
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        org.telegram.ui.Components.ig0 ig0Var = new org.telegram.ui.Components.ig0(y51Var, context, z10);
        this.d = ig0Var;
        frameLayout.addView(ig0Var, w7.x5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(y51Var, context, e6Var, i11);
        this.h = c6Var;
        c6Var.addTextChangedListener(new l0(y51Var, 15));
        c6Var.setBackground(null);
        c6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        c6Var.setTextSize(1, 16.0f);
        c6Var.setHint(LocaleController.getString(R.string.Search));
        c6Var.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(i13, e6Var));
        c6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        c6Var.setImeOptions(268435459);
        c6Var.setCursorColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Mh, e6Var));
        c6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        c6Var.setGravity(19);
        c6Var.setCursorWidth(1.5f);
        c6Var.setMaxLines(1);
        c6Var.setSingleLine(true);
        c6Var.setLines(1);
        c6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        ig0Var.addView(c6Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i12, e6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            ig0Var.addView(view, w7.x5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.s61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        y51 y51Var2 = y51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = y51Var2.h;
                        if (y51Var2.f.k == 1) {
                            c6Var2.setText("");
                            y51Var2.y.v(null, true, false);
                            v61 v61Var = y51Var2.n;
                            if (v61Var != null) {
                                v61Var.F1(null);
                                y51Var2.n.G1(true, true);
                                y51Var2.n.D1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            y51Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        y51 y51Var3 = y51Var;
                        h71 h71Var2 = y51Var3.y;
                        if (!h71Var2.u()) {
                            h71Var2.q();
                            y51Var3.h.requestFocus();
                            h71.a(h71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        y51 y51Var4 = y51Var;
                        org.telegram.ui.Cells.c6 c6Var22 = y51Var4.h;
                        c6Var22.setText("");
                        y51Var4.y.v(null, true, false);
                        v61 v61Var2 = y51Var4.n;
                        if (v61Var2 != null) {
                            v61Var2.F1(null);
                            y51Var4.n.G1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        y51Var4.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(y51Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i6, e6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.s61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        y51 y51Var2 = y51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = y51Var2.h;
                        if (y51Var2.f.k == 1) {
                            c6Var2.setText("");
                            y51Var2.y.v(null, true, false);
                            v61 v61Var = y51Var2.n;
                            if (v61Var != null) {
                                v61Var.F1(null);
                                y51Var2.n.G1(true, true);
                                y51Var2.n.D1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            y51Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        y51 y51Var3 = y51Var;
                        h71 h71Var2 = y51Var3.y;
                        if (!h71Var2.u()) {
                            h71Var2.q();
                            y51Var3.h.requestFocus();
                            h71.a(h71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        y51 y51Var4 = y51Var;
                        org.telegram.ui.Cells.c6 c6Var22 = y51Var4.h;
                        c6Var22.setText("");
                        y51Var4.y.v(null, true, false);
                        v61 v61Var2 = y51Var4.n;
                        if (v61Var2 != null) {
                            v61Var2.F1(null);
                            y51Var4.n.G1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        y51Var4.c(false);
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

    public static void a(y51 y51Var, boolean z10) {
        if (z10) {
            if (y51Var.v == null) {
                f01 f01Var = new f01(y51Var, 14);
                y51Var.v = f01Var;
                AndroidUtilities.runOnUIThread(f01Var, 340L);
                return;
            }
            return;
        }
        f01 f01Var2 = y51Var.v;
        if (f01Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(f01Var2);
            y51Var.v = null;
        }
        AndroidUtilities.updateViewShow(y51Var.c, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        h71 h71Var = this.y;
        int i10 = h71Var.W;
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
                v61 v61Var = new v61(this, getContext(), i11, h71Var.Z0);
                this.n = v61Var;
                v61Var.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
                v61 v61Var2 = this.n;
                org.telegram.ui.Cells.c6 c6Var = this.h;
                v61Var2.setDontOccupyWidth((int) c6Var.getPaint().measureText(((Object) c6Var.getHint()) + ""));
                final int i12 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.t61
                    public final /* synthetic */ w61 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                w61 w61Var = this.b;
                                w61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                w61Var.c(num.intValue() > 0);
                                w61Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.sw0 sw0Var = (org.telegram.ui.Components.sw0) obj;
                                w61 w61Var2 = this.b;
                                h71 h71Var2 = w61Var2.y;
                                if (w61Var2.n.getSelectedCategory() != sw0Var) {
                                    h71Var2.v(sw0Var.a, false, false);
                                    w61Var2.n.F1(sw0Var);
                                    break;
                                } else {
                                    h71Var2.v(null, false, false);
                                    w61Var2.n.F1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i13 = 1;
                this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.t61
                    public final /* synthetic */ w61 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i13) {
                            case 0:
                                Integer num = (Integer) obj;
                                w61 w61Var = this.b;
                                w61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                w61Var.c(num.intValue() > 0);
                                w61Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.sw0 sw0Var = (org.telegram.ui.Components.sw0) obj;
                                w61 w61Var2 = this.b;
                                h71 h71Var2 = w61Var2.y;
                                if (w61Var2.n.getSelectedCategory() != sw0Var) {
                                    h71Var2.v(sw0Var.a, false, false);
                                    w61Var2.n.F1(sw0Var);
                                    break;
                                } else {
                                    h71Var2.v(null, false, false);
                                    w61Var2.n.F1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, w7.x5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i11 = 1;
            v61 v61Var3 = new v61(this, getContext(), i11, h71Var.Z0);
            this.n = v61Var3;
            v61Var3.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
            v61 v61Var22 = this.n;
            org.telegram.ui.Cells.c6 c6Var2 = this.h;
            v61Var22.setDontOccupyWidth((int) c6Var2.getPaint().measureText(((Object) c6Var2.getHint()) + ""));
            final int i122 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.t61
                public final /* synthetic */ w61 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            w61 w61Var = this.b;
                            w61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            w61Var.c(num.intValue() > 0);
                            w61Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.sw0 sw0Var = (org.telegram.ui.Components.sw0) obj;
                            w61 w61Var2 = this.b;
                            h71 h71Var2 = w61Var2.y;
                            if (w61Var2.n.getSelectedCategory() != sw0Var) {
                                h71Var2.v(sw0Var.a, false, false);
                                w61Var2.n.F1(sw0Var);
                                break;
                            } else {
                                h71Var2.v(null, false, false);
                                w61Var2.n.F1(null);
                                break;
                            }
                    }
                }
            });
            final int i132 = 1;
            this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.t61
                public final /* synthetic */ w61 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i132) {
                        case 0:
                            Integer num = (Integer) obj;
                            w61 w61Var = this.b;
                            w61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            w61Var.c(num.intValue() > 0);
                            w61Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.sw0 sw0Var = (org.telegram.ui.Components.sw0) obj;
                            w61 w61Var2 = this.b;
                            h71 h71Var2 = w61Var2.y;
                            if (w61Var2.n.getSelectedCategory() != sw0Var) {
                                h71Var2.v(sw0Var.a, false, false);
                                w61Var2.n.F1(sw0Var);
                                break;
                            } else {
                                h71Var2.v(null, false, false);
                                w61Var2.n.F1(null);
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
        ofFloat.addUpdateListener(new a21(this, 9));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.qr.h);
        this.s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z10) {
        v61 v61Var;
        v61 v61Var2;
        org.telegram.ui.Components.xm0 xm0Var = this.f;
        int i10 = xm0Var.k;
        org.telegram.ui.Cells.c6 c6Var = this.h;
        if (i10 != 2 || ((c6Var.length() == 0 && ((v61Var2 = this.n) == null || v61Var2.getSelectedCategory() == null)) || z10)) {
            ?? r62 = (c6Var.length() > 0 || ((v61Var = this.n) != null && v61Var.o3 > 0.5f && (v61Var.j3 || v61Var.getSelectedCategory() != null))) ? 1 : 0;
            xm0Var.b(r62);
            ImageView imageView = this.b;
            imageView.setClickable(r62);
            imageView.setContentDescription(r62 != 0 ? LocaleController.getString(R.string.AccDescrGoBack) : null);
            imageView.setImportantForAccessibility(r62 != 0 ? 1 : 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        if (this.x) {
            this.a.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, this.y.Z0))));
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
