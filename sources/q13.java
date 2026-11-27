// default package

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class q13 extends ResultReceiver {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q13(xo6 xo6Var) {
        super(null);
        this.a = (byte) 5;
        this.b = new WeakReference(xo6Var);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        d13 a;
        String string;
        Bundle bundle2;
        w03 a2;
        boolean z;
        w03 w03Var;
        nk5 nk5Var;
        byte b = 0;
        byte b2 = 2;
        byte b3 = 1;
        switch (this.a) {
            case 0:
                bundle.getClass();
                p13 p13Var = new p13(2, q23.a, l23.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, (byte) 0);
                r13 r13Var = (r13) this.b;
                Executor executor = r13Var.g;
                if (executor == null) {
                    ur5.e("executor");
                    throw null;
                }
                h23 h23Var = r13Var.f;
                if (h23Var == null) {
                    ur5.e("callback");
                    throw null;
                }
                if (q23.b(bundle, p13Var, executor, h23Var, r13Var.h)) {
                    return;
                }
                int i2 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) mud.a(bundle);
                boolean z2 = q23.c;
                if (i2 != z2) {
                    Log.w("CreatePublicKey", "Returned request code " + (z2 ? 1 : 0) + " does not match what was given " + i2);
                    return;
                }
                a2 a2Var = new a2(r13Var, b3);
                CancellationSignal cancellationSignal = r13Var.h;
                if (i != -1) {
                    p89 p89Var = new p89();
                    p89Var.a = new v03(bfe.a(i), (byte) 2);
                    if (i == 0) {
                        p89Var.a = new u03("activity is cancelled by the user.");
                    }
                    p23 p23Var = new p23(a2Var, p89Var, b);
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!d33.a(cancellationSignal)) {
                        p23Var.invoke();
                    }
                    b = 1;
                }
                if (b == 0) {
                    if (intent == null) {
                        CancellationSignal cancellationSignal2 = r13Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (d33.a(cancellationSignal2)) {
                            return;
                        }
                        Executor executor2 = r13Var.g;
                        if (executor2 != null) {
                            executor2.execute(new l13(r13Var, b3));
                            return;
                        } else {
                            ur5.e("executor");
                            throw null;
                        }
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 34) {
                        a = u4.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent);
                    } else {
                        Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                        a = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle2 = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) ? null : iee.a(string, bundle2);
                    }
                    if (a != null) {
                        CancellationSignal cancellationSignal3 = r13Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (d33.a(cancellationSignal3)) {
                            return;
                        }
                        Executor executor3 = r13Var.g;
                        if (executor3 != null) {
                            executor3.execute(new bv2((Object) r13Var, (Object) a, (byte) 12));
                            return;
                        } else {
                            ur5.e("executor");
                            throw null;
                        }
                    }
                    if (i3 >= 34) {
                        a2 = u4.a(intent);
                    } else {
                        int i4 = w03.a;
                        Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                        if (bundleExtra2 == null) {
                            a2 = null;
                        } else {
                            String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                            if (string2 == null) {
                                lq5.j("Bundle was missing exception type.");
                                return;
                            }
                            a2 = tyd.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                        }
                    }
                    CancellationSignal cancellationSignal4 = r13Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (d33.a(cancellationSignal4)) {
                        return;
                    }
                    Executor executor4 = r13Var.g;
                    if (executor4 != null) {
                        executor4.execute(new n13(r13Var, a2, b3));
                        return;
                    } else {
                        ur5.e("executor");
                        throw null;
                    }
                }
                return;
            case 1:
                bundle.getClass();
                p13 p13Var2 = new p13(2, q23.a, l23.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 1);
                o23 o23Var = (o23) this.b;
                if (q23.b(bundle, p13Var2, o23Var.f(), o23Var.e(), o23Var.h)) {
                    return;
                }
                int i5 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) bundle.getParcelable("RESULT_DATA");
                boolean z3 = q23.c;
                if (i5 != z3) {
                    Log.w("BeginSignIn", "Returned request code " + (z3 ? 1 : 0) + " which  does not match what was given " + i5);
                    return;
                }
                a2 a2Var2 = new a2(o23Var, b2);
                CancellationSignal cancellationSignal5 = o23Var.h;
                if (i != -1) {
                    p89 p89Var2 = new p89();
                    p89Var2.a = new xu4(bfe.a(i), (byte) 2);
                    if (i == 0) {
                        p89Var2.a = new vu4("activity is cancelled by the user.");
                    }
                    p23 p23Var2 = new p23(a2Var2, p89Var2, b3);
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (d33.a(cancellationSignal5)) {
                        return;
                    }
                    p23Var2.invoke();
                    return;
                }
                byte b4 = 16;
                try {
                    kpe.a(o23Var.e);
                    bv4 d = o23Var.d(h8d.f(intent2));
                    CancellationSignal cancellationSignal6 = o23Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (d33.a(cancellationSignal6)) {
                        return;
                    }
                    o23Var.f().execute(new bv2(o23Var, d, b4));
                    return;
                } catch (ao e) {
                    p89 p89Var3 = new p89();
                    p89Var3.a = new xu4(e.getMessage(), (byte) 2);
                    if (e.getStatusCode() == 16) {
                        p89Var3.a = new vu4(e.getMessage());
                    } else if (q23.b.contains(Integer.valueOf(e.getStatusCode()))) {
                        p89Var3.a = new zu4(e.getMessage());
                    }
                    CancellationSignal cancellationSignal7 = o23Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (d33.a(cancellationSignal7)) {
                        return;
                    }
                    o23Var.f().execute(new bv2((Object) o23Var, (Object) p89Var3, (byte) 17));
                    return;
                } catch (yu4 e2) {
                    CancellationSignal cancellationSignal8 = o23Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (d33.a(cancellationSignal8)) {
                        return;
                    }
                    o23Var.f().execute(new n23(o23Var, e2, b3));
                    return;
                } catch (Throwable th) {
                    xu4 xu4Var = new xu4(th.getMessage(), (byte) 2);
                    CancellationSignal cancellationSignal9 = o23Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (d33.a(cancellationSignal9)) {
                        return;
                    }
                    o23Var.f().execute(new bv2((Object) o23Var, (Object) xu4Var, (byte) 15));
                    return;
                }
            case 2:
                bundle.getClass();
                p13 p13Var3 = new p13(2, q23.a, l23.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, (byte) 2);
                v23 v23Var = (v23) this.b;
                Executor executor5 = v23Var.g;
                if (executor5 == null) {
                    ur5.e("executor");
                    throw null;
                }
                h23 h23Var2 = v23Var.f;
                if (h23Var2 == null) {
                    ur5.e("callback");
                    throw null;
                }
                if (q23.b(bundle, p13Var3, executor5, h23Var2, v23Var.h)) {
                    return;
                }
                int i6 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent3 = (Intent) bundle.getParcelable("RESULT_DATA");
                boolean z4 = q23.c;
                if (i6 != z4) {
                    Log.w("CreatePublicKey", "Returned request code " + (z4 ? 1 : 0) + " does not match what was given " + i6);
                    return;
                }
                a2 a2Var3 = new a2((Object) v23Var, (byte) 3);
                CancellationSignal cancellationSignal10 = v23Var.h;
                if (i != -1) {
                    p89 p89Var4 = new p89();
                    p89Var4.a = new v03(bfe.a(i), (byte) 2);
                    if (i == 0) {
                        p89Var4.a = new u03("activity is cancelled by the user.");
                    }
                    p23 p23Var3 = new p23(a2Var3, p89Var4, b);
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!d33.a(cancellationSignal10)) {
                        p23Var3.invoke();
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
                byte[] byteArrayExtra = intent3 != null ? intent3.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
                if (byteArrayExtra == null) {
                    d33 d33Var = CredentialProviderPlayServicesImpl.Companion;
                    CancellationSignal cancellationSignal11 = v23Var.h;
                    d33Var.getClass();
                    if (d33.a(cancellationSignal11)) {
                        return;
                    }
                    Executor executor6 = v23Var.g;
                    if (executor6 != null) {
                        executor6.execute(new t23(v23Var, b3));
                        return;
                    } else {
                        ur5.e("executor");
                        throw null;
                    }
                }
                tx8 tx8Var = (tx8) dye.a(byteArrayExtra, tx8.CREATOR);
                tx8Var.getClass();
                LinkedHashMap linkedHashMap = ux8.a;
                c50 c50Var = tx8Var.d;
                Object obj = c50Var;
                if (c50Var == null) {
                    b50 b50Var = tx8Var.e;
                    obj = b50Var;
                    if (b50Var == null) {
                        d50 d50Var = tx8Var.f;
                        obj = d50Var;
                        if (d50Var == null) {
                            grb.i("No response set.");
                            return;
                        }
                    }
                }
                if (obj instanceof d50) {
                    d50 d50Var2 = (d50) obj;
                    q44 q44Var = d50Var2.a;
                    q44Var.getClass();
                    i1 i1Var = (i1) ux8.a.get(q44Var);
                    String str = d50Var2.b;
                    w03Var = i1Var == null ? new s13(new i1((byte) 26), c00.i("unknown fido gms exception - ", str)) : (q44Var != q44.x || str == null || ddb.f(0, 2, str, "Unable to get sync account") < 0) ? new s13(i1Var, str) : new u03("Passkey registration was cancelled by the user.");
                } else {
                    w03Var = null;
                }
                if (w03Var != null) {
                    CancellationSignal cancellationSignal12 = v23Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (d33.a(cancellationSignal12)) {
                        return;
                    }
                    Executor executor7 = v23Var.g;
                    if (executor7 != null) {
                        executor7.execute(new u23(v23Var, w03Var, b3));
                        return;
                    } else {
                        ur5.e("executor");
                        throw null;
                    }
                }
                try {
                    u13 e3 = v23.e(tx8Var);
                    CancellationSignal cancellationSignal13 = v23Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (d33.a(cancellationSignal13)) {
                        return;
                    }
                    Executor executor8 = v23Var.g;
                    if (executor8 != null) {
                        executor8.execute(new bv2((Object) v23Var, (Object) e3, (byte) 19));
                        return;
                    } else {
                        ur5.e("executor");
                        throw null;
                    }
                } catch (JSONException e4) {
                    CancellationSignal cancellationSignal14 = v23Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (d33.a(cancellationSignal14)) {
                        return;
                    }
                    Executor executor9 = v23Var.g;
                    if (executor9 != null) {
                        executor9.execute(new r23(v23Var, e4, b));
                        return;
                    } else {
                        ur5.e("executor");
                        throw null;
                    }
                } catch (Throwable th2) {
                    CancellationSignal cancellationSignal15 = v23Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (d33.a(cancellationSignal15)) {
                        return;
                    }
                    Executor executor10 = v23Var.g;
                    if (executor10 != null) {
                        executor10.execute(new s23(v23Var, th2, b));
                        return;
                    } else {
                        ur5.e("executor");
                        throw null;
                    }
                }
            case 3:
                bundle.getClass();
                p13 p13Var4 = new p13(2, q23.a, l23.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 3);
                a33 a33Var = (a33) this.b;
                Executor executor11 = a33Var.g;
                if (executor11 == null) {
                    ur5.e("executor");
                    throw null;
                }
                h23 h23Var3 = a33Var.f;
                if (h23Var3 == null) {
                    ur5.e("callback");
                    throw null;
                }
                if (q23.b(bundle, p13Var4, executor11, h23Var3, a33Var.h)) {
                    return;
                }
                int i7 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent4 = (Intent) mud.a(bundle);
                Executor executor12 = a33Var.g;
                if (executor12 == null) {
                    ur5.e("executor");
                    throw null;
                }
                h23 h23Var4 = a33Var.f;
                if (h23Var4 != null) {
                    hxe.a(i7, i, intent4, executor12, h23Var4, a33Var.h);
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
            case 4:
                bundle.getClass();
                p13 p13Var5 = new p13(2, q23.a, l23.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 4);
                wu4 wu4Var = (wu4) this.b;
                Executor executor13 = wu4Var.g;
                if (executor13 == null) {
                    ur5.e("executor");
                    throw null;
                }
                h23 h23Var5 = wu4Var.f;
                if (h23Var5 == null) {
                    ur5.e("callback");
                    throw null;
                }
                if (q23.b(bundle, p13Var5, executor13, h23Var5, wu4Var.h)) {
                    return;
                }
                int i8 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent5 = (Intent) mud.a(bundle);
                Executor executor14 = wu4Var.g;
                if (executor14 == null) {
                    ur5.e("executor");
                    throw null;
                }
                h23 h23Var6 = wu4Var.f;
                if (h23Var6 != null) {
                    hxe.a(i8, i, intent5, executor14, h23Var6, wu4Var.h);
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
            default:
                xo6 xo6Var = (xo6) ((WeakReference) this.b).get();
                if (xo6Var == null || bundle == null) {
                    return;
                }
                synchronized (xo6Var.b) {
                    px6 px6Var = xo6Var.e;
                    IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                    int i9 = fx6.b;
                    if (binder == null) {
                        nk5Var = null;
                    } else {
                        IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof nk5)) {
                            lk5 lk5Var = new lk5();
                            lk5Var.a = binder;
                            nk5Var = lk5Var;
                        } else {
                            nk5Var = (nk5) queryLocalInterface;
                        }
                    }
                    px6Var.b(nk5Var);
                    xo6Var.e.c(cy7.b(bundle));
                    ArrayList arrayList = xo6Var.c;
                    if (xo6Var.e.a() != null) {
                        Iterator it = arrayList.iterator();
                        if (!it.hasNext()) {
                            arrayList.clear();
                        } else {
                            if (it.next() == null) {
                                xo6Var.d.put(null, new uo6());
                                throw null;
                            }
                            grb.o();
                        }
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q13(q23 q23Var, Handler handler, byte b) {
        super(handler);
        this.a = b;
        this.b = q23Var;
    }
}
