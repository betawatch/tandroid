// default package

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ozb extends FrameLayout {
    public final ImageView a;
    public final xw0 b;
    public final pkb c;
    public final TextView d;
    public final mzb e;
    public final View f;
    public final View h;
    public final /* synthetic */ rzb n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozb(rzb rzbVar, Context context) {
        super(context);
        this.n = rzbVar;
        View view = new View(context);
        this.f = view;
        int i = bkb.g5;
        wjb wjbVar = rzbVar.J0;
        String str = rzbVar.t1;
        zkb.h(i, wjbVar, view);
        addView(view, nme.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i2 = bkb.i5;
        wjb wjbVar2 = rzbVar.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView, i2, wjbVar2, mode);
        int i3 = bkb.h6;
        final byte b = 1;
        ff0 f0 = bkb.f0(bkb.v0(i3, rzbVar.J0), 1, -1);
        vkb M = zkb.M(i3);
        wjb wjbVar3 = rzbVar.J0;
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, wjbVar3);
        imageView.setAlpha(0.0f);
        final byte b2 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: lzb
            public final /* synthetic */ ozb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                byte b3 = b2;
                ozb ozbVar = this.b;
                switch (b3) {
                    case 0:
                        ozbVar.n.dismiss();
                        break;
                    default:
                        mzb mzbVar = ozbVar.e;
                        nzb nzbVar = new nzb(ozbVar.getContext(), null);
                        Drawable mutate = ozbVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i4 = bkb.F8;
                        rzb rzbVar2 = ozbVar.n;
                        zkb.x(ozbVar, mutate, i4, rzbVar2.J0, PorterDuff.Mode.MULTIPLY);
                        nzbVar.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = b1c.N;
                        ArrayList arrayList = new ArrayList(k96.D0().N.values());
                        int i5 = 0;
                        while (i5 < arrayList.size()) {
                            i96 i96Var = (i96) arrayList.get(i5);
                            if (i96Var == null || (((str2 = i96Var.c) != null && str2.endsWith("_raw")) || !"remote".equals(i96Var.d))) {
                                arrayList.remove(i5);
                                i5--;
                            }
                            i5++;
                        }
                        Collections.sort(arrayList, new fx5(k96.D0().B, (byte) 1));
                        boolean z = true;
                        int i6 = 0;
                        while (i6 < arrayList.size()) {
                            i96 i96Var2 = (i96) arrayList.get(i6);
                            if (!i96Var2.f.equals(rzbVar2.t1) && "remote".equals(i96Var2.d)) {
                                TextUtils.equals(rzbVar2.u1, i96Var2.f);
                                a8 a8Var = new a8(2, rzbVar2.J0, ozbVar.getContext(), z, i6 == arrayList.size() - 1);
                                a8Var.setText(rzb.E0(rzb.J0(i96Var2.f, null, null)));
                                a8Var.setChecked(TextUtils.equals(rzbVar2.u1, i96Var2.f));
                                a8Var.setOnClickListener(new hu4(ozbVar, runnableArr, i96Var2, (byte) 24));
                                nzbVar.addView(a8Var);
                                z = false;
                            }
                            i6++;
                        }
                        m8 m8Var = new m8(nzbVar, -2, -2);
                        runnableArr[0] = new wn1(m8Var, (byte) 1);
                        m8Var.e = true;
                        m8Var.c = (short) 220;
                        m8Var.setOutsideTouchable(true);
                        m8Var.setClippingEnabled(true);
                        m8Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m8Var.setFocusable(true);
                        int[] iArr = new int[2];
                        mzbVar.getLocationInWindow(iArr);
                        Point point = gl.q;
                        nzbVar.measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        int measuredHeight = nzbVar.getMeasuredHeight();
                        int i7 = iArr[1];
                        m8Var.showAtLocation(rzbVar2.b, 51, iArr[0] - gl.L(8.0f), ((float) i7) > (((float) point.y) * 0.9f) - ((float) measuredHeight) ? gl.L(8.0f) + (i7 - measuredHeight) : (mzbVar.getMeasuredHeight() + i7) - gl.L(8.0f));
                        break;
                }
            }
        });
        addView(imageView, nme.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        xw0 xw0Var = new xw0((byte) 7, context, this);
        this.b = xw0Var;
        zkb.X(xw0Var, i2, rzbVar.J0);
        xw0Var.setTextSize(1, 20.0f);
        xw0Var.setTypeface(gl.o());
        xw0Var.setText(k96.M0(2131753763, null));
        xw0Var.setPivotX(0.0f);
        xw0Var.setPivotY(0.0f);
        addView(xw0Var, nme.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        pkb pkbVar = new pkb((byte) 21, context, this);
        this.c = pkbVar;
        if (k96.a0) {
            pkbVar.setGravity(5);
        }
        pkbVar.setPivotX(0.0f);
        pkbVar.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            zkb.X(textView, bkb.Fj, rzbVar.J0);
            textView.setTextSize(1, 14.0f);
            textView.setText(rzb.E0(rzb.J0(str, null, null)));
            textView.setPadding(0, gl.L(2.0f), 0, gl.L(2.0f));
        }
        ImageView k = tb4.k(context, R.drawable.search_arrow);
        int i4 = bkb.Fj;
        zkb.s(k, i4, rzbVar.J0, mode);
        if (k96.a0) {
            k.setScaleX(-1.0f);
        }
        mzb mzbVar = new mzb(this, context);
        this.e = mzbVar;
        if (k96.a0) {
            mzbVar.setGravity(5);
        }
        mzbVar.b(0.25f, 350L, s33.h);
        zkb.U(mzbVar, i4, rzbVar.J0);
        mzbVar.setTextSize(gl.L(14.0f));
        mzbVar.setText(rzb.E0(rzb.J0(rzbVar.u1, null, null)));
        mzbVar.setPadding(gl.L(4.0f), gl.L(2.0f), gl.L(4.0f), gl.L(2.0f));
        mzbVar.setOnClickListener(new View.OnClickListener(this) { // from class: lzb
            public final /* synthetic */ ozb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                byte b3 = b;
                ozb ozbVar = this.b;
                switch (b3) {
                    case 0:
                        ozbVar.n.dismiss();
                        break;
                    default:
                        mzb mzbVar2 = ozbVar.e;
                        nzb nzbVar = new nzb(ozbVar.getContext(), null);
                        Drawable mutate = ozbVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i42 = bkb.F8;
                        rzb rzbVar2 = ozbVar.n;
                        zkb.x(ozbVar, mutate, i42, rzbVar2.J0, PorterDuff.Mode.MULTIPLY);
                        nzbVar.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = b1c.N;
                        ArrayList arrayList = new ArrayList(k96.D0().N.values());
                        int i5 = 0;
                        while (i5 < arrayList.size()) {
                            i96 i96Var = (i96) arrayList.get(i5);
                            if (i96Var == null || (((str2 = i96Var.c) != null && str2.endsWith("_raw")) || !"remote".equals(i96Var.d))) {
                                arrayList.remove(i5);
                                i5--;
                            }
                            i5++;
                        }
                        Collections.sort(arrayList, new fx5(k96.D0().B, (byte) 1));
                        boolean z = true;
                        int i6 = 0;
                        while (i6 < arrayList.size()) {
                            i96 i96Var2 = (i96) arrayList.get(i6);
                            if (!i96Var2.f.equals(rzbVar2.t1) && "remote".equals(i96Var2.d)) {
                                TextUtils.equals(rzbVar2.u1, i96Var2.f);
                                a8 a8Var = new a8(2, rzbVar2.J0, ozbVar.getContext(), z, i6 == arrayList.size() - 1);
                                a8Var.setText(rzb.E0(rzb.J0(i96Var2.f, null, null)));
                                a8Var.setChecked(TextUtils.equals(rzbVar2.u1, i96Var2.f));
                                a8Var.setOnClickListener(new hu4(ozbVar, runnableArr, i96Var2, (byte) 24));
                                nzbVar.addView(a8Var);
                                z = false;
                            }
                            i6++;
                        }
                        m8 m8Var = new m8(nzbVar, -2, -2);
                        runnableArr[0] = new wn1(m8Var, (byte) 1);
                        m8Var.e = true;
                        m8Var.c = (short) 220;
                        m8Var.setOutsideTouchable(true);
                        m8Var.setClippingEnabled(true);
                        m8Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m8Var.setFocusable(true);
                        int[] iArr = new int[2];
                        mzbVar2.getLocationInWindow(iArr);
                        Point point = gl.q;
                        nzbVar.measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        int measuredHeight = nzbVar.getMeasuredHeight();
                        int i7 = iArr[1];
                        m8Var.showAtLocation(rzbVar2.b, 51, iArr[0] - gl.L(8.0f), ((float) i7) > (((float) point.y) * 0.9f) - ((float) measuredHeight) ? gl.L(8.0f) + (i7 - measuredHeight) : (mzbVar2.getMeasuredHeight() + i7) - gl.L(8.0f));
                        break;
                }
            }
        });
        boolean z = k96.a0;
        TextView textView2 = this.d;
        if (z) {
            pkbVar.addView(mzbVar, nme.t(-2, -2, 16, 0, 0, textView2 != null ? 3 : 0, 0));
            if (this.d != null) {
                pkbVar.addView(k, nme.t(-2, -2, 16, 0, 1, 0, 0));
                pkbVar.addView(this.d, nme.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            if (textView2 != null) {
                pkbVar.addView(textView2, nme.t(-2, -2, 16, 0, 0, 4, 0));
                pkbVar.addView(k, nme.t(-2, -2, 16, 0, 1, 0, 0));
            }
            pkbVar.addView(mzbVar, nme.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(pkbVar, nme.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        zkb.h(bkb.U5, rzbVar.J0, view2);
        view2.setAlpha(0.0f);
        addView(view2, nme.d(-1, gl.e1() / gl.N(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(78.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        float a = moe.a((f - gl.m) / gl.L(64.0f), 0.0f, 1.0f);
        if (!this.n.I0()) {
            a = 1.0f;
        }
        float interpolation = s33.g.getInterpolation(a);
        float R1 = gl.R1(0.85f, 1.0f, interpolation);
        xw0 xw0Var = this.b;
        xw0Var.setScaleX(R1);
        xw0Var.setScaleY(gl.R1(0.85f, 1.0f, interpolation));
        xw0Var.setTranslationY(gl.R1(gl.N(-12.0f), 0.0f, interpolation));
        boolean z = k96.a0;
        pkb pkbVar = this.c;
        if (!z) {
            xw0Var.setTranslationX(gl.R1(gl.N(50.0f), 0.0f, interpolation));
            pkbVar.setTranslationX(gl.R1(gl.N(50.0f), 0.0f, interpolation));
        }
        pkbVar.setTranslationY(gl.R1(gl.N(-22.0f), 0.0f, interpolation));
        float R12 = gl.R1(0.0f, gl.N(-25.0f), interpolation);
        ImageView imageView = this.a;
        imageView.setTranslationX(R12);
        float f2 = 1.0f - interpolation;
        imageView.setAlpha(f2);
        float R13 = gl.R1(0.0f, gl.N(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(R13);
        view.setAlpha(f2);
    }
}
