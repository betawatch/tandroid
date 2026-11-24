// default package

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xp4 implements LayoutInflater.Factory2 {
    public final hq4 a;

    public xp4(hq4 hq4Var) {
        this.a = hq4Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        uq4 g;
        boolean equals = hp4.class.getName().equals(str);
        hq4 hq4Var = this.a;
        if (equals) {
            return new hp4(context, attributeSet, hq4Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i09.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = dp4.class.isAssignableFrom(bq4.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    dp4 C = resourceId != -1 ? hq4Var.C(resourceId) : null;
                    if (C == null && string != null) {
                        C = hq4Var.D(string);
                    }
                    if (C == null && id != -1) {
                        C = hq4Var.C(id);
                    }
                    if (C == null) {
                        bq4 H = hq4Var.H();
                        context.getClassLoader();
                        C = H.a(attributeValue);
                        C.E = true;
                        C.O = resourceId != 0 ? resourceId : id;
                        C.P = id;
                        C.Q = string;
                        C.F = true;
                        C.K = hq4Var;
                        fp4 fp4Var = hq4Var.w;
                        C.L = fp4Var;
                        Context context2 = fp4Var.b;
                        C.V = true;
                        if ((fp4Var == null ? null : fp4Var.a) != null) {
                            C.V = true;
                        }
                        g = hq4Var.a(C);
                        if (hq4.K(2)) {
                            Log.v("FragmentManager", "Fragment " + C + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (C.F) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        C.F = true;
                        C.K = hq4Var;
                        fp4 fp4Var2 = hq4Var.w;
                        C.L = fp4Var2;
                        Context context3 = fp4Var2.b;
                        C.V = true;
                        if ((fp4Var2 == null ? null : fp4Var2.a) != null) {
                            C.V = true;
                        }
                        g = hq4Var.g(C);
                        if (hq4.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + C + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    vq4 vq4Var = wq4.a;
                    wq4.b(new mq4(C, "Attempting to use <fragment> tag to add fragment " + C + " to container " + viewGroup));
                    wq4.a(C).getClass();
                    C.W = viewGroup;
                    g.j();
                    g.i();
                    dq9.m(kt6.o("Fragment ", attributeValue, " did not create a view."));
                    return null;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
