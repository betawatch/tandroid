// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.security.KeyStoreException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class yv7 extends FrameLayout implements gk7 {
    public static final int[] j0 = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    public final ImageView E;
    public final ImageView F;
    public final View G;
    public int H;
    public final hx4 I;
    public final kl0 J;
    public Bitmap K;
    public Canvas L;
    public int M;
    public final ry8 N;
    public final Rect O;
    public wv7 P;
    public boolean Q;
    public AnimatorSet R;
    public AnimatorSet S;
    public ValueAnimator T;
    public yla U;
    public final LinkedList V;
    public final LinkedList W;
    public Drawable a;
    public final ArrayList a0;
    public final FrameLayout b;
    public float b0;
    public final TextView c;
    public int c0;
    public final FrameLayout d;
    public final bg7 d0;
    public final a6 e;
    public int e0;
    public final ArrayList f;
    public mv5 f0;
    public boolean g0;
    public final FrameLayout h;
    public ValueAnimator h0;
    public final int[] i0;
    public final vv7 n;
    public final EditTextBoldCursor r;
    public final tv7 s;
    public final st w;
    public final TextView x;
    public final TextView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yv7(Context context) {
        super(context);
        int i;
        String M0 = k96.M0(2131743611, null);
        int i2 = 0;
        this.H = 0;
        hx4 hx4Var = new hx4();
        this.I = hx4Var;
        kl0 kl0Var = new kl0(hx4Var, hx4Var, hx4Var);
        this.J = kl0Var;
        e59 e59Var = new e59(0, false);
        this.O = new Rect();
        this.V = new LinkedList();
        this.W = new LinkedList();
        this.a0 = new ArrayList();
        this.c0 = -12;
        this.d0 = new bg7(this, (byte) 5);
        final byte b = 1;
        this.g0 = true;
        this.i0 = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        st stVar = new st(this, context);
        this.w = stVar;
        stVar.setWillNotDraw(false);
        addView(stVar, nme.c(-1.0f, -1));
        kl0Var.h = new zec(stVar);
        kl0Var.i = stVar;
        kl0Var.g = e59Var;
        ry8 ry8Var = new ry8(context);
        this.N = ry8Var;
        ry8Var.f(R.raw.passcode_lock, 58, 58, null);
        ry8Var.setAutoRepeat(false);
        addView(ry8Var, nme.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        stVar.addView(frameLayout, nme.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(gl.o());
        textView.setAlpha(0.0f);
        TextView l = ug8.l(frameLayout, textView, nme.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.y = l;
        l.setTextColor(-1);
        l.setTextSize(1, 15.0f);
        l.setGravity(1);
        l.setVisibility(4);
        stVar.addView(l, nme.e(-2, -2, 17));
        tv7 tv7Var = new tv7(this, context);
        this.s = tv7Var;
        frameLayout.addView(tv7Var, nme.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.r = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 36.0f);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setGravity(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setCursorColor(-1);
        editTextBoldCursor.setCursorSize(gl.L(32.0f));
        frameLayout.addView(editTextBoldCursor, nme.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 17));
        editTextBoldCursor.addTextChangedListener(new jf6(this, (byte) 4));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new kv7((byte) 1));
        ImageView imageView = new ImageView(context);
        this.E = imageView;
        imageView.setImageResource(R.drawable.passcode_check);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView, nme.d(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView.setContentDescription(k96.M0(2131751342, null));
        final Object[] objArr = 0 == true ? 1 : 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ov7
            public final /* synthetic */ yv7 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v32, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r3v6 */
            /* JADX WARN: Type inference failed for: r3v7, types: [int] */
            /* JADX WARN: Type inference failed for: r3v9 */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList, java.util.List] */
            /* JADX WARN: Type inference failed for: r7v13 */
            /* JADX WARN: Type inference failed for: r7v14 */
            /* JADX WARN: Type inference failed for: r7v4 */
            /* JADX WARN: Type inference failed for: r7v5, types: [int] */
            /* JADX WARN: Type inference failed for: r7v6 */
            /* JADX WARN: Type inference failed for: r7v7, types: [int] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LinkedList linkedList;
                yv7 yv7Var;
                LinkedList linkedList2;
                boolean z;
                boolean z2;
                LinkedList linkedList3;
                int i3;
                int i4;
                boolean z3;
                boolean z4;
                byte b2 = objArr;
                yv7 yv7Var2 = this.b;
                switch (b2) {
                    case 0:
                        yv7Var2.n(false);
                        break;
                    case 1:
                        yv7Var2.b();
                        break;
                    default:
                        LinkedList linkedList4 = yv7Var2.W;
                        LinkedList linkedList5 = yv7Var2.V;
                        tv7 tv7Var2 = yv7Var2.s;
                        if (yv7Var2.g0 && !yv7Var2.Q) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            int i5 = 4;
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("0");
                                    z2 = z;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("1");
                                    z2 = z;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("2");
                                    z2 = z;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("3");
                                    z2 = z;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("4");
                                    z2 = z;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("5");
                                    z2 = z;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("6");
                                    z2 = z;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("7");
                                    z2 = z;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("8");
                                    z2 = z;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("9");
                                    z2 = z;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    yv7Var.b();
                                    z2 = z;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) tv7Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) tv7Var2.b;
                                    z = false;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb = (StringBuilder) tv7Var2.d;
                                    if (sb.length() == 0) {
                                        linkedList = linkedList4;
                                        yv7Var = yv7Var2;
                                        linkedList2 = linkedList5;
                                        z2 = z;
                                        break;
                                    } else {
                                        try {
                                            tv7Var2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            fa4.g(e, true);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int i6 = 1;
                                        int length = sb.length() - 1;
                                        if (length != 0) {
                                            sb.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i7 = length;
                                        while (i7 < i5) {
                                            TextView textView2 = (TextView) arrayList2.get(i7);
                                            yv7 yv7Var3 = yv7Var2;
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i3 = i6;
                                                float[] fArr = new float[i3];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr));
                                                float[] fArr2 = new float[i3];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr2));
                                                float[] fArr3 = new float[i3];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr3));
                                                float[] fArr4 = new float[i3];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr4));
                                                float[] fArr5 = new float[i3];
                                                fArr5[0] = tv7Var2.c(i7);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i3 = i6;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i7);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr6 = new float[i3];
                                                fArr6[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr6));
                                                float[] fArr7 = new float[i3];
                                                fArr7[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr7));
                                                float[] fArr8 = new float[i3];
                                                fArr8[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr8));
                                                float[] fArr9 = new float[i3];
                                                fArr9[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr9));
                                                float c = tv7Var2.c(i7);
                                                i4 = i7;
                                                float[] fArr10 = new float[i3];
                                                fArr10[0] = c;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                            } else {
                                                i4 = i7;
                                            }
                                            i7 = i4 + 1;
                                            linkedList5 = linkedList3;
                                            yv7Var2 = yv7Var3;
                                            i5 = 4;
                                            i6 = 1;
                                        }
                                        yv7Var = yv7Var2;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb.deleteCharAt(length);
                                        }
                                        for (int i8 = 0; i8 < length; i8++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i8), (Property<TextView, Float>) property5, tv7Var2.c(i8)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i8), (Property<TextView, Float>) property5, tv7Var2.c(i8)));
                                        }
                                        ef0 ef0Var = (ef0) tv7Var2.f;
                                        if (ef0Var != null) {
                                            gl.r(ef0Var);
                                            tv7Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) tv7Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        tv7Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) tv7Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) tv7Var2.e).addListener(new sv7(tv7Var2, (byte) 1));
                                        ((AnimatorSet) tv7Var2.e).start();
                                        ((yv7) tv7Var2.h).e();
                                        z2 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    z2 = z;
                                    break;
                            }
                            yv7 yv7Var4 = yv7Var;
                            if (intValue != 11) {
                                Drawable drawable = yv7Var4.a;
                                if (drawable instanceof ye7) {
                                    ye7 ye7Var = (ye7) drawable;
                                    ye7Var.C = null;
                                    ye7Var.x();
                                    float f = ye7Var.h;
                                    if (intValue == 10) {
                                        if (z2) {
                                            ye7Var.w();
                                            z4 = true;
                                        } else {
                                            z4 = z;
                                        }
                                        z3 = z;
                                    } else {
                                        z3 = true;
                                        ye7Var.v(true);
                                        z4 = true;
                                    }
                                    if (z4) {
                                        if (f >= 1.0f) {
                                            yv7Var4.a(ye7Var);
                                        } else {
                                            ?? r3 = linkedList2;
                                            r3.offer(new vj6((Object) yv7Var4, z3, (Object) ye7Var, (byte) 7));
                                            ?? r2 = linkedList;
                                            r2.offer(Boolean.valueOf(z3));
                                            ?? arrayList4 = new ArrayList();
                                            ?? arrayList5 = new ArrayList();
                                            for (?? r7 = z; r7 < r3.size(); r7++) {
                                                Runnable runnable = (Runnable) r3.get(r7);
                                                Boolean bool = (Boolean) r2.get(r7);
                                                if (bool != null && bool.booleanValue() != z3) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf((int) r7));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            for (?? r72 = z; r72 < size; r72++) {
                                                r3.remove((Runnable) arrayList4.get(r72));
                                            }
                                            Collections.sort(arrayList5, new el6((byte) 29));
                                            int size2 = arrayList5.size();
                                            for (?? r32 = z; r32 < size2; r32++) {
                                                r2.remove(((Integer) arrayList5.get(r32)).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) tv7Var2.d).length() == 4) {
                                yv7Var4.n(z);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.F = imageView2;
        imageView2.setImageResource(R.drawable.fingerprint);
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView2, nme.d(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView2.setContentDescription(k96.M0(2131754881, null));
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: ov7
            public final /* synthetic */ yv7 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v32, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r3v6 */
            /* JADX WARN: Type inference failed for: r3v7, types: [int] */
            /* JADX WARN: Type inference failed for: r3v9 */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList, java.util.List] */
            /* JADX WARN: Type inference failed for: r7v13 */
            /* JADX WARN: Type inference failed for: r7v14 */
            /* JADX WARN: Type inference failed for: r7v4 */
            /* JADX WARN: Type inference failed for: r7v5, types: [int] */
            /* JADX WARN: Type inference failed for: r7v6 */
            /* JADX WARN: Type inference failed for: r7v7, types: [int] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LinkedList linkedList;
                yv7 yv7Var;
                LinkedList linkedList2;
                boolean z;
                boolean z2;
                LinkedList linkedList3;
                int i3;
                int i4;
                boolean z3;
                boolean z4;
                byte b2 = b;
                yv7 yv7Var2 = this.b;
                switch (b2) {
                    case 0:
                        yv7Var2.n(false);
                        break;
                    case 1:
                        yv7Var2.b();
                        break;
                    default:
                        LinkedList linkedList4 = yv7Var2.W;
                        LinkedList linkedList5 = yv7Var2.V;
                        tv7 tv7Var2 = yv7Var2.s;
                        if (yv7Var2.g0 && !yv7Var2.Q) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            int i5 = 4;
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("0");
                                    z2 = z;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("1");
                                    z2 = z;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("2");
                                    z2 = z;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("3");
                                    z2 = z;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("4");
                                    z2 = z;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("5");
                                    z2 = z;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("6");
                                    z2 = z;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("7");
                                    z2 = z;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("8");
                                    z2 = z;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    tv7Var2.a("9");
                                    z2 = z;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    yv7Var.b();
                                    z2 = z;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) tv7Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) tv7Var2.b;
                                    z = false;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb = (StringBuilder) tv7Var2.d;
                                    if (sb.length() == 0) {
                                        linkedList = linkedList4;
                                        yv7Var = yv7Var2;
                                        linkedList2 = linkedList5;
                                        z2 = z;
                                        break;
                                    } else {
                                        try {
                                            tv7Var2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            fa4.g(e, true);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int i6 = 1;
                                        int length = sb.length() - 1;
                                        if (length != 0) {
                                            sb.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i7 = length;
                                        while (i7 < i5) {
                                            TextView textView2 = (TextView) arrayList2.get(i7);
                                            yv7 yv7Var3 = yv7Var2;
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i3 = i6;
                                                float[] fArr = new float[i3];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr));
                                                float[] fArr2 = new float[i3];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr2));
                                                float[] fArr3 = new float[i3];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr3));
                                                float[] fArr4 = new float[i3];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr4));
                                                float[] fArr5 = new float[i3];
                                                fArr5[0] = tv7Var2.c(i7);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i3 = i6;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i7);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr6 = new float[i3];
                                                fArr6[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr6));
                                                float[] fArr7 = new float[i3];
                                                fArr7[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr7));
                                                float[] fArr8 = new float[i3];
                                                fArr8[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr8));
                                                float[] fArr9 = new float[i3];
                                                fArr9[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr9));
                                                float c = tv7Var2.c(i7);
                                                i4 = i7;
                                                float[] fArr10 = new float[i3];
                                                fArr10[0] = c;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                            } else {
                                                i4 = i7;
                                            }
                                            i7 = i4 + 1;
                                            linkedList5 = linkedList3;
                                            yv7Var2 = yv7Var3;
                                            i5 = 4;
                                            i6 = 1;
                                        }
                                        yv7Var = yv7Var2;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb.deleteCharAt(length);
                                        }
                                        for (int i8 = 0; i8 < length; i8++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i8), (Property<TextView, Float>) property5, tv7Var2.c(i8)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i8), (Property<TextView, Float>) property5, tv7Var2.c(i8)));
                                        }
                                        ef0 ef0Var = (ef0) tv7Var2.f;
                                        if (ef0Var != null) {
                                            gl.r(ef0Var);
                                            tv7Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) tv7Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        tv7Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) tv7Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) tv7Var2.e).addListener(new sv7(tv7Var2, (byte) 1));
                                        ((AnimatorSet) tv7Var2.e).start();
                                        ((yv7) tv7Var2.h).e();
                                        z2 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    yv7Var = yv7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    z2 = z;
                                    break;
                            }
                            yv7 yv7Var4 = yv7Var;
                            if (intValue != 11) {
                                Drawable drawable = yv7Var4.a;
                                if (drawable instanceof ye7) {
                                    ye7 ye7Var = (ye7) drawable;
                                    ye7Var.C = null;
                                    ye7Var.x();
                                    float f = ye7Var.h;
                                    if (intValue == 10) {
                                        if (z2) {
                                            ye7Var.w();
                                            z4 = true;
                                        } else {
                                            z4 = z;
                                        }
                                        z3 = z;
                                    } else {
                                        z3 = true;
                                        ye7Var.v(true);
                                        z4 = true;
                                    }
                                    if (z4) {
                                        if (f >= 1.0f) {
                                            yv7Var4.a(ye7Var);
                                        } else {
                                            ?? r3 = linkedList2;
                                            r3.offer(new vj6((Object) yv7Var4, z3, (Object) ye7Var, (byte) 7));
                                            ?? r2 = linkedList;
                                            r2.offer(Boolean.valueOf(z3));
                                            ?? arrayList4 = new ArrayList();
                                            ?? arrayList5 = new ArrayList();
                                            for (?? r7 = z; r7 < r3.size(); r7++) {
                                                Runnable runnable = (Runnable) r3.get(r7);
                                                Boolean bool = (Boolean) r2.get(r7);
                                                if (bool != null && bool.booleanValue() != z3) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf((int) r7));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            for (?? r72 = z; r72 < size; r72++) {
                                                r3.remove((Runnable) arrayList4.get(r72));
                                            }
                                            Collections.sort(arrayList5, new el6((byte) 29));
                                            int size2 = arrayList5.size();
                                            for (?? r32 = z; r32 < size2; r32++) {
                                                r2.remove(((Integer) arrayList5.get(r32)).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) tv7Var2.d).length() == 4) {
                                yv7Var4.n(z);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        View view = new View(context);
        this.G = view;
        view.setBackgroundColor(822083583);
        frameLayout.addView(view, nme.a(-1.0f, 1.0f / gl.p, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        stVar.addView(frameLayout2, nme.e(-1, -1, 51));
        a6 a6Var = new a6(context, (byte) 21);
        this.e = a6Var;
        a6Var.setClipChildren(false);
        frameLayout2.addView(a6Var, nme.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b = frameLayout3;
        a6Var.addView(frameLayout3, nme.e(-2, -2, 49));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(gl.o());
        textView2.setTextColor(-1);
        textView2.setText(M0);
        TextView l2 = ug8.l(frameLayout3, textView2, nme.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.c = l2;
        l2.setTextSize(1, 14.0f);
        l2.setTextColor(-1);
        l2.setText((CharSequence) null);
        frameLayout3.addView(l2, nme.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f = new ArrayList(10);
        while (true) {
            if (i2 >= 12) {
                break;
            }
            vv7 vv7Var = new vv7(context);
            ote.b(vv7Var, 0.15f, 1.5f);
            vv7Var.setTag(Integer.valueOf(i2));
            int[] iArr = j0;
            if (i2 == 11) {
                vv7Var.setBackground(f(vv7Var));
                int L = gl.L(30.0f);
                vv7Var.setForeground(bkb.i0(L, L, L, L, 0, 654311423, 654311423));
                vv7Var.setImage(R.drawable.filled_clear);
                vv7Var.setOnLongClickListener(new zs(this, (byte) 7));
                vv7Var.setContentDescription(k96.M0(2131754920, null));
                vv7Var.setNextFocusForwardId(R.id.passcode_btn_0);
                vv7Var.setAccessibilityTraversalBefore(R.id.passcode_btn_0);
            } else if (i2 == 10) {
                this.n = vv7Var;
                vv7Var.setBackground(f(vv7Var));
                int L2 = gl.L(30.0f);
                vv7Var.setForeground(bkb.i0(L2, L2, L2, L2, 0, 654311423, 654311423));
                vv7Var.setContentDescription(k96.M0(2131754881, null));
                vv7Var.setImage(R.drawable.fingerprint);
                vv7Var.setNextFocusForwardId(R.id.passcode_btn_1);
                vv7Var.setAccessibilityTraversalBefore(R.id.passcode_btn_1);
            } else {
                vv7Var.setBackground(f(vv7Var));
                int L3 = gl.L(30.0f);
                vv7Var.setForeground(bkb.i0(L3, L3, L3, L3, 0, 654311423, 654311423));
                vv7Var.setContentDescription(i2 + "");
                vv7Var.setNum(i2);
                if (i2 == 0) {
                    vv7Var.setNextFocusForwardId(R.id.passcode_btn_backspace);
                    vv7Var.setAccessibilityTraversalBefore(R.id.passcode_btn_backspace);
                } else if (i2 != 9) {
                    int i3 = iArr[i2 + 1];
                    vv7Var.setNextFocusForwardId(i3);
                    vv7Var.setAccessibilityTraversalBefore(i3);
                } else if (g()) {
                    vv7Var.setNextFocusForwardId(R.id.passcode_btn_fingerprint);
                    vv7Var.setAccessibilityTraversalBefore(R.id.passcode_btn_fingerprint);
                } else {
                    vv7Var.setNextFocusForwardId(R.id.passcode_btn_0);
                    vv7Var.setAccessibilityTraversalBefore(R.id.passcode_btn_0);
                }
            }
            vv7Var.setId(iArr[i2]);
            final byte b2 = 2;
            vv7Var.setOnClickListener(new View.OnClickListener(this) { // from class: ov7
                public final /* synthetic */ yv7 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r2v32, types: [java.util.LinkedList] */
                /* JADX WARN: Type inference failed for: r3v4, types: [java.util.LinkedList] */
                /* JADX WARN: Type inference failed for: r3v6 */
                /* JADX WARN: Type inference failed for: r3v7, types: [int] */
                /* JADX WARN: Type inference failed for: r3v9 */
                /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList, java.util.List] */
                /* JADX WARN: Type inference failed for: r7v13 */
                /* JADX WARN: Type inference failed for: r7v14 */
                /* JADX WARN: Type inference failed for: r7v4 */
                /* JADX WARN: Type inference failed for: r7v5, types: [int] */
                /* JADX WARN: Type inference failed for: r7v6 */
                /* JADX WARN: Type inference failed for: r7v7, types: [int] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LinkedList linkedList;
                    yv7 yv7Var;
                    LinkedList linkedList2;
                    boolean z;
                    boolean z2;
                    LinkedList linkedList3;
                    int i32;
                    int i4;
                    boolean z3;
                    boolean z4;
                    byte b22 = b2;
                    yv7 yv7Var2 = this.b;
                    switch (b22) {
                        case 0:
                            yv7Var2.n(false);
                            break;
                        case 1:
                            yv7Var2.b();
                            break;
                        default:
                            LinkedList linkedList4 = yv7Var2.W;
                            LinkedList linkedList5 = yv7Var2.V;
                            tv7 tv7Var2 = yv7Var2.s;
                            if (yv7Var2.g0 && !yv7Var2.Q) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                int i5 = 4;
                                switch (intValue) {
                                    case 0:
                                        linkedList = linkedList4;
                                        yv7Var = yv7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        tv7Var2.a("0");
                                        z2 = z;
                                        break;
                                    case 1:
                                        linkedList = linkedList4;
                                        yv7Var = yv7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        tv7Var2.a("1");
                                        z2 = z;
                                        break;
                                    case 2:
                                        linkedList = linkedList4;
                                        yv7Var = yv7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        tv7Var2.a("2");
                                        z2 = z;
                                        break;
                                    case 3:
                                        linkedList = linkedList4;
                                        yv7Var = yv7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        tv7Var2.a("3");
                                        z2 = z;
                                        break;
                                    case 4:
                                        linkedList = linkedList4;
                                        yv7Var = yv7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        tv7Var2.a("4");
                                        z2 = z;
                                        break;
                                    case 5:
                                        linkedList = linkedList4;
                                        yv7Var = yv7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        tv7Var2.a("5");
                                        z2 = z;
                                        break;
                                    case 6:
                                        linkedList = linkedList4;
                                        yv7Var = yv7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        tv7Var2.a("6");
                                        z2 = z;
                                        break;
                                    case 7:
                                        linkedList = linkedList4;
                                        yv7Var = yv7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        tv7Var2.a("7");
                                        z2 = z;
                                        break;
                                    case 8:
                                        linkedList = linkedList4;
                                        yv7Var = yv7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        tv7Var2.a("8");
                                        z2 = z;
                                        break;
                                    case 9:
                                        linkedList = linkedList4;
                                        yv7Var = yv7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        tv7Var2.a("9");
                                        z2 = z;
                                        break;
                                    case 10:
                                        linkedList = linkedList4;
                                        yv7Var = yv7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        yv7Var.b();
                                        z2 = z;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) tv7Var2.c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        ArrayList arrayList2 = (ArrayList) tv7Var2.b;
                                        z = false;
                                        Property property5 = View.TRANSLATION_X;
                                        StringBuilder sb = (StringBuilder) tv7Var2.d;
                                        if (sb.length() == 0) {
                                            linkedList = linkedList4;
                                            yv7Var = yv7Var2;
                                            linkedList2 = linkedList5;
                                            z2 = z;
                                            break;
                                        } else {
                                            try {
                                                tv7Var2.performHapticFeedback(3);
                                            } catch (Exception e) {
                                                fa4.g(e, true);
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            int i6 = 1;
                                            int length = sb.length() - 1;
                                            if (length != 0) {
                                                sb.deleteCharAt(length);
                                            }
                                            linkedList = linkedList4;
                                            int i7 = length;
                                            while (i7 < i5) {
                                                TextView textView22 = (TextView) arrayList2.get(i7);
                                                yv7 yv7Var3 = yv7Var2;
                                                if (textView22.getAlpha() != 0.0f) {
                                                    linkedList3 = linkedList5;
                                                    i32 = i6;
                                                    float[] fArr = new float[i32];
                                                    fArr[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, (Property<TextView, Float>) property4, fArr));
                                                    float[] fArr2 = new float[i32];
                                                    fArr2[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, (Property<TextView, Float>) property3, fArr2));
                                                    float[] fArr3 = new float[i32];
                                                    fArr3[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, (Property<TextView, Float>) property2, fArr3));
                                                    float[] fArr4 = new float[i32];
                                                    fArr4[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, (Property<TextView, Float>) property, fArr4));
                                                    float[] fArr5 = new float[i32];
                                                    fArr5[0] = tv7Var2.c(i7);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, (Property<TextView, Float>) property5, fArr5));
                                                } else {
                                                    linkedList3 = linkedList5;
                                                    i32 = i6;
                                                }
                                                TextView textView3 = (TextView) arrayList.get(i7);
                                                if (textView3.getAlpha() != 0.0f) {
                                                    float[] fArr6 = new float[i32];
                                                    fArr6[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr6));
                                                    float[] fArr7 = new float[i32];
                                                    fArr7[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr7));
                                                    float[] fArr8 = new float[i32];
                                                    fArr8[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr8));
                                                    float[] fArr9 = new float[i32];
                                                    fArr9[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr9));
                                                    float c = tv7Var2.c(i7);
                                                    i4 = i7;
                                                    float[] fArr10 = new float[i32];
                                                    fArr10[0] = c;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                                } else {
                                                    i4 = i7;
                                                }
                                                i7 = i4 + 1;
                                                linkedList5 = linkedList3;
                                                yv7Var2 = yv7Var3;
                                                i5 = 4;
                                                i6 = 1;
                                            }
                                            yv7Var = yv7Var2;
                                            linkedList2 = linkedList5;
                                            if (length == 0) {
                                                sb.deleteCharAt(length);
                                            }
                                            for (int i8 = 0; i8 < length; i8++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i8), (Property<TextView, Float>) property5, tv7Var2.c(i8)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i8), (Property<TextView, Float>) property5, tv7Var2.c(i8)));
                                            }
                                            ef0 ef0Var = (ef0) tv7Var2.f;
                                            if (ef0Var != null) {
                                                gl.r(ef0Var);
                                                tv7Var2.f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) tv7Var2.e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            tv7Var2.e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) tv7Var2.e).playTogether(arrayList3);
                                            ((AnimatorSet) tv7Var2.e).addListener(new sv7(tv7Var2, (byte) 1));
                                            ((AnimatorSet) tv7Var2.e).start();
                                            ((yv7) tv7Var2.h).e();
                                            z2 = true;
                                            break;
                                        }
                                    default:
                                        linkedList = linkedList4;
                                        yv7Var = yv7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        z2 = z;
                                        break;
                                }
                                yv7 yv7Var4 = yv7Var;
                                if (intValue != 11) {
                                    Drawable drawable = yv7Var4.a;
                                    if (drawable instanceof ye7) {
                                        ye7 ye7Var = (ye7) drawable;
                                        ye7Var.C = null;
                                        ye7Var.x();
                                        float f = ye7Var.h;
                                        if (intValue == 10) {
                                            if (z2) {
                                                ye7Var.w();
                                                z4 = true;
                                            } else {
                                                z4 = z;
                                            }
                                            z3 = z;
                                        } else {
                                            z3 = true;
                                            ye7Var.v(true);
                                            z4 = true;
                                        }
                                        if (z4) {
                                            if (f >= 1.0f) {
                                                yv7Var4.a(ye7Var);
                                            } else {
                                                ?? r3 = linkedList2;
                                                r3.offer(new vj6((Object) yv7Var4, z3, (Object) ye7Var, (byte) 7));
                                                ?? r2 = linkedList;
                                                r2.offer(Boolean.valueOf(z3));
                                                ?? arrayList4 = new ArrayList();
                                                ?? arrayList5 = new ArrayList();
                                                for (?? r7 = z; r7 < r3.size(); r7++) {
                                                    Runnable runnable = (Runnable) r3.get(r7);
                                                    Boolean bool = (Boolean) r2.get(r7);
                                                    if (bool != null && bool.booleanValue() != z3) {
                                                        arrayList4.add(runnable);
                                                        arrayList5.add(Integer.valueOf((int) r7));
                                                    }
                                                }
                                                int size = arrayList4.size();
                                                for (?? r72 = z; r72 < size; r72++) {
                                                    r3.remove((Runnable) arrayList4.get(r72));
                                                }
                                                Collections.sort(arrayList5, new el6((byte) 29));
                                                int size2 = arrayList5.size();
                                                for (?? r32 = z; r32 < size2; r32++) {
                                                    r2.remove(((Integer) arrayList5.get(r32)).intValue());
                                                }
                                            }
                                        }
                                    }
                                }
                                if (((StringBuilder) tv7Var2.d).length() == 4) {
                                    yv7Var4.n(z);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            this.f.add(vv7Var);
            i2++;
        }
        for (i = 11; i >= 0; i--) {
            this.e.addView((FrameLayout) this.f.get(i), nme.e(60, 60, 51));
        }
        c();
    }

    public final void a(ye7 ye7Var) {
        yla ylaVar = this.U;
        if (ylaVar != null && ylaVar.f) {
            ylaVar.d();
        }
        ti4 ti4Var = new ti4(0.0f);
        ye7Var.C = new im6(ti4Var, (byte) 24);
        ye7Var.x();
        yla ylaVar2 = new yla(ti4Var);
        ylaVar2.m = oo1.j(100.0f, 300.0f, 1.0f);
        this.U = ylaVar2;
        ylaVar2.a(new o11(this, ye7Var, (byte) 5));
        this.U.b(new h10(ye7Var, (byte) 9));
        this.U.h();
    }

    public final void b() {
        Activity W;
        aw7 aw7Var;
        if (this.Q || (W = gl.W(getContext())) == null || this.n.getVisibility() != 0 || a.x) {
            return;
        }
        byte b = 1;
        if (W instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) W;
            ArrayList arrayList = launchActivity.A0;
            if (!arrayList.isEmpty() || (aw7Var = launchActivity.z0) == null) {
                if (b00.f(1, arrayList) != this) {
                    return;
                }
            } else if (this != aw7Var.b) {
                return;
            }
        }
        try {
            if (new ej0(new dj0(getContext())).a(15) == 0 && ige.d() && !ige.a()) {
                i4d i4dVar = new i4d(LaunchActivity.H1, rr.g(getContext()), new so0(this, b));
                hj0 hj0Var = new hj0();
                hj0Var.a = k96.M0(2131743611, null);
                hj0Var.c = k96.M0(2131743553, null);
                hj0Var.d = (byte) 15;
                i4dVar.I2(hj0Var.a(), null);
                o(false);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void c() {
        boolean g = g();
        int i = g ? 0 : 8;
        vv7 vv7Var = this.n;
        vv7Var.setVisibility(i);
        if (gba.q == 1) {
            this.F.setVisibility(vv7Var.getVisibility());
        }
        this.c.setText(k96.M0(gba.q == 1 ? 2131751104 : g ? 2131751105 : 2131751106, null));
    }

    public final void d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > gba.t) {
            long j = gba.s - (elapsedRealtime - gba.t);
            gba.s = j;
            if (j < 0) {
                gba.s = 0L;
            }
        }
        gba.t = elapsedRealtime;
        gba.x();
        long j2 = gba.s;
        EditTextBoldCursor editTextBoldCursor = this.r;
        FrameLayout frameLayout = this.h;
        bg7 bg7Var = this.d0;
        TextView textView = this.y;
        if (j2 <= 0) {
            gl.r(bg7Var);
            if (textView.getVisibility() == 0) {
                textView.setVisibility(4);
                frameLayout.setVisibility(0);
                o(true);
                if (gba.q == 1) {
                    gl.E3(editTextBoldCursor);
                    return;
                }
                return;
            }
            return;
        }
        int max = Math.max(1, (int) Math.ceil(j2 / 1000.0d));
        if (max != this.e0) {
            textView.setText(k96.a0(null, null, 2131743796, k96.G(max, "Seconds", new Object[0])));
            this.e0 = max;
        }
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
            frameLayout.setVisibility(4);
            o(false);
            gl.t1(editTextBoldCursor);
        }
        gl.r(bg7Var);
        gl.d3(bg7Var, 100L);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.P1) {
            c();
            if (((Boolean) objArr[0]).booleanValue() && gba.w) {
                b();
                return;
            }
            return;
        }
        if (i != kk7.n0 || objArr[0] == this) {
            return;
        }
        setVisibility(8);
        j();
    }

    public final void e() {
        tv7 tv7Var = this.s;
        boolean z = tv7Var == null || ((StringBuilder) tv7Var.d).length() > 0;
        FrameLayout frameLayout = this.b;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            ug8.t(frameLayout.animate().alpha(z ? 0.0f : 1.0f).scaleX(z ? 0.8f : 1.0f).scaleY(z ? 0.8f : 1.0f), s33.h, 320L);
        }
    }

    public final xv7 f(vv7 vv7Var) {
        nl0 nl0Var = new nl0(null);
        nl0Var.e = new fi7((byte) 22);
        if (Build.VERSION.SDK_INT < 29) {
            nl0Var.f(1308622847, 1308622847);
            nl0Var.e(452984831, 452984831);
            float N = gl.N(1.0f);
            float N2 = gl.N(0.6666667f);
            nl0Var.f = N;
            nl0Var.h = N2;
        }
        il0 c = this.J.c(vv7Var, nl0Var, true);
        c.r(gl.L(30.0f));
        return new xv7(c);
    }

    public final boolean g() {
        if (gl.W(getContext()) != null && gba.C) {
            try {
                Context context = a.b;
                if (eg4.b(context) && eg4.a(context) && ige.d()) {
                    if (!ige.a()) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
        return false;
    }

    public final boolean i() {
        mv5 mv5Var = this.f0;
        if (mv5Var == null || !mv5Var.c()) {
            return true;
        }
        gl.t1(this.r);
        return false;
    }

    public final void k() {
        gl.r(this.d0);
    }

    public final void l() {
        if (this.Q) {
            return;
        }
        d();
        if (this.y.getVisibility() != 0) {
            if (gba.q == 1) {
                EditTextBoldCursor editTextBoldCursor = this.r;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    gl.E3(editTextBoldCursor);
                }
                gl.d3(new mv7(this, (byte) 0), 200L);
            }
            b();
        }
    }

    public final void m(boolean z, int i, int i2, hb5 hb5Var) {
        View currentFocus;
        boolean z2;
        int i3;
        int i4;
        if (getVisibility() != 0) {
            this.Q = false;
        }
        c();
        d();
        Activity W = gl.W(getContext());
        int i5 = gba.q;
        TextView textView = this.y;
        EditTextBoldCursor editTextBoldCursor = this.r;
        if (i5 == 1) {
            if (!z && textView.getVisibility() != 0 && editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                gl.E3(editTextBoldCursor);
            }
        } else if (W != null && (currentFocus = W.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            gl.t1(W.getCurrentFocus());
        }
        if (getVisibility() == 0) {
            return;
        }
        setTranslationY(0.0f);
        this.a = null;
        boolean z3 = bkb.r0() instanceof ye7;
        st stVar = this.w;
        if (z3) {
            z2 = !bkb.I.o();
            this.a = bkb.r0();
            stVar.setBackgroundColor(-1090519040);
        } else {
            if (!bkb.V || "CJz3BZ6YGEYBAAAABboWp6SAv04".equals(bkb.I0()) || "qeZWES8rGVIEAAAARfWlK1lnfiI".equals(bkb.I0())) {
                if (!"d".equals(bkb.I0())) {
                    String I0 = bkb.I0();
                    if (!bkb.i0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(I0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(I0)) {
                        Drawable r0 = bkb.r0();
                        this.a = r0;
                        if (r0 instanceof wd0) {
                            stVar.setBackgroundColor(570425344);
                        } else if (r0 != null) {
                            stVar.setBackgroundColor(-1090519040);
                        } else {
                            stVar.setBackgroundColor(-11436898);
                        }
                    }
                }
                stVar.setBackgroundColor(-11436898);
            } else {
                vjb vjbVar = bkb.I.j0;
                wd0 wd0Var = (vjbVar == null || (i3 = vjbVar.d) == 0 || (i4 = vjbVar.e) == 0) ? null : new wd0(wd0.c(vjbVar.h), new int[]{i3, i4});
                this.a = wd0Var;
                if (wd0Var == null) {
                    this.a = bkb.r0();
                }
                if (this.a instanceof wd0) {
                    stVar.setBackgroundColor(570425344);
                } else {
                    stVar.setBackgroundColor(-1090519040);
                }
            }
            z2 = false;
        }
        Drawable drawable = this.a;
        if (drawable instanceof ye7) {
            ye7 ye7Var = (ye7) drawable;
            int[] iArr = ye7Var.a;
            if (z2) {
                int[] iArr2 = new int[iArr.length];
                for (int i6 = 0; i6 < iArr.length; i6++) {
                    iArr2[i6] = bkb.a(0.14f, 0.0f, iArr[i6]);
                }
                iArr = iArr2;
            }
            this.a = new ye7(iArr[0], iArr[1], iArr[2], iArr[3], false, false);
            if (ye7Var.u == null || ye7Var.q >= 0) {
                stVar.setBackgroundColor(570425344);
            } else {
                stVar.setBackgroundColor(2130706432);
            }
            ((ye7) this.a).p(stVar);
        }
        this.x.setText(k96.M0(2131754229, null));
        int i7 = gba.q;
        ImageView imageView = this.F;
        ImageView imageView2 = this.E;
        a6 a6Var = this.e;
        tv7 tv7Var = this.s;
        if (i7 == 0) {
            if (textView.getVisibility() != 0) {
                a6Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            tv7Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i7 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(kk7.M1);
            a6Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            tv7Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        tv7Var.b(false);
        if (z) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new rv7(this, i, i2, hb5Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.b0 = 1.0f;
            h(1.0f);
            ry8 ry8Var = this.N;
            ry8Var.setScaleX(1.0f);
            ry8Var.setScaleY(1.0f);
            ry8Var.i();
            ry8Var.getAnimatedDrawable().I(38, false, false);
            if (hb5Var != null) {
                hb5Var.run();
            }
        }
        setOnTouchListener(new jz1((byte) 15));
    }

    public final void n(boolean z) {
        if (this.Q || getVisibility() != 0) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.r;
        byte b = 1;
        if (!z) {
            if (gba.s > 0) {
                return;
            }
            int i = gba.q;
            tv7 tv7Var = this.s;
            String sb = i == 0 ? ((StringBuilder) tv7Var.d).toString() : i == 1 ? editTextBoldCursor.getText().toString() : "";
            int length = sb.length();
            FrameLayout frameLayout = this.b;
            pw0 pw0Var = pw0.s;
            if (length == 0) {
                pw0Var.a();
                int i2 = -this.c0;
                this.c0 = i2;
                gl.A3(i2, frameLayout, null);
                return;
            }
            if (!gba.g(sb)) {
                gba.r();
                if (gba.s > 0) {
                    d();
                }
                editTextBoldCursor.setText("");
                tv7Var.b(true);
                pw0Var.a();
                int i3 = -this.c0;
                this.c0 = i3;
                gl.A3(i3, frameLayout, null);
                Drawable drawable = this.a;
                if (drawable instanceof ye7) {
                    ye7 ye7Var = (ye7) drawable;
                    LinkedList linkedList = this.V;
                    linkedList.clear();
                    LinkedList linkedList2 = this.W;
                    linkedList2.clear();
                    yla ylaVar = this.U;
                    if (ylaVar == null || !ylaVar.f) {
                        ye7Var.m(true);
                        return;
                    } else {
                        linkedList.offer(new xe7(ye7Var, (byte) 1));
                        linkedList2.offer(Boolean.FALSE);
                        return;
                    }
                }
                return;
            }
        }
        this.Q = true;
        k();
        gba.u = 0;
        editTextBoldCursor.clearFocus();
        gl.t1(editTextBoldCursor);
        if (ige.d() && ige.a()) {
            try {
                ige.c().deleteEntry("tmessages_passcode");
            } catch (KeyStoreException e) {
                fa4.g(e, true);
            }
            ige.c = null;
            ige.b(false);
        }
        gba.w = false;
        gba.x();
        kk7.e().k(kk7.m0, new Object[0]);
        setOnTouchListener(null);
        wv7 wv7Var = this.P;
        if (wv7Var != null) {
            wv7Var.b(this);
        }
        AnimatorSet animatorSet = this.R;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.R = null;
        }
        AnimatorSet animatorSet2 = this.S;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.S = null;
        }
        ry8 ry8Var = this.N;
        ry8Var.getAnimatedDrawable().K(71);
        ry8Var.getAnimatedDrawable().I(37, false, false);
        ry8Var.d();
        gl.c3(new mv7(this, b));
    }

    public final void o(boolean z) {
        ValueAnimator valueAnimator = this.h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.g0 = z;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e.getAlpha(), z ? 1.0f : 0.0f);
        this.h0 = ofFloat;
        ofFloat.addUpdateListener(new nv7(this, (byte) 0));
        this.h0.addListener(new id4((byte) 19, this, z));
        this.h0.setInterpolator(s33.h);
        this.h0.setDuration(320L);
        this.h0.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.P1);
        kk7.e().b(this, kk7.n0);
        if (this.f0 == null && (getParent() instanceof View)) {
            this.f0 = new mv5((View) getParent(), false, new zf7(this, (byte) 8));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.Q = true;
        AnimatorSet animatorSet = this.R;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.S;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.T.cancel();
            this.T = null;
        }
        kk7.e().n(this, kk7.P1);
        kk7.e().n(this, kk7.n0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View rootView = getRootView();
        int height = (rootView.getHeight() - gl.m) - gl.o1(rootView);
        Rect rect = this.O;
        getWindowVisibleDisplayFrame(rect);
        this.H = height - (rect.bottom - rect.top);
        if (gba.q == 1 && (gl.O1() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.h;
            int intValue = frameLayout.getTag() != null ? ((Integer) frameLayout.getTag()).intValue() : 0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((intValue + layoutParams.height) - (this.H / 2)) - gl.m;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z, i, i2, i3, i4);
        TextView textView = this.x;
        int[] iArr = this.i0;
        textView.getLocationInWindow(iArr);
        boolean O1 = gl.O1();
        ry8 ry8Var = this.N;
        if (O1 || getContext().getResources().getConfiguration().orientation != 2) {
            int L = iArr[1] - gl.L(100.0f);
            this.M = L;
            ry8Var.setTranslationY(L);
        } else {
            int L2 = iArr[1] - gl.L(100.0f);
            this.M = L2;
            ry8Var.setTranslationY(L2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        int i3;
        float f2;
        float f3;
        int size = View.MeasureSpec.getSize(i);
        int i4 = gl.q.y;
        int L = gl.L(28.0f);
        int L2 = gl.L(16.0f);
        int L3 = gl.L(60.0f);
        boolean z = !gl.O1() && getContext().getResources().getConfiguration().orientation == 2;
        View view = this.G;
        if (view != null) {
            view.setVisibility(gba.q == 1 ? 0 : 8);
        }
        a6 a6Var = this.e;
        FrameLayout frameLayout = this.d;
        FrameLayout frameLayout2 = this.h;
        ry8 ry8Var = this.N;
        if (z) {
            if (gba.q == 0) {
                f2 = 29.0f;
                f3 = size / 2.0f;
            } else {
                f2 = 29.0f;
                f3 = size;
            }
            ry8Var.setTranslationX((f3 / 2.0f) - gl.L(f2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams.width = gba.q == 0 ? size / 2 : size;
            layoutParams.height = gl.L(180.0f);
            layoutParams.topMargin = ug8.D(140.0f, i4, 2) + (gba.q == 0 ? gl.L(40.0f) : 0);
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i4;
            int i5 = size / 2;
            layoutParams2.leftMargin = i5;
            layoutParams2.topMargin = gl.m;
            layoutParams2.width = i5;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) a6Var.getLayoutParams();
            layoutParams3.height = (L2 * 3) + gl.L(82.0f) + (L3 << 2);
            layoutParams3.width = (L3 * 3) + (L << 1);
            layoutParams3.gravity = 17;
            a6Var.setLayoutParams(layoutParams3);
            f = 82.0f;
        } else {
            ry8Var.setTranslationX((size / 2.0f) - gl.L(29.0f));
            int i6 = gl.m;
            if (gl.O1()) {
                if (size > gl.L(498.0f)) {
                    i3 = ug8.D(498.0f, size, 2);
                    size = gl.L(498.0f);
                } else {
                    i3 = 0;
                }
                f = 82.0f;
                if (i4 > gl.L(528.0f)) {
                    i6 = ug8.D(528.0f, i4, 2);
                    i4 = gl.L(528.0f);
                }
            } else {
                f = 82.0f;
                i3 = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams4.height = (i4 / 3) + (gba.q == 0 ? gl.L(40.0f) : 0);
            layoutParams4.width = size;
            layoutParams4.topMargin = i6;
            layoutParams4.leftMargin = i3;
            frameLayout2.setTag(Integer.valueOf(i6));
            frameLayout2.setLayoutParams(layoutParams4);
            int i7 = layoutParams4.topMargin + layoutParams4.height;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) a6Var.getLayoutParams();
            layoutParams5.height = (L2 * 3) + gl.L(f) + (L3 << 2);
            layoutParams5.width = (L3 * 3) + (L << 1);
            if (gl.O1()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            a6Var.setLayoutParams(layoutParams5);
            int i8 = i4 - layoutParams5.height;
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams6.leftMargin = i3;
            if (gl.O1()) {
                layoutParams6.topMargin = (i4 - i8) / 2;
            } else {
                layoutParams6.topMargin = i7;
            }
            layoutParams6.width = size;
            layoutParams6.height = -1;
            frameLayout.setLayoutParams(layoutParams6);
        }
        int L4 = gl.L(z ? 52.0f : f);
        int i9 = 0;
        while (i9 < 12) {
            int i10 = 10;
            if (i9 != 0) {
                i10 = i9 == 10 ? 11 : i9 == 11 ? 9 : i9 - 1;
            }
            FrameLayout frameLayout3 = (FrameLayout) this.f.get(i9);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((L3 + L2) * (i10 / 3)) + L4;
            layoutParams7.leftMargin = (L3 + L) * (i10 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
            i9++;
        }
        super.onMeasure(i, i2);
    }

    public void setDelegate(wv7 wv7Var) {
        this.P = wv7Var;
    }

    public void j() {
    }

    public void h(float f) {
    }
}
