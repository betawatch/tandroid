// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tv7 extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv7(yv7 yv7Var, Context context) {
        super(context);
        this.h = yv7Var;
        this.b = new ArrayList(4);
        this.c = new ArrayList(4);
        this.d = new StringBuilder(4);
        for (int i = 0; i < 4; i++) {
            TextView textView = new TextView(context);
            textView.setTextColor(-1);
            textView.setTypeface(gl.o());
            textView.setTextSize(1, 36.0f);
            textView.setGravity(17);
            textView.setAlpha(0.0f);
            textView.setPivotX(gl.L(25.0f));
            textView.setPivotY(gl.L(25.0f));
            addView(textView, nme.e(50, 50, 51));
            ((ArrayList) this.b).add(textView);
            TextView textView2 = new TextView(context);
            textView2.setTextColor(-1);
            textView2.setTypeface(gl.o());
            textView2.setTextSize(1, 36.0f);
            textView2.setGravity(17);
            textView2.setAlpha(0.0f);
            textView2.setText("•");
            textView2.setPivotX(gl.L(25.0f));
            textView2.setPivotY(gl.L(25.0f));
            addView(textView2, nme.e(50, 50, 51));
            ((ArrayList) this.c).add(textView2);
        }
    }

    public final void a(String str) {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        StringBuilder sb = (StringBuilder) this.d;
        if (sb.length() == 4) {
            return;
        }
        byte b = 3;
        try {
            performHapticFeedback(3);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        ArrayList arrayList3 = new ArrayList();
        int length = sb.length();
        sb.append(str);
        TextView textView = (TextView) arrayList2.get(length);
        textView.setText(str);
        textView.setTranslationX(c(length));
        Property property = View.SCALE_X;
        arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f, 1.0f));
        Property property3 = View.ALPHA;
        arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f, 1.0f));
        Property property4 = View.TRANSLATION_Y;
        arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, gl.L(20.0f), 0.0f));
        TextView textView2 = (TextView) arrayList.get(length);
        textView2.setTranslationX(c(length));
        textView2.setAlpha(0.0f);
        arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f, 1.0f));
        arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f, 1.0f));
        arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, gl.L(20.0f), 0.0f));
        for (int i = length + 1; i < 4; i++) {
            TextView textView3 = (TextView) arrayList2.get(i);
            if (textView3.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f));
            }
            TextView textView4 = (TextView) arrayList.get(i);
            if (textView4.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property3, 0.0f));
            }
        }
        ef0 ef0Var = (ef0) this.f;
        if (ef0Var != null) {
            gl.r(ef0Var);
        }
        ef0 ef0Var2 = new ef0(this, length, b);
        this.f = ef0Var2;
        gl.e3(ef0Var2, 1500L);
        for (int i2 = 0; i2 < length; i2++) {
            TextView textView5 = (TextView) arrayList2.get(i2);
            Property property5 = View.TRANSLATION_X;
            arrayList3.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property5, c(i2)));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property2, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property3, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property4, 0.0f));
            TextView textView6 = (TextView) arrayList.get(i2);
            arrayList3.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property5, c(i2)));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property2, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property3, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property4, 0.0f));
        }
        AnimatorSet animatorSet = (AnimatorSet) this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.setDuration(150L);
        ((AnimatorSet) this.e).playTogether(arrayList3);
        ((AnimatorSet) this.e).addListener(new sv7(this, (byte) 0));
        ((AnimatorSet) this.e).start();
        ((yv7) this.h).e();
    }

    public final void b(boolean z) {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        StringBuilder sb = (StringBuilder) this.d;
        if (sb.length() == 0) {
            return;
        }
        ef0 ef0Var = (ef0) this.f;
        if (ef0Var != null) {
            gl.r(ef0Var);
            this.f = null;
        }
        AnimatorSet animatorSet = (AnimatorSet) this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.e = null;
        }
        sb.delete(0, sb.length());
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            for (int i = 0; i < 4; i++) {
                TextView textView = (TextView) arrayList2.get(i);
                float alpha = textView.getAlpha();
                Property property = View.ALPHA;
                Property property2 = View.SCALE_Y;
                Property property3 = View.SCALE_X;
                if (alpha != 0.0f) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                }
                TextView textView2 = (TextView) arrayList.get(i);
                if (textView2.getAlpha() != 0.0f) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f));
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.e = animatorSet2;
            animatorSet2.setDuration(150L);
            ((AnimatorSet) this.e).playTogether(arrayList3);
            ((AnimatorSet) this.e).addListener(new sv7(this, (byte) 2));
            ((AnimatorSet) this.e).start();
        } else {
            for (int i2 = 0; i2 < 4; i2++) {
                ((TextView) arrayList2.get(i2)).setAlpha(0.0f);
                ((TextView) arrayList.get(i2)).setAlpha(0.0f);
            }
        }
        ((yv7) this.h).e();
    }

    public final int c(int i) {
        return de9.y(30.0f, i, (getMeasuredWidth() - (gl.L(30.0f) * ((StringBuilder) this.d).length())) / 2) - gl.L(10.0f);
    }

    public final void d(boolean z) {
        ((ImageView) this.c).setVisibility(z ? 0 : 8);
        TextView textView = (TextView) this.d;
        boolean z2 = k96.a0;
        textView.setLayoutParams(nme.d(-1, -2.0f, 23, (z2 || !z) ? 22.0f : 53.0f, 0.0f, (z2 && z) ? 53.0f : 22.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f;
                paint.setColor(bkb.v0(bkb.c7, (wjb) this.b));
                canvas.drawRect(0.0f, getHeight() - gl.e1(), getWidth(), getHeight(), paint);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    public final void e(String str) {
        ((TextView) this.d).setText(str);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.c;
                ef0 ef0Var = (ef0) this.f;
                if (ef0Var != null) {
                    gl.r(ef0Var);
                    this.f = null;
                }
                AnimatorSet animatorSet = (AnimatorSet) this.e;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.e = null;
                }
                for (int i5 = 0; i5 < 4; i5++) {
                    int length = ((StringBuilder) this.d).length();
                    ArrayList arrayList2 = (ArrayList) this.b;
                    if (i5 < length) {
                        TextView textView = (TextView) arrayList2.get(i5);
                        textView.setAlpha(0.0f);
                        textView.setScaleX(1.0f);
                        textView.setScaleY(1.0f);
                        textView.setTranslationY(0.0f);
                        textView.setTranslationX(c(i5));
                        TextView textView2 = (TextView) arrayList.get(i5);
                        textView2.setAlpha(1.0f);
                        textView2.setScaleX(1.0f);
                        textView2.setScaleY(1.0f);
                        textView2.setTranslationY(0.0f);
                        textView2.setTranslationX(c(i5));
                    } else {
                        ((TextView) arrayList2.get(i5)).setAlpha(0.0f);
                        ((TextView) arrayList.get(i5)).setAlpha(0.0f);
                    }
                }
                super.onLayout(z, i, i2, i3, i4);
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    public tv7(Context context, wjb wjbVar) {
        super(context);
        this.f = new Paint(1);
        this.b = wjbVar;
        TextView textView = new TextView(context);
        this.d = textView;
        ug8.v(textView, 1, 20.0f);
        textView.setGravity(k96.a0 ? 5 : 3);
        zkb.X(textView, bkb.i5, wjbVar);
        boolean z = k96.a0;
        addView(textView, nme.d(-1, -2.0f, 23, z ? 16.0f : 53.0f, 0.0f, z ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ed0 ed0Var = new ed0(false);
        this.e = ed0Var;
        imageView.setImageDrawable(ed0Var);
        ed0Var.a(-1);
        ed0Var.b(-1);
        ed0Var.k = 220.0f;
        addView(imageView, nme.d(24, 24.0f, (k96.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new bna(this, (byte) 14));
    }
}
