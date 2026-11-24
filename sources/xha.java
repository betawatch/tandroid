// default package

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xha {
    public final p83 a;
    public final yha b;
    public final Context c;
    public final String d;
    public final zeb e;
    public final LinkedHashSet f;

    public xha(Context context, String str, Set set, p83 p83Var, yha yhaVar) {
        set.getClass();
        mi8 mi8Var = new mi8((byte) 1, context, str);
        this.a = p83Var;
        this.b = yhaVar;
        this.c = context;
        this.d = str;
        this.e = new zeb(mi8Var);
        this.f = set == aia.a ? null : new LinkedHashSet(set);
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
    public final Object a(Object obj, qx2 qx2Var) {
        wha whaVar;
        Object obj2;
        int i;
        if (qx2Var instanceof wha) {
            whaVar = (wha) qx2Var;
            int i2 = whaVar.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                whaVar.d = i2 - TLObject.FLAG_31;
                obj2 = whaVar.b;
                i = whaVar.d;
                boolean z = true;
                if (i != 0) {
                    tue.b(obj2);
                    whaVar.a = this;
                    whaVar.d = 1;
                    obj2 = this.a.invoke(obj, whaVar);
                    ly2 ly2Var = ly2.a;
                    if (obj2 == ly2Var) {
                        return ly2Var;
                    }
                } else {
                    if (i != 1) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = whaVar.a;
                    tue.b(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                LinkedHashSet linkedHashSet = this.f;
                zeb zebVar = this.e;
                if (linkedHashSet != null) {
                    SharedPreferences sharedPreferences = (SharedPreferences) zebVar.getValue();
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
                Map<String, ?> all = ((SharedPreferences) zebVar.getValue()).getAll();
                all.getClass();
            }
        }
        whaVar = new wha(this, qx2Var);
        obj2 = whaVar.b;
        i = whaVar.d;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
