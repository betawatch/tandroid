package q2;

import android.content.Context;
import android.os.CancellationSignal;
import b2.v0;
import b2.x;
import e2.l0;
import kotlin.jvm.internal.i;
import org.telegram.messenger.zt;
import r2.y;
import td.m;
import v7.w6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b {
    public final Context a;

    public b(Context context, int i10) {
        switch (i10) {
            case 1:
                i.e(context, "context");
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
    public static int b(x xVar) {
        String str = xVar.s;
        if (str == null || !v0.k(str)) {
            return i0.a.a(0, 0, 0, 0);
        }
        String str2 = xVar.s;
        String str3 = l0.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return i0.a.a(4, 0, 0, 0);
        }
        return i0.a.a(1, 0, 0, 0);
    }

    public Object a(Context context, v0.e eVar, zt ztVar) {
        m mVar = new m(1, w6.b(ztVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        y yVar = new y(mVar, 9);
        a3.b bVar = new a3.b(3);
        i.e(context, "context");
        v0.i c10 = k0.b.c(new k0.b(this.a), eVar);
        if (c10 == null) {
            yVar.g(new w0.c(1, "createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            yVar.g(new w0.c(3, "createCredential is not supported on this device"));
        } else {
            c10.onCreateCredential(context, eVar, cancellationSignal, bVar, yVar);
        }
        Object r10 = mVar.r();
        dd.a aVar = dd.a.a;
        return r10;
    }
}
