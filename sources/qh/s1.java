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
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.uw0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class s1 extends FrameLayout {
    public final org.telegram.ui.ActionBar.g6 a;
    public final FrameLayout b;
    public final gn0 c;
    public final lg.f d;
    public final int e;
    public r1 f;
    public boolean h;
    public final ImageView n;
    public boolean r;
    public boolean s;
    public Utilities.Callback2 v;

    public s1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
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
        gn0 gn0Var = new gn0();
        this.c = gn0Var;
        gn0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.k6.Je;
        gn0Var.a(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        imageView.setImageDrawable(gn0Var);
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
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: qh.p1
            public final /* synthetic */ s1 b;

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
                        s1 s1Var = this.b;
                        int i13 = s1Var.c.k;
                        if (i13 != 1) {
                            if (i13 == 0) {
                                s1Var.d.requestFocus();
                                break;
                            }
                        } else {
                            s1Var.b();
                            r1 r1Var = s1Var.f;
                            if (r1Var != null) {
                                r1Var.D1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, k7.c6.e(36, 36, 53));
        final int i13 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: qh.p1
            public final /* synthetic */ s1 b;

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
                        s1 s1Var = this.b;
                        int i132 = s1Var.c.k;
                        if (i132 != 1) {
                            if (i132 == 0) {
                                s1Var.d.requestFocus();
                                break;
                            }
                        } else {
                            s1Var.b();
                            r1 r1Var = s1Var.f;
                            if (r1Var != null) {
                                r1Var.D1();
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
            r1 r1Var = this.f;
            FrameLayout frameLayout = this.b;
            if (r1Var != null) {
                frameLayout.removeView(r1Var);
            }
            r1 r1Var2 = new r1(this, getContext(), i10 == 1 ? 3 : 0, this.a, z4);
            this.f = r1Var2;
            lg.f fVar = this.d;
            r1Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) fVar.getPaint().measureText(((Object) fVar.getHint()) + "")));
            final int i11 = 0;
            this.f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: qh.q1
                public final /* synthetic */ s1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            s1 s1Var = this.b;
                            lg.f fVar2 = s1Var.d;
                            fVar2.animate().cancel();
                            fVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            s1Var.d(false);
                            break;
                        default:
                            uw0 uw0Var = (uw0) obj;
                            s1 s1Var2 = this.b;
                            r1 r1Var3 = s1Var2.f;
                            if (r1Var3 != null) {
                                if (r1Var3.getSelectedCategory() != uw0Var) {
                                    s1Var2.f.F1(uw0Var);
                                    String str = uw0Var.a;
                                    int categoryIndex = s1Var2.f.getCategoryIndex();
                                    Utilities.Callback2 callback2 = s1Var2.v;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    s1Var2.f.F1(null);
                                    Utilities.Callback2 callback22 = s1Var2.v;
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
            this.f.setOnCategoryClick(new Utilities.Callback(this) { // from class: qh.q1
                public final /* synthetic */ s1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            s1 s1Var = this.b;
                            lg.f fVar2 = s1Var.d;
                            fVar2.animate().cancel();
                            fVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            s1Var.d(false);
                            break;
                        default:
                            uw0 uw0Var = (uw0) obj;
                            s1 s1Var2 = this.b;
                            r1 r1Var3 = s1Var2.f;
                            if (r1Var3 != null) {
                                if (r1Var3.getSelectedCategory() != uw0Var) {
                                    s1Var2.f.F1(uw0Var);
                                    String str = uw0Var.a;
                                    int categoryIndex = s1Var2.f.getCategoryIndex();
                                    Utilities.Callback2 callback2 = s1Var2.v;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    s1Var2.f.F1(null);
                                    Utilities.Callback2 callback22 = s1Var2.v;
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
        r1 r1Var = this.f;
        if (r1Var != null) {
            r1Var.F1(null);
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
        r1 r1Var;
        r1 r1Var2;
        boolean z10 = this.s;
        lg.f fVar = this.d;
        if (!z10 || ((fVar.length() == 0 && ((r1Var2 = this.f) == null || r1Var2.getSelectedCategory() == null)) || z4)) {
            this.c.b((fVar.length() > 0 || ((r1Var = this.f) != null && r1Var.l3 > 0.5f && ((r1Var != null && r1Var.g3) || r1Var.getSelectedCategory() != null))) ? 1 : 0);
            this.s = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }
}
