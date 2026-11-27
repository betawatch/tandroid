// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class t8 extends ViewGroup {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8(e eVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = eVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        wk5 wk5Var;
        switch (this.a) {
            case 2:
                boolean drawChild = super.drawChild(canvas, view, j);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f) {
                    wk5Var = ((e) usersSelectActivity).parentLayout;
                    ((ActionBarLayout) wk5Var).o(canvas, usersSelectActivity.a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a aVar;
        float f;
        float f2;
        a aVar2;
        a aVar3;
        a aVar4;
        a aVar5;
        byte b = this.a;
        e eVar = this.b;
        switch (b) {
            case 0:
                v8 v8Var = (v8) eVar;
                aVar = ((e) v8Var).actionBar;
                if (aVar != null) {
                    aVar2 = ((e) v8Var).actionBar;
                    aVar3 = ((e) v8Var).actionBar;
                    aVar2.layout(0, 0, i3, aVar3.getMeasuredHeight());
                }
                int i5 = i3 - i;
                int i6 = i4 - i2;
                byte b2 = v8Var.w;
                if (b2 == 0) {
                    e29 e29Var = v8Var.a;
                    if (i3 <= i4) {
                        float f3 = i6;
                        int i7 = (int) (0.188f * f3);
                        e29Var.layout(0, i7, e29Var.getMeasuredWidth(), v8Var.a.getMeasuredHeight() + i7);
                        int i8 = (int) (0.651f * f3);
                        TextView textView = v8Var.e;
                        textView.layout(0, i8, textView.getMeasuredWidth(), v8Var.e.getMeasuredHeight() + i8);
                        int i9 = (int) (0.731f * f3);
                        TextView textView2 = v8Var.f;
                        textView2.layout(0, i9, textView2.getMeasuredWidth(), v8Var.f.getMeasuredHeight() + i9);
                        int measuredWidth = (i5 - v8Var.c.getMeasuredWidth()) / 2;
                        int i10 = (int) (f3 * 0.853f);
                        u8 u8Var = v8Var.c;
                        u8Var.layout(measuredWidth, i10, u8Var.getMeasuredWidth() + measuredWidth, v8Var.c.getMeasuredHeight() + i10);
                        break;
                    } else {
                        int measuredHeight = (i6 - e29Var.getMeasuredHeight()) / 2;
                        e29 e29Var2 = v8Var.a;
                        e29Var2.layout(0, measuredHeight, e29Var2.getMeasuredWidth(), v8Var.a.getMeasuredHeight() + measuredHeight);
                        float f4 = i5;
                        float f5 = 0.4f * f4;
                        int i11 = (int) f5;
                        float f6 = i6;
                        int i12 = (int) (0.22f * f6);
                        TextView textView3 = v8Var.e;
                        textView3.layout(i11, i12, textView3.getMeasuredWidth() + i11, v8Var.e.getMeasuredHeight() + i12);
                        int i13 = (int) (0.39f * f6);
                        TextView textView4 = v8Var.f;
                        textView4.layout(i11, i13, textView4.getMeasuredWidth() + i11, v8Var.f.getMeasuredHeight() + i13);
                        int z2 = (int) bp1.z(f4 * 0.6f, v8Var.c.getMeasuredWidth(), 2.0f, f5);
                        int i14 = (int) (f6 * 0.69f);
                        u8 u8Var2 = v8Var.c;
                        u8Var2.layout(z2, i14, u8Var2.getMeasuredWidth() + z2, v8Var.c.getMeasuredHeight() + i14);
                        break;
                    }
                } else if (b2 == 3) {
                    e29 e29Var3 = v8Var.a;
                    if (i3 <= i4) {
                        int i15 = (int) (i6 * 0.3f);
                        int measuredWidth2 = (i5 - e29Var3.getMeasuredWidth()) / 2;
                        e29 e29Var4 = v8Var.a;
                        e29Var4.layout(measuredWidth2, i15, e29Var4.getMeasuredWidth() + measuredWidth2, v8Var.a.getMeasuredHeight() + i15);
                        int w = uh9.w(24.0f, v8Var.a.getMeasuredHeight(), i15);
                        TextView textView5 = v8Var.e;
                        textView5.layout(0, w, textView5.getMeasuredWidth(), v8Var.e.getMeasuredHeight() + w);
                        int textSize = (int) (v8Var.e.getTextSize() + hl.L(16.0f) + w);
                        TextView textView6 = v8Var.f;
                        textView6.layout(0, textSize, textView6.getMeasuredWidth(), v8Var.f.getMeasuredHeight() + textSize);
                        int measuredWidth3 = (i5 - v8Var.c.getMeasuredWidth()) / 2;
                        int measuredHeight2 = (i6 - v8Var.c.getMeasuredHeight()) - hl.L(48.0f);
                        u8 u8Var3 = v8Var.c;
                        u8Var3.layout(measuredWidth3, measuredHeight2, u8Var3.getMeasuredWidth() + measuredWidth3, v8Var.c.getMeasuredHeight() + measuredHeight2);
                        int measuredWidth4 = (i5 - v8Var.d.getMeasuredWidth()) / 2;
                        int B = ik8.B(32.0f, v8Var.d.getMeasuredHeight(), measuredHeight2);
                        TextView textView7 = v8Var.d;
                        textView7.layout(measuredWidth4, B, textView7.getMeasuredWidth() + measuredWidth4, v8Var.d.getMeasuredHeight() + B);
                        break;
                    } else {
                        float f7 = i6;
                        int measuredHeight3 = ((int) ((0.95f * f7) - e29Var3.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - v8Var.a.getMeasuredWidth());
                        e29 e29Var5 = v8Var.a;
                        e29Var5.layout(width, measuredHeight3, e29Var5.getMeasuredWidth() + width, v8Var.a.getMeasuredHeight() + measuredHeight3);
                        float f8 = i5;
                        float f9 = 0.4f * f8;
                        int i16 = (int) f9;
                        int i17 = (int) (0.12f * f7);
                        TextView textView8 = v8Var.e;
                        textView8.layout(i16, i17, textView8.getMeasuredWidth() + i16, v8Var.e.getMeasuredHeight() + i17);
                        int i18 = (int) (0.24f * f7);
                        TextView textView9 = v8Var.f;
                        textView9.layout(i16, i18, textView9.getMeasuredWidth() + i16, v8Var.f.getMeasuredHeight() + i18);
                        float f10 = f8 * 0.6f;
                        int z3 = (int) bp1.z(f10, v8Var.c.getMeasuredWidth(), 2.0f, f9);
                        int i19 = (int) (f7 * 0.8f);
                        u8 u8Var4 = v8Var.c;
                        u8Var4.layout(z3, i19, u8Var4.getMeasuredWidth() + z3, v8Var.c.getMeasuredHeight() + i19);
                        int z4 = (int) bp1.z(f10, v8Var.d.getMeasuredWidth(), 2.0f, f9);
                        int B2 = ik8.B(16.0f, v8Var.d.getMeasuredHeight(), i19);
                        TextView textView10 = v8Var.d;
                        textView10.layout(z4, B2, textView10.getMeasuredWidth() + z4, v8Var.d.getMeasuredHeight() + B2);
                        break;
                    }
                } else if (b2 == 5) {
                    if (i3 <= i4) {
                        int i20 = hl.q.y;
                        e29 e29Var6 = v8Var.a;
                        if (i20 < 1800) {
                            f = i6;
                            int i21 = (int) (0.06f * f);
                            e29Var6.layout(0, i21, e29Var6.getMeasuredWidth(), v8Var.a.getMeasuredHeight() + i21);
                            int i22 = (int) (0.463f * f);
                            TextView textView11 = v8Var.e;
                            textView11.layout(0, i22, textView11.getMeasuredWidth(), v8Var.e.getMeasuredHeight() + i22);
                            f2 = 0.543f;
                        } else {
                            f = i6;
                            int i23 = (int) (0.148f * f);
                            e29Var6.layout(0, i23, e29Var6.getMeasuredWidth(), v8Var.a.getMeasuredHeight() + i23);
                            int i24 = (int) (0.551f * f);
                            TextView textView12 = v8Var.e;
                            textView12.layout(0, i24, textView12.getMeasuredWidth(), v8Var.e.getMeasuredHeight() + i24);
                            f2 = 0.631f;
                        }
                        int i25 = (int) (f * f2);
                        int measuredWidth5 = (getMeasuredWidth() - v8Var.h.getMeasuredWidth()) / 2;
                        LinearLayout linearLayout = v8Var.h;
                        linearLayout.layout(measuredWidth5, i25, linearLayout.getMeasuredWidth() + measuredWidth5, v8Var.h.getMeasuredHeight() + i25);
                        int measuredWidth6 = (i5 - v8Var.c.getMeasuredWidth()) / 2;
                        int i26 = (int) (i6 * 0.853f);
                        u8 u8Var5 = v8Var.c;
                        u8Var5.layout(measuredWidth6, i26, u8Var5.getMeasuredWidth() + measuredWidth6, v8Var.c.getMeasuredHeight() + i26);
                        break;
                    } else {
                        int measuredHeight4 = (i6 - v8Var.a.getMeasuredHeight()) / 2;
                        e29 e29Var7 = v8Var.a;
                        e29Var7.layout(0, measuredHeight4, e29Var7.getMeasuredWidth(), v8Var.a.getMeasuredHeight() + measuredHeight4);
                        float f11 = i5;
                        float f12 = 0.4f * f11;
                        int i27 = (int) f12;
                        float f13 = i6;
                        int i28 = (int) (0.08f * f13);
                        TextView textView13 = v8Var.e;
                        textView13.layout(i27, i28, textView13.getMeasuredWidth() + i27, v8Var.e.getMeasuredHeight() + i28);
                        float f14 = f11 * 0.6f;
                        int z5 = (int) bp1.z(f14, v8Var.h.getMeasuredWidth(), 2.0f, f12);
                        int i29 = (int) (0.25f * f13);
                        LinearLayout linearLayout2 = v8Var.h;
                        linearLayout2.layout(z5, i29, linearLayout2.getMeasuredWidth() + z5, v8Var.h.getMeasuredHeight() + i29);
                        int z6 = (int) bp1.z(f14, v8Var.c.getMeasuredWidth(), 2.0f, f12);
                        int i30 = (int) (f13 * 0.78f);
                        u8 u8Var6 = v8Var.c;
                        u8Var6.layout(z6, i30, u8Var6.getMeasuredWidth() + z6, v8Var.c.getMeasuredHeight() + i30);
                        break;
                    }
                } else if (b2 == 6) {
                    e29 e29Var8 = v8Var.a;
                    if (i3 <= i4) {
                        int i31 = (int) (i6 * 0.3f);
                        int measuredWidth7 = (i5 - e29Var8.getMeasuredWidth()) / 2;
                        e29 e29Var9 = v8Var.a;
                        e29Var9.layout(measuredWidth7, i31, e29Var9.getMeasuredWidth() + measuredWidth7, v8Var.a.getMeasuredHeight() + i31);
                        int w2 = uh9.w(24.0f, v8Var.a.getMeasuredHeight(), i31);
                        TextView textView14 = v8Var.e;
                        textView14.layout(0, w2, textView14.getMeasuredWidth(), v8Var.e.getMeasuredHeight() + w2);
                        int textSize2 = (int) (v8Var.e.getTextSize() + hl.L(16.0f) + w2);
                        TextView textView15 = v8Var.f;
                        textView15.layout(0, textSize2, textView15.getMeasuredWidth(), v8Var.f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i5 - v8Var.c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i6 - v8Var.c.getMeasuredHeight()) - hl.L(48.0f);
                        u8 u8Var7 = v8Var.c;
                        u8Var7.layout(measuredWidth8, measuredHeight5, u8Var7.getMeasuredWidth() + measuredWidth8, v8Var.c.getMeasuredHeight() + measuredHeight5);
                        break;
                    } else {
                        int measuredHeight6 = (i6 - e29Var8.getMeasuredHeight()) / 2;
                        float f15 = i5;
                        int measuredWidth9 = ((int) ((0.5f * f15) - v8Var.a.getMeasuredWidth())) / 2;
                        e29 e29Var10 = v8Var.a;
                        e29Var10.layout(measuredWidth9, measuredHeight6, e29Var10.getMeasuredWidth() + measuredWidth9, v8Var.a.getMeasuredHeight() + measuredHeight6);
                        float f16 = 0.4f * f15;
                        int i32 = (int) f16;
                        float f17 = i6;
                        int i33 = (int) (0.14f * f17);
                        TextView textView16 = v8Var.e;
                        textView16.layout(i32, i33, textView16.getMeasuredWidth() + i32, v8Var.e.getMeasuredHeight() + i33);
                        int i34 = (int) (0.31f * f17);
                        TextView textView17 = v8Var.f;
                        textView17.layout(i32, i34, textView17.getMeasuredWidth() + i32, v8Var.f.getMeasuredHeight() + i34);
                        int z7 = (int) bp1.z(f15 * 0.6f, v8Var.c.getMeasuredWidth(), 2.0f, f16);
                        int i35 = (int) (f17 * 0.78f);
                        u8 u8Var8 = v8Var.c;
                        u8Var8.layout(z7, i35, u8Var8.getMeasuredWidth() + z7, v8Var.c.getMeasuredHeight() + i35);
                        break;
                    }
                }
                break;
            case 1:
                o7c o7cVar = (o7c) eVar;
                aVar4 = ((e) o7cVar).actionBar;
                aVar5 = ((e) o7cVar).actionBar;
                aVar4.layout(0, 0, i3, aVar5.getMeasuredHeight());
                int i36 = i3 - i;
                int i37 = i4 - i2;
                e29 e29Var11 = o7cVar.a;
                if (i3 <= i4) {
                    int i38 = (int) (i37 * 0.3f);
                    int measuredWidth10 = (i36 - e29Var11.getMeasuredWidth()) / 2;
                    e29 e29Var12 = o7cVar.a;
                    e29Var12.layout(measuredWidth10, i38, e29Var12.getMeasuredWidth() + measuredWidth10, o7cVar.a.getMeasuredHeight() + i38);
                    int w3 = uh9.w(16.0f, o7cVar.a.getMeasuredHeight(), i38);
                    TextView textView18 = o7cVar.c;
                    textView18.layout(0, w3, textView18.getMeasuredWidth(), o7cVar.c.getMeasuredHeight() + w3);
                    int w4 = uh9.w(12.0f, o7cVar.c.getMeasuredHeight(), w3);
                    tpa tpaVar = o7cVar.d;
                    tpaVar.layout(0, w4, tpaVar.getMeasuredWidth(), o7cVar.d.getMeasuredHeight() + w4);
                    int measuredWidth11 = (i36 - o7cVar.b.getMeasuredWidth()) / 2;
                    int measuredHeight7 = (i37 - o7cVar.b.getMeasuredHeight()) - hl.L(48.0f);
                    TextView textView19 = o7cVar.b;
                    textView19.layout(measuredWidth11, measuredHeight7, textView19.getMeasuredWidth() + measuredWidth11, o7cVar.b.getMeasuredHeight() + measuredHeight7);
                    break;
                } else {
                    int measuredHeight8 = (i37 - e29Var11.getMeasuredHeight()) / 2;
                    e29 e29Var13 = o7cVar.a;
                    e29Var13.layout(0, measuredHeight8, e29Var13.getMeasuredWidth(), o7cVar.a.getMeasuredHeight() + measuredHeight8);
                    float f18 = i36;
                    float f19 = 0.4f * f18;
                    int i39 = (int) f19;
                    float f20 = i37;
                    int i40 = (int) (0.22f * f20);
                    TextView textView20 = o7cVar.c;
                    textView20.layout(i39, i40, textView20.getMeasuredWidth() + i39, o7cVar.c.getMeasuredHeight() + i40);
                    int i41 = (int) (0.39f * f20);
                    tpa tpaVar2 = o7cVar.d;
                    tpaVar2.layout(i39, i41, tpaVar2.getMeasuredWidth() + i39, o7cVar.d.getMeasuredHeight() + i41);
                    int z8 = (int) bp1.z(f18 * 0.6f, o7cVar.b.getMeasuredWidth(), 2.0f, f19);
                    int i42 = (int) (f20 * 0.64f);
                    TextView textView21 = o7cVar.b;
                    textView21.layout(z8, i42, textView21.getMeasuredWidth() + z8, o7cVar.b.getMeasuredHeight() + i42);
                    break;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) eVar;
                yc ycVar = usersSelectActivity.a;
                ycVar.layout(0, 0, ycVar.getMeasuredWidth(), usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.f.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.f.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.e.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.e.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                zp4 zp4Var = usersSelectActivity.r;
                if (zp4Var != null) {
                    boolean z9 = ob6.a0;
                    FrameLayout.LayoutParams layoutParams = usersSelectActivity.s;
                    int measuredWidth12 = z9 ? layoutParams.leftMargin : ((i3 - i) - layoutParams.rightMargin) - zp4Var.getMeasuredWidth();
                    int measuredHeight9 = ((i4 - i2) - usersSelectActivity.s.bottomMargin) - usersSelectActivity.r.getMeasuredHeight();
                    zp4 zp4Var2 = usersSelectActivity.r;
                    zp4Var2.layout(measuredWidth12, measuredHeight9, zp4Var2.getMeasuredWidth() + measuredWidth12, usersSelectActivity.r.getMeasuredHeight() + measuredHeight9);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        byte b = this.a;
        e eVar = this.b;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                v8 v8Var = (v8) eVar;
                byte b2 = v8Var.w;
                aVar = ((e) v8Var).actionBar;
                if (aVar != null) {
                    aVar2 = ((e) v8Var).actionBar;
                    aVar2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
                }
                if (b2 == 0) {
                    e29 e29Var = v8Var.a;
                    if (size > size2) {
                        float f = size;
                        e29Var.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                        int i3 = (int) (f * 0.6f);
                        v8Var.e.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.f.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.c.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
                    } else {
                        e29Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), TLObject.FLAG_30));
                        v8Var.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.c.measure(ik8.f(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
                    }
                } else if (b2 == 3) {
                    v8Var.a.measure(View.MeasureSpec.makeMeasureSpec(hl.L(150.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(150.0f), TLObject.FLAG_30));
                    if (size > size2) {
                        float f2 = size;
                        v8Var.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f2), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        int i4 = (int) (f2 * 0.6f);
                        v8Var.e.measure(View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.f.measure(View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.c.measure(View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
                    } else {
                        v8Var.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.c.measure(ik8.f(48.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
                    }
                } else if (b2 == 5) {
                    e29 e29Var2 = v8Var.a;
                    if (size > size2) {
                        float f3 = size;
                        e29Var2.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                        int i5 = (int) (f3 * 0.6f);
                        v8Var.e.measure(View.MeasureSpec.makeMeasureSpec(i5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.h.measure(View.MeasureSpec.makeMeasureSpec(i5, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.c.measure(View.MeasureSpec.makeMeasureSpec(i5, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
                    } else {
                        e29Var2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), TLObject.FLAG_30));
                        v8Var.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.h.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
                    }
                } else if (b2 == 6) {
                    e29 e29Var3 = v8Var.a;
                    if (b2 == 6) {
                        e29Var3.measure(View.MeasureSpec.makeMeasureSpec(hl.L(140.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(140.0f), TLObject.FLAG_30));
                    } else {
                        e29Var3.measure(View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), TLObject.FLAG_30));
                    }
                    TextView textView = v8Var.e;
                    if (size > size2) {
                        int i6 = (int) (size * 0.6f);
                        textView.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.f.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.c.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
                    } else {
                        textView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        v8Var.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8 u8Var = v8Var.c;
                        if (b2 == 6) {
                            u8Var.measure(ik8.f(48.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
                        } else {
                            u8Var.measure(ik8.f(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
                        }
                    }
                }
                setMeasuredDimension(size, size2);
                break;
            case 1:
                int size3 = View.MeasureSpec.getSize(i);
                int size4 = View.MeasureSpec.getSize(i2);
                o7c o7cVar = (o7c) eVar;
                aVar3 = ((e) o7cVar).actionBar;
                aVar3.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i2);
                if (size3 > size4) {
                    float f4 = size3;
                    o7cVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f4), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), TLObject.FLAG_30));
                    int i7 = (int) (f4 * 0.6f);
                    o7cVar.c.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    o7cVar.d.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    o7cVar.e.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    o7cVar.b.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(42.0f), TLObject.FLAG_30));
                } else {
                    float f5 = o7cVar.P == 7 ? jn7.p2 : jn7.V1;
                    o7cVar.a.measure(View.MeasureSpec.makeMeasureSpec(hl.L(f5), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(f5), TLObject.FLAG_30));
                    o7cVar.c.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    o7cVar.d.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    o7cVar.e.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    o7cVar.b.measure(ik8.f(48.0f, size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30));
                }
                setMeasuredDimension(size3, size4);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) eVar;
                int size5 = View.MeasureSpec.getSize(i);
                int size6 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size5, size6);
                usersSelectActivity.a.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((hl.O1() || size6 > size5) ? hl.L(144.0f) : hl.L(56.0f), TLObject.FLAG_31));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                usersSelectActivity.f.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                usersSelectActivity.e.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                zp4 zp4Var = usersSelectActivity.r;
                if (zp4Var != null) {
                    int i8 = usersSelectActivity.s.width;
                    zp4Var.measure(View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_30));
                    break;
                }
                break;
        }
    }
}
