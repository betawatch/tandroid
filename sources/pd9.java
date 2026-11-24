// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class pd9 extends jd9 implements vlb {
    public final ArrayList E;
    public nd9 F;
    public int G;
    public int H;
    public final ei7 I;
    public final int n;
    public final ylb r;
    public final HorizontalScrollView s;
    public final LinearLayout w;
    public final ff9 x;
    public final TextView y;

    public pd9(int i, ylb ylbVar, Context context) {
        super(context);
        this.E = new ArrayList();
        this.I = new ei7(this, (byte) 17);
        this.n = i;
        this.r = ylbVar;
        f(gm.L(16.0f), gm.L(4.0f), gm.L(16.0f), gm.L(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.s = horizontalScrollView;
        final byte b = 0;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, qoe.e(-1, -1, 23));
        ff9 ff9Var = new ff9(R.drawable.msg_add, ylbVar, context);
        ff9Var.e = (byte) 19;
        ff9Var.updateColors();
        this.x = ff9Var;
        final byte b2 = 1;
        ff9Var.setSelected(true);
        ff9Var.setContentDescription(jb6.M0(2131754483, null));
        ff9Var.setOnClickListener(new View.OnClickListener(this) { // from class: ld9
            public final /* synthetic */ pd9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ll0 ll0Var;
                ll0 ll0Var2;
                byte b3 = b;
                pd9 pd9Var = this.b;
                switch (b3) {
                    case 0:
                        nd9 nd9Var = pd9Var.F;
                        if (nd9Var != null && (ll0Var = pd9Var.a) != null) {
                            ch9 ch9Var = ((ug9) nd9Var).a;
                            ch9Var.k3(false);
                            ch9Var.p3.I(new zg9(ch9Var, ll0Var, -1), view);
                            break;
                        }
                        break;
                    default:
                        nd9 nd9Var2 = pd9Var.F;
                        if (nd9Var2 != null && (ll0Var2 = pd9Var.a) != null) {
                            ch9 ch9Var2 = ((ug9) nd9Var2).a;
                            ch9Var2.k3(false);
                            ch9Var2.p3.I(new zg9(ch9Var2, ll0Var2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(ff9Var, qoe.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.y = textView;
        textView.setText(jb6.M0(2131745745, null));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(gm.L(7.0f));
        textView.setPadding(gm.L(15.0f), 0, gm.L(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: ld9
            public final /* synthetic */ pd9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ll0 ll0Var;
                ll0 ll0Var2;
                byte b3 = b2;
                pd9 pd9Var = this.b;
                switch (b3) {
                    case 0:
                        nd9 nd9Var = pd9Var.F;
                        if (nd9Var != null && (ll0Var = pd9Var.a) != null) {
                            ch9 ch9Var = ((ug9) nd9Var).a;
                            ch9Var.k3(false);
                            ch9Var.p3.I(new zg9(ch9Var, ll0Var, -1), view);
                            break;
                        }
                        break;
                    default:
                        nd9 nd9Var2 = pd9Var.F;
                        if (nd9Var2 != null && (ll0Var2 = pd9Var.a) != null) {
                            ch9 ch9Var2 = ((ug9) nd9Var2).a;
                            ch9Var2.k3(false);
                            ch9Var2.p3.I(new zg9(ch9Var2, ll0Var2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(textView, qoe.e(-2, 38, 17));
        int i2 = cmb.Ei;
        int v0 = cmb.v0(i2, ylbVar);
        int v = cmb.v(cmb.v0(cmb.c6, ylbVar), cmb.p1(0.1f, v0));
        anb.X(textView, i2, ylbVar);
        textView.setBackground(cmb.Z(v, cmb.p1(0.16f, v0), gm.L(19.0f), gm.L(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_add).mutate();
        anb.x(this, mutate, i2, ylbVar, PorterDuff.Mode.SRC_IN);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static boolean g(View view, float f, float f2) {
        if (view.getVisibility() != 0) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (f >= iArr[0] && f <= view.getWidth() + r2) {
            if (f2 >= iArr[1] && f2 <= view.getHeight() + r0) {
                return true;
            }
        }
        return false;
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        TL_iv.pageBlockButtonRow pageblockbuttonrow;
        int size;
        int i;
        ArrayList<TL_keyboard.PageButton> arrayList;
        LinearLayout linearLayout = this.w;
        linearLayout.removeAllViews();
        ArrayList arrayList2 = this.E;
        arrayList2.clear();
        ll0 ll0Var = this.a;
        if (ll0Var != null) {
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                size = (pageblockbuttonrow != null || (arrayList = pageblockbuttonrow.buttons) == null) ? 0 : arrayList.size();
                i = 0;
                while (i < size) {
                    md9 md9Var = new md9(this, getContext(), pageblockbuttonrow.buttons.get(i), i);
                    arrayList2.add(md9Var);
                    linearLayout.addView(md9Var, qoe.t(-2, -1, 16, i == 0 ? 0 : 7, 0, 0, 0));
                    i++;
                }
                boolean z = size >= 8;
                this.s.setVisibility(size <= 0 ? 0 : 8);
                this.y.setVisibility(size != 0 ? 0 : 8);
                this.x.setVisibility((size > 0 || !z) ? 8 : 0);
                requestLayout();
            }
        }
        pageblockbuttonrow = null;
        if (pageblockbuttonrow != null) {
        }
        i = 0;
        while (i < size) {
        }
        if (size >= 8) {
        }
        this.s.setVisibility(size <= 0 ? 0 : 8);
        this.y.setVisibility(size != 0 ? 0 : 8);
        this.x.setVisibility((size > 0 || !z) ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int L;
        int L2;
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        ArrayList arrayList = this.E;
        int size2 = arrayList.size();
        int L3 = (size2 <= 0 || size2 >= 8) ? 0 : gm.L(45.0f);
        HorizontalScrollView horizontalScrollView = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) horizontalScrollView.getLayoutParams();
        if (layoutParams.rightMargin != L3) {
            layoutParams.rightMargin = L3;
            horizontalScrollView.setLayoutParams(layoutParams);
        }
        if (size2 > 0) {
            int max = Math.max(0, ((size - getPaddingLeft()) - getPaddingRight()) - L3);
            int size3 = arrayList.size();
            if (size3 != 0) {
                int i6 = size3 - 1;
                int max2 = Math.max(0, max - (gm.L(7.0f) * i6));
                int[] iArr = new int[size3];
                int i7 = 0;
                for (int i8 = 0; i8 < size3; i8++) {
                    md9 md9Var = (md9) arrayList.get(i8);
                    md9Var.getClass();
                    int max3 = Math.max(gm.L(34.0f), md9Var.a.i());
                    iArr[i8] = max3;
                    i7 += max3;
                }
                if (i7 <= max2) {
                    boolean[] zArr = new boolean[size3];
                    int i9 = size3;
                    boolean z = true;
                    while (z && i9 > 0) {
                        int i10 = max2 / i9;
                        int i11 = i9;
                        boolean z2 = false;
                        for (int i12 = 0; i12 < size3; i12++) {
                            if (!zArr[i12] && (i5 = iArr[i12]) > i10) {
                                zArr[i12] = true;
                                max2 -= i5;
                                i11--;
                                z2 = true;
                            }
                        }
                        z = z2;
                        i9 = i11;
                    }
                    if (i9 > 0) {
                        int i13 = max2 / i9;
                        int i14 = max2 - (i9 * i13);
                        for (int i15 = 0; i15 < size3; i15++) {
                            if (!zArr[i15]) {
                                int i16 = i14 - 1;
                                iArr[i15] = (i14 > 0 ? 1 : 0) + i13;
                                i14 = i16;
                            }
                        }
                    }
                } else {
                    int i17 = 0;
                    for (int i18 = 0; i18 < size3; i18++) {
                        int i19 = iArr[i18];
                        md9 md9Var2 = (md9) arrayList.get(i18);
                        md9Var2.getClass();
                        i17 += i19 - Math.max(gm.L(34.0f), md9Var2.a.f());
                    }
                    if (i17 <= 0) {
                        for (int i20 = 0; i20 < size3; i20++) {
                            md9 md9Var3 = (md9) arrayList.get(i20);
                            md9Var3.getClass();
                            iArr[i20] = Math.max(gm.L(34.0f), md9Var3.a.f());
                        }
                    } else {
                        int min = Math.min(i7 - max2, i17);
                        int i21 = 0;
                        int i22 = 0;
                        while (i21 < size3) {
                            int i23 = iArr[i21];
                            md9 md9Var4 = (md9) arrayList.get(i21);
                            md9Var4.getClass();
                            int max4 = i23 - Math.max(gm.L(34.0f), md9Var4.a.f());
                            if (i21 == i6) {
                                i4 = min - i22;
                                i3 = min;
                            } else {
                                i3 = min;
                                i4 = (int) ((min * max4) / i17);
                            }
                            int min2 = Math.min(i4, max4);
                            iArr[i21] = iArr[i21] - min2;
                            i22 += min2;
                            i21++;
                            min = i3;
                        }
                    }
                }
                for (int i24 = 0; i24 < size3; i24++) {
                    md9 md9Var5 = (md9) arrayList.get(i24);
                    int i25 = iArr[i24];
                    ri9 ri9Var = md9Var5.a;
                    ri9Var.e = Math.max(gm.L(34.0f), i25);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) md9Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i26 = layoutParams2.width;
                        int i27 = ri9Var.e;
                        if (i26 != i27) {
                            layoutParams2.width = i27;
                            md9Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            L = ((md9) arrayList.get(0)).a.d();
            L2 = gm.L(8.0f);
        } else {
            L = gm.L(gda.S0 + 18);
            L2 = gm.L(8.0f);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + L2 + L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
        setMeasuredDimension(size, paddingBottom);
    }

    @Override // vlb
    public final void updateColors() {
        this.x.updateColors();
        int i = cmb.Ei;
        ylb ylbVar = this.r;
        int v0 = cmb.v0(i, ylbVar);
        int i2 = cmb.c6;
        int v02 = cmb.v0(i2, ylbVar);
        if (v0 == this.G && v02 == this.H) {
            return;
        }
        this.G = v0;
        this.H = v02;
        TextView textView = this.y;
        Drawable background = textView.getBackground();
        cmb.F1(background, cmb.v(v02, cmb.p1(0.1f, v0)), false);
        cmb.F1(background, cmb.p1(0.16f, v0), true);
        textView.invalidate();
        ei7 ei7Var = this.I;
        removeCallbacks(ei7Var);
        postDelayed(ei7Var, 100L);
        try {
            if (getBackground() instanceof gf9) {
                ((gf9) getBackground()).a(cmb.v0(i2, ylbVar));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
