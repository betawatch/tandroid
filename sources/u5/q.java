package u5;

import android.text.TextUtils;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import q5.b0;
import q5.f0;
import q5.g0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class q {
    public final b a;
    public final String b;
    public s5.m c;
    public final List d;

    public q(String str) {
        a.b(str);
        this.b = str;
        this.a = new b("MediaControlChannel", null);
        this.d = DesugarCollections.synchronizedList(new ArrayList());
    }

    public final void a(p pVar) {
        this.d.add(pVar);
    }

    public final long b() {
        s5.m mVar = this.c;
        if (mVar != null) {
            return ((AtomicLong) mVar.c).getAndIncrement();
        }
        b bVar = this.a;
        Log.e(bVar.a, bVar.d("Attempt to generate requestId without a sink", new Object[0]));
        return 0L;
    }

    public final void c(long j10, String str) {
        s5.m mVar = this.c;
        if (mVar == null) {
            b bVar = this.a;
            Log.e(bVar.a, bVar.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        g0 g0Var = (g0) mVar.b;
        if (g0Var == null) {
            throw new IllegalStateException("Device is not connected");
        }
        f0 f0Var = (f0) g0Var;
        String str2 = this.b;
        a.b(str2);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str.length() > 524288) {
            b bVar2 = f0.G;
            Log.w(bVar2.a, bVar2.d("Message send failed. Message exceeds maximum size", new Object[0]));
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
        com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
        e.c = new b0(f0Var, str2, str, 1);
        e.a = 8405;
        f0Var.e(1, e.e()).addOnFailureListener(new f2.c(mVar, j10, 8));
    }
}
