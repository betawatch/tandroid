// default package

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class po {
    public Parcelable a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public /* synthetic */ po(TextView textView) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView;
    }

    public final void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.c) {
                    mutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public final void b() {
        oo ooVar = (oo) this.f;
        Drawable checkMarkDrawable = ooVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.c) {
                    mutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(ooVar.getDrawableState());
                }
                ooVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    public final Bundle c(String str) {
        if (!this.d) {
            grb.i("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
            return null;
        }
        Bundle bundle = (Bundle) this.a;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.a;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.a;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.a = null;
        return bundle2;
    }

    public final ut9 d() {
        String str;
        ut9 ut9Var;
        Iterator it = ((os9) this.f).iterator();
        do {
            ks9 ks9Var = (ks9) it;
            if (!ks9Var.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) ks9Var.next();
            entry.getClass();
            str = (String) entry.getKey();
            ut9Var = (ut9) entry.getValue();
        } while (!ur5.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return ut9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0053, B:11:0x005a, B:12:0x0061, B:14:0x0068, B:21:0x003c, B:23:0x0042, B:25:0x0048), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #1 {all -> 0x0079, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0053, B:11:0x005a, B:12:0x0061, B:14:0x0068, B:21:0x003c, B:23:0x0042, B:25:0x0048), top: B:2:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        Context context = compoundButton.getContext();
        int[] iArr = w19.m;
        ko9 v = ko9.v(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) v.c;
        ihc.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) v.c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(yqd.a(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(v.m(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(cr3.b(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(yqd.a(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
        } finally {
            v.y();
        }
    }

    public final void f(String str, ut9 ut9Var) {
        Object obj;
        ut9Var.getClass();
        os9 os9Var = (os9) this.f;
        ls9 h = os9Var.h(str);
        if (h != null) {
            obj = h.b;
        } else {
            ls9 ls9Var = new ls9(str, ut9Var);
            os9Var.d++;
            ls9 ls9Var2 = os9Var.b;
            if (ls9Var2 == null) {
                os9Var.a = ls9Var;
                os9Var.b = ls9Var;
            } else {
                ls9Var2.c = ls9Var;
                ls9Var.d = ls9Var2;
                os9Var.b = ls9Var;
            }
            obj = null;
        }
        if (((ut9) obj) == null) {
            return;
        }
        lq5.j("SavedStateProvider with the given key is already registered");
    }

    public final void g() {
        if (!this.e) {
            grb.i("Can not perform this action after onSaveInstanceState");
            return;
        }
        y59 y59Var = (y59) this.b;
        if (y59Var == null) {
            y59Var = new y59(this);
        }
        this.b = y59Var;
        try {
            o26.class.getDeclaredConstructor(null);
            y59 y59Var2 = (y59) this.b;
            if (y59Var2 != null) {
                y59Var2.a.add(o26.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + o26.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public po() {
        this.f = new os9();
        this.e = true;
    }
}
