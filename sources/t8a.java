// default package

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import j$.util.Objects;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class t8a implements ServiceConnection {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ t8a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        qx6 qx6Var;
        boolean z = false;
        bj5 bj5Var = null;
        sed sedVar = null;
        switch (this.a) {
            case 0:
                int i = aj5.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof bj5)) {
                        zi5 zi5Var = new zi5();
                        zi5Var.a = iBinder;
                        bj5Var = zi5Var;
                    } else {
                        bj5Var = (bj5) queryLocalInterface;
                    }
                }
                qx6 qx6Var2 = new qx6(bj5Var, componentName, z, (byte) 17);
                if (((k01) ((WeakReference) this.b).get()) != null) {
                    m01.b = qx6Var2;
                    if (uc7.s1(yac.t0).U2() && (qx6Var = m01.b) != null) {
                        try {
                            ((zi5) ((bj5) qx6Var.b)).b();
                            break;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            return;
                        }
                    }
                }
                break;
            case 1:
                y3d y3dVar = (y3d) this.b;
                y3dVar.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                y3dVar.a().post(new w3d(this, iBinder));
                break;
            default:
                old.g("BillingClientTesting", "Billing Override Service connected.");
                cnd cndVar = (cnd) this.b;
                int i2 = eed.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    sedVar = queryLocalInterface2 instanceof sed ? (sed) queryLocalInterface2 : new wdd(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", (byte) 10);
                }
                cndVar.E = sedVar;
                cndVar.D = (byte) 2;
                int i3 = pnd.a;
                wme c = pnd.c(26, uoe.b);
                Objects.requireNonNull(c, "ApiSuccess should not be null");
                zhc zhcVar = cndVar.h;
                zhcVar.getClass();
                try {
                    zhcVar.r(c, (cqe) zhcVar.b);
                    break;
                } catch (Throwable th) {
                    old.i("BillingLogger", "Unable to log.", th);
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        byte b = 0;
        switch (this.a) {
            case 0:
                if (((k01) ((WeakReference) this.b).get()) != null) {
                    m01.b = null;
                    break;
                }
                break;
            case 1:
                y3d y3dVar = (y3d) this.b;
                y3dVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                y3dVar.a().post(new x3d(this, b));
                break;
            default:
                old.h("BillingClientTesting", "Billing Override Service disconnected.");
                cnd cndVar = (cnd) this.b;
                cndVar.E = null;
                cndVar.D = (byte) 0;
                break;
        }
    }

    public /* synthetic */ t8a() {
        this.a = (byte) 0;
    }
}
