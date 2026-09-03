package qh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.tw0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class r1 extends FrameLayout {
    public final org.telegram.ui.ActionBar.g6 a;
    public final FrameLayout b;
    public final fn0 c;
    public final lg.f d;
    public final int e;
    public q1 f;
    public boolean h;
    public final ImageView n;
    public boolean r;
    public boolean s;
    public Utilities.Callback2 v;

    public r1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = -1;
        this.a = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ie, g6Var)));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new hg.j1(18));
        addView(frameLayout, k7.c6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, k7.c6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        fn0 fn0Var = new fn0();
        this.c = fn0Var;
        fn0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.k6.Je;
        fn0Var.a(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        imageView.setImageDrawable(fn0Var);
        frameLayout.addView(imageView, k7.c6.e(36, 36, 51));
        lg.f fVar = new lg.f(this, context, 9);
        this.d = fVar;
        fVar.setTextSize(1, 16.0f);
        fVar.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        fVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        fVar.setBackgroundDrawable(null);
        fVar.setPadding(0, 0, 0, 0);
        fVar.setMaxLines(1);
        fVar.setLines(1);
        fVar.setSingleLine(true);
        fVar.setImeOptions(268435459);
        fVar.setHint(LocaleController.getString(R.string.Search));
        int i11 = org.telegram.ui.ActionBar.k6.Mh;
        fVar.setCursorColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        fVar.setHandlesColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        fVar.setCursorSize(AndroidUtilities.dp(20.0f));
        fVar.setCursorWidth(1.5f);
        fVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(fVar, k7.c6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        fVar.addTextChangedListener(new eh.c(this, 16));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.m0(g6Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, g6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        final int i12 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: qh.o1
            public final /* synthetic */ r1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.b();
                        break;
                    default:
                        r1 r1Var = this.b;
                        int i13 = r1Var.c.k;
                        if (i13 != 1) {
                            if (i13 == 0) {
                                r1Var.d.requestFocus();
                                break;
                            }
                        } else {
                            r1Var.b();
                            q1 q1Var = r1Var.f;
                            if (q1Var != null) {
                                q1Var.C1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, k7.c6.e(36, 36, 53));
        final int i13 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: qh.o1
            public final /* synthetic */ r1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.b();
                        break;
                    default:
                        r1 r1Var = this.b;
                        int i132 = r1Var.c.k;
                        if (i132 != 1) {
                            if (i132 == 0) {
                                r1Var.d.requestFocus();
                                break;
                            }
                        } else {
                            r1Var.b();
                            q1 q1Var = r1Var.f;
                            if (q1Var != null) {
                                q1Var.C1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }

    public final void a(int i10, boolean z4) {
        if (this.e != i10 || this.f == null) {
            q1 q1Var = this.f;
            FrameLayout frameLayout = this.b;
            if (q1Var != null) {
                frameLayout.removeView(q1Var);
            }
            q1 q1Var2 = new q1(this, getContext(), i10 == 1 ? 3 : 0, this.a, z4);
            this.f = q1Var2;
            lg.f fVar = this.d;
            q1Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) fVar.getPaint().measureText(((Object) fVar.getHint()) + "")));
            final int i11 = 0;
            this.f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: qh.p1
                public final /* synthetic */ r1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            r1 r1Var = this.b;
                            lg.f fVar2 = r1Var.d;
                            fVar2.animate().cancel();
                            fVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            r1Var.d(false);
                            break;
                        default:
                            tw0 tw0Var = (tw0) obj;
                            r1 r1Var2 = this.b;
                            q1 q1Var3 = r1Var2.f;
                            if (q1Var3 != null) {
                                if (q1Var3.getSelectedCategory() != tw0Var) {
                                    r1Var2.f.E1(tw0Var);
                                    String str = tw0Var.a;
                                    int categoryIndex = r1Var2.f.getCategoryIndex();
                                    Utilities.Callback2 callback2 = r1Var2.v;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    r1Var2.f.E1(null);
                                    Utilities.Callback2 callback22 = r1Var2.v;
                                    if (callback22 != null) {
                                        callback22.run(null, -1);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            final int i12 = 1;
            this.f.setOnCategoryClick(new Utilities.Callback(this) { // from class: qh.p1
                public final /* synthetic */ r1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            r1 r1Var = this.b;
                            lg.f fVar2 = r1Var.d;
                            fVar2.animate().cancel();
                            fVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            r1Var.d(false);
                            break;
                        default:
                            tw0 tw0Var = (tw0) obj;
                            r1 r1Var2 = this.b;
                            q1 q1Var3 = r1Var2.f;
                            if (q1Var3 != null) {
                                if (q1Var3.getSelectedCategory() != tw0Var) {
                                    r1Var2.f.E1(tw0Var);
                                    String str = tw0Var.a;
                                    int categoryIndex = r1Var2.f.getCategoryIndex();
                                    Utilities.Callback2 callback2 = r1Var2.v;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    r1Var2.f.E1(null);
                                    Utilities.Callback2 callback22 = r1Var2.v;
                                    if (callback22 != null) {
                                        callback22.run(null, -1);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            frameLayout.addView(this.f, Math.max(0, frameLayout.getChildCount() - 1), k7.c6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void b() {
        this.d.setText("");
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        q1 q1Var = this.f;
        if (q1Var != null) {
            q1Var.E1(null);
        }
    }

    public final void c(boolean z4) {
        this.s = z4;
        if (z4) {
            this.c.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z4) {
        q1 q1Var;
        q1 q1Var2;
        boolean z10 = this.s;
        lg.f fVar = this.d;
        if (!z10 || ((fVar.length() == 0 && ((q1Var2 = this.f) == null || q1Var2.getSelectedCategory() == null)) || z4)) {
            this.c.b((fVar.length() > 0 || ((q1Var = this.f) != null && q1Var.l3 > 0.5f && ((q1Var != null && q1Var.g3) || q1Var.getSelectedCategory() != null))) ? 1 : 0);
            this.s = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }
}
