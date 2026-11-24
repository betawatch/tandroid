// default package

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class q0e extends ig0 {
    public final /* synthetic */ byte q = 0;
    public final /* synthetic */ byte[] r;
    public final /* synthetic */ String s;
    public final Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0e(x1d x1dVar, byte[] bArr, String str) {
        super(ap9.a, x1dVar);
        this.r = bArr;
        this.s = str;
        this.t = new e9f(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, jg0
    public final /* bridge */ /* synthetic */ void a(ua9 ua9Var) {
        switch (this.q) {
            case 0:
                a(ua9Var);
                break;
            default:
                a(ua9Var);
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ ua9 d(Status status) {
        switch (this.q) {
            case 0:
                return new m2e(status, -1);
            default:
                return new i7f(status, null);
        }
    }

    @Override // ig0
    public final void n(xx4 xx4Var) {
        Parcel obtain;
        Parcel obtain2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        byte b = this.q;
        String str = this.s;
        byte[] bArr = this.r;
        Object obj = this.t;
        switch (b) {
            case 0:
                lzd lzdVar = (lzd) ((jke) xx4Var).k();
                gje gjeVar = new gje();
                gjeVar.b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(lzdVar.c);
                int i = bhd.a;
                obtain.writeStrongBinder(gjeVar);
                obtain.writeString(str);
                obtain.writeString((String) obj);
                obtain.writeByteArray(bArr);
                obtain2 = Parcel.obtain();
                try {
                    lzdVar.b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
            default:
                n6d n6dVar = (n6d) xx4Var;
                e9f e9fVar = (e9f) obj;
                if (TextUtils.isEmpty(str)) {
                    Context context = n6dVar.F;
                    str = "";
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null) {
                            String str2 = (String) bundle.get("com.google.android.safetynet.ATTEST_API_KEY");
                            if (str2 != null) {
                                str = str2;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                hce hceVar = (hce) n6dVar.k();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                int i2 = zgd.a;
                if (e9fVar == null) {
                    obtain.writeStrongBinder(null);
                } else {
                    obtain.writeStrongBinder(e9fVar);
                }
                obtain.writeByteArray(bArr);
                obtain.writeString(str);
                obtain2 = Parcel.obtain();
                try {
                    hceVar.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0e(x1d x1dVar, String str, String str2, byte[] bArr) {
        super(asc.a, x1dVar);
        this.s = str;
        this.t = str2;
        this.r = bArr;
    }
}
