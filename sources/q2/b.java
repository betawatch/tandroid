package q2;

import android.content.Context;
import android.os.CancellationSignal;
import b2.r0;
import b2.s;
import e2.d0;
import k2.u;
import kotlin.jvm.internal.i;
import v0.h;
import v0.j;
import zd.m;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class b implements h {
    public final Context a;

    public b(Context context, int i10) {
        switch (i10) {
            case 1:
                i.e(context, "context");
                this.a = context;
                break;
            default:
                this.a = context;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(s sVar) {
        String str = sVar.r;
        if (str == null || !r0.k(str)) {
            return hg.c.b(0, 0, 0, 0);
        }
        String str2 = sVar.r;
        String str3 = d0.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return hg.c.b(4, 0, 0, 0);
        }
        return hg.c.b(1, 0, 0, 0);
    }

    public Object a(Context context, v0.e eVar, id.c cVar) {
        m mVar = new m(1, w7.g.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        u uVar = new u(mVar, 27);
        a3.b bVar = new a3.b(2);
        i.e(context, "context");
        j c10 = k6.h.c(new k6.h(this.a, 4), eVar);
        if (c10 == null) {
            uVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            uVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            c10.onCreateCredential(context, eVar, cancellationSignal, bVar, uVar);
        }
        Object r10 = mVar.r();
        jd.a aVar = jd.a.a;
        return r10;
    }
}
