// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ru4 implements mya {
    public final uac a;
    public final TaskCompletionSource b;

    public ru4(uac uacVar, TaskCompletionSource taskCompletionSource) {
        this.a = uacVar;
        this.b = taskCompletionSource;
    }

    @Override // mya
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // mya
    public final boolean b(gb0 gb0Var) {
        if (gb0Var.b == 4 && !this.a.a(gb0Var)) {
            String str = gb0Var.c;
            if (str != null) {
                this.b.setResult(new xa0(gb0Var.e, str, gb0Var.f));
                return true;
            }
            gxc.d("Null token");
        }
        return false;
    }
}
