package vh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.j20;
import org.telegram.messenger.l20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.we;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.tl;
import org.telegram.ui.dg0;
import org.telegram.ui.go0;
import org.telegram.ui.nb0;
import org.telegram.ui.y01;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class k2 extends FrameLayout implements us {
    public static final we j0 = new we(-1, null, null);
    public final TextView D;
    public final Drawable E;
    public final tl F;
    public final org.telegram.ui.ActionBar.t0 G;
    public final ImageView H;
    public final LinearLayout I;
    public final d J;
    public boolean K;
    public final boolean L;
    public final boolean M;
    public int N;
    public final float O;
    public final boolean P;
    public boolean Q;
    public int R;
    public final org.telegram.ui.Components.t5 S;
    public boolean T;
    public boolean U;
    public Runnable V;
    public j20 W;
    public final int a;
    public l20 a0;
    public final org.telegram.ui.ActionBar.p6 b;
    public final ArrayList b0;
    public final Paint c;
    public boolean c0;
    public final nb0 d;
    public boolean d0;
    public final oi e;
    public we e0;
    public final g2 f;
    public ArrayList f0;
    public ArrayList g0;
    public final FrameLayout h;
    public final ArrayList h0;
    public dg0 i0;
    public final tk0 n;
    public final e2 r;
    public final dw0 s;
    public final r2 w;
    public boolean x;
    public final org.telegram.ui.ActionBar.l y;

    public k2(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, we weVar, boolean z10, float f7, boolean z11, boolean z12) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.N = -2;
        this.S = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
        this.U = true;
        ArrayList arrayList = new ArrayList();
        this.b0 = arrayList;
        this.h0 = new ArrayList();
        this.O = f7;
        this.a = i10;
        this.b = p6Var;
        this.L = z10;
        this.M = z11;
        this.P = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(org.telegram.messenger.i0.L(2.33f), 0.0f, org.telegram.messenger.i0.L(-0.4f), TLObject.FLAG_27);
        nb0 nb0Var = new nb0(this, context, p6Var, 6);
        this.d = nb0Var;
        nb0Var.setItemSelectorColorProvider(new th.m1(13));
        g2 g2Var = new g2(this);
        this.f = g2Var;
        nb0Var.setAdapter(g2Var);
        oi oiVar = new oi(4, this);
        this.e = oiVar;
        nb0Var.setLayoutManager(oiVar);
        nb0Var.setFastScrollEnabled(1);
        nb0Var.setFastScrollVisible(true);
        nb0Var.getFastScroll().setAlpha(0.0f);
        oiVar.O = new jg.h1(this, 18);
        nb0Var.i(new dh.g(15));
        final int i11 = 0;
        nb0Var.setClipToPadding(false);
        addView(nb0Var, w7.b6.e(-1, -1, zs.E1));
        nb0Var.setOnItemClickListener(new gk0(this) { // from class: vh.a2
            public final /* synthetic */ k2 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.gk0
            public final void f(int i12, View view) {
                j20 j20Var;
                switch (i11) {
                    case 0:
                        k2 k2Var = this.b;
                        ArrayList arrayList2 = k2Var.b0;
                        ArrayList arrayList3 = k2Var.h0;
                        if (i12 >= 2 && k2Var.W != null && (view instanceof h2)) {
                            h2 h2Var = (h2) view;
                            int i13 = i12 - 2;
                            if (!k2Var.c0) {
                                if (k2Var.d0) {
                                    if (i13 >= 0 && i13 < arrayList2.size()) {
                                        n5 n5Var = (n5) arrayList2.get(i13);
                                        k2Var.W.a(n5Var, n5Var.K ? k2.d(h2Var) : null);
                                        break;
                                    } else {
                                        i13 -= arrayList2.size();
                                    }
                                }
                            } else if (i13 == 0) {
                                k2Var.e(k2.j0, true);
                                break;
                            } else {
                                i13 = i12 - 3;
                            }
                            if (i13 >= 0 && i13 < k2Var.f0.size()) {
                                ef efVar = (ef) k2Var.f0.get(i13);
                                if (arrayList3.isEmpty() && !k2Var.Q) {
                                    j20 j20Var2 = k2Var.W;
                                    if (efVar.b && !efVar.d()) {
                                        r6 = k2.d(h2Var);
                                    }
                                    j20Var2.a(efVar, r6);
                                    break;
                                } else {
                                    if (arrayList3.contains(efVar)) {
                                        arrayList3.remove(efVar);
                                    } else if (arrayList3.size() + 1 > k2Var.R) {
                                        int i14 = -k2Var.N;
                                        k2Var.N = i14;
                                        org.telegram.messenger.i0.F3(i14, h2Var, null);
                                        org.telegram.messenger.t2.D.a();
                                        break;
                                    } else {
                                        arrayList3.add(efVar);
                                    }
                                    org.telegram.messenger.i0.a4(k2Var.d);
                                    k2Var.j();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        k2 k2Var2 = this.b;
                        e2 e2Var = k2Var2.r;
                        org.telegram.ui.ActionBar.t0 t0Var = k2Var2.G;
                        if (t0Var != null) {
                            org.telegram.messenger.i0.v1(t0Var.getSearchContainer());
                        }
                        if (i12 >= 0 && i12 < e2Var.c.size() && (j20Var = k2Var2.W) != null) {
                            j20Var.a(e2Var.c.get(i12), null);
                            break;
                        }
                        break;
                }
            }
        });
        nb0Var.setOnItemLongClickListener(new rh.d0(this, 25));
        nb0Var.setOnScrollListener(new d2(this, i11));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, p6Var);
        this.y = lVar;
        lVar.setBackgroundColor(-14737633);
        lVar.setTitleColor(-1);
        lVar.setAlpha(0.0f);
        lVar.setVisibility(8);
        lVar.setBackButtonImage(R.drawable.ic_ab_back);
        lVar.C(436207615, false);
        lVar.D(-1, false);
        lVar.D(-1, true);
        addView(lVar, w7.b6.e(-1, -2, 55));
        lVar.setActionBarMenuOnItemClick(new y01(this, 17));
        org.telegram.ui.ActionBar.y p5 = lVar.p();
        tl tlVar = new tl(this, context, p5, p6Var, 3);
        this.F = tlVar;
        tlVar.setSubMenuOpenSide(1);
        lVar.addView(tlVar, 0, w7.b6.d(-2, -1.0f, 51, org.telegram.messenger.i0.Q1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        tlVar.setOnClickListener(new View.OnClickListener(this) { // from class: vh.b2
            public final /* synthetic */ k2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.F.U(null, null);
                        break;
                    case 1:
                        k2 k2Var = this.b;
                        if (k2Var.I.getAlpha() >= 0.25f) {
                            k2Var.f(false);
                            break;
                        }
                        break;
                    case 2:
                        k2 k2Var2 = this.b;
                        if (k2Var2.I.getAlpha() >= 0.25f) {
                            k2Var2.f(true);
                            break;
                        }
                        break;
                    default:
                        this.b.f(false);
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.D = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.E = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(org.telegram.messenger.i0.L(4.0f));
        textView.setPadding(0, org.telegram.messenger.i0.m, org.telegram.messenger.i0.L(10.0f), 0);
        tlVar.addView(textView, w7.b6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, w7.b6.e(-1, -1, zs.E1));
        tk0 tk0Var = new tk0(context, p6Var);
        this.n = tk0Var;
        tk0Var.setLayoutManager(new s4.r(3));
        e2 e2Var = new e2(this);
        this.r = e2Var;
        tk0Var.setAdapter(e2Var);
        tk0Var.setOnScrollListener(new d2(this, 1));
        tk0Var.setClipToPadding(true);
        tk0Var.i(new dh.g(14));
        frameLayout.addView(tk0Var, w7.b6.e(-1, -1, zs.E1));
        float f10 = 10.0f;
        oh.i iVar = new oh.i(2, context, p6Var);
        iVar.setViewType(2);
        iVar.setAlpha(0.0f);
        iVar.setVisibility(8);
        frameLayout.addView(iVar, w7.b6.e(-1, -1, zs.E1));
        dw0 dw0Var = new dw0(context, iVar, 11, p6Var);
        this.s = dw0Var;
        nh.p pVar = dw0Var.d;
        pVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(pVar, org.telegram.ui.ActionBar.t6.y6, p6Var);
        pVar.setTypeface(null);
        pVar.setText(cd.L0(2131745777, null));
        this.w = new r2(this, false, new ph.h1(this, 23));
        frameLayout.addView(dw0Var, w7.b6.e(-1, -1, zs.E1));
        tk0Var.setEmptyView(dw0Var);
        org.telegram.ui.ActionBar.t0 a2 = p5.a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new go0(this);
        this.G = a2;
        a2.setVisibility(8);
        a2.setSearchFieldHint(cd.L0(2131745778, null));
        final int i12 = 1;
        tk0Var.setOnItemClickListener(new gk0(this) { // from class: vh.a2
            public final /* synthetic */ k2 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.gk0
            public final void f(int i122, View view) {
                j20 j20Var;
                switch (i12) {
                    case 0:
                        k2 k2Var = this.b;
                        ArrayList arrayList2 = k2Var.b0;
                        ArrayList arrayList3 = k2Var.h0;
                        if (i122 >= 2 && k2Var.W != null && (view instanceof h2)) {
                            h2 h2Var = (h2) view;
                            int i13 = i122 - 2;
                            if (!k2Var.c0) {
                                if (k2Var.d0) {
                                    if (i13 >= 0 && i13 < arrayList2.size()) {
                                        n5 n5Var = (n5) arrayList2.get(i13);
                                        k2Var.W.a(n5Var, n5Var.K ? k2.d(h2Var) : null);
                                        break;
                                    } else {
                                        i13 -= arrayList2.size();
                                    }
                                }
                            } else if (i13 == 0) {
                                k2Var.e(k2.j0, true);
                                break;
                            } else {
                                i13 = i122 - 3;
                            }
                            if (i13 >= 0 && i13 < k2Var.f0.size()) {
                                ef efVar = (ef) k2Var.f0.get(i13);
                                if (arrayList3.isEmpty() && !k2Var.Q) {
                                    j20 j20Var2 = k2Var.W;
                                    if (efVar.b && !efVar.d()) {
                                        r6 = k2.d(h2Var);
                                    }
                                    j20Var2.a(efVar, r6);
                                    break;
                                } else {
                                    if (arrayList3.contains(efVar)) {
                                        arrayList3.remove(efVar);
                                    } else if (arrayList3.size() + 1 > k2Var.R) {
                                        int i14 = -k2Var.N;
                                        k2Var.N = i14;
                                        org.telegram.messenger.i0.F3(i14, h2Var, null);
                                        org.telegram.messenger.t2.D.a();
                                        break;
                                    } else {
                                        arrayList3.add(efVar);
                                    }
                                    org.telegram.messenger.i0.a4(k2Var.d);
                                    k2Var.j();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        k2 k2Var2 = this.b;
                        e2 e2Var2 = k2Var2.r;
                        org.telegram.ui.ActionBar.t0 t0Var = k2Var2.G;
                        if (t0Var != null) {
                            org.telegram.messenger.i0.v1(t0Var.getSearchContainer());
                        }
                        if (i122 >= 0 && i122 < e2Var2.c.size() && (j20Var = k2Var2.W) != null) {
                            j20Var.a(e2Var2.c.get(i122), null);
                            break;
                        }
                        break;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = vp.r1(i10).O1().w.b;
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                n5 n5Var = (n5) obj;
                if (!n5Var.g && !n5Var.w) {
                    this.b0.add(n5Var);
                }
            }
        }
        if (z11) {
            this.H = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.I = linearLayout;
            linearLayout.setOrientation(1);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, linearLayout, p6Var);
            linearLayout.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(org.telegram.messenger.i0.n > 0 ? 0.0f : f10) + org.telegram.messenger.i0.n);
            addView(linearLayout, w7.b6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(org.telegram.messenger.i0.L(32.0f));
            linearLayout.setVisibility(8);
            final int i14 = 1;
            d i15 = z20.i(24, context, p6Var, true);
            this.J = i15;
            i15.i(cd.H(',', "StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(i15, w7.b6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                i15.setOnClickListener(new View.OnClickListener(this) { // from class: vh.b2
                    public final /* synthetic */ k2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                this.b.F.U(null, null);
                                break;
                            case 1:
                                k2 k2Var = this.b;
                                if (k2Var.I.getAlpha() >= 0.25f) {
                                    k2Var.f(false);
                                    break;
                                }
                                break;
                            case 2:
                                k2 k2Var2 = this.b;
                                if (k2Var2.I.getAlpha() >= 0.25f) {
                                    k2Var2.f(true);
                                    break;
                                }
                                break;
                            default:
                                this.b.f(false);
                                break;
                        }
                    }
                });
            }
            d i16 = z20.i(24, context, p6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            dq dqVar = new dq(R.drawable.mini_collage, 0);
            float f11 = -org.telegram.messenger.i0.L(1.33f);
            float L = org.telegram.messenger.i0.L(0.66f);
            dqVar.r = f11;
            dqVar.s = L;
            spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) cd.L0(2131744797, null));
            i16.i(spannableStringBuilder, false, true);
            linearLayout.addView(i16, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            final int i17 = 2;
            i16.setOnClickListener(new View.OnClickListener(this) { // from class: vh.b2
                public final /* synthetic */ k2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            this.b.F.U(null, null);
                            break;
                        case 1:
                            k2 k2Var = this.b;
                            if (k2Var.I.getAlpha() >= 0.25f) {
                                k2Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            k2 k2Var2 = this.b;
                            if (k2Var2.I.getAlpha() >= 0.25f) {
                                k2Var2.f(true);
                                break;
                            }
                            break;
                        default:
                            this.b.f(false);
                            break;
                    }
                }
            });
        } else {
            this.I = null;
            this.J = null;
            ImageView imageView = new ImageView(context);
            this.H = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.floating_check);
            int L2 = org.telegram.messenger.i0.L(56.0f);
            int i18 = org.telegram.ui.ActionBar.t6.Ci;
            ShapeDrawable L3 = org.telegram.ui.ActionBar.t6.L(L2, org.telegram.ui.ActionBar.t6.w0(i18, p6Var));
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i18);
            imageView.setBackground(L3);
            org.telegram.ui.ActionBar.a7.k(imageView, L3, N, null, p6Var);
            w7.e6.b(imageView, 0.1f, 1.5f);
            addView(imageView, w7.b6.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            final int i19 = 3;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: vh.b2
                public final /* synthetic */ k2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i19) {
                        case 0:
                            this.b.F.U(null, null);
                            break;
                        case 1:
                            k2 k2Var = this.b;
                            if (k2Var.I.getAlpha() >= 0.25f) {
                                k2Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            k2 k2Var2 = this.b;
                            if (k2Var2.I.getAlpha() >= 0.25f) {
                                k2Var2.f(true);
                                break;
                            }
                            break;
                        default:
                            this.b.f(false);
                            break;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        we weVar2 = j0;
        if (weVar == null || (weVar == weVar2 && this.b0.size() <= 0)) {
            ArrayList arrayList3 = this.g0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.e0 = MediaController.Y1;
            } else {
                this.e0 = (we) this.g0.get(0);
            }
        } else {
            this.e0 = weVar;
        }
        this.f0 = b(this.e0);
        i();
        we weVar3 = this.e0;
        if (weVar3 == MediaController.Y1) {
            this.D.setText(cd.L0(2131752238, null));
        } else if (weVar3 == weVar2) {
            this.D.setText(cd.L0(2131744697, null));
        } else {
            this.D.setText(weVar3.c);
        }
    }

    public static Bitmap d(h2 h2Var) {
        Bitmap bitmap;
        if (h2Var == null || (bitmap = h2Var.a) == null || bitmap.isRecycled()) {
            return null;
        }
        return Utilities.E(6.0f, bitmap);
    }

    public final ArrayList b(we weVar) {
        if (weVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = weVar.e;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ef efVar = (ef) arrayList.get(i10);
            if (!this.L || !efVar.b) {
                arrayList2.add(efVar);
            }
        }
        return arrayList2;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = zs.r2;
        g2 g2Var = this.f;
        int i13 = 0;
        if (i10 != i12) {
            if (i10 == zs.y5) {
                ArrayList arrayList = this.b0;
                arrayList.clear();
                if (!this.L) {
                    ArrayList arrayList2 = vp.r1(this.a).O1().w.b;
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj = arrayList2.get(i13);
                        i13++;
                        n5 n5Var = (n5) obj;
                        if (!n5Var.g && !n5Var.w) {
                            arrayList.add(n5Var);
                        }
                    }
                }
                h();
                i();
                if (g2Var != null) {
                    g2Var.f();
                    return;
                }
                return;
            }
            return;
        }
        h();
        if (this.e0 != null) {
            while (true) {
                if (i13 >= MediaController.a2.size()) {
                    break;
                }
                we weVar = (we) MediaController.a2.get(i13);
                int i14 = weVar.a;
                we weVar2 = this.e0;
                if (i14 == weVar2.a && weVar.b == weVar2.b) {
                    this.e0 = weVar;
                    break;
                }
                i13++;
            }
        } else {
            ArrayList arrayList3 = this.g0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.e0 = MediaController.Y1;
            } else {
                this.e0 = (we) this.g0.get(0);
            }
        }
        this.f0 = b(this.e0);
        this.h0.clear();
        i();
        if (g2Var != null) {
            g2Var.f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float g10 = g();
        boolean z10 = g10 <= ((float) i0.a.d(32.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m, 0));
        float d = this.S.d(z10);
        float T1 = org.telegram.messenger.i0.T1(g10, 0.0f, d);
        if (z10 != this.x) {
            this.x = z10;
            c(z10);
            this.d.getFastScroll().animate().alpha(this.x ? 1.0f : 0.0f).start();
        }
        org.telegram.ui.ActionBar.l lVar = this.y;
        if (lVar != null) {
            lVar.setAlpha(d);
            int i10 = d <= 0.0f ? 8 : 0;
            if (lVar.getVisibility() != i10) {
                lVar.setVisibility(i10);
            }
        }
        dg0 dg0Var = this.i0;
        if (dg0Var != null) {
            dg0Var.setAlpha(1.0f - d);
        }
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, T1, getWidth(), org.telegram.messenger.i0.L(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), this.c);
        canvas.save();
        canvas.clipRect(0.0f, T1, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(we weVar, boolean z10) {
        this.e0 = weVar;
        this.f0 = b(weVar);
        this.h0.clear();
        i();
        we weVar2 = this.e0;
        we weVar3 = MediaController.Y1;
        TextView textView = this.D;
        if (weVar2 == weVar3) {
            textView.setText(cd.L0(2131752238, null));
        } else if (weVar2 == j0) {
            textView.setText(cd.L0(2131744697, null));
        } else {
            textView.setText(weVar2.c);
        }
        this.f.f();
        oi oiVar = this.e;
        if (!z10) {
            oiVar.h1(1, org.telegram.messenger.i0.L(16.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()));
            return;
        }
        ci.p pVar = new ci.p(getContext(), 2);
        pVar.a = 1;
        pVar.p = org.telegram.messenger.i0.L(16.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
        oiVar.w0(pVar);
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        h2 h2Var;
        if (this.a0 == null) {
            return;
        }
        ArrayList arrayList = this.h0;
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == 1) {
            this.W.a((ef) arrayList.get(0), null);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            nb0 nb0Var = this.d;
            if (i10 >= size) {
                this.a0.a(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                arrayList.clear();
                org.telegram.messenger.i0.a4(nb0Var);
                j();
                return;
            }
            Object obj = arrayList.get(i10);
            i10++;
            ef efVar = (ef) obj;
            if (!efVar.b || efVar.d()) {
                bitmap = null;
            } else {
                int i11 = 0;
                while (true) {
                    if (i11 >= nb0Var.getChildCount()) {
                        h2Var = null;
                        break;
                    }
                    View childAt = nb0Var.getChildAt(i11);
                    if (childAt instanceof h2) {
                        h2Var = (h2) childAt;
                        if (h2Var.S == efVar) {
                            break;
                        }
                    }
                    i11++;
                }
                bitmap = d(h2Var);
            }
            arrayList2.add(bitmap);
        }
    }

    public final int g() {
        int padding;
        nb0 nb0Var = this.d;
        if (nb0Var == null || nb0Var.getChildCount() <= 0) {
            padding = getPadding();
        } else {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i11 = 0; i11 < nb0Var.getChildCount(); i11++) {
                View childAt = nb0Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    i10 = Math.min(i10, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i10, getHeight()));
        }
        return nb0Var == null ? padding : org.telegram.messenger.i0.W1(nb0Var.getAlpha(), 0, padding);
    }

    public int getPadding() {
        return (int) (org.telegram.messenger.i0.q.y * 0.35f);
    }

    public we getSelectedAlbum() {
        return this.e0;
    }

    public String getTitle() {
        return cd.L0(this.L ? 2131754428 : 2131752121, null);
    }

    public final void h() {
        a aVar;
        tl tlVar = this.F;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = tlVar.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList arrayList = MediaController.a2;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.g0 = arrayList2;
        Collections.sort(arrayList2, new bi.v6(arrayList, 6));
        ArrayList arrayList3 = this.b0;
        boolean isEmpty = arrayList3.isEmpty();
        we weVar = j0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.g0;
            arrayList4.add(!arrayList4.isEmpty() ? 1 : 0, weVar);
        }
        boolean isEmpty2 = this.g0.isEmpty();
        TextView textView = this.D;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.E, (Drawable) null);
        int size = this.g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            we weVar2 = (we) this.g0.get(i10);
            if (weVar2 == weVar) {
                aVar = new a(getContext(), weVar2.d, cd.M0("StoryDraftsAlbum"), arrayList3.size(), this.b);
            } else {
                ArrayList b10 = b(weVar2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), weVar2.d, weVar2.c, b10.size(), this.b);
                }
            }
            tlVar.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new rh.u1(8, this, weVar2));
        }
    }

    public final void i() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.g0;
        boolean z10 = true;
        boolean z11 = arrayList2 != null && !arrayList2.isEmpty() && this.g0.get(0) == this.e0 && this.b0.size() > 2;
        this.c0 = z11;
        if (z11 || (this.e0 != j0 && ((arrayList = this.g0) == null || arrayList.isEmpty() || this.g0.get(0) != this.e0))) {
            z10 = false;
        }
        this.d0 = z10;
    }

    public final void j() {
        ArrayList arrayList = this.h0;
        boolean isEmpty = arrayList.isEmpty();
        boolean z10 = !isEmpty;
        ImageView imageView = this.H;
        if (imageView != null) {
            z20.m(imageView.animate().alpha(!isEmpty ? 1.0f : 0.0f).scaleX(!isEmpty ? 1.0f : 0.7f).scaleY(isEmpty ? 0.7f : 1.0f).translationY(!isEmpty ? -org.telegram.messenger.i0.n : org.telegram.messenger.i0.L(8.0f)), gr.h, 320L);
        }
        LinearLayout linearLayout = this.I;
        if (linearLayout != null) {
            d dVar = this.J;
            if (dVar != null) {
                dVar.i(cd.H(',', "StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            linearLayout.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(org.telegram.messenger.i0.n > 0 ? 0.0f : 10.0f) + org.telegram.messenger.i0.n);
            if (this.T != z10) {
                this.T = z10;
                linearLayout.setVisibility(0);
                linearLayout.animate().alpha(isEmpty ? 0.0f : 1.0f).translationY(isEmpty ? org.telegram.messenger.i0.L(32.0f) : 0.0f).setInterpolator(gr.h).setDuration(320L).setListener(new sg.y(10, this, z10)).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        zs.e().c(this, zs.r2);
        zs.f(this.a).c(this, zs.y5);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.e().n(this, zs.r2);
        zs.f(this.a).n(this, zs.y5);
        h2.e0.clear();
        h2.f0.evictAll();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = h2.c0;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                ((org.telegram.messenger.s5) arrayList.get(i10)).cleanupQueue();
                ((org.telegram.messenger.s5) arrayList.get(i10)).recycle();
                i10++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int L;
        float f7;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m;
        nb0 nb0Var = this.d;
        nb0Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int L2 = org.telegram.messenger.i0.L(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m;
        int L3 = org.telegram.messenger.i0.L(1.0f);
        LinearLayout linearLayout = this.I;
        if (linearLayout == null) {
            L = 0;
        } else {
            L = org.telegram.messenger.i0.L((org.telegram.messenger.i0.n > 0 ? 0 : 10) + zs.z1);
        }
        nb0Var.setPadding(L2, currentActionBarHeight2, L3, L + org.telegram.messenger.i0.n);
        ImageView imageView = this.H;
        if (imageView != null) {
            imageView.setTranslationY(-org.telegram.messenger.i0.n);
        }
        if (linearLayout != null) {
            linearLayout.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(org.telegram.messenger.i0.n > 0 ? 0.0f : 10.0f) + org.telegram.messenger.i0.n);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = org.telegram.messenger.i0.n;
        int i12 = org.telegram.messenger.i0.m;
        int L4 = org.telegram.messenger.i0.L(10.0f);
        TextView textView = this.D;
        textView.setPadding(0, i12, L4, 0);
        if (!org.telegram.messenger.i0.Q1()) {
            Point point = org.telegram.messenger.i0.q;
            if (point.x > point.y) {
                f7 = 18.0f;
                textView.setTextSize(f7);
                super.onMeasure(i10, i11);
            }
        }
        f7 = 20.0f;
        textView.setTextSize(f7);
        super.onMeasure(i10, i11);
    }

    public void setMaxCount(int i10) {
        this.R = i10;
    }

    public void setMultipleOnClick(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            org.telegram.messenger.i0.a4(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.V = runnable;
    }

    public void setOnSelectListener(j20 j20Var) {
        this.W = j20Var;
    }

    public void setOnSelectMultipleListener(l20 l20Var) {
        this.a0 = l20Var;
    }

    public void c(boolean z10) {
    }

    public void a() {
    }
}
