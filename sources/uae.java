// default package

import android.content.SharedPreferences;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class uae implements s99, caa, OnCompleteListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uae(qa4 qa4Var, String[] strArr) {
        this.a = (byte) 0;
        this.b = strArr;
    }

    @Override // caa
    public final /* synthetic */ void B(v8a v8aVar) {
        ((vwe) this.b).h = (md1) v8aVar;
    }

    @Override // caa
    public final void C(v8a v8aVar, boolean z) {
        vwe.j.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z));
        vwe vweVar = (vwe) this.b;
        vweVar.h = (md1) v8aVar;
        vweVar.c();
        xve.h(vweVar.g);
        n8f b = vweVar.c.b(vweVar.g);
        b8f m = c8f.m(b.d());
        m.c();
        c8f.p((c8f) m.b, z);
        b.c();
        p8f.p((p8f) b.b, (c8f) m.a());
        vweVar.a.a((p8f) b.a(), jn7.D3);
        vwe.b(vweVar);
        vweVar.e();
    }

    @Override // caa
    public final /* bridge */ /* synthetic */ void D(v8a v8aVar, int i) {
        vwe vweVar = (vwe) this.b;
        vweVar.h = (md1) v8aVar;
        vwe.a(vweVar, i);
    }

    @Override // caa
    public final /* bridge */ /* synthetic */ void J(v8a v8aVar, int i) {
        vwe vweVar = (vwe) this.b;
        vweVar.h = (md1) v8aVar;
        vwe.a(vweVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    @Override // caa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(v8a v8aVar, String str) {
        e1f e1fVar;
        he6 he6Var = vwe.j;
        boolean z = false;
        he6Var.b("onSessionResuming with sessionId = %s", str);
        vwe vweVar = (vwe) this.b;
        vweVar.h = (md1) v8aVar;
        SharedPreferences sharedPreferences = vweVar.f;
        boolean g = vweVar.g(str);
        ibd ibdVar = vweVar.b;
        if (g) {
            he6Var.b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            xve.h(vweVar.g);
        } else {
            if (sharedPreferences == null) {
                he6 he6Var2 = e1f.k;
            } else {
                e1fVar = new e1f(ibdVar);
                e1fVar.i = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
                if (sharedPreferences.contains("application_id")) {
                    e1fVar.b = sharedPreferences.getString("application_id", "");
                    if (sharedPreferences.contains("receiver_metrics_id")) {
                        e1fVar.c = sharedPreferences.getString("receiver_metrics_id", "");
                        if (sharedPreferences.contains("analytics_session_id")) {
                            e1fVar.d = sharedPreferences.getLong("analytics_session_id", 0L);
                            if (sharedPreferences.contains("event_sequence_number")) {
                                e1fVar.e = sharedPreferences.getInt("event_sequence_number", 0);
                                if (sharedPreferences.contains("receiver_session_id")) {
                                    e1fVar.f = sharedPreferences.getString("receiver_session_id", "");
                                    e1fVar.g = sharedPreferences.getInt("device_capabilities", 0);
                                    e1fVar.h = sharedPreferences.getString("device_model_name", "");
                                    e1fVar.j = sharedPreferences.getInt("analytics_session_start_type", 0);
                                    vweVar.g = e1fVar;
                                    if (vweVar.g(str)) {
                                        he6Var.b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                                        e1f e1fVar2 = new e1f(ibdVar);
                                        e1f.l++;
                                        vweVar.g = e1fVar2;
                                        md1 md1Var = vweVar.h;
                                        if (md1Var != null && md1Var.g.f) {
                                            z = true;
                                        }
                                        e1fVar2.i = z;
                                        he6 he6Var3 = id1.l;
                                        xve.e("Must be called from the main thread.");
                                        id1 id1Var = id1.n;
                                        xve.h(id1Var);
                                        xve.e("Must be called from the main thread.");
                                        e1fVar2.b = id1Var.e.a;
                                        e1f e1fVar3 = vweVar.g;
                                        xve.h(e1fVar3);
                                        e1fVar3.f = str;
                                    } else {
                                        he6Var.b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                                        xve.h(vweVar.g);
                                        e1f.l = vweVar.g.d + 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            e1fVar = null;
            vweVar.g = e1fVar;
            if (vweVar.g(str)) {
            }
        }
        xve.h(vweVar.g);
        n8f b = vweVar.c.b(vweVar.g);
        b8f m = c8f.m(b.d());
        m.c();
        c8f.r((c8f) m.b, 10);
        b.e((c8f) m.a());
        b8f m2 = c8f.m(b.d());
        m2.c();
        c8f.p((c8f) m2.b, true);
        b.c();
        p8f.p((p8f) b.b, (c8f) m2.a());
        vweVar.a.a((p8f) b.a(), jn7.C3);
    }

    @Override // caa
    public final void P(v8a v8aVar, String str) {
        vwe.j.b("onSessionStarted with sessionId = %s", str);
        vwe vweVar = (vwe) this.b;
        vweVar.h = (md1) v8aVar;
        vweVar.c();
        e1f e1fVar = vweVar.g;
        e1fVar.f = str;
        vweVar.a.a((p8f) vweVar.c.b(e1fVar).a(), jn7.y3);
        vwe.b(vweVar);
        vweVar.e();
    }

    @Override // s99
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                twe tweVar = new twe((TaskCompletionSource) obj2, (byte) 0);
                gcd gcdVar = (gcd) ((v9f) obj).k();
                Parcel R = gcdVar.R();
                ald.d(R, tweVar);
                R.writeStringArray((String[]) obj3);
                gcdVar.W(R, 5);
                break;
            case 1:
                jre jreVar = new jre((TaskCompletionSource) obj2, b2);
                f3e f3eVar = (f3e) ((q4f) obj).k();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i = pld.a;
                obtain.writeStrongBinder(jreVar);
                obtain.writeInt(1);
                ((pp5) obj3).writeToParcel(obtain, 0);
                f3eVar.a(obtain, 1);
                break;
            default:
                sr5 sr5Var = new sr5((TaskCompletionSource) obj2, (byte) 1);
                mj5 mj5Var = (mj5) ((cm5) obj).k();
                io ioVar = new io(new cq2(-1, -1, 0, true), false);
                ioVar.c = false;
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i2 = hld.a;
                obtain2.writeStrongBinder(sr5Var);
                hld.b(obtain2, (GetCredentialRequest) obj3);
                hld.b(obtain2, ioVar);
                ((kj5) mj5Var).a(obtain2, 1);
                break;
        }
    }

    @Override // caa
    public final /* bridge */ /* synthetic */ void m(v8a v8aVar, int i) {
        vwe vweVar = (vwe) this.b;
        vweVar.h = (md1) v8aVar;
        vwe.a(vweVar, i);
    }

    @Override // caa
    public final void n(v8a v8aVar) {
        he6 he6Var = vwe.j;
        he6Var.b("onSessionStarting", new Object[0]);
        vwe vweVar = (vwe) this.b;
        vweVar.h = (md1) v8aVar;
        if (vweVar.g != null) {
            Log.w(he6Var.a, he6Var.d("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        vweVar.d();
        v4f v4fVar = vweVar.c;
        e1f e1fVar = vweVar.g;
        n8f b = v4fVar.b(e1fVar);
        if (e1fVar.j == 1) {
            b8f m = c8f.m(b.d());
            m.c();
            c8f.r((c8f) m.b, 17);
            b.e((c8f) m.a());
        }
        vweVar.a.a((p8f) b.a(), jn7.x3);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        md1.h((md1) ((kad) this.b).c, "joinApplication", task);
    }

    @Override // caa
    public final void p(v8a v8aVar, int i) {
        vwe.j.b("onSessionSuspended with reason = %d", Integer.valueOf(i));
        vwe vweVar = (vwe) this.b;
        vweVar.h = (md1) v8aVar;
        vweVar.c();
        xve.h(vweVar.g);
        vweVar.a.a(vweVar.c.a(vweVar.g, i), jn7.B3);
        vwe.b(vweVar);
        vweVar.e.removeCallbacks(vweVar.d);
    }

    public /* synthetic */ uae(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
