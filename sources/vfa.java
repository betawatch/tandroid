// default package

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class vfa {
    public final d73 a;
    public final wfa b;
    public final Context c;
    public final String d;
    public final ycb e;
    public final LinkedHashSet f;

    public vfa(Context context, String str, Set set, d73 d73Var, wfa wfaVar) {
        set.getClass();
        kg8 kg8Var = new kg8((byte) 1, context, str);
        this.a = d73Var;
        this.b = wfaVar;
        this.c = context;
        this.d = str;
        this.e = new ycb(kg8Var);
        this.f = set == yfa.a ? null : new LinkedHashSet(set);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r4.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, gw2 gw2Var) {
        ufa ufaVar;
        Object obj2;
        int i;
        if (gw2Var instanceof ufa) {
            ufaVar = (ufa) gw2Var;
            int i2 = ufaVar.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                ufaVar.d = i2 - TLObject.FLAG_31;
                obj2 = ufaVar.b;
                i = ufaVar.d;
                boolean z = true;
                if (i != 0) {
                    qse.b(obj2);
                    ufaVar.a = this;
                    ufaVar.d = 1;
                    obj2 = this.a.invoke(obj, ufaVar);
                    bx2 bx2Var = bx2.a;
                    if (obj2 == bx2Var) {
                        return bx2Var;
                    }
                } else {
                    if (i != 1) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = ufaVar.a;
                    qse.b(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                LinkedHashSet linkedHashSet = this.f;
                ycb ycbVar = this.e;
                if (linkedHashSet != null) {
                    SharedPreferences sharedPreferences = (SharedPreferences) ycbVar.getValue();
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            if (sharedPreferences.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                Map<String, ?> all = ((SharedPreferences) ycbVar.getValue()).getAll();
                all.getClass();
            }
        }
        ufaVar = new ufa(this, gw2Var);
        obj2 = ufaVar.b;
        i = ufaVar.d;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
