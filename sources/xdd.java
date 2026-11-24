// default package

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xdd implements r9, f69, l8e, x4d {
    public Object a;

    public /* synthetic */ xdd(Object obj) {
        this.a = obj;
    }

    public final void a() {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + d());
    }

    @Override // f69
    public final void accept(Object obj, Object obj2) {
        q44 q44Var = (q44) this.a;
        sme smeVar = new sme((TaskCompletionSource) obj2, (byte) 0);
        pyd pydVar = (pyd) ((zze) obj).k();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i = ygd.a;
        obtain.writeStrongBinder(smeVar);
        obtain.writeInt(1);
        q44Var.writeToParcel(obtain, 0);
        pydVar.a(obtain, 2);
    }

    @Override // x4d
    public final void b(Bitmap bitmap) {
        ((kgf) this.a).e(3, bitmap);
    }

    public final void c(long j) {
        long d = d();
        if (d != j) {
            if (d != -1) {
                if (d != -2) {
                    return;
                } else {
                    d = -2;
                }
            }
            StringBuilder o = ug8.o(j, "expected non-string scope or scope ", " but found ");
            o.append(d);
            throw new IOException(o.toString());
        }
    }

    public final long d() {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    public final void e(int i, Object obj, tgf tgfVar) {
        hef hefVar = (hef) this.a;
        hefVar.i(i, 3);
        tgfVar.c((jdf) obj, hefVar.a);
        hefVar.i(i, 4);
    }

    public final void f(int i, Object obj, bbe bbeVar) {
        cwd cwdVar = (cwd) this.a;
        cwdVar.m(i, 3);
        bbeVar.f((rrd) obj, cwdVar.a);
        cwdVar.m(i, 4);
    }

    public final void g(int i, Object obj, tgf tgfVar) {
        jdf jdfVar = (jdf) obj;
        hef hefVar = (hef) this.a;
        hefVar.j((i << 3) | 2);
        hefVar.j(jdfVar.a(tgfVar));
        tgfVar.c(jdfVar, hefVar.a);
    }

    public final void h(int i, Object obj, bbe bbeVar) {
        rrd rrdVar = (rrd) obj;
        cwd cwdVar = (cwd) this.a;
        cwdVar.o((i << 3) | 2);
        cwdVar.o(rrdVar.b(bbeVar));
        bbeVar.f(rrdVar, cwdVar.a);
    }

    @Override // r9
    public final void i(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.a;
        q9 q9Var = (q9) obj;
        Intent intent = q9Var.b;
        int i = xgd.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.O;
        if (resultReceiver != null) {
            resultReceiver.send(i, intent == null ? null : intent.getExtras());
        }
        int i2 = q9Var.a;
        if (i2 != -1 || i != 0) {
            xgd.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i2 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // l8e
    public final vae zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            l8e l8eVar = ((l8e[]) this.a)[i];
            if (l8eVar.zzc(cls)) {
                return l8eVar.zzb(cls);
            }
        }
        fyb.i("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // l8e
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((l8e[]) this.a)[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
