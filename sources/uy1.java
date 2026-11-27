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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class uy1 implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ uy1(w5f w5fVar, zhc zhcVar, String str) {
        this.a = (byte) 10;
        this.b = w5fVar;
        this.c = zhcVar;
        this.d = str;
    }

    private final void a() {
        v99 v99Var;
        kjd kjdVar = (kjd) this.b;
        HashMap hashMap = kjdVar.c.D;
        String str = (String) this.c;
        synchronized (hashMap) {
            v99Var = (v99) kjdVar.c.D.get(str);
        }
        if (v99Var != null) {
            v99Var.o((String) this.d);
        } else {
            rjd.H.b("Discarded message for unknown namespace '%s'", str);
        }
    }

    private final void b() {
        int i;
        Task u;
        wj2 wj2Var = (wj2) this.c;
        Intent intent = wj2Var.a;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            u = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = wj2Var.a;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = wj2Var.a;
            Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
            if (valueOf != null) {
                bundle.putInt("google.product_id", valueOf.intValue());
            }
            Context context = (Context) this.b;
            bundle.putBoolean("supports_message_handled", true);
            ykf t = ykf.t(context);
            synchronized (t) {
                i = t.a;
                t.a = i + 1;
            }
            u = t.u(new uff(i, 2, bundle, (byte) 0));
        }
        u.addOnCompleteListener(no3.e, new k09((CountDownLatch) this.d, (byte) 29));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        String str;
        akf akfVar;
        w5f w5fVar = (w5f) this.b;
        zhc zhcVar = (zhc) this.c;
        lqe lqeVar = lqe.b;
        String str2 = (String) this.d;
        htd htdVar = (htd) zhcVar.b;
        htdVar.c = lqeVar;
        g1f g1fVar = (g1f) htdVar.b;
        if (g1fVar != null) {
            str = g1fVar.d;
            int i = vxd.a;
            if (str != null) {
            }
        }
        str = "NA";
        gxe gxeVar = new gxe();
        gxeVar.a = w5fVar.a;
        gxeVar.b = w5fVar.b;
        synchronized (w5f.class) {
            akfVar = w5f.j;
            if (akfVar == null) {
                qb6 a = hyd.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i2 = 0;
                int i3 = 0;
                while (i2 < a.a.size()) {
                    Locale locale = a.a.get(i2);
                    j5 j5Var = in2.a;
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
                k7f k7fVar = wbf.f;
                akfVar = i3 == 0 ? akf.r : new akf(i3, objArr);
                w5f.j = akfVar;
            }
        }
        gxeVar.k = akfVar;
        gxeVar.g = Boolean.TRUE;
        gxeVar.d = str;
        gxeVar.c = str2;
        gxeVar.e = w5fVar.f.isSuccessful() ? (String) w5fVar.f.getResult() : w5fVar.d.a();
        gxeVar.i = 10;
        gxeVar.j = Integer.valueOf(w5fVar.h);
        zhcVar.c = gxeVar;
        w5fVar.c.a(zhcVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        v99 v99Var;
        Object obj = null;
        switch (this.a) {
            case 0:
                ((wy1) this.d).K((File) this.c, (ArrayList) this.b);
                return;
            case 1:
                rb9 rb9Var = (rb9) this.d;
                d80 d80Var = (d80) this.b;
                rb9Var.b(d80Var, (TaskCompletionSource) this.c);
                ((AtomicInteger) rb9Var.i.c).set(0);
                double min = Math.min(3600000.0d, Math.pow(rb9Var.b, rb9Var.a()) * (60000.0d / rb9Var.a));
                String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + d80Var.b;
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
                    obj = ((xn4) this.b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new xs4(this.c, obj, (byte) 10));
                return;
            case 3:
                kka kkaVar = (kka) this.d;
                kkaVar.d.c.remove((String) this.b);
                sd9 sd9Var = (sd9) this.c;
                if (sd9Var.a instanceof u3) {
                    return;
                }
                try {
                    sd9Var.get();
                    return;
                } catch (Exception e) {
                    kkaVar.c.l(e);
                    return;
                }
            case 4:
                s1d.h((View) this.b, (k7b) this.c);
                ((ValueAnimator) this.d).start();
                return;
            case 5:
                c36 c36Var = (c36) this.b;
                pe8 pe8Var = (pe8) this.d;
                if (pe8Var.a > 0) {
                    Bundle bundle = (Bundle) pe8Var.c;
                    c36Var.onCreate(bundle != null ? bundle.getBundle((String) this.c) : null);
                }
                if (pe8Var.a >= 2) {
                    c36Var.onStart();
                }
                if (pe8Var.a >= 3) {
                    c36Var.onResume();
                }
                if (pe8Var.a >= 4) {
                    c36Var.onStop();
                }
                if (pe8Var.a >= 5) {
                    c36Var.onDestroy();
                    return;
                }
                return;
            case 6:
                a();
                return;
            case 7:
                super/*vh0*/.c((k09) this.c, (tg0) this.d);
                return;
            case 8:
                super/*vh0*/.a((mt2) this.c, (nt2) this.d);
                return;
            case 9:
                b();
                return;
            case 10:
                c();
                return;
            default:
                synchronized (((olf) this.b).I) {
                    v99Var = (v99) ((olf) this.b).I.get((String) this.c);
                }
                if (v99Var != null) {
                    v99Var.o((String) this.d);
                    return;
                } else {
                    olf.X.b("Discarded message for unknown namespace '%s'", (String) this.c);
                    return;
                }
        }
    }

    public /* synthetic */ uy1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ uy1(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ uy1() {
        this.a = (byte) 2;
    }

    public uy1(View view, w1d w1dVar, k7b k7bVar, ValueAnimator valueAnimator) {
        this.a = (byte) 4;
        this.b = view;
        this.c = k7bVar;
        this.d = valueAnimator;
    }
}
