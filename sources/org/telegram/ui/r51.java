package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class r51 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public int E;
    public final /* synthetic */ c61 F;
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final org.telegram.ui.Components.gh0 d;
    public final View e;
    public final org.telegram.ui.Components.eo0 f;
    public final org.telegram.ui.Cells.g6 h;
    public q51 n;
    public float r;
    public ValueAnimator s;
    public my0 v;
    public boolean w;
    public boolean x;
    public ShapeDrawable y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r51(c61 c61Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var = c61Var.Z0;
        this.F = c61Var;
        final int i10 = 0;
        this.w = false;
        final int i11 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z10) {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, this, u6Var);
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i12 = org.telegram.ui.ActionBar.y6.He;
        Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        frameLayout.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(frameLayout, c02, N, null, u6Var);
        frameLayout.setClipToOutline(true);
        float dp2 = AndroidUtilities.dp(18.0f);
        ag.v0 v0Var = ag.z0.a;
        frameLayout.setOutlineProvider(new ag.x0(0, dp2));
        addView(frameLayout, org.telegram.ui.Components.gb1.h(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.eo0 eo0Var = new org.telegram.ui.Components.eo0();
        this.f = eo0Var;
        eo0Var.c(0, false, false);
        int i13 = org.telegram.ui.ActionBar.y6.Je;
        eo0Var.a(org.telegram.ui.ActionBar.y6.w0(i13, u6Var));
        imageView.setImageDrawable(eo0Var);
        final t41 t41Var = (t41) this;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.n51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        t41 t41Var2 = t41Var;
                        org.telegram.ui.Cells.g6 g6Var = t41Var2.h;
                        if (t41Var2.f.k == 1) {
                            g6Var.setText("");
                            t41Var2.F.v(null, true, false);
                            q51 q51Var = t41Var2.n;
                            if (q51Var != null) {
                                q51Var.L1(null);
                                t41Var2.n.M1(true, true);
                                t41Var2.n.J1();
                            }
                            g6Var.clearAnimation();
                            g6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.ds.h).start();
                            t41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        t41 t41Var3 = t41Var;
                        c61 c61Var2 = t41Var3.F;
                        if (!c61Var2.u()) {
                            c61Var2.q();
                            t41Var3.h.requestFocus();
                            c61.a(c61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        t41 t41Var4 = t41Var;
                        org.telegram.ui.Cells.g6 g6Var2 = t41Var4.h;
                        g6Var2.setText("");
                        t41Var4.F.v(null, true, false);
                        q51 q51Var2 = t41Var4.n;
                        if (q51Var2 != null) {
                            q51Var2.L1(null);
                            t41Var4.n.M1(true, true);
                        }
                        g6Var2.clearAnimation();
                        g6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.ds.h).start();
                        t41Var4.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, org.telegram.ui.Components.gb1.i(36, 36, 51));
        org.telegram.ui.Components.gh0 gh0Var = new org.telegram.ui.Components.gh0(t41Var, context, z10);
        this.d = gh0Var;
        frameLayout.addView(gh0Var, org.telegram.ui.Components.gb1.h(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(t41Var, context, u6Var, i11);
        this.h = g6Var;
        g6Var.addTextChangedListener(new m0(t41Var, 15));
        g6Var.setBackground(null);
        g6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        g6Var.setTextSize(1, 16.0f);
        g6Var.setHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.f7.E(g6Var, i13, u6Var);
        org.telegram.ui.ActionBar.f7.V(g6Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        g6Var.setImeOptions(268435459);
        org.telegram.ui.ActionBar.f7.m(g6Var, 30, org.telegram.ui.ActionBar.y6.Mh, u6Var);
        g6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        g6Var.setGravity(19);
        g6Var.setCursorWidth(1.5f);
        g6Var.setMaxLines(1);
        g6Var.setSingleLine(true);
        g6Var.setLines(1);
        g6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        gh0Var.addView(g6Var, org.telegram.ui.Components.gb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            org.telegram.ui.ActionBar.f7.y(this, mutate, i12, u6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            gh0Var.addView(view, org.telegram.ui.Components.gb1.i(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.n51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        t41 t41Var2 = t41Var;
                        org.telegram.ui.Cells.g6 g6Var2 = t41Var2.h;
                        if (t41Var2.f.k == 1) {
                            g6Var2.setText("");
                            t41Var2.F.v(null, true, false);
                            q51 q51Var = t41Var2.n;
                            if (q51Var != null) {
                                q51Var.L1(null);
                                t41Var2.n.M1(true, true);
                                t41Var2.n.J1();
                            }
                            g6Var2.clearAnimation();
                            g6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.ds.h).start();
                            t41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        t41 t41Var3 = t41Var;
                        c61 c61Var2 = t41Var3.F;
                        if (!c61Var2.u()) {
                            c61Var2.q();
                            t41Var3.h.requestFocus();
                            c61.a(c61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        t41 t41Var4 = t41Var;
                        org.telegram.ui.Cells.g6 g6Var22 = t41Var4.h;
                        g6Var22.setText("");
                        t41Var4.F.v(null, true, false);
                        q51 q51Var2 = t41Var4.n;
                        if (q51Var2 != null) {
                            q51Var2.L1(null);
                            t41Var4.n.M1(true, true);
                        }
                        g6Var22.clearAnimation();
                        g6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.ds.h).start();
                        t41Var4.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new fi.d2(t41Var));
        int i14 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i14, u6Var), 1, AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i14);
        imageView2.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView2, g02, null, N2, u6Var);
        imageView2.setAlpha(0.0f);
        final int i15 = 2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.n51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        t41 t41Var2 = t41Var;
                        org.telegram.ui.Cells.g6 g6Var2 = t41Var2.h;
                        if (t41Var2.f.k == 1) {
                            g6Var2.setText("");
                            t41Var2.F.v(null, true, false);
                            q51 q51Var = t41Var2.n;
                            if (q51Var != null) {
                                q51Var.L1(null);
                                t41Var2.n.M1(true, true);
                                t41Var2.n.J1();
                            }
                            g6Var2.clearAnimation();
                            g6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.ds.h).start();
                            t41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        t41 t41Var3 = t41Var;
                        c61 c61Var2 = t41Var3.F;
                        if (!c61Var2.u()) {
                            c61Var2.q();
                            t41Var3.h.requestFocus();
                            c61.a(c61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        t41 t41Var4 = t41Var;
                        org.telegram.ui.Cells.g6 g6Var22 = t41Var4.h;
                        g6Var22.setText("");
                        t41Var4.F.v(null, true, false);
                        q51 q51Var2 = t41Var4.n;
                        if (q51Var2 != null) {
                            q51Var2.L1(null);
                            t41Var4.n.M1(true, true);
                        }
                        g6Var22.clearAnimation();
                        g6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.ds.h).start();
                        t41Var4.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, org.telegram.ui.Components.gb1.i(36, 36, 53));
        if (bh.m0.d) {
            return;
        }
        b();
    }

    public static void a(t41 t41Var, boolean z10) {
        if (z10) {
            if (t41Var.v == null) {
                my0 my0Var = new my0(t41Var, 17);
                t41Var.v = my0Var;
                AndroidUtilities.runOnUIThread(my0Var, 340L);
                return;
            }
            return;
        }
        my0 my0Var2 = t41Var.v;
        if (my0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(my0Var2);
            t41Var.v = null;
        }
        AndroidUtilities.updateViewShow(t41Var.c, false);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.E8));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        c61 c61Var = this.F;
        int i10 = c61Var.W;
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
                q51 q51Var = new q51(this, getContext(), i11, c61Var.Z0);
                this.n = q51Var;
                q51Var.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
                q51 q51Var2 = this.n;
                org.telegram.ui.Cells.g6 g6Var = this.h;
                q51Var2.setDontOccupyWidth((int) g6Var.getPaint().measureText(((Object) g6Var.getHint()) + ""));
                final int i12 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.o51
                    public final /* synthetic */ r51 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                r51 r51Var = this.b;
                                r51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                r51Var.c(num.intValue() > 0);
                                r51Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.xx0 xx0Var = (org.telegram.ui.Components.xx0) obj;
                                r51 r51Var2 = this.b;
                                c61 c61Var2 = r51Var2.F;
                                if (r51Var2.n.getSelectedCategory() != xx0Var) {
                                    c61Var2.v(xx0Var.a, false, false);
                                    r51Var2.n.L1(xx0Var);
                                    break;
                                } else {
                                    c61Var2.v(null, false, false);
                                    r51Var2.n.L1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i13 = 1;
                this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.o51
                    public final /* synthetic */ r51 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i13) {
                            case 0:
                                Integer num = (Integer) obj;
                                r51 r51Var = this.b;
                                r51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                r51Var.c(num.intValue() > 0);
                                r51Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.xx0 xx0Var = (org.telegram.ui.Components.xx0) obj;
                                r51 r51Var2 = this.b;
                                c61 c61Var2 = r51Var2.F;
                                if (r51Var2.n.getSelectedCategory() != xx0Var) {
                                    c61Var2.v(xx0Var.a, false, false);
                                    r51Var2.n.L1(xx0Var);
                                    break;
                                } else {
                                    c61Var2.v(null, false, false);
                                    r51Var2.n.L1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, org.telegram.ui.Components.gb1.h(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i11 = 1;
            q51 q51Var3 = new q51(this, getContext(), i11, c61Var.Z0);
            this.n = q51Var3;
            q51Var3.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
            q51 q51Var22 = this.n;
            org.telegram.ui.Cells.g6 g6Var2 = this.h;
            q51Var22.setDontOccupyWidth((int) g6Var2.getPaint().measureText(((Object) g6Var2.getHint()) + ""));
            final int i122 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.o51
                public final /* synthetic */ r51 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            r51 r51Var = this.b;
                            r51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            r51Var.c(num.intValue() > 0);
                            r51Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.xx0 xx0Var = (org.telegram.ui.Components.xx0) obj;
                            r51 r51Var2 = this.b;
                            c61 c61Var2 = r51Var2.F;
                            if (r51Var2.n.getSelectedCategory() != xx0Var) {
                                c61Var2.v(xx0Var.a, false, false);
                                r51Var2.n.L1(xx0Var);
                                break;
                            } else {
                                c61Var2.v(null, false, false);
                                r51Var2.n.L1(null);
                                break;
                            }
                    }
                }
            });
            final int i132 = 1;
            this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.o51
                public final /* synthetic */ r51 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i132) {
                        case 0:
                            Integer num = (Integer) obj;
                            r51 r51Var = this.b;
                            r51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            r51Var.c(num.intValue() > 0);
                            r51Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.xx0 xx0Var = (org.telegram.ui.Components.xx0) obj;
                            r51 r51Var2 = this.b;
                            c61 c61Var2 = r51Var2.F;
                            if (r51Var2.n.getSelectedCategory() != xx0Var) {
                                c61Var2.v(xx0Var.a, false, false);
                                r51Var2.n.L1(xx0Var);
                                break;
                            } else {
                                c61Var2.v(null, false, false);
                                r51Var2.n.L1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, org.telegram.ui.Components.gb1.h(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
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
        ofFloat.addUpdateListener(new v11(this, 6));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.ds.h);
        this.s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z10) {
        q51 q51Var;
        q51 q51Var2;
        org.telegram.ui.Components.eo0 eo0Var = this.f;
        int i10 = eo0Var.k;
        org.telegram.ui.Cells.g6 g6Var = this.h;
        if (i10 != 2 || ((g6Var.length() == 0 && ((q51Var2 = this.n) == null || q51Var2.getSelectedCategory() == null)) || z10)) {
            ?? r6 = (g6Var.length() > 0 || ((q51Var = this.n) != null && q51Var.w3 > 0.5f && (q51Var.r3 || q51Var.getSelectedCategory() != null))) ? 1 : 0;
            eo0Var.b(r6);
            ImageView imageView = this.b;
            imageView.setClickable(r6);
            imageView.setContentDescription(r6 != 0 ? LocaleController.getString(R.string.AccDescrGoBack) : null);
            imageView.setImportantForAccessibility(r6 != 0 ? 1 : 2);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        if (bh.m0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.u6 u6Var = this.F.Z0;
        try {
            org.telegram.ui.Components.eo0 eo0Var = this.f;
            if (eo0Var != null) {
                eo0Var.a(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Je, u6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (!this.x || (frameLayout = this.a) == null) {
            return;
        }
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var));
        if (this.y != null) {
            Drawable background = frameLayout.getBackground();
            ShapeDrawable shapeDrawable = this.y;
            if (background == shapeDrawable) {
                if (o12 != this.E) {
                    org.telegram.ui.ActionBar.y6.z1(o12, shapeDrawable);
                    frameLayout.invalidate();
                }
                this.E = o12;
            }
        }
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(18.0f), o12);
        this.y = c02;
        frameLayout.setBackground(c02);
        this.E = o12;
    }
}
