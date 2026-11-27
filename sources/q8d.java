// default package

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class q8d extends d05 {
    public final GoogleSignInOptions F;

    public q8d(Context context, Looper looper, oxb oxbVar, GoogleSignInOptions googleSignInOptions, k05 k05Var, l05 l05Var) {
        super(91, k05Var, l05Var, oxbVar, context, looper);
        d15 d15Var;
        Set<Scope> set = (Set) oxbVar.b;
        if (googleSignInOptions != null) {
            d15Var = new d15();
            d15Var.a = new HashSet();
            d15Var.h = new HashMap();
            d15Var.a = new HashSet(googleSignInOptions.b);
            d15Var.b = googleSignInOptions.e;
            d15Var.c = googleSignInOptions.f;
            d15Var.d = googleSignInOptions.d;
            d15Var.e = googleSignInOptions.h;
            d15Var.f = googleSignInOptions.c;
            d15Var.g = googleSignInOptions.n;
            d15Var.h = GoogleSignInOptions.c(googleSignInOptions.r);
            d15Var.i = googleSignInOptions.s;
        } else {
            d15Var = new d15();
            d15Var.a = new HashSet();
            d15Var.h = new HashMap();
        }
        d15Var.i = j8d.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = d15Var.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = d15Var.a;
        if (hashSet2.contains(GoogleSignInOptions.F)) {
            Scope scope2 = GoogleSignInOptions.E;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (d15Var.d && (d15Var.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.y);
        }
        this.F = new GoogleSignInOptions(3, new ArrayList(hashSet2), d15Var.f, d15Var.d, d15Var.b, d15Var.c, d15Var.e, d15Var.g, d15Var.h, d15Var.i);
    }

    @Override // hg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof a9d ? (a9d) queryLocalInterface : new a9d(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", (byte) 2);
    }

    @Override // hg0
    public final int i() {
        return 12451000;
    }

    @Override // hg0
    public final String l() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // hg0
    public final Intent m() {
        return y8d.a(this.h, this.F);
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
