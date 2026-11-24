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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class zkb {
    public static final ykb a = new ykb();
    public static int b = 1;
    public static long c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i, wjb wjbVar) {
        l(editTextBoldCursor, 34, i, wjbVar);
    }

    public static void B(View view, Drawable drawable, vkb vkbVar, wjb wjbVar) {
        view.setBackground(drawable);
        j(view, drawable, vkbVar, null, wjbVar);
    }

    public static void C(TextView textView, int i, wjb wjbVar) {
        n(textView, 3, i, -1, 0, 0.0f, wjbVar);
    }

    public static void D(TextView textView, int i, wjb wjbVar) {
        n(textView, 1, i, -1, 0, 0.0f, wjbVar);
    }

    public static void E(EditTextBoldCursor editTextBoldCursor, int i) {
        D(editTextBoldCursor, i, null);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i, int i2, int i3, wjb wjbVar) {
        editTextBoldCursor.u(bkb.v0(i, wjbVar), bkb.v0(i2, wjbVar), bkb.v0(i3, wjbVar));
        T(editTextBoldCursor, 31, i, wjbVar).g = editTextBoldCursor.getLineColor();
        T(editTextBoldCursor, 32, i2, wjbVar).g = editTextBoldCursor.getActiveLineColor();
        T(editTextBoldCursor, 33, i3, wjbVar).g = editTextBoldCursor.getErrorLineColor();
    }

    public static void G(TextView textView, int i, wjb wjbVar) {
        n(textView, 2, i, -1, 0, 0.0f, wjbVar);
    }

    public static void H(RecyclerView recyclerView, int i, wjb wjbVar) {
        l(recyclerView, 21, i, wjbVar);
    }

    public static void I(int i, r65 r65Var) {
        l(r65Var, 20, i, null);
    }

    public static void J(o39 o39Var, int i, wjb wjbVar) {
        l(o39Var, 20, i, wjbVar);
    }

    public static vkb K(float f, int i) {
        return new vkb(i, -1, f, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ykb L(boolean z, int i, HashSet hashSet) {
        ykb ykbVar = a;
        if (ykbVar.e) {
            ykbVar = new ykb();
        }
        ykbVar.e = true;
        ykbVar.b = z;
        ykbVar.c = i;
        ykbVar.d = hashSet;
        ykbVar.a.clear();
        return ykbVar;
    }

    public static vkb M(int i) {
        return new vkb(i, -1, 0.0f, 0);
    }

    public static tkb N(View view, int i, int i2, int i3, int i4, float f, wjb wjbVar, int i5, PorterDuffColorFilter porterDuffColorFilter) {
        tkb[] tkbVarArr = o(view, true).a;
        tkb tkbVar = tkbVarArr[i];
        if (tkbVar == null) {
            tkbVar = new tkb();
            tkbVarArr[i] = tkbVar;
        }
        tkb tkbVar2 = tkbVar;
        tkbVar2.c(i2, i3, i4, f, wjbVar);
        tkbVar2.g = i5;
        tkbVar2.i = porterDuffColorFilter;
        return tkbVar2;
    }

    public static void O(RadioButton radioButton, int i, int i2, wjb wjbVar) {
        radioButton.b(bkb.v0(i, wjbVar), bkb.v0(i2, wjbVar));
        l(radioButton, 23, i, wjbVar);
        l(radioButton, 24, i2, wjbVar);
    }

    public static int P(int i, int i2, int i3, float f, wjb wjbVar) {
        int v0 = bkb.v0(i, wjbVar);
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? v0 : sjb.b(v0) : bkb.v(v0, bkb.v0(i2, wjbVar)) : bm2.f(f, v0, bkb.v0(i2, wjbVar)) : bkb.p1(f, v0) : bm2.o(v0, (int) f);
    }

    public static void Q(View view, ff0 ff0Var, vkb vkbVar, vkb vkbVar2) {
        R(view, ff0Var, vkbVar, vkbVar2, null);
    }

    public static void R(View view, Drawable drawable, vkb vkbVar, vkb vkbVar2, wjb wjbVar) {
        view.setBackground(drawable);
        j(view, drawable, vkbVar, vkbVar2, wjbVar);
    }

    public static void S(View view, tkb tkbVar, int i) {
        byte b2 = tkbVar.l;
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
                        if (view instanceof o39) {
                            ((o39) view).setSelectorDrawableColor(i);
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
                        WeakReference weakReference = tkbVar.j;
                        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
                        if (drawable != null && i != tkbVar.g) {
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
                                case kk7.S /* 30 */:
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

    public static tkb T(View view, int i, int i2, wjb wjbVar) {
        tkb w = w(i, view);
        w.c(i2, -1, 0, 0.0f, wjbVar);
        w.n = null;
        w.o = null;
        w.m = true;
        return w;
    }

    public static void U(hn hnVar, int i, wjb wjbVar) {
        m(hnVar, i, -1, 0, 0.0f, wjbVar);
    }

    public static void V(jia jiaVar, int i) {
        W(jiaVar, i, null);
    }

    public static void W(jia jiaVar, int i, wjb wjbVar) {
        m(jiaVar, i, -1, 0, 0.0f, wjbVar);
    }

    public static void X(TextView textView, int i, wjb wjbVar) {
        m(textView, i, -1, 0, 0.0f, wjbVar);
    }

    public static void Y(TextView textView, vkb vkbVar, wjb wjbVar) {
        m(textView, vkbVar.a, vkbVar.b, vkbVar.c, vkbVar.d, wjbVar);
    }

    public static void Z(View view, Context context, int i, int i2) {
        Drawable V0 = bkb.V0(context, i, bkb.v0(i2, null));
        view.setBackground(V0);
        if (V0 == null) {
            return;
        }
        tkb T = T(view, 22, i2, null);
        T.j = new WeakReference(V0);
        T.g = bkb.w0(null, i2, false);
    }

    public static void a(a aVar, int i, wjb wjbVar, boolean z) {
        l(aVar, z ? 4 : 3, i, wjbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x0358 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(View view) {
        int i;
        int e;
        int b2;
        boolean z;
        int b3;
        int textColor;
        int currentTextColor;
        int currentHintTextColor;
        int defaultColor;
        int color;
        a aVar;
        t5 t5Var;
        ukb o = o(view, false);
        if (o != null) {
            for (int i2 = 0; i2 < 6; i2++) {
                tkb tkbVar = o.a[i2];
                if (tkbVar != null && !tkbVar.a()) {
                    int b4 = tkbVar.b();
                    if (i2 != 0) {
                        if (i2 == 1) {
                            TextView textView = (TextView) view;
                            if (textView.getHintTextColors() != null && !textView.getHintTextColors().isStateful() && ((currentHintTextColor = textView.getCurrentHintTextColor()) == tkbVar.g || currentHintTextColor == b4)) {
                                if (currentHintTextColor != b4) {
                                    textView.setHintTextColor(b4);
                                }
                                tkbVar.g = b4;
                            }
                        } else if (i2 == 2) {
                            TextView textView2 = (TextView) view;
                            if (textView2.getLinkTextColors() != null && !textView2.getLinkTextColors().isStateful() && ((defaultColor = textView2.getLinkTextColors().getDefaultColor()) == tkbVar.g || defaultColor == b4)) {
                                if (defaultColor != b4) {
                                    textView2.setLinkTextColor(b4);
                                }
                                tkbVar.g = b4;
                            }
                        } else if (i2 == 3) {
                            TextView textView3 = (TextView) view;
                            int highlightColor = textView3.getHighlightColor();
                            if (highlightColor == tkbVar.g || highlightColor == b4) {
                                if (highlightColor != b4) {
                                    textView3.setHighlightColor(b4);
                                }
                                tkbVar.g = b4;
                            }
                        } else if (i2 != 4) {
                            if (i2 == 5) {
                                ImageView imageView = (ImageView) view;
                                if (imageView.getColorFilter() == tkbVar.i) {
                                    if (b4 != tkbVar.g) {
                                        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b4, tkbVar.h);
                                        imageView.setColorFilter(porterDuffColorFilter);
                                        tkbVar.i = porterDuffColorFilter;
                                    }
                                }
                            }
                            tkbVar.g = b4;
                        } else {
                            if (view instanceof a) {
                                a aVar2 = (a) view;
                                if (aVar2.M0) {
                                    color = aVar2.getBackgroundColor();
                                    if (color != tkbVar.g || color == b4) {
                                        if (color != b4) {
                                            view.setBackgroundColor(b4);
                                        }
                                        tkbVar.g = b4;
                                    }
                                }
                            }
                            if ((view instanceof r6) && (aVar = ((r6) view).b) != null && aVar.M0 && (t5Var = aVar.G) != null && t5Var == view) {
                                color = t5Var == view ? aVar.x : 0;
                            } else {
                                Drawable background = view.getBackground();
                                if (background instanceof ColorDrawable) {
                                    color = ((ColorDrawable) background).getColor();
                                }
                            }
                            if (color != tkbVar.g) {
                            }
                            if (color != b4) {
                            }
                            tkbVar.g = b4;
                        }
                    } else if (view instanceof TextView) {
                        TextView textView4 = (TextView) view;
                        if (!textView4.getTextColors().isStateful() && ((currentTextColor = textView4.getCurrentTextColor()) == tkbVar.g || currentTextColor == b4)) {
                            if (currentTextColor != b4) {
                                textView4.setTextColor(b4);
                            }
                            tkbVar.g = b4;
                        }
                    } else {
                        boolean z2 = view instanceof jia;
                        if (z2) {
                            textColor = ((jia) view).getTextColor();
                        } else if (view instanceof hn) {
                            textColor = ((hn) view).getTextColor();
                        }
                        int i3 = textColor & 16777215;
                        if (i3 == (tkbVar.g & 16777215) || i3 == (16777215 & b4)) {
                            if (textColor != b4) {
                                if (z2) {
                                    ((jia) view).setTextColor(b4);
                                } else {
                                    ((hn) view).setTextColor(b4);
                                }
                            }
                            tkbVar.g = b4;
                        }
                    }
                }
            }
            if (o.b != null) {
                boolean z3 = false;
                for (int i4 = 0; i4 < o.b.size(); i4++) {
                    tkb tkbVar2 = (tkb) o.b.get(i4);
                    Drawable drawable = (Drawable) tkbVar2.j.get();
                    if (drawable == null || tkbVar2.a() || (!(tkbVar2.k || drawable.getColorFilter() == tkbVar2.i) || (b3 = tkbVar2.b()) == tkbVar2.g)) {
                        z = false;
                    } else {
                        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(b3, tkbVar2.h);
                        drawable.setColorFilter(porterDuffColorFilter2);
                        tkbVar2.i = porterDuffColorFilter2;
                        tkbVar2.g = b3;
                        z = true;
                    }
                    z3 |= z;
                }
                if (z3) {
                    view.invalidate();
                }
            }
            if (o.d != null && view.getBackground() == o.d) {
                tkb tkbVar3 = o.e;
                if (tkbVar3 != null && !tkbVar3.a()) {
                    int b5 = tkbVar3.b();
                    int t = t(o.d);
                    if (t == tkbVar3.g || t == b5) {
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
                        tkbVar3.g = b5;
                    }
                }
                tkb tkbVar4 = o.f;
                if (tkbVar4 != null && !tkbVar4.a() && (o.d instanceof RippleDrawable) && (b2 = tkbVar4.b()) != tkbVar4.g) {
                    ((RippleDrawable) o.d).setColor(ColorStateList.valueOf(b2));
                    tkbVar4.g = b2;
                }
            }
            if (o.c != null) {
                for (int i5 = 0; i5 < o.c.size(); i5++) {
                    tkb tkbVar5 = (tkb) o.c.get(i5);
                    if (!tkbVar5.a()) {
                        int b6 = tkbVar5.b();
                        if (tkbVar5.m) {
                            byte b7 = tkbVar5.l;
                            switch (b7) {
                                case 1:
                                    if (view instanceof a) {
                                        e = ((a) view).s0;
                                        break;
                                    } else {
                                        i = tkbVar5.g;
                                        e = ~i;
                                        break;
                                    }
                                case 2:
                                    if (view instanceof a) {
                                        e = ((a) view).t0;
                                        break;
                                    } else {
                                        i = tkbVar5.g;
                                        e = ~i;
                                        break;
                                    }
                                case 3:
                                    if (view instanceof a) {
                                        e = ((a) view).q0;
                                        break;
                                    } else {
                                        i = tkbVar5.g;
                                        e = ~i;
                                        break;
                                    }
                                case 4:
                                    if (view instanceof a) {
                                        e = ((a) view).r0;
                                        break;
                                    } else {
                                        i = tkbVar5.g;
                                        e = ~i;
                                        break;
                                    }
                                case 5:
                                    if (view instanceof a) {
                                        e = ((a) view).getTitleColorToSet();
                                        break;
                                    } else {
                                        i = tkbVar5.g;
                                        e = ~i;
                                        break;
                                    }
                                case 6:
                                    if (view instanceof a) {
                                        e = ((a) view).getSubtitleColorInternal();
                                        break;
                                    } else {
                                        i = tkbVar5.g;
                                        e = ~i;
                                        break;
                                    }
                                default:
                                    switch (b7) {
                                        case 20:
                                            if (view instanceof o39) {
                                                e = ((o39) view).getSelectorDrawableColor();
                                                break;
                                            } else {
                                                i = tkbVar5.g;
                                                e = ~i;
                                                break;
                                            }
                                        case 21:
                                            if (view instanceof RecyclerView) {
                                                e = ((RecyclerView) view).getGlowColor();
                                                break;
                                            } else {
                                                i = tkbVar5.g;
                                                e = ~i;
                                                break;
                                            }
                                        case 22:
                                            WeakReference weakReference = tkbVar5.j;
                                            Drawable drawable4 = weakReference != null ? (Drawable) weakReference.get() : null;
                                            if (drawable4 == null || view.getBackground() != drawable4) {
                                                i = tkbVar5.g;
                                                e = ~i;
                                                break;
                                            } else {
                                                e = tkbVar5.g;
                                                break;
                                            }
                                            break;
                                        case 23:
                                            if (view instanceof RadioButton) {
                                                e = ((RadioButton) view).getColor();
                                                break;
                                            } else {
                                                i = tkbVar5.g;
                                                e = ~i;
                                                break;
                                            }
                                        case 24:
                                            if (view instanceof RadioButton) {
                                                e = ((RadioButton) view).getCheckedColor();
                                                break;
                                            } else {
                                                i = tkbVar5.g;
                                                e = ~i;
                                                break;
                                            }
                                        default:
                                            if (view instanceof EditTextBoldCursor) {
                                                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                                                switch (b7) {
                                                    case kk7.S /* 30 */:
                                                        e = editTextBoldCursor.getCursorColor();
                                                        break;
                                                    case 31:
                                                        e = editTextBoldCursor.getLineColor();
                                                        break;
                                                    case 32:
                                                        e = editTextBoldCursor.getActiveLineColor();
                                                        break;
                                                    case 33:
                                                        e = editTextBoldCursor.getErrorLineColor();
                                                        break;
                                                    case 34:
                                                        e = editTextBoldCursor.getHintColor();
                                                        break;
                                                    case 35:
                                                        e = editTextBoldCursor.getHeaderHintColor();
                                                        break;
                                                    case 36:
                                                        e = editTextBoldCursor.getHandlesColor();
                                                        break;
                                                }
                                            }
                                            i = tkbVar5.g;
                                            e = ~i;
                                            break;
                                    }
                            }
                            if (e != tkbVar5.g || e == b6) {
                                if (e != b6) {
                                    if (tkbVar5.m) {
                                        S(view, tkbVar5, b6);
                                    } else {
                                        xkb xkbVar = tkbVar5.o;
                                        if (xkbVar != null) {
                                            xkbVar.d(b6, view);
                                        }
                                    }
                                }
                                tkbVar5.g = b6;
                            }
                        } else {
                            wkb wkbVar = tkbVar5.n;
                            if (wkbVar != null) {
                                e = wkbVar.e(view);
                                if (e != tkbVar5.g) {
                                }
                                if (e != b6) {
                                }
                                tkbVar5.g = b6;
                            } else {
                                i = tkbVar5.g;
                                e = ~i;
                                if (e != tkbVar5.g) {
                                }
                                if (e != b6) {
                                }
                                tkbVar5.g = b6;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void b(a aVar, int i, wjb wjbVar, boolean z) {
        l(aVar, z ? 2 : 1, i, wjbVar);
    }

    public static void b0(ActionBarLayout actionBarLayout, boolean z) {
        b++;
        ykb L = L(z, 0, null);
        try {
            List j = gl.j();
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

    public static void c(c65 c65Var, int i) {
        l(c65Var, 5, i, null);
    }

    public static void c0(FrameLayout frameLayout, boolean z) {
        ykb L = L(z, 0, null);
        try {
            L.b(frameLayout);
        } finally {
            L.a();
        }
    }

    public static void d(a aVar, int i, wjb wjbVar) {
        l(aVar, 5, i, wjbVar);
    }

    public static vkb e(int i) {
        return new vkb(i, -1, 0.0f, 5);
    }

    public static void f(tkb tkbVar, HashSet hashSet) {
        hashSet.add(Integer.valueOf(tkbVar.a));
        int i = tkbVar.b;
        if (i >= 0) {
            hashSet.add(Integer.valueOf(i));
        }
    }

    public static vkb g(int i, int i2) {
        return new vkb(i, -1, i2, 1);
    }

    public static void h(int i, wjb wjbVar, View view) {
        int P = P(i, -1, 0, 0.0f, wjbVar);
        view.setBackgroundColor(P);
        N(view, 4, i, -1, 0, 0.0f, wjbVar, P, null);
    }

    public static void i(View view, vkb vkbVar, wjb wjbVar) {
        int i = vkbVar.a;
        int i2 = vkbVar.b;
        byte b2 = vkbVar.c;
        float f = vkbVar.d;
        int P = P(i, i2, b2, f, wjbVar);
        view.setBackgroundColor(P);
        N(view, 4, i, i2, b2, f, wjbVar, P, null);
    }

    public static void j(View view, Drawable drawable, vkb vkbVar, vkb vkbVar2, wjb wjbVar) {
        ukb o = o(view, true);
        o.d = drawable;
        o.e = null;
        o.f = null;
        if (drawable != null) {
            if (vkbVar != null) {
                tkb tkbVar = new tkb();
                o.e = tkbVar;
                tkbVar.c(vkbVar.a, vkbVar.b, vkbVar.c, vkbVar.d, wjbVar);
                tkbVar.g = t(drawable);
            }
            if (vkbVar2 != null) {
                tkb tkbVar2 = new tkb();
                o.f = tkbVar2;
                tkbVar2.c(vkbVar2.a, vkbVar2.b, vkbVar2.c, vkbVar2.d, wjbVar);
                tkbVar2.g = tkbVar2.b();
            }
        }
    }

    public static void k(View view, Drawable drawable, int i, int i2, int i3, float f, wjb wjbVar, PorterDuff.Mode mode) {
        int P = P(i, i2, i3, f, wjbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        ukb o = o(view, true);
        ArrayList arrayList = o.b;
        if (arrayList == null) {
            arrayList = new ArrayList(2);
            o.b = arrayList;
        }
        tkb tkbVar = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            tkb tkbVar2 = (tkb) o.b.get(size);
            Drawable drawable2 = (Drawable) tkbVar2.j.get();
            if (drawable2 == drawable) {
                tkbVar = tkbVar2;
            } else if (drawable2 == null || (!tkbVar2.k && drawable2.getColorFilter() != tkbVar2.i)) {
                o.b.remove(size);
            }
        }
        if (tkbVar == null) {
            tkbVar = new tkb();
            tkbVar.j = new WeakReference(drawable);
            o.b.add(tkbVar);
        }
        tkb tkbVar3 = tkbVar;
        tkbVar3.c(i, i2, i3, f, wjbVar);
        tkbVar3.g = P;
        tkbVar3.i = porterDuffColorFilter;
        tkbVar3.h = mode;
        tkbVar3.k = drawable.getColorFilter() != porterDuffColorFilter;
    }

    public static void l(View view, int i, int i2, wjb wjbVar) {
        tkb T = T(view, i, i2, wjbVar);
        int b2 = T.b();
        S(view, T, b2);
        T.g = b2;
    }

    public static void m(View view, int i, int i2, int i3, float f, wjb wjbVar) {
        int P = P(i, i2, i3, f, wjbVar);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(P);
        } else if (view instanceof jia) {
            ((jia) view).setTextColor(P);
        } else {
            ((hn) view).setTextColor(P);
        }
        N(view, 0, i, i2, i3, f, wjbVar, P, null);
    }

    public static void n(TextView textView, int i, int i2, int i3, int i4, float f, wjb wjbVar) {
        int P = P(i2, i3, i4, f, wjbVar);
        if (i == 1) {
            textView.setHintTextColor(P);
        } else if (i == 2) {
            textView.setLinkTextColor(P);
        } else if (i == 3) {
            textView.setHighlightColor(P);
        }
        N(textView, i, i2, i3, i4, f, wjbVar, P, null);
    }

    public static ukb o(View view, boolean z) {
        Object tag = view.getTag(R.id.theme_bind);
        if (tag instanceof ukb) {
            return (ukb) tag;
        }
        if (!z) {
            return null;
        }
        ukb ukbVar = new ukb();
        view.setTag(R.id.theme_bind, ukbVar);
        return ukbVar;
    }

    public static vkb p(int i, int i2) {
        return new vkb(i, i2, 0.0f, 4);
    }

    public static void q(View view) {
        if (view != null) {
            view.setTag(R.id.theme_bind, null);
        }
    }

    public static HashSet r() {
        HashSet hashSet = new HashSet();
        ykb L = L(true, 1, hashSet);
        try {
            List j = gl.j();
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

    public static void s(ImageView imageView, int i, wjb wjbVar, PorterDuff.Mode mode) {
        int P = P(i, -1, 0, 0.0f, wjbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        N(imageView, 5, i, -1, 0, 0.0f, wjbVar, P, porterDuffColorFilter).h = mode;
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

    public static void v(EditTextBoldCursor editTextBoldCursor, int i, wjb wjbVar) {
        l(editTextBoldCursor, 30, i, wjbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static tkb w(int i, View view) {
        ukb o = o(view, true);
        if (o.c == null) {
            o.c = new ArrayList(2);
        }
        for (int i2 = 0; i2 < o.c.size(); i2++) {
            if (((tkb) o.c.get(i2)).l == i) {
                return (tkb) o.c.get(i2);
            }
        }
        tkb tkbVar = new tkb();
        tkbVar.l = i;
        o.c.add(tkbVar);
        return tkbVar;
    }

    public static void x(View view, Drawable drawable, int i, wjb wjbVar, PorterDuff.Mode mode) {
        k(view, drawable, i, -1, 0, 0.0f, wjbVar, mode);
    }

    public static void y(EditTextBoldCursor editTextBoldCursor, int i, wjb wjbVar) {
        l(editTextBoldCursor, 36, i, wjbVar);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i, wjb wjbVar) {
        l(editTextBoldCursor, 35, i, wjbVar);
    }
}
