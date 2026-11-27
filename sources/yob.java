// default package

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class yob {
    public static final xob a = new xob();
    public static int b = 1;
    public static long c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i, vnb vnbVar) {
        l(editTextBoldCursor, 34, i, vnbVar);
    }

    public static void B(View view, Drawable drawable, uob uobVar, vnb vnbVar) {
        view.setBackground(drawable);
        j(view, drawable, uobVar, null, vnbVar);
    }

    public static void C(TextView textView, int i, vnb vnbVar) {
        n(textView, 3, i, -1, 0, 0.0f, vnbVar);
    }

    public static void D(TextView textView, int i, vnb vnbVar) {
        n(textView, 1, i, -1, 0, 0.0f, vnbVar);
    }

    public static void E(EditTextBoldCursor editTextBoldCursor, int i) {
        D(editTextBoldCursor, i, null);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i, int i2, int i3, vnb vnbVar) {
        editTextBoldCursor.u(aob.v0(i, vnbVar), aob.v0(i2, vnbVar), aob.v0(i3, vnbVar));
        T(editTextBoldCursor, 31, i, vnbVar).g = editTextBoldCursor.getLineColor();
        T(editTextBoldCursor, 32, i2, vnbVar).g = editTextBoldCursor.getActiveLineColor();
        T(editTextBoldCursor, 33, i3, vnbVar).g = editTextBoldCursor.getErrorLineColor();
    }

    public static void G(TextView textView, int i, vnb vnbVar) {
        n(textView, 2, i, -1, 0, 0.0f, vnbVar);
    }

    public static void H(RecyclerView recyclerView, int i, vnb vnbVar) {
        l(recyclerView, 21, i, vnbVar);
    }

    public static void I(int i, t85 t85Var) {
        l(t85Var, 20, i, null);
    }

    public static void J(d79 d79Var, int i, vnb vnbVar) {
        l(d79Var, 20, i, vnbVar);
    }

    public static uob K(float f, int i) {
        return new uob(i, -1, f, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static xob L(boolean z, int i, HashSet hashSet) {
        xob xobVar = a;
        if (xobVar.e) {
            xobVar = new xob();
        }
        xobVar.e = true;
        xobVar.b = z;
        xobVar.c = i;
        xobVar.d = hashSet;
        xobVar.a.clear();
        return xobVar;
    }

    public static uob M(int i) {
        return new uob(i, -1, 0.0f, 0);
    }

    public static sob N(View view, int i, int i2, int i3, int i4, float f, vnb vnbVar, int i5, PorterDuffColorFilter porterDuffColorFilter) {
        sob[] sobVarArr = o(view, true).a;
        sob sobVar = sobVarArr[i];
        if (sobVar == null) {
            sobVar = new sob();
            sobVarArr[i] = sobVar;
        }
        sob sobVar2 = sobVar;
        sobVar2.c(i2, i3, i4, f, vnbVar);
        sobVar2.g = i5;
        sobVar2.i = porterDuffColorFilter;
        return sobVar2;
    }

    public static void O(RadioButton radioButton, int i, int i2, vnb vnbVar) {
        radioButton.b(aob.v0(i, vnbVar), aob.v0(i2, vnbVar));
        l(radioButton, 23, i, vnbVar);
        l(radioButton, 24, i2, vnbVar);
    }

    public static int P(int i, int i2, int i3, float f, vnb vnbVar) {
        int v0 = aob.v0(i, vnbVar);
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? v0 : rnb.b(v0) : aob.v(v0, aob.v0(i2, vnbVar)) : vm2.f(f, v0, aob.v0(i2, vnbVar)) : aob.p1(f, v0) : vm2.o(v0, (int) f);
    }

    public static void Q(View view, hf0 hf0Var, uob uobVar, uob uobVar2) {
        R(view, hf0Var, uobVar, uobVar2, null);
    }

    public static void R(View view, Drawable drawable, uob uobVar, uob uobVar2, vnb vnbVar) {
        view.setBackground(drawable);
        j(view, drawable, uobVar, uobVar2, vnbVar);
    }

    public static void S(View view, sob sobVar, int i) {
        byte b2 = sobVar.l;
        switch (b2) {
            case 1:
            case 2:
                if (view instanceof a) {
                    ((a) view).H(i, b2 == 2);
                    break;
                }
                break;
            case 3:
            case 4:
                if (view instanceof a) {
                    ((a) view).G(i, b2 == 4);
                    break;
                }
                break;
            case 5:
                if (view instanceof a) {
                    ((a) view).setTitleColor(i);
                    break;
                }
                break;
            case 6:
                if (view instanceof a) {
                    ((a) view).setSubtitleColor(i);
                    break;
                }
                break;
            default:
                switch (b2) {
                    case 20:
                        if (view instanceof d79) {
                            ((d79) view).setSelectorDrawableColor(i);
                            break;
                        }
                        break;
                    case 21:
                        if (view instanceof RecyclerView) {
                            ((RecyclerView) view).setGlowColor(i);
                            break;
                        }
                        break;
                    case 22:
                        WeakReference weakReference = sobVar.j;
                        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
                        if (drawable != null && i != sobVar.g) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                            view.invalidate();
                            break;
                        }
                        break;
                    case 23:
                        if (view instanceof RadioButton) {
                            ((RadioButton) view).setBackgroundColor(i);
                            break;
                        }
                        break;
                    case 24:
                        if (view instanceof RadioButton) {
                            ((RadioButton) view).setCheckedColor(i);
                            break;
                        }
                        break;
                    default:
                        if (view instanceof EditTextBoldCursor) {
                            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                            switch (b2) {
                                case jn7.S /* 30 */:
                                    editTextBoldCursor.setCursorColor(i);
                                    break;
                                case 31:
                                    editTextBoldCursor.setLineColor(i);
                                    break;
                                case 32:
                                    editTextBoldCursor.setActiveLineColor(i);
                                    break;
                                case 33:
                                    editTextBoldCursor.setErrorLineColor(i);
                                    break;
                                case 34:
                                    editTextBoldCursor.setHintColor(i);
                                    break;
                                case 35:
                                    editTextBoldCursor.setHeaderHintColor(i);
                                    break;
                                case 36:
                                    editTextBoldCursor.setHandlesColor(i);
                                    break;
                            }
                        }
                        break;
                }
        }
    }

    public static sob T(View view, int i, int i2, vnb vnbVar) {
        sob w = w(i, view);
        w.c(i2, -1, 0, 0.0f, vnbVar);
        w.n = null;
        w.o = null;
        w.m = true;
        return w;
    }

    public static void U(in inVar, int i, vnb vnbVar) {
        m(inVar, i, -1, 0, 0.0f, vnbVar);
    }

    public static void V(ema emaVar, int i) {
        W(emaVar, i, null);
    }

    public static void W(ema emaVar, int i, vnb vnbVar) {
        m(emaVar, i, -1, 0, 0.0f, vnbVar);
    }

    public static void X(TextView textView, int i, vnb vnbVar) {
        m(textView, i, -1, 0, 0.0f, vnbVar);
    }

    public static void Y(TextView textView, uob uobVar, vnb vnbVar) {
        m(textView, uobVar.a, uobVar.b, uobVar.c, uobVar.d, vnbVar);
    }

    public static void Z(View view, Context context, int i, int i2) {
        Drawable V0 = aob.V0(context, i, aob.v0(i2, null));
        view.setBackground(V0);
        if (V0 == null) {
            return;
        }
        sob T = T(view, 22, i2, null);
        T.j = new WeakReference(V0);
        T.g = aob.w0(null, i2, false);
    }

    public static void a(a aVar, int i, vnb vnbVar, boolean z) {
        l(aVar, z ? 4 : 3, i, vnbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x0358 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(View view) {
        int i;
        int f;
        int b2;
        boolean z;
        int b3;
        int textColor;
        int currentTextColor;
        int currentHintTextColor;
        int defaultColor;
        int color;
        a aVar;
        u5 u5Var;
        tob o = o(view, false);
        if (o != null) {
            for (int i2 = 0; i2 < 6; i2++) {
                sob sobVar = o.a[i2];
                if (sobVar != null && !sobVar.a()) {
                    int b4 = sobVar.b();
                    if (i2 != 0) {
                        if (i2 == 1) {
                            TextView textView = (TextView) view;
                            if (textView.getHintTextColors() != null && !textView.getHintTextColors().isStateful() && ((currentHintTextColor = textView.getCurrentHintTextColor()) == sobVar.g || currentHintTextColor == b4)) {
                                if (currentHintTextColor != b4) {
                                    textView.setHintTextColor(b4);
                                }
                                sobVar.g = b4;
                            }
                        } else if (i2 == 2) {
                            TextView textView2 = (TextView) view;
                            if (textView2.getLinkTextColors() != null && !textView2.getLinkTextColors().isStateful() && ((defaultColor = textView2.getLinkTextColors().getDefaultColor()) == sobVar.g || defaultColor == b4)) {
                                if (defaultColor != b4) {
                                    textView2.setLinkTextColor(b4);
                                }
                                sobVar.g = b4;
                            }
                        } else if (i2 == 3) {
                            TextView textView3 = (TextView) view;
                            int highlightColor = textView3.getHighlightColor();
                            if (highlightColor == sobVar.g || highlightColor == b4) {
                                if (highlightColor != b4) {
                                    textView3.setHighlightColor(b4);
                                }
                                sobVar.g = b4;
                            }
                        } else if (i2 != 4) {
                            if (i2 == 5) {
                                ImageView imageView = (ImageView) view;
                                if (imageView.getColorFilter() == sobVar.i) {
                                    if (b4 != sobVar.g) {
                                        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b4, sobVar.h);
                                        imageView.setColorFilter(porterDuffColorFilter);
                                        sobVar.i = porterDuffColorFilter;
                                    }
                                }
                            }
                            sobVar.g = b4;
                        } else {
                            if (view instanceof a) {
                                a aVar2 = (a) view;
                                if (aVar2.M0) {
                                    color = aVar2.getBackgroundColor();
                                    if (color != sobVar.g || color == b4) {
                                        if (color != b4) {
                                            view.setBackgroundColor(b4);
                                        }
                                        sobVar.g = b4;
                                    }
                                }
                            }
                            if ((view instanceof s6) && (aVar = ((s6) view).b) != null && aVar.M0 && (u5Var = aVar.G) != null && u5Var == view) {
                                color = u5Var == view ? aVar.x : 0;
                            } else {
                                Drawable background = view.getBackground();
                                if (background instanceof ColorDrawable) {
                                    color = ((ColorDrawable) background).getColor();
                                }
                            }
                            if (color != sobVar.g) {
                            }
                            if (color != b4) {
                            }
                            sobVar.g = b4;
                        }
                    } else if (view instanceof TextView) {
                        TextView textView4 = (TextView) view;
                        if (!textView4.getTextColors().isStateful() && ((currentTextColor = textView4.getCurrentTextColor()) == sobVar.g || currentTextColor == b4)) {
                            if (currentTextColor != b4) {
                                textView4.setTextColor(b4);
                            }
                            sobVar.g = b4;
                        }
                    } else {
                        boolean z2 = view instanceof ema;
                        if (z2) {
                            textColor = ((ema) view).getTextColor();
                        } else if (view instanceof in) {
                            textColor = ((in) view).getTextColor();
                        }
                        int i3 = textColor & 16777215;
                        if (i3 == (sobVar.g & 16777215) || i3 == (16777215 & b4)) {
                            if (textColor != b4) {
                                if (z2) {
                                    ((ema) view).setTextColor(b4);
                                } else {
                                    ((in) view).setTextColor(b4);
                                }
                            }
                            sobVar.g = b4;
                        }
                    }
                }
            }
            if (o.b != null) {
                boolean z3 = false;
                for (int i4 = 0; i4 < o.b.size(); i4++) {
                    sob sobVar2 = (sob) o.b.get(i4);
                    Drawable drawable = (Drawable) sobVar2.j.get();
                    if (drawable == null || sobVar2.a() || (!(sobVar2.k || drawable.getColorFilter() == sobVar2.i) || (b3 = sobVar2.b()) == sobVar2.g)) {
                        z = false;
                    } else {
                        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(b3, sobVar2.h);
                        drawable.setColorFilter(porterDuffColorFilter2);
                        sobVar2.i = porterDuffColorFilter2;
                        sobVar2.g = b3;
                        z = true;
                    }
                    z3 |= z;
                }
                if (z3) {
                    view.invalidate();
                }
            }
            if (o.d != null && view.getBackground() == o.d) {
                sob sobVar3 = o.e;
                if (sobVar3 != null && !sobVar3.a()) {
                    int b5 = sobVar3.b();
                    int t = t(o.d);
                    if (t == sobVar3.g || t == b5) {
                        if (t != b5) {
                            Drawable drawable2 = o.d;
                            Drawable drawable3 = drawable2 instanceof InsetDrawable ? ((InsetDrawable) drawable2).getDrawable() : drawable2;
                            if (drawable3 instanceof RippleDrawable) {
                                RippleDrawable rippleDrawable = (RippleDrawable) drawable3;
                                drawable3 = (rippleDrawable.getNumberOfLayers() <= 0 || rippleDrawable.getId(0) == 16908334) ? null : rippleDrawable.getDrawable(0);
                            }
                            if (drawable3 instanceof ShapeDrawable) {
                                ((ShapeDrawable) drawable3).getPaint().setColor(b5);
                                drawable2.invalidateSelf();
                            } else if (drawable3 instanceof ColorDrawable) {
                                ((ColorDrawable) drawable3).setColor(b5);
                            }
                        }
                        sobVar3.g = b5;
                    }
                }
                sob sobVar4 = o.f;
                if (sobVar4 != null && !sobVar4.a() && (o.d instanceof RippleDrawable) && (b2 = sobVar4.b()) != sobVar4.g) {
                    ((RippleDrawable) o.d).setColor(ColorStateList.valueOf(b2));
                    sobVar4.g = b2;
                }
            }
            if (o.c != null) {
                for (int i5 = 0; i5 < o.c.size(); i5++) {
                    sob sobVar5 = (sob) o.c.get(i5);
                    if (!sobVar5.a()) {
                        int b6 = sobVar5.b();
                        if (sobVar5.m) {
                            byte b7 = sobVar5.l;
                            switch (b7) {
                                case 1:
                                    if (view instanceof a) {
                                        f = ((a) view).s0;
                                        break;
                                    } else {
                                        i = sobVar5.g;
                                        f = ~i;
                                        break;
                                    }
                                case 2:
                                    if (view instanceof a) {
                                        f = ((a) view).t0;
                                        break;
                                    } else {
                                        i = sobVar5.g;
                                        f = ~i;
                                        break;
                                    }
                                case 3:
                                    if (view instanceof a) {
                                        f = ((a) view).q0;
                                        break;
                                    } else {
                                        i = sobVar5.g;
                                        f = ~i;
                                        break;
                                    }
                                case 4:
                                    if (view instanceof a) {
                                        f = ((a) view).r0;
                                        break;
                                    } else {
                                        i = sobVar5.g;
                                        f = ~i;
                                        break;
                                    }
                                case 5:
                                    if (view instanceof a) {
                                        f = ((a) view).getTitleColorToSet();
                                        break;
                                    } else {
                                        i = sobVar5.g;
                                        f = ~i;
                                        break;
                                    }
                                case 6:
                                    if (view instanceof a) {
                                        f = ((a) view).getSubtitleColorInternal();
                                        break;
                                    } else {
                                        i = sobVar5.g;
                                        f = ~i;
                                        break;
                                    }
                                default:
                                    switch (b7) {
                                        case 20:
                                            if (view instanceof d79) {
                                                f = ((d79) view).getSelectorDrawableColor();
                                                break;
                                            } else {
                                                i = sobVar5.g;
                                                f = ~i;
                                                break;
                                            }
                                        case 21:
                                            if (view instanceof RecyclerView) {
                                                f = ((RecyclerView) view).getGlowColor();
                                                break;
                                            } else {
                                                i = sobVar5.g;
                                                f = ~i;
                                                break;
                                            }
                                        case 22:
                                            WeakReference weakReference = sobVar5.j;
                                            Drawable drawable4 = weakReference != null ? (Drawable) weakReference.get() : null;
                                            if (drawable4 == null || view.getBackground() != drawable4) {
                                                i = sobVar5.g;
                                                f = ~i;
                                                break;
                                            } else {
                                                f = sobVar5.g;
                                                break;
                                            }
                                            break;
                                        case 23:
                                            if (view instanceof RadioButton) {
                                                f = ((RadioButton) view).getColor();
                                                break;
                                            } else {
                                                i = sobVar5.g;
                                                f = ~i;
                                                break;
                                            }
                                        case 24:
                                            if (view instanceof RadioButton) {
                                                f = ((RadioButton) view).getCheckedColor();
                                                break;
                                            } else {
                                                i = sobVar5.g;
                                                f = ~i;
                                                break;
                                            }
                                        default:
                                            if (view instanceof EditTextBoldCursor) {
                                                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                                                switch (b7) {
                                                    case jn7.S /* 30 */:
                                                        f = editTextBoldCursor.getCursorColor();
                                                        break;
                                                    case 31:
                                                        f = editTextBoldCursor.getLineColor();
                                                        break;
                                                    case 32:
                                                        f = editTextBoldCursor.getActiveLineColor();
                                                        break;
                                                    case 33:
                                                        f = editTextBoldCursor.getErrorLineColor();
                                                        break;
                                                    case 34:
                                                        f = editTextBoldCursor.getHintColor();
                                                        break;
                                                    case 35:
                                                        f = editTextBoldCursor.getHeaderHintColor();
                                                        break;
                                                    case 36:
                                                        f = editTextBoldCursor.getHandlesColor();
                                                        break;
                                                }
                                            }
                                            i = sobVar5.g;
                                            f = ~i;
                                            break;
                                    }
                            }
                            if (f != sobVar5.g || f == b6) {
                                if (f != b6) {
                                    if (sobVar5.m) {
                                        S(view, sobVar5, b6);
                                    } else {
                                        wob wobVar = sobVar5.o;
                                        if (wobVar != null) {
                                            wobVar.e(b6, view);
                                        }
                                    }
                                }
                                sobVar5.g = b6;
                            }
                        } else {
                            vob vobVar = sobVar5.n;
                            if (vobVar != null) {
                                f = vobVar.f(view);
                                if (f != sobVar5.g) {
                                }
                                if (f != b6) {
                                }
                                sobVar5.g = b6;
                            } else {
                                i = sobVar5.g;
                                f = ~i;
                                if (f != sobVar5.g) {
                                }
                                if (f != b6) {
                                }
                                sobVar5.g = b6;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void b(a aVar, int i, vnb vnbVar, boolean z) {
        l(aVar, z ? 2 : 1, i, vnbVar);
    }

    public static void b0(ActionBarLayout actionBarLayout, boolean z) {
        b++;
        xob L = L(z, 0, null);
        try {
            List j = hl.j();
            if (j == null) {
                j = new ArrayList();
            }
            for (int i = 0; i < j.size(); i++) {
                L.b((View) j.get(i));
            }
            L.b(actionBarLayout);
        } finally {
            L.a();
        }
    }

    public static void c(e85 e85Var, int i) {
        l(e85Var, 5, i, null);
    }

    public static void c0(FrameLayout frameLayout, boolean z) {
        xob L = L(z, 0, null);
        try {
            L.b(frameLayout);
        } finally {
            L.a();
        }
    }

    public static void d(a aVar, int i, vnb vnbVar) {
        l(aVar, 5, i, vnbVar);
    }

    public static uob e(int i) {
        return new uob(i, -1, 0.0f, 5);
    }

    public static void f(sob sobVar, HashSet hashSet) {
        hashSet.add(Integer.valueOf(sobVar.a));
        int i = sobVar.b;
        if (i >= 0) {
            hashSet.add(Integer.valueOf(i));
        }
    }

    public static uob g(int i, int i2) {
        return new uob(i, -1, i2, 1);
    }

    public static void h(int i, vnb vnbVar, View view) {
        int P = P(i, -1, 0, 0.0f, vnbVar);
        view.setBackgroundColor(P);
        N(view, 4, i, -1, 0, 0.0f, vnbVar, P, null);
    }

    public static void i(View view, uob uobVar, vnb vnbVar) {
        int i = uobVar.a;
        int i2 = uobVar.b;
        byte b2 = uobVar.c;
        float f = uobVar.d;
        int P = P(i, i2, b2, f, vnbVar);
        view.setBackgroundColor(P);
        N(view, 4, i, i2, b2, f, vnbVar, P, null);
    }

    public static void j(View view, Drawable drawable, uob uobVar, uob uobVar2, vnb vnbVar) {
        tob o = o(view, true);
        o.d = drawable;
        o.e = null;
        o.f = null;
        if (drawable != null) {
            if (uobVar != null) {
                sob sobVar = new sob();
                o.e = sobVar;
                sobVar.c(uobVar.a, uobVar.b, uobVar.c, uobVar.d, vnbVar);
                sobVar.g = t(drawable);
            }
            if (uobVar2 != null) {
                sob sobVar2 = new sob();
                o.f = sobVar2;
                sobVar2.c(uobVar2.a, uobVar2.b, uobVar2.c, uobVar2.d, vnbVar);
                sobVar2.g = sobVar2.b();
            }
        }
    }

    public static void k(View view, Drawable drawable, int i, int i2, int i3, float f, vnb vnbVar, PorterDuff.Mode mode) {
        int P = P(i, i2, i3, f, vnbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        tob o = o(view, true);
        ArrayList arrayList = o.b;
        if (arrayList == null) {
            arrayList = new ArrayList(2);
            o.b = arrayList;
        }
        sob sobVar = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sob sobVar2 = (sob) o.b.get(size);
            Drawable drawable2 = (Drawable) sobVar2.j.get();
            if (drawable2 == drawable) {
                sobVar = sobVar2;
            } else if (drawable2 == null || (!sobVar2.k && drawable2.getColorFilter() != sobVar2.i)) {
                o.b.remove(size);
            }
        }
        if (sobVar == null) {
            sobVar = new sob();
            sobVar.j = new WeakReference(drawable);
            o.b.add(sobVar);
        }
        sob sobVar3 = sobVar;
        sobVar3.c(i, i2, i3, f, vnbVar);
        sobVar3.g = P;
        sobVar3.i = porterDuffColorFilter;
        sobVar3.h = mode;
        sobVar3.k = drawable.getColorFilter() != porterDuffColorFilter;
    }

    public static void l(View view, int i, int i2, vnb vnbVar) {
        sob T = T(view, i, i2, vnbVar);
        int b2 = T.b();
        S(view, T, b2);
        T.g = b2;
    }

    public static void m(View view, int i, int i2, int i3, float f, vnb vnbVar) {
        int P = P(i, i2, i3, f, vnbVar);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(P);
        } else if (view instanceof ema) {
            ((ema) view).setTextColor(P);
        } else {
            ((in) view).setTextColor(P);
        }
        N(view, 0, i, i2, i3, f, vnbVar, P, null);
    }

    public static void n(TextView textView, int i, int i2, int i3, int i4, float f, vnb vnbVar) {
        int P = P(i2, i3, i4, f, vnbVar);
        if (i == 1) {
            textView.setHintTextColor(P);
        } else if (i == 2) {
            textView.setLinkTextColor(P);
        } else if (i == 3) {
            textView.setHighlightColor(P);
        }
        N(textView, i, i2, i3, i4, f, vnbVar, P, null);
    }

    public static tob o(View view, boolean z) {
        Object tag = view.getTag(R.id.theme_bind);
        if (tag instanceof tob) {
            return (tob) tag;
        }
        if (!z) {
            return null;
        }
        tob tobVar = new tob();
        view.setTag(R.id.theme_bind, tobVar);
        return tobVar;
    }

    public static uob p(int i, int i2) {
        return new uob(i, i2, 0.0f, 4);
    }

    public static void q(View view) {
        if (view != null) {
            view.setTag(R.id.theme_bind, null);
        }
    }

    public static HashSet r() {
        HashSet hashSet = new HashSet();
        xob L = L(true, 1, hashSet);
        try {
            List j = hl.j();
            if (j == null) {
                j = new ArrayList();
            }
            for (int i = 0; i < j.size(); i++) {
                L.b((View) j.get(i));
            }
            return hashSet;
        } finally {
            L.a();
        }
    }

    public static void s(ImageView imageView, int i, vnb vnbVar, PorterDuff.Mode mode) {
        int P = P(i, -1, 0, 0.0f, vnbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        N(imageView, 5, i, -1, 0, 0.0f, vnbVar, P, porterDuffColorFilter).h = mode;
    }

    public static int t(Drawable drawable) {
        if (drawable instanceof InsetDrawable) {
            drawable = ((InsetDrawable) drawable).getDrawable();
        }
        if (drawable instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            drawable = (rippleDrawable.getNumberOfLayers() <= 0 || rippleDrawable.getId(0) == 16908334) ? null : rippleDrawable.getDrawable(0);
        }
        if (drawable instanceof ShapeDrawable) {
            return ((ShapeDrawable) drawable).getPaint().getColor();
        }
        if (drawable instanceof ColorDrawable) {
            return ((ColorDrawable) drawable).getColor();
        }
        return 0;
    }

    public static void u(EditTextBoldCursor editTextBoldCursor, int i) {
        v(editTextBoldCursor, i, null);
    }

    public static void v(EditTextBoldCursor editTextBoldCursor, int i, vnb vnbVar) {
        l(editTextBoldCursor, 30, i, vnbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static sob w(int i, View view) {
        tob o = o(view, true);
        if (o.c == null) {
            o.c = new ArrayList(2);
        }
        for (int i2 = 0; i2 < o.c.size(); i2++) {
            if (((sob) o.c.get(i2)).l == i) {
                return (sob) o.c.get(i2);
            }
        }
        sob sobVar = new sob();
        sobVar.l = i;
        o.c.add(sobVar);
        return sobVar;
    }

    public static void x(View view, Drawable drawable, int i, vnb vnbVar, PorterDuff.Mode mode) {
        k(view, drawable, i, -1, 0, 0.0f, vnbVar, mode);
    }

    public static void y(EditTextBoldCursor editTextBoldCursor, int i, vnb vnbVar) {
        l(editTextBoldCursor, 36, i, vnbVar);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i, vnb vnbVar) {
        l(editTextBoldCursor, 35, i, vnbVar);
    }
}
