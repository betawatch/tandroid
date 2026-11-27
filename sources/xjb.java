// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class xjb {
    public final a94[] a;
    public final boolean b;
    public final char c;

    /* JADX WARN: Multi-variable type inference failed */
    public xjb(a94[] a94VarArr, boolean z, int i) {
        this.a = a94VarArr;
        boolean z2 = false;
        if (a94VarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public static wjb b() {
        wjb wjbVar = new wjb();
        wjbVar.b = true;
        wjbVar.d = (char) 0;
        return wjbVar;
    }

    public abstract void c(d05 d05Var, TaskCompletionSource taskCompletionSource);
}
