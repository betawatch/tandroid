// default package

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class w8d extends jg0 {
    public final /* synthetic */ byte q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8d(o6d o6dVar, byte b) {
        super(q40.a, o6dVar);
        this.q = b;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, kg0
    public final /* bridge */ /* synthetic */ void a(ie9 ie9Var) {
        a(ie9Var);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ ie9 d(Status status) {
        byte b = this.q;
        return status;
    }

    @Override // jg0
    public final void n(d05 d05Var) {
        switch (this.q) {
            case 0:
                q8d q8dVar = (q8d) d05Var;
                a9d a9dVar = (a9d) q8dVar.k();
                t8d t8dVar = new t8d(this, (byte) 0);
                GoogleSignInOptions googleSignInOptions = q8dVar.F;
                Parcel e = a9dVar.e();
                int i = n8d.a;
                e.writeStrongBinder(t8dVar);
                n8d.c(e, googleSignInOptions);
                a9dVar.f(e, jn7.m1);
                break;
            default:
                q8d q8dVar2 = (q8d) d05Var;
                a9d a9dVar2 = (a9d) q8dVar2.k();
                t8d t8dVar2 = new t8d(this, (byte) 1);
                GoogleSignInOptions googleSignInOptions2 = q8dVar2.F;
                Parcel e2 = a9dVar2.e();
                int i2 = n8d.a;
                e2.writeStrongBinder(t8dVar2);
                n8d.c(e2, googleSignInOptions2);
                a9dVar2.f(e2, jn7.n1);
                break;
        }
    }
}
