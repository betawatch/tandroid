// default package

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class q3d extends by4 {
    public static final yn m = new yn("Auth.Api.Identity.SignIn.API", new op5(8), new wn());
    public final String l;

    public q3d(Context context, k4d k4dVar) {
        super(context, m, k4dVar, ay4.c);
        this.l = s3d.a();
    }

    public static fha f(Intent intent) {
        Status status = Status.h;
        if (intent == null) {
            throw new zn(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : kte.a(byteArrayExtra, creator));
        if (status2 == null) {
            throw new zn(Status.r);
        }
        if (!status2.b()) {
            throw new zn(status2);
        }
        Parcelable.Creator<fha> creator2 = fha.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        fha fhaVar = (fha) (byteArrayExtra2 != null ? kte.a(byteArrayExtra2, creator2) : null);
        if (fhaVar != null) {
            return fhaVar;
        }
        throw new zn(status);
    }
}
