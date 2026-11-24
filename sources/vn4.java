// default package

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class vn4 implements LayoutInflater.Factory2 {
    public final go4 a;

    public vn4(go4 go4Var) {
        this.a = go4Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        to4 g;
        boolean equals = fn4.class.getName().equals(str);
        go4 go4Var = this.a;
        if (equals) {
            return new fn4(context, attributeSet, go4Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hy8.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = bn4.class.isAssignableFrom(ao4.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    bn4 C = resourceId != -1 ? go4Var.C(resourceId) : null;
                    if (C == null && string != null) {
                        C = go4Var.D(string);
                    }
                    if (C == null && id != -1) {
                        C = go4Var.C(id);
                    }
                    if (C == null) {
                        ao4 H = go4Var.H();
                        context.getClassLoader();
                        C = H.a(attributeValue);
                        C.E = true;
                        C.O = resourceId != 0 ? resourceId : id;
                        C.P = id;
                        C.Q = string;
                        C.F = true;
                        C.K = go4Var;
                        dn4 dn4Var = go4Var.w;
                        C.L = dn4Var;
                        Context context2 = dn4Var.b;
                        C.V = true;
                        if ((dn4Var == null ? null : dn4Var.a) != null) {
                            C.V = true;
                        }
                        g = go4Var.a(C);
                        if (go4.K(2)) {
                            Log.v("FragmentManager", "Fragment " + C + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (C.F) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        C.F = true;
                        C.K = go4Var;
                        dn4 dn4Var2 = go4Var.w;
                        C.L = dn4Var2;
                        Context context3 = dn4Var2.b;
                        C.V = true;
                        if ((dn4Var2 == null ? null : dn4Var2.a) != null) {
                            C.V = true;
                        }
                        g = go4Var.g(C);
                        if (go4.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + C + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    uo4 uo4Var = vo4.a;
                    vo4.b(new lo4(C, "Attempting to use <fragment> tag to add fragment " + C + " to container " + viewGroup));
                    vo4.a(C).getClass();
                    C.W = viewGroup;
                    g.j();
                    g.i();
                    sc8.j(tb4.y("Fragment ", attributeValue, " did not create a view."));
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
