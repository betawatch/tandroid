package th;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.k20;
import org.telegram.messenger.l9;
import org.telegram.messenger.s20;
import org.telegram.messenger.sc;
import org.telegram.messenger.we;
import w7.b9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements org.telegram.ui.ActionBar.u1, d9.k, e2.j, qa.a, q3.g, l9, k20, s20, Continuation, r9.d, i5.e, wg.c {
    public final /* synthetic */ int a;

    public /* synthetic */ m1(int i10) {
        this.a = i10;
    }

    @Override // r9.d
    public Object K(bh.d dVar) {
        FirebaseMessaging lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(dVar);
        return lambda$getComponents$0;
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((u2.a1) obj).b.release();
    }

    @Override // d9.k
    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return ((c3.o) obj).b().getClass().getSimpleName();
            case 2:
                return e9.n0.u(e9.s.x(((u2.e0) obj).q().b, new m1(4)));
            case 4:
                return Integer.valueOf(((b2.p1) obj).c);
            case 16:
                return Long.valueOf(((z3.a) obj).b);
            case 17:
                return Long.valueOf(((z3.a) obj).c);
            case 18:
                return (w3.q) obj;
            case 19:
                u2.r1 r1Var = (u2.r1) obj;
                r1Var.getClass();
                Bundle bundle = new Bundle();
                String str = u2.r1.e;
                e9.x1 x1Var = r1Var.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(x1Var.d);
                e9.l0 listIterator = x1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((b2.p1) listIterator.next()).c());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
            default:
                ya.e eVar = (ya.e) obj;
                eVar.getClass();
                li.k kVar = xa.k.a;
                kVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    kVar.q(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // q3.g
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    @Override // org.telegram.messenger.k20
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == 0) {
            return num.intValue() == 0 ? cd.L0(2131748815, null) : cd.H(',', "Stars", num.intValue());
        }
        return "" + num;
    }

    @Override // wg.c
    public int g(org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        switch (this.a) {
            case 28:
                return org.telegram.ui.ActionBar.t6.r1(z10 ? 0.85f : 0.825f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G8, false));
            default:
                return b9.n(sc.e(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Nl, p6Var));
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        x1Var.dismiss();
    }

    @Override // qa.a
    public void i(qa.b bVar) {
        bVar.get().getClass();
        throw new ClassCastException();
    }

    @Override // org.telegram.messenger.l9
    public Object l(Object obj) {
        we weVar = vh.k2.j0;
        return 0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z10;
        int i10;
        switch (this.a) {
            case 21:
                if (task.isSuccessful()) {
                    x9.b bVar = (x9.b) task.getResult();
                    String str = "Crashlytics report successfully enqueued to DataTransport: " + bVar.b;
                    u9.c cVar = u9.c.a;
                    cVar.b(str);
                    File file = bVar.c;
                    z10 = true;
                    if (file.delete()) {
                        cVar.b("Deleted report file: " + file.getPath());
                    } else {
                        cVar.d("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 22:
            default:
                i10 = -1;
                break;
            case 23:
                i10 = 403;
                break;
        }
        return Integer.valueOf(i10);
    }

    public /* synthetic */ m1(j2.f fVar) {
        this.a = 21;
    }
}
