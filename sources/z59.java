// default package

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class z59 implements f36 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ z59(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // f36
    public final void b(i36 i36Var, y26 y26Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                vt9 vt9Var = (vt9) obj;
                if (y26Var != y26.ON_CREATE) {
                    hz6.e("Next event must be ON_CREATE");
                    return;
                }
                i36Var.m().b(this);
                Bundle c = vt9Var.g().c("androidx.savedstate.Restarter");
                if (c != null) {
                    ArrayList<String> stringArrayList = c.getStringArrayList("classes_to_restore");
                    if (stringArrayList == null) {
                        grb.i("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                        return;
                    }
                    int size = stringArrayList.size();
                    int i = 0;
                    while (i < size) {
                        String str = stringArrayList.get(i);
                        i++;
                        String str2 = str;
                        try {
                            Class<? extends U> asSubclass = Class.forName(str2, false, z59.class.getClassLoader()).asSubclass(tt9.class);
                            asSubclass.getClass();
                            try {
                                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance(null);
                                    newInstance.getClass();
                                    if (!(vt9Var instanceof shc)) {
                                        grb.i("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                        return;
                                    }
                                    rhc f = ((shc) vt9Var).f();
                                    po g = vt9Var.g();
                                    f.getClass();
                                    LinkedHashMap linkedHashMap = f.a;
                                    Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                    while (it.hasNext()) {
                                        String str3 = (String) it.next();
                                        str3.getClass();
                                        nhc nhcVar = (nhc) linkedHashMap.get(str3);
                                        nhcVar.getClass();
                                        cse.a(nhcVar, g, vt9Var.m());
                                    }
                                    if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                        g.g();
                                    }
                                } catch (Exception e) {
                                    grb.j(c00.i("Failed to instantiate ", str2), e);
                                    return;
                                }
                            } catch (NoSuchMethodException e2) {
                                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            grb.j(qd4.y("Class ", str2, " wasn't found"), e3);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                fu4[] fu4VarArr = (fu4[]) obj;
                if (fu4VarArr.length > 0) {
                    fu4 fu4Var = fu4VarArr[0];
                    throw null;
                }
                if (fu4VarArr.length <= 0) {
                    return;
                }
                fu4 fu4Var2 = fu4VarArr[0];
                throw null;
            default:
                if (y26Var == y26.ON_CREATE) {
                    i36Var.m().b(this);
                    ((qt9) obj).a();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + y26Var).toString());
                }
        }
    }
}
