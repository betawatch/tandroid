package vh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class f0 extends z implements org.telegram.ui.ActionBar.a6 {
    public d0 B;
    public final int n;
    public final f6 r;
    public final HorizontalScrollView s;
    public final LinearLayout v;
    public final u1 w;
    public final TextView x;
    public final ArrayList y;

    public f0(Context context, int i10, f6 f6Var) {
        super(context);
        this.y = new ArrayList();
        this.n = i10;
        this.r = f6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, b6.e(-1, -1, 23));
        u1 u1Var = new u1(context, R.drawable.msg_add, f6Var);
        u1Var.e = 19;
        u1Var.e();
        this.w = u1Var;
        u1Var.setSelected(true);
        u1Var.setContentDescription(LocaleController.getString(R.string.Add));
        final int i11 = 0;
        u1Var.setOnClickListener(new View.OnClickListener(this) { // from class: vh.b0
            public final /* synthetic */ f0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (i11) {
                    case 0:
                        f0 f0Var = this.b;
                        d0 d0Var = f0Var.B;
                        if (d0Var != null && (aVar = f0Var.a) != null) {
                            s3 s3Var = ((k3) d0Var).a;
                            s3Var.n3(false);
                            s3Var.e3.m(new p3(s3Var, aVar, -1), view);
                            break;
                        }
                        break;
                    default:
                        f0 f0Var2 = this.b;
                        d0 d0Var2 = f0Var2.B;
                        if (d0Var2 != null && (aVar2 = f0Var2.a) != null) {
                            s3 s3Var2 = ((k3) d0Var2).a;
                            s3Var2.n3(false);
                            s3Var2.e3.m(new p3(s3Var2, aVar2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(u1Var, b6.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setText(LocaleController.getString(R.string.RichEditorAddButton));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(7.0f));
        textView.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        final int i12 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: vh.b0
            public final /* synthetic */ f0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (i12) {
                    case 0:
                        f0 f0Var = this.b;
                        d0 d0Var = f0Var.B;
                        if (d0Var != null && (aVar = f0Var.a) != null) {
                            s3 s3Var = ((k3) d0Var).a;
                            s3Var.n3(false);
                            s3Var.e3.m(new p3(s3Var, aVar, -1), view);
                            break;
                        }
                        break;
                    default:
                        f0 f0Var2 = this.b;
                        d0 d0Var2 = f0Var2.B;
                        if (d0Var2 != null && (aVar2 = f0Var2.a) != null) {
                            s3 s3Var2 = ((k3) d0Var2).a;
                            s3Var2.n3(false);
                            s3Var2.e3.m(new p3(s3Var2, aVar2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(textView, b6.e(-2, 38, 17));
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        this.w.e();
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
        int i10;
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
                i10 = 0;
                while (i10 < size) {
                    c0 c0Var = new c0(this, getContext(), pageblockbuttonrow.buttons.get(i10), i10);
                    arrayList2.add(c0Var);
                    linearLayout.addView(c0Var, b6.t(-2, -1, 16, i10 == 0 ? 0 : 7, 0, 0, 0));
                    i10++;
                }
                boolean z4 = size >= 8;
                this.s.setVisibility(size <= 0 ? 0 : 8);
                this.x.setVisibility(size != 0 ? 0 : 8);
                this.w.setVisibility((size > 0 || !z4) ? 8 : 0);
                requestLayout();
            }
        }
        pageblockbuttonrow = null;
        if (pageblockbuttonrow != null) {
        }
        i10 = 0;
        while (i10 < size) {
        }
        if (size >= 8) {
        }
        this.s.setVisibility(size <= 0 ? 0 : 8);
        this.x.setVisibility(size != 0 ? 0 : 8);
        this.w.setVisibility((size > 0 || !z4) ? 8 : 0);
        requestLayout();
    }

    public final void j() {
        int i10 = j6.Oh;
        f6 f6Var = this.r;
        int v02 = j6.v0(i10, f6Var);
        int v = j6.v(j6.v0(j6.d6, f6Var), j6.l1(0.1f, v02));
        TextView textView = this.x;
        textView.setTextColor(v02);
        textView.setBackground(j6.Z(v, j6.l1(0.16f, v02), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_add).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp;
        int dp2;
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
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
                int i15 = size3 - 1;
                int max2 = Math.max(0, max - (AndroidUtilities.dp(7.0f) * i15));
                int[] iArr = new int[size3];
                int i16 = 0;
                for (int i17 = 0; i17 < size3; i17++) {
                    c0 c0Var = (c0) arrayList.get(i17);
                    c0Var.getClass();
                    int max3 = Math.max(AndroidUtilities.dp(34.0f), c0Var.a.getPreferredWidth());
                    iArr[i17] = max3;
                    i16 += max3;
                }
                if (i16 <= max2) {
                    boolean[] zArr = new boolean[size3];
                    int i18 = size3;
                    boolean z4 = true;
                    while (z4 && i18 > 0) {
                        int i19 = max2 / i18;
                        int i20 = i18;
                        boolean z10 = false;
                        for (int i21 = 0; i21 < size3; i21++) {
                            if (!zArr[i21] && (i14 = iArr[i21]) > i19) {
                                zArr[i21] = true;
                                max2 -= i14;
                                i20--;
                                z10 = true;
                            }
                        }
                        z4 = z10;
                        i18 = i20;
                    }
                    if (i18 > 0) {
                        int i22 = max2 / i18;
                        int i23 = max2 - (i18 * i22);
                        for (int i24 = 0; i24 < size3; i24++) {
                            if (!zArr[i24]) {
                                int i25 = i23 - 1;
                                iArr[i24] = (i23 > 0 ? 1 : 0) + i22;
                                i23 = i25;
                            }
                        }
                    }
                } else {
                    int i26 = 0;
                    for (int i27 = 0; i27 < size3; i27++) {
                        int i28 = iArr[i27];
                        c0 c0Var2 = (c0) arrayList.get(i27);
                        c0Var2.getClass();
                        i26 += i28 - Math.max(AndroidUtilities.dp(34.0f), c0Var2.a.getMinWidth());
                    }
                    if (i26 <= 0) {
                        for (int i29 = 0; i29 < size3; i29++) {
                            c0 c0Var3 = (c0) arrayList.get(i29);
                            c0Var3.getClass();
                            iArr[i29] = Math.max(AndroidUtilities.dp(34.0f), c0Var3.a.getMinWidth());
                        }
                    } else {
                        int min = Math.min(i16 - max2, i26);
                        int i30 = 0;
                        int i31 = 0;
                        while (i30 < size3) {
                            int i32 = iArr[i30];
                            c0 c0Var4 = (c0) arrayList.get(i30);
                            c0Var4.getClass();
                            int max4 = i32 - Math.max(AndroidUtilities.dp(34.0f), c0Var4.a.getMinWidth());
                            if (i30 == i15) {
                                i13 = min - i31;
                                i12 = min;
                            } else {
                                i12 = min;
                                i13 = (int) ((min * max4) / i26);
                            }
                            int min2 = Math.min(i13, max4);
                            iArr[i30] = iArr[i30] - min2;
                            i31 += min2;
                            i30++;
                            min = i12;
                        }
                    }
                }
                for (int i33 = 0; i33 < size3; i33++) {
                    c0 c0Var5 = (c0) arrayList.get(i33);
                    int i34 = iArr[i33];
                    RichMessageLayout.RichButton richButton = c0Var5.a;
                    richButton.width = Math.max(AndroidUtilities.dp(34.0f), i34);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) c0Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i35 = layoutParams2.width;
                        int i36 = richButton.width;
                        if (i35 != i36) {
                            layoutParams2.width = i36;
                            c0Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            dp = ((c0) arrayList.get(0)).a.getHeight();
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
