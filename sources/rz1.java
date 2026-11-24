// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rz1 implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ rz1(h3f h3fVar, rhb rhbVar, String str) {
        this.a = (byte) 10;
        this.b = h3fVar;
        this.c = rhbVar;
        this.d = str;
    }

    private final void a() {
        k89 k89Var;
        ugd ugdVar = (ugd) this.b;
        HashMap hashMap = ugdVar.c.D;
        String str = (String) this.c;
        synchronized (hashMap) {
            k89Var = (k89) ugdVar.c.D.get(str);
        }
        if (k89Var != null) {
            k89Var.o((String) this.d);
        } else {
            bhd.H.b("Discarded message for unknown namespace '%s'", str);
        }
    }

    private final void b() {
        int i;
        Task u;
        ok2 ok2Var = (ok2) this.c;
        Intent intent = ok2Var.a;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        boolean isEmpty = TextUtils.isEmpty(stringExtra);
        byte b = 2;
        if (isEmpty) {
            u = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = ok2Var.a;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = ok2Var.a;
            Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
            if (valueOf != null) {
                bundle.putInt("google.product_id", valueOf.intValue());
            }
            Context context = (Context) this.b;
            bundle.putBoolean("supports_message_handled", true);
            jif t = jif.t(context);
            synchronized (t) {
                i = t.a;
                t.a = i + 1;
            }
            u = t.u(new fdf(i, 2, bundle, (byte) 0));
        }
        u.addOnCompleteListener(gp3.e, new fkd((CountDownLatch) this.d, b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        String str;
        lhf lhfVar;
        h3f h3fVar = (h3f) this.b;
        rhb rhbVar = (rhb) this.c;
        wne wneVar = wne.b;
        String str2 = (String) this.d;
        uqd uqdVar = (uqd) rhbVar.b;
        uqdVar.c = wneVar;
        rye ryeVar = (rye) uqdVar.b;
        if (ryeVar != null) {
            str = ryeVar.d;
            int i = ivd.a;
            if (str != null) {
            }
        }
        str = "NA";
        sue sueVar = new sue();
        sueVar.a = h3fVar.a;
        sueVar.b = h3fVar.b;
        synchronized (h3f.class) {
            lhfVar = h3f.j;
            if (lhfVar == null) {
                lb6 a = uvd.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i2 = 0;
                int i3 = 0;
                while (i2 < a.a.size()) {
                    Locale locale = a.a.get(i2);
                    s13 s13Var = ao2.a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i4 = i3 + 1;
                    int length = objArr.length;
                    if (length < i4) {
                        int i5 = length + (length >> 1) + 1;
                        if (i5 < i4) {
                            i5 = Integer.highestOneBit(i3) << 1;
                        }
                        if (i5 < 0) {
                            i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr = Arrays.copyOf(objArr, i5);
                    }
                    objArr[i3] = languageTag;
                    i2++;
                    i3 = i4;
                }
                v4f v4fVar = h9f.f;
                lhfVar = i3 == 0 ? lhf.r : new lhf(i3, objArr);
                h3f.j = lhfVar;
            }
        }
        sueVar.k = lhfVar;
        sueVar.g = Boolean.TRUE;
        sueVar.d = str;
        sueVar.c = str2;
        sueVar.e = h3fVar.f.isSuccessful() ? (String) h3fVar.f.getResult() : h3fVar.d.a();
        sueVar.i = 10;
        sueVar.j = Integer.valueOf(h3fVar.h);
        rhbVar.c = sueVar;
        h3fVar.c.a(rhbVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        k89 k89Var;
        Object obj = null;
        switch (this.a) {
            case 0:
                ((tz1) this.d).K((File) this.c, (ArrayList) this.b);
                return;
            case 1:
                ha9 ha9Var = (ha9) this.d;
                b90 b90Var = (b90) this.b;
                ha9Var.b(b90Var, (TaskCompletionSource) this.c);
                ((AtomicInteger) ha9Var.i.c).set(0);
                double min = Math.min(3600000.0d, Math.pow(ha9Var.b, ha9Var.a()) * (60000.0d / ha9Var.a));
                String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + b90Var.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                try {
                    Thread.sleep((long) min);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 2:
                try {
                    obj = ((tn4) this.b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new us4(this.c, obj, (byte) 10));
                return;
            case 3:
                tia tiaVar = (tia) this.d;
                tiaVar.d.c.remove((String) this.b);
                ec9 ec9Var = (ec9) this.c;
                if (ec9Var.a instanceof t3) {
                    return;
                }
                try {
                    ec9Var.get();
                    return;
                } catch (Exception e) {
                    tiaVar.c.l(e);
                    return;
                }
            case 4:
                dzc.h((View) this.b, (xab) this.c);
                ((ValueAnimator) this.d).start();
                return;
            case 5:
                y26 y26Var = (y26) this.b;
                dd8 dd8Var = (dd8) this.d;
                if (dd8Var.a > 0) {
                    Bundle bundle = (Bundle) dd8Var.c;
                    y26Var.onCreate(bundle != null ? bundle.getBundle((String) this.c) : null);
                }
                if (dd8Var.a >= 2) {
                    y26Var.onStart();
                }
                if (dd8Var.a >= 3) {
                    y26Var.onResume();
                }
                if (dd8Var.a >= 4) {
                    y26Var.onStop();
                }
                if (dd8Var.a >= 5) {
                    y26Var.onDestroy();
                    return;
                }
                return;
            case 6:
                a();
                return;
            case 7:
                super/*ui0*/.c((oo8) this.c, (xg0) this.d);
                return;
            case 8:
                super/*ui0*/.a((du2) this.c, (eu2) this.d);
                return;
            case 9:
                b();
                return;
            case 10:
                c();
                return;
            default:
                synchronized (((zif) this.b).I) {
                    k89Var = (k89) ((zif) this.b).I.get((String) this.c);
                }
                if (k89Var != null) {
                    k89Var.o((String) this.d);
                    return;
                } else {
                    zif.X.b("Discarded message for unknown namespace '%s'", (String) this.c);
                    return;
                }
        }
    }

    public /* synthetic */ rz1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ rz1(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ rz1() {
        this.a = (byte) 2;
    }

    public rz1(View view, hzc hzcVar, xab xabVar, ValueAnimator valueAnimator) {
        this.a = (byte) 4;
        this.b = view;
        this.c = xabVar;
        this.d = valueAnimator;
    }
}
