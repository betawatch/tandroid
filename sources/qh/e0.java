package qh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class e0 extends y implements org.telegram.ui.ActionBar.w5 {
    public c0 A;
    public final int n;
    public final b6 r;
    public final HorizontalScrollView s;
    public final LinearLayout v;
    public final t1 w;
    public final TextView x;
    public final ArrayList y;

    public e0(Context context, int i9, b6 b6Var) {
        super(context);
        this.y = new ArrayList();
        this.n = i9;
        this.r = b6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, e6.e(-1, -1, 23));
        t1 t1Var = new t1(context, R.drawable.msg_add, b6Var);
        t1Var.e = 19;
        t1Var.d();
        this.w = t1Var;
        t1Var.setSelected(true);
        t1Var.setContentDescription(LocaleController.getString(R.string.Add));
        final int i10 = 0;
        t1Var.setOnClickListener(new View.OnClickListener(this) { // from class: qh.a0
            public final /* synthetic */ e0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (i10) {
                    case 0:
                        e0 e0Var = this.b;
                        c0 c0Var = e0Var.A;
                        if (c0Var != null && (aVar = e0Var.a) != null) {
                            o3 o3Var = ((g3) c0Var).a;
                            o3Var.o3(false);
                            o3Var.d3.d2(new l3(o3Var, aVar, -1), view);
                            break;
                        }
                        break;
                    default:
                        e0 e0Var2 = this.b;
                        c0 c0Var2 = e0Var2.A;
                        if (c0Var2 != null && (aVar2 = e0Var2.a) != null) {
                            o3 o3Var2 = ((g3) c0Var2).a;
                            o3Var2.o3(false);
                            o3Var2.d3.d2(new l3(o3Var2, aVar2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(t1Var, e6.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setText(LocaleController.getString(R.string.RichEditorAddButton));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(7.0f));
        textView.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        final int i11 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: qh.a0
            public final /* synthetic */ e0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (i11) {
                    case 0:
                        e0 e0Var = this.b;
                        c0 c0Var = e0Var.A;
                        if (c0Var != null && (aVar = e0Var.a) != null) {
                            o3 o3Var = ((g3) c0Var).a;
                            o3Var.o3(false);
                            o3Var.d3.d2(new l3(o3Var, aVar, -1), view);
                            break;
                        }
                        break;
                    default:
                        e0 e0Var2 = this.b;
                        c0 c0Var2 = e0Var2.A;
                        if (c0Var2 != null && (aVar2 = e0Var2.a) != null) {
                            o3 o3Var2 = ((g3) c0Var2).a;
                            o3Var2.o3(false);
                            o3Var2.d3.d2(new l3(o3Var2, aVar2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(textView, e6.e(-2, 38, 17));
        j();
    }

    public static boolean h(View view, float f10, float f11) {
        if (view.getVisibility() != 0) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (f10 >= iArr[0] && f10 <= view.getWidth() + r2) {
            if (f11 >= iArr[1] && f11 <= view.getHeight() + r0) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        this.w.d();
        j();
        i();
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        TL_iv.pageBlockButtonRow pageblockbuttonrow;
        int size;
        int i9;
        ArrayList<TL_keyboard.PageButton> arrayList;
        LinearLayout linearLayout = this.v;
        linearLayout.removeAllViews();
        ArrayList arrayList2 = this.y;
        arrayList2.clear();
        a aVar = this.a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                size = (pageblockbuttonrow != null || (arrayList = pageblockbuttonrow.buttons) == null) ? 0 : arrayList.size();
                i9 = 0;
                while (i9 < size) {
                    b0 b0Var = new b0(this, getContext(), pageblockbuttonrow.buttons.get(i9), i9);
                    arrayList2.add(b0Var);
                    linearLayout.addView(b0Var, e6.t(-2, -1, 16, i9 == 0 ? 0 : 7, 0, 0, 0));
                    i9++;
                }
                boolean z10 = size >= 8;
                this.s.setVisibility(size <= 0 ? 0 : 8);
                this.x.setVisibility(size != 0 ? 0 : 8);
                this.w.setVisibility((size > 0 || !z10) ? 8 : 0);
                requestLayout();
            }
        }
        pageblockbuttonrow = null;
        if (pageblockbuttonrow != null) {
        }
        i9 = 0;
        while (i9 < size) {
        }
        if (size >= 8) {
        }
        this.s.setVisibility(size <= 0 ? 0 : 8);
        this.x.setVisibility(size != 0 ? 0 : 8);
        this.w.setVisibility((size > 0 || !z10) ? 8 : 0);
        requestLayout();
    }

    public final void j() {
        int i9 = f6.Oh;
        b6 b6Var = this.r;
        int v02 = f6.v0(i9, b6Var);
        int v = f6.v(f6.v0(f6.d6, b6Var), f6.l1(0.1f, v02));
        TextView textView = this.x;
        textView.setTextColor(v02);
        textView.setBackground(f6.Z(v, f6.l1(0.16f, v02), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_add).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int dp;
        int dp2;
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i9);
        ArrayList arrayList = this.y;
        int size2 = arrayList.size();
        int dp3 = (size2 <= 0 || size2 >= 8) ? 0 : AndroidUtilities.dp(45.0f);
        HorizontalScrollView horizontalScrollView = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) horizontalScrollView.getLayoutParams();
        if (layoutParams.rightMargin != dp3) {
            layoutParams.rightMargin = dp3;
            horizontalScrollView.setLayoutParams(layoutParams);
        }
        if (size2 > 0) {
            int max = Math.max(0, ((size - getPaddingLeft()) - getPaddingRight()) - dp3);
            int size3 = arrayList.size();
            if (size3 != 0) {
                int i14 = size3 - 1;
                int max2 = Math.max(0, max - (AndroidUtilities.dp(7.0f) * i14));
                int[] iArr = new int[size3];
                int i15 = 0;
                for (int i16 = 0; i16 < size3; i16++) {
                    b0 b0Var = (b0) arrayList.get(i16);
                    b0Var.getClass();
                    int max3 = Math.max(AndroidUtilities.dp(34.0f), b0Var.a.getPreferredWidth());
                    iArr[i16] = max3;
                    i15 += max3;
                }
                if (i15 <= max2) {
                    boolean[] zArr = new boolean[size3];
                    int i17 = size3;
                    boolean z10 = true;
                    while (z10 && i17 > 0) {
                        int i18 = max2 / i17;
                        int i19 = i17;
                        boolean z11 = false;
                        for (int i20 = 0; i20 < size3; i20++) {
                            if (!zArr[i20] && (i13 = iArr[i20]) > i18) {
                                zArr[i20] = true;
                                max2 -= i13;
                                i19--;
                                z11 = true;
                            }
                        }
                        z10 = z11;
                        i17 = i19;
                    }
                    if (i17 > 0) {
                        int i21 = max2 / i17;
                        int i22 = max2 - (i17 * i21);
                        for (int i23 = 0; i23 < size3; i23++) {
                            if (!zArr[i23]) {
                                int i24 = i22 - 1;
                                iArr[i23] = (i22 > 0 ? 1 : 0) + i21;
                                i22 = i24;
                            }
                        }
                    }
                } else {
                    int i25 = 0;
                    for (int i26 = 0; i26 < size3; i26++) {
                        int i27 = iArr[i26];
                        b0 b0Var2 = (b0) arrayList.get(i26);
                        b0Var2.getClass();
                        i25 += i27 - Math.max(AndroidUtilities.dp(34.0f), b0Var2.a.getMinWidth());
                    }
                    if (i25 <= 0) {
                        for (int i28 = 0; i28 < size3; i28++) {
                            b0 b0Var3 = (b0) arrayList.get(i28);
                            b0Var3.getClass();
                            iArr[i28] = Math.max(AndroidUtilities.dp(34.0f), b0Var3.a.getMinWidth());
                        }
                    } else {
                        int min = Math.min(i15 - max2, i25);
                        int i29 = 0;
                        int i30 = 0;
                        while (i29 < size3) {
                            int i31 = iArr[i29];
                            b0 b0Var4 = (b0) arrayList.get(i29);
                            b0Var4.getClass();
                            int max4 = i31 - Math.max(AndroidUtilities.dp(34.0f), b0Var4.a.getMinWidth());
                            if (i29 == i14) {
                                i12 = min - i30;
                                i11 = min;
                            } else {
                                i11 = min;
                                i12 = (int) ((min * max4) / i25);
                            }
                            int min2 = Math.min(i12, max4);
                            iArr[i29] = iArr[i29] - min2;
                            i30 += min2;
                            i29++;
                            min = i11;
                        }
                    }
                }
                for (int i32 = 0; i32 < size3; i32++) {
                    b0 b0Var5 = (b0) arrayList.get(i32);
                    int i33 = iArr[i32];
                    RichMessageLayout.RichButton richButton = b0Var5.a;
                    richButton.width = Math.max(AndroidUtilities.dp(34.0f), i33);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) b0Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i34 = layoutParams2.width;
                        int i35 = richButton.width;
                        if (i34 != i35) {
                            layoutParams2.width = i35;
                            b0Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            dp = ((b0) arrayList.get(0)).a.getHeight();
            dp2 = AndroidUtilities.dp(8.0f);
        } else {
            dp = AndroidUtilities.dp(SharedConfig.fontSize + 18);
            dp2 = AndroidUtilities.dp(8.0f);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + dp2 + dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
        setMeasuredDimension(size, paddingBottom);
    }
}
