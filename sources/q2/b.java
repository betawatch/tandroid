package q2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.CancellationSignal;
import b2.v0;
import b2.w;
import be.m;
import e2.m0;
import kotlin.jvm.internal.i;
import v0.h;
import v0.j;
import w7.n;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class b implements h {
    public final Context a;

    public b(Context context, int i10) {
        switch (i10) {
            case 1:
                i.e(context, "context");
                this.a = context;
                break;
            case 2:
                this.a = context;
                break;
            default:
                context.getClass();
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
    public static int c(w wVar) {
        String str = wVar.s;
        if (str == null || !v0.k(str)) {
            return i0.a.c(0, 0, 0, 0);
        }
        String str2 = wVar.s;
        String str3 = m0.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return i0.a.c(4, 0, 0, 0);
        }
        return i0.a.c(1, 0, 0, 0);
    }

    public Object a(Context context, v0.e eVar, kd.c cVar) {
        m mVar = new m(1, n.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        l2.f fVar = new l2.f(mVar, 22);
        a3.b bVar = new a3.b(2);
        i.e(context, "context");
        j b10 = k6.h.b(new k6.h(this.a, 3), eVar);
        if (b10 == null) {
            fVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            fVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            b10.onCreateCredential(context, eVar, cancellationSignal, bVar, fVar);
        }
        Object r10 = mVar.r();
        ld.a aVar = ld.a.a;
        return r10;
    }

    public PackageInfo b(int i10, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i10);
    }
}
