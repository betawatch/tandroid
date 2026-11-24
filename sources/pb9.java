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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class pb9 extends jb9 implements tjb {
    public final ArrayList E;
    public nb9 F;
    public int G;
    public int H;
    public final bg7 I;
    public final int n;
    public final wjb r;
    public final HorizontalScrollView s;
    public final LinearLayout w;
    public final dd9 x;
    public final TextView y;

    public pb9(int i, wjb wjbVar, Context context) {
        super(context);
        this.E = new ArrayList();
        this.I = new bg7(this, (byte) 17);
        this.n = i;
        this.r = wjbVar;
        f(gl.L(16.0f), gl.L(4.0f), gl.L(16.0f), gl.L(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.s = horizontalScrollView;
        final byte b = 0;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, nme.e(-1, -1, 23));
        dd9 dd9Var = new dd9(R.drawable.msg_add, wjbVar, context);
        dd9Var.e = (byte) 19;
        dd9Var.updateColors();
        this.x = dd9Var;
        final byte b2 = 1;
        dd9Var.setSelected(true);
        dd9Var.setContentDescription(k96.M0(2131754483, null));
        dd9Var.setOnClickListener(new View.OnClickListener(this) { // from class: lb9
            public final /* synthetic */ pb9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lk0 lk0Var;
                lk0 lk0Var2;
                byte b3 = b;
                pb9 pb9Var = this.b;
                switch (b3) {
                    case 0:
                        nb9 nb9Var = pb9Var.F;
                        if (nb9Var != null && (lk0Var = pb9Var.a) != null) {
                            ye9 ye9Var = ((qe9) nb9Var).a;
                            ye9Var.k3(false);
                            ye9Var.p3.Q(new ve9(ye9Var, lk0Var, -1), view);
                            break;
                        }
                        break;
                    default:
                        nb9 nb9Var2 = pb9Var.F;
                        if (nb9Var2 != null && (lk0Var2 = pb9Var.a) != null) {
                            ye9 ye9Var2 = ((qe9) nb9Var2).a;
                            ye9Var2.k3(false);
                            ye9Var2.p3.Q(new ve9(ye9Var2, lk0Var2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(dd9Var, nme.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.y = textView;
        textView.setText(k96.M0(2131745819, null));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(gl.L(7.0f));
        textView.setPadding(gl.L(15.0f), 0, gl.L(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: lb9
            public final /* synthetic */ pb9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lk0 lk0Var;
                lk0 lk0Var2;
                byte b3 = b2;
                pb9 pb9Var = this.b;
                switch (b3) {
                    case 0:
                        nb9 nb9Var = pb9Var.F;
                        if (nb9Var != null && (lk0Var = pb9Var.a) != null) {
                            ye9 ye9Var = ((qe9) nb9Var).a;
                            ye9Var.k3(false);
                            ye9Var.p3.Q(new ve9(ye9Var, lk0Var, -1), view);
                            break;
                        }
                        break;
                    default:
                        nb9 nb9Var2 = pb9Var.F;
                        if (nb9Var2 != null && (lk0Var2 = pb9Var.a) != null) {
                            ye9 ye9Var2 = ((qe9) nb9Var2).a;
                            ye9Var2.k3(false);
                            ye9Var2.p3.Q(new ve9(ye9Var2, lk0Var2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(textView, nme.e(-2, 38, 17));
        int i2 = bkb.Ei;
        int v0 = bkb.v0(i2, wjbVar);
        int v = bkb.v(bkb.v0(bkb.c6, wjbVar), bkb.p1(0.1f, v0));
        zkb.X(textView, i2, wjbVar);
        textView.setBackground(bkb.Z(v, bkb.p1(0.16f, v0), gl.L(19.0f), gl.L(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_add).mutate();
        zkb.x(this, mutate, i2, wjbVar, PorterDuff.Mode.SRC_IN);
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

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.c6));
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
        lk0 lk0Var = this.a;
        if (lk0Var != null) {
            TL_iv.PageBlock pageBlock = lk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                size = (pageblockbuttonrow != null || (arrayList = pageblockbuttonrow.buttons) == null) ? 0 : arrayList.size();
                i = 0;
                while (i < size) {
                    mb9 mb9Var = new mb9(this, getContext(), pageblockbuttonrow.buttons.get(i), i);
                    arrayList2.add(mb9Var);
                    linearLayout.addView(mb9Var, nme.t(-2, -1, 16, i == 0 ? 0 : 7, 0, 0, 0));
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
        int L3 = (size2 <= 0 || size2 >= 8) ? 0 : gl.L(45.0f);
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
                int max2 = Math.max(0, max - (gl.L(7.0f) * i6));
                int[] iArr = new int[size3];
                int i7 = 0;
                for (int i8 = 0; i8 < size3; i8++) {
                    mb9 mb9Var = (mb9) arrayList.get(i8);
                    mb9Var.getClass();
                    int max3 = Math.max(gl.L(34.0f), mb9Var.a.h());
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
                        mb9 mb9Var2 = (mb9) arrayList.get(i18);
                        mb9Var2.getClass();
                        i17 += i19 - Math.max(gl.L(34.0f), mb9Var2.a.e());
                    }
                    if (i17 <= 0) {
                        for (int i20 = 0; i20 < size3; i20++) {
                            mb9 mb9Var3 = (mb9) arrayList.get(i20);
                            mb9Var3.getClass();
                            iArr[i20] = Math.max(gl.L(34.0f), mb9Var3.a.e());
                        }
                    } else {
                        int min = Math.min(i7 - max2, i17);
                        int i21 = 0;
                        int i22 = 0;
                        while (i21 < size3) {
                            int i23 = iArr[i21];
                            mb9 mb9Var4 = (mb9) arrayList.get(i21);
                            mb9Var4.getClass();
                            int max4 = i23 - Math.max(gl.L(34.0f), mb9Var4.a.e());
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
                    mb9 mb9Var5 = (mb9) arrayList.get(i24);
                    int i25 = iArr[i24];
                    og9 og9Var = mb9Var5.a;
                    og9Var.e = Math.max(gl.L(34.0f), i25);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) mb9Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i26 = layoutParams2.width;
                        int i27 = og9Var.e;
                        if (i26 != i27) {
                            layoutParams2.width = i27;
                            mb9Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            L = ((mb9) arrayList.get(0)).a.c();
            L2 = gl.L(8.0f);
        } else {
            L = gl.L(gba.T0 + 18);
            L2 = gl.L(8.0f);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + L2 + L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
        setMeasuredDimension(size, paddingBottom);
    }

    @Override // tjb
    public final void updateColors() {
        this.x.updateColors();
        int i = bkb.Ei;
        wjb wjbVar = this.r;
        int v0 = bkb.v0(i, wjbVar);
        int i2 = bkb.c6;
        int v02 = bkb.v0(i2, wjbVar);
        if (v0 == this.G && v02 == this.H) {
            return;
        }
        this.G = v0;
        this.H = v02;
        TextView textView = this.y;
        Drawable background = textView.getBackground();
        bkb.F1(background, bkb.v(v02, bkb.p1(0.1f, v0)), false);
        bkb.F1(background, bkb.p1(0.16f, v0), true);
        textView.invalidate();
        bg7 bg7Var = this.I;
        removeCallbacks(bg7Var);
        postDelayed(bg7Var, 100L);
        try {
            if (getBackground() instanceof ed9) {
                ((ed9) getBackground()).a(bkb.v0(i2, wjbVar));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
