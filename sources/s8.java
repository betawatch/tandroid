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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class s8 extends ViewGroup {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s8(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 1:
                canvas.save();
                sj4 sj4Var = (sj4) this.b;
                canvas.scale(sj4Var.x / sj4Var.i.getWidth(), sj4Var.y / sj4Var.i.getHeight());
                super.draw(canvas);
                canvas.restore();
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ui5 ui5Var;
        switch (this.a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f) {
                    ui5Var = ((d) usersSelectActivity).parentLayout;
                    ((ActionBarLayout) ui5Var).o(canvas, usersSelectActivity.a.getMeasuredHeight());
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
        Object obj = this.b;
        switch (b) {
            case 0:
                u8 u8Var = (u8) obj;
                aVar = ((d) u8Var).actionBar;
                if (aVar != null) {
                    aVar2 = ((d) u8Var).actionBar;
                    aVar3 = ((d) u8Var).actionBar;
                    aVar2.layout(0, 0, i3, aVar3.getMeasuredHeight());
                }
                int i5 = i3 - i;
                int i6 = i4 - i2;
                byte b2 = u8Var.w;
                if (b2 == 0) {
                    ry8 ry8Var = u8Var.a;
                    if (i3 <= i4) {
                        float f3 = i6;
                        int i7 = (int) (0.188f * f3);
                        ry8Var.layout(0, i7, ry8Var.getMeasuredWidth(), u8Var.a.getMeasuredHeight() + i7);
                        int i8 = (int) (0.651f * f3);
                        TextView textView = u8Var.e;
                        textView.layout(0, i8, textView.getMeasuredWidth(), u8Var.e.getMeasuredHeight() + i8);
                        int i9 = (int) (0.731f * f3);
                        TextView textView2 = u8Var.f;
                        textView2.layout(0, i9, textView2.getMeasuredWidth(), u8Var.f.getMeasuredHeight() + i9);
                        int measuredWidth = (i5 - u8Var.c.getMeasuredWidth()) / 2;
                        int i10 = (int) (f3 * 0.853f);
                        t8 t8Var = u8Var.c;
                        t8Var.layout(measuredWidth, i10, t8Var.getMeasuredWidth() + measuredWidth, u8Var.c.getMeasuredHeight() + i10);
                        break;
                    } else {
                        int measuredHeight = (i6 - ry8Var.getMeasuredHeight()) / 2;
                        ry8 ry8Var2 = u8Var.a;
                        ry8Var2.layout(0, measuredHeight, ry8Var2.getMeasuredWidth(), u8Var.a.getMeasuredHeight() + measuredHeight);
                        float f4 = i5;
                        float f5 = 0.4f * f4;
                        int i11 = (int) f5;
                        float f6 = i6;
                        int i12 = (int) (0.22f * f6);
                        TextView textView3 = u8Var.e;
                        textView3.layout(i11, i12, textView3.getMeasuredWidth() + i11, u8Var.e.getMeasuredHeight() + i12);
                        int i13 = (int) (0.39f * f6);
                        TextView textView4 = u8Var.f;
                        textView4.layout(i11, i13, textView4.getMeasuredWidth() + i11, u8Var.f.getMeasuredHeight() + i13);
                        int z2 = (int) oo1.z(f4 * 0.6f, u8Var.c.getMeasuredWidth(), 2.0f, f5);
                        int i14 = (int) (f6 * 0.69f);
                        t8 t8Var2 = u8Var.c;
                        t8Var2.layout(z2, i14, t8Var2.getMeasuredWidth() + z2, u8Var.c.getMeasuredHeight() + i14);
                        break;
                    }
                } else if (b2 == 3) {
                    ry8 ry8Var3 = u8Var.a;
                    if (i3 <= i4) {
                        int i15 = (int) (i6 * 0.3f);
                        int measuredWidth2 = (i5 - ry8Var3.getMeasuredWidth()) / 2;
                        ry8 ry8Var4 = u8Var.a;
                        ry8Var4.layout(measuredWidth2, i15, ry8Var4.getMeasuredWidth() + measuredWidth2, u8Var.a.getMeasuredHeight() + i15);
                        int w = de9.w(24.0f, u8Var.a.getMeasuredHeight(), i15);
                        TextView textView5 = u8Var.e;
                        textView5.layout(0, w, textView5.getMeasuredWidth(), u8Var.e.getMeasuredHeight() + w);
                        int textSize = (int) (u8Var.e.getTextSize() + gl.L(16.0f) + w);
                        TextView textView6 = u8Var.f;
                        textView6.layout(0, textSize, textView6.getMeasuredWidth(), u8Var.f.getMeasuredHeight() + textSize);
                        int measuredWidth3 = (i5 - u8Var.c.getMeasuredWidth()) / 2;
                        int measuredHeight2 = (i6 - u8Var.c.getMeasuredHeight()) - gl.L(48.0f);
                        t8 t8Var3 = u8Var.c;
                        t8Var3.layout(measuredWidth3, measuredHeight2, t8Var3.getMeasuredWidth() + measuredWidth3, u8Var.c.getMeasuredHeight() + measuredHeight2);
                        int measuredWidth4 = (i5 - u8Var.d.getMeasuredWidth()) / 2;
                        int B = ug8.B(32.0f, u8Var.d.getMeasuredHeight(), measuredHeight2);
                        TextView textView7 = u8Var.d;
                        textView7.layout(measuredWidth4, B, textView7.getMeasuredWidth() + measuredWidth4, u8Var.d.getMeasuredHeight() + B);
                        break;
                    } else {
                        float f7 = i6;
                        int measuredHeight3 = ((int) ((0.95f * f7) - ry8Var3.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - u8Var.a.getMeasuredWidth());
                        ry8 ry8Var5 = u8Var.a;
                        ry8Var5.layout(width, measuredHeight3, ry8Var5.getMeasuredWidth() + width, u8Var.a.getMeasuredHeight() + measuredHeight3);
                        float f8 = i5;
                        float f9 = 0.4f * f8;
                        int i16 = (int) f9;
                        int i17 = (int) (0.12f * f7);
                        TextView textView8 = u8Var.e;
                        textView8.layout(i16, i17, textView8.getMeasuredWidth() + i16, u8Var.e.getMeasuredHeight() + i17);
                        int i18 = (int) (0.24f * f7);
                        TextView textView9 = u8Var.f;
                        textView9.layout(i16, i18, textView9.getMeasuredWidth() + i16, u8Var.f.getMeasuredHeight() + i18);
                        float f10 = f8 * 0.6f;
                        int z3 = (int) oo1.z(f10, u8Var.c.getMeasuredWidth(), 2.0f, f9);
                        int i19 = (int) (f7 * 0.8f);
                        t8 t8Var4 = u8Var.c;
                        t8Var4.layout(z3, i19, t8Var4.getMeasuredWidth() + z3, u8Var.c.getMeasuredHeight() + i19);
                        int z4 = (int) oo1.z(f10, u8Var.d.getMeasuredWidth(), 2.0f, f9);
                        int B2 = ug8.B(16.0f, u8Var.d.getMeasuredHeight(), i19);
                        TextView textView10 = u8Var.d;
                        textView10.layout(z4, B2, textView10.getMeasuredWidth() + z4, u8Var.d.getMeasuredHeight() + B2);
                        break;
                    }
                } else if (b2 == 5) {
                    if (i3 <= i4) {
                        int i20 = gl.q.y;
                        ry8 ry8Var6 = u8Var.a;
                        if (i20 < 1800) {
                            f = i6;
                            int i21 = (int) (0.06f * f);
                            ry8Var6.layout(0, i21, ry8Var6.getMeasuredWidth(), u8Var.a.getMeasuredHeight() + i21);
                            int i22 = (int) (0.463f * f);
                            TextView textView11 = u8Var.e;
                            textView11.layout(0, i22, textView11.getMeasuredWidth(), u8Var.e.getMeasuredHeight() + i22);
                            f2 = 0.543f;
                        } else {
                            f = i6;
                            int i23 = (int) (0.148f * f);
                            ry8Var6.layout(0, i23, ry8Var6.getMeasuredWidth(), u8Var.a.getMeasuredHeight() + i23);
                            int i24 = (int) (0.551f * f);
                            TextView textView12 = u8Var.e;
                            textView12.layout(0, i24, textView12.getMeasuredWidth(), u8Var.e.getMeasuredHeight() + i24);
                            f2 = 0.631f;
                        }
                        int i25 = (int) (f * f2);
                        int measuredWidth5 = (getMeasuredWidth() - u8Var.h.getMeasuredWidth()) / 2;
                        LinearLayout linearLayout = u8Var.h;
                        linearLayout.layout(measuredWidth5, i25, linearLayout.getMeasuredWidth() + measuredWidth5, u8Var.h.getMeasuredHeight() + i25);
                        int measuredWidth6 = (i5 - u8Var.c.getMeasuredWidth()) / 2;
                        int i26 = (int) (i6 * 0.853f);
                        t8 t8Var5 = u8Var.c;
                        t8Var5.layout(measuredWidth6, i26, t8Var5.getMeasuredWidth() + measuredWidth6, u8Var.c.getMeasuredHeight() + i26);
                        break;
                    } else {
                        int measuredHeight4 = (i6 - u8Var.a.getMeasuredHeight()) / 2;
                        ry8 ry8Var7 = u8Var.a;
                        ry8Var7.layout(0, measuredHeight4, ry8Var7.getMeasuredWidth(), u8Var.a.getMeasuredHeight() + measuredHeight4);
                        float f11 = i5;
                        float f12 = 0.4f * f11;
                        int i27 = (int) f12;
                        float f13 = i6;
                        int i28 = (int) (0.08f * f13);
                        TextView textView13 = u8Var.e;
                        textView13.layout(i27, i28, textView13.getMeasuredWidth() + i27, u8Var.e.getMeasuredHeight() + i28);
                        float f14 = f11 * 0.6f;
                        int z5 = (int) oo1.z(f14, u8Var.h.getMeasuredWidth(), 2.0f, f12);
                        int i29 = (int) (0.25f * f13);
                        LinearLayout linearLayout2 = u8Var.h;
                        linearLayout2.layout(z5, i29, linearLayout2.getMeasuredWidth() + z5, u8Var.h.getMeasuredHeight() + i29);
                        int z6 = (int) oo1.z(f14, u8Var.c.getMeasuredWidth(), 2.0f, f12);
                        int i30 = (int) (f13 * 0.78f);
                        t8 t8Var6 = u8Var.c;
                        t8Var6.layout(z6, i30, t8Var6.getMeasuredWidth() + z6, u8Var.c.getMeasuredHeight() + i30);
                        break;
                    }
                } else if (b2 == 6) {
                    ry8 ry8Var8 = u8Var.a;
                    if (i3 <= i4) {
                        int i31 = (int) (i6 * 0.3f);
                        int measuredWidth7 = (i5 - ry8Var8.getMeasuredWidth()) / 2;
                        ry8 ry8Var9 = u8Var.a;
                        ry8Var9.layout(measuredWidth7, i31, ry8Var9.getMeasuredWidth() + measuredWidth7, u8Var.a.getMeasuredHeight() + i31);
                        int w2 = de9.w(24.0f, u8Var.a.getMeasuredHeight(), i31);
                        TextView textView14 = u8Var.e;
                        textView14.layout(0, w2, textView14.getMeasuredWidth(), u8Var.e.getMeasuredHeight() + w2);
                        int textSize2 = (int) (u8Var.e.getTextSize() + gl.L(16.0f) + w2);
                        TextView textView15 = u8Var.f;
                        textView15.layout(0, textSize2, textView15.getMeasuredWidth(), u8Var.f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i5 - u8Var.c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i6 - u8Var.c.getMeasuredHeight()) - gl.L(48.0f);
                        t8 t8Var7 = u8Var.c;
                        t8Var7.layout(measuredWidth8, measuredHeight5, t8Var7.getMeasuredWidth() + measuredWidth8, u8Var.c.getMeasuredHeight() + measuredHeight5);
                        break;
                    } else {
                        int measuredHeight6 = (i6 - ry8Var8.getMeasuredHeight()) / 2;
                        float f15 = i5;
                        int measuredWidth9 = ((int) ((0.5f * f15) - u8Var.a.getMeasuredWidth())) / 2;
                        ry8 ry8Var10 = u8Var.a;
                        ry8Var10.layout(measuredWidth9, measuredHeight6, ry8Var10.getMeasuredWidth() + measuredWidth9, u8Var.a.getMeasuredHeight() + measuredHeight6);
                        float f16 = 0.4f * f15;
                        int i32 = (int) f16;
                        float f17 = i6;
                        int i33 = (int) (0.14f * f17);
                        TextView textView16 = u8Var.e;
                        textView16.layout(i32, i33, textView16.getMeasuredWidth() + i32, u8Var.e.getMeasuredHeight() + i33);
                        int i34 = (int) (0.31f * f17);
                        TextView textView17 = u8Var.f;
                        textView17.layout(i32, i34, textView17.getMeasuredWidth() + i32, u8Var.f.getMeasuredHeight() + i34);
                        int z7 = (int) oo1.z(f15 * 0.6f, u8Var.c.getMeasuredWidth(), 2.0f, f16);
                        int i35 = (int) (f17 * 0.78f);
                        t8 t8Var8 = u8Var.c;
                        t8Var8.layout(z7, i35, t8Var8.getMeasuredWidth() + z7, u8Var.c.getMeasuredHeight() + i35);
                        break;
                    }
                }
                break;
            case 1:
                sj4 sj4Var = (sj4) obj;
                sj4Var.i.layout(0, 0, sj4Var.x, sj4Var.y);
                break;
            case 2:
                p3c p3cVar = (p3c) obj;
                aVar4 = ((d) p3cVar).actionBar;
                aVar5 = ((d) p3cVar).actionBar;
                aVar4.layout(0, 0, i3, aVar5.getMeasuredHeight());
                int i36 = i3 - i;
                int i37 = i4 - i2;
                ry8 ry8Var11 = p3cVar.a;
                if (i3 <= i4) {
                    int i38 = (int) (i37 * 0.3f);
                    int measuredWidth10 = (i36 - ry8Var11.getMeasuredWidth()) / 2;
                    ry8 ry8Var12 = p3cVar.a;
                    ry8Var12.layout(measuredWidth10, i38, ry8Var12.getMeasuredWidth() + measuredWidth10, p3cVar.a.getMeasuredHeight() + i38);
                    int w3 = de9.w(16.0f, p3cVar.a.getMeasuredHeight(), i38);
                    TextView textView18 = p3cVar.c;
                    textView18.layout(0, w3, textView18.getMeasuredWidth(), p3cVar.c.getMeasuredHeight() + w3);
                    int w4 = de9.w(12.0f, p3cVar.c.getMeasuredHeight(), w3);
                    wla wlaVar = p3cVar.d;
                    wlaVar.layout(0, w4, wlaVar.getMeasuredWidth(), p3cVar.d.getMeasuredHeight() + w4);
                    int measuredWidth11 = (i36 - p3cVar.b.getMeasuredWidth()) / 2;
                    int measuredHeight7 = (i37 - p3cVar.b.getMeasuredHeight()) - gl.L(48.0f);
                    TextView textView19 = p3cVar.b;
                    textView19.layout(measuredWidth11, measuredHeight7, textView19.getMeasuredWidth() + measuredWidth11, p3cVar.b.getMeasuredHeight() + measuredHeight7);
                    break;
                } else {
                    int measuredHeight8 = (i37 - ry8Var11.getMeasuredHeight()) / 2;
                    ry8 ry8Var13 = p3cVar.a;
                    ry8Var13.layout(0, measuredHeight8, ry8Var13.getMeasuredWidth(), p3cVar.a.getMeasuredHeight() + measuredHeight8);
                    float f18 = i36;
                    float f19 = 0.4f * f18;
                    int i39 = (int) f19;
                    float f20 = i37;
                    int i40 = (int) (0.22f * f20);
                    TextView textView20 = p3cVar.c;
                    textView20.layout(i39, i40, textView20.getMeasuredWidth() + i39, p3cVar.c.getMeasuredHeight() + i40);
                    int i41 = (int) (0.39f * f20);
                    wla wlaVar2 = p3cVar.d;
                    wlaVar2.layout(i39, i41, wlaVar2.getMeasuredWidth() + i39, p3cVar.d.getMeasuredHeight() + i41);
                    int z8 = (int) oo1.z(f18 * 0.6f, p3cVar.b.getMeasuredWidth(), 2.0f, f19);
                    int i42 = (int) (f20 * 0.64f);
                    TextView textView21 = p3cVar.b;
                    textView21.layout(z8, i42, textView21.getMeasuredWidth() + z8, p3cVar.b.getMeasuredHeight() + i42);
                    break;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                xc xcVar = usersSelectActivity.a;
                xcVar.layout(0, 0, xcVar.getMeasuredWidth(), usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.f.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.f.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.e.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.e.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                un4 un4Var = usersSelectActivity.r;
                if (un4Var != null) {
                    boolean z9 = k96.a0;
                    FrameLayout.LayoutParams layoutParams = usersSelectActivity.s;
                    int measuredWidth12 = z9 ? layoutParams.leftMargin : ((i3 - i) - layoutParams.rightMargin) - un4Var.getMeasuredWidth();
                    int measuredHeight9 = ((i4 - i2) - usersSelectActivity.s.bottomMargin) - usersSelectActivity.r.getMeasuredHeight();
                    un4 un4Var2 = usersSelectActivity.r;
                    un4Var2.layout(measuredWidth12, measuredHeight9, un4Var2.getMeasuredWidth() + measuredWidth12, usersSelectActivity.r.getMeasuredHeight() + measuredHeight9);
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
        Object obj = this.b;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                u8 u8Var = (u8) obj;
                byte b2 = u8Var.w;
                aVar = ((d) u8Var).actionBar;
                if (aVar != null) {
                    aVar2 = ((d) u8Var).actionBar;
                    aVar2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
                }
                if (b2 == 0) {
                    ry8 ry8Var = u8Var.a;
                    if (size > size2) {
                        float f = size;
                        ry8Var.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                        int i3 = (int) (f * 0.6f);
                        u8Var.e.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.f.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.c.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
                    } else {
                        ry8Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), TLObject.FLAG_30));
                        u8Var.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.c.measure(ug8.f(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
                    }
                } else if (b2 == 3) {
                    u8Var.a.measure(View.MeasureSpec.makeMeasureSpec(gl.L(150.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(150.0f), TLObject.FLAG_30));
                    if (size > size2) {
                        float f2 = size;
                        u8Var.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f2), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        int i4 = (int) (f2 * 0.6f);
                        u8Var.e.measure(View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.f.measure(View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.c.measure(View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
                    } else {
                        u8Var.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.c.measure(ug8.f(48.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
                    }
                } else if (b2 == 5) {
                    ry8 ry8Var2 = u8Var.a;
                    if (size > size2) {
                        float f3 = size;
                        ry8Var2.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                        int i5 = (int) (f3 * 0.6f);
                        u8Var.e.measure(View.MeasureSpec.makeMeasureSpec(i5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.h.measure(View.MeasureSpec.makeMeasureSpec(i5, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.c.measure(View.MeasureSpec.makeMeasureSpec(i5, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
                    } else {
                        ry8Var2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), TLObject.FLAG_30));
                        u8Var.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.h.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
                    }
                } else if (b2 == 6) {
                    ry8 ry8Var3 = u8Var.a;
                    if (b2 == 6) {
                        ry8Var3.measure(View.MeasureSpec.makeMeasureSpec(gl.L(140.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(140.0f), TLObject.FLAG_30));
                    } else {
                        ry8Var3.measure(View.MeasureSpec.makeMeasureSpec(gl.L(100.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(100.0f), TLObject.FLAG_30));
                    }
                    TextView textView = u8Var.e;
                    if (size > size2) {
                        int i6 = (int) (size * 0.6f);
                        textView.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.f.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.c.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
                    } else {
                        textView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        u8Var.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        t8 t8Var = u8Var.c;
                        if (b2 == 6) {
                            t8Var.measure(ug8.f(48.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
                        } else {
                            t8Var.measure(ug8.f(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
                        }
                    }
                }
                setMeasuredDimension(size, size2);
                break;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                sj4 sj4Var = (sj4) obj;
                sj4Var.i.measure(View.MeasureSpec.makeMeasureSpec(sj4Var.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(sj4Var.y, TLObject.FLAG_30));
                break;
            case 2:
                int size3 = View.MeasureSpec.getSize(i);
                int size4 = View.MeasureSpec.getSize(i2);
                p3c p3cVar = (p3c) obj;
                aVar3 = ((d) p3cVar).actionBar;
                aVar3.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i2);
                if (size3 > size4) {
                    float f4 = size3;
                    p3cVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f4), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), TLObject.FLAG_30));
                    int i7 = (int) (f4 * 0.6f);
                    p3cVar.c.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    p3cVar.d.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    p3cVar.e.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    p3cVar.b.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(42.0f), TLObject.FLAG_30));
                } else {
                    float f5 = p3cVar.P == 7 ? kk7.p2 : kk7.V1;
                    p3cVar.a.measure(View.MeasureSpec.makeMeasureSpec(gl.L(f5), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(f5), TLObject.FLAG_30));
                    p3cVar.c.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    p3cVar.d.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    p3cVar.e.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    p3cVar.b.measure(ug8.f(48.0f, size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), TLObject.FLAG_30));
                }
                setMeasuredDimension(size3, size4);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                int size5 = View.MeasureSpec.getSize(i);
                int size6 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size5, size6);
                usersSelectActivity.a.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((gl.O1() || size6 > size5) ? gl.L(144.0f) : gl.L(56.0f), TLObject.FLAG_31));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                usersSelectActivity.f.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                usersSelectActivity.e.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                un4 un4Var = usersSelectActivity.r;
                if (un4Var != null) {
                    int i8 = usersSelectActivity.s.width;
                    un4Var.measure(View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_30));
                    break;
                }
                break;
        }
    }
}
