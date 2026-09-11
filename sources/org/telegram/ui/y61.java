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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class y61 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final org.telegram.ui.Components.ig0 d;
    public final View e;
    public final org.telegram.ui.Components.xm0 f;
    public final org.telegram.ui.Cells.b6 h;
    public x61 n;
    public float r;
    public ValueAnimator s;
    public f01 v;
    public boolean w;
    public boolean x;
    public final /* synthetic */ j71 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y61(j71 j71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var = j71Var.Z0;
        this.y = j71Var;
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
        bi.z1 z1Var = yf.j0.a;
        frameLayout.setOutlineProvider(new yf.i0(0, dp2));
        addView(frameLayout, w7.x5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.xm0 xm0Var = new org.telegram.ui.Components.xm0();
        this.f = xm0Var;
        xm0Var.c(0, false, false);
        int i13 = org.telegram.ui.ActionBar.j6.Je;
        xm0Var.a(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        imageView.setImageDrawable(xm0Var);
        final a61 a61Var = (a61) this;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.u61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        a61 a61Var2 = a61Var;
                        org.telegram.ui.Cells.b6 b6Var = a61Var2.h;
                        if (a61Var2.f.k == 1) {
                            b6Var.setText("");
                            a61Var2.y.v(null, true, false);
                            x61 x61Var = a61Var2.n;
                            if (x61Var != null) {
                                x61Var.E1(null);
                                a61Var2.n.F1(true, true);
                                a61Var2.n.C1();
                            }
                            b6Var.clearAnimation();
                            b6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                            a61Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        a61 a61Var3 = a61Var;
                        j71 j71Var2 = a61Var3.y;
                        if (!j71Var2.u()) {
                            j71Var2.q();
                            a61Var3.h.requestFocus();
                            j71.a(j71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        a61 a61Var4 = a61Var;
                        org.telegram.ui.Cells.b6 b6Var2 = a61Var4.h;
                        b6Var2.setText("");
                        a61Var4.y.v(null, true, false);
                        x61 x61Var2 = a61Var4.n;
                        if (x61Var2 != null) {
                            x61Var2.E1(null);
                            a61Var4.n.F1(true, true);
                        }
                        b6Var2.clearAnimation();
                        b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                        a61Var4.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        final int i14 = 2;
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        org.telegram.ui.Components.ig0 ig0Var = new org.telegram.ui.Components.ig0(a61Var, context, z10);
        this.d = ig0Var;
        frameLayout.addView(ig0Var, w7.x5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.b6 b6Var = new org.telegram.ui.Cells.b6(a61Var, context, f6Var, i11);
        this.h = b6Var;
        b6Var.addTextChangedListener(new l0(a61Var, 15));
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
        ig0Var.addView(b6Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            ig0Var.addView(view, w7.x5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.u61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        a61 a61Var2 = a61Var;
                        org.telegram.ui.Cells.b6 b6Var2 = a61Var2.h;
                        if (a61Var2.f.k == 1) {
                            b6Var2.setText("");
                            a61Var2.y.v(null, true, false);
                            x61 x61Var = a61Var2.n;
                            if (x61Var != null) {
                                x61Var.E1(null);
                                a61Var2.n.F1(true, true);
                                a61Var2.n.C1();
                            }
                            b6Var2.clearAnimation();
                            b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                            a61Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        a61 a61Var3 = a61Var;
                        j71 j71Var2 = a61Var3.y;
                        if (!j71Var2.u()) {
                            j71Var2.q();
                            a61Var3.h.requestFocus();
                            j71.a(j71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        a61 a61Var4 = a61Var;
                        org.telegram.ui.Cells.b6 b6Var22 = a61Var4.h;
                        b6Var22.setText("");
                        a61Var4.y.v(null, true, false);
                        x61 x61Var2 = a61Var4.n;
                        if (x61Var2 != null) {
                            x61Var2.E1(null);
                            a61Var4.n.F1(true, true);
                        }
                        b6Var22.clearAnimation();
                        b6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                        a61Var4.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new di.j2(a61Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.u61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        a61 a61Var2 = a61Var;
                        org.telegram.ui.Cells.b6 b6Var2 = a61Var2.h;
                        if (a61Var2.f.k == 1) {
                            b6Var2.setText("");
                            a61Var2.y.v(null, true, false);
                            x61 x61Var = a61Var2.n;
                            if (x61Var != null) {
                                x61Var.E1(null);
                                a61Var2.n.F1(true, true);
                                a61Var2.n.C1();
                            }
                            b6Var2.clearAnimation();
                            b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                            a61Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        a61 a61Var3 = a61Var;
                        j71 j71Var2 = a61Var3.y;
                        if (!j71Var2.u()) {
                            j71Var2.q();
                            a61Var3.h.requestFocus();
                            j71.a(j71Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        a61 a61Var4 = a61Var;
                        org.telegram.ui.Cells.b6 b6Var22 = a61Var4.h;
                        b6Var22.setText("");
                        a61Var4.y.v(null, true, false);
                        x61 x61Var2 = a61Var4.n;
                        if (x61Var2 != null) {
                            x61Var2.E1(null);
                            a61Var4.n.F1(true, true);
                        }
                        b6Var22.clearAnimation();
                        b6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                        a61Var4.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        if (ah.y0.d) {
            return;
        }
        b();
    }

    public static void a(a61 a61Var, boolean z10) {
        if (z10) {
            if (a61Var.v == null) {
                f01 f01Var = new f01(a61Var, 14);
                a61Var.v = f01Var;
                AndroidUtilities.runOnUIThread(f01Var, 340L);
                return;
            }
            return;
        }
        f01 f01Var2 = a61Var.v;
        if (f01Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(f01Var2);
            a61Var.v = null;
        }
        AndroidUtilities.updateViewShow(a61Var.c, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        j71 j71Var = this.y;
        int i10 = j71Var.W;
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
                x61 x61Var = new x61(this, getContext(), i11, j71Var.Z0);
                this.n = x61Var;
                x61Var.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
                x61 x61Var2 = this.n;
                org.telegram.ui.Cells.b6 b6Var = this.h;
                x61Var2.setDontOccupyWidth((int) b6Var.getPaint().measureText(((Object) b6Var.getHint()) + ""));
                final int i12 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.v61
                    public final /* synthetic */ y61 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                y61 y61Var = this.b;
                                y61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                y61Var.c(num.intValue() > 0);
                                y61Var.e(false);
                                break;
                            default:
                                org.telegram.ui.Components.rw0 rw0Var = (org.telegram.ui.Components.rw0) obj;
                                y61 y61Var2 = this.b;
                                j71 j71Var2 = y61Var2.y;
                                if (y61Var2.n.getSelectedCategory() != rw0Var) {
                                    j71Var2.v(rw0Var.a, false, false);
                                    y61Var2.n.E1(rw0Var);
                                    break;
                                } else {
                                    j71Var2.v(null, false, false);
                                    y61Var2.n.E1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i13 = 1;
                this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.v61
                    public final /* synthetic */ y61 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i13) {
                            case 0:
                                Integer num = (Integer) obj;
                                y61 y61Var = this.b;
                                y61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                y61Var.c(num.intValue() > 0);
                                y61Var.e(false);
                                break;
                            default:
                                org.telegram.ui.Components.rw0 rw0Var = (org.telegram.ui.Components.rw0) obj;
                                y61 y61Var2 = this.b;
                                j71 j71Var2 = y61Var2.y;
                                if (y61Var2.n.getSelectedCategory() != rw0Var) {
                                    j71Var2.v(rw0Var.a, false, false);
                                    y61Var2.n.E1(rw0Var);
                                    break;
                                } else {
                                    j71Var2.v(null, false, false);
                                    y61Var2.n.E1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, w7.x5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i11 = 1;
            x61 x61Var3 = new x61(this, getContext(), i11, j71Var.Z0);
            this.n = x61Var3;
            x61Var3.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
            x61 x61Var22 = this.n;
            org.telegram.ui.Cells.b6 b6Var2 = this.h;
            x61Var22.setDontOccupyWidth((int) b6Var2.getPaint().measureText(((Object) b6Var2.getHint()) + ""));
            final int i122 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.v61
                public final /* synthetic */ y61 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            y61 y61Var = this.b;
                            y61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            y61Var.c(num.intValue() > 0);
                            y61Var.e(false);
                            break;
                        default:
                            org.telegram.ui.Components.rw0 rw0Var = (org.telegram.ui.Components.rw0) obj;
                            y61 y61Var2 = this.b;
                            j71 j71Var2 = y61Var2.y;
                            if (y61Var2.n.getSelectedCategory() != rw0Var) {
                                j71Var2.v(rw0Var.a, false, false);
                                y61Var2.n.E1(rw0Var);
                                break;
                            } else {
                                j71Var2.v(null, false, false);
                                y61Var2.n.E1(null);
                                break;
                            }
                    }
                }
            });
            final int i132 = 1;
            this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.v61
                public final /* synthetic */ y61 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i132) {
                        case 0:
                            Integer num = (Integer) obj;
                            y61 y61Var = this.b;
                            y61Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            y61Var.c(num.intValue() > 0);
                            y61Var.e(false);
                            break;
                        default:
                            org.telegram.ui.Components.rw0 rw0Var = (org.telegram.ui.Components.rw0) obj;
                            y61 y61Var2 = this.b;
                            j71 j71Var2 = y61Var2.y;
                            if (y61Var2.n.getSelectedCategory() != rw0Var) {
                                j71Var2.v(rw0Var.a, false, false);
                                y61Var2.n.E1(rw0Var);
                                break;
                            } else {
                                j71Var2.v(null, false, false);
                                y61Var2.n.E1(null);
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
        ofFloat.addUpdateListener(new b21(this, 9));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.pr.h);
        this.s.start();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void d() {
        if (this.x) {
            this.a.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.y.Z0))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void e(boolean z10) {
        x61 x61Var;
        x61 x61Var2;
        org.telegram.ui.Components.xm0 xm0Var = this.f;
        int i10 = xm0Var.k;
        org.telegram.ui.Cells.b6 b6Var = this.h;
        if (i10 != 2 || ((b6Var.length() == 0 && ((x61Var2 = this.n) == null || x61Var2.getSelectedCategory() == null)) || z10)) {
            ?? r62 = (b6Var.length() > 0 || ((x61Var = this.n) != null && x61Var.o3 > 0.5f && (x61Var.j3 || x61Var.getSelectedCategory() != null))) ? 1 : 0;
            xm0Var.b(r62);
            ImageView imageView = this.b;
            imageView.setClickable(r62);
            imageView.setContentDescription(r62 != 0 ? LocaleController.getString(R.string.AccDescrGoBack) : null);
            imageView.setImportantForAccessibility(r62 != 0 ? 1 : 2);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ah.y0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }
}
