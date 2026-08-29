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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class s51 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final cg.y d;
    public final View e;
    public final org.telegram.ui.Components.vm0 f;
    public final bh.b h;
    public r51 n;
    public float r;
    public ValueAnimator s;
    public ky0 v;
    public boolean w;
    public boolean x;
    public final /* synthetic */ d61 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s51(d61 d61Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var = d61Var.V0;
        this.y = d61Var;
        final int i10 = 0;
        this.w = false;
        final int i11 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i12 = org.telegram.ui.ActionBar.g6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)));
        frameLayout.setClipToOutline(true);
        float dp2 = AndroidUtilities.dp(18.0f);
        eg.k1 k1Var = jf.q0.a;
        frameLayout.setOutlineProvider(new jf.p0(0, dp2));
        addView(frameLayout, i7.f6.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.vm0 vm0Var = new org.telegram.ui.Components.vm0();
        this.f = vm0Var;
        vm0Var.c(0, false, false);
        int i13 = org.telegram.ui.ActionBar.g6.Je;
        vm0Var.a(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        imageView.setImageDrawable(vm0Var);
        final u41 u41Var = (u41) this;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.o51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        u41 u41Var2 = u41Var;
                        bh.b bVar = u41Var2.h;
                        if (u41Var2.f.k == 1) {
                            bVar.setText("");
                            u41Var2.y.v(null, true, false);
                            r51 r51Var = u41Var2.n;
                            if (r51Var != null) {
                                r51Var.F1(null);
                                u41Var2.n.G1(true, true);
                                u41Var2.n.D1();
                            }
                            bVar.clearAnimation();
                            bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.jr.h).start();
                            u41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        u41 u41Var3 = u41Var;
                        d61 d61Var2 = u41Var3.y;
                        if (!d61Var2.u()) {
                            d61Var2.q();
                            u41Var3.h.requestFocus();
                            d61.a(d61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        u41 u41Var4 = u41Var;
                        bh.b bVar2 = u41Var4.h;
                        bVar2.setText("");
                        u41Var4.y.v(null, true, false);
                        r51 r51Var2 = u41Var4.n;
                        if (r51Var2 != null) {
                            r51Var2.F1(null);
                            u41Var4.n.G1(true, true);
                        }
                        bVar2.clearAnimation();
                        bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.jr.h).start();
                        u41Var4.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, i7.f6.e(36, 36, 51));
        cg.y yVar = new cg.y(u41Var, context, z10);
        this.d = yVar;
        frameLayout.addView(yVar, i7.f6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        bh.b bVar = new bh.b(u41Var, context, c6Var, 3);
        this.h = bVar;
        bVar.addTextChangedListener(new p0(u41Var, 15));
        bVar.setBackground(null);
        bVar.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        bVar.setTextSize(1, 16.0f);
        bVar.setHint(LocaleController.getString(R.string.Search));
        bVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        bVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        bVar.setImeOptions(268435459);
        bVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Mh, c6Var));
        bVar.setCursorSize(AndroidUtilities.dp(20.0f));
        bVar.setGravity(19);
        bVar.setCursorWidth(1.5f);
        bVar.setMaxLines(1);
        bVar.setSingleLine(true);
        bVar.setLines(1);
        bVar.setTranslationY(AndroidUtilities.dp(-1.0f));
        yVar.addView(bVar, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            yVar.addView(view, i7.f6.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.o51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        u41 u41Var2 = u41Var;
                        bh.b bVar2 = u41Var2.h;
                        if (u41Var2.f.k == 1) {
                            bVar2.setText("");
                            u41Var2.y.v(null, true, false);
                            r51 r51Var = u41Var2.n;
                            if (r51Var != null) {
                                r51Var.F1(null);
                                u41Var2.n.G1(true, true);
                                u41Var2.n.D1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.jr.h).start();
                            u41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        u41 u41Var3 = u41Var;
                        d61 d61Var2 = u41Var3.y;
                        if (!d61Var2.u()) {
                            d61Var2.q();
                            u41Var3.h.requestFocus();
                            d61.a(d61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        u41 u41Var4 = u41Var;
                        bh.b bVar22 = u41Var4.h;
                        bVar22.setText("");
                        u41Var4.y.v(null, true, false);
                        r51 r51Var2 = u41Var4.n;
                        if (r51Var2 != null) {
                            r51Var2.F1(null);
                            u41Var4.n.G1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.jr.h).start();
                        u41Var4.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new nh.b2(u41Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        final int i14 = 2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.o51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        u41 u41Var2 = u41Var;
                        bh.b bVar2 = u41Var2.h;
                        if (u41Var2.f.k == 1) {
                            bVar2.setText("");
                            u41Var2.y.v(null, true, false);
                            r51 r51Var = u41Var2.n;
                            if (r51Var != null) {
                                r51Var.F1(null);
                                u41Var2.n.G1(true, true);
                                u41Var2.n.D1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.jr.h).start();
                            u41Var2.c(false);
                            break;
                        }
                        break;
                    case 1:
                        u41 u41Var3 = u41Var;
                        d61 d61Var2 = u41Var3.y;
                        if (!d61Var2.u()) {
                            d61Var2.q();
                            u41Var3.h.requestFocus();
                            d61.a(d61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        u41 u41Var4 = u41Var;
                        bh.b bVar22 = u41Var4.h;
                        bVar22.setText("");
                        u41Var4.y.v(null, true, false);
                        r51 r51Var2 = u41Var4.n;
                        if (r51Var2 != null) {
                            r51Var2.F1(null);
                            u41Var4.n.G1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.jr.h).start();
                        u41Var4.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, i7.f6.e(36, 36, 53));
        if (kg.g0.d) {
            return;
        }
        b();
    }

    public static void a(u41 u41Var, boolean z10) {
        if (z10) {
            if (u41Var.v == null) {
                ky0 ky0Var = new ky0(u41Var, 16);
                u41Var.v = ky0Var;
                AndroidUtilities.runOnUIThread(ky0Var, 340L);
                return;
            }
            return;
        }
        ky0 ky0Var2 = u41Var.v;
        if (ky0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(ky0Var2);
            u41Var.v = null;
        }
        AndroidUtilities.updateViewShow(u41Var.c, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        d61 d61Var = this.y;
        int i10 = d61Var.S;
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
                r51 r51Var = new r51(this, getContext(), i11, d61Var.V0);
                this.n = r51Var;
                r51Var.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
                r51 r51Var2 = this.n;
                bh.b bVar = this.h;
                r51Var2.setDontOccupyWidth((int) bVar.getPaint().measureText(((Object) bVar.getHint()) + ""));
                final int i12 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.p51
                    public final /* synthetic */ s51 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                s51 s51Var = this.b;
                                s51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                s51Var.c(num.intValue() > 0);
                                s51Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.kw0 kw0Var = (org.telegram.ui.Components.kw0) obj;
                                s51 s51Var2 = this.b;
                                d61 d61Var2 = s51Var2.y;
                                if (s51Var2.n.getSelectedCategory() != kw0Var) {
                                    d61Var2.v(kw0Var.a, false, false);
                                    s51Var2.n.F1(kw0Var);
                                    break;
                                } else {
                                    d61Var2.v(null, false, false);
                                    s51Var2.n.F1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i13 = 1;
                this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.p51
                    public final /* synthetic */ s51 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i13) {
                            case 0:
                                Integer num = (Integer) obj;
                                s51 s51Var = this.b;
                                s51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                s51Var.c(num.intValue() > 0);
                                s51Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.kw0 kw0Var = (org.telegram.ui.Components.kw0) obj;
                                s51 s51Var2 = this.b;
                                d61 d61Var2 = s51Var2.y;
                                if (s51Var2.n.getSelectedCategory() != kw0Var) {
                                    d61Var2.v(kw0Var.a, false, false);
                                    s51Var2.n.F1(kw0Var);
                                    break;
                                } else {
                                    d61Var2.v(null, false, false);
                                    s51Var2.n.F1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, i7.f6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i11 = 1;
            r51 r51Var3 = new r51(this, getContext(), i11, d61Var.V0);
            this.n = r51Var3;
            r51Var3.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
            r51 r51Var22 = this.n;
            bh.b bVar2 = this.h;
            r51Var22.setDontOccupyWidth((int) bVar2.getPaint().measureText(((Object) bVar2.getHint()) + ""));
            final int i122 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: org.telegram.ui.p51
                public final /* synthetic */ s51 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            s51 s51Var = this.b;
                            s51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            s51Var.c(num.intValue() > 0);
                            s51Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.kw0 kw0Var = (org.telegram.ui.Components.kw0) obj;
                            s51 s51Var2 = this.b;
                            d61 d61Var2 = s51Var2.y;
                            if (s51Var2.n.getSelectedCategory() != kw0Var) {
                                d61Var2.v(kw0Var.a, false, false);
                                s51Var2.n.F1(kw0Var);
                                break;
                            } else {
                                d61Var2.v(null, false, false);
                                s51Var2.n.F1(null);
                                break;
                            }
                    }
                }
            });
            final int i132 = 1;
            this.n.setOnCategoryClick(new Utilities.Callback(this) { // from class: org.telegram.ui.p51
                public final /* synthetic */ s51 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i132) {
                        case 0:
                            Integer num = (Integer) obj;
                            s51 s51Var = this.b;
                            s51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            s51Var.c(num.intValue() > 0);
                            s51Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.kw0 kw0Var = (org.telegram.ui.Components.kw0) obj;
                            s51 s51Var2 = this.b;
                            d61 d61Var2 = s51Var2.y;
                            if (s51Var2.n.getSelectedCategory() != kw0Var) {
                                d61Var2.v(kw0Var.a, false, false);
                                s51Var2.n.F1(kw0Var);
                                break;
                            } else {
                                d61Var2.v(null, false, false);
                                s51Var2.n.F1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, i7.f6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
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
        ofFloat.addUpdateListener(new w01(this, 9));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.jr.h);
        this.s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z10) {
        r51 r51Var;
        r51 r51Var2;
        org.telegram.ui.Components.vm0 vm0Var = this.f;
        int i10 = vm0Var.k;
        bh.b bVar = this.h;
        if (i10 != 2 || ((bVar.length() == 0 && ((r51Var2 = this.n) == null || r51Var2.getSelectedCategory() == null)) || z10)) {
            ?? r6 = (bVar.length() > 0 || ((r51Var = this.n) != null && r51Var.k3 > 0.5f && (r51Var.f3 || r51Var.getSelectedCategory() != null))) ? 1 : 0;
            vm0Var.b(r6);
            ImageView imageView = this.b;
            imageView.setClickable(r6);
            imageView.setContentDescription(r6 != 0 ? LocaleController.getString(R.string.AccDescrGoBack) : null);
            imageView.setImportantForAccessibility(r6 != 0 ? 1 : 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        if (this.x) {
            this.a.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, this.y.V0))));
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (kg.g0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }
}
