// default package

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s5d extends c05 {
    public static final zo m = new zo("Auth.Api.Identity.SignIn.API", new or5(8), new xo());
    public final String l;

    public s5d(Context context, m6d m6dVar) {
        super(context, m, m6dVar, b05.c);
        this.l = u5d.a();
    }

    public static hja f(Intent intent) {
        Status status = Status.h;
        if (intent == null) {
            throw new ap(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : nve.a(byteArrayExtra, creator));
        if (status2 == null) {
            throw new ap(Status.r);
        }
        if (!status2.b()) {
            throw new ap(status2);
        }
        Parcelable.Creator<hja> creator2 = hja.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        hja hjaVar = (hja) (byteArrayExtra2 != null ? nve.a(byteArrayExtra2, creator2) : null);
        if (hjaVar != null) {
            return hjaVar;
        }
        throw new ap(status);
    }
}
