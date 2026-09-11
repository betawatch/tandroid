package q2;

import android.content.Context;
import android.os.Build;
import b2.r0;
import b2.s;
import com.google.firebase.messaging.n;
import e2.d0;
import n7.z0;
import r2.k;
import r2.l;
import t7.u;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class b implements k {
    public final Context a;

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
    public static int a(s sVar) {
        String str = sVar.r;
        if (str == null || !r0.k(str)) {
            return i2.g.b(0, 0, 0, 0);
        }
        String str2 = sVar.r;
        String str3 = d0.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return i2.g.b(4, 0, 0, 0);
        }
        return i2.g.b(1, 0, 0, 0);
    }

    @Override // r2.k
    public l p(n nVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || (i10 < 31 && ((context = this.a) == null || i10 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new u(20).p(nVar);
        }
        int h = r0.h(((s) nVar.c).r);
        e2.a.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.G(h));
        return new z0(14, new r2.b(h, 0), new r2.b(h, 1)).p(nVar);
    }
}
