// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class q73 extends eeb implements rr4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q73(Object obj, px2 px2Var, byte b) {
        super(1, px2Var);
        this.a = b;
        this.c = obj;
    }

    @Override // og0
    public final px2 create(px2 px2Var) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return new q73((xha) obj, px2Var, (byte) 0);
            default:
                return new q73((d93) obj, px2Var, (byte) 1);
        }
    }

    @Override // rr4
    public final Object invoke(Object obj) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        px2 px2Var = (px2) obj;
        switch (b) {
        }
        return ((q73) create(px2Var)).invokeSuspend(g7cVar);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        ly2 ly2Var = ly2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                g7c g7cVar = g7c.a;
                if (z) {
                    if (z) {
                        tue.b(obj);
                        return g7cVar;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tue.b(obj);
                xha xhaVar = (xha) obj2;
                this.b = true;
                SharedPreferences.Editor edit = ((SharedPreferences) xhaVar.e.getValue()).edit();
                LinkedHashSet linkedHashSet = xhaVar.f;
                if (linkedHashSet == null) {
                    edit.clear();
                } else {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        edit.remove((String) it.next());
                    }
                }
                if (!edit.commit()) {
                    wa3.d("Unable to delete migrated keys from SharedPreferences.");
                    return null;
                }
                if (((SharedPreferences) xhaVar.e.getValue()).getAll().isEmpty()) {
                    Context context = xhaVar.c;
                    String str = xhaVar.d;
                    if (Build.VERSION.SDK_INT >= 24) {
                        vha.a(context, str);
                    } else {
                        File file = new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), str.concat(".xml"));
                        File file2 = new File(file.getPath() + ".bak");
                        file.delete();
                        file2.delete();
                    }
                }
                if (linkedHashSet != null) {
                    linkedHashSet.clear();
                }
                if (g7cVar == ly2Var) {
                    return ly2Var;
                }
                return g7cVar;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    tue.b(obj);
                    this.b = true;
                    Object invoke = ((d93) obj2).invoke(this);
                    return invoke == ly2Var ? ly2Var : invoke;
                }
                if (z2) {
                    tue.b(obj);
                    return obj;
                }
                dq9.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
