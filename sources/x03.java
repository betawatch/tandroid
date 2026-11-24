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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class x03 extends ResultReceiver {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x03(tm6 tm6Var) {
        super(null);
        this.a = (byte) 5;
        this.b = new WeakReference(tm6Var);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        k03 a;
        String string;
        Bundle bundle2;
        d03 a2;
        boolean z;
        d03 d03Var;
        li5 li5Var;
        byte b = 0;
        byte b2 = 2;
        byte b3 = 1;
        switch (this.a) {
            case 0:
                bundle.getClass();
                w03 w03Var = new w03(2, y13.a, t13.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, (byte) 0);
                y03 y03Var = (y03) this.b;
                Executor executor = y03Var.g;
                if (executor == null) {
                    rp5.e("executor");
                    throw null;
                }
                o13 o13Var = y03Var.f;
                if (o13Var == null) {
                    rp5.e("callback");
                    throw null;
                }
                if (y13.b(bundle, w03Var, executor, o13Var, y03Var.h)) {
                    return;
                }
                int i2 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) wpd.a(bundle);
                boolean z2 = y13.c;
                if (i2 != z2) {
                    Log.w("CreatePublicKey", "Returned request code " + (z2 ? 1 : 0) + " does not match what was given " + i2);
                    return;
                }
                z1 z1Var = new z1(y03Var, b3);
                CancellationSignal cancellationSignal = y03Var.h;
                if (i != -1) {
                    c59 c59Var = new c59();
                    c59Var.a = new c03(lae.a(i), (byte) 2);
                    if (i == 0) {
                        c59Var.a = new b03("activity is cancelled by the user.");
                    }
                    x13 x13Var = new x13(z1Var, c59Var, b);
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!l23.a(cancellationSignal)) {
                        x13Var.invoke();
                    }
                    b = 1;
                }
                if (b == 0) {
                    if (intent == null) {
                        CancellationSignal cancellationSignal2 = y03Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (l23.a(cancellationSignal2)) {
                            return;
                        }
                        Executor executor2 = y03Var.g;
                        if (executor2 != null) {
                            executor2.execute(new s03(y03Var, b3));
                            return;
                        } else {
                            rp5.e("executor");
                            throw null;
                        }
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 34) {
                        a = t4.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent);
                    } else {
                        Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                        a = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle2 = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) ? null : s9e.a(string, bundle2);
                    }
                    if (a != null) {
                        CancellationSignal cancellationSignal3 = y03Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (l23.a(cancellationSignal3)) {
                            return;
                        }
                        Executor executor3 = y03Var.g;
                        if (executor3 != null) {
                            executor3.execute(new gu2((Object) y03Var, (Object) a, (byte) 13));
                            return;
                        } else {
                            rp5.e("executor");
                            throw null;
                        }
                    }
                    if (i3 >= 34) {
                        a2 = t4.a(intent);
                    } else {
                        int i4 = d03.a;
                        Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                        if (bundleExtra2 == null) {
                            a2 = null;
                        } else {
                            String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                            if (string2 == null) {
                                w26.j("Bundle was missing exception type.");
                                return;
                            }
                            a2 = dud.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                        }
                    }
                    CancellationSignal cancellationSignal4 = y03Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (l23.a(cancellationSignal4)) {
                        return;
                    }
                    Executor executor4 = y03Var.g;
                    if (executor4 != null) {
                        executor4.execute(new u03(y03Var, a2, b3));
                        return;
                    } else {
                        rp5.e("executor");
                        throw null;
                    }
                }
                return;
            case 1:
                bundle.getClass();
                w03 w03Var2 = new w03(2, y13.a, t13.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 1);
                w13 w13Var = (w13) this.b;
                if (y13.b(bundle, w03Var2, w13Var.f(), w13Var.e(), w13Var.h)) {
                    return;
                }
                int i5 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) bundle.getParcelable("RESULT_DATA");
                boolean z3 = y13.c;
                if (i5 != z3) {
                    Log.w("BeginSignIn", "Returned request code " + (z3 ? 1 : 0) + " which  does not match what was given " + i5);
                    return;
                }
                z1 z1Var2 = new z1(w13Var, b2);
                CancellationSignal cancellationSignal5 = w13Var.h;
                if (i != -1) {
                    c59 c59Var2 = new c59();
                    c59Var2.a = new ts4(lae.a(i), (byte) 2);
                    if (i == 0) {
                        c59Var2.a = new rs4("activity is cancelled by the user.");
                    }
                    x13 x13Var2 = new x13(z1Var2, c59Var2, b3);
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (l23.a(cancellationSignal5)) {
                        return;
                    }
                    x13Var2.invoke();
                    return;
                }
                byte b4 = 16;
                try {
                    ske.a(w13Var.e);
                    xs4 d = w13Var.d(q3d.f(intent2));
                    CancellationSignal cancellationSignal6 = w13Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (l23.a(cancellationSignal6)) {
                        return;
                    }
                    w13Var.f().execute(new gu2((Object) w13Var, (Object) d, (byte) 17));
                    return;
                } catch (us4 e) {
                    CancellationSignal cancellationSignal7 = w13Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (l23.a(cancellationSignal7)) {
                        return;
                    }
                    w13Var.f().execute(new v13(w13Var, e, b3));
                    return;
                } catch (zn e2) {
                    c59 c59Var3 = new c59();
                    c59Var3.a = new ts4(e2.getMessage(), (byte) 2);
                    if (e2.getStatusCode() == 16) {
                        c59Var3.a = new rs4(e2.getMessage());
                    } else if (y13.b.contains(Integer.valueOf(e2.getStatusCode()))) {
                        c59Var3.a = new vs4(e2.getMessage());
                    }
                    CancellationSignal cancellationSignal8 = w13Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (l23.a(cancellationSignal8)) {
                        return;
                    }
                    w13Var.f().execute(new gu2((Object) w13Var, (Object) c59Var3, (byte) 18));
                    return;
                } catch (Throwable th) {
                    ts4 ts4Var = new ts4(th.getMessage(), (byte) 2);
                    CancellationSignal cancellationSignal9 = w13Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (l23.a(cancellationSignal9)) {
                        return;
                    }
                    w13Var.f().execute(new gu2(w13Var, ts4Var, b4));
                    return;
                }
            case 2:
                bundle.getClass();
                w03 w03Var3 = new w03(2, y13.a, t13.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, (byte) 2);
                d23 d23Var = (d23) this.b;
                Executor executor5 = d23Var.g;
                if (executor5 == null) {
                    rp5.e("executor");
                    throw null;
                }
                o13 o13Var2 = d23Var.f;
                if (o13Var2 == null) {
                    rp5.e("callback");
                    throw null;
                }
                if (y13.b(bundle, w03Var3, executor5, o13Var2, d23Var.h)) {
                    return;
                }
                int i6 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent3 = (Intent) bundle.getParcelable("RESULT_DATA");
                boolean z4 = y13.c;
                if (i6 != z4) {
                    Log.w("CreatePublicKey", "Returned request code " + (z4 ? 1 : 0) + " does not match what was given " + i6);
                    return;
                }
                z1 z1Var3 = new z1((Object) d23Var, (byte) 3);
                CancellationSignal cancellationSignal10 = d23Var.h;
                if (i != -1) {
                    c59 c59Var4 = new c59();
                    c59Var4.a = new c03(lae.a(i), (byte) 2);
                    if (i == 0) {
                        c59Var4.a = new b03("activity is cancelled by the user.");
                    }
                    x13 x13Var3 = new x13(z1Var3, c59Var4, b);
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!l23.a(cancellationSignal10)) {
                        x13Var3.invoke();
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
                    l23 l23Var = CredentialProviderPlayServicesImpl.Companion;
                    CancellationSignal cancellationSignal11 = d23Var.h;
                    l23Var.getClass();
                    if (l23.a(cancellationSignal11)) {
                        return;
                    }
                    Executor executor6 = d23Var.g;
                    if (executor6 != null) {
                        executor6.execute(new b23(d23Var, b3));
                        return;
                    } else {
                        rp5.e("executor");
                        throw null;
                    }
                }
                ku8 ku8Var = (ku8) kte.a(byteArrayExtra, ku8.CREATOR);
                ku8Var.getClass();
                LinkedHashMap linkedHashMap = lu8.a;
                a50 a50Var = ku8Var.d;
                Object obj = a50Var;
                if (a50Var == null) {
                    z40 z40Var = ku8Var.e;
                    obj = z40Var;
                    if (z40Var == null) {
                        b50 b50Var = ku8Var.f;
                        obj = b50Var;
                        if (b50Var == null) {
                            sc8.j("No response set.");
                            return;
                        }
                    }
                }
                if (obj instanceof b50) {
                    b50 b50Var2 = (b50) obj;
                    v34 v34Var = b50Var2.a;
                    v34Var.getClass();
                    h1 h1Var = (h1) lu8.a.get(v34Var);
                    String str = b50Var2.b;
                    d03Var = h1Var == null ? new z03(new h1((byte) 26), b00.h("unknown fido gms exception - ", str)) : (v34Var != v34.x || str == null || f9b.f(0, 2, str, "Unable to get sync account") < 0) ? new z03(h1Var, str) : new b03("Passkey registration was cancelled by the user.");
                } else {
                    d03Var = null;
                }
                if (d03Var != null) {
                    CancellationSignal cancellationSignal12 = d23Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (l23.a(cancellationSignal12)) {
                        return;
                    }
                    Executor executor7 = d23Var.g;
                    if (executor7 != null) {
                        executor7.execute(new c23(d23Var, d03Var, b3));
                        return;
                    } else {
                        rp5.e("executor");
                        throw null;
                    }
                }
                try {
                    b13 e3 = d23.e(ku8Var);
                    CancellationSignal cancellationSignal13 = d23Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (l23.a(cancellationSignal13)) {
                        return;
                    }
                    Executor executor8 = d23Var.g;
                    if (executor8 != null) {
                        executor8.execute(new gu2((Object) d23Var, (Object) e3, (byte) 20));
                        return;
                    } else {
                        rp5.e("executor");
                        throw null;
                    }
                } catch (JSONException e4) {
                    CancellationSignal cancellationSignal14 = d23Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (l23.a(cancellationSignal14)) {
                        return;
                    }
                    Executor executor9 = d23Var.g;
                    if (executor9 != null) {
                        executor9.execute(new z13(d23Var, e4, b));
                        return;
                    } else {
                        rp5.e("executor");
                        throw null;
                    }
                } catch (Throwable th2) {
                    CancellationSignal cancellationSignal15 = d23Var.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (l23.a(cancellationSignal15)) {
                        return;
                    }
                    Executor executor10 = d23Var.g;
                    if (executor10 != null) {
                        executor10.execute(new a23(d23Var, th2, b));
                        return;
                    } else {
                        rp5.e("executor");
                        throw null;
                    }
                }
            case 3:
                bundle.getClass();
                w03 w03Var4 = new w03(2, y13.a, t13.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 3);
                i23 i23Var = (i23) this.b;
                Executor executor11 = i23Var.g;
                if (executor11 == null) {
                    rp5.e("executor");
                    throw null;
                }
                o13 o13Var3 = i23Var.f;
                if (o13Var3 == null) {
                    rp5.e("callback");
                    throw null;
                }
                if (y13.b(bundle, w03Var4, executor11, o13Var3, i23Var.h)) {
                    return;
                }
                int i7 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent4 = (Intent) wpd.a(bundle);
                Executor executor12 = i23Var.g;
                if (executor12 == null) {
                    rp5.e("executor");
                    throw null;
                }
                o13 o13Var4 = i23Var.f;
                if (o13Var4 != null) {
                    ose.a(i7, i, intent4, executor12, o13Var4, i23Var.h);
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
            case 4:
                bundle.getClass();
                w03 w03Var5 = new w03(2, y13.a, t13.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 4);
                ss4 ss4Var = (ss4) this.b;
                Executor executor13 = ss4Var.g;
                if (executor13 == null) {
                    rp5.e("executor");
                    throw null;
                }
                o13 o13Var5 = ss4Var.f;
                if (o13Var5 == null) {
                    rp5.e("callback");
                    throw null;
                }
                if (y13.b(bundle, w03Var5, executor13, o13Var5, ss4Var.h)) {
                    return;
                }
                int i8 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent5 = (Intent) wpd.a(bundle);
                Executor executor14 = ss4Var.g;
                if (executor14 == null) {
                    rp5.e("executor");
                    throw null;
                }
                o13 o13Var6 = ss4Var.f;
                if (o13Var6 != null) {
                    ose.a(i8, i, intent5, executor14, o13Var6, ss4Var.h);
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
            default:
                tm6 tm6Var = (tm6) ((WeakReference) this.b).get();
                if (tm6Var == null || bundle == null) {
                    return;
                }
                synchronized (tm6Var.b) {
                    kv6 kv6Var = tm6Var.e;
                    IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                    int i9 = av6.b;
                    if (binder == null) {
                        li5Var = null;
                    } else {
                        IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof li5)) {
                            ji5 ji5Var = new ji5();
                            ji5Var.a = binder;
                            li5Var = ji5Var;
                        } else {
                            li5Var = (li5) queryLocalInterface;
                        }
                    }
                    kv6Var.b(li5Var);
                    tm6Var.e.c(vu7.b(bundle));
                    ArrayList arrayList = tm6Var.c;
                    if (tm6Var.e.a() != null) {
                        Iterator it = arrayList.iterator();
                        if (!it.hasNext()) {
                            arrayList.clear();
                        } else {
                            if (it.next() == null) {
                                tm6Var.d.put(null, new qm6());
                                throw null;
                            }
                            fyb.g();
                        }
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x03(y13 y13Var, Handler handler, byte b) {
        super(handler);
        this.a = b;
        this.b = y13Var;
    }
}
