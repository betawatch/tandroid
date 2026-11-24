// default package

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pr {
    public final TextView a;
    public s34 b;
    public s34 c;
    public s34 d;
    public s34 e;
    public s34 f;
    public s34 g;
    public s34 h;
    public final zr i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public pr(TextView textView) {
        this.a = textView;
        this.i = new zr(textView);
    }

    public static s34 c(Context context, fq fqVar, int i) {
        ColorStateList i2;
        synchronized (fqVar) {
            i2 = fqVar.a.i(context, i);
        }
        if (i2 == null) {
            return null;
        }
        s34 s34Var = new s34();
        s34Var.b = true;
        s34Var.c = i2;
        return s34Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            via.u(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            via.u(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        if (i2 <= i3) {
            i3 = i2;
            i2 = i3;
        }
        int length = text.length();
        if (i3 < 0 || i2 > length) {
            lv3.c(editorInfo, null, 0, 0);
            return;
        }
        int i4 = editorInfo.inputType & 4095;
        if (i4 == 129 || i4 == 225 || i4 == 18) {
            lv3.c(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            lv3.c(editorInfo, text, i3, i2);
            return;
        }
        int i5 = i2 - i3;
        int i6 = i5 > 1024 ? 0 : i5;
        int i7 = 2048 - i6;
        int min = Math.min(text.length() - i2, i7 - Math.min(i3, (int) (i7 * 0.8d)));
        int min2 = Math.min(i3, i7 - min);
        int i8 = i3 - min2;
        if (Character.isLowSurrogate(text.charAt(i8))) {
            i8++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + min) - 1))) {
            min--;
        }
        int i9 = min2 + i6;
        lv3.c(editorInfo, i6 != i5 ? TextUtils.concat(text.subSequence(i8, i8 + min2), text.subSequence(i2, min + i2)) : text.subSequence(i8, i9 + min + i8), min2, i9);
    }

    public final void a(Drawable drawable, s34 s34Var) {
        if (drawable == null || s34Var == null) {
            return;
        }
        int[] drawableState = this.a.getDrawableState();
        PorterDuff.Mode mode = fq.b;
        hc9.n(drawable, s34Var, drawableState);
    }

    public final void b() {
        s34 s34Var = this.b;
        TextView textView = this.a;
        if (s34Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] a = kr.a(textView);
        a(a[0], this.f);
        a(a[2], this.g);
    }

    public final ColorStateList d() {
        s34 s34Var = this.h;
        if (s34Var != null) {
            return (ColorStateList) s34Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        s34 s34Var = this.h;
        if (s34Var != null) {
            return (PorterDuff.Mode) s34Var.d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        ColorStateList colorStateList;
        int resourceId;
        int i2;
        int resourceId2;
        TextView textView = this.a;
        Context context = textView.getContext();
        fq a = fq.a();
        int[] iArr = k09.h;
        wm9 v = wm9.v(context, attributeSet, iArr, i);
        kfc.j(textView, textView.getContext(), iArr, attributeSet, (TypedArray) v.c, i);
        TypedArray typedArray = (TypedArray) v.c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, a, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, a, typedArray.getResourceId(6, 0));
        }
        v.y();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = k09.w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            wm9 wm9Var = new wm9(context, obtainStyledAttributes);
            if (z3 || !obtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = obtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            n(context, wm9Var);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (Build.VERSION.SDK_INT < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            wm9Var.y();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        wm9 wm9Var2 = new wm9(context, obtainStyledAttributes2);
        if (!z3 && obtainStyledAttributes2.hasValue(14)) {
            z2 = obtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        String str3 = str2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i3 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, wm9Var2);
        wm9Var2.y();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            nr.d(textView, str);
        }
        if (str3 != null) {
            if (i3 >= 24) {
                mr.b(textView, mr.a(str3));
            } else {
                kr.c(textView, lr.a(str3.split(",")[0]));
            }
        }
        zr zrVar = this.i;
        Context context2 = zrVar.j;
        int[] iArr3 = k09.i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = zrVar.i;
        kfc.j(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            zrVar.a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr4[i4] = obtainTypedArray.getDimensionPixelSize(i4, -1);
                }
                zrVar.f = zr.b(iArr4);
                zrVar.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!zrVar.j()) {
            zrVar.a = 0;
        } else if (zrVar.a == 1) {
            if (!zrVar.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i2 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i2 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                zrVar.k(dimension2, dimension3, dimension);
            }
            zrVar.h();
        }
        if (ghc.b && zrVar.a != 0) {
            int[] iArr5 = zrVar.f;
            if (iArr5.length > 0) {
                if (nr.a(textView) != -1.0f) {
                    nr.b(textView, Math.round(zrVar.d), Math.round(zrVar.e), Math.round(zrVar.c), 0);
                } else {
                    nr.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b = resourceId4 != -1 ? a.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b2 = resourceId5 != -1 ? a.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b3 = resourceId6 != -1 ? a.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b4 = resourceId7 != -1 ? a.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b5 = resourceId8 != -1 ? a.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b6 = resourceId9 != -1 ? a.b(context, resourceId9) : null;
        if (b5 != null || b6 != null) {
            Drawable[] a2 = kr.a(textView);
            if (b5 == null) {
                b5 = a2[0];
            }
            if (b2 == null) {
                b2 = a2[1];
            }
            if (b6 == null) {
                b6 = a2[2];
            }
            if (b4 == null) {
                b4 = a2[3];
            }
            kr.b(textView, b5, b2, b6, b4);
        } else if (b != null || b2 != null || b3 != null || b4 != null) {
            Drawable[] a3 = kr.a(textView);
            Drawable drawable = a3[0];
            if (drawable == null && a3[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b == null) {
                    b = compoundDrawables[0];
                }
                if (b2 == null) {
                    b2 = compoundDrawables[1];
                }
                if (b3 == null) {
                    b3 = compoundDrawables[2];
                }
                if (b4 == null) {
                    b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, b4);
            } else {
                if (b2 == null) {
                    b2 = a3[1];
                }
                Drawable drawable2 = a3[2];
                if (b4 == null) {
                    b4 = a3[3];
                }
                kr.b(textView, drawable, b2, drawable2, b4);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = rs.e(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintList(colorStateList);
            } else if (textView instanceof arb) {
                ((arb) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode b7 = vr3.b(obtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintMode(b7);
            } else if (textView instanceof arb) {
                ((arb) textView).setSupportCompoundDrawablesTintMode(b7);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            mxe.b(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            mxe.c(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            if (dimensionPixelSize3 < 0) {
                i98.g();
                return;
            }
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r0, 1.0f);
            }
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, k09.w);
        wm9 wm9Var = new wm9(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, wm9Var);
        if (Build.VERSION.SDK_INT >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            nr.d(textView, string);
        }
        wm9Var.y();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        zr zrVar = this.i;
        if (zrVar.j()) {
            DisplayMetrics displayMetrics = zrVar.j.getResources().getDisplayMetrics();
            zrVar.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (zrVar.h()) {
                zrVar.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        zr zrVar = this.i;
        if (zrVar.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = zrVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                zrVar.f = zr.b(iArr2);
                if (!zrVar.i()) {
                    a32.e(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                zrVar.g = false;
            }
            if (zrVar.h()) {
                zrVar.a();
            }
        }
    }

    public final void k(int i) {
        zr zrVar = this.i;
        if (zrVar.j()) {
            if (i == 0) {
                zrVar.a = 0;
                zrVar.d = -1.0f;
                zrVar.e = -1.0f;
                zrVar.c = -1.0f;
                zrVar.f = new int[0];
                zrVar.b = false;
                return;
            }
            if (i != 1) {
                u36.j(hg9.j(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = zrVar.j.getResources().getDisplayMetrics();
            zrVar.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (zrVar.h()) {
                zrVar.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        s34 s34Var = this.h;
        if (s34Var == null) {
            s34Var = new s34();
            this.h = s34Var;
        }
        s34 s34Var2 = s34Var;
        s34Var.c = colorStateList;
        s34Var.b = colorStateList != null;
        this.b = s34Var2;
        this.c = s34Var2;
        this.d = s34Var2;
        this.e = s34Var2;
        this.f = s34Var2;
        this.g = s34Var2;
    }

    public final void m(PorterDuff.Mode mode) {
        s34 s34Var = this.h;
        if (s34Var == null) {
            s34Var = new s34();
            this.h = s34Var;
        }
        s34 s34Var2 = s34Var;
        s34Var.d = mode;
        s34Var.a = mode != null;
        this.b = s34Var2;
        this.c = s34Var2;
        this.d = s34Var2;
        this.e = s34Var2;
        this.f = s34Var2;
        this.g = s34Var2;
    }

    public final void n(Context context, wm9 wm9Var) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) wm9Var.c;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 == 3) {
                        this.l = Typeface.MONOSPACE;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            WeakReference weakReference = new WeakReference(this.a);
            ir irVar = new ir();
            irVar.d = this;
            irVar.a = i6;
            irVar.b = i7;
            irVar.c = weakReference;
            try {
                Typeface r = wm9Var.r(i5, this.j, irVar);
                if (r != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = r;
                    } else {
                        this.l = or.a(Typeface.create(r, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = or.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
